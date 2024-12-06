// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEB6EC62-B6C7-5082-A45A-45A204724AC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>SLA</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>99.95%</p>
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
        /**
         * <p>The CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.17.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The security group ID. Services in the same security group can access each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeehz13zcyj1kfk3o85</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeqals6rbj51bhjn8b89</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-d</p>
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

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList extends TeaModel {
        @NameInMap("PrivateDns")
        public java.util.List<String> privateDns;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList self = new DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList setPrivateDns(java.util.List<String> privateDns) {
            this.privateDns = privateDns;
            return this;
        }
        public java.util.List<String> getPrivateDns() {
            return this.privateDns;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cookie</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo self = new DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttributeTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo> tagInfo;

        public static DescribeInstancesResponseBodyInstancesInstanceAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAttributeTags self = new DescribeInstancesResponseBodyInstancesInstanceAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttributeTags setTagInfo(java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceAttributeTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAttribute extends TeaModel {
        /**
         * <p>The ACL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-uf6f9zfxfxtp5j9ng3yv4</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The name of the access control list (ACL).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>Indicates whether the ACL is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The ACL type. Valid values:</p>
         * <ul>
         * <li>black: blacklist</li>
         * <li>white: whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The egress IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("ClassicEgressAddress")
        public String classicEgressAddress;

        /**
         * <p>The internal CIDR block of the user\&quot;s VPC that can be accessed if the instance is a VPC integration instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;172.16.0.0/24\&quot;,\&quot;172.16.1.0/24\&quot;]</p>
         */
        @NameInMap("ConnectCidrBlocks")
        public String connectCidrBlocks;

        /**
         * <p>The ID of the user\&quot;s VPC if the instance is a VPC integration instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5eo7khlb4h4f8y9egsdg</p>
         */
        @NameInMap("ConnectVpcId")
        public String connectVpcId;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-22 15:36:53.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The type of the dedicated instance. Valid values:</p>
         * <ul>
         * <li>vpc_connect: VPC integration instance</li>
         * <li>normal: conventional dedicated instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc_connect</p>
         */
        @NameInMap("DedicatedInstanceType")
        public String dedicatedInstanceType;

        /**
         * <p>Indicates whether outbound IPv6 traffic is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EgressIpv6Enable")
        public Boolean egressIpv6Enable;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1659801600000</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The HTTPS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS2_TLS1_2</p>
         */
        @NameInMap("HttpsPolicies")
        public String httpsPolicies;

        /**
         * <p>The ID of the IPv6 ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-124resFfs235</p>
         */
        @NameInMap("IPV6AclId")
        public String IPV6AclId;

        /**
         * <p>The name of the IPv6 ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>testIPV6</p>
         */
        @NameInMap("IPV6AclName")
        public String IPV6AclName;

        /**
         * <p>Indicates whether the IPv6 ACL is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("IPV6AclStatus")
        public String IPV6AclStatus;

        /**
         * <p>The type of the IPv6 ACL. Valid values:</p>
         * <ul>
         * <li>black: blacklist</li>
         * <li>white: whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("IPV6AclType")
        public String IPV6AclType;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PayAsYouGo: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The CIDR block of the dedicated instance.</p>
         * <ul>
         * <li>172.16.0.0/12</li>
         * <li>192.168.0.0/16</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("InstanceCidrBlock")
        public String instanceCidrBlock;

        /**
         * <p>The ID of the cluster to which the dedicated instance cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-cluster-sh-1523cafbgffd</p>
         */
        @NameInMap("InstanceClusterId")
        public String instanceClusterId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-shared-vpc-020</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The requests per second (RPS) limit on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("InstanceRpsLimit")
        public Integer instanceRpsLimit;

        /**
         * <p>The instance specification.</p>
         * 
         * <strong>example:</strong>
         * <p>api.s1.small</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The instance specification details.</p>
         */
        @NameInMap("InstanceSpecAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeInstanceSpecAttributes instanceSpecAttributes;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>VPC_SHARED: shared instance (VPC)</li>
         * <li>VPC_DEDICATED: dedicated instance (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC_SHARED</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The outbound public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.241.89.244</p>
         */
        @NameInMap("InternetEgressAddress")
        public String internetEgressAddress;

        /**
         * <p>The internal CIDR block that is allowed to access the API Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;172.36.0.0/16\&quot;,\&quot;172.31.16.0/20\&quot;]</p>
         */
        @NameInMap("IntranetSegments")
        public String intranetSegments;

        /**
         * <p>The end time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>22:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The network information of the user\&quot;s VPC if the instance is a VPC integration instance.</p>
         */
        @NameInMap("NetworkInterfaceAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeNetworkInterfaceAttributes networkInterfaceAttributes;

        /**
         * <p>The new VPC egress CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.253.0/26</p>
         */
        @NameInMap("NewVpcEgressAddress")
        public String newVpcEgressAddress;

        /**
         * <p>The private DNS list.</p>
         */
        @NameInMap("PrivateDnsList")
        public DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList privateDnsList;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether IPv6 traffic is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesInstanceAttributeTags tags;

        /**
         * <p>The user VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t<em><strong>hx</strong></em><em>yu9</em>***t0g4</p>
         */
        @NameInMap("UserVpcId")
        public String userVpcId;

        /**
         * <p>The user vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4<em><strong>eh</strong></em><em>d7q</em>***i2f</p>
         */
        @NameInMap("UserVswitchId")
        public String userVswitchId;

        /**
         * <p>The VPC egress CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.254.0/26</p>
         */
        @NameInMap("VpcEgressAddress")
        public String vpcEgressAddress;

        /**
         * <p>Indicates whether VPC access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcIntranetEnable")
        public Boolean vpcIntranetEnable;

        /**
         * <p>The ID of the account to which the VPC-based instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1408453217640291****</p>
         */
        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        /**
         * <p>Indicates whether virtual private cloud (VPC) Server Load Balancer (SLB) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcSlbIntranetEnable")
        public Boolean vpcSlbIntranetEnable;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-MAZ5(g,h)</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Multi-Availability Zone 3(b,c,a)</p>
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

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setNewVpcEgressAddress(String newVpcEgressAddress) {
            this.newVpcEgressAddress = newVpcEgressAddress;
            return this;
        }
        public String getNewVpcEgressAddress() {
            return this.newVpcEgressAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setPrivateDnsList(DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList privateDnsList) {
            this.privateDnsList = privateDnsList;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceAttributePrivateDnsList getPrivateDnsList() {
            return this.privateDnsList;
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

        public DescribeInstancesResponseBodyInstancesInstanceAttribute setTags(DescribeInstancesResponseBodyInstancesInstanceAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceAttributeTags getTags() {
            return this.tags;
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
