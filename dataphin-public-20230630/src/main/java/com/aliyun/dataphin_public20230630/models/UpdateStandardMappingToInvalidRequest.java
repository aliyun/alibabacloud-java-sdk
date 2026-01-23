// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardMappingToInvalidRequest extends TeaModel {
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
    public UpdateStandardMappingToInvalidRequestUpdateCommand updateCommand;

    public static UpdateStandardMappingToInvalidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardMappingToInvalidRequest self = new UpdateStandardMappingToInvalidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardMappingToInvalidRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateStandardMappingToInvalidRequest setUpdateCommand(UpdateStandardMappingToInvalidRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateStandardMappingToInvalidRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateStandardMappingToInvalidRequestUpdateCommand extends TeaModel {
        @NameInMap("BelongGuidList")
        public java.util.List<String> belongGuidList;

        @NameInMap("GuidList")
        public java.util.List<String> guidList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        public static UpdateStandardMappingToInvalidRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardMappingToInvalidRequestUpdateCommand self = new UpdateStandardMappingToInvalidRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateStandardMappingToInvalidRequestUpdateCommand setBelongGuidList(java.util.List<String> belongGuidList) {
            this.belongGuidList = belongGuidList;
            return this;
        }
        public java.util.List<String> getBelongGuidList() {
            return this.belongGuidList;
        }

        public UpdateStandardMappingToInvalidRequestUpdateCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        public UpdateStandardMappingToInvalidRequestUpdateCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

    }

}
