// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VlanId")
    public String vlanId;

    @NameInMap("InnerIpAddress")
    public String innerIpAddress;

    @NameInMap("SystemDisk")
    @Validation(required = true)
    public CreateInstanceRequestSystemDisk systemDisk;

    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    @NameInMap("Arn")
    public java.util.List<CreateInstanceRequestArn> arn;

    @NameInMap("NodeControllerId")
    public String nodeControllerId;

    @NameInMap("Description")
    public String description;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

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

    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    @NameInMap("HttpTokens")
    public String httpTokens;

    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateInstanceRequestSystemDisk extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("Category")
        public String category;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static CreateInstanceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestSystemDisk self = new CreateInstanceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateInstanceRequestDataDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

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

        @NameInMap("Encrypted")
        @Validation(required = true)
        public Boolean encrypted;

        @NameInMap("KMSKeyId")
        @Validation(required = true)
        public String KMSKeyId;

        @NameInMap("PerformanceLevel")
        @Validation(required = true)
        public String performanceLevel;

        @NameInMap("EncryptAlgorithm")
        @Validation(required = true)
        public String encryptAlgorithm;

        public static CreateInstanceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDataDisk self = new CreateInstanceRequestDataDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateInstanceRequestArn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        @Validation(required = true)
        public Long assumeRoleFor;

        @NameInMap("Rolearn")
        @Validation(required = true)
        public String rolearn;

        @NameInMap("RoleType")
        @Validation(required = true)
        public String roleType;

        public static CreateInstanceRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestArn self = new CreateInstanceRequestArn();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateInstanceRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
