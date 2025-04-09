// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ChangeCloudPhoneNodeResponseBody extends TeaModel {
    @NameInMap("NodeInfos")
    public java.util.List<ChangeCloudPhoneNodeResponseBodyNodeInfos> nodeInfos;

    /**
     * <strong>example:</strong>
     * <p>4610632D-D661-5982-B3D7-5D3FD183F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeCloudPhoneNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCloudPhoneNodeResponseBody self = new ChangeCloudPhoneNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCloudPhoneNodeResponseBody setNodeInfos(java.util.List<ChangeCloudPhoneNodeResponseBodyNodeInfos> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }
    public java.util.List<ChangeCloudPhoneNodeResponseBodyNodeInfos> getNodeInfos() {
        return this.nodeInfos;
    }

    public ChangeCloudPhoneNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cpn-jewjt8xryuitu****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos self = new ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ChangeCloudPhoneNodeResponseBodyNodeInfos extends TeaModel {
        @NameInMap("InstanceInfos")
        public java.util.List<ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos> instanceInfos;

        /**
         * <strong>example:</strong>
         * <p>cpn-e5kxgjyt8s1mb****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ChangeCloudPhoneNodeResponseBodyNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCloudPhoneNodeResponseBodyNodeInfos self = new ChangeCloudPhoneNodeResponseBodyNodeInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCloudPhoneNodeResponseBodyNodeInfos setInstanceInfos(java.util.List<ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos> instanceInfos) {
            this.instanceInfos = instanceInfos;
            return this;
        }
        public java.util.List<ChangeCloudPhoneNodeResponseBodyNodeInfosInstanceInfos> getInstanceInfos() {
            return this.instanceInfos;
        }

        public ChangeCloudPhoneNodeResponseBodyNodeInfos setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
