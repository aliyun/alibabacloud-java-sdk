// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>The system architecture of the system disk. If you specify a data disk snapshot to create the system disk of the custom image, you must use the Architecture parameter to specify the system architecture of the system disk. Valid values:</p>
     * <br>
     * <p>*   i386</p>
     * <p>*   x86\_64</p>
     * <p>*   arm64</p>
     * <br>
     * <p>Default value: x86\_64.</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The boot mode of the custom image. Valid values:</p>
     * <br>
     * <p>*   BIOS</p>
     * <p>*   UEFI</p>
     * <br>
     * <p>> You must be aware of the boot modes supported by the image. When you use this parameter to change the boot mode of an image, specify a boot mode supported by the image to ensure that instances that use this image can start as expected.</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the custom image. The description must be 2 to 256 characters in length and cannot start with [http:// or https://.](http://https://。)</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The mode in which to check the source image. If you do not specify this parameter, the source image is not checked. Only Linux images can be checked. Set the value to Standard, which indicates the standard check mode.</p>
     * <br>
     * <p>The following items are checked in standard check mode:</p>
     * <br>
     * <p>*   Virtio: whether the virtio driver is installed.</p>
     * <p>*   Fstab: whether mount configurations in the fstab file are correct.</p>
     * <p>*   Grub: whether GRand Unified Bootloader (GRUB) configurations are correct.</p>
     * <p>*   SystemImage: whether the image is valid. Do not import images that are in the ISO format or empty.</p>
     * <p>*   CloudInit: whether cloud-init is installed.</p>
     * <p>*   NVMe: whether the Non-Volatile Memory Express (NVMe) driver is installed.</p>
     * <p>*   Selinux: whether SElinux is enabled.</p>
     * <p>*   OnlineResizeFS: whether the root partition can be automatically resized.</p>
     * <p>*   Dhcp: whether Dynamic Host Configuration Protocol (DHCP) is enabled for network interfaces.</p>
     * <p>*   RtcTimeMode: the real-time clock (RTC) time mode.</p>
     * <p>*   Platform: the platform. Example: Linux or Windows.</p>
     * <p>*   OSVersion: the operating system version. Example: Centos 7.9.</p>
     * <p>*   Architecture: the architecture. Example: ARM or x86\_64.</p>
     * <p>*   BootMode: the boot mode. Example: UEFI or Legacy.</p>
     * <p>*   KernelVersion: the kernel version.</p>
     * <p>*   CloudAssistant: whether the Cloud Assistant client is installed.</p>
     * <p>*   SecurityCenterAgent: whether the Security Center agent is installed.</p>
     */
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    /**
     * <p>The information of the custom image.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<CreateImageRequestDiskDeviceMapping> diskDeviceMapping;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`. The name can contain letters, digits, colons (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The version of the custom image.</p>
     * <br>
     * <p>> If you specify an instance by setting the `InstanceId` parameter and the instance uses an Alibaba Cloud Marketplace image or a custom image derived from an Alibaba Cloud Marketplace image, the ImageVersion parameter must be left empty or set to the image version of the specified instance.</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>The ID of the instance that is used to create the custom image.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The distribution of the operating system for the system disk in the custom image. If you specify a data disk snapshot to create the system disk of the custom image, you must use the Platform parameter to specify the distribution of the operating system for the system disk. Valid values:</p>
     * <br>
     * <p>*   CentOS</p>
     * <p>*   Ubuntu</p>
     * <p>*   SUSE</p>
     * <p>*   OpenSUSE</p>
     * <p>*   RedHat</p>
     * <p>*   Debian</p>
     * <p>*   CoreOS</p>
     * <p>*   Aliyun</p>
     * <p>*   Windows Server 2012</p>
     * <p>*   Windows 7</p>
     * <p>*   Customized Linux</p>
     * <p>*   Others Linux</p>
     * <br>
     * <p>Default value: Others Linux.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The ID of the region in which to create the custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the custom image. If you do not specify this parameter, the image is assigned to the default resource group.</p>
     * <br>
     * <p>> If you call the CopyImage operation as a RAM user who is not authorized to manage the default resource group and do not specify the `ResourceGroupId` parameter, the `Forbbiden: User not authorized to operate on the specified resource` error message is returned. You must specify the ID of a resource group that the RAM user is authorized to manage or authorize the RAM user to manage the default resource group before you call the CopyImage operation again.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the snapshot that is used to create the custom image.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tags to add to the custom image.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImageRequestTag> tag;

    public static CreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRequest self = new CreateImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateImageRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public CreateImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImageRequest setDetectionStrategy(String detectionStrategy) {
        this.detectionStrategy = detectionStrategy;
        return this;
    }
    public String getDetectionStrategy() {
        return this.detectionStrategy;
    }

    public CreateImageRequest setDiskDeviceMapping(java.util.List<CreateImageRequestDiskDeviceMapping> diskDeviceMapping) {
        this.diskDeviceMapping = diskDeviceMapping;
        return this;
    }
    public java.util.List<CreateImageRequestDiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    public CreateImageRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateImageRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

    public CreateImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateImageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateImageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateImageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateImageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateImageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateImageRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateImageRequest setTag(java.util.List<CreateImageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateImageRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateImageRequestDiskDeviceMapping extends TeaModel {
        /**
         * <p>The device name of disk N in the custom image. Valid values:</p>
         * <br>
         * <p>*   For disk categories other than basic disks, such as standard SSDs, ultra disks, and enhanced SSDs (ESSDs), the valid values are in the /dev/vd? format in alphabetical order from /dev/vda to /dev/vdz.</p>
         * <p>*   For basic disks, the valid values are in the /dev/xvd? format in alphabetical order from /dev/xvda to /dev/xvdz.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The type of disk N in the custom image. You can set this parameter to create the system disk of the custom image from a data disk snapshot. If you do not set this parameter, the disk type is determined by the corresponding snapshot. Valid values:</p>
         * <br>
         * <p>*   system: system disk</p>
         * <p>*   data: data disk</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The size of disk N in the custom image. Unit: GiB. The valid values and default value of DiskDeviceMapping.N.Size depend on DiskDeviceMapping.N.SnapshotId.</p>
         * <br>
         * <p>*   If no corresponding snapshot IDs are specified in the DiskDeviceMapping.N.SnapshotId value, the following valid values and default values are available for DiskDeviceMapping.N.Size:</p>
         * <br>
         * <p>    *   For basic disks, the valid values are 5 to 2000, and the default value is 5.</p>
         * <p>    *   For other disk categories, the valid values are 20 to 32768, and the default value is 20.</p>
         * <br>
         * <p>*   If a corresponding snapshot ID is specified in the DiskDeviceMapping.N.SnapshotId value, the value of DiskDeviceMapping.N.Size must be greater than or equal to the size of the specified snapshot. The default value of DiskDeviceMapping.N.Size is the size of the specified snapshot.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of snapshot N that is used to create the custom image.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateImageRequestDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestDiskDeviceMapping self = new CreateImageRequestDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public CreateImageRequestDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateImageRequestDiskDeviceMapping setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CreateImageRequestDiskDeviceMapping setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateImageRequestDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateImageRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the custom image. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the custom image. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with `acs:` or contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestTag self = new CreateImageRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateImageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
