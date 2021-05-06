// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("Acls")
    public java.util.List<DescribeAddressBookResponseBodyAcls> acls;

    public static DescribeAddressBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookResponseBody self = new DescribeAddressBookResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAddressBookResponseBody setAcls(java.util.List<DescribeAddressBookResponseBodyAcls> acls) {
        this.acls = acls;
        return this;
    }
    public java.util.List<DescribeAddressBookResponseBodyAcls> getAcls() {
        return this.acls;
    }

    public static class DescribeAddressBookResponseBodyAclsTagList extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeAddressBookResponseBodyAclsTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsTagList self = new DescribeAddressBookResponseBodyAclsTagList();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeAddressBookResponseBodyAclsTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeAddressBookResponseBodyAcls extends TeaModel {
        @NameInMap("AddressListCount")
        public Integer addressListCount;

        @NameInMap("GroupUuid")
        public String groupUuid;

        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("TagRelation")
        public String tagRelation;

        @NameInMap("Global")
        public Integer global;

        @NameInMap("TagList")
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList;

        @NameInMap("AddressList")
        public java.util.List<String> addressList;

        public static DescribeAddressBookResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAcls self = new DescribeAddressBookResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAcls setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public DescribeAddressBookResponseBodyAcls setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
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

        public DescribeAddressBookResponseBodyAcls setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAddressBookResponseBodyAcls setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeAddressBookResponseBodyAcls setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

        public DescribeAddressBookResponseBodyAcls setGlobal(Integer global) {
            this.global = global;
            return this;
        }
        public Integer getGlobal() {
            return this.global;
        }

        public DescribeAddressBookResponseBodyAcls setTagList(java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> getTagList() {
            return this.tagList;
        }

        public DescribeAddressBookResponseBodyAcls setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

    }

}
