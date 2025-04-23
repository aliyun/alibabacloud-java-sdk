// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingResponseBody extends TeaModel {
    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public ListNodesNoPagingResponseBodyNodes nodes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodesNoPagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesNoPagingResponseBody self = new ListNodesNoPagingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesNoPagingResponseBody setNodes(ListNodesNoPagingResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public ListNodesNoPagingResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public ListNodesNoPagingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodesNoPagingResponseBodyNodesNodeInfo extends TeaModel {
        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>compute0</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13p7vlcb1uihfv****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_02_64_20G_alibase_20170818****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>uninit: The node is being installed.</li>
         * <li>exception: An exception occurred on the node.</li>
         * <li>running: The node is running.</li>
         * <li>initing: The node is being initialized.</li>
         * <li>releasing: The node is being released.</li>
         * <li>untracking: The node is not added to the cluster.</li>
         * <li>stopped: The node is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>untracking</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListNodesNoPagingResponseBodyNodesNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesNodeInfo self = new ListNodesNoPagingResponseBodyNodesNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodes extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> nodeInfo;

        public static ListNodesNoPagingResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodes self = new ListNodesNoPagingResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodes setNodeInfo(java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}
