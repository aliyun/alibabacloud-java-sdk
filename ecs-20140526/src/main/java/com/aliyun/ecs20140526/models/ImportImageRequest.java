// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    /**
     * <p>The system architecture. Valid values:</p>
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
     * <li><p>BIOS: the BIOS boot mode.</p>
     * </li>
     * <li><p>UEFI: the UEFI boot mode.</p>
     * </li>
     * </ul>
     * <p>Default value: BIOS. If you set <code>Architecture</code> to <code>arm64</code>, the value of this parameter defaults to UEFI and can only be set to UEFI.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>To prevent startup failures, ensure the boot mode you specify is supported by the image. For more information, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>A client-generated token that ensures the idempotence of a request. The token must be unique across requests. The token can contain only ASCII characters and must be no more than 64 characters long. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the image. The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>. Both English and Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The policy for checking the image. If you do not specify this parameter, the system does not check the image. This parameter supports only the standard detection mode. Set the value to <code>Standard</code>.</p>
     * <blockquote>
     * <p>This feature is supported on most Linux and Windows versions. For more information about the check items and the operating systems that support this feature, see <a href="https://help.aliyun.com/document_detail/439819.html">Image detection overview</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating system limitations for image detection</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DetectionStrategy")
    public String detectionStrategy;

    /**
     * <p>A list of disk device mappings for the custom image.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

    /**
     * <p>Specifies whether to perform a dry run for the request. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: performs a check request without executing the actual operation. The system checks whether the request parameters are valid, the request format is correct, and the required permissions are granted. If the check fails, the system returns an error message. If the check succeeds, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><code>false</code>: sends a normal request. After the request passes the check, the system returns a 2xx HTTP status code and performs the operation.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The properties of image features.</p>
     */
    @NameInMap("Features")
    public ImportImageRequestFeatures features;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters long and start with a letter or a Chinese character. It can contain digits, periods (.), colons (:), underscores (_), and hyphens (-). The name cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageTestName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The license type. This parameter sets the licensing model for instances that are created from the image by calling the <a href="https://help.aliyun.com/document_detail/2679677.html">RunInstances</a> operation. This parameter applies only to Windows Server images. Valid values:</p>
     * <ul>
     * <li><p>Aliyun: Uses a license provided by Alibaba Cloud. When you start an instance created from this image, the system attempts to automatically connect to the Alibaba Cloud KMS server for activation. The fees for the instance include the cost of the Windows Server license.</p>
     * </li>
     * <li><p>BYOL: Bring Your Own License. When you start an instance created from this image, Alibaba Cloud does not provide activation. You must use your own license key to manually activate the operating system. The fees for the instance do not include the cost of the Windows Server license.</p>
     * </li>
     * </ul>
     * <p>Default value: Aliyun.</p>
     * 
     * <strong>example:</strong>
     * <p>BYOL</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The operating system type. Valid values:</p>
     * <ul>
     * <li><p><code>windows</code>: You must also set the <code>LicenseType</code> parameter.</p>
     * </li>
     * <li><p><code>linux</code></p>
     * </li>
     * </ul>
     * <p>Default value: linux.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operating system distribution. Valid values:</p>
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
     * <li><p>Other Windows</p>
     * </li>
     * </ul>
     * <p>Default value: Others Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The ID of the region where the source custom image is located. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the imported image belongs.</p>
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
     * <p>The name of the RAM role used to import the image.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSImageImportDefaultRole</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the CloudBox, which uniquely identifies the cloud storage location.</p>
     * <blockquote>
     * <p>You must specify this parameter only when you import an image file from OSS ON CloudBox. If you do not use OSS ON CloudBox, do not specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/430190.html">What is OSS ON CloudBox?</a>.</p>
     * </blockquote>
     * <p>The ARN must be in the <code>arn:acs:cloudbox:{RegionId}:{AliUid}:cloudbox/{CloudBoxId}</code> format. Replace <code>{RegionId}</code> with the ID of the region where the CloudBox is located, <code>{AliUid}</code> with the ID of your Alibaba Cloud account, and <code>{CloudBoxId}</code> with the ID of the CloudBox.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:acs:cloudbox:cn-hangzhou:123456:cloudbox/cb-xx***123</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The tags to add to the image.</p>
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

    public ImportImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public ImportImageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportImageRequest setFeatures(ImportImageRequestFeatures features) {
        this.features = features;
        return this;
    }
    public ImportImageRequestFeatures getFeatures() {
        return this.features;
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
         * <p>The device name of the disk (<code>DiskDeviceMapping.N.Device</code>) in the custom image.</p>
         * <blockquote>
         * <p>This parameter is being phased out. To ensure compatibility, we recommend that you avoid using this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of the disk, in GiB.</p>
         * <p>The system disk size must be greater than or equal to the size of the imported image file. Valid values:</p>
         * <ul>
         * <li><p>For N=1, the disk is a system disk. The value must be in the range of 1 to 2,048.</p>
         * </li>
         * <li><p>For N=2 to 17, the disk is a data disk. The value must be in the range of 1 to 2,048.</p>
         * </li>
         * </ul>
         * <p>After you upload the source image file to an OSS bucket, you can view the size of the file in the bucket.</p>
         * <blockquote>
         * <p>This parameter is being deprecated. For better compatibility, we recommend that you use the <code>DiskDeviceMapping.N.DiskImageSize</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskImSize")
        public Integer diskImSize;

        /**
         * <p>The size of the disk after the image is imported, in GiB.</p>
         * <p>The value of this parameter for the system disk must be greater than or equal to the size of the image file. Valid values:</p>
         * <ul>
         * <li><p>For N=1, the disk is a system disk. The value must be in the range of 1 to 2,048.</p>
         * </li>
         * <li><p>For N=2 to 17, the disk is a data disk. The value must be in the range of 1 to 2,048.</p>
         * </li>
         * </ul>
         * <p>After you upload the source image file to an OSS bucket, you can view the size of the file in the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The format of the image file. Valid values:</p>
         * <ul>
         * <li><p>RAW</p>
         * </li>
         * <li><p>VHD</p>
         * </li>
         * <li><p>QCOW2</p>
         * </li>
         * <li><p>VMDK (This feature is in invitation-only preview.)</p>
         * </li>
         * </ul>
         * <p>Default value: None. If you leave this parameter empty, Alibaba Cloud automatically detects the image format and uses the detected format.</p>
         * 
         * <strong>example:</strong>
         * <p>QCOW2</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket where the image file is stored.</p>
         * <blockquote>
         * <p>Before you import an image from an OSS bucket for the first time, you must add a RAM policy as described in the <strong>Description</strong> section of this topic. Otherwise, the API returns the <code>NoSetRoletoECSServiceAccount</code> error.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecsimageos</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The object key of the image file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_5.4_32.raw</p>
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

    public static class ImportImageRequestFeatures extends TeaModel {
        /**
         * <p>The metadata access mode of the image. Valid values:</p>
         * <ul>
         * <li><p>v1: When you create an ECS instance from the image, you cannot set the metadata access mode to Security-Hardened Mode.</p>
         * </li>
         * <li><p>v2: When you create an ECS instance from the image, you can set the metadata access mode to Security-Hardened Mode.</p>
         * </li>
         * </ul>
         * <p>Default value: v1.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        /**
         * <p>Specifies whether the image supports NVMe. Valid values:</p>
         * <ul>
         * <li><p>supported: Instances created from the image support the NVMe protocol.</p>
         * </li>
         * <li><p>unsupported: Instances created from the image do not support the NVMe protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>supported</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static ImportImageRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestFeatures self = new ImportImageRequestFeatures();
            return TeaModel.build(map, self);
        }

        public ImportImageRequestFeatures setImdsSupport(String imdsSupport) {
            this.imdsSupport = imdsSupport;
            return this;
        }
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        public ImportImageRequestFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class ImportImageRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters long and cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters long, cannot start with <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
