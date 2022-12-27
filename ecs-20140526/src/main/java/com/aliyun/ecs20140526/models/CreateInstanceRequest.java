// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("HibernationOptions")
    public CreateInstanceRequestHibernationOptions hibernationOptions;

    @NameInMap("PrivatePoolOptions")
    public CreateInstanceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    public CreateInstanceRequestSystemDisk systemDisk;

    // Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:
    // 
    // *   default: does not associate the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool if the available resources of the original dedicated host are insufficient.
    // *   host: associates the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot start.
    // 
    // Default value: default.
    @NameInMap("Affinity")
    public String affinity;

    // > This parameter is in invitational preview and is unavailable.
    @NameInMap("Arn")
    public java.util.List<CreateInstanceRequestArn> arn;

    // Specifies whether to enable auto-renewal for the instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PrePaid`. Default value: false. Valid values:
    // 
    // * true: enables auto-renewal.
    // * false: does not enable auto-renewal.
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // The auto-renewal cycle of the instance. This parameter is required when AutoRenew is set to true.
    // 
    // Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, and 12
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The ID of the cluster in which to create the instance.
    // 
    // > This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
    @NameInMap("ClusterId")
    public String clusterId;

    // The performance mode of the burstable instance. Valid values:
    // 
    // *   Standard: the standard mode. For more information, see the "Standard mode" section in [Burstable instances](~~59977~~).
    // *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Burstable instances](~~59977~~).
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    // The list of data disks.
    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    // The ID of the dedicated host on which to create the instance.
    // 
    // You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the list of dedicated host IDs.
    // 
    // If the `DedicatedHostId` parameter is specified, the `SpotStrategy` and `SpotPriceLimit` parameters are ignored. This is because preemptible instances cannot be created on dedicated hosts.
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    // Specifies whether to enable release protection for the instance. This parameter determines whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance. Default value: false. Valid values:
    // 
    // *   true: enables release protection.
    // *   false: disables release protection.
    // 
    // >  This parameter is applicable only to pay-as-you-go instances. It can protect instances against manual releases, but not against automatic releases.
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    // The number of the deployment set group to which to deploy the instance. If the deployment set specified by the DeploymentSetId parameter uses the high availability group strategy (AvailabilityGroup), you can use the DeploymentSetGroupNo parameter to specify a deployment set group in the deployment set. Valid values: 1 to 7.
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    // The ID of the deployment set to which to deploy the instance.
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    // The description of the instance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    // 
    // This parameter is empty by default.
    @NameInMap("Description")
    public String description;

    // Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:
    // 
    // *   true: The validity of the request is checked but the request is not made. Check items include whether required parameters are specified, the request format, service limits, and available ECS resources. If the check fails, the corresponding error code is returned. If the check succeeds, the `DryRunOperation` error code is returned.
    // *   false: The validity of the request is checked, and the request is made if the check succeeds.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The hostname of the instance.
    // 
    // * The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).
    // * For a Windows instance, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).
    // * For an instance that runs another type of operating system such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
    @NameInMap("HostName")
    public String hostName;

    // The ID of the HPC cluster to which to assign the instance.
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    // Specifies whether to enable the access channel for instance metadata. Valid values:
    // 
    // *   enabled: enables the access channel for instance metadata.
    // *   disabled: disables the access channel for instance metadata.
    // 
    // Default value: enabled.
    // 
    // >  For more information about instance metadata, see [Overview of ECS instance metadata](~~49122~~).
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    // >  This parameter is currently in invitational preview and unavailable for general users.
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    // Specifies whether to forcefully use the security-enhanced mode (IMDSv2) to access instance metadata. Valid values:
    // 
    // *   optional: does not forcibly use the security-enhanced mode (IMDSv2).
    // *   required: forcefully uses the security-enhanced mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.
    // 
    // Default value: optional.
    // 
    // >  For more information about modes of accessing instance metadata, see [Access mode of instance metadata](~~150575~~).
    @NameInMap("HttpTokens")
    public String httpTokens;

    // The name of the image family. You can set this parameter to obtain the latest available custom image from the specified image family to create the instance.
    // 
    // * ImageFamily must be empty if `ImageId` is specified.
    // * ImageFamily can be specified if `ImageId` is not specified.
    @NameInMap("ImageFamily")
    public String imageFamily;

    // The ID of the image to use to create the instance. To use an Alibaba Cloud Marketplace image, you can view the `image ID` on the product page of the Alibaba Cloud Marketplace image. This parameter is required if you do not specify the `ImageFamily` parameter to obtain the latest available custom image from the specified image family.
    @NameInMap("ImageId")
    public String imageId;

    // The internal IP address to assign to the instance.
    @NameInMap("InnerIpAddress")
    public String innerIpAddress;

    // The billing method of the instance. Default value: PostPaid. Valid values:
    // 
    // * PrePaid: subscription. If you set this parameter to PrePaid, make sure that you have sufficient balance or credit in your account. Otherwise, an `InvalidPayMethod` error is returned.
    // * PostPaid: pay-as-you-go.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). If you do not specify this parameter, the instance ID is used as the instance name by default.
    @NameInMap("InstanceName")
    public String instanceName;

    // The instance type.
    // 
    // * Select an instance type. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of an instance type, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
    // * Query available resources. You can call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
    @NameInMap("InstanceType")
    public String instanceType;

    // The billing method for network usage. Default value: PayByTraffic. Valid values:
    // 
    // * PayByBandwidth: pay-by-bandwidth
    // * PayByTraffic: pay-by-traffic
    // 
    // > When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
    // 
    // * When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.
    // * When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the `InternetMaxBandwidthOut` value and the default value is the `InternetMaxBandwidthOut` value.
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
    // 
    // Default value: 0.
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    // Specifies whether the instance is I/O optimized. Valid values:
    // 
    // *   none: The instance is not I/O optimized.
    // *   optimized: The instance is I/O optimized.
    // 
    // For retired instance types, the default value is none. For more information, see [Retired instance types](~~55263~~).
    // 
    // For other instance types, the default value is optimized.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    // The name of the key pair.
    // 
    // >  For Windows instances, this parameter is ignored. This parameter is empty by default. The `Password` parameter takes effect even if the KeyPairName parameter is specified.
    @NameInMap("KeyPairName")
    public String keyPairName;

    // > This parameter is in invitational preview and is unavailable.
    @NameInMap("NodeControllerId")
    public String nodeControllerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:
    // 
    // ```plain
    // ( ) ` ~ ! @ # $ % ^ & * - _ + = | { } [ ] : ; \" < > , . ? /
    // ```
    // 
    // Take note of the following items:
    // 
    // * For security reasons, we recommend that you use HTTPS to send requests if the Password parameter is specified.
    // * Passwords of Windows instances cannot start with a forward slash (/).
    // * Passwords cannot be set for instances that run some types of operating systems such as Others Linux and Fedora CoreOS. For these instances, only key pairs can be set.
    @NameInMap("Password")
    public String password;

    // Specifies whether to use the password preset in the image. When you use this parameter, leave Password empty and make sure that the selected image has a password preset.
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    // The subscription period of the instance. The unit is specified by the `PeriodUnit` parameter. This parameter is valid and required only when `InstanceChargeType` is set to `PrePaid`. If the `DedicatedHostId` parameter is specified, the value of Period must not exceed the subscription period of the specified dedicated host. Valid values:
    // 
    // Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, and 12
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription period. Valid values:
    // 
    // Month
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The private IP address to assign to the instance. The private IP address must be an available IP address within the CIDR block of the specified vSwitch.
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    // The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created.
    @NameInMap("RamRoleName")
    public String ramRoleName;

    // The ID of the region in which to create the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which to assign the instance.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // Specifies whether to enable security hardening. Valid values:
    // 
    // *   Active: enables security hardening. This value is applicable only to public images.
    // *   Deactive: does not enable security hardening. This value is applicable to all images.
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    // The ID of the security group to which to assign the instance. Instances in the same security group can communicate with each other.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
    // 
    // *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
    // *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
    // 
    // Default value: 1.
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    // The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which specifies to release the instance.
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    // The maximum hourly price of the instance. The value is accurate to three decimal places. This parameter is valid only when the `SpotStrategy` parameter is set to `SpotWithPriceLimit`.
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    // The bidding policy for the pay-as-you-go instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PostPaid`. Default value: NoSpot. Valid values:
    // 
    // *   NoSpot: The instance is created as a regular pay-as-you-go instance.
    // *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
    // *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    // The ID of the storage set.
    @NameInMap("StorageSetId")
    public String storageSetId;

    // The maximum number of partitions in the storage set. Valid values: greater than or equal to 2.
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    // Specifies whether to create the instance on a dedicated host. Valid values:
    // 
    // *   default: creates the instance on a non-dedicated host.
    // *   host: creates the instance on a dedicated host. If you do not specify the `DedicatedHostId` parameter, Alibaba Cloud selects a dedicated host for the instance.
    // 
    // Default value: default.
    @NameInMap("Tenancy")
    public String tenancy;

    // Specifies whether to use the system configurations for virtual machines provided by Alibaba Cloud (Windows: NTP and KMS. Linux: NTP and YUM).
    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    // The user data of the instance. The user data must be encoded in Base64. The maximum size of raw data is 16 KB.
    @NameInMap("UserData")
    public String userData;

    // The ID of the vSwitch to which to connect the instance. This parameter is required when you create an instance in a VPC. You can call the [DescribeVSwitches](~~35748~~) operation to query available vSwitches.
    // 
    // >  If the `VSwitchId` parameter is specified, the zone specified by the `ZoneId` parameter must be the zone where the specified vSwitch is located. You can also leave the `ZoneId` parameter empty. Then, the system selects the zone where the specified vSwitch is located.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the virtual LAN (VLAN).
    @NameInMap("VlanId")
    public String vlanId;

    // The ID of the zone in which to create the instance. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    // 
    // >  If the `VSwitchId` parameter is specified, the zone specified by the `ZoneId` parameter must be the zone where the specified vSwitch is located. You can also leave the `ZoneId` parameter empty. Then, the system selects the zone where the specified vSwitch is located.
    // 
    // This parameter is empty by default.
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setHibernationOptions(CreateInstanceRequestHibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public CreateInstanceRequestHibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public CreateInstanceRequest setPrivatePoolOptions(CreateInstanceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateInstanceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateInstanceRequest setSystemDisk(CreateInstanceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateInstanceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateInstanceRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public CreateInstanceRequest setArn(java.util.List<CreateInstanceRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CreateInstanceRequestArn> getArn() {
        return this.arn;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInstanceRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateInstanceRequest setDataDisk(java.util.List<CreateInstanceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateInstanceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateInstanceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public CreateInstanceRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateInstanceRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public CreateInstanceRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateInstanceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateInstanceRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateInstanceRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateInstanceRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public CreateInstanceRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateInstanceRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setInnerIpAddress(String innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public String getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public CreateInstanceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateInstanceRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateInstanceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateInstanceRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateInstanceRequest setNodeControllerId(String nodeControllerId) {
        this.nodeControllerId = nodeControllerId;
        return this;
    }
    public String getNodeControllerId() {
        return this.nodeControllerId;
    }

    public CreateInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateInstanceRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateInstanceRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateInstanceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateInstanceRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateInstanceRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public CreateInstanceRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateInstanceRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateInstanceRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateInstanceRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateInstanceRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public CreateInstanceRequest setUseAdditionalService(Boolean useAdditionalService) {
        this.useAdditionalService = useAdditionalService;
        return this;
    }
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    public CreateInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateInstanceRequestHibernationOptions extends TeaModel {
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("Configured")
        public Boolean configured;

        public static CreateInstanceRequestHibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestHibernationOptions self = new CreateInstanceRequestHibernationOptions();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestHibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

    }

    public static class CreateInstanceRequestPrivatePoolOptions extends TeaModel {
        // The ID of the private pool to use to create the instance. The ID of a private pool is the same as that of the elasticity assurance or capacity reservation for which the private pool is generated.
        @NameInMap("Id")
        public String id;

        // The type of the private pool to use to create the instance. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool when you create an instance. Valid values:
        // 
        // * Open: open private pool. The system selects a matching open private pool to create the instance. If no matching open private pools are found, resources in the public pool are used. When you set this parameter to Open, you can leave the `PrivatePoolOptions.Id` parameter empty.
        // * Target: specified private pool. The system uses the capacity in a specified private pool to create the instance. If the specified private pool is unavailable, the instance cannot be created. If you set this parameter to Target, you must specify the `PrivatePoolOptions.Id` parameter.
        // * None: no private pool. The capacity in private pools is not used.
        // 
        // Default value: None.
        // 
        // In the following scenarios, the PrivatePoolOptions.MatchCriteria parameter can be set only to `None` or left empty:
        // 
        // * Create a preemptible instance.
        // * Create an instance in the classic network.
        // * Create an instance on a dedicated host.
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static CreateInstanceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestPrivatePoolOptions self = new CreateInstanceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateInstanceRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class CreateInstanceRequestSystemDisk extends TeaModel {
        // The category of the system disk. Valid values:
        // 
        // * cloud_essd: ESSD. When the parameter is set to this value, you can use the `SystemDisk.PerformanceLevel` parameter to specify the performance level of the disk.
        // * cloud_efficiency: ultra disk.
        // * cloud_ssd: standard SSD.
        // * cloud: basic disk.
        // 
        // For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.
        @NameInMap("Category")
        public String category;

        // The description of the system disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        // 
        // This parameter is empty by default.
        @NameInMap("Description")
        public String description;

        // The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
        // 
        // This parameter is empty by default.
        @NameInMap("DiskName")
        public String diskName;

        // The performance level of the ESSD to use as the system disk. Default value: PL1. Valid values:
        // 
        // * PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // * PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // * PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // * PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // The size of the system disk. Unit: GiB. Valid values: 20 to 500.
        // 
        // The value of this parameter must be at least 20 and greater than or equal to the size of the specified image.
        // 
        // Default value: 40 or the size of the image, whichever is greater.
        @NameInMap("Size")
        public Integer size;

        // The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as the system disk when you create the instance, you must specify this parameter. For more information about dedicated block storage clusters, see [What is Dedicated Block Storage Cluster?](~~208883~~)
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static CreateInstanceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestSystemDisk self = new CreateInstanceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateInstanceRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateInstanceRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateInstanceRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestSystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class CreateInstanceRequestArn extends TeaModel {
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("RoleType")
        public String roleType;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateInstanceRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestArn self = new CreateInstanceRequestArn();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateInstanceRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateInstanceRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateInstanceRequestDataDisk extends TeaModel {
        // The category of data disk N. Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: ESSD
        // *   cloud: basic disk
        // 
        // For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
        @NameInMap("Category")
        public String category;

        // Specifies whether to release data disk N when the instance is released.
        // 
        // Default value: true.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        @NameInMap("Description")
        public String description;

        // The mount point of data disk N.
        // 
        // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("Device")
        public String device;

        // The name of data disk N. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
        @NameInMap("DiskName")
        public String diskName;

        // The algorithm to use to encrypt data disk N.
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        // Specifies whether to encrypt data disk N.
        // 
        // Default value: false.
        @NameInMap("Encrypted")
        public Boolean encrypted;

        // The ID of the Key Management Service (KMS) key to use for data disk N.
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        // The performance level of the ESSD to use as data disk N. The N value must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Default value: PL1. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:
        // 
        // * Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
        // 
        // * Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
        // 
        // * Valid values when DataDisk.N.Category is set to cloud_essd: depend on the `DataDisk.N.PerformanceLevel` value.
        // 
        //     * Valid values when the DataDisk.N.PerformanceLevel parameter is set to PL0: 40 to 32768.
        //     * Valid values when the DataDisk.N.PerformanceLevel parameter is set to PL1: 20 to 32768.
        //     * Valid values when the DataDisk.N.PerformanceLevel parameter is set to PL2: 461 to 32768.
        //     * Valid values when the DataDisk.N.PerformanceLevel parameter is set to PL3: 1261 to 32768.
        // 
        // * Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.
        // 
        // The value of this parameter must be greater than or equal to the size of the snapshot specified by the `SnapshotId` parameter.
        @NameInMap("Size")
        public Integer size;

        // The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.
        // 
        // *   If the `DataDisk.N.SnapshotId` parameter is specified, the `DataDisk.N.Size` parameter is ignored and the data disk is created with the size of the specified snapshot.
        // *   Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.
        @NameInMap("SnapshotId")
        public String snapshotId;

        // The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as data disk N when you create the instance, you must specify this parameter.
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static CreateInstanceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDataDisk self = new CreateInstanceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateInstanceRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateInstanceRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateInstanceRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateInstanceRequestDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateInstanceRequestDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateInstanceRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateInstanceRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateInstanceRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public CreateInstanceRequestDataDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class CreateInstanceRequestTag extends TeaModel {
        // The key of tag N to add to the instance, disks, and primary elastic network interface (ENI). Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N to add to the instance, disks, and primary ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with `acs:` or contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
