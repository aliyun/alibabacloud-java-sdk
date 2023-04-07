// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastEipAddressResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AnycastEipBindInfoList")
    public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList> anycastEipBindInfoList;

    @NameInMap("AnycastId")
    public String anycastId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Bid")
    public String bid;

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

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceLocation")
    public String serviceLocation;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<DescribeAnycastEipAddressResponseBodyTags> tags;

    public static DescribeAnycastEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastEipAddressResponseBody self = new DescribeAnycastEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastEipAddressResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeAnycastEipAddressResponseBody setAnycastEipBindInfoList(java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList> anycastEipBindInfoList) {
        this.anycastEipBindInfoList = anycastEipBindInfoList;
        return this;
    }
    public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList> getAnycastEipBindInfoList() {
        return this.anycastEipBindInfoList;
    }

    public DescribeAnycastEipAddressResponseBody setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public DescribeAnycastEipAddressResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeAnycastEipAddressResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeAnycastEipAddressResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeAnycastEipAddressResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAnycastEipAddressResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAnycastEipAddressResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAnycastEipAddressResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeAnycastEipAddressResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeAnycastEipAddressResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAnycastEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAnycastEipAddressResponseBody setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public DescribeAnycastEipAddressResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAnycastEipAddressResponseBody setTags(java.util.List<DescribeAnycastEipAddressResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeAnycastEipAddressResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations extends TeaModel {
        @NameInMap("PopLocation")
        public String popLocation;

        public static DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations self = new DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

    public static class DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList extends TeaModel {
        @NameInMap("AssociationMode")
        public String associationMode;

        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        @NameInMap("BindInstanceRegionId")
        public String bindInstanceRegionId;

        @NameInMap("BindInstanceType")
        public String bindInstanceType;

        @NameInMap("BindTime")
        public String bindTime;

        @NameInMap("PopLocations")
        public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations> popLocations;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("Status")
        public String status;

        public static DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList self = new DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setAssociationMode(String associationMode) {
            this.associationMode = associationMode;
            return this;
        }
        public String getAssociationMode() {
            return this.associationMode;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindInstanceId(String bindInstanceId) {
            this.bindInstanceId = bindInstanceId;
            return this;
        }
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindInstanceRegionId(String bindInstanceRegionId) {
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }
        public String getBindInstanceRegionId() {
            return this.bindInstanceRegionId;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindInstanceType(String bindInstanceType) {
            this.bindInstanceType = bindInstanceType;
            return this;
        }
        public String getBindInstanceType() {
            return this.bindInstanceType;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindTime(String bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public String getBindTime() {
            return this.bindTime;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setPopLocations(java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations> popLocations) {
            this.popLocations = popLocations;
            return this;
        }
        public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations> getPopLocations() {
            return this.popLocations;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAnycastEipAddressResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAnycastEipAddressResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastEipAddressResponseBodyTags self = new DescribeAnycastEipAddressResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastEipAddressResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAnycastEipAddressResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
