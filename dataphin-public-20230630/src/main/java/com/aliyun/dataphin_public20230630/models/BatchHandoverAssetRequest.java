// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchHandoverAssetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HandoverCommand")
    public BatchHandoverAssetRequestHandoverCommand handoverCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static BatchHandoverAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchHandoverAssetRequest self = new BatchHandoverAssetRequest();
        return TeaModel.build(map, self);
    }

    public BatchHandoverAssetRequest setHandoverCommand(BatchHandoverAssetRequestHandoverCommand handoverCommand) {
        this.handoverCommand = handoverCommand;
        return this;
    }
    public BatchHandoverAssetRequestHandoverCommand getHandoverCommand() {
        return this.handoverCommand;
    }

    public BatchHandoverAssetRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public BatchHandoverAssetRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class BatchHandoverAssetRequestHandoverCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("GuidList")
        public java.util.List<String> guidList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300004567</p>
         */
        @NameInMap("TargetUserId")
        public String targetUserId;

        public static BatchHandoverAssetRequestHandoverCommand build(java.util.Map<String, ?> map) throws Exception {
            BatchHandoverAssetRequestHandoverCommand self = new BatchHandoverAssetRequestHandoverCommand();
            return TeaModel.build(map, self);
        }

        public BatchHandoverAssetRequestHandoverCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        public BatchHandoverAssetRequestHandoverCommand setTargetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public String getTargetUserId() {
            return this.targetUserId;
        }

    }

}
