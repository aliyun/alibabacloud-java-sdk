// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The mode in which IP addresses are allocated. Valid values:</p>
     * <ul>
     * <li><strong>Fixed</strong>: The ALB instance uses a static IP address.</li>
     * <li><strong>Dynamic</strong>: dynamically allocates an IP address to each zone of the ALB instance.</li>
     * </ul>
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
     * <p>The configuration of the configuration read-only mode.</p>
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
     * <p>The zones and the vSwitches in the zones. You must specify at least two zones.</p>
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
         * <p>The billing method of the ALB instance.</p>
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
         * <p>The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
         * <blockquote>
         * <p>This parameter takes effect only if <code>Status</code> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: disables the configuration read-only mode. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. In this case, you can specify ModificationProtectionReason.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
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
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The private IPv4 address. You must add at least two zones. You can add a maximum of 10 zones.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an ALB instance. You can specify up to 10 zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-sersdf****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the ALB instance. You can specify up to 10 zones for an ALB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> operation to query the most recent zone list.</p>
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
