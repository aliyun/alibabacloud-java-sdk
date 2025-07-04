// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeNodesResponseBody extends TeaModel {
    /**
     * <p>The returned pagination token which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<ListFreeNodesResponseBodyNodes> nodes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA14CB86-70C4-5CB7-9E7B-6CCA77F3512B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFreeNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFreeNodesResponseBody self = new ListFreeNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFreeNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFreeNodesResponseBody setNodes(java.util.List<ListFreeNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListFreeNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListFreeNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFreeNodesResponseBodyNodesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>aa_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>aa_vakye</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFreeNodesResponseBodyNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListFreeNodesResponseBodyNodesTags self = new ListFreeNodesResponseBodyNodesTags();
            return TeaModel.build(map, self);
        }

        public ListFreeNodesResponseBodyNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFreeNodesResponseBodyNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFreeNodesResponseBodyNodes extends TeaModel {
        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>bccluster_eflocomputing_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1652321554</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the node expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1673107200</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The cluster number.</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-7pp2x193801</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>Unused</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzkkbrpl4owgy</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The serial number of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>sn_pozkHBgicd</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListFreeNodesResponseBodyNodesTags> tags;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListFreeNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListFreeNodesResponseBodyNodes self = new ListFreeNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListFreeNodesResponseBodyNodes setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListFreeNodesResponseBodyNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFreeNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListFreeNodesResponseBodyNodes setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListFreeNodesResponseBodyNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListFreeNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListFreeNodesResponseBodyNodes setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        public ListFreeNodesResponseBodyNodes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListFreeNodesResponseBodyNodes setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListFreeNodesResponseBodyNodes setTags(java.util.List<ListFreeNodesResponseBodyNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListFreeNodesResponseBodyNodesTags> getTags() {
            return this.tags;
        }

        public ListFreeNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
