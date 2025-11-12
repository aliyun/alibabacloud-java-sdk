// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeHyperNodesResponseBody extends TeaModel {
    @NameInMap("HyperNodes")
    public java.util.List<ListFreeHyperNodesResponseBodyHyperNodes> hyperNodes;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>A511C02A-0127-51AA-A9F9-966382C9A1B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFreeHyperNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFreeHyperNodesResponseBody self = new ListFreeHyperNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFreeHyperNodesResponseBody setHyperNodes(java.util.List<ListFreeHyperNodesResponseBodyHyperNodes> hyperNodes) {
        this.hyperNodes = hyperNodes;
        return this;
    }
    public java.util.List<ListFreeHyperNodesResponseBodyHyperNodes> getHyperNodes() {
        return this.hyperNodes;
    }

    public ListFreeHyperNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFreeHyperNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFreeHyperNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFreeHyperNodesResponseBodyHyperNodesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Cpu_Usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFreeHyperNodesResponseBodyHyperNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListFreeHyperNodesResponseBodyHyperNodesTags self = new ListFreeHyperNodesResponseBodyHyperNodesTags();
            return TeaModel.build(map, self);
        }

        public ListFreeHyperNodesResponseBodyHyperNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFreeHyperNodesResponseBodyHyperNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFreeHyperNodesResponseBodyHyperNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bccluster_eflocomputing_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2025-08-06T10:11:41.569</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-22T23:59:59Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>alywlcb-lingjun-gpu-0025</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-7pp2x193801</p>
         */
        @NameInMap("HyperNodeId")
        public String hyperNodeId;

        /**
         * <strong>example:</strong>
         * <p>efg2.ks01L20Z2</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <strong>example:</strong>
         * <p>Using</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmwaateahzoii</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Using</p>
         */
        @NameInMap("Status")
        @Deprecated
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListFreeHyperNodesResponseBodyHyperNodesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>cn-wulanchabu-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListFreeHyperNodesResponseBodyHyperNodes build(java.util.Map<String, ?> map) throws Exception {
            ListFreeHyperNodesResponseBodyHyperNodes self = new ListFreeHyperNodesResponseBodyHyperNodes();
            return TeaModel.build(map, self);
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setHyperNodeId(String hyperNodeId) {
            this.hyperNodeId = hyperNodeId;
            return this;
        }
        public String getHyperNodeId() {
            return this.hyperNodeId;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        @Deprecated
        public ListFreeHyperNodesResponseBodyHyperNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setTags(java.util.List<ListFreeHyperNodesResponseBodyHyperNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListFreeHyperNodesResponseBodyHyperNodesTags> getTags() {
            return this.tags;
        }

        public ListFreeHyperNodesResponseBodyHyperNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
