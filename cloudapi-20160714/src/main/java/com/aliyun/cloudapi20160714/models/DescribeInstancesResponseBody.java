// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute self = new DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes extends TeaModel {
        @NameInMap("SpecAttribute")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute> specAttribute;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes self = new DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes setSpecAttribute(java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute> specAttribute) {
            this.specAttribute = specAttribute;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributesSpecAttribute> getSpecAttribute() {
            return this.specAttribute;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttribute extends TeaModel {
        @NameInMap("ClassicEgressAddress")
        public String classicEgressAddress;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("EgressIpv6Enable")
        public Boolean egressIpv6Enable;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("HttpsPolicies")
        public String httpsPolicies;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceRpsLimit")
        public Integer instanceRpsLimit;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("InstanceSpecAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes instanceSpecAttributes;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetEgressAddress")
        public String internetEgressAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        @NameInMap("UserVpcId")
        public String userVpcId;

        @NameInMap("UserVswitchId")
        public String userVswitchId;

        @NameInMap("VipTypeList")
        public String vipTypeList;

        @NameInMap("VpcEgressAddress")
        public String vpcEgressAddress;

        @NameInMap("VpcIntranetEnable")
        public Boolean vpcIntranetEnable;

        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        @NameInMap("VpcSlbIntranetEnable")
        public Boolean vpcSlbIntranetEnable;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneLocalName")
        public String zoneLocalName;

        public static DescribeInstancesResponseBodyInstancesInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttribute self = new DescribeInstancesResponseBodyInstancesInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setClassicEgressAddress(String classicEgressAddress) {
            this.classicEgressAddress = classicEgressAddress;
            return this;
        }
        public String getClassicEgressAddress() {
            return this.classicEgressAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setEgressIpv6Enable(Boolean egressIpv6Enable) {
            this.egressIpv6Enable = egressIpv6Enable;
            return this;
        }
        public Boolean getEgressIpv6Enable() {
            return this.egressIpv6Enable;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setHttpsPolicies(String httpsPolicies) {
            this.httpsPolicies = httpsPolicies;
            return this;
        }
        public String getHttpsPolicies() {
            return this.httpsPolicies;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceRpsLimit(Integer instanceRpsLimit) {
            this.instanceRpsLimit = instanceRpsLimit;
            return this;
        }
        public Integer getInstanceRpsLimit() {
            return this.instanceRpsLimit;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceSpecAttributes(DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes instanceSpecAttributes) {
            this.instanceSpecAttributes = instanceSpecAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes getInstanceSpecAttributes() {
            return this.instanceSpecAttributes;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInternetEgressAddress(String internetEgressAddress) {
            this.internetEgressAddress = internetEgressAddress;
            return this;
        }
        public String getInternetEgressAddress() {
            return this.internetEgressAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setSupportIpv6(Boolean supportIpv6) {
            this.supportIpv6 = supportIpv6;
            return this;
        }
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setUserVpcId(String userVpcId) {
            this.userVpcId = userVpcId;
            return this;
        }
        public String getUserVpcId() {
            return this.userVpcId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setUserVswitchId(String userVswitchId) {
            this.userVswitchId = userVswitchId;
            return this;
        }
        public String getUserVswitchId() {
            return this.userVswitchId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setVipTypeList(String vipTypeList) {
            this.vipTypeList = vipTypeList;
            return this;
        }
        public String getVipTypeList() {
            return this.vipTypeList;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setVpcEgressAddress(String vpcEgressAddress) {
            this.vpcEgressAddress = vpcEgressAddress;
            return this;
        }
        public String getVpcEgressAddress() {
            return this.vpcEgressAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setVpcIntranetEnable(Boolean vpcIntranetEnable) {
            this.vpcIntranetEnable = vpcIntranetEnable;
            return this;
        }
        public Boolean getVpcIntranetEnable() {
            return this.vpcIntranetEnable;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setVpcOwnerId(Long vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setVpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
            this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
            return this;
        }
        public Boolean getVpcSlbIntranetEnable() {
            return this.vpcSlbIntranetEnable;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setZoneLocalName(String zoneLocalName) {
            this.zoneLocalName = zoneLocalName;
            return this;
        }
        public String getZoneLocalName() {
            return this.zoneLocalName;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("InstanceAttribute")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttribute> instanceAttribute;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setInstanceAttribute(java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttribute> instanceAttribute) {
            this.instanceAttribute = instanceAttribute;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttribute> getInstanceAttribute() {
            return this.instanceAttribute;
        }

    }

}
