// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListHyperNodesShrinkRequest extends TeaModel {
    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_machineinstanceba_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The cluster number.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("HyperNodeId")
    public String hyperNodeId;

    /**
     * <p>The list of node IDs.</p>
     */
    @NameInMap("HyperNodeIds")
    public String hyperNodeIdsShrink;

    /**
     * <p>The machine type.</p>
     * 
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * <p>Default values:</p>
     * <p>• If you do not specify this parameter or you specify a value that is less than 20, the default value is 20.</p>
     * <p>• If you specify a value that is greater than 100, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Set this parameter to the NextToken value that is returned from a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>emr-default</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The state of the node. If you do not specify this parameter, nodes in all states are returned. Valid values: Extending, UnusedNodeStopped, UnusedNodeStopping, Unused, Using, ReleaseLocking, Operating, Cutting, ClusterNodeStopped, UnusedNodeRecovering, ClusterNodeStopping, ClusterNodeRecovering, and Replacing.</p>
     */
    @NameInMap("OperatingStates")
    public String operatingStatesShrink;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwfm33rlt6zi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListHyperNodesShrinkRequestTags> tags;

    /**
     * <p>The ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListHyperNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHyperNodesShrinkRequest self = new ListHyperNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHyperNodesShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListHyperNodesShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ListHyperNodesShrinkRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public ListHyperNodesShrinkRequest setHyperNodeId(String hyperNodeId) {
        this.hyperNodeId = hyperNodeId;
        return this;
    }
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    public ListHyperNodesShrinkRequest setHyperNodeIdsShrink(String hyperNodeIdsShrink) {
        this.hyperNodeIdsShrink = hyperNodeIdsShrink;
        return this;
    }
    public String getHyperNodeIdsShrink() {
        return this.hyperNodeIdsShrink;
    }

    public ListHyperNodesShrinkRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public ListHyperNodesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHyperNodesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHyperNodesShrinkRequest setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public ListHyperNodesShrinkRequest setOperatingStatesShrink(String operatingStatesShrink) {
        this.operatingStatesShrink = operatingStatesShrink;
        return this;
    }
    public String getOperatingStatesShrink() {
        return this.operatingStatesShrink;
    }

    public ListHyperNodesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListHyperNodesShrinkRequest setTags(java.util.List<ListHyperNodesShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListHyperNodesShrinkRequestTags> getTags() {
        return this.tags;
    }

    public ListHyperNodesShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ListHyperNodesShrinkRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>alarm_xdc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>129</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHyperNodesShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListHyperNodesShrinkRequestTags self = new ListHyperNodesShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public ListHyperNodesShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListHyperNodesShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
