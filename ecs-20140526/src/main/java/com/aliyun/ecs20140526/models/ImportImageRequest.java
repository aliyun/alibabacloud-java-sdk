// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    /**
     * <p>The system architecture. Valid values:</p>
     * <br>
     * <p>*   i386</p>
     * <p>*   x86_64</p>
     * <p>*   arm64</p>
     * <br>
     * <p>Default value: x86_64.</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The boot mode of the image. Valid values:</p>
     * <br>
     * <p>*   BIOS</p>
     * <p>*   UEFI</p>
     * <br>
     * <p>Default value: BIOS. If you set `Architecture` to arm64, set this parameter to UEFI.</p>
     * <br>
     * <p>> Make sure that you are aware of the boot modes supported by the specified image, as thehe modified boot mode needs to be supported by the image. This way, instances that use this image can start.</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The image description. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The mode in which to check the image. If you do not specify this parameter, the image is not checked. Only the standard check mode is supported.</p>
     * <br>
     * <p>>  This parameter is supported for most Linux and Windows operating system versions. For more information about image check items and operating system limits for image check, see [Overview](https://help.aliyun.com/document_detail/439819.html) and [Operating system limits for image check](https://help.aliyun.com/document_detail/475800.html).</p>
     */
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    /**
     * <p>The information about the custom image.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

    /**
     * <p>The image name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `acs:` or `aliyun`. The name cannot contain `http://` or `https://`. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The type of the license used to activate the operating system after the image is imported. Valid values:</p>
     * <br>
     * <p>*   Auto: ECS checks the operating system of the image and allocates a license to the operating system. ECS first checks whether the operating system distribution specified by `Platform` has a license allocated through an official Alibaba Cloud channel. If yes, the allocated license is used. If no, the license that comes with the source operating system is used.</p>
     * <p>*   Aliyun: The license allocated through an official Alibaba Cloud channel is used for the operating system distribution specified by `Platform`.</p>
     * <p>*   BYOL: The license that comes with the source operating system is used. In this case, make sure that your license key is eligible for use in Alibaba Cloud.</p>
     * <br>
     * <p>Default value: Auto.</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The operating system platform. Valid values:</p>
     * <br>
     * <p>*   windows</p>
     * <p>*   linux</p>
     * <br>
     * <p>Default value: linux.</p>
     */
    @NameInMap("OSType")
    public String OSType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operating system distribution. Valid values:</p>
     * <br>
     * <p>*   Aliyun</p>
     * <p>*   Anolis</p>
     * <p>*   CentOS</p>
     * <p>*   Ubuntu</p>
     * <p>*   CoreOS</p>
     * <p>*   SUSE</p>
     * <p>*   Debian</p>
     * <p>*   OpenSUSE</p>
     * <p>*   FreeBSD</p>
     * <p>*   RedHat</p>
     * <p>*   Kylin</p>
     * <p>*   UOS</p>
     * <p>*   Fedora</p>
     * <p>*   Fedora CoreOS</p>
     * <p>*   CentOS Stream</p>
     * <p>*   AlmaLinux</p>
     * <p>*   Rocky Linux</p>
     * <p>*   Gentoo</p>
     * <p>*   Customized Linux</p>
     * <p>*   Others Linux</p>
     * <p>*   Windows Server 2022</p>
     * <p>*   Windows Server 2019</p>
     * <p>*   Windows Server 2016</p>
     * <p>*   Windows Server 2012</p>
     * <p>*   Windows Server 2008</p>
     * <p>*   Windows Server 2003</p>
     * <br>
     * <p>Default value: Others Linux.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the source image. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the image.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the RAM role used to import the image.</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the cloud box, which is used to uniquely identify a storage location in the cloud.</p>
     * <br>
     * <p>>  Specify this parameter only if you import an image from OSS on CloudBox. Otherwise, you do not need to specify this parameter. For more information, see [What is OSS on CloudBox?](https://help.aliyun.com/document_detail/430190.html)</p>
     * <br>
     * <p>The ARN must be in the following format: `arn:acs:cloudbox:{RegionId}:{AliUid}:cloudbox/{CloudBoxId}`. Replace `{RegionId}` with the region ID of the cloud box, `{AliUid}` with the ID of the Alibaba Cloud account to which the cloud box belongs, and `{CloudBoxId}` with the ID of the cloud box.</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The image tags.</p>
     */
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

    public ImportImageRequest setStorageLocationArn(String storageLocationArn) {
        this.storageLocationArn = storageLocationArn;
        return this;
    }
    public String getStorageLocationArn() {
        return this.storageLocationArn;
    }

    public ImportImageRequest setTag(java.util.List<ImportImageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ImportImageRequestTag> getTag() {
        return this.tag;
    }

    public static class ImportImageRequestDiskDeviceMapping extends TeaModel {
        /**
         * <p>The device name of disk N in the custom image.</p>
         * <br>
         * <p>>  This parameter will be removed in the future. We recommend that you do not use this parameter to ensure future compatibility.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of disk N in the custom image. Unit: GiB</p>
         * <br>
         * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the imported image file. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 5 to 500.</p>
         * <p>*   When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 5 to 2000.</p>
         * <br>
         * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
         * <br>
         * <p>>  This parameter will be removed in the future. We recommend that you use `DiskDeviceMapping.N.DiskImageSize` to ensure future compatibility.</p>
         */
        @NameInMap("DiskImSize")
        public Integer diskImSize;

        /**
         * <p>The size of disk N in the custom image after the image is imported.</p>
         * <br>
         * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the imported image file. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 5 to 500.</p>
         * <p>*   When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 5 to 2000.</p>
         * <br>
         * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The image format. Valid values:</p>
         * <br>
         * <p>*   RAW</p>
         * <p>*   VHD</p>
         * <p>*   QCOW2</p>
         * <br>
         * <p>This parameter is empty by default, which indicates that the system checks the format of the image and uses the check result as the value of this parameter.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket where the image file is stored.</p>
         * <br>
         * <p>>  Before you import images for the first time, you must use RAM to authorize ECS to access your OSS buckets. If ECS is not authorized to access your OSS buckets, the `NoSetRoletoECSServiceAcount` error code is returned when you call the ImportImage operation. For more information, see the "**Usage notes**" section in this topic.</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The name (key) of the object that the uploaded image is stored as in the OSS bucket.</p>
         */
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
        /**
         * <p>The key of tag N of the image. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the image. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:`.</p>
         */
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
