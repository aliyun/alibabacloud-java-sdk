// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>The system architecture. After a data disk snapshot is specified as the system disk of the image, use this parameter to specify the system architecture of the system disk. Valid values:</p>
     * <ul>
     * <li>i386.</li>
     * <li>x86_64.</li>
     * <li>arm64.</li>
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
     * <li>BIOS: BIOS boot mode.</li>
     * <li>UEFI: UEFI boot mode.</li>
     * <li>(Default) UEFI-Preferred: dual boot mode.</li>
     * </ul>
     * <notice>
     * 
     * <p>To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot modes supported by the target image before specifying this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
     * </notice>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageTestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image detection strategy. If this parameter is not specified, detection is not triggered. Only the Standard detection mode is supported. </p>
     * <blockquote>
     * <p>Most Linux and Windows versions are supported. For more information about image detection items and operating system limitations, see <a href="https://help.aliyun.com/document_detail/439819.html">Image detection overview</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating system limitations for image detection</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    /**
     * <p>The disk and snapshot information used to create the custom image. Use this parameter to specify snapshots when you want to create a custom image from system disk and data disk snapshots.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<CreateImageRequestDiskDeviceMapping> diskDeviceMapping;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The image feature properties.</p>
     */
    @NameInMap("Features")
    public CreateImageRequestFeatures features;

    /**
     * <p>The image family name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with aliyun or acs:. It cannot contain http:// or https://. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The image name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TestCentOS</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The image version.</p>
     * <blockquote>
     * <p>If you specify an instance ID (<code>InstanceId</code>) and the image of the instance is an Alibaba Cloud Marketplace image or a custom image created from an Alibaba Cloud Marketplace image, this parameter must be the same as the <code>ImageVersion</code> of the current instance image or left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017011017</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>The instance ID. This parameter is required when you create a custom image from an instance.</p>
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
     * <p>The operating system distribution. After a data disk snapshot is specified as the system disk of the image, use this parameter to specify the operating system distribution of the system disk. Valid values:</p>
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
     * <p>The region ID of the image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the custom image belongs. If this parameter is not set, the created image belongs to the default resource group.</p>
     * <blockquote>
     * <p>If you invoke this operation as a Resource Access Management (RAM) user and <code>ResourceGroupId</code> is left empty, note that when the RAM user does not have permissions on the default resource group, the error message <code>Forbidden: User not authorized to operate on the specified resource</code> is returned. Set a resource group ID that the RAM user has permissions on, or grant the RAM user permissions on the default resource group before invoking this operation again.</p>
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
     * <p>The snapshot ID used to create the custom image.</p>
     * <blockquote>
     * <p>If you want to create a custom image only from the system disk snapshot of an instance, you can use this parameter or the <code>DiskDeviceMapping.N.SnapshotId</code> parameter. To include data disk snapshots, use only the <code>DiskDeviceMapping.N.SnapshotId</code> parameter to specify snapshots.</p>
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
         * <p>The device name in the custom image. Valid values:</p>
         * <ul>
         * <li><p>The device name of the system disk must be /dev/xvda.</p>
         * </li>
         * <li><p>Data disk device names are sequentially ordered from /dev/xvdb to /dev/xvdz and cannot be duplicated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The type of the disk in the new image. You can use this parameter to specify a data disk snapshot as the system disk of the image. If this parameter is not specified, the disk type defaults to the type of the disk corresponding to the snapshot. Valid values:</p>
         * <ul>
         * <li>system: system disk. Only one system disk snapshot can be specified.</li>
         * <li>data: data disk. Up to 16 data disk snapshots can be specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The size of the disk, in GiB. The valid values and default value of DiskDeviceMapping.N.Size depend on DiskDeviceMapping.N.SnapshotId:</p>
         * <ul>
         * <li>If SnapshotId is not specified, the valid values and default value of Size are:<ul>
         * <li>Basic disk: 5 to 2000 GiB. Default value: 5.</li>
         * <li>Other disk types: 20 to 32768 GiB. Default value: 20.</li>
         * </ul>
         * </li>
         * <li>If SnapshotId is specified, the value of Size must be greater than or equal to the size of the snapshot. Default value: the size of the snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot ID.</p>
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
         * <p>The metadata access mode of the image. Valid values:</p>
         * <ul>
         * <li>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to &quot;security hardening mode only&quot;.</li>
         * <li>v2: When you create an ECS instance from this image, you can set the metadata access mode to &quot;security hardening mode only&quot;.</li>
         * </ul>
         * <p>Default value: When creating an image from a snapshot, the default is v1. When creating an image from an instance, the default is the ImdsSupport value of the image used when the instance was created.</p>
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
         * <p>The tag key of the image. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the image. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
