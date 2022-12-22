// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookResponseBody extends TeaModel {
    // The information about the address book.
    @NameInMap("Acls")
    public java.util.List<DescribeAddressBookResponseBodyAcls> acls;

    // The page number of the current page.
    @NameInMap("PageNo")
    public String pageNo;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public String pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the returned address books.
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

    public static class DescribeAddressBookResponseBodyAclsTagList extends TeaModel {
        // The key of the ECS tag.
        @NameInMap("TagKey")
        public String tagKey;

        // The value of the ECS tag.
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
        // The addresses in the address book.
        @NameInMap("AddressList")
        public java.util.List<String> addressList;

        // The number of addresses in the address book.
        @NameInMap("AddressListCount")
        public Integer addressListCount;

        // Indicates whether the public IP addresses of ECS instances are automatically added to the address book if the instances match the specified tags. The setting takes effect on both newly purchased ECS instances whose tag settings are complete and ECS instances whose tag settings are modified. Valid values:
        // 
        // * **1**: yes
        // * **0**: no
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        // The description of the address book.
        @NameInMap("Description")
        public String description;

        // The name of the address book.
        @NameInMap("GroupName")
        public String groupName;

        // The type of the address book. Valid values:
        // 
        // * **ip**: IP address book
        // * **domain**: domain address book
        // * **port**: port address book
        // * **tag**: ECS tag-based address book
        // * **allCloud**: cloud service address book
        // * **threat**: threat intelligence address book
        @NameInMap("GroupType")
        public String groupType;

        // The unique ID of the address book.
        @NameInMap("GroupUuid")
        public String groupUuid;

        // The number of times that the address book is referenced.
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        // The details about the ECS tags that can be automatically added to the address book.
        @NameInMap("TagList")
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList;

        // The logical relationship among ECS tags. Valid values:
        // 
        // * **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.
        // * **or**: The public IP addresses of ECS instances that match any of the specified tags can be added to the address book.
        @NameInMap("TagRelation")
        public String tagRelation;

        public static DescribeAddressBookResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAcls self = new DescribeAddressBookResponseBodyAcls();
            return TeaModel.build(map, self);
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
