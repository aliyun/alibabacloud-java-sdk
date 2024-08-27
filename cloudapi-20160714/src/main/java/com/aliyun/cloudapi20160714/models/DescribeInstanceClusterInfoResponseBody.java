// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterInfoResponseBody extends TeaModel {
    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T18:29:27</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The cluster description, which can be up to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>v0.0.4</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The cluster details.</p>
     */
    @NameInMap("InstanceClusterAttribute")
    public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute instanceClusterAttribute;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-ht-04e41d95e9c1</p>
     */
    @NameInMap("InstanceClusterId")
    public String instanceClusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceClusterName")
    public String instanceClusterName;

    /**
     * <p>The cluster status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("InstanceClusterStatus")
    public String instanceClusterStatus;

    /**
     * <p>The cluster type.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("InstanceClusterType")
    public String instanceClusterType;

    /**
     * <p>The cluster version.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.3.856</p>
     */
    @NameInMap("InstanceClusterVersion")
    public String instanceClusterVersion;

    /**
     * <p>The dedicated instances contained in the cluster.</p>
     */
    @NameInMap("InstanceList")
    public DescribeInstanceClusterInfoResponseBodyInstanceList instanceList;

    /**
     * <p>The time when the cluster was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-19 10:40:29 +0800</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The region ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterInfoResponseBody self = new DescribeInstanceClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterInfoResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeInstanceClusterInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterAttribute(DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute instanceClusterAttribute) {
        this.instanceClusterAttribute = instanceClusterAttribute;
        return this;
    }
    public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute getInstanceClusterAttribute() {
        return this.instanceClusterAttribute;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterId(String instanceClusterId) {
        this.instanceClusterId = instanceClusterId;
        return this;
    }
    public String getInstanceClusterId() {
        return this.instanceClusterId;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterName(String instanceClusterName) {
        this.instanceClusterName = instanceClusterName;
        return this;
    }
    public String getInstanceClusterName() {
        return this.instanceClusterName;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterStatus(String instanceClusterStatus) {
        this.instanceClusterStatus = instanceClusterStatus;
        return this;
    }
    public String getInstanceClusterStatus() {
        return this.instanceClusterStatus;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterType(String instanceClusterType) {
        this.instanceClusterType = instanceClusterType;
        return this;
    }
    public String getInstanceClusterType() {
        return this.instanceClusterType;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterVersion(String instanceClusterVersion) {
        this.instanceClusterVersion = instanceClusterVersion;
        return this;
    }
    public String getInstanceClusterVersion() {
        return this.instanceClusterVersion;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceList(DescribeInstanceClusterInfoResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public DescribeInstanceClusterInfoResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public DescribeInstanceClusterInfoResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeInstanceClusterInfoResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute extends TeaModel {
        /**
         * <p>The internal CIDR block of the user VPC that can be accessed by the cluster if the cluster consists of VPC integration instances.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.168.1.0/24&quot;,&quot;192.168.0.0/24&quot;]</p>
         */
        @NameInMap("ConnectCidrBlocks")
        public String connectCidrBlocks;

        /**
         * <p>The ID of the user VPC that is connected to the cluster if the cluster consists of VPC integration instances.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0w3kxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ConnectVpcId")
        public String connectVpcId;

        /**
         * <p>Indicates whether outbound IPv6 traffic is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EgressIpv6Enable")
        public Boolean egressIpv6Enable;

        /**
         * <p>The HTTPS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS2_TLS1_0</p>
         */
        @NameInMap("HttpsPolicies")
        public String httpsPolicies;

        /**
         * <p>The ID of the IPv4 access control list (ACL).</p>
         * 
         * <strong>example:</strong>
         * <p>acl-t4n8i4rvvp70kcyuoXXXX</p>
         */
        @NameInMap("IPV4AclId")
        public String IPV4AclId;

        /**
         * <p>The name of the IPv4 ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>test-black</p>
         */
        @NameInMap("IPV4AclName")
        public String IPV4AclName;

        /**
         * <p>Indicates whether IPv4 access control is enabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("IPV4AclStatus")
        public String IPV4AclStatus;

        /**
         * <p>The type of the IPv4 ACL.</p>
         * <ul>
         * <li>black: blacklist</li>
         * <li>white: whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("IPV4AclType")
        public String IPV4AclType;

        /**
         * <p>The ID of the IPv6 ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-t4nevzhwbpe7cup18XXXX</p>
         */
        @NameInMap("IPV6AclId")
        public String IPV6AclId;

        /**
         * <p>The name of the IPv6 ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IPV6AclName")
        public String IPV6AclName;

        /**
         * <p>Indicates whether IPv6 access control is enabled. Valid values:</p>
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
         * <p>white</p>
         */
        @NameInMap("IPV6AclType")
        public String IPV6AclType;

        /**
         * <p>The outbound public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>39.106.XX.XX</p>
         */
        @NameInMap("InternetEgressAddress")
        public String internetEgressAddress;

        /**
         * <p>The outbound private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX/26</p>
         */
        @NameInMap("IntranetEgressAddress")
        public String intranetEgressAddress;

        /**
         * <p>The custom CIDR block. The configured CIDR block is considered as a private block.</p>
         * 
         * <strong>example:</strong>
         * <p>123.0.0.1</p>
         */
        @NameInMap("IntranetSegments")
        public String intranetSegments;

        /**
         * <p>Indicates whether IPv6 traffic is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        /**
         * <p>The ID of the client VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zew2v4vcg78mXXXX</p>
         */
        @NameInMap("UserVpcId")
        public String userVpcId;

        /**
         * <p>The vSwitch of the client VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zecr5r7ao44tslsXXXX</p>
         */
        @NameInMap("UserVswitchId")
        public String userVswitchId;

        /**
         * <p>The VIPs of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC_INTERNET_IPV6</p>
         */
        @NameInMap("VipTypeList")
        public String vipTypeList;

        /**
         * <p>Indicates whether a virtual private cloud (VPC) domain name is enabled.</p>
         */
        @NameInMap("VpcIntranetEnable")
        public Boolean vpcIntranetEnable;

        /**
         * <p>The ID of the account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>165438596694XXXX</p>
         */
        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        /**
         * <p>Indicates whether self-calling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VpcSlbIntranetEnable")
        public Boolean vpcSlbIntranetEnable;

        public static DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute self = new DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setConnectCidrBlocks(String connectCidrBlocks) {
            this.connectCidrBlocks = connectCidrBlocks;
            return this;
        }
        public String getConnectCidrBlocks() {
            return this.connectCidrBlocks;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setConnectVpcId(String connectVpcId) {
            this.connectVpcId = connectVpcId;
            return this;
        }
        public String getConnectVpcId() {
            return this.connectVpcId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setEgressIpv6Enable(Boolean egressIpv6Enable) {
            this.egressIpv6Enable = egressIpv6Enable;
            return this;
        }
        public Boolean getEgressIpv6Enable() {
            return this.egressIpv6Enable;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setHttpsPolicies(String httpsPolicies) {
            this.httpsPolicies = httpsPolicies;
            return this;
        }
        public String getHttpsPolicies() {
            return this.httpsPolicies;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclId(String IPV4AclId) {
            this.IPV4AclId = IPV4AclId;
            return this;
        }
        public String getIPV4AclId() {
            return this.IPV4AclId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclName(String IPV4AclName) {
            this.IPV4AclName = IPV4AclName;
            return this;
        }
        public String getIPV4AclName() {
            return this.IPV4AclName;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclStatus(String IPV4AclStatus) {
            this.IPV4AclStatus = IPV4AclStatus;
            return this;
        }
        public String getIPV4AclStatus() {
            return this.IPV4AclStatus;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclType(String IPV4AclType) {
            this.IPV4AclType = IPV4AclType;
            return this;
        }
        public String getIPV4AclType() {
            return this.IPV4AclType;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclId(String IPV6AclId) {
            this.IPV6AclId = IPV6AclId;
            return this;
        }
        public String getIPV6AclId() {
            return this.IPV6AclId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclName(String IPV6AclName) {
            this.IPV6AclName = IPV6AclName;
            return this;
        }
        public String getIPV6AclName() {
            return this.IPV6AclName;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclStatus(String IPV6AclStatus) {
            this.IPV6AclStatus = IPV6AclStatus;
            return this;
        }
        public String getIPV6AclStatus() {
            return this.IPV6AclStatus;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclType(String IPV6AclType) {
            this.IPV6AclType = IPV6AclType;
            return this;
        }
        public String getIPV6AclType() {
            return this.IPV6AclType;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setInternetEgressAddress(String internetEgressAddress) {
            this.internetEgressAddress = internetEgressAddress;
            return this;
        }
        public String getInternetEgressAddress() {
            return this.internetEgressAddress;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIntranetEgressAddress(String intranetEgressAddress) {
            this.intranetEgressAddress = intranetEgressAddress;
            return this;
        }
        public String getIntranetEgressAddress() {
            return this.intranetEgressAddress;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIntranetSegments(String intranetSegments) {
            this.intranetSegments = intranetSegments;
            return this;
        }
        public String getIntranetSegments() {
            return this.intranetSegments;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setSupportIpv6(Boolean supportIpv6) {
            this.supportIpv6 = supportIpv6;
            return this;
        }
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setUserVpcId(String userVpcId) {
            this.userVpcId = userVpcId;
            return this;
        }
        public String getUserVpcId() {
            return this.userVpcId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setUserVswitchId(String userVswitchId) {
            this.userVswitchId = userVswitchId;
            return this;
        }
        public String getUserVswitchId() {
            return this.userVswitchId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVipTypeList(String vipTypeList) {
            this.vipTypeList = vipTypeList;
            return this;
        }
        public String getVipTypeList() {
            return this.vipTypeList;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVpcIntranetEnable(Boolean vpcIntranetEnable) {
            this.vpcIntranetEnable = vpcIntranetEnable;
            return this;
        }
        public Boolean getVpcIntranetEnable() {
            return this.vpcIntranetEnable;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVpcOwnerId(Long vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
            this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
            return this;
        }
        public Boolean getVpcSlbIntranetEnable() {
            return this.vpcSlbIntranetEnable;
        }

    }

    public static class DescribeInstanceClusterInfoResponseBodyInstanceListInstance extends TeaModel {
        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-ht-04e41d95e9c1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testacceu-central-1apigatewayinstance8752</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceClusterInfoResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterInfoResponseBodyInstanceListInstance self = new DescribeInstanceClusterInfoResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstanceClusterInfoResponseBodyInstanceList extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstanceClusterInfoResponseBodyInstanceListInstance> instance;

        public static DescribeInstanceClusterInfoResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterInfoResponseBodyInstanceList self = new DescribeInstanceClusterInfoResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceList setInstance(java.util.List<DescribeInstanceClusterInfoResponseBodyInstanceListInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstanceClusterInfoResponseBodyInstanceListInstance> getInstance() {
            return this.instance;
        }

    }

}
