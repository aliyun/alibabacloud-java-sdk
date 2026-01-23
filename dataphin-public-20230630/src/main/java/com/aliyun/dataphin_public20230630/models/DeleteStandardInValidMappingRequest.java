// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardInValidMappingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteStandardInValidMappingRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteStandardInValidMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardInValidMappingRequest self = new DeleteStandardInValidMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardInValidMappingRequest setDeleteCommand(DeleteStandardInValidMappingRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteStandardInValidMappingRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteStandardInValidMappingRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteStandardInValidMappingRequestDeleteCommand extends TeaModel {
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

        public static DeleteStandardInValidMappingRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteStandardInValidMappingRequestDeleteCommand self = new DeleteStandardInValidMappingRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteStandardInValidMappingRequestDeleteCommand setBelongGuidList(java.util.List<String> belongGuidList) {
            this.belongGuidList = belongGuidList;
            return this;
        }
        public java.util.List<String> getBelongGuidList() {
            return this.belongGuidList;
        }

        public DeleteStandardInValidMappingRequestDeleteCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        public DeleteStandardInValidMappingRequestDeleteCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

    }

}
