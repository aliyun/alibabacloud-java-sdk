// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    /**
     * <p>The information of the images.</p>
     */
    @NameInMap("Images")
    public DescribeImagesResponseBodyImages images;

    /**
     * <p>The page number returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the image.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of images.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponseBody self = new DescribeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponseBody setImages(DescribeImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeImagesResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem extends TeaModel {
        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The risk that the check item may have.</p>
         */
        @NameInMap("RiskCode")
        public String riskCode;

        /**
         * <p>The severity of the risk that the check item of the imported custom image has. If the check item is at risk, this parameter is returned. If the check item is not at risk, this parameter is not returned.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   High: The check item is a high-risk item that may affect the startup of the instance. We recommend that you handle the risk.</p>
         * <p>*   Medium: The check item is a medium-risk item that may affect the startup performance or configurations of the instance. We recommend that you handle the risk.</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The result of the check item.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem self = new DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem setRiskCode(String riskCode) {
            this.riskCode = riskCode;
            return this;
        }
        public String getRiskCode() {
            return this.riskCode;
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageDetectionOptionsItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem> item;

        public static DescribeImagesResponseBodyImagesImageDetectionOptionsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDetectionOptionsItems self = new DescribeImagesResponseBodyImagesImageDetectionOptionsItems();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptionsItems setItem(java.util.List<DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesImageDetectionOptionsItemsItem> getItem() {
            return this.item;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageDetectionOptions extends TeaModel {
        /**
         * <p>The check items.</p>
         */
        @NameInMap("Items")
        public DescribeImagesResponseBodyImagesImageDetectionOptionsItems items;

        /**
         * <p>The state of the image check task. Valid values:</p>
         * <br>
         * <p>*   Processing</p>
         * <p>*   Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeImagesResponseBodyImagesImageDetectionOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDetectionOptions self = new DescribeImagesResponseBodyImagesImageDetectionOptions();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptions setItems(DescribeImagesResponseBodyImagesImageDetectionOptionsItems items) {
            this.items = items;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageDetectionOptionsItems getItems() {
            return this.items;
        }

        public DescribeImagesResponseBodyImagesImageDetectionOptions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        /**
         * <p>The device name of the disk. Example: /dev/xvdb.</p>
         * <br>
         * <p>>  This parameter will be removed in the future. To ensure compatibility, we recommend that you use other parameters.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The format of the image.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The Object Storage Service (OSS) bucket that contains the imported image file.</p>
         */
        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        /**
         * <p>The OSS object that corresponds to the imported image file.</p>
         */
        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        /**
         * <p>The progress of the image copy task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The remaining time of the image copy task. Unit: seconds.</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The ID of the snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The type of the image.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setImportOSSObject(String importOSSObject) {
            this.importOSSObject = importOSSObject;
            return this;
        }
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImagesResponseBodyImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDiskDeviceMappings self = new DescribeImagesResponseBodyImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageFeatures extends TeaModel {
        /**
         * <p>Indicates whether the image supports the Non-Volatile Memory Express (NVMe) protocol. Valid values:</p>
         * <br>
         * <p>*   supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</p>
         * <p>*   unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static DescribeImagesResponseBodyImagesImageFeatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageFeatures self = new DescribeImagesResponseBodyImagesImageFeatures();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageTagsTag extends TeaModel {
        /**
         * <p>The tag key of the image.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the image.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImagesResponseBodyImagesImageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageTagsTag self = new DescribeImagesResponseBodyImagesImageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagesResponseBodyImagesImageTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeImagesResponseBodyImagesImageTagsTag> tag;

        public static DescribeImagesResponseBodyImagesImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageTags self = new DescribeImagesResponseBodyImagesImageTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageTags setTag(java.util.List<DescribeImagesResponseBodyImagesImageTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesImageTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagesResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The architecture of the image. Valid values:</p>
         * <br>
         * <p>*   i386</p>
         * <p>*   x86\_64</p>
         * <p>*   arm64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The boot mode of the image. Valid values:</p>
         * <br>
         * <p>*   BIOS: Basic Input/Output System (BIOS)</p>
         * <p>*   UEFI: Unified Extensible Firmware Interface (UEFI)</p>
         */
        @NameInMap("BootMode")
        public String bootMode;

        /**
         * <p>The time when the image was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the image.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Details about the check performed on the image.</p>
         */
        @NameInMap("DetectionOptions")
        public DescribeImagesResponseBodyImagesImageDetectionOptions detectionOptions;

        /**
         * <p>The mappings between disks and snapshots in the image.</p>
         */
        @NameInMap("DiskDeviceMappings")
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

        /**
         * <p>The attributes of the image.</p>
         */
        @NameInMap("Features")
        public DescribeImagesResponseBodyImagesImageFeatures features;

        /**
         * <p>The name of the image family.</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The source of the image. Valid values:</p>
         * <br>
         * <p>*   system: a public image provided by Alibaba Cloud</p>
         * <p>*   self: a custom image that you created</p>
         * <p>*   others: a shared image from another Alibaba Cloud account or a community image published by another Alibaba Cloud account</p>
         * <p>*   marketplace: an Alibaba Cloud Marketplace image</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only if you query shared images or community images.</p>
         */
        @NameInMap("ImageOwnerId")
        public Long imageOwnerId;

        /**
         * <p>The version of the image.</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>Indicates whether the image is a copy of another image.</p>
         */
        @NameInMap("IsCopied")
        public Boolean isCopied;

        /**
         * <p>Indicates whether the image is publicly available. Publicly available images include public images provided by Alibaba Cloud and custom images published as community images. Valid values:</p>
         * <br>
         * <p>*   true: The image is publicly available.</p>
         * <p>*   false: The image is publicly unavailable.</p>
         */
        @NameInMap("IsPublic")
        public Boolean isPublic;

        /**
         * <p>Indicates whether the custom image was shared to other Alibaba Cloud accounts.</p>
         */
        @NameInMap("IsSelfShared")
        public String isSelfShared;

        /**
         * <p>Indicates whether you accepted the Terms of Service of the image service that corresponds to the product code.</p>
         */
        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        /**
         * <p>Indicates whether the image supports cloud-init.</p>
         */
        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        /**
         * <p>Indicates whether the image can be used on I/O optimized instances.</p>
         */
        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        /**
         * <p>Indicates whether the image supports logons of non-root users. Valid values:</p>
         * <br>
         * <p>*   true: The image supports logons of non-root users.</p>
         * <p>*   false: The image does not support logons of non-root users.</p>
         */
        @NameInMap("LoginAsNonRootSupported")
        public Boolean loginAsNonRootSupported;

        /**
         * <p>The display name of the operating system in Chinese.</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The display name of the operating system in English.</p>
         */
        @NameInMap("OSNameEn")
        public String OSNameEn;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <br>
         * <p>*   windows</p>
         * <p>*   linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The operating system platform.</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The Alibaba Cloud Marketplace product code of the image.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The creation progress of the image. Unit: percent (%).</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the resource group to which the image belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The state of the image. Valid values:</p>
         * <br>
         * <p>*   UnAvailable: The image is unavailable.</p>
         * <p>*   Available: The image is available.</p>
         * <p>*   Creating: The image is being created.</p>
         * <p>*   CreateFailed: The image failed to be created.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the supplier that published the community image.</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The tags of the image.</p>
         */
        @NameInMap("Tags")
        public DescribeImagesResponseBodyImagesImageTags tags;

        /**
         * <p>Indicates whether the image was used to create ECS instances. Valid values:</p>
         * <br>
         * <p>*   instance: The image was used to create one or more ECS instances.</p>
         * <p>*   none: The image was not used to create ECS instances.</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static DescribeImagesResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImage self = new DescribeImagesResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImagesResponseBodyImagesImage setBootMode(String bootMode) {
            this.bootMode = bootMode;
            return this;
        }
        public String getBootMode() {
            return this.bootMode;
        }

        public DescribeImagesResponseBodyImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseBodyImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseBodyImagesImage setDetectionOptions(DescribeImagesResponseBodyImagesImageDetectionOptions detectionOptions) {
            this.detectionOptions = detectionOptions;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageDetectionOptions getDetectionOptions() {
            return this.detectionOptions;
        }

        public DescribeImagesResponseBodyImagesImage setDiskDeviceMappings(DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImagesResponseBodyImagesImage setFeatures(DescribeImagesResponseBodyImagesImageFeatures features) {
            this.features = features;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageFeatures getFeatures() {
            return this.features;
        }

        public DescribeImagesResponseBodyImagesImage setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImagesResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagesResponseBodyImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImagesResponseBodyImagesImage setImageOwnerId(Long imageOwnerId) {
            this.imageOwnerId = imageOwnerId;
            return this;
        }
        public Long getImageOwnerId() {
            return this.imageOwnerId;
        }

        public DescribeImagesResponseBodyImagesImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImagesResponseBodyImagesImage setIsCopied(Boolean isCopied) {
            this.isCopied = isCopied;
            return this;
        }
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        public DescribeImagesResponseBodyImagesImage setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public DescribeImagesResponseBodyImagesImage setIsSelfShared(String isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        public DescribeImagesResponseBodyImagesImage setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeImagesResponseBodyImagesImage setIsSupportCloudinit(Boolean isSupportCloudinit) {
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        public DescribeImagesResponseBodyImagesImage setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        public DescribeImagesResponseBodyImagesImage setLoginAsNonRootSupported(Boolean loginAsNonRootSupported) {
            this.loginAsNonRootSupported = loginAsNonRootSupported;
            return this;
        }
        public Boolean getLoginAsNonRootSupported() {
            return this.loginAsNonRootSupported;
        }

        public DescribeImagesResponseBodyImagesImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImagesResponseBodyImagesImage setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeImagesResponseBodyImagesImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImagesResponseBodyImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagesResponseBodyImagesImage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeImagesResponseBodyImagesImage setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImagesImage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagesResponseBodyImagesImage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImagesImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseBodyImagesImage setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public DescribeImagesResponseBodyImagesImage setTags(DescribeImagesResponseBodyImagesImageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageTags getTags() {
            return this.tags;
        }

        public DescribeImagesResponseBodyImagesImage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class DescribeImagesResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeImagesResponseBodyImagesImage> image;

        public static DescribeImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImages self = new DescribeImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImages setImage(java.util.List<DescribeImagesResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
