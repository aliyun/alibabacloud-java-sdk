// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateLaunchTemplateRequestSystemDisk systemDisk;

    /**
     * <p>The automatic release time of the instance. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>*   If the value of `ss` is not `00`, the time is automatically rounded down to the nearest minute based on the value of `mm`.</p>
     * <p>*   The specified time must be at least 30 minutes later than the current time.</p>
     * <p>*   The specified time can be at most three years later than the current time.</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <br>
     * <p>*   Standard: the standard mode. For more information, see the "Standard mode" section in [Overview of burstable instances](https://help.aliyun.com/document_detail/59977.html).</p>
     * <p>*   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Overview of burstable instances](https://help.aliyun.com/document_detail/59977.html).</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateRequestDataDisk> dataDisk;

    /**
     * <p>Specifies whether to enable release protection for the instance. This parameter specifies whether you can use the ECS console or call the [DeleteInstance](https://help.aliyun.com/document_detail/25507.html) operation to release the instance. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>>  This parameter is applicable only to pay-as-you-go instances. The release protection feature can protect instances against manual releases, but not against automatic releases.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The ID of the deployment set to which to deploy the instance.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the operating system configuration of the instance.</p>
     * <br>
     * <p>> This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.</p>
     */
    @NameInMap("EnableVmOsConfig")
    public Boolean enableVmOsConfig;

    /**
     * <p>The instance hostname.</p>
     * <br>
     * <p>*   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
     * <p>*   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</p>
     * <p>*   For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image to use to create the instance. You can call the [DescribeImages](https://help.aliyun.com/document_detail/25534.html) operation to query available images.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The source of the image. Valid values:</p>
     * <br>
     * <p>*   system: public image provided by Alibaba Cloud.</p>
     * <p>*   self: custom image that you created.</p>
     * <p>*   others: shared image from another Alibaba Cloud account.</p>
     * <p>*   marketplace:[Alibaba Cloud Marketplace](https://marketplace.alibabacloud.com/) image. If Alibaba Cloud Marketplace images are available, you can use the images without the need to subscribe to the images. Take note of the billing details of Alibaba Cloud Marketplace images.</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription. If you set this parameter to PrePaid, make sure that your account has sufficient credits.Otherwise, an `InvalidPayMethod` error is returned.</p>
     * <p>*   PostPaid: pay-as-you-go.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type of the instance. For more information, see [Instance families](https://help.aliyun.com/document_detail/25378.html). Alternatively, you can call the [DescribeInstanceTypes](https://help.aliyun.com/document_detail/25620.html) operation to query the most recent instance type list.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: pay-by-bandwidth</p>
     * <p>*   PayByTraffic: pay-by-traffic</p>
     * <br>
     * <p>> When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidths may be limited. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.</p>
     * <p>*   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the `InternetMaxBandwidthOut` value and the default value is the `InternetMaxBandwidthOut` value.</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
     * <br>
     * <p>*   none: creates a non-I/O optimized instance.</p>
     * <p>*   optimized: creates an I/O optimized instance.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the primary elastic network interface (ENI). Valid values: 1 to 10.</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair. This parameter is empty by default.</p>
     * <br>
     * <p>*   For Windows instances, this parameter is ignored The `Password` parameter takes effect even if the KeyPairName parameter is specified.</p>
     * <p>*   For Linux instances, the password-based logon method is disabled by default.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The name of the launch template. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The information of the ENIs.</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateRequestNetworkInterface> networkInterface;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   classic: classic network</p>
     * <p>*   vpc: VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to use the preset password of the image.</p>
     * <br>
     * <p>> If you set the PasswordInherit parameter to true, make sure that you leave the Password parameter empty and the selected image has a preset password.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription duration of the instance. Unit: months. This parameter is valid and required only when `InstanceChargeType` is set to `PrePaid`. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The private IP address to assign to the instance.</p>
     * <br>
     * <p>To assign a private IP address to an instance that resides in a VPC, make sure that the IP address is an idle IP address within the CIDR block of the vSwitch specified by the `VSwitchId` parameter.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](https://help.aliyun.com/document_detail/28713.html) operation provided by RAM to query the instance RAM roles that you created.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the region in which to create the launch template. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and elastic network interface (ENI).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable security hardening for the operating system. Valid values:</p>
     * <br>
     * <p>*   Active: enables security hardening. This value is applicable only to public images.</p>
     * <p>*   Deactive: does not enable security hardening. This value is applicable to all images.</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which to assign the instance. Instances in the same security group can communicate with each other. A security group can contain up to 1,000 instances.</p>
     * <br>
     * <p>> You cannot specify both the `SecurityGroupId` and `SecurityGroupIds.N` parameters.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security groups to which to assign the instance. The valid values of N are based on the maximum number of security groups to which the instance can belong. For more information, see the "Security group limits" section in [Limits](https://help.aliyun.com/document_detail/25412.html).</p>
     * <br>
     * <p>> You cannot specify both the `SecurityGroupId` and `SecurityGroupIds.N` parameters.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <p>*   0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <br>
     * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit or SpotAsPriceGo.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The maximum hourly price of the instance. The value is accurate to three decimal places. This parameter is valid only when the `SpotStrategy` parameter is set to `SpotWithPriceLimit`.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PostPaid`. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is a regular pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The tags of the launch template.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateRequestTag> tag;

    /**
     * <p>The ID of the resource group to which the launch template belongs.</p>
     */
    @NameInMap("TemplateResourceGroupId")
    public String templateResourceGroupId;

    /**
     * <p>The tags to add to the launch template.</p>
     */
    @NameInMap("TemplateTag")
    public java.util.List<CreateLaunchTemplateRequestTemplateTag> templateTag;

    /**
     * <p>The user data of the instance. The user data must be encoded in Base64. The maximum size of raw data is 16 KB.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch to which to connect the instance. This parameter is required if you specify the VpcId parameter.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone in which to create the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateLaunchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateRequest self = new CreateLaunchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateRequest setSystemDisk(CreateLaunchTemplateRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateLaunchTemplateRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateLaunchTemplateRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public CreateLaunchTemplateRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateLaunchTemplateRequest setDataDisk(java.util.List<CreateLaunchTemplateRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateLaunchTemplateRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateLaunchTemplateRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateLaunchTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLaunchTemplateRequest setEnableVmOsConfig(Boolean enableVmOsConfig) {
        this.enableVmOsConfig = enableVmOsConfig;
        return this;
    }
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    public CreateLaunchTemplateRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateLaunchTemplateRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateLaunchTemplateRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateLaunchTemplateRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateLaunchTemplateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateLaunchTemplateRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateLaunchTemplateRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLaunchTemplateRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateLaunchTemplateRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateLaunchTemplateRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateLaunchTemplateRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateLaunchTemplateRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateLaunchTemplateRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public CreateLaunchTemplateRequest setNetworkInterface(java.util.List<CreateLaunchTemplateRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public CreateLaunchTemplateRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLaunchTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLaunchTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLaunchTemplateRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateLaunchTemplateRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateLaunchTemplateRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateLaunchTemplateRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateLaunchTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLaunchTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLaunchTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLaunchTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLaunchTemplateRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateLaunchTemplateRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateLaunchTemplateRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateLaunchTemplateRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateLaunchTemplateRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateLaunchTemplateRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateLaunchTemplateRequest setTag(java.util.List<CreateLaunchTemplateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestTag> getTag() {
        return this.tag;
    }

    public CreateLaunchTemplateRequest setTemplateResourceGroupId(String templateResourceGroupId) {
        this.templateResourceGroupId = templateResourceGroupId;
        return this;
    }
    public String getTemplateResourceGroupId() {
        return this.templateResourceGroupId;
    }

    public CreateLaunchTemplateRequest setTemplateTag(java.util.List<CreateLaunchTemplateRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public CreateLaunchTemplateRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateLaunchTemplateRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLaunchTemplateRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateLaunchTemplateRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLaunchTemplateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateLaunchTemplateRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD). You can use `SystemDisk.PerformanceLevel` to set the performance level of the ESSD to use as the system disk.</p>
         * <p>*   cloud_auto: ESSD AutoPL disk.</p>
         * <p>*   cloud_essd_entry: ESSD Entry disk.</p>
         * <br>
         * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other types of instances, the default value is cloud_efficiency.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the system disk when the instance is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         * <br>
         * <p>>  If you create an instance in Hong Kong Zone D or Singapore Zone A, you cannot encrypt the system disk.</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("Iops")
        public Integer iops;

        /**
         * <p>The performance level of the ESSD to use as the system disk. Default value: PL0. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>For more information about ESSD performance levels, see [ESSDs](https://help.aliyun.com/document_detail/122389.html).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}</p>
         * <br>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}</p>
         * <br>
         * <p>> This parameter is available only if you set the SystemDisk.Category parameter to cloud_auto. For more information, see [ESSD AutoPL disks](https://help.aliyun.com/document_detail/368372.html) and [Modify the performance configurations of an ESSD AutoPL disk](https://help.aliyun.com/document_detail/413275.html).</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   Valid values if you set SystemDisk.Category to cloud: 20 to 500.</p>
         * <p>*   Valid values if you set SystemDisk.Category to other disk categories: 20 to 2048.</p>
         * <br>
         * <p>The value of this parameter must be at least 20 and greater than or equal to the size of the image.</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateLaunchTemplateRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestSystemDisk self = new CreateLaunchTemplateRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateRequestSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateRequestSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateRequestSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public CreateLaunchTemplateRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateLaunchTemplateRequestDataDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy to apply to data disk N.</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for data disk N. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of data disk N. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud_auto: ESSD AutoPL disk</p>
         * <p>*   cloud_essd_entry: ESSD Entry disk</p>
         * <br>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release data disk N when the instance is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>>  This parameter will be removed in the future. We recommend that you do not use this parameter to ensure future compatibility.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of data disk N. The name must be 2 to 128 characters in length The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt data disk N.</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The performance level of the ESSD to use as data disk N. The value of N must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>For information about ESSD performance levels, see [ESSDs](https://help.aliyun.com/document_detail/122389.html).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <br>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <br>
         * <p>>  This parameter is available only if you set DataDisk.N.Category to cloud_auto. For more information, see [ESSD AutoPL disks](https://help.aliyun.com/document_detail/368372.html) and [Modify the performance configurations of an ESSD AutoPL disk](https://help.aliyun.com/document_detail/413275.html).</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   Valid values if you set DataDisk.N.Category to cloud: 5 to 2000.</p>
         * <br>
         * <p>*   Valid values if you set DataDisk.N.Category to cloud_efficiency: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values if you set DataDisk.N.Category to cloud_ssd: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values if you set DataDisk.N.Category to cloud_essd: vary based on the value of `DataDisk.N.PerformanceLevel`.</p>
         * <br>
         * <p>    *   Valid values if you set DataDisk.N.PerformanceLevel to PL0: 1 to 32768.</p>
         * <p>    *   Valid values if you set DataDisk.N.PerformanceLevel to PL1: 20 to 32768.</p>
         * <p>    *   Valid values if you set DataDisk.N.PerformanceLevel to PL2: 461 to 32768.</p>
         * <p>    *   Valid values if you set DataDisk.N.PerformanceLevel to PL3: 1261 to 32768.</p>
         * <br>
         * <p>*   Valid values if you set DataDisk.N.Category to cloud_auto: 1 to 32768.</p>
         * <br>
         * <p>*   Valid values if you set DataDisk.N.Category to cloud_essd_entry: 10 to 32768.</p>
         * <br>
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by `DataDisk.N.SnapshotId`.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16. If you specify `DataDisk.N.SnapshotId`, `DataDisk.N.Size` is ignored. The data disk is created with the size of the specified snapshot.</p>
         * <br>
         * <p>>  Use snapshots created on or after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateLaunchTemplateRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestDataDisk self = new CreateLaunchTemplateRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateRequestDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateLaunchTemplateRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateLaunchTemplateRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateLaunchTemplateRequestNetworkInterface extends TeaModel {
        /**
         * <p>The description of the secondary ENI. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`. The value of N in `NetworkInterface.N` cannot be greater than 1.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of ENI N. Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Primary</p>
         * <p>*   Secondary</p>
         * <br>
         * <p>Default value: Secondary.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of ENI N.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.</p>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Primary`, you do not need to set this parameter.</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the primary ENI. Valid values:</p>
         * <br>
         * <p>*   Standard: uses the TCP communication mode.</p>
         * <p>*   HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The primary IP address to assign to ENI N.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   Valid values of N: 1 and 2.</p>
         * <br>
         * <p>    *   If the value of N is 1, you can configure a primary or secondary ENI. If this parameter is specified, `Amount` is set to a numeric value greater than 1, and NetworkInterface.N.InstanceType is set to Primary, the specified number of instances are created and consecutive primary IP addresses starting from the specified one are assigned to the instances. In this case, you cannot attach secondary ENIs to the instances.</p>
         * <p>    *   If the value of N is 2, you can configure a primary ENI and a secondary ENI. If this parameter is specified, `Amount` is set to a numeric value greater than 1, and NetworkInterface.N.InstanceType is set to Primary, you cannot set `NetworkInterface.2.InstanceType` to Secondary to attach a secondary ENI.</p>
         * <br>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Primary`, this parameter is equivalent to `PrivateIpAddress`. You cannot specify both this parameter and `PrivateIpAddress`.</p>
         * <br>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, the specified primary IP address is assigned to the secondary ENI. The default value is an IP address that is randomly selected from within the CIDR block of the vSwitch to which to connect the secondary ENI.</p>
         * <br>
         * <p>>  You can attach only a single secondary ENI when you create an instance. After the instance is created, you can call the [CreateNetworkInterface](https://help.aliyun.com/document_detail/58504.html) and [AttachNetworkInterface](https://help.aliyun.com/document_detail/58515.html) operations to attach more secondary ENIs.</p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The ID of the security group to which to assign ENI N.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.</p>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter. In this case, this parameter is equivalent to `SecurityGroupId`. You cannot specify `SecurityGroupId`, `SecurityGroupIds.N`, or `NetworkInterface.N.SecurityGroupIds.N`.</p>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the security group to which the instance belongs.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of security group N to which to assign ENI N.</p>
         * <br>
         * <p>*   Valid values of the first N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.</p>
         * <p>*   The second N indicates that one or more security group IDs can be specified. The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the [Security group limits](~~25412#SecurityGroupQuota1~~) section of the "Limits" topic.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must specify this parameter or `NetworkInterface.N.SecurityGroupId`. In this case, this parameter is equivalent to `SecurityGroupIds.N`. You cannot specify `SecurityGroupId`, `SecurityGroupIds.N`, or `NetworkInterface.N.SecurityGroupId`.</p>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the security group to which the instance belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the vSwitch to which to connect ENI N.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.</p>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter. In this case, this parameter is equivalent to `VSwitchId`. You cannot specify both NetworkInterface.N.VSwitchId and `VSwitchId`.</p>
         * <p>*   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the VSwitchId value.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static CreateLaunchTemplateRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestNetworkInterface self = new CreateLaunchTemplateRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateRequestNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateLaunchTemplateRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public CreateLaunchTemplateRequestNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public CreateLaunchTemplateRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public CreateLaunchTemplateRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateLaunchTemplateRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateLaunchTemplateRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class CreateLaunchTemplateRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the instance, EBS device, and ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the instance, EBS device, and ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLaunchTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestTag self = new CreateLaunchTemplateRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLaunchTemplateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLaunchTemplateRequestTemplateTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the launch template. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the launch template. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLaunchTemplateRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestTemplateTag self = new CreateLaunchTemplateRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLaunchTemplateRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
