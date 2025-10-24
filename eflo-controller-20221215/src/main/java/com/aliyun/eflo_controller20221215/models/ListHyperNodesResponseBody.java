// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListHyperNodesResponseBody extends TeaModel {
    @NameInMap("HyperNodes")
    public java.util.List<ListHyperNodesResponseBodyHyperNodes> hyperNodes;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>7ed93fda-5e7f-436a-ae5a-bd8e6b04e36b</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E64F9128-E2FC-5998-B769-199B0CB18138</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHyperNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHyperNodesResponseBody self = new ListHyperNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHyperNodesResponseBody setHyperNodes(java.util.List<ListHyperNodesResponseBodyHyperNodes> hyperNodes) {
        this.hyperNodes = hyperNodes;
        return this;
    }
    public java.util.List<ListHyperNodesResponseBodyHyperNodes> getHyperNodes() {
        return this.hyperNodes;
    }

    public ListHyperNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHyperNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHyperNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHyperNodesResponseBodyHyperNodesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alarm_xdc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>97</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHyperNodesResponseBodyHyperNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListHyperNodesResponseBodyHyperNodesTags self = new ListHyperNodesResponseBodyHyperNodesTags();
            return TeaModel.build(map, self);
        }

        public ListHyperNodesResponseBodyHyperNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListHyperNodesResponseBodyHyperNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListHyperNodesResponseBodyHyperNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i115226661755786900341</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>test-ack</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>bccluster_eflocomputing_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2025-07-09T10:41:56.577</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2025-09-28T16:00:00Z</p>
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
         * <p>e01-cn-2r42tmj4z02</p>
         */
        @NameInMap("HyperNodeId")
        public String hyperNodeId;

        /**
         * <strong>example:</strong>
         * <p>efg2.GN9C.cn8</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <strong>example:</strong>
         * <p>i121135081698451727812</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <strong>example:</strong>
         * <p>l20c-0801</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmwfm33rlt6zi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Extending</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListHyperNodesResponseBodyHyperNodesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>i153333771756952392398</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListHyperNodesResponseBodyHyperNodes build(java.util.Map<String, ?> map) throws Exception {
            ListHyperNodesResponseBodyHyperNodes self = new ListHyperNodesResponseBodyHyperNodes();
            return TeaModel.build(map, self);
        }

        public ListHyperNodesResponseBodyHyperNodes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListHyperNodesResponseBodyHyperNodes setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListHyperNodesResponseBodyHyperNodes setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListHyperNodesResponseBodyHyperNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHyperNodesResponseBodyHyperNodes setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListHyperNodesResponseBodyHyperNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListHyperNodesResponseBodyHyperNodes setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListHyperNodesResponseBodyHyperNodes setHyperNodeId(String hyperNodeId) {
            this.hyperNodeId = hyperNodeId;
            return this;
        }
        public String getHyperNodeId() {
            return this.hyperNodeId;
        }

        public ListHyperNodesResponseBodyHyperNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListHyperNodesResponseBodyHyperNodes setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ListHyperNodesResponseBodyHyperNodes setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ListHyperNodesResponseBodyHyperNodes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListHyperNodesResponseBodyHyperNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHyperNodesResponseBodyHyperNodes setTags(java.util.List<ListHyperNodesResponseBodyHyperNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListHyperNodesResponseBodyHyperNodesTags> getTags() {
            return this.tags;
        }

        public ListHyperNodesResponseBodyHyperNodes setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListHyperNodesResponseBodyHyperNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
