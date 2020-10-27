// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Images")
    @Validation(required = true)
    public DescribeImagesResponseImages images;

    public static DescribeImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponse self = new DescribeImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImagesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesResponse setImages(DescribeImagesResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeImagesResponseImages getImages() {
        return this.images;
    }

    public static class DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("ImportOSSBucket")
        @Validation(required = true)
        public String importOSSBucket;

        @NameInMap("ImportOSSObject")
        @Validation(required = true)
        public String importOSSObject;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("RemainTime")
        @Validation(required = true)
        public Integer remainTime;

        public static DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setImportOSSObject(String importOSSObject) {
            this.importOSSObject = importOSSObject;
            return this;
        }
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

    }

    public static class DescribeImagesResponseImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        @Validation(required = true)
        public java.util.List<DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImagesResponseImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImageDiskDeviceMappings self = new DescribeImagesResponseImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImagesImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImagesResponseImagesImageTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeImagesResponseImagesImageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImageTagsTag self = new DescribeImagesResponseImagesImageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImagesImageTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagesResponseImagesImageTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagesResponseImagesImageTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImagesResponseImagesImageTagsTag> tag;

        public static DescribeImagesResponseImagesImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImageTags self = new DescribeImagesResponseImagesImageTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImagesImageTags setTag(java.util.List<DescribeImagesResponseImagesImageTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagesResponseImagesImageTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagesResponseImagesImage extends TeaModel {
        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        @NameInMap("ImageFamily")
        @Validation(required = true)
        public String imageFamily;

        @NameInMap("ImageVersion")
        @Validation(required = true)
        public String imageVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("ImageOwnerAlias")
        @Validation(required = true)
        public String imageOwnerAlias;

        @NameInMap("IsSupportIoOptimized")
        @Validation(required = true)
        public Boolean isSupportIoOptimized;

        @NameInMap("IsSupportCloudinit")
        @Validation(required = true)
        public Boolean isSupportCloudinit;

        @NameInMap("OSName")
        @Validation(required = true)
        public String OSName;

        @NameInMap("OSNameEn")
        @Validation(required = true)
        public String OSNameEn;

        @NameInMap("Architecture")
        @Validation(required = true)
        public String architecture;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("IsSubscribed")
        @Validation(required = true)
        public Boolean isSubscribed;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("IsSelfShared")
        @Validation(required = true)
        public String isSelfShared;

        @NameInMap("OSType")
        @Validation(required = true)
        public String OSType;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("Usage")
        @Validation(required = true)
        public String usage;

        @NameInMap("IsCopied")
        @Validation(required = true)
        public Boolean isCopied;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("DiskDeviceMappings")
        @Validation(required = true)
        public DescribeImagesResponseImagesImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeImagesResponseImagesImageTags tags;

        public static DescribeImagesResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImage self = new DescribeImagesResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImagesImage setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagesResponseImagesImage setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImagesResponseImagesImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImagesResponseImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseImagesImage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImagesResponseImagesImage setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        public DescribeImagesResponseImagesImage setIsSupportCloudinit(Boolean isSupportCloudinit) {
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        public DescribeImagesResponseImagesImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImagesResponseImagesImage setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeImagesResponseImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImagesResponseImagesImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseImagesImage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeImagesResponseImagesImage setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeImagesResponseImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseImagesImage setIsSelfShared(String isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        public DescribeImagesResponseImagesImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImagesResponseImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagesResponseImagesImage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeImagesResponseImagesImage setIsCopied(Boolean isCopied) {
            this.isCopied = isCopied;
            return this;
        }
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        public DescribeImagesResponseImagesImage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagesResponseImagesImage setDiskDeviceMappings(DescribeImagesResponseImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImagesResponseImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImagesResponseImagesImage setTags(DescribeImagesResponseImagesImageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagesResponseImagesImageTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeImagesResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeImagesResponseImagesImage> image;

        public static DescribeImagesResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImages self = new DescribeImagesResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImages setImage(java.util.List<DescribeImagesResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeImagesResponseImagesImage> getImage() {
            return this.image;
        }

    }

}
