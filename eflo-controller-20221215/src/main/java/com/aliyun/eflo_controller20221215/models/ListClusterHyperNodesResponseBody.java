// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterHyperNodesResponseBody extends TeaModel {
    @NameInMap("HyperNodes")
    public java.util.List<ListClusterHyperNodesResponseBodyHyperNodes> hyperNodes;

    /**
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterHyperNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHyperNodesResponseBody self = new ListClusterHyperNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterHyperNodesResponseBody setHyperNodes(java.util.List<ListClusterHyperNodesResponseBodyHyperNodes> hyperNodes) {
        this.hyperNodes = hyperNodes;
        return this;
    }
    public java.util.List<ListClusterHyperNodesResponseBodyHyperNodes> getHyperNodes() {
        return this.hyperNodes;
    }

    public ListClusterHyperNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterHyperNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterHyperNodesResponseBodyHyperNodesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>ali-zeekr-ota-doris-prod-hz-selectdb</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListClusterHyperNodesResponseBodyHyperNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHyperNodesResponseBodyHyperNodesTags self = new ListClusterHyperNodesResponseBodyHyperNodesTags();
            return TeaModel.build(map, self);
        }

        public ListClusterHyperNodesResponseBodyHyperNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClusterHyperNodesResponseBodyHyperNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListClusterHyperNodesResponseBodyHyperNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bccluster_eflocomputing_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2025-07-07T17:38:35.391</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2025-04-19T02:32:48Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("FileSystemMountEnabled")
        public Boolean fileSystemMountEnabled;

        /**
         * <strong>example:</strong>
         * <p>alywlcb-lingjun-gpu-0025</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>B1</p>
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
         * <p>efg2.NH2cn</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <strong>example:</strong>
         * <p>i123229811742436895560</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <strong>example:</strong>
         * <p>Using</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <strong>example:</strong>
         * <p>Extending</p>
         */
        @NameInMap("Status")
        @Deprecated
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListClusterHyperNodesResponseBodyHyperNodesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>i153907661745288876128</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1u4ej4ap8c4yiqfi87c</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-0jl8gs7qmx89739e210dn</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClusterHyperNodesResponseBodyHyperNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHyperNodesResponseBodyHyperNodes self = new ListClusterHyperNodesResponseBodyHyperNodes();
            return TeaModel.build(map, self);
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }
        public Boolean getFileSystemMountEnabled() {
            return this.fileSystemMountEnabled;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setHyperNodeId(String hyperNodeId) {
            this.hyperNodeId = hyperNodeId;
            return this;
        }
        public String getHyperNodeId() {
            return this.hyperNodeId;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        @Deprecated
        public ListClusterHyperNodesResponseBodyHyperNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setTags(java.util.List<ListClusterHyperNodesResponseBodyHyperNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListClusterHyperNodesResponseBodyHyperNodesTags> getTags() {
            return this.tags;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClusterHyperNodesResponseBodyHyperNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
