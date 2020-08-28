// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Description")
    public String description;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("SystemDisk")
    @Validation(required = true)
    public RunInstancesRequestSystemDisk systemDisk;

    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    @NameInMap("Arn")
    public java.util.List<RunInstancesRequestArn> arn;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("NetworkInterface")
    public java.util.List<RunInstancesRequestNetworkInterface> networkInterface;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("MinAmount")
    public Integer minAmount;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("LaunchTemplateVersion")
    public Long launchTemplateVersion;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("Affinity")
    public String affinity;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("StorageSetId")
    public String storageSetId;

    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    @NameInMap("CpuOptions")
    @Validation(required = true)
    public RunInstancesRequestCpuOptions cpuOptions;

    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    @NameInMap("HttpTokens")
    public String httpTokens;

    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    public static RunInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesRequest self = new RunInstancesRequest();
        return TeaModel.build(map, self);
    }

    public static class RunInstancesRequestSystemDisk extends TeaModel {
        @NameInMap("Size")
        public String size;

        @NameInMap("Category")
        public String category;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        public static RunInstancesRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSystemDisk self = new RunInstancesRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class RunInstancesRequestDataDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Encrypted")
        @Validation(required = true)
        public String encrypted;

        @NameInMap("KMSKeyId")
        @Validation(required = true)
        public String KMSKeyId;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("DeleteWithInstance")
        @Validation(required = true)
        public Boolean deleteWithInstance;

        @NameInMap("PerformanceLevel")
        @Validation(required = true)
        public String performanceLevel;

        @NameInMap("AutoSnapshotPolicyId")
        @Validation(required = true)
        public String autoSnapshotPolicyId;

        @NameInMap("EncryptAlgorithm")
        @Validation(required = true)
        public String encryptAlgorithm;

        public static RunInstancesRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestDataDisk self = new RunInstancesRequestDataDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class RunInstancesRequestArn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        @Validation(required = true)
        public Long assumeRoleFor;

        @NameInMap("Rolearn")
        @Validation(required = true)
        public String rolearn;

        @NameInMap("RoleType")
        @Validation(required = true)
        public String roleType;

        public static RunInstancesRequestArn build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestArn self = new RunInstancesRequestArn();
            return TeaModel.build(map, self);
        }

    }

    public static class RunInstancesRequestNetworkInterface extends TeaModel {
        @NameInMap("PrimaryIpAddress")
        @Validation(required = true)
        public String primaryIpAddress;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("NetworkInterfaceName")
        @Validation(required = true)
        public String networkInterfaceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static RunInstancesRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestNetworkInterface self = new RunInstancesRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

    }

    public static class RunInstancesRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static RunInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestTag self = new RunInstancesRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class RunInstancesRequestCpuOptions extends TeaModel {
        @NameInMap("Core")
        public Integer core;

        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        @NameInMap("Numa")
        public String numa;

        public static RunInstancesRequestCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestCpuOptions self = new RunInstancesRequestCpuOptions();
            return TeaModel.build(map, self);
        }

    }

}
