// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardWordRootRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateStandardWordRootRequestUpdateCommand updateCommand;

    public static UpdateStandardWordRootRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardWordRootRequest self = new UpdateStandardWordRootRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardWordRootRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateStandardWordRootRequest setUpdateCommand(UpdateStandardWordRootRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateStandardWordRootRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateStandardWordRootRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>avg</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

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
         * <p>average</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>平均值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>平均值</p>
         */
        @NameInMap("OldName")
        public String oldName;

        public static UpdateStandardWordRootRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardWordRootRequestUpdateCommand self = new UpdateStandardWordRootRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateStandardWordRootRequestUpdateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public UpdateStandardWordRootRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardWordRootRequestUpdateCommand setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public UpdateStandardWordRootRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardWordRootRequestUpdateCommand setOldName(String oldName) {
            this.oldName = oldName;
            return this;
        }
        public String getOldName() {
            return this.oldName;
        }

    }

}
