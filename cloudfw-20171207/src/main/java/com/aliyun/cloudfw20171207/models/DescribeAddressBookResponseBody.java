// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookResponseBody extends TeaModel {
    /**
     * <p>A list of address books.</p>
     */
    @NameInMap("Acls")
    public java.util.List<DescribeAddressBookResponseBodyAcls> acls;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of address books returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B36F150A-1E27-43AA-B72C-D2AC712F09DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of address books.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeAddressBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookResponseBody self = new DescribeAddressBookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddressBookResponseBody setAcls(java.util.List<DescribeAddressBookResponseBodyAcls> acls) {
        this.acls = acls;
        return this;
    }
    public java.util.List<DescribeAddressBookResponseBodyAcls> getAcls() {
        return this.acls;
    }

    public DescribeAddressBookResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeAddressBookResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAddressBookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddressBookResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAddressBookResponseBodyAclsAckLabels extends TeaModel {
        /**
         * <p>The key of the ACK pod label.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the ACK pod label.</p>
         * 
         * <strong>example:</strong>
         * <p>storage-operator</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAddressBookResponseBodyAclsAckLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAckLabels self = new DescribeAddressBookResponseBodyAclsAckLabels();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAddressBookResponseBodyAclsAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsAddresses extends TeaModel {
        /**
         * <p>The IP address or CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/32</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The note for the address.</p>
         * 
         * <strong>example:</strong>
         * <p>Single Address Description</p>
         */
        @NameInMap("Note")
        public String note;

        public static DescribeAddressBookResponseBodyAclsAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAddresses self = new DescribeAddressBookResponseBodyAclsAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAddressBookResponseBodyAclsAddresses setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsTagList extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL VALUE</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAddressBookResponseBodyAclsTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsTagList self = new DescribeAddressBookResponseBodyAclsTagList();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAddressBookResponseBodyAclsTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAddressBookResponseBodyAcls extends TeaModel {
        /**
         * <p>The ID of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-7c1bad6c3cc84c33baab</p>
         */
        @NameInMap("AckClusterConnectorId")
        public String ackClusterConnectorId;

        /**
         * <p>The name of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-connector-name</p>
         */
        @NameInMap("AckClusterConnectorName")
        public String ackClusterConnectorName;

        /**
         * <p>A list of ACK pod labels.</p>
         */
        @NameInMap("AckLabels")
        public java.util.List<DescribeAddressBookResponseBodyAclsAckLabels> ackLabels;

        /**
         * <p>A list of ACK namespaces.</p>
         */
        @NameInMap("AckNamespaces")
        public java.util.List<String> ackNamespaces;

        /**
         * <p>A list of CIDR blocks in the address book.</p>
         */
        @NameInMap("AddressList")
        public java.util.List<String> addressList;

        /**
         * <p>The number of addresses in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AddressListCount")
        public Integer addressListCount;

        /**
         * <p>A list of addresses, each with a description.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<DescribeAddressBookResponseBodyAclsAddresses> addresses;

        /**
         * <p>Indicates whether to automatically add the public IPs of tagged ECS instances to the address book. This applies to newly purchased instances and existing instances whose tags are modified to match.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <p>The description of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_address_book</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the address book. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The UUID of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <p>The number of times the address book is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <p>The region where the ACK cluster connector is deployed. This parameter is returned only when the GroupType parameter is &quot;ack&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>A list of ECS tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList;

        /**
         * <p>The logical relationship among multiple ECS tags. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        public static DescribeAddressBookResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAcls self = new DescribeAddressBookResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAcls setAckClusterConnectorId(String ackClusterConnectorId) {
            this.ackClusterConnectorId = ackClusterConnectorId;
            return this;
        }
        public String getAckClusterConnectorId() {
            return this.ackClusterConnectorId;
        }

        public DescribeAddressBookResponseBodyAcls setAckClusterConnectorName(String ackClusterConnectorName) {
            this.ackClusterConnectorName = ackClusterConnectorName;
            return this;
        }
        public String getAckClusterConnectorName() {
            return this.ackClusterConnectorName;
        }

        public DescribeAddressBookResponseBodyAcls setAckLabels(java.util.List<DescribeAddressBookResponseBodyAclsAckLabels> ackLabels) {
            this.ackLabels = ackLabels;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsAckLabels> getAckLabels() {
            return this.ackLabels;
        }

        public DescribeAddressBookResponseBodyAcls setAckNamespaces(java.util.List<String> ackNamespaces) {
            this.ackNamespaces = ackNamespaces;
            return this;
        }
        public java.util.List<String> getAckNamespaces() {
            return this.ackNamespaces;
        }

        public DescribeAddressBookResponseBodyAcls setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        public DescribeAddressBookResponseBodyAcls setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public DescribeAddressBookResponseBodyAcls setAddresses(java.util.List<DescribeAddressBookResponseBodyAclsAddresses> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsAddresses> getAddresses() {
            return this.addresses;
        }

        public DescribeAddressBookResponseBodyAcls setAutoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        public DescribeAddressBookResponseBodyAcls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddressBookResponseBodyAcls setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAddressBookResponseBodyAcls setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeAddressBookResponseBodyAcls setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
        }

        public DescribeAddressBookResponseBodyAcls setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAddressBookResponseBodyAcls setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeAddressBookResponseBodyAcls setTagList(java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> getTagList() {
            return this.tagList;
        }

        public DescribeAddressBookResponseBodyAcls setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

    }

}
