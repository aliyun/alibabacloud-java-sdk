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

    /**
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <br>
     * <p>*   default: does not associate the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool if the available resources of the original dedicated host are insufficient.</p>
     * <p>*   host: associates the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot start.</p>
     * <br>
     * <p>Default value: default.</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>>  This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("Arn")
    public java.util.List<CreateInstanceRequestArn> arn;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only if `InstanceChargeType` is set to `PrePaid`. Valid values:</p>
     * <br>
     * <p>*   true: enables auto-renewal.</p>
     * <p>*   false: does not enable auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period of the instance. This parameter is required if AutoRenew is set to true.</p>
     * <br>
     * <p>Valid values if PeriodUnit is set to Month: 1, 2, 3, 6, and 12.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.**** For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster in which to create the instance.</p>
     * <br>
     * <p>>  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <br>
     * <p>*   Standard: standard mode. For more information, see the "Standard mode" section in the [Overview of burstable instances](~~59977~~) topic.</p>
     * <p>*   Unlimited: unlimited mode. For more information, see the "Unlimited mode" section in the [Burstable instances](~~59977~~) topic.</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the dedicated host on which to create the instance.</p>
     * <br>
     * <p>You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the list of dedicated host IDs</p>
     * <br>
     * <p>If you specify `DedicatedHostId`, the `SpotStrategy` and `SpotPriceLimit` parameters are ignored. This is because preemptible instances cannot be created on dedicated hosts.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>Specifies whether to enable release protection for the instance. This parameter indicates whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance.</p>
     * <br>
     * <p>*   true: enables release protection.</p>
     * <p>*   false (default): disables release protection.</p>
     * <br>
     * <p>>  This parameter is applicable only to pay-as-you-go instances. It can protect instances against manual releases, but not against automatic releases.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The number of the deployment set group to which to deploy the instance. If the deployment set specified by the DeploymentSetId parameter uses the high availability group strategy (AvailabilityGroup), you can use the DeploymentSetGroupNo parameter to specify a deployment set group in the deployment set. Valid values: 1 to 7.</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    /**
     * <p>The ID of the deployment set to which to deploy the instance.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and unavailable ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   false (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The hostname of the instance.</p>
     * <br>
     * <p>*   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
     * <p>*   For a Windows instance, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</p>
     * <p>*   For an instance that runs another type of operating system such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the high performance computing (HPC) cluster to which to assign the instance.</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <br>
     * <p>*   enabled</p>
     * <p>*   disabled</p>
     * <br>
     * <p>Default value: enabled.</p>
     * <br>
     * <p>>  For more information about instance metadata, see [Overview of instance metadata](~~49122~~).</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>>  This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <br>
     * <p>*   optional: does not forcefully use the security hardening mode (IMDSv2).</p>
     * <p>*   required: forcefully uses the security hardening mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.</p>
     * <br>
     * <p>Default value: optional.</p>
     * <br>
     * <p>>  For more information about the modes of accessing instance metadata, see [Access mode of instance metadata](~~150575~~).</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available custom image from the specified image family to create the instance.</p>
     * <br>
     * <p>*   ImageFamily must be empty if `ImageId` is specified.</p>
     * <p>*   ImageFamily can be specified if `ImageId` is not specified.</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image to use to create the instance. To use an Alibaba Cloud Marketplace image, you can view the `image ID` on the product page of the Alibaba Cloud Marketplace image. This parameter is required if you do not specify `ImageFamily` to obtain the latest available custom image from the specified image family.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The internal IP address to assign to the instance.</p>
     */
    @NameInMap("InnerIpAddress")
    public String innerIpAddress;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription. If you set this parameter to PrePaid, make sure that you have sufficient balance or credit in your account. Otherwise, an `InvalidPayMethod` error is returned.</p>
     * <p>*   PostPaid (default): pay-as-you-go.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). If you do not specify this parameter, the instance ID is used as the instance name by default.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     * <br>
     * <p>*   Instance type selection: See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of instance types, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.</p>
     * <p>*   Query of available resources: Call the [DescribeAvailableResource](~~66186~~) operation to query resources available in a specific region or zone.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for network usage. Default value: PayByTraffic. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: pay-by-bandwidth</p>
     * <p>*   PayByTraffic (default): pay-by-traffic</p>
     * <br>
     * <p>>  When the **pay-by-traffic** billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may be limited. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
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
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <br>
     * <p>*   none: The instance is not I/O optimized.</p>
     * <p>*   optimized: The ECS instance is I/O optimized.</p>
     * <br>
     * <p>For retired instance types, the default value is none. For more information, see [Retired instance types](~~55263~~).</p>
     * <br>
     * <p>For other instance types, the default value is optimized.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The name of the key pair.</p>
     * <br>
     * <p>>  For Windows instances, this parameter is ignored. This parameter is empty by default. The `Password` parameter takes effect even if the KeyPairName parameter is specified.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>>  This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("NodeControllerId")
    public String nodeControllerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <br>
     * <p>    ( ) ` ~ ! @ # $ % ^ & * - _ + = | { } [ ] : ; \" < > , . ? /</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   For security reasons, we recommend that you use HTTPS to send requests if the Password parameter is specified.</p>
     * <p>*   Passwords of Windows instances cannot start with a forward slash (/).</p>
     * <p>*   Passwords cannot be set for instances that run specific types of operating systems such as Others Linux and Fedora CoreOS. For these instances, only key pairs can be set.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password preset in the image. When you use this parameter, leave the Password parameter empty and make sure that the selected image has a password preset.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription period of the instance. The unit is specified by `PeriodUnit`. This parameter is valid and required only when `InstanceChargeType` is set to `PrePaid`. If `DedicatedHostId` is specified, the value of Period must not exceed the subscription period of the specified dedicated host. Valid values:</p>
     * <br>
     * <p>Valid values if PeriodUnit is set to Month: 1, 2, 3, 6, and 12.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <br>
     * <p>Month</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private IP address to assign to the instance. The private IP address must be an available IP address in the CIDR block of the specified vSwitch.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the region in which to create the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the instance.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable security hardening. Valid values:</p>
     * <br>
     * <p>*   Active: enables security hardening. This value applies only to public images.</p>
     * <p>*   Deactive: disables security hardening. This value is applicable to all images.</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which to assign the instance.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <p>*   0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <br>
     * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify an appropriate protection period based on your business requirements.</p>
     * <br>
     * <p>>  This parameter takes effect only if the SpotStrategy parameter is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. The value can only be Terminate, which specifies that the instance is released.</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The maximum hourly price of the instance. The value is accurate to three decimal places. This parameter is valid only when `SpotStrategy` is set to `SpotWithPriceLimit`.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter is valid only if you set `InstanceChargeType` to `PostPaid`. Valid values:</p>
     * <br>
     * <p>*   NoSpot (default): The instance is created as a regular pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance for which you specify the maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The ID of the storage set.</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. Valid values: greater than or equal to 2.</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * <br>
     * <p>*   default: creates the instance on a non-dedicated host.</p>
     * <p>*   host: creates the instance on a dedicated host. If you do not specify `DedicatedHostId`, Alibaba Cloud selects a dedicated host for the instance.</p>
     * <br>
     * <p>Default value: default.</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>Specifies whether to use the system configurations for virtual machines. Alibaba Cloud provides the Network Time Protocol (NTP) and Key Management Service (KMS) system configurations for Windows and the NTP and Yellowdog Updater, Modified (YUM) system configurations for Linux.</p>
     */
    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    /**
     * <p>The user data of the instance. The user data must be encoded in Base64. The maximum size of raw data is 16 KB.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch to which to connect the instance. This parameter is required when you create an instance in a VPC. You can call the [DescribeVSwitches](~~35748~~) operation to query available vSwitches.</p>
     * <br>
     * <p>>  If `VSwitchId` is specified, the zone specified by `ZoneId` must be the zone where the specified vSwitch resides. You can also leave `ZoneId` empty. Then, the system selects the zone where the specified vSwitch resides.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual LAN (VLAN).</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <p>The ID of the zone in which to create the instance. You can call the [DescribeZones](~~25610~~) operation to query the zones in a specific region.</p>
     * <br>
     * <p>>  If `VSwitchId` is specified, the zone specified by `ZoneId` must be the zone where the specified vSwitch resides. You can also leave `ZoneId` empty. Then, the system selects the zone where the specified vSwitch resides.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
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
        /**
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
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
        /**
         * <p>The ID of the private pool. The ID of a private pool is the same as that of the elasticity assurance or capacity reservation for which the private pool is generated.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the private pool to use to start the instance. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool to start instances. Valid values:</p>
         * <br>
         * <p>*   Open: open private pool. The system selects a matching open private pool to start the instance. If no matching open private pools are found, resources in the public pool are used. When you set this parameter to Open, you can leave the `PrivatePoolOptions.Id` parameter empty.</p>
         * <p>*   Target: specified private pool. The system uses the capacity in a specified private pool to start the instance. If the specified private pool is unavailable, the instance cannot be started. If you set this parameter to Target, you must specify the `PrivatePoolOptions.Id` parameter.</p>
         * <p>*   None: no private pool. The capacity in private pools is not used.</p>
         * <br>
         * <p>Default value: none.</p>
         * <br>
         * <p>In the following scenarios, the PrivatePoolOptions.MatchCriteria parameter can be set only to `None` or left empty:</p>
         * <br>
         * <p>*   Create a preemptible instance.</p>
         * <p>*   Create an instance in the classic network.</p>
         * <p>*   Create an instance on a dedicated host.</p>
         */
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
        /**
         * <p>The category of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud_essd: ESSD. If SystemDisk.Category is set to this value, you can use `SystemDisk.PerformanceLevel` to specify the performance level of the disk.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud: basic disk.</p>
         * <br>
         * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other types of instances, the default value is cloud_efficiency.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
         * <br>
         * <p>This parameter is empty by default.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
         * <br>
         * <p>This parameter is empty by default.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The performance level of the ESSD that is used as the system disk. Default value: PL1. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>For information about ESSD performance levels, see [ESSDs](~~122389~~).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   Basic disks: 20 to 500.</p>
         * <p>*   Other disks: 20 to 2048.</p>
         * <br>
         * <p>The value of this parameter must be at least 20 and greater than or equal to the size of the image.</p>
         * <br>
         * <p>Default value: 40 or the size of the image, whichever is greater.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use disks in a dedicated block storage cluster as system disks when you create instances, you need to specify this parameter.</p>
         */
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
        /**
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>>  This parameter is in invitational preview and is not publicly available.</p>
         */
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
        /**
         * <p>The category of data disk N. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk</p>
         * <br>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release data disk N when the instance is released.</p>
         * <br>
         * <p>*   true: releases data disk N.</p>
         * <p>*   false: does not release data disk N.</p>
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
         * <p>The mount point of data disk N.</p>
         * <br>
         * <p>>  This parameter is applicable to scenarios in which a full image is used to create instances. A full image is an image that contains an operating system, application software, and business data. For these scenarios, you can set this parameter to the mount point of data disk N contained in the full image and modify the `DataDisk.N.Size` and `DataDisk.N.Category` parameters to change the category and size of data disk N created based on the image.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of data disk N. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>>  This parameter is not publicly available.</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt data disk N.</p>
         * <br>
         * <p>*   true: encrypts data disk N.</p>
         * <p>*   false: does not encrypt data disk N.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key to use for data disk N.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD to use as data disk N. The value of N must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>For more information about ESSD performance levels, see [ESSDs](~~122389~~).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   Valid values if DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values if DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values if DataDisk.N.Category is set to cloud_essd: vary based on the `DataDisk.N.PerformanceLevel` value.</p>
         * <br>
         * <p>    *   Valid values if DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.</p>
         * <p>    *   Valid values if DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</p>
         * <p>    *   Valid values if DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</p>
         * <p>    *   Valid values if DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.</p>
         * <br>
         * <p>*   Valid values if DataDisk.N.Category is set to cloud: 5 to 2000.</p>
         * <br>
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by `SnapshotId`.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.</p>
         * <br>
         * <p>*   If `DataDisk.N.SnapshotId` is specified, `DataDisk.N.Size` is ignored. The data disk is created based on the size of the specified snapshot.</p>
         * <p>*   Use snapshots created on or after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as data disk N when you create the instance, you must specify this parameter.</p>
         */
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
        /**
         * <p>The key of tag N to add to the instance, disks, and primary elastic network interface (ENI). Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the instance, disks, and primary ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.</p>
         */
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
