// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeVirtualNodesResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of virtual nodes that were queried.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The virtual nodes that were queried.</p>
     */
    @NameInMap("VirtualNodes")
    public java.util.List<DescribeVirtualNodesResponseBodyVirtualNodes> virtualNodes;

    public static DescribeVirtualNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualNodesResponseBody self = new DescribeVirtualNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVirtualNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualNodesResponseBody setVirtualNodes(java.util.List<DescribeVirtualNodesResponseBodyVirtualNodes> virtualNodes) {
        this.virtualNodes = virtualNodes;
        return this;
    }
    public java.util.List<DescribeVirtualNodesResponseBodyVirtualNodes> getVirtualNodes() {
        return this.virtualNodes;
    }

    public static class DescribeVirtualNodesResponseBodyVirtualNodesEvents extends TeaModel {
        /**
         * <p>The number of events.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the event started.</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The time when the event ended.</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message of the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the object to which the event belongs.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the event. Valid values:</p>
         * <br>
         * <p>*   Normal</p>
         * <p>*   Warning</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVirtualNodesResponseBodyVirtualNodesEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualNodesResponseBodyVirtualNodesEvents self = new DescribeVirtualNodesResponseBodyVirtualNodesEvents();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeVirtualNodesResponseBodyVirtualNodesTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVirtualNodesResponseBodyVirtualNodesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualNodesResponseBodyVirtualNodesTags self = new DescribeVirtualNodesResponseBodyVirtualNodesTags();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVirtualNodesResponseBodyVirtualNodes extends TeaModel {
        /**
         * <p>The time when the virtual node was created. The time follows the RFC 3339 standard and is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The events about the virtual node.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeVirtualNodesResponseBodyVirtualNodesEvents> events;

        /**
         * <p>The public IP address of the virtual node.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the virtual node.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the region in which the virtual node resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the virtual node belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the virtual node. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Ready</p>
         * <p>*   Failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are bound to the virtual node.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeVirtualNodesResponseBodyVirtualNodesTags> tags;

        /**
         * <p>The ID of the virtual node.</p>
         */
        @NameInMap("VirtualNodeId")
        public String virtualNodeId;

        /**
         * <p>The name of the virtual node.</p>
         */
        @NameInMap("VirtualNodeName")
        public String virtualNodeName;

        /**
         * <p>The ID of the security group to which the virtual node belongs.</p>
         */
        @NameInMap("VirtualNodeSecurityGroupId")
        public String virtualNodeSecurityGroupId;

        /**
         * <p>The ID of the vSwitch with which the virtual node is associated.</p>
         */
        @NameInMap("VirtualNodeVSwitchId")
        public String virtualNodeVSwitchId;

        /**
         * <p>The ID of the VPC to which the virtual node belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeVirtualNodesResponseBodyVirtualNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualNodesResponseBodyVirtualNodes self = new DescribeVirtualNodesResponseBodyVirtualNodes();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setEvents(java.util.List<DescribeVirtualNodesResponseBodyVirtualNodesEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeVirtualNodesResponseBodyVirtualNodesEvents> getEvents() {
            return this.events;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setTags(java.util.List<DescribeVirtualNodesResponseBodyVirtualNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeVirtualNodesResponseBodyVirtualNodesTags> getTags() {
            return this.tags;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setVirtualNodeId(String virtualNodeId) {
            this.virtualNodeId = virtualNodeId;
            return this;
        }
        public String getVirtualNodeId() {
            return this.virtualNodeId;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setVirtualNodeName(String virtualNodeName) {
            this.virtualNodeName = virtualNodeName;
            return this;
        }
        public String getVirtualNodeName() {
            return this.virtualNodeName;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setVirtualNodeSecurityGroupId(String virtualNodeSecurityGroupId) {
            this.virtualNodeSecurityGroupId = virtualNodeSecurityGroupId;
            return this;
        }
        public String getVirtualNodeSecurityGroupId() {
            return this.virtualNodeSecurityGroupId;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setVirtualNodeVSwitchId(String virtualNodeVSwitchId) {
            this.virtualNodeVSwitchId = virtualNodeVSwitchId;
            return this;
        }
        public String getVirtualNodeVSwitchId() {
            return this.virtualNodeVSwitchId;
        }

        public DescribeVirtualNodesResponseBodyVirtualNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
