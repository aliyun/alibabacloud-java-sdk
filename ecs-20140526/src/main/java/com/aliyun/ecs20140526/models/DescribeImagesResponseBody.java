// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public DescribeImagesResponseBodyImages images;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("Format")
        public String format;

        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("RemainTime")
        public Integer remainTime;

        @NameInMap("Size")
        public String size;

        @NameInMap("SnapshotId")
        public String snapshotId;

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

    public static class DescribeImagesResponseBodyImagesImageTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskDeviceMappings")
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageFamily")
        public String imageFamily;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("ImageOwnerId")
        public Long imageOwnerId;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("IsCopied")
        public Boolean isCopied;

        @NameInMap("IsPublic")
        public Boolean isPublic;

        @NameInMap("IsSelfShared")
        public String isSelfShared;

        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        @NameInMap("LoginAsNonRootSupported")
        public Boolean loginAsNonRootSupported;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("OSNameEn")
        public String OSNameEn;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("Tags")
        public DescribeImagesResponseBodyImagesImageTags tags;

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

        public DescribeImagesResponseBodyImagesImage setDiskDeviceMappings(DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
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
