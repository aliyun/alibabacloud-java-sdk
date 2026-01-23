// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardValidMappingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteStandardValidMappingRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteStandardValidMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardValidMappingRequest self = new DeleteStandardValidMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardValidMappingRequest setDeleteCommand(DeleteStandardValidMappingRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteStandardValidMappingRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteStandardValidMappingRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteStandardValidMappingRequestDeleteCommand extends TeaModel {
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

        public static DeleteStandardValidMappingRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteStandardValidMappingRequestDeleteCommand self = new DeleteStandardValidMappingRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteStandardValidMappingRequestDeleteCommand setBelongGuidList(java.util.List<String> belongGuidList) {
            this.belongGuidList = belongGuidList;
            return this;
        }
        public java.util.List<String> getBelongGuidList() {
            return this.belongGuidList;
        }

        public DeleteStandardValidMappingRequestDeleteCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        public DeleteStandardValidMappingRequestDeleteCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

    }

}
