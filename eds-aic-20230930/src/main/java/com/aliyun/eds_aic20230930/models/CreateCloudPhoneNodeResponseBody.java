// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCloudPhoneNodeResponseBody extends TeaModel {
    /**
     * <p>The cloud phone matrixes.</p>
     */
    @NameInMap("NodeInfos")
    public java.util.List<CreateCloudPhoneNodeResponseBodyNodeInfos> nodeInfos;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>223684716098****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudPhoneNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPhoneNodeResponseBody self = new CreateCloudPhoneNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudPhoneNodeResponseBody setNodeInfos(java.util.List<CreateCloudPhoneNodeResponseBodyNodeInfos> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }
    public java.util.List<CreateCloudPhoneNodeResponseBodyNodeInfos> getNodeInfos() {
        return this.nodeInfos;
    }

    public CreateCloudPhoneNodeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateCloudPhoneNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCloudPhoneNodeResponseBodyNodeInfos extends TeaModel {
        /**
         * <p>The IDs of the cloud phone instances.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The ID of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-e5kxgjyt8s1mb****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static CreateCloudPhoneNodeResponseBodyNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPhoneNodeResponseBodyNodeInfos self = new CreateCloudPhoneNodeResponseBodyNodeInfos();
            return TeaModel.build(map, self);
        }

        public CreateCloudPhoneNodeResponseBodyNodeInfos setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public CreateCloudPhoneNodeResponseBodyNodeInfos setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
