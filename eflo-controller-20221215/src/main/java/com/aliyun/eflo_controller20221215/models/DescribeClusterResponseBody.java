// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Components")
    public java.util.List<DescribeClusterResponseBodyComponents> components;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("HpnZone")
    public String hpnZone;

    @NameInMap("Networks")
    public java.util.List<DescribeClusterResponseBodyNetworks> networks;

    @NameInMap("NodeCount")
    public Long nodeCount;

    @NameInMap("NodeGroupCount")
    public Long nodeGroupCount;

    @NameInMap("OperatingState")
    public String operatingState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponseBody self = new DescribeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponseBody setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public DescribeClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeClusterResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClusterResponseBody setComponents(java.util.List<DescribeClusterResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<DescribeClusterResponseBodyComponents> getComponents() {
        return this.components;
    }

    public DescribeClusterResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeClusterResponseBody setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public DescribeClusterResponseBody setNetworks(java.util.List<DescribeClusterResponseBodyNetworks> networks) {
        this.networks = networks;
        return this;
    }
    public java.util.List<DescribeClusterResponseBodyNetworks> getNetworks() {
        return this.networks;
    }

    public DescribeClusterResponseBody setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

    public DescribeClusterResponseBody setNodeGroupCount(Long nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
        return this;
    }
    public Long getNodeGroupCount() {
        return this.nodeGroupCount;
    }

    public DescribeClusterResponseBody setOperatingState(String operatingState) {
        this.operatingState = operatingState;
        return this;
    }
    public String getOperatingState() {
        return this.operatingState;
    }

    public DescribeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeClusterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeClusterResponseBodyComponents extends TeaModel {
        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentType")
        public String componentType;

        public static DescribeClusterResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyComponents self = new DescribeClusterResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeClusterResponseBodyComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

    }

    public static class DescribeClusterResponseBodyNetworks extends TeaModel {
        @NameInMap("VpdId")
        public String vpdId;

        public static DescribeClusterResponseBodyNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyNetworks self = new DescribeClusterResponseBodyNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyNetworks setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
