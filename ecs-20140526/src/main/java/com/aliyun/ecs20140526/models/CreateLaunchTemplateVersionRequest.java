// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("VersionDescription")
    public String versionDescription;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VpcId")
    public String vpcId;

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

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SystemDisk")
    @Validation(required = true)
    public CreateLaunchTemplateVersionRequestSystemDisk systemDisk;

    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("EnableVmOsConfig")
    public Boolean enableVmOsConfig;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateVersionRequestTag> tag;

    public static CreateLaunchTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionRequest self = new CreateLaunchTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateLaunchTemplateVersionRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Iops")
        public Integer iops;

        public static CreateLaunchTemplateVersionRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestSystemDisk self = new CreateLaunchTemplateVersionRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateVersionRequestDataDisk extends TeaModel {
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

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DeleteWithInstance")
        @Validation(required = true)
        public Boolean deleteWithInstance;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        public static CreateLaunchTemplateVersionRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestDataDisk self = new CreateLaunchTemplateVersionRequestDataDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateVersionRequestNetworkInterface extends TeaModel {
        @NameInMap("PrimaryIpAddress")
        @Validation(required = true)
        public String primaryIpAddress;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("NetworkInterfaceName")
        @Validation(required = true)
        public String networkInterfaceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static CreateLaunchTemplateVersionRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestNetworkInterface self = new CreateLaunchTemplateVersionRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateVersionRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateLaunchTemplateVersionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestTag self = new CreateLaunchTemplateVersionRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
