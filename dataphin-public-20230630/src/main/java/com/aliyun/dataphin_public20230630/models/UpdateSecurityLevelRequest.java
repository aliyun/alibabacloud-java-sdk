// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityLevelRequest extends TeaModel {
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
    public UpdateSecurityLevelRequestUpdateCommand updateCommand;

    public static UpdateSecurityLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityLevelRequest self = new UpdateSecurityLevelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityLevelRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateSecurityLevelRequest setUpdateCommand(UpdateSecurityLevelRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateSecurityLevelRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateSecurityLevelRequestUpdateCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateSecurityLevelRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityLevelRequestUpdateCommand self = new UpdateSecurityLevelRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityLevelRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSecurityLevelRequestUpdateCommand setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public UpdateSecurityLevelRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
