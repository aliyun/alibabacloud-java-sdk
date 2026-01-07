// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListHyperNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("HyperNodeId")
    public String hyperNodeId;

    @NameInMap("HyperNodeIds")
    public java.util.List<String> hyperNodeIds;

    /**
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>emr-default</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("OperatingStates")
    public java.util.List<String> operatingStates;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwfm33rlt6zi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<ListHyperNodesRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListHyperNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHyperNodesRequest self = new ListHyperNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListHyperNodesRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListHyperNodesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ListHyperNodesRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public ListHyperNodesRequest setHyperNodeId(String hyperNodeId) {
        this.hyperNodeId = hyperNodeId;
        return this;
    }
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    public ListHyperNodesRequest setHyperNodeIds(java.util.List<String> hyperNodeIds) {
        this.hyperNodeIds = hyperNodeIds;
        return this;
    }
    public java.util.List<String> getHyperNodeIds() {
        return this.hyperNodeIds;
    }

    public ListHyperNodesRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public ListHyperNodesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHyperNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHyperNodesRequest setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public ListHyperNodesRequest setOperatingStates(java.util.List<String> operatingStates) {
        this.operatingStates = operatingStates;
        return this;
    }
    public java.util.List<String> getOperatingStates() {
        return this.operatingStates;
    }

    public ListHyperNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListHyperNodesRequest setTags(java.util.List<ListHyperNodesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListHyperNodesRequestTags> getTags() {
        return this.tags;
    }

    public ListHyperNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ListHyperNodesRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alarm_xdc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>129</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHyperNodesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListHyperNodesRequestTags self = new ListHyperNodesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListHyperNodesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListHyperNodesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
