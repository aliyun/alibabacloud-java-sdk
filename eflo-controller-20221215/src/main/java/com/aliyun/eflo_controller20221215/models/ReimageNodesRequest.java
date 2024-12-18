// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReimageNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i15dfa12e8f27c44f4a006c2c8bb</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    @NameInMap("Nodes")
    public java.util.List<ReimageNodesRequestNodes> nodes;

    @NameInMap("UserData")
    public String userData;

    public static ReimageNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReimageNodesRequest self = new ReimageNodesRequest();
        return TeaModel.build(map, self);
    }

    public ReimageNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ReimageNodesRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ReimageNodesRequest setNodes(java.util.List<ReimageNodesRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ReimageNodesRequestNodes> getNodes() {
        return this.nodes;
    }

    public ReimageNodesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class ReimageNodesRequestNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>457db5ca-241d-11ed-9fd7-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>m-8vbf8rpv2nn14y7oybjy</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr0b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ReimageNodesRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            ReimageNodesRequestNodes self = new ReimageNodesRequestNodes();
            return TeaModel.build(map, self);
        }

        public ReimageNodesRequestNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ReimageNodesRequestNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ReimageNodesRequestNodes setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ReimageNodesRequestNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
