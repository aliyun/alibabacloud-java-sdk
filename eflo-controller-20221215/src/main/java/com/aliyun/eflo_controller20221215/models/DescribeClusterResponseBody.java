// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    /**
     * <p>Cluster Description</p>
     * 
     * <strong>example:</strong>
     * <p>Default cluster</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i116913051662373010974</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Cluster Name</p>
     * 
     * <strong>example:</strong>
     * <p>Eflo-YJ-Test-Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Cluster Type</p>
     * 
     * <strong>example:</strong>
     * <p>AckEdgePro</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Component Information</p>
     */
    @NameInMap("Components")
    public java.util.List<DescribeClusterResponseBodyComponents> components;

    /**
     * <p>Type of IP in the compute network</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("ComputingIpVersion")
    public String computingIpVersion;

    /**
     * <p>Creation Time</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-08T07:05:11Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Cluster Number</p>
     * 
     * <strong>example:</strong>
     * <p>A2</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>Network Information</p>
     */
    @NameInMap("Networks")
    public java.util.List<DescribeClusterResponseBodyNetworks> networks;

    /**
     * <p>Number of Nodes</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Long nodeCount;

    /**
     * <p>Number of Node Groups</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeGroupCount")
    public Long nodeGroupCount;

    /**
     * <p>Open Eni Jumbo Frame</p>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("OpenEniJumboFrame")
    public String openEniJumboFrame;

    /**
     * <p>Cluster State</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("OperatingState")
    public String operatingState;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Resource Group ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2k3rqlvv6ytq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Task ID</p>
     * 
     * <strong>example:</strong>
     * <p>i152609221670466904596</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Update Time</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-23T06:36:17.000Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-0jlkqysom5dmcviymep3f</p>
     */
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

    public DescribeClusterResponseBody setComputingIpVersion(String computingIpVersion) {
        this.computingIpVersion = computingIpVersion;
        return this;
    }
    public String getComputingIpVersion() {
        return this.computingIpVersion;
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

    public DescribeClusterResponseBody setOpenEniJumboFrame(String openEniJumboFrame) {
        this.openEniJumboFrame = openEniJumboFrame;
        return this;
    }
    public String getOpenEniJumboFrame() {
        return this.openEniJumboFrame;
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
        /**
         * <p>Component ID</p>
         * 
         * <strong>example:</strong>
         * <p>i149549021660892626529</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>Component Type</p>
         * 
         * <strong>example:</strong>
         * <p>ACKEdge</p>
         */
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
        /**
         * <p>VPC Segment ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-iqd7xunc</p>
         */
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
