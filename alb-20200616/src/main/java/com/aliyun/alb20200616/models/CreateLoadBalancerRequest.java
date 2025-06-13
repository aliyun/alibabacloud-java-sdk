// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The mode in which IP addresses are allocated to the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Fixed</strong> (default): a fixed IP address is assigned to the ALB instance in each zone.</li>
     * <li><strong>Dynamic</strong>: IP addresses are dynamically allocated to the ALB instance in each zone.</li>
     * </ul>
     * <blockquote>
     * <p> Starting from 00:00:00 on February 25, 2025 (UTC+8), when you call this operation to create an ALB instance, the instance is automatically the <a href="https://help.aliyun.com/document_detail/2864070.html">upgraded version</a> regardless of the mode you specify. Upgraded ALB instances no longer differentiate between IP modes. Instead, they globally auto-scale IP addresses for providing load balancing services. The ALB instances you created before this date and time are not affected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Dynamic</p>
     */
    @NameInMap("AddressAllocatedMode")
    public String addressAllocatedMode;

    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4:</strong> IPv4.</li>
     * <li><strong>DualStack:</strong> dual stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The type of the address of the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet:</strong> The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. In this case, the ALB instance can be accessed over the Internet.</li>
     * <li><strong>Intranet:</strong> The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.</li>
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
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The value of the <strong>RequestId</strong> parameter may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable deletion protection. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> enables deletion protection.</li>
     * <li><strong>false:</strong> disables deletion protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtectionEnabled")
    public Boolean deletionProtectionEnabled;

    /**
     * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false:</strong> performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing method of the ALB instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Basic:</strong> basic.</li>
     * <li><strong>Standard:</strong> standard.</li>
     * <li><strong>StandardWithWaf:</strong> WAF-enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The name of the ALB instance.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>alb1</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The configuration read-only mode settings.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLoadBalancerRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which you want to create the ALB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1b49rqrybk45nio****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The mappings between zones an vSwitches. You can specify at most 10 zones. If the selected region supports two or more zones, select at least two zones to ensure the high availability of your service.</p>
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
         * <p>The reason for enabling the configuration read-only mode.</p>
         * <p>The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: Disables the configuration read-only mode. In this case, the value of the <strong>Reason</strong> parameter that you specify does not take effect. If you specify <strong>Reason</strong>, the value of the parameter is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: Enables the configuration read-only mode. In this case, the value of the <strong>Reason</strong> parameter that you specify takes effect.****</li>
         * </ul>
         * <blockquote>
         * <p> If the parameter is set to <strong>ConsoleProtection</strong>, the configuration read-only mode is enabled. You cannot modify the configurations of the ALB instance in the ALB console. However, you can call API operations to modify the configurations of the ALB instance.</p>
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

    public static class CreateLoadBalancerRequestTag extends TeaModel {
        /**
         * <p>The tag key can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
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
         * <p>The ID of the EIP to be associated with the Internet-facing ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of EIP. Valid values:</p>
         * <ul>
         * <li><strong>Common</strong>: an EIP.</li>
         * <li><strong>Anycast</strong>: an Anycast EIP.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the regions in which ALB supports Anycast EIPs, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The private IPv4 address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone. You can specify at most 10 zones. If the region supports two or more zones, specify at least two zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-sersdf****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the cluster. You can specify at most 10 zones. If the region supports two or more zones, specify at least two zones. You can call the <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> operation to query the most recent zone list.</p>
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
