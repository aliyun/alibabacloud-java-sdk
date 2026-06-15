// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>The system disk architecture. If you create the image\&quot;s system disk from a data disk snapshot, you must specify this parameter to identify the system disk architecture. Valid values:</p>
     * <ul>
     * <li><p>i386</p>
     * </li>
     * <li><p>x86_64</p>
     * </li>
     * <li><p>arm64</p>
     * </li>
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
     * <li><p>BIOS: BIOS boot mode.</p>
     * </li>
     * <li><p>UEFI: UEFI boot mode.</p>
     * </li>
     * <li><p>UEFI-Preferred: The image supports both BIOS and UEFI boot modes. The UEFI boot mode is preferred. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If you specify a boot mode that the image does not support, instances created from the image may fail to start. Before you specify this parameter, ensure you know the boot modes that the image supports. For more information, see <a href="~~2244655#b9caa9b8bb1wf~~">Boot modes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>A client-generated token to ensure the request is idempotent. You must ensure that the token is unique across different requests. The <code>ClientToken</code> value can contain only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The image description. It must be 2 to 256 characters long and cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageTestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image check policy. If you do not specify this parameter, no check is performed. Only the Standard mode is supported.</p>
     * <blockquote>
     * <p>This feature is supported for most Linux and Windows versions. For more information about the check items and the operating systems that support this feature, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image check</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating systems that support image check</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    /**
     * <p>The mappings between disks and snapshots used to create the custom image. If you need to create a custom image from a system disk snapshot and data disk snapshots, specify this parameter.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<CreateImageRequestDiskDeviceMapping> diskDeviceMapping;

    /**
     * <p>Specifies whether to perform a dry run to check the request. Valid values:</p>
     * <ul>
     * <li><p>true: performs a dry run but does not create the image. The system checks whether your AccessKey pair is valid, whether RAM users are granted permissions, and whether the required parameters are specified. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p>false: Sends the request to perform the operation. If the request is valid, a 2xx HTTP status code is returned and the image is created.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The image attributes.</p>
     */
    @NameInMap("Features")
    public CreateImageRequestFeatures features;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters long and start with a letter or a Chinese character. It cannot start with aliyun or acs:, nor contain http\:// or https\://. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters long. It must start with a letter or a Chinese character and must not start with http\:// or https\://. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TestCentOS</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The version of the image.</p>
     * <blockquote>
     * <p>If you specify an instance ID (<code>InstanceId</code>) and the instance was created from an Alibaba Cloud Marketplace image (or a custom image based on a Marketplace image), this parameter must match the <code>ImageVersion</code> of the instance\&quot;s image or be left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017011017</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>The ID of the instance. This parameter is required when you create a custom image from an instance.</p>
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
     * <p>The operating system distribution. You must specify this parameter to identify the operating system distribution when you use a data disk snapshot to create the image\&quot;s system disk. Valid values:</p>
     * <ul>
     * <li><p>Aliyun</p>
     * </li>
     * <li><p>Anolis</p>
     * </li>
     * <li><p>CentOS</p>
     * </li>
     * <li><p>Ubuntu</p>
     * </li>
     * <li><p>CoreOS</p>
     * </li>
     * <li><p>SUSE</p>
     * </li>
     * <li><p>Debian</p>
     * </li>
     * <li><p>OpenSUSE</p>
     * </li>
     * <li><p>FreeBSD</p>
     * </li>
     * <li><p>RedHat</p>
     * </li>
     * <li><p>Kylin</p>
     * </li>
     * <li><p>UOS</p>
     * </li>
     * <li><p>Fedora</p>
     * </li>
     * <li><p>Fedora CoreOS</p>
     * </li>
     * <li><p>CentOS Stream</p>
     * </li>
     * <li><p>AlmaLinux</p>
     * </li>
     * <li><p>Rocky Linux</p>
     * </li>
     * <li><p>Gentoo</p>
     * </li>
     * <li><p>Customized Linux</p>
     * </li>
     * <li><p>Others Linux</p>
     * </li>
     * <li><p>Windows Server 2022</p>
     * </li>
     * <li><p>Windows Server 2019</p>
     * </li>
     * <li><p>Windows Server 2016</p>
     * </li>
     * <li><p>Windows Server 2012</p>
     * </li>
     * <li><p>Windows Server 2008</p>
     * </li>
     * <li><p>Windows Server 2003</p>
     * </li>
     * </ul>
     * <p>Default value: Others Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The ID of the region where the image will be created. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to get the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to add the custom image. If you do not specify this parameter, the image is added to the default resource group.</p>
     * <blockquote>
     * <p>As a RAM user, you must have the required permissions to call this operation. If you leave <code>ResourceGroupId</code> empty, the <code>Forbidden: User not authorized to operate on the specified resource</code> error is returned if you lack permissions on the default resource group. To resolve this issue, specify the ID of a resource group for which you have permissions, or ask an administrator to grant you permissions on the default resource group.</p>
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
     * <p>The ID of the snapshot used to create the custom image.</p>
     * <blockquote>
     * <p>If you create a custom image from only a system disk snapshot, you can use either this parameter or the <code>DiskDeviceMapping.N.SnapshotId</code> parameter. If you want to include data disk snapshots, you must use the <code>DiskDeviceMapping.N.SnapshotId</code> parameter to specify the snapshots.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-bp17441ohwkdca0****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tags to add to the image.</p>
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
         * <p>The device name of the disk in the custom image. Valid values:</p>
         * <ul>
         * <li><p>The device name of the system disk must be /dev/xvda.</p>
         * </li>
         * <li><p>The device names of data disks are assigned in sequence from /dev/xvdb to /dev/xvdz and cannot be repeated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The type of the disk in the image. You can specify this parameter to use a data disk snapshot as the system disk of the image. If you do not specify this parameter, the disk type is determined by the type of the source snapshot. Valid values:</p>
         * <ul>
         * <li><p>system: system disk. You can specify only one system disk snapshot.</p>
         * </li>
         * <li><p>data: data disk. You can specify a maximum of 16 data disk snapshots.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The size of the cloud disk, in GiB. The valid values and default value of <code>DiskDeviceMapping.N.Size</code> vary based on whether <code>DiskDeviceMapping.N.SnapshotId</code> is specified.</p>
         * <ul>
         * <li><p>If <code>DiskDeviceMapping.N.SnapshotId</code> is not specified, the value of this parameter depends on the disk type:</p>
         * <ul>
         * <li><p>For basic disks, the value range is 5 to 2,000 and the default value is 5.</p>
         * </li>
         * <li><p>For other disk types, the value range is 20 to 32,768 and the default value is 20.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <code>DiskDeviceMapping.N.SnapshotId</code> is specified, the value of <code>DiskDeviceMapping.N.Size</code> must be greater than or equal to the snapshot\&quot;s size. The default value is the snapshot\&quot;s size.</p>
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
         * <p>The instance metadata access mode. Valid values:</p>
         * <ul>
         * <li><p>v1: The normal mode. When you create an ECS instance from an image that has the metadata access mode set to this value, you cannot configure the instance metadata access mode as Enforced.</p>
         * </li>
         * <li><p>v2: The enforced mode. When you create an ECS instance from an image that has the metadata access mode set to this value, you can configure the instance metadata access mode as Enforced.</p>
         * </li>
         * </ul>
         * <p>Default value: v1 if you create the image from a snapshot. If you create the image from an instance, the value is inherited from the source instance\&quot;s image.</p>
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
         * <p>The key of tag N to add to the image.</p>
         * <blockquote>
         * <p>For compatibility, we recommend that you use the <code>Tag.N.Key</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the image. Valid values of N: 1 to 20. The tag value can be an empty string, up to 128 characters long, and cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
