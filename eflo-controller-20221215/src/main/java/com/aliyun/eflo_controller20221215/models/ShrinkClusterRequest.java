// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ShrinkClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    @NameInMap("NodeGroups")
    public java.util.List<ShrinkClusterRequestNodeGroups> nodeGroups;

    public static ShrinkClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ShrinkClusterRequest self = new ShrinkClusterRequest();
        return TeaModel.build(map, self);
    }

    public ShrinkClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ShrinkClusterRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ShrinkClusterRequest setNodeGroups(java.util.List<ShrinkClusterRequestNodeGroups> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<ShrinkClusterRequestNodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    public static class ShrinkClusterRequestNodeGroupsNodes extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        public static ShrinkClusterRequestNodeGroupsNodes build(java.util.Map<String, ?> map) throws Exception {
            ShrinkClusterRequestNodeGroupsNodes self = new ShrinkClusterRequestNodeGroupsNodes();
            return TeaModel.build(map, self);
        }

        public ShrinkClusterRequestNodeGroupsNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ShrinkClusterRequestNodeGroups extends TeaModel {
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        @NameInMap("Nodes")
        public java.util.List<ShrinkClusterRequestNodeGroupsNodes> nodes;

        public static ShrinkClusterRequestNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            ShrinkClusterRequestNodeGroups self = new ShrinkClusterRequestNodeGroups();
            return TeaModel.build(map, self);
        }

        public ShrinkClusterRequestNodeGroups setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ShrinkClusterRequestNodeGroups setNodes(java.util.List<ShrinkClusterRequestNodeGroupsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ShrinkClusterRequestNodeGroupsNodes> getNodes() {
            return this.nodes;
        }

    }

}
