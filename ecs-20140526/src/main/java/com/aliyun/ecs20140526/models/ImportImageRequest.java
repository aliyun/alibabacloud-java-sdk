// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    /**
     * <p>The system architecture. Valid values: </p>
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
     * </ul>
     * <p>Default value: BIOS. If <code>Architecture=arm64</code>, the default value is UEFI, and only UEFI is supported.</p>
     * <notice>
     * 
     * <p>To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot mode supported by the target image before you set this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
     * <p></notice>.</p>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image detection strategy. If this parameter is not specified, detection is not triggered. Only the Standard detection mode is supported.</p>
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
     * <p>The information list of the custom image to create.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized RAM users, and missing parameter values. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: performs a dry run and sends the request. If the request passes the dry run, a 2XX HTTP status code is returned and the resource status is queried.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The image feature-related properties.</p>
     */
    @NameInMap("Features")
    public ImportImageRequestFeatures features;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ImageTestName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The license type. This parameter specifies the authorization mode when instances are created by calling <a href="https://help.aliyun.com/document_detail/2679677.html">RunInstances</a> with the image. This value takes effect only for Windows Server images. Valid values:</p>
     * <ul>
     * <li>Aliyun: Use the Alibaba Cloud official license. After the instance starts, the system attempts to automatically connect to the Alibaba Cloud KMS server for activation. The billing for the instance includes the Windows Server license fee.</li>
     * <li>BYOL: Bring Your Own License. After the instance starts, Alibaba Cloud does not automatically activate it. You must manually activate it by using your own valid license key. The billing for the instance does not include the Windows Server license fee.</li>
     * </ul>
     * <p>Default value: Aliyun.</p>
     * 
     * <strong>example:</strong>
     * <p>BYOL</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The operating system type. Valid values: </p>
     * <ul>
     * <li>windows. You must also set <code>LicenseType</code>.</li>
     * <li>linux.</li>
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
     * <p>The operating system version. Valid values: </p>
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
     * <li>Other Windows</li>
     * </ul>
     * <p>Default value: Others Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the source custom image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group to which the imported image belongs.</p>
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
     * <p>The Alibaba Cloud Resource Name (ARN) of the CloudBox, which is used to uniquely identify the cloud storage location.</p>
     * <blockquote>
     * <p>You need to specify this parameter only when you import an image file from OSS on CloudBox. If you do not use OSS on CloudBox, do not set this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/430190.html">What is OSS on CloudBox</a>.</p>
     * </blockquote>
     * <p>The ARN must follow this format: <code>arn:acs:cloudbox:{RegionId}:{AliUid}:cloudbox/{CloudBoxId}</code>, where <code>{RegionId}</code> is the region ID of the CloudBox, <code>{AliUid}</code> is the Alibaba Cloud account ID, and <code>{CloudBoxId}</code> is the CloudBox ID.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:acs:cloudbox:cn-hangzhou:123456:cloudbox/cb-xx***123</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The tags of the image.</p>
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
         * <p>The device name of DiskDeviceMapping.N.Device in the custom image.</p>
         * <blockquote>
         * <p>This parameter will be deprecated. For better compatibility, do not use this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of the custom image. Unit: GiB.</p>
         * <p>The size includes the system disk and data disks. Make sure that the system disk space is greater than or equal to the size of the imported image file. Valid values:</p>
         * <ul>
         * <li>When N is 1, the value specifies the system disk size. Valid values: 1 to 2048.</li>
         * <li>When N is 2 to 17, the value specifies the data disk size. Valid values: 1 to 2048.</li>
         * </ul>
         * <p>After you upload the source image file to OSS, you can view the image file size in the OSS bucket.</p>
         * <blockquote>
         * <p>This parameter will be deprecated. For better compatibility, use <code>DiskDeviceMapping.N.DiskImageSize</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskImSize")
        public Integer diskImSize;

        /**
         * <p>The size of the custom image after the image is imported.</p>
         * <p>The size includes the system disk and data disks. Make sure that the system disk space is greater than or equal to the size of the imported image file. Valid values:</p>
         * <ul>
         * <li>When N is 1, the value specifies the system disk size. Valid values: 1 to 2048. Unit: GiB.</li>
         * <li>When N is 2 to 17, the value specifies the data disk size. Valid values: 1 to 2048. Unit: GiB.</li>
         * </ul>
         * <p>After you upload the source image file to OSS, you can view the image file size in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The image format. Valid values:</p>
         * <ul>
         * <li>RAW.</li>
         * <li>VHD.</li>
         * <li>QCOW2.</li>
         * <li>VMDK (in invitational preview).</li>
         * </ul>
         * <p>Default value: null, which indicates that Alibaba Cloud automatically detects the image format. The detected format prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>QCOW2</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket where the image file is stored.</p>
         * <blockquote>
         * <p>Before you import an image to this OSS bucket for the first time, add the RAM authorization policy as described in the <strong>Operation description</strong> section of this topic. Otherwise, the <code>NoSetRoletoECSServiceAccount</code> error is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecsimageos</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The file name (key) of the image file stored in the OSS bucket after the image is uploaded to OSS.</p>
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
         * <li>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to hardened mode only.</li>
         * <li>v2: When you create an ECS instance from this image, you can set the metadata access mode to hardened mode only.</li>
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
         * <li>supported: Instances created from this image support NVMe.</li>
         * <li>unsupported: Instances created from this image do not support NVMe.</li>
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
         * <p>The key of the image tag. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the image tag. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
