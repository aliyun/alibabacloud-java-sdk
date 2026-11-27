// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The IP address allocation mode. Valid values:</p>
     * <ul>
     * <li><p><strong>Fixed</strong> (default): fixed IP mode. A fixed IP address is allocated to each zone.</p>
     * </li>
     * <li><p><strong>Dynamic</strong>: dynamic IP mode. IP addresses are dynamically allocated to each zone.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Starting from &lt;props=&quot;china&quot;&gt;00:00:00 on February 25, 2025 (UTC+8)&lt;props=&quot;intl&quot;&gt;00:00:00 on February 25, 2025 (UTC+8), when you create an instance by calling this operation, an <a href="https://help.aliyun.com/document_detail/2864070.html">upgraded ALB instance</a> is created regardless of the mode you specify. The IP address allocation mode is no longer distinguished, and the allocated IP addresses are automatically scalable. Existing ALB instances created before the upgrade are not affected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Fixed</p>
     */
    @NameInMap("AddressAllocatedMode")
    public String addressAllocatedMode;

    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual-stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The network type of the Application Load Balancing (ALB) instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong>: The Application Load Balancing (ALB) instance uses a public IP address. The DNS domain name is parsed to the public IP address. Therefore, the instance can be accessed in the Internet environment.</p>
     * </li>
     * <li><p><strong>Intranet</strong>: The Application Load Balancing (ALB) instance uses only a private IP address. The DNS domain name is parsed to the private IP address. Therefore, the instance can be accessed only in the internal network environment of the VPC where the Application Load Balancing (ALB) instance is deployed.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value from your client to ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable deletion protection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables deletion protection.</li>
     * <li><strong>false</strong> (default): disables deletion protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtectionEnabled")
    public Boolean deletionProtectionEnabled;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without creating the Application Load Balancing (ALB) instance. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends a normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing configuration of the Application Load Balancing (ALB) instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The edition of the Application Load Balancing (ALB) instance. Different editions have different feature limits and billing policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: Basic Edition.</p>
     * </li>
     * <li><p><strong>Standard</strong>: Standard Edition.</p>
     * </li>
     * <li><p><strong>StandardWithWaf</strong>: WAF-enhanced Edition.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The name of the Application Load Balancing (ALB) instance.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. It must start with a letter or digit.</p>
     * 
     * <strong>example:</strong>
     * <p>alb1</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The modification protection configuration.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public CreateLoadBalancerRequestModificationProtectionConfig modificationProtectionConfig;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the security groups.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<CreateLoadBalancerRequestSecurityGroupIds> securityGroupIds;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLoadBalancerRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the Application Load Balancing (ALB) instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1b49rqrybk45nio****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The list of zone and vSwitch mappings. You can specify up to 10 zones. If the current region supports two or more zones, you must specify at least two zones.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setAddressAllocatedMode(String addressAllocatedMode) {
        this.addressAllocatedMode = addressAllocatedMode;
        return this;
    }
    public String getAddressAllocatedMode() {
        return this.addressAllocatedMode;
    }

    public CreateLoadBalancerRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public CreateLoadBalancerRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLoadBalancerRequest setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
        return this;
    }
    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    public CreateLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateLoadBalancerRequest setLoadBalancerBillingConfig(CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig) {
        this.loadBalancerBillingConfig = loadBalancerBillingConfig;
        return this;
    }
    public CreateLoadBalancerRequestLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    public CreateLoadBalancerRequest setLoadBalancerEdition(String loadBalancerEdition) {
        this.loadBalancerEdition = loadBalancerEdition;
        return this;
    }
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    public CreateLoadBalancerRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerRequest setModificationProtectionConfig(CreateLoadBalancerRequestModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public CreateLoadBalancerRequestModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public CreateLoadBalancerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLoadBalancerRequest setSecurityGroupIds(java.util.List<CreateLoadBalancerRequestSecurityGroupIds> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestSecurityGroupIds> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateLoadBalancerRequest setTag(java.util.List<CreateLoadBalancerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestTag> getTag() {
        return this.tag;
    }

    public CreateLoadBalancerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLoadBalancerRequest setZoneMappings(java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateLoadBalancerRequestLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1vevu8h3ieh****</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The billing method of the instance.</p>
         * <p>Set the value to <strong>PostPay</strong>, which specifies the pay-as-you-go billing method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static CreateLoadBalancerRequestLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestLoadBalancerBillingConfig self = new CreateLoadBalancerRequestLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestLoadBalancerBillingConfig setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public CreateLoadBalancerRequestLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class CreateLoadBalancerRequestModificationProtectionConfig extends TeaModel {
        /**
         * <p>The reason for enabling modification protection.</p>
         * <p>The value must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter or a Chinese character.</p>
         * <blockquote>
         * <p>This parameter is valid only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Managed Instance</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The modification protection status of the Application Load Balancing (ALB) instance. Valid values:</p>
         * <ul>
         * <li><p><strong>NonProtection</strong>: disables modification protection. If <strong>Reason</strong> is specified, it is forcibly cleared.</p>
         * </li>
         * <li><p><strong>ConsoleProtection</strong>: enables modification protection in the console. If <strong>Reason</strong> is specified, it takes effect.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When this parameter is set to <strong>ConsoleProtection</strong>, users cannot modify the instance configurations in the load balancing console, but can invoke API operations to modify the instance configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateLoadBalancerRequestModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestModificationProtectionConfig self = new CreateLoadBalancerRequestModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateLoadBalancerRequestModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateLoadBalancerRequestSecurityGroupIds extends TeaModel {
        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-gw82chzr7ru23iwbn9mu</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static CreateLoadBalancerRequestSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestSecurityGroupIds self = new CreateLoadBalancerRequestSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestSecurityGroupIds setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class CreateLoadBalancerRequestTag extends TeaModel {
        /**
         * <p>The tag key. It can be up to 128 characters in length, and cannot start with aliyun or acs:, or contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag key. It can be up to 128 characters in length, and cannot start with aliyun or acs:, or contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLoadBalancerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestTag self = new CreateLoadBalancerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLoadBalancerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLoadBalancerRequestZoneMappings extends TeaModel {
        /**
         * <p>The instance ID of the elastic IP address (EIP) that is attached to the Internet-facing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the EIP. Valid values:</p>
         * <ul>
         * <li><p>Common (default): EIP.</p>
         * </li>
         * <li><p>Anycast: Anycast EIP.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information about the regions where ALB supports Anycast EIPs, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The IPv4 private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The ID of the vSwitch in the zone. You can use only one vSwitch and one subnet in each zone. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-sersdf****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.
         * You can call the <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> operation to query the information about the zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateLoadBalancerRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestZoneMappings self = new CreateLoadBalancerRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public CreateLoadBalancerRequestZoneMappings setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
        }

        public CreateLoadBalancerRequestZoneMappings setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public CreateLoadBalancerRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateLoadBalancerRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
