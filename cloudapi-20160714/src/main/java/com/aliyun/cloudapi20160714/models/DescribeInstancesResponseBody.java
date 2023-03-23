// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the instances.</p>
     */
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
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
        /**
         * <p>The variable name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The variable value.</p>
         */
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
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VswitchId")
        public String vswitchId;

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

        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributesNetworkInterfaceAttribute setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
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
        /**
         * <p>The ID of the access control policy.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The name of the access control policy.</p>
         */
        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>Indicates whether access control is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The type of the access control policy. Valid values:</p>
         * <br>
         * <p>*   black: blacklist</p>
         * <p>*   white: whitelist</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The outbound IP address.</p>
         */
        @NameInMap("ClassicEgressAddress")
        public String classicEgressAddress;

        @NameInMap("ConnectVpcId")
        public String connectVpcId;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DedicatedInstanceType")
        public String dedicatedInstanceType;

        /**
         * <p>Indicates whether outbound IPv6 is supported.</p>
         */
        @NameInMap("EgressIpv6Enable")
        public Boolean egressIpv6Enable;

        /**
         * <p>The time when the instance expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The HTTPS security policy.</p>
         */
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

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   PrePaid: subscription</p>
         * <p>*   PayAsYouGo: pay-as-you-go</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceCidrBlock")
        public String instanceCidrBlock;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The records per second (RPS) limit on the instance.</p>
         */
        @NameInMap("InstanceRpsLimit")
        public Integer instanceRpsLimit;

        /**
         * <p>The specifications of the instance.</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The specifications of the instance.</p>
         */
        @NameInMap("InstanceSpecAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes instanceSpecAttributes;

        /**
         * <p>The instance type.</p>
         * <br>
         * <p>*   VPC_SHARED: shared instance (VPC)</p>
         * <p>*   VPC_DEDICATED: dedicated instance (VPC)</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The outbound public IP address.</p>
         */
        @NameInMap("InternetEgressAddress")
        public String internetEgressAddress;

        @NameInMap("IntranetSegments")
        public String intranetSegments;

        @NameInMap("NetworkInterfaceAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes networkInterfaceAttributes;

        /**
         * <p>The region where the instance is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether IPv6 is supported.</p>
         */
        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        /**
         * <p>The ID of the user\"s VPC.</p>
         */
        @NameInMap("UserVpcId")
        public String userVpcId;

        /**
         * <p>The ID of the user interaction machine.</p>
         */
        @NameInMap("UserVswitchId")
        public String userVswitchId;

        @NameInMap("VipTypeList")
        public String vipTypeList;

        /**
         * <p>The outbound CIDR block of the VPC.</p>
         */
        @NameInMap("VpcEgressAddress")
        public String vpcEgressAddress;

        /**
         * <p>Indicates whether VPC is enabled.</p>
         */
        @NameInMap("VpcIntranetEnable")
        public Boolean vpcIntranetEnable;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         */
        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        /**
         * <p>Indicates whether VPC SLB is enabled.</p>
         */
        @NameInMap("VpcSlbIntranetEnable")
        public Boolean vpcSlbIntranetEnable;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The zone.</p>
         */
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
