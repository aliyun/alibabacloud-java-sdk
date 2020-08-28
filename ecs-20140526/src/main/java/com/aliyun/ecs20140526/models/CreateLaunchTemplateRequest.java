// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TemplateTag")
    public java.util.List<CreateLaunchTemplateRequestTemplateTag> templateTag;

    @NameInMap("LaunchTemplateName")
    @Validation(required = true)
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
    public CreateLaunchTemplateRequestSystemDisk systemDisk;

    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateRequestDataDisk> dataDisk;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateRequestNetworkInterface> networkInterface;

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

    @NameInMap("TemplateResourceGroupId")
    public String templateResourceGroupId;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateRequestTag> tag;

    public static CreateLaunchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateRequest self = new CreateLaunchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateLaunchTemplateRequestTemplateTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateLaunchTemplateRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestTemplateTag self = new CreateLaunchTemplateRequestTemplateTag();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateRequestSystemDisk extends TeaModel {
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

        public static CreateLaunchTemplateRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestSystemDisk self = new CreateLaunchTemplateRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateRequestDataDisk extends TeaModel {
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

        public static CreateLaunchTemplateRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestDataDisk self = new CreateLaunchTemplateRequestDataDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateRequestNetworkInterface extends TeaModel {
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

        public static CreateLaunchTemplateRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestNetworkInterface self = new CreateLaunchTemplateRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateLaunchTemplateRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateLaunchTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestTag self = new CreateLaunchTemplateRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
