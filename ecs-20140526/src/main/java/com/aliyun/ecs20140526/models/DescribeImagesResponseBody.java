// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    // Details about the images.
    @NameInMap("Images")
    public DescribeImagesResponseBodyImages images;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the image.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of images.
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
        // The name of the check item.
        @NameInMap("Name")
        public String name;

        // The risk that the check item may have.
        @NameInMap("RiskCode")
        public String riskCode;

        // Indicates the severity of the risk that the check item of the imported custom image has. If the check item is at risk, this parameter is returned. If the check item is not at risk, this parameter is not returned.  
        // 
        // Valid values:
        // 
        // - High: The check item has a high risk, which may affect instance startup. We strongly recommended that you handle the risk.
        // - Medium: The check item has a medium risk, which may affect the startup performance or configurations of the instance. We recommend that you handle the risk.
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The result of the check item.
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
        // The check items.
        @NameInMap("Items")
        public DescribeImagesResponseBodyImagesImageDetectionOptionsItems items;

        // The state of the image check task. Valid values:
        // 
        // - Processing: The image check task is in progress.
        // - Finished: The image check task is completed.
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
        // The device name of the disk. Example: /dev/xvdb.
        // 
        // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure compatibility.
        @NameInMap("Device")
        public String device;

        // The format of the image.
        @NameInMap("Format")
        public String format;

        // The Object Storage Service (OSS) bucket that contains the imported image file.
        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        // The OSS object that corresponds to the imported image file.
        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        // The progress of an image copy task.
        @NameInMap("Progress")
        public String progress;

        // The amount of remaining time required for an image copy task. Unit: seconds.
        @NameInMap("RemainTime")
        public Integer remainTime;

        // The size of the disk.
        @NameInMap("Size")
        public String size;

        // The ID of the snapshot.
        @NameInMap("SnapshotId")
        public String snapshotId;

        // The type of the image.
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
        // Indicates whether the image supports Non-Volatile Memory Express (NVMe). Valid values:
        // 
        // - supported: The image supports NVMe. Instances created from this image support the NVMe protocol.
        // - unsupported: The image does not support NVMe. Instances created from this image do not support the NVMe protocol.
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
        // The tag key of the image.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the image.
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
        // The image architecture. Valid values:
        // 
        // *   i386
        // *   x86\_64
        // *   arm64
        @NameInMap("Architecture")
        public String architecture;

        // The boot mode of the custom image. Valid values:
        // 
        // *   BIOS
        // *   UEFI
        // 
        // >  You must know which boot modes the specified image supports. When you use this parameter to change the boot mode of the image, specify a boot mode supported by the image to ensure that instances which use this image can start normally.
        @NameInMap("BootMode")
        public String bootMode;

        // The time when the image was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the image.
        @NameInMap("Description")
        public String description;

        // Details about the check performed on the image.
        @NameInMap("DetectionOptions")
        public DescribeImagesResponseBodyImagesImageDetectionOptions detectionOptions;

        // The mappings between disks and snapshots in the image.
        @NameInMap("DiskDeviceMappings")
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

        // The attributes of the image.
        @NameInMap("Features")
        public DescribeImagesResponseBodyImagesImageFeatures features;

        // The name of the image family.
        @NameInMap("ImageFamily")
        public String imageFamily;

        // The ID of the image.
        @NameInMap("ImageId")
        public String imageId;

        // The name of the image.
        @NameInMap("ImageName")
        public String imageName;

        // The source of the image. Valid values:
        // 
        // *   system: public images provided by Alibaba Cloud.
        // *   self: your custom images.
        // *   others: shared images from other Alibaba Cloud accounts or community images published by other Alibaba Cloud accounts.
        // *   marketplace: Alibaba Cloud Marketplace images.
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        // The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.
        @NameInMap("ImageOwnerId")
        public Long imageOwnerId;

        // The version of the image.
        @NameInMap("ImageVersion")
        public String imageVersion;

        // Indicates whether the image is a copy of another image.
        @NameInMap("IsCopied")
        public Boolean isCopied;

        // Indicates whether the image is publicly available. Publicly available images include public images provided by Alibaba Cloud and custom images published as community images. Valid values: 
        // 
        // - true: The image is publicly available.
        // - false: The image is not publicly available.
        @NameInMap("IsPublic")
        public Boolean isPublic;

        // Indicates whether the custom image was shared to other Alibaba Cloud accounts.
        @NameInMap("IsSelfShared")
        public String isSelfShared;

        // Indicates whether you have subscribed to the image that corresponds to the specified product code.
        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        // Indicates whether the image supports cloud-init.
        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        // Indicates whether the image can be used on I/O optimized instances.
        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        // Indicates whether the image supports logons of non-root users. Valid values:
        // 
        // - true: The image supports logons of non-root users.
        // - false: The image does not support logons of non-root users.
        @NameInMap("LoginAsNonRootSupported")
        public Boolean loginAsNonRootSupported;

        // The Chinese name of the operating system.
        @NameInMap("OSName")
        public String OSName;

        // The English name of the operating system.
        @NameInMap("OSNameEn")
        public String OSNameEn;

        // The type of the operating system. Valid values:
        // 
        // *   windows
        // *   linux
        @NameInMap("OSType")
        public String OSType;

        // The operating system.
        @NameInMap("Platform")
        public String platform;

        // The product code of the Alibaba Cloud Marketplace image.
        @NameInMap("ProductCode")
        public String productCode;

        // The image creation progress. Unit: percent (%).
        @NameInMap("Progress")
        public String progress;

        // The ID of the resource group to which the image belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The size of the image. Unit: GiB.
        @NameInMap("Size")
        public Integer size;

        // The state of the image. Valid values:
        // 
        // *   UnAvailable: The image is unavailable.
        // *   Available: The image is available.
        // *   Creating: The image is being created.
        // *   CreateFailed: The image cannot be created.
        @NameInMap("Status")
        public String status;

        // The name of the supplier that certified the community image.
        @NameInMap("SupplierName")
        public String supplierName;

        // The tags of the image.
        @NameInMap("Tags")
        public DescribeImagesResponseBodyImagesImageTags tags;

        // Indicates whether the image has been used to create ECS instances. Valid values:
        // 
        // *   instance: The image has been used to create one or more ECS instances.
        // *   none: The image has not been used to create ECS instances.
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
