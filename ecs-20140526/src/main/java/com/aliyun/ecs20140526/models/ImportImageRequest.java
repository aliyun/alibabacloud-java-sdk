// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    // The system architecture. Valid values:
    // 
    // *   i386
    // *   x86\_64
    // *   arm64
    // 
    // Default value: x86\_64.
    @NameInMap("Architecture")
    public String architecture;

    // The boot mode of the custom image. Valid values:
    // 
    // *   BIOS
    // *   UEFI
    // 
    // Default value: BIOS. If you set the `Architecture` parameter to arm64, the BootMode parameter can only be set to UEFI.
    // 
    // >  You must be aware of the boot modes supported by the specified image. When you use this parameter to change the boot mode of the image, specify a boot mode supported by the image to ensure that instances that use this image can start normally.
    @NameInMap("BootMode")
    public String bootMode;

    // The description of the custom image. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // The mode in which to check the source image. If you do not specify this parameter, the source image is not checked. Only Linux images can be checked. Set the value to Standard, which indicates standard check mode.
    // 
    // The following items are checked in standard check mode:
    // 
    // *   Virtio: whether the virtio driver is installed.
    // *   Fstab: whether mounting configurations in the fstab file are correct.
    // *   Grub: whether GRUB configurations are correct.
    // *   SystemImage: whether the image is valid. Do not import images that are in the ISO format or empty.
    // *   CloudInit: whether cloud-init is installed.
    // *   NVMe: whether the NVMe driver is installed.
    // *   Selinux: whether SElinux is enabled.
    // *   OnlineResizeFS: whether the root partition can be automatically resized.
    // *   Dhcp: whether Dynamic Host Configuration Protocol (DHCP) is enabled for network interface controllers (NICs).
    // *   RtcTimeMode: the RTC time mode.
    // *   Platform: the platform. Example: Linux or Windows.
    // *   OSVersion: the operating system version. Example: Centos 7.9.
    // *   Architecture: the architecture. Example: ARM or x86\_64.
    // *   BootMode: the boot mode. Example: UEFI or Legacy.
    // *   KernelVersion: the kernel version.
    // *   CloudAssistant: whether the Cloud Assistant client is installed.
    // *   SecurityCenterAgent: whether the Security Center agent is installed.
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    // The mappings of the disk devices.
    @NameInMap("DiskDeviceMapping")
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

    // The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
    @NameInMap("ImageName")
    public String imageName;

    // The type of the license to use to activate the operating system after the source image is imported. Valid values:
    // 
    // *   Auto: ECS checks the operating system of the source image and allocates a license to the operating system. ECS first checks whether the operating system distribution specified by `Platform` has a license allocated through an official Alibaba Cloud channel. If yes, the allocated license is used. If not, the license that comes with the source operating system is used.
    // *   Aliyun: The license allocated through an official Alibaba Cloud channel is used for the operating system distribution specified by `Platform`.
    // *   BYOL: The license that comes with the source operating system is used. In this case, make sure that your license key can be used in Alibaba Cloud.
    // 
    // Default value: Auto.
    @NameInMap("LicenseType")
    public String licenseType;

    // The operating system platform. Valid values:
    // 
    // *   windows
    // *   linux
    // 
    // Default value: linux.
    @NameInMap("OSType")
    public String OSType;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The operating system distribution. Valid values:
    // 
    // *   CentOS
    // *   CentOS Stream
    // *   Ubuntu
    // *   SUSE
    // *   openSUSE
    // *   Debian
    // *   CoreOS
    // *   Aliyun
    // *   Anolis
    // *   AlmaLinux
    // *   FreeBSD
    // *   Fedora
    // *   Rocky Linux
    // *   UOS
    // *   Kylin
    // *   Others Linux
    // *   Customized Linux
    // *   Windows Server 2022
    // *   Windows Server 2019
    // *   Windows Server 2016
    // *   Windows Server 2012
    // *   Windows Server 2008
    // *   Windows Server 2003
    // 
    // Default value: Others Linux.
    @NameInMap("Platform")
    public String platform;

    // The region ID of the source custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which to assign the custom image.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The name of the RAM role to use to import the source image.
    @NameInMap("RoleName")
    public String roleName;

    // The tags of the imported custom image.
    @NameInMap("Tag")
    public java.util.List<ImportImageRequestTag> tag;

    public static ImportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageRequest self = new ImportImageRequest();
        return TeaModel.build(map, self);
    }

    public ImportImageRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ImportImageRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ImportImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportImageRequest setDetectionStrategy(String detectionStrategy) {
        this.detectionStrategy = detectionStrategy;
        return this;
    }
    public String getDetectionStrategy() {
        return this.detectionStrategy;
    }

    public ImportImageRequest setDiskDeviceMapping(java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping) {
        this.diskDeviceMapping = diskDeviceMapping;
        return this;
    }
    public java.util.List<ImportImageRequestDiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    public ImportImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ImportImageRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public ImportImageRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ImportImageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportImageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ImportImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportImageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ImportImageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportImageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportImageRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ImportImageRequest setTag(java.util.List<ImportImageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ImportImageRequestTag> getTag() {
        return this.tag;
    }

    public static class ImportImageRequestDiskDeviceMapping extends TeaModel {
        // The device name of disk N in the custom image.
        // 
        // >  This parameter will be removed in the future. To ensure future compatibility, we recommend that you do not use this parameter.
        @NameInMap("Device")
        public String device;

        // The size of the custom image.
        // 
        // >  This parameter will be removed in the future. To ensure future compatibility, we recommend that you use the `DiskDeviceMapping.N.DiskImageSize` parameter.
        @NameInMap("DiskImSize")
        public Integer diskImSize;

        // The size of disk N in the custom image.
        // 
        // You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the custom image file. Unit: GiB. Valid values:
        // 
        // *   When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 5 to 500.
        // *   When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 5 to 2000.
        // 
        // After the source image is uploaded to an OSS bucket, you can view the size of the image in the OSS bucket.
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        // The format of the custom image. Valid values:
        // 
        // *   RAW
        // *   VHD
        // *   QCOW2
        // 
        // This parameter is empty by default, which indicates that the system checks the format of the custom image and uses the check result as the value of this parameter.
        @NameInMap("Format")
        public String format;

        // The OSS bucket in which the source image is stored.
        // 
        // >  Before you import images for the first time, you must use RAM to authorize ECS to access your OSS buckets. If ECS is not authorized to access your OSS buckets, the **NoSetRoletoECSServiceAcount** error code is returned when you call the ImportImage operation. For more information, see the `Description` section of this topic.
        @NameInMap("OSSBucket")
        public String OSSBucket;

        // The name (key) of the object that the uploaded source image is stored as in the OSS bucket.
        @NameInMap("OSSObject")
        public String OSSObject;

        public static ImportImageRequestDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestDiskDeviceMapping self = new ImportImageRequestDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public ImportImageRequestDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ImportImageRequestDiskDeviceMapping setDiskImSize(Integer diskImSize) {
            this.diskImSize = diskImSize;
            return this;
        }
        public Integer getDiskImSize() {
            return this.diskImSize;
        }

        public ImportImageRequestDiskDeviceMapping setDiskImageSize(Integer diskImageSize) {
            this.diskImageSize = diskImageSize;
            return this;
        }
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        public ImportImageRequestDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ImportImageRequestDiskDeviceMapping setOSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        public ImportImageRequestDiskDeviceMapping setOSSObject(String OSSObject) {
            this.OSSObject = OSSObject;
            return this;
        }
        public String getOSSObject() {
            return this.OSSObject;
        }

    }

    public static class ImportImageRequestTag extends TeaModel {
        // The key of tag N to add to the custom image. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
        @NameInMap("Key")
        public String key;

        // The value of tag N to add to the custom image. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static ImportImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestTag self = new ImportImageRequestTag();
            return TeaModel.build(map, self);
        }

        public ImportImageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ImportImageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
