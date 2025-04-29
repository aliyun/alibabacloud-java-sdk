// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>The system architecture of the system disk. If you specify a data disk snapshot to create the system disk of the custom image, use Architecture to specify the system architecture of the system disk. Valid values:</p>
     * <ul>
     * <li>i386</li>
     * <li>x86_64</li>
     * <li>arm64</li>
     * </ul>
     * <p>Default value: x86_64.</p>
     * 
     * <strong>example:</strong>
     * <p>x86_64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The boot mode of the image. Valid values:</p>
     * <ul>
     * <li>BIOS: BIOS mode</li>
     * <li>UEFI: Unified Extensible Firmware Interface (UEFI) mode</li>
     * <li>UEFI-Preferred (default): BIOS mode and UEFI mode</li>
     * </ul>
     * <blockquote>
     * <p> Before you specify this parameter, make sure that you are familiar with the boot modes supported by the image. If you specify a boot mode that is not supported by the image, ECS instances created from the image cannot start as expected. For information about the boot modes of images, see the <a href="~~2244655#b9caa9b8bb1wf~~">Boot modes of images</a> section of the &quot;Best practices for ECS instance boot modes&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The image description. The description must be 2 to 256 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://.</a></p>
     * 
     * <strong>example:</strong>
     * <p>ImageTestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The mode in which to check the custom image. If you do not specify this parameter, the image is not checked. Only the standard check mode is supported.</p>
     * <blockquote>
     * <p> This parameter is supported for most Linux and Windows operating system versions. For information about image check items and operating system limits for image check, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image check</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating system limits for image check</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    /**
     * <p>Details of the disks and snapshots from which the custom image is created. If you want to create a custom image based on a system disk snapshot and data disk snapshots, use this parameter to specify the snapshots.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<CreateImageRequestDiskDeviceMapping> diskDeviceMapping;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The attributes of the custom image.</p>
     */
    @NameInMap("Features")
    public CreateImageRequestFeatures features;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with acs: or aliyun. The name cannot contain http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TestCentOS</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The image version.</p>
     * <blockquote>
     * <p> If you specify an ECS instance that runs an Alibaba Cloud Marketplace image or a custom image derived from an Alibaba Cloud Marketplace image by using <code>InstanceId</code>, you must leave this parameter empty or set this parameter to the <code>ImageVersion</code> value of the image run by the specified ECS instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017011017</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>The ID of the ECS instance from which to create the custom image. To create a custom image from an ECS instance, you must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6zv0ce8oghu7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operating system distribution for the system disk in the custom image. If you specify a data disk snapshot to create the system disk of the custom image, use Platform to specify the operating system distribution for the system disk. Valid values:</p>
     * <ul>
     * <li>Aliyun</li>
     * <li>Anolis</li>
     * <li>CentOS</li>
     * <li>Ubuntu</li>
     * <li>CoreOS</li>
     * <li>SUSE</li>
     * <li>Debian</li>
     * <li>OpenSUSE</li>
     * <li>FreeBSD</li>
     * <li>RedHat</li>
     * <li>Kylin</li>
     * <li>UOS</li>
     * <li>Fedora</li>
     * <li>Fedora CoreOS</li>
     * <li>CentOS Stream</li>
     * <li>AlmaLinux</li>
     * <li>Rocky Linux</li>
     * <li>Gentoo</li>
     * <li>Customized Linux</li>
     * <li>Others Linux</li>
     * <li>Windows Server 2022</li>
     * <li>Windows Server 2019</li>
     * <li>Windows Server 2016</li>
     * <li>Windows Server 2012</li>
     * <li>Windows Server 2008</li>
     * <li>Windows Server 2003</li>
     * </ul>
     * <p>Default value: Others Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the custom image that you want to create. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the custom image. If you leave this parameter empty, the image is assigned to the default resource group.</p>
     * <blockquote>
     * <p> If you call the CreateImage operation as a Resource Access Management (RAM) user who does not have permissions on the default resource group and leave <code>ResourceGroupId</code> empty, the <code>Forbidden: User not authorized to operate on the specified resource</code> error message is returned. You must specify the ID of a resource group on which the RAM user has permissions or grant the RAM user permissions on the default resource group, and then call the CreateImage operation again.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the snapshot from which to create the custom image.</p>
     * <blockquote>
     * <p> To create a custom image from only a system disk snapshot of an ECS instance, you can specify this parameter or <code>DiskDeviceMapping.N.SnapshotId</code> to specify the snapshot ID. If you add data disk snapshots, you can use only <code>DiskDeviceMapping.N.SnapshotId</code> to specify snapshots.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-bp17441ohwkdca0****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tags.</p>
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

    public CreateImageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateImageRequest setFeatures(CreateImageRequestFeatures features) {
        this.features = features;
        return this;
    }
    public CreateImageRequestFeatures getFeatures() {
        return this.features;
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
         * <ul>
         * <li>The device name of the system disk must be /dev/xvda.</li>
         * <li>The device names of the data disks are unique and range from /dev/xvdb to /dev/xvdz in alphabetical order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/dev/vdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The type of disk N in the custom image. You can specify this parameter to create the system disk of the custom image from a data disk snapshot. If you do not specify this parameter, the disk type is determined by the corresponding snapshot. Valid values:</p>
         * <ul>
         * <li>system: system disk. You can specify only one snapshot to use to create the system disk in the custom image.</li>
         * <li>data: data disk. You can specify up to 16 snapshots to use to create data disks in the custom image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The size of disk N in the custom image. Unit: GiB. The valid values and default value of DiskDeviceMapping.N.Size vary based on the value of DiskDeviceMapping.N.SnapshotId.</p>
         * <ul>
         * <li><p>If you leave DiskDeviceMapping.N.SnapshotId empty, DiskDeviceMapping.N.Size has the following valid values and default values:</p>
         * <ul>
         * <li>For basic disks, the valid values range from 5 to 2000, and the default value is 5.</li>
         * <li>For other disks, the valid values range from 20 to 32768, and the default value is 20.</li>
         * </ul>
         * </li>
         * <li><p>If you specify DiskDeviceMapping.N.SnapshotId, the value of DiskDeviceMapping.N.Size must be greater than or equal to the size of the specified snapshot. The default value of DiskDeviceMapping.N.Size is the size of the specified snapshot.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwkdca0****</p>
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

    public static class CreateImageRequestFeatures extends TeaModel {
        /**
         * <p>The image metadata access mode. Valid values:</p>
         * <ul>
         * <li>v1: You cannot set the image metadata access mode to security hardening when you create instances from the image.</li>
         * <li>v2: You can set the image metadata access mode to security hardening when you create instances from the image.</li>
         * </ul>
         * <p>When you use a snapshot to create instances, the default value is set to 1. If you use an instance to create an image, the value of the ImdsSupport parameter is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        public static CreateImageRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestFeatures self = new CreateImageRequestFeatures();
            return TeaModel.build(map, self);
        }

        public CreateImageRequestFeatures setImdsSupport(String imdsSupport) {
            this.imdsSupport = imdsSupport;
            return this;
        }
        public String getImdsSupport() {
            return this.imdsSupport;
        }

    }

    public static class CreateImageRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the custom image. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the custom image. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
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
