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

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute extends TeaModel {
        /**
         * <p>vSwitch的网段。</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>安全组的ID，同一个安全组内的服务可以互相访问。</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>虚拟交换机ID</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>可用区ID</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute self = new DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes extends TeaModel {
        @NameInMap("NetworkInterfaceAttribute")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute> networkInterfaceAttribute;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes self = new DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes setNetworkInterfaceAttribute(java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute> networkInterfaceAttribute) {
            this.networkInterfaceAttribute = networkInterfaceAttribute;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute> getNetworkInterfaceAttribute() {
            return this.networkInterfaceAttribute;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttribute extends TeaModel {
        @NameInMap("AclId")
        public String aclId;

        @NameInMap("AclName")
        public String aclName;

        @NameInMap("AclStatus")
        public String aclStatus;

        @NameInMap("AclType")
        public String aclType;

        @NameInMap("ClassicEgressAddress")
        public String classicEgressAddress;

        @NameInMap("ConnectCidrBlocks")
        public String connectCidrBlocks;

        /**
         * <p>VPC融合类型专享实例联通的用户VPC ID</p>
         */
        @NameInMap("ConnectVpcId")
        public String connectVpcId;

        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>专享实例类型</p>
         * <p>- vpc_connect：VPC融合类型专享实例</p>
         * <p>- normal：传统类型专享实例</p>
         */
        @NameInMap("DedicatedInstanceType")
        public String dedicatedInstanceType;

        @NameInMap("EgressIpv6Enable")
        public Boolean egressIpv6Enable;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("HttpsPolicies")
        public String httpsPolicies;

        @NameInMap("IPV6AclId")
        public String IPV6AclId;

        @NameInMap("IPV6AclName")
        public String IPV6AclName;

        @NameInMap("IPV6AclStatus")
        public String IPV6AclStatus;

        @NameInMap("IPV6AclType")
        public String IPV6AclType;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>专享实例所在网段</p>
         * <p>- 172.16.0.0/12</p>
         * <p>- 192.168.0.0/16</p>
         */
        @NameInMap("InstanceCidrBlock")
        public String instanceCidrBlock;

        @NameInMap("InstanceClusterId")
        public String instanceClusterId;

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

        @NameInMap("IntranetSegments")
        public String intranetSegments;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>VPC融合类型专享实例连通的用户VPC内的网络信息</p>
         */
        @NameInMap("NetworkInterfaceAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes networkInterfaceAttributes;

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

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setClassicEgressAddress(String classicEgressAddress) {
            this.classicEgressAddress = classicEgressAddress;
            return this;
        }
        public String getClassicEgressAddress() {
            return this.classicEgressAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setConnectCidrBlocks(String connectCidrBlocks) {
            this.connectCidrBlocks = connectCidrBlocks;
            return this;
        }
        public String getConnectCidrBlocks() {
            return this.connectCidrBlocks;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setConnectVpcId(String connectVpcId) {
            this.connectVpcId = connectVpcId;
            return this;
        }
        public String getConnectVpcId() {
            return this.connectVpcId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setDedicatedInstanceType(String dedicatedInstanceType) {
            this.dedicatedInstanceType = dedicatedInstanceType;
            return this;
        }
        public String getDedicatedInstanceType() {
            return this.dedicatedInstanceType;
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

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setIPV6AclId(String IPV6AclId) {
            this.IPV6AclId = IPV6AclId;
            return this;
        }
        public String getIPV6AclId() {
            return this.IPV6AclId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setIPV6AclName(String IPV6AclName) {
            this.IPV6AclName = IPV6AclName;
            return this;
        }
        public String getIPV6AclName() {
            return this.IPV6AclName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setIPV6AclStatus(String IPV6AclStatus) {
            this.IPV6AclStatus = IPV6AclStatus;
            return this;
        }
        public String getIPV6AclStatus() {
            return this.IPV6AclStatus;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setIPV6AclType(String IPV6AclType) {
            this.IPV6AclType = IPV6AclType;
            return this;
        }
        public String getIPV6AclType() {
            return this.IPV6AclType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceCidrBlock(String instanceCidrBlock) {
            this.instanceCidrBlock = instanceCidrBlock;
            return this;
        }
        public String getInstanceCidrBlock() {
            return this.instanceCidrBlock;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setInstanceClusterId(String instanceClusterId) {
            this.instanceClusterId = instanceClusterId;
            return this;
        }
        public String getInstanceClusterId() {
            return this.instanceClusterId;
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

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setIntranetSegments(String intranetSegments) {
            this.intranetSegments = intranetSegments;
            return this;
        }
        public String getIntranetSegments() {
            return this.intranetSegments;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setNetworkInterfaceAttributes(DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes networkInterfaceAttributes) {
            this.networkInterfaceAttributes = networkInterfaceAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes getNetworkInterfaceAttributes() {
            return this.networkInterfaceAttributes;
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
