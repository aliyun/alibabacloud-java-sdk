// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesResponseBody extends TeaModel {
    /**
     * <p>Details about the ENIs.</p>
     */
    @NameInMap("NetworkInterfaceSets")
    public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets networkInterfaceSets;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of ENIs.</p>
     * <br>
     * <p>> If you specify the `MaxResults` and `NextToken` parameters to perform a paged query, the value of the `TotalCount` response parameter is invalid.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesResponseBody self = new DescribeNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesResponseBody setNetworkInterfaceSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets networkInterfaceSets) {
        this.networkInterfaceSets = networkInterfaceSets;
        return this;
    }
    public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public DescribeNetworkInterfacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInterfacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The EIP of the ENI.</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The index of the network interface controller (NIC).</p>
         * <br>
         * <p>*   If the ENI is in the Available state or no NIC index is specified when the ENI is attached, this parameter has no value.</p>
         * <p>*   If the ENI is in the InUse state and an NIC index is specified when the ENI is attached, the specified NIC index is returned as the value of this parameter.</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("TrunkNetworkInterfaceId")
        public String trunkNetworkInterfaceId;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setNetworkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            return this;
        }
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets extends TeaModel {
        @NameInMap("Ipv4PrefixSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets setIpv4PrefixSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet) {
            this.ipv4PrefixSet = ipv4PrefixSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSetsIpv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("Ipv6Prefix")
        public String ipv6Prefix;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet setIpv6Prefix(String ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }
        public String getIpv6Prefix() {
            return this.ipv6Prefix;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets extends TeaModel {
        @NameInMap("Ipv6PrefixSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets setIpv6PrefixSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet) {
            this.ipv6PrefixSet = ipv6PrefixSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSetsIpv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set extends TeaModel {
        /**
         * <p>The IPv6 address assigned to the ENI.</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets setIpv6Set(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The EIP of the ENI.</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet extends TeaModel {
        /**
         * <p>The elastic IP address (EIP) associated with the ENI.</p>
         */
        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        /**
         * <p>Indicates whether the IP address is the primary private IP address. Valid values:</p>
         * <br>
         * <p>*   true: The IP address is the primary private IP address.</p>
         * <p>*   false: The IP address is the secondary private IP address.</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The private IP address of the ENI.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setAssociatedPublicIp(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets setPrivateIpSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag extends TeaModel {
        /**
         * <p>The tag key of the ENI.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the ENI.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag> tag;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags setTag(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet extends TeaModel {
        /**
         * <p>Details about the EIP that is associated with the secondary private IP address of the ENI.</p>
         */
        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp associatedPublicIp;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("Attachment")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment attachment;

        /**
         * <p>The time when the ENI was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Specifies whether to retain the ENI when the associated instance is released. Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
         */
        @NameInMap("DeleteOnRelease")
        public Boolean deleteOnRelease;

        /**
         * <p>The description of the ENI.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the instance to which the ENI is attached.</p>
         * <br>
         * <p>> If the ENI is managed and controlled by other Alibaba Cloud services, no instance ID is returned.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("Ipv4PrefixSets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets ipv4PrefixSets;

        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("Ipv6PrefixSets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets ipv6PrefixSets;

        /**
         * <p>The IPv6 addresses assigned to the ENI.</p>
         */
        @NameInMap("Ipv6Sets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets;

        /**
         * <p>The media access control (MAC) address of the ENI.</p>
         */
        @NameInMap("MacAddress")
        public String macAddress;

        /**
         * <p>The ENI ID.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The name of the ENI.</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the ENI. Valid values:</p>
         * <br>
         * <p>*   Standard: uses the TCP communication mode. </p>
         * <p>*   HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled. </p>
         * <br>
         * <p>> The parameter can have a value of HighPerformance only when the ENI is attached to a c7re RDMA-enhanced instance that resides in Beijing Zone K.</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The ID of the account to which the ENI belongs.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The private IP address of the ENI.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>Details about the private IP addresses of the ENI.</p>
         */
        @NameInMap("PrivateIpSets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets;

        /**
         * <p>The number of queues supported by the ENI.</p>
         * <br>
         * <p>*   If the ENI is a secondary ENI in the InUse state and the number of queues supported by the ENI has never been modified, the default number of queues per secondary ENI that the instance type supports is returned.</p>
         * <p>*   If the number of queues supported by the secondary ENI has been modified, the new number of queues is returned.</p>
         * <p>*   If the ENI is a secondary ENI in the Available state and the number of queues supported by the ENI has never been modified, an empty value is returned.</p>
         * <p>*   If the ENI is a primary ENI, the default number of queues per primary ENI that the instance type supports is returned.</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The ID of the resource group to which the ENI belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The IDs of the security groups to which the ENI belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds;

        /**
         * <p>The ID of the distributor to which the ENI belongs.</p>
         */
        @NameInMap("ServiceID")
        public Long serviceID;

        /**
         * <p>Indicates whether the user of the ENI is an Alibaba Cloud service or a distributor.</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The state of the ENI.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the ENI.</p>
         */
        @NameInMap("Tags")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags tags;

        /**
         * <p>The type of the ENI.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the vSwitch with which the ENI is associated.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the ENI belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the ENI.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setAssociatedPublicIp(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setAttachment(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment attachment) {
            this.attachment = attachment;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment getAttachment() {
            return this.attachment;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setDeleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setIpv4PrefixSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets ipv4PrefixSets) {
            this.ipv4PrefixSets = ipv4PrefixSets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv4PrefixSets getIpv4PrefixSets() {
            return this.ipv4PrefixSets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setIpv6PrefixSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets ipv6PrefixSets) {
            this.ipv6PrefixSets = ipv6PrefixSets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6PrefixSets getIpv6PrefixSets() {
            return this.ipv6PrefixSets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setIpv6Sets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrivateIpSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setQueuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setSecurityGroupIds(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setServiceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }
        public Long getServiceID() {
            return this.serviceID;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setTags(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags getTags() {
            return this.tags;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets setNetworkInterfaceSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet) {
            this.networkInterfaceSet = networkInterfaceSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

    }

}
