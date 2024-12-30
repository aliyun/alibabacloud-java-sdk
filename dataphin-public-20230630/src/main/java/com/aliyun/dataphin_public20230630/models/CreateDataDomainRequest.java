// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDataDomainRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateDataDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDomainRequest self = new CreateDataDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataDomainRequest setCreateCommand(CreateDataDomainRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDataDomainRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDataDomainRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateDataDomainRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_code_name</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>545844456</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>主题域测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10232311</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static CreateDataDomainRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDataDomainRequestCreateCommand self = new CreateDataDomainRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDataDomainRequestCreateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public CreateDataDomainRequestCreateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public CreateDataDomainRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataDomainRequestCreateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateDataDomainRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataDomainRequestCreateCommand setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
