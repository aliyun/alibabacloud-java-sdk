// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeVirtualNodesResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C9B9917-ED22-50D5-ADE6-9FA9D58AD05F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of virtual nodes that were queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The virtual nodes that were queried.</p>
     */
    @NameInMap("VirtualNodes")
    public java.util.List<VirtualNodes> virtualNodes;

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

    public DescribeVirtualNodesResponseBody setVirtualNodes(java.util.List<VirtualNodes> virtualNodes) {
        this.virtualNodes = virtualNodes;
        return this;
    }
    public java.util.List<VirtualNodes> getVirtualNodes() {
        return this.virtualNodes;
    }

    public static class Events extends TeaModel {
        /**
         * <p>The number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the event started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08T02:24:48Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The time when the event ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08T02:24:52Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the object to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static Events build(java.util.Map<String, ?> map) throws Exception {
            Events self = new Events();
            return TeaModel.build(map, self);
        }

        public Events setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public Events setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public Events setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public Events setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Events setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Events setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public Events setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class Tags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class VirtualNodes extends TeaModel {
        /**
         * <p>The time when the virtual node was created. The time follows the RFC 3339 standard and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08T15:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The events about the virtual node.</p>
         */
        @NameInMap("Events")
        public java.util.List<Events> events;

        /**
         * <p>The public IP address of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>10.19.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the region in which the virtual node resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the virtual node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-uf66jeqopgqa9hdn****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the virtual node. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Ready</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are bound to the virtual node.</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tags> tags;

        /**
         * <p>The ID of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>vnd-2ze960zkdqrldeaw****</p>
         */
        @NameInMap("VirtualNodeId")
        public String virtualNodeId;

        /**
         * <p>The name of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>testNode</p>
         */
        @NameInMap("VirtualNodeName")
        public String virtualNodeName;

        /**
         * <p>The ID of the security group to which the virtual node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeeyaaxlkq9sppl****</p>
         */
        @NameInMap("VirtualNodeSecurityGroupId")
        public String virtualNodeSecurityGroupId;

        /**
         * <p>The ID of the vSwitch with which the virtual node is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze23nqzig8inprou****</p>
         */
        @NameInMap("VirtualNodeVSwitchId")
        public String virtualNodeVSwitchId;

        /**
         * <p>The ID of the VPC to which the virtual node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-1vzjjflab6wvjox****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static VirtualNodes build(java.util.Map<String, ?> map) throws Exception {
            VirtualNodes self = new VirtualNodes();
            return TeaModel.build(map, self);
        }

        public VirtualNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public VirtualNodes setEvents(java.util.List<Events> events) {
            this.events = events;
            return this;
        }
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        public VirtualNodes setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public VirtualNodes setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public VirtualNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public VirtualNodes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public VirtualNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VirtualNodes setTags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public VirtualNodes setVirtualNodeId(String virtualNodeId) {
            this.virtualNodeId = virtualNodeId;
            return this;
        }
        public String getVirtualNodeId() {
            return this.virtualNodeId;
        }

        public VirtualNodes setVirtualNodeName(String virtualNodeName) {
            this.virtualNodeName = virtualNodeName;
            return this;
        }
        public String getVirtualNodeName() {
            return this.virtualNodeName;
        }

        public VirtualNodes setVirtualNodeSecurityGroupId(String virtualNodeSecurityGroupId) {
            this.virtualNodeSecurityGroupId = virtualNodeSecurityGroupId;
            return this;
        }
        public String getVirtualNodeSecurityGroupId() {
            return this.virtualNodeSecurityGroupId;
        }

        public VirtualNodes setVirtualNodeVSwitchId(String virtualNodeVSwitchId) {
            this.virtualNodeVSwitchId = virtualNodeVSwitchId;
            return this;
        }
        public String getVirtualNodeVSwitchId() {
            return this.virtualNodeVSwitchId;
        }

        public VirtualNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
