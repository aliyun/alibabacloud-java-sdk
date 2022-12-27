// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    @NameInMap("CpuOptions")
    public RunInstancesRequestCpuOptions cpuOptions;

    @NameInMap("HibernationOptions")
    public RunInstancesRequestHibernationOptions hibernationOptions;

    @NameInMap("PrivatePoolOptions")
    public RunInstancesRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SchedulerOptions")
    public RunInstancesRequestSchedulerOptions schedulerOptions;

    @NameInMap("SecurityOptions")
    public RunInstancesRequestSecurityOptions securityOptions;

    @NameInMap("SystemDisk")
    public RunInstancesRequestSystemDisk systemDisk;

    // Specifies whether to associate an instance on a dedicated host with the dedicated host. Valid values:
    // 
    // *   default: does not associate the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool if the available resources of the original dedicated host are insufficient.
    // *   host: associates the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot be started.
    // 
    // Default value: default.
    @NameInMap("Affinity")
    public String affinity;

    // The number of instances that you want to create. Valid values: 1 to 100.
    // 
    // Default value: 1.
    @NameInMap("Amount")
    public Integer amount;

    // > This parameter is in invitational preview and is unavailable.
    @NameInMap("Arn")
    public java.util.List<RunInstancesRequestArn> arn;

    // The time when to automatically release the pay-as-you-go instance. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
    // 
    // *   If the value of seconds (`ss`) is not `00`, the time is automatically rounded to the nearest minute based on the value of minutes (`mm`).
    // *   The specified time must be at least 30 minutes later than the current time.
    // *   The specified time can be at most three years from the current time.
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    // Specifies whether to enable auto-renewal for the instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PrePaid`. Valid values:
    // 
    // *   true: enables auto-renewal.
    // *   false: does not enable auto-renewal.
    // 
    // Default value: false.
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // The auto-renewal period of the instance. Valid values:
    // 
    // *   Valid values when PeriodUnit is set to Week: 1, 2, and 3.
    // *   Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.
    // 
    // Default value: 1.
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The performance mode of the burstable instance. Valid values:
    // 
    // *   Standard: the standard mode. For more information, see the "Standard mode" section in [Burstable instances](~~59977~~).
    // *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Burstable instances](~~59977~~).
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    // Details about the data disks.
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    // The ID of the dedicated host on which to create the instance. If you set the `DedicatedHostId` parameter, the `SpotStrategy` and `SpotPriceLimit` parameters are ignored. This is because preemptible instances cannot be created on dedicated hosts.
    // 
    // You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the list of dedicated host IDs.
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    // Specifies whether to enable release protection for the instance. This parameter determines whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance. Valid values:
    // 
    // *   true: enables release protection for the instance.
    // *   false: disables release protection for the instance.
    // 
    // Default value: false.
    // 
    // > This parameter is applicable to only pay-as-you-go instances. It can protect instances against manual releases, but not against automatic releases.
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    // The number of the deployment set group to which to deploy the instance. If the deployment set specified by the DeploymentSetId parameter uses the high availability group strategy (AvailabilityGroup), you can use the DeploymentSetGroupNo parameter to specify a deployment set group in the deployment set. Valid values: 1 to 7.
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    // The ID of the deployment set to which to deploy the instance.
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    // The description of the instance. The description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:
    // 
    // *   true: The validity of the request is checked but the request is not made. Check items include whether required parameters are specified, the request format, service limits, and available ECS resources. If the check fails, the corresponding error code is returned. If the check succeeds, the `DryRunOperation` error code is returned.
    // *   false: The validity of the request is checked, and the request is made if the check succeeds.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The hostname of the instance. Take note of the following items:
    // 
    // *   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).
    // 
    // *   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).
    // 
    // *   For instances that run other operating systems such as Linux, take note of the following items:
    // 
    //     *   The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
    //     *   You can use the `${instance_id}` placeholder to pass instance IDs into the hostname specified by `HostName`. For example, if you set `HostName` to k8s-${instance_id} and the instance is assigned an ID of `i-123abc****`, the hostname of the instance is `k8s-i-123abc****`.
    // 
    // When you create multiple instances, you can perform the following operations:
    // 
    // *   Batch configure sequential hostnames for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
    // *   Use the `HostNames.N` parameter to configure different hostnames for instances. You cannot specify both the `HostName` and `HostNames.N` parameters.
    @NameInMap("HostName")
    public String hostName;

    // The hostname of instance N. You can use this parameter to specify different hostnames for multiple instances.
    @NameInMap("HostNames")
    public java.util.List<String> hostNames;

    // The ID of the Elastic High Performance Computing (E-HPC) cluster to which to assign the instance.
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    // Specifies whether to enable the access channel for instance metadata. Valid values:
    // 
    // *   enabled
    // *   disabled
    // 
    // Default value: enabled.
    // 
    // > For more information about instance metadata, see [Overview of ECS instance metadata](~~49122~~).
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    // The HTTP PUT response hop limit for accessing instance metadata. Valid values: 1 to 64.
    // 
    // Default value: 1.
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    // Specifies whether to forcefully use the security-enhanced mode (IMDSv2) to access instance metadata. Valid values:
    // 
    // *   optional: does not forcefully use the security-enhanced mode (IMDSv2).
    // *   required: forcefully uses the security-enhanced mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.
    // 
    // Default value: optional.
    // 
    // > For more information about the modes of accessing instance metadata, see [Access mode of instance metadata](~~150575~~).
    @NameInMap("HttpTokens")
    public String httpTokens;

    // The name of the image family. You can set this parameter to obtain the latest available custom image from the specified image family to create instances.
    // 
    // *   If you set the `ImageId` parameter, you cannot set the ImageFamily parameter.
    // *   If you do not set the `ImageId` parameter but use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify a launch template that has the `ImageId` parameter set, you cannot set the ImageFamily parameter.
    // *   If you do not set the `ImageId` parameter but use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify a launch template that does not have the `ImageId` parameter set, you can set the ImageFamily parameter.
    // *   If you do not set the `ImageId`, `LaunchTemplateId`, or `LaunchTemplateName` parameter, you can set the ImageFamily parameter.
    @NameInMap("ImageFamily")
    public String imageFamily;

    // The ID of the image to use to create the instance. You can call the [DescribeImages](~~25534~~) operation to query available images. If you do not use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify a launch template and do not set the `ImageFamily` parameter to obtain the latest available custom image from the specified image family, you must specify the `ImageId` parameter.
    @NameInMap("ImageId")
    public String imageId;

    // The billing method of the instance. Valid values:
    // 
    // *   PrePaid: subscription
    // *   PostPaid: pay-as-you-go
    // 
    // Default value: PostPaid.
    // 
    // If you set this parameter to PrePaid, make sure that your account has sufficient balance or credit. Otherwise, an `InvalidPayMethod` error is returned.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). The default value of this parameter is the `InstanceId` value.
    // 
    // When you batch create instances, you can batch configure sequential names for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
    @NameInMap("InstanceName")
    public String instanceName;

    // The instance type. If you do not use `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template, you must set the `InstanceType` parameter.
    // 
    // *   Select an instance type. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of an instance type, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
    // *   Query available resources. Call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
    @NameInMap("InstanceType")
    public String instanceType;

    // The billing method for network usage. Valid values:
    // 
    // *   PayByBandwidth: pay-by-bandwidth
    // *   PayByTraffic: pay-by-traffic
    // 
    // Default value: PayByTraffic.
    // 
    // > When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
    // 
    // *   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to 10, and the default value is 10.
    // *   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the `InternetMaxBandwidthOut` value and the default value is the `InternetMaxBandwidthOut` value.
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
    // 
    // Default value: 0.
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    // Specifies whether the instance is I/O optimized. For instances of [retired instance types](~~55263~~), the default value is none. For instances of other instance types, the default value is optimized. Valid values:
    // 
    // *   none: The instance is not I/O optimized.
    // *   optimized: The instance is I/O optimized.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    // IPv6 address N to be assigned to the primary ENI. Valid values of N: 1 to 10.
    // 
    // Example: `Ipv6Address.1=2001:db8:1234:1a00::***`.
    // 
    // Take note of the following items:
    // 
    // *   If the `Ipv6Address.N` parameter is specified, you must set the `Amount` parameter to 1 and leave the `Ipv6AddressCount` parameter empty.
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot set `Ipv6Addresses.N` or `Ipv6AddressCount` and must set `NetworkInterface.N.Ipv6Addresses.N` or `NetworkInterface.N.Ipv6AddressCount`.
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    // The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10.
    // 
    // Take note of the following items:
    // 
    // *   You cannot specify both the `Ipv6Addresses.N` and `Ipv6AddressCount` parameters.
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `Ipv6Address.N` or `Ipv6AddressCount` but can specify `NetworkInterface.N.Ipv6Address.N` or `NetworkInterface.N.Ipv6AddressCount`.
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    // > This parameter is in invitational preview and is unavailable.
    @NameInMap("Isp")
    public String isp;

    // The name of the key pair.
    // 
    // > For Windows instances, this parameter is ignored. This parameter is empty by default. The `Password` parameter takes effect even if the KeyPairName parameter is specified.
    @NameInMap("KeyPairName")
    public String keyPairName;

    // The ID of the launch template. For more information, see [DescribeLaunchTemplates](~~73759~~).
    // 
    // To use a launch template to create an instance, you must use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify the launch template.
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    // The name of the launch template.
    // 
    // To use a launch template to create an instance, you must use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify the launch template.
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    // The version of the launch template. If you set the `LaunchTemplateId` or `LaunchTemplateName` parameter but do not set the version number of the launch template, the default template version is used.
    @NameInMap("LaunchTemplateVersion")
    public Long launchTemplateVersion;

    // The minimum number of instances that can be created. Valid values: 1 to 100.
    // 
    // *   If the number of instances that available resources are sufficient to create is smaller than the MinAmount value, instances cannot be created.
    // *   If the number of ECS instances that available resources are sufficient to create is greater than or equal to the MinAmount value, instances are created based on the number of available resources.
    @NameInMap("MinAmount")
    public Integer minAmount;

    // The information of the ENI.
    @NameInMap("NetworkInterface")
    public java.util.List<RunInstancesRequestNetworkInterface> networkInterface;

    // The number of queues supported by the primary ENI. Take note of the following items:
    // 
    // *   The value of this parameter cannot exceed the maximum number of queues per ENI allowed for the instance type.
    // *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` values.
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `NetworkInterfaceQueueNumber` but can specify `NetworkInterface.N.QueueNumber`.
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:
    // 
    //     ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/
    // 
    // For Windows instances, the password cannot start with a forward slash (/).
    // 
    // > If the `Password` parameter is specified, we recommend that you send requests over HTTPS to prevent password leaks.
    @NameInMap("Password")
    public String password;

    // Specifies whether to use the password preset in the image. Valid values:
    // 
    // *   true: uses the preset password.
    // *   false: does not use the preset password.
    // 
    // Default value: false.
    // 
    // > If you set this parameter to true, make sure that you leave the Password parameter empty and the selected image has a preset password.
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    // The subscription period of the instance. The unit is specified by the `PeriodUnit` parameter. This parameter is valid and required only when `InstanceChargeType` is set to `PrePaid`. If the `DedicatedHostId` parameter is specified, the value of Period must not exceed the subscription period of the specified dedicated host. Valid values:
    // 
    // *   Valid values when PeriodUnit is set to Week: 1, 2, 3, and 4.
    // *   Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription period. Default value: Month. Valid values:
    // 
    // *   Week
    // *   Month
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The private IP address to assign to the instance. To assign a private IP address to an instance of the VPC type, make sure that the IP address is an idle IP address within the CIDR block of the vSwitch specified by the `VSwitchId` parameter.
    // 
    // Take note of the following items:
    // 
    // *   If the `PrivateIpAddress` parameter is specified, take note of the following items:
    // 
    //     *   If `Amount` is set to 1, a single instance is created and the specified private IP address is assigned to the instance.
    //     *   If `Amount` is set to a numeric value greater than 1, the specified number of instances are created and consecutive private IP addresses starting from the specified one are assigned to the instances. In this case, you cannot specify parameters that start with `NetworkInterface.N` to bind secondary ENIs to the instances.
    // 
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `PrivateIpAddress` but can specify `NetworkInterface.N.PrimaryIpAddress`.
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    // The name of the Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created.
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

    // The ID of the security group to which to assign the instance. Instances in the same security group can communicate with each other. The maximum number of instances that a security group can contain depends on the type of the security group. For more information, see the "Security group limits" section in [Limits](~~25412~~).
    // 
    // > The network type of the new instance must be the same as that of the security group specified by the `SecurityGroupId` parameter. For example, if the specified security group is of the VPC type, the new instance is also of the VPC type and you must specify the `VSwitchId` parameter.
    // 
    // If you do not use `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template, you must set the SecurityGroupId parameter. Take note of the following items:
    // 
    // *   You can set `SecurityGroupId` to specify a single security group or set `SecurityGroupIds.N` to specify one or more security groups. However, you cannot specify both `SecurityGroupId` and `SecurityGroupIds.N`.
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `SecurityGroupId` or `SecurityGroupIds.N` but can specify only `NetworkInterface.N.SecurityGroupId` or `NetworkInterface.N.SecurityGroupIds.N`.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // The ID of security group N to which to assign the instance. The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the "Security group limits" section in [Limits](~~101348~~).
    // 
    // Take note of the following items:
    // 
    // *   You cannot specify both the `SecurityGroupId` and `SecurityGroupIds.N` parameters.
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `SecurityGroupId` or `SecurityGroupIds.N` but can specify `NetworkInterface.N.SecurityGroupId` or `NetworkInterface.N.SecurityGroupIds.N`.
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

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

    // The bidding policy for the pay-as-you-go instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PostPaid`. Valid values:
    // 
    // *   NoSpot: The instance is created as a pay-as-you-go instance.
    // *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
    // *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
    // 
    // Default value: NoSpot.
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    // The ID of the storage set.
    @NameInMap("StorageSetId")
    public String storageSetId;

    // The maximum number of partitions in the storage set. Valid values: greater than or equal to 2.
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    // The tags to add to the instance, disks, and primary ENI. You can specify up to 20 tags.
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    // Specifies whether to create the instance on a dedicated host. Valid values:
    // 
    // *   default: creates the instance on a non-dedicated host.
    // *   host: creates the instance on a dedicated host. If you do not set the `DedicatedHostId` parameter, Alibaba Cloud selects a dedicated host for the instance.
    // 
    // Default value: default.
    @NameInMap("Tenancy")
    public String tenancy;

    // Specifies whether to automatically append incremental suffixes to the hostname specified by the `HostName` parameter and to the instance name specified by the `InstanceName` parameter when you batch create instances. The incremental suffixes can range from 001 to 999. Valid values:
    // 
    // *   true
    // *   false
    // 
    // Default value: false.
    // 
    // When the `HostName` or `InstanceName` value is set in the `name_prefix[begin_number,bits]` format without `name_suffix`, the `UniqueSuffix` parameter does not take effect. The names are sorted in the specified sequence.
    // 
    // For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    // The user data of the instance. The user data must be encoded in Base64. The raw data can be up to 16 KB in size.
    // 
    // > If the instance type supports [user data](~~~49121~), you can use the UserData parameter to pass in user data. We recommend that you do not pass in confidential information (such as passwords or private keys) in plaintext as user data. This is because the system does not encrypt UserData values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64, and then decode and decrypt the information in the same way within the instance.
    @NameInMap("UserData")
    public String userData;

    // The ID of the vSwitch to which to connect to the instance. You must set this parameter when you create an instance of the VPC type. The specified vSwitch and security group must belong to the same VPC. You can call the [DescribeVSwitches](~~35748~~) operation to query available vSwitches.
    // 
    // Take note of the following items:
    // 
    // *   If you specify the `VSwitchId` parameter, the zone specified by the `ZoneId` parameter must be the zone where the specified vSwitch is located. You can also leave the `ZoneId` parameter empty. Then, the system selects the zone where the specified vSwitch resides.
    // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `VSwitchId` but can specify `NetworkInterface.N.VSwitchId`.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the zone in which to create the instance. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    // 
    // > If you specify the `VSwitchId` parameter, the zone specified by the `ZoneId` parameter must be the zone where the vSwitch is located. You can also leave the `ZoneId` parameter empty. Then, the system selects the zone where the specified vSwitch is located.
    // 
    // This parameter is empty by default.
    @NameInMap("ZoneId")
    public String zoneId;

    public static RunInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesRequest self = new RunInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RunInstancesRequest setCpuOptions(RunInstancesRequestCpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }
    public RunInstancesRequestCpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    public RunInstancesRequest setHibernationOptions(RunInstancesRequestHibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public RunInstancesRequestHibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public RunInstancesRequest setPrivatePoolOptions(RunInstancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public RunInstancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public RunInstancesRequest setSchedulerOptions(RunInstancesRequestSchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public RunInstancesRequestSchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public RunInstancesRequest setSecurityOptions(RunInstancesRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public RunInstancesRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public RunInstancesRequest setSystemDisk(RunInstancesRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public RunInstancesRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public RunInstancesRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public RunInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public RunInstancesRequest setArn(java.util.List<RunInstancesRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<RunInstancesRequestArn> getArn() {
        return this.arn;
    }

    public RunInstancesRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public RunInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunInstancesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public RunInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunInstancesRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public RunInstancesRequest setDataDisk(java.util.List<RunInstancesRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<RunInstancesRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public RunInstancesRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RunInstancesRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunInstancesRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public RunInstancesRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RunInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RunInstancesRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunInstancesRequest setHostNames(java.util.List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }
    public java.util.List<String> getHostNames() {
        return this.hostNames;
    }

    public RunInstancesRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public RunInstancesRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public RunInstancesRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public RunInstancesRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public RunInstancesRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public RunInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public RunInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunInstancesRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public RunInstancesRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunInstancesRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public RunInstancesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public RunInstancesRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public RunInstancesRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public RunInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunInstancesRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public RunInstancesRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public RunInstancesRequest setLaunchTemplateVersion(Long launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public Long getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public RunInstancesRequest setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
        return this;
    }
    public Integer getMinAmount() {
        return this.minAmount;
    }

    public RunInstancesRequest setNetworkInterface(java.util.List<RunInstancesRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<RunInstancesRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public RunInstancesRequest setNetworkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
        this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
        return this;
    }
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    public RunInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunInstancesRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public RunInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RunInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunInstancesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RunInstancesRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public RunInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunInstancesRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public RunInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RunInstancesRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public RunInstancesRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public RunInstancesRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public RunInstancesRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public RunInstancesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public RunInstancesRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public RunInstancesRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public RunInstancesRequest setTag(java.util.List<RunInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunInstancesRequestTag> getTag() {
        return this.tag;
    }

    public RunInstancesRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public RunInstancesRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public RunInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RunInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RunInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class RunInstancesRequestCpuOptions extends TeaModel {
        // The number of CPU cores. This parameter cannot be specified but only uses its default value.
        // 
        // For information about the default value, see [Customize CPU options](~~145895~~).
        @NameInMap("Core")
        public Integer core;

        // This parameter is no longer used.
        @NameInMap("Numa")
        public String numa;

        // The number of threads per CPU core. The following formula is used to calculate the number of vCPUs of the instance: `CpuOptions.Core` value × `CpuOptions.ThreadPerCore` value.
        // 
        // *   The following formula is used to calculate the number of vCPUs of the instance: `CpuOptions.Core` value × CpuOptions.ThreadPerCore value.
        // *   This parameter is applicable only to specific instance types.
        // 
        // For information about valid values and the default value, see [Customize CPU options](~~145895~~).
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static RunInstancesRequestCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestCpuOptions self = new RunInstancesRequestCpuOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestCpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public RunInstancesRequestCpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

        public RunInstancesRequestCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

    }

    public static class RunInstancesRequestHibernationOptions extends TeaModel {
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("Configured")
        public Boolean configured;

        public static RunInstancesRequestHibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestHibernationOptions self = new RunInstancesRequestHibernationOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestHibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

    }

    public static class RunInstancesRequestPrivatePoolOptions extends TeaModel {
        // The ID of the private pool. The ID of a private pool is the same as that of the elasticity assurance or capacity reservation for which the private pool is generated.
        @NameInMap("Id")
        public String id;

        // The type of the private pool to use to create the instance. A private pool is generated after an elasticity assurance or a capacity reservation takes effect. You can select the private pool when you start an instance. Valid values:
        // 
        // *   Open: open private pool. The system selects a matching open private pool to create the instance. If no matching open private pools are found, resources in the public pool are used. When you set this parameter to Open, you can leave the `PrivatePoolOptions.Id` parameter empty.
        // *   Target: specified private pool. The system uses the capacity in a specified private pool to create the instance. If the specified private pool is unavailable, the instance cannot be created. If you set this parameter to Target, you must specify the `PrivatePoolOptions.Id` parameter.
        // *   None: no private pool. The capacity in private pools is not used.
        // 
        // Default value: None.
        // 
        // In the following scenarios, the PrivatePoolOptions.MatchCriteria parameter can be set only to `None` or left empty:
        // 
        // *   A preemptible instance is created.
        // *   The instance is created in the classic network.
        // *   The instance is created on a dedicated host.
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static RunInstancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestPrivatePoolOptions self = new RunInstancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RunInstancesRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class RunInstancesRequestSchedulerOptions extends TeaModel {
        // The ID of the dedicated host cluster in which to create the instance. After this parameter is specified, the system selects one dedicated host from the specified cluster to create the instance.
        // 
        // > This parameter is valid only when the `Tenancy` parameter is set to `host`.
        // 
        // When you specify both the `DedicatedHostId` and `SchedulerOptions.DedicatedHostClusterId` parameters, take note of the following items:
        // 
        // *   If the specified dedicated host belongs to the specified dedicated host cluster, the instance is preferentially deployed on the specified dedicated host.
        // *   If the specified dedicated host does not belong to the specified dedicated host cluster, the instance cannot be created.
        // 
        // You can call the [DescribeDedicatedHostClusters](~~184145~~) operation to query the list of dedicated host cluster IDs.
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        public static RunInstancesRequestSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSchedulerOptions self = new RunInstancesRequestSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSchedulerOptions setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

    }

    public static class RunInstancesRequestSecurityOptions extends TeaModel {
        // The confidential computing mode. Set the value to Enclave.
        // 
        // A value of Enclave indicates that an enclave-based confidential computing environment is built on the instance. When you call the `RunInstances` operation, you can set this parameter only for c7, g7, or r7 instances to use enclave-based confidential computing. Take note of the following items:
        // 
        // *   The confidential computing feature is in invitational preview. To use this feature, submit a ticket.
        // *   When you use the ECS API to create instances that support enclave-based confidential computing, you can call only the `RunInstances` operation. The `CreateInstance` operation does not support the `SecurityOptions.ConfidentialComputingMode` parameter.
        // *   Enclave-based confidential computing is implemented based on the Alibaba Cloud trusted system (vTPM). When you build a confidential computing environment on an instance by using Enclave, the Alibaba Cloud trusted system is enabled for the instance. Therefore, if you set `SecurityOptions.ConfidentialComputingMode` to Enclave when you call this operation, the created instances use enclave-based confidential computing and the Alibaba Cloud trusted system regardless of whether `SecurityOptions.TrustedSystemMode` is set to vTPM.
        // 
        // For more information about confidential computing, see [Build a confidential computing environment by using Enclave](~~203433~~).
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        // The trusted system mode. Set the value to vTPM.
        // 
        // The trusted system mode supports the following instance families:
        // 
        // *   g7, c7, and r7
        // *   Security-enhanced instance families: g7t, c7t, and r7t
        // 
        // When you create instances of the preceding instance families, you must set this parameter. Take note of the following items:
        // 
        // *   To use the Alibaba Cloud trusted system, set this parameter to vTPM. Then, the Alibaba Cloud trusted system performs trust verifications when the instances start.
        // *   If you do not want to use the Alibaba Cloud trusted system, leave this parameter empty. Note that if your created instances use an enclave-based confidential computing environment (with `SecurityOptions.ConfidentialComputingMode` set to Enclave), the Alibaba Cloud trusted system is enabled for the instances.
        // *   When you use the ECS API to create instances that use the trusted system, you can call only the `RunInstances` operation. The `CreateInstance` operation does not support the `SecurityOptions.TrustedSystemMode` parameter.
        // 
        // > If you have configured an instance as a trusted one when you created the instance, you can use only an image that support the trusted system to replace the system disk of the instance.
        // 
        // For more information about the trusted system, see [Overview](~~201394~~).
        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

        public static RunInstancesRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSecurityOptions self = new RunInstancesRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

        public RunInstancesRequestSecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

    }

    public static class RunInstancesRequestSystemDisk extends TeaModel {
        // The ID of the automatic snapshot policy to apply to the system disk.
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        // The category of the system disk. Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: enhanced SSD (ESSD)
        // *   cloud: basic disk
        // *   cloud_auto: ESSD AutoPL disk
        // 
        // For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.
        @NameInMap("Category")
        public String category;

        // The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.
        @NameInMap("Description")
        public String description;

        // The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
        @NameInMap("DiskName")
        public String diskName;

        // The performance level of the ESSD to use as the system disk. Default value: PL1. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // The size of the system disk. Unit: GiB. Valid values: 20 to 500.
        // 
        // The value of this parameter must be at least 20 and greater than or equal to the image size.
        // 
        // Default value: 40 or the image size, whichever is greater.
        @NameInMap("Size")
        public String size;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        // The algorithm to use to encrypt the system disk. Valid values:
        // 
        // *   ase-256
        // *   sm4-128
        // 
        // Default value: ase-256.
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        // Specifies whether to encrypt the system disk. Valid values:
        // 
        // *   true: encrypts the data disk.
        // *   false: does not encrypt the data disk.
        // 
        // Default value: false.
        // 
        // > The system disks of instances cannot be encrypted during instance creation in Hong Kong Zone D or Singapore Zone A.
        @NameInMap("Encrypted")
        public String encrypted;

        // The ID of the KMS key to use for the system disk.
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        // The ID of the dedicated block storage cluster. If you want to use disks in a dedicated block storage cluster as system disks when you create instances, you must specify this parameter. For more information about dedicated block storage clusters, see [What is Dedicated Block Storage Cluster?](~~208883~~)
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static RunInstancesRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSystemDisk self = new RunInstancesRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public RunInstancesRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunInstancesRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunInstancesRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public RunInstancesRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public RunInstancesRequestSystemDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public RunInstancesRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public RunInstancesRequestSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public RunInstancesRequestSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public RunInstancesRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public RunInstancesRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public RunInstancesRequestSystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class RunInstancesRequestArn extends TeaModel {
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("RoleType")
        public String roleType;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("Rolearn")
        public String rolearn;

        public static RunInstancesRequestArn build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestArn self = new RunInstancesRequestArn();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public RunInstancesRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public RunInstancesRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class RunInstancesRequestDataDisk extends TeaModel {
        // The ID of the automatic snapshot policy to apply to data disk N.
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        // The category of data disk N. Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: ESSD
        // *   cloud: basic disk
        // *   cloud_auto: ESSD AutoPL disk
        // 
        // For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
        @NameInMap("Category")
        public String category;

        // Specifies whether to release data disk N when the instance is released. Valid values:
        // 
        // *   true: releases data disk N when the instance is released.
        // *   false: does not release data disk N when the instance is released.
        // 
        // Default value: true.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        @NameInMap("Description")
        public String description;

        // The mount point of data disk N.
        // 
        // > This parameter is applicable to scenarios in which a full image is used to create instances. A full image is an image that contains an operating system, application software, and business data. For these scenarios, you can set this parameter to the mount point of data disk N contained in the full image and modify the `DataDisk.N.Size` and `DataDisk.N.Category` parameters to change the category and size of data disk N created based on the image.
        @NameInMap("Device")
        public String device;

        // The name of data disk N. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
        @NameInMap("DiskName")
        public String diskName;

        // The algorithm to use to encrypt data disk N. Valid values:
        // 
        // *   aes-256
        // *   sm4-128
        // 
        // Default value: aes-256.
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        // Specifies whether to encrypt data disk N. Valid values:
        // 
        // *   true: encrypts the data disk.
        // *   false: does not encrypt the data disk.
        // 
        // Default value: false.
        @NameInMap("Encrypted")
        public String encrypted;

        // The ID of the Key Management Service (KMS) key that is used for the data disk.
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        // The performance level of the ESSD to use as data disk N. The value of N must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Default value: PL1. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        // The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values of this parameter:
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_essd: depend on the `DataDisk.N.PerformanceLevel` value.
        // 
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_auto: 40 to 32768.
        // 
        // The value of this parameter must be greater than or equal to the size of the snapshot specified by the `SnapshotId` parameter.
        @NameInMap("Size")
        public Integer size;

        // The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.
        // 
        // If the `DataDisk.N.SnapshotId` parameter is specified, the `DataDisk.N.Size` parameter is ignored. The data disk is created with the size of the specified snapshot. Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.
        @NameInMap("SnapshotId")
        public String snapshotId;

        // The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as data disk N when you create instances, you must specify this parameter.
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static RunInstancesRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestDataDisk self = new RunInstancesRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public RunInstancesRequestDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public RunInstancesRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunInstancesRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public RunInstancesRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunInstancesRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public RunInstancesRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public RunInstancesRequestDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public RunInstancesRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public RunInstancesRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public RunInstancesRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public RunInstancesRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public RunInstancesRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunInstancesRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public RunInstancesRequestDataDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class RunInstancesRequestNetworkInterface extends TeaModel {
        // The description of ENI N.
        // 
        // Take note of the following items:
        // 
        // *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
        // *   The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you do not need to set this parameter.
        @NameInMap("Description")
        public String description;

        // The type of ENI N. Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
        // 
        // Valid values:
        // 
        // *   Primary
        // *   Secondary
        // 
        // Default value: Secondary.
        @NameInMap("InstanceType")
        public String instanceType;

        // IPv6 address N to assign to the primary ENI. Up to 10 IPv6 addresses can be assigned to the primary ENI. Valid values of the second N: 1 to 10.
        // 
        // Example: `Ipv6Address.1=2001:db8:1234:1a00::***`.
        // 
        // Take note of the following items:
        // 
        // *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
        // *   If you specify this parameter, you must set `Amount` to 1. You cannot specify `Ipv6AddressCount`, `Ipv6Address.N`, or `NetworkInterface.N.Ipv6AddressCount`.
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        // The number of IPv6 addresses that the system randomly generates for the primary ENI. Valid values: 1 to 10.
        // 
        // Take note of the following items:
        // 
        // *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
        // *   If you specify this parameter, you cannot specify `Ipv6AddressCount`, `Ipv6Address.N`, or `NetworkInterface.N.Ipv6Address.N`.
        @NameInMap("Ipv6AddressCount")
        public Long ipv6AddressCount;

        // The name of ENI N.
        // 
        // Take note of the following items:
        // 
        // *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
        // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you do not need to set this parameter.
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        // The communication mode of primary ENI N. Valid values:
        // 
        // *   Standard: uses the TCP communication mode.
        // *   HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the remote direct memory access (RDMA) communication mode.
        // 
        // Take note of the following items:
        // 
        // *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
        // *   If you set this parameter to HighPerformance, you can create instances only of the c7re RDMA-enhanced instance family. The maximum number of ENIs in RDMA mode that can be bound to a c7re instance is determined based on the instance type. The c7re instance family is in invitational preview in Beijing Zone K. For more information, see [Instance family](~~25378~~).
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        // The primary IP address to assign to ENI N.
        // 
        // Take note of the following items:
        // 
        // *   Valid values of N: 1 and 2.
        // 
        //     *   If the value of N is 1, you can configure a primary or secondary ENI. If this parameter is specified, `Amount` is set to a numeric value greater than 1, and NetworkInterface.N.InstanceType is set to Primary, the specified number of instances are created and consecutive primary IP addresses starting from the specified one are assigned to the instances. In this case, you cannot bind secondary ENIs to the instances.
        //     *   If the value of N is 2, you can configure a primary ENI and a secondary ENI. If this parameter is specified, `Amount` is set to a numeric value greater than 1, and NetworkInterface.N.InstanceType is set to Primary, you cannot specify `NetworkInterface.2.InstanceType` to Secondary to bind a secondary ENI.
        // 
        // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, this parameter is equivalent to `PrivateIpAddress` and you cannot specify both NetworkInterface.N.PrimaryIpAddress and `PrivateIpAddress`.
        // 
        // *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, the specified primary IP address is assigned to the secondary ENI. The default value is an IP address that is randomly selected from within the CIDR block of the vSwitch to which to connect the secondary ENI.
        // 
        // > You can bind only a single secondary ENI when you create an instance. After the instance is created, you can call the [CreateNetworkInterface](~~58504~~) and [AttachNetworkInterface](~~58515~~) operations to bind more secondary ENIs.
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        // The number of queues supported by ENI N.
        // 
        // Take note of the following items:
        // 
        // *   Valid values of N: 1 and 2. If the value of N is 1, you can set a primary or secondary ENI. If the value of N is 2, you can set a primary ENI and a secondary ENI.
        // *   The value of this parameter cannot exceed the maximum number of queues per ENI allowed for the specified instance type.
        // *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` values.
        // *   If this parameter is set and `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot set the `NetworkInterfaceQueueNumber` parameter.
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("QueuePairNumber")
        public Long queuePairNumber;

        // The ID of the security group to which to assign secondary ENI N.
        // 
        // Take note of the following items:
        // 
        // *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
        // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter. In this case, this parameter is equivalent to `SecurityGroupId` and you cannot specify `SecurityGroupId`, `SecurityGroupIds.N`, or `NetworkInterface.N.SecurityGroupIds.N`.
        // *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the security group to which to assign the ECS instance.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // The ID of security group N to which to assign ENI N.
        // 
        // *   Valid values of the first N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
        // *   The second N indicates that one or more security group IDs can be specified. The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
        // 
        // Take note of the following items:
        // 
        // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter or `NetworkInterface.N.SecurityGroupId`. In this case, this parameter is equivalent to `SecurityGroupIds.N` and you cannot specify `SecurityGroupId`, `SecurityGroupIds.N`, or `NetworkInterface.N.SecurityGroupId`.
        // *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the security group to which to assign the ECS instance.
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        // The ID of the vSwitch to which to connect to ENI N.
        // 
        // Take note of the following items:
        // 
        // *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
        // *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter. In this case, this parameter is equivalent to `VSwitchId` and you cannot specify `VSwitchId`.
        // *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the vSwitch to which to connect to the instance.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static RunInstancesRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestNetworkInterface self = new RunInstancesRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunInstancesRequestNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public RunInstancesRequestNetworkInterface setIpv6Address(java.util.List<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<String> getIpv6Address() {
            return this.ipv6Address;
        }

        public RunInstancesRequestNetworkInterface setIpv6AddressCount(Long ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Long getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public RunInstancesRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public RunInstancesRequestNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public RunInstancesRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public RunInstancesRequestNetworkInterface setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public RunInstancesRequestNetworkInterface setQueuePairNumber(Long queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Long getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public RunInstancesRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public RunInstancesRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public RunInstancesRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class RunInstancesRequestTag extends TeaModel {
        // The key of tag of the instance, disks, and primary ENI.
        // 
        // The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag of the instance, disks, and primary ENI.
        // 
        // The tag value can be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static RunInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestTag self = new RunInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
