// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataDomainRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The update request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateDataDomainRequestUpdateCommand updateCommand;

    public static UpdateDataDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataDomainRequest self = new UpdateDataDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataDomainRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataDomainRequest setUpdateCommand(UpdateDataDomainRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataDomainRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataDomainRequestUpdateCommand extends TeaModel {
        /**
         * <p>The abbreviation of the data domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_code_name</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <p>The ID of the data board.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>545844456</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The ID of the data domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <p>The description of the data domain.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the data domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>主题域测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The code of the data domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent data domain.</p>
         * 
         * <strong>example:</strong>
         * <p>10232311</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static UpdateDataDomainRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataDomainRequestUpdateCommand self = new UpdateDataDomainRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataDomainRequestUpdateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public UpdateDataDomainRequestUpdateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpdateDataDomainRequestUpdateCommand setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public UpdateDataDomainRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDataDomainRequestUpdateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateDataDomainRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataDomainRequestUpdateCommand setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
