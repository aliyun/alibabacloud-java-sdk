// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesResponseBody extends TeaModel {
    @NameInMap("AnycastList")
    public java.util.List<ListAnycastEipAddressesResponseBodyAnycastList> anycastList;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAnycastEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnycastEipAddressesResponseBody self = new ListAnycastEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnycastEipAddressesResponseBody setAnycastList(java.util.List<ListAnycastEipAddressesResponseBodyAnycastList> anycastList) {
        this.anycastList = anycastList;
        return this;
    }
    public java.util.List<ListAnycastEipAddressesResponseBodyAnycastList> getAnycastList() {
        return this.anycastList;
    }

    public ListAnycastEipAddressesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnycastEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnycastEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList extends TeaModel {
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        @NameInMap("BindInstanceRegionId")
        public String bindInstanceRegionId;

        @NameInMap("BindInstanceType")
        public String bindInstanceType;

        @NameInMap("BindTime")
        public String bindTime;

        public static ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList self = new ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindInstanceId(String bindInstanceId) {
            this.bindInstanceId = bindInstanceId;
            return this;
        }
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindInstanceRegionId(String bindInstanceRegionId) {
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }
        public String getBindInstanceRegionId() {
            return this.bindInstanceRegionId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindInstanceType(String bindInstanceType) {
            this.bindInstanceType = bindInstanceType;
            return this;
        }
        public String getBindInstanceType() {
            return this.bindInstanceType;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindTime(String bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public String getBindTime() {
            return this.bindTime;
        }

    }

    public static class ListAnycastEipAddressesResponseBodyAnycastListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListAnycastEipAddressesResponseBodyAnycastListTags build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesResponseBodyAnycastListTags self = new ListAnycastEipAddressesResponseBodyAnycastListTags();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesResponseBodyAnycastListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAnycastEipAddressesResponseBodyAnycastList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AnycastEipBindInfoList")
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList> anycastEipBindInfoList;

        @NameInMap("AnycastId")
        public String anycastId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceLocation")
        public String serviceLocation;

        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListTags> tags;

        public static ListAnycastEipAddressesResponseBodyAnycastList build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesResponseBodyAnycastList self = new ListAnycastEipAddressesResponseBodyAnycastList();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setAnycastEipBindInfoList(java.util.List<ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList> anycastEipBindInfoList) {
            this.anycastEipBindInfoList = anycastEipBindInfoList;
            return this;
        }
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList> getAnycastEipBindInfoList() {
            return this.anycastEipBindInfoList;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setAnycastId(String anycastId) {
            this.anycastId = anycastId;
            return this;
        }
        public String getAnycastId() {
            return this.anycastId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setServiceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setServiceManaged(Integer serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setTags(java.util.List<ListAnycastEipAddressesResponseBodyAnycastListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListTags> getTags() {
            return this.tags;
        }

    }

}
