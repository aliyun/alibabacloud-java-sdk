// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Images")
    public java.util.List<DescribeImagesResponseBodyImages> images;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponseBody self = new DescribeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesResponseBody setImages(java.util.List<DescribeImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public DescribeImagesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeImagesResponseBodyImagesTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeImagesResponseBodyImagesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesTags self = new DescribeImagesResponseBodyImagesTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeImagesResponseBodyImagesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeImagesResponseBodyImagesDiskDeviceMappings extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public String size;

        @NameInMap("RemainTime")
        public Integer remainTime;

        @NameInMap("Format")
        public String format;

        public static DescribeImagesResponseBodyImagesDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesDiskDeviceMappings self = new DescribeImagesResponseBodyImagesDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setImportOSSObject(String importOSSObject) {
            this.importOSSObject = importOSSObject;
            return this;
        }
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeImagesResponseBodyImagesDiskDeviceMappings setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class DescribeImagesResponseBodyImages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        @NameInMap("Tags")
        public java.util.List<DescribeImagesResponseBodyImagesTags> tags;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("IsSelfShared")
        public String isSelfShared;

        @NameInMap("Description")
        public String description;

        @NameInMap("OSNameEn")
        public String OSNameEn;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        @NameInMap("ImageFamily")
        public String imageFamily;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("IsCopied")
        public Boolean isCopied;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        @NameInMap("DiskDeviceMappings")
        public java.util.List<DescribeImagesResponseBodyImagesDiskDeviceMappings> diskDeviceMappings;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImages self = new DescribeImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseBodyImages setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        public DescribeImagesResponseBodyImages setTags(java.util.List<DescribeImagesResponseBodyImagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesTags> getTags() {
            return this.tags;
        }

        public DescribeImagesResponseBodyImages setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImagesResponseBodyImages setIsSelfShared(String isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        public DescribeImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseBodyImages setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeImagesResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagesResponseBodyImages setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseBodyImages setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeImagesResponseBodyImages setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImagesResponseBodyImages setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImages setIsCopied(Boolean isCopied) {
            this.isCopied = isCopied;
            return this;
        }
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        public DescribeImagesResponseBodyImages setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImagesResponseBodyImages setIsSupportCloudinit(Boolean isSupportCloudinit) {
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        public DescribeImagesResponseBodyImages setDiskDeviceMappings(java.util.List<DescribeImagesResponseBodyImagesDiskDeviceMappings> diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesDiskDeviceMappings> getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImagesResponseBodyImages setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeImagesResponseBodyImages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImages setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagesResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagesResponseBodyImages setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImagesResponseBodyImages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImagesResponseBodyImages setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
