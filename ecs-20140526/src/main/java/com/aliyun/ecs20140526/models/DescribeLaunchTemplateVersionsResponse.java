// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("LaunchTemplateVersionSets")
    @Validation(required = true)
    public DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSets launchTemplateVersionSets;

    public static DescribeLaunchTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsResponse self = new DescribeLaunchTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Iops")
        @Validation(required = true)
        public Integer iops;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk extends TeaModel {
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

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface extends TeaModel {
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

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags extends TeaModel {
        @NameInMap("InstanceTag")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageOwnerAlias")
        @Validation(required = true)
        public String imageOwnerAlias;

        @NameInMap("PasswordInherit")
        @Validation(required = true)
        public Boolean passwordInherit;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("InternetMaxBandwidthIn")
        @Validation(required = true)
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        @Validation(required = true)
        public Integer internetMaxBandwidthOut;

        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public String ioOptimized;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("Period")
        @Validation(required = true)
        public Integer period;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("EnableVmOsConfig")
        @Validation(required = true)
        public Boolean enableVmOsConfig;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("UserData")
        @Validation(required = true)
        public String userData;

        @NameInMap("KeyPairName")
        @Validation(required = true)
        public String keyPairName;

        @NameInMap("RamRoleName")
        @Validation(required = true)
        public String ramRoleName;

        @NameInMap("AutoReleaseTime")
        @Validation(required = true)
        public String autoReleaseTime;

        @NameInMap("SpotStrategy")
        @Validation(required = true)
        public String spotStrategy;

        @NameInMap("SpotPriceLimit")
        @Validation(required = true)
        public Double spotPriceLimit;

        @NameInMap("SpotDuration")
        @Validation(required = true)
        public Integer spotDuration;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("SecurityEnhancementStrategy")
        @Validation(required = true)
        public String securityEnhancementStrategy;

        @NameInMap("SystemDisk")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk;

        @NameInMap("DataDisks")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks;

        @NameInMap("NetworkInterfaces")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSet extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("LaunchTemplateId")
        @Validation(required = true)
        public String launchTemplateId;

        @NameInMap("LaunchTemplateName")
        @Validation(required = true)
        public String launchTemplateName;

        @NameInMap("DefaultVersion")
        @Validation(required = true)
        public Boolean defaultVersion;

        @NameInMap("VersionNumber")
        @Validation(required = true)
        public Long versionNumber;

        @NameInMap("VersionDescription")
        @Validation(required = true)
        public String versionDescription;

        @NameInMap("CreatedBy")
        @Validation(required = true)
        public String createdBy;

        @NameInMap("LaunchTemplateData")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSet self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSets extends TeaModel {
        @NameInMap("LaunchTemplateVersionSet")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet;

        public static DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSets self = new DescribeLaunchTemplateVersionsResponseLaunchTemplateVersionSets();
            return TeaModel.build(map, self);
        }

    }

}
