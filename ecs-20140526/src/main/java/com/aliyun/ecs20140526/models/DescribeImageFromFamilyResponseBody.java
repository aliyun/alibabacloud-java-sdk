// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Image")
    public DescribeImageFromFamilyResponseBodyImage image;

    public static DescribeImageFromFamilyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyResponseBody self = new DescribeImageFromFamilyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromFamilyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageFromFamilyResponseBody setImage(DescribeImageFromFamilyResponseBodyImage image) {
        this.image = image;
        return this;
    }
    public DescribeImageFromFamilyResponseBodyImage getImage() {
        return this.image;
    }

    public static class DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        @NameInMap("Size")
        public String size;

        @NameInMap("Device")
        public String device;

        @NameInMap("Format")
        public String format;

        public static DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setImportOSSObject(String importOSSObject) {
            this.importOSSObject = importOSSObject;
            return this;
        }
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings self = new DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImageFromFamilyResponseBodyImageTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeImageFromFamilyResponseBodyImageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImageTagsTag self = new DescribeImageFromFamilyResponseBodyImageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImageTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeImageFromFamilyResponseBodyImageTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeImageFromFamilyResponseBodyImageTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeImageFromFamilyResponseBodyImageTagsTag> tag;

        public static DescribeImageFromFamilyResponseBodyImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImageTags self = new DescribeImageFromFamilyResponseBodyImageTags();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImageTags setTag(java.util.List<DescribeImageFromFamilyResponseBodyImageTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImageFromFamilyResponseBodyImageTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImageFromFamilyResponseBodyImage extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ImageFamily")
        public String imageFamily;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("IsCopied")
        public Boolean isCopied;

        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("IsSelfShared")
        public String isSelfShared;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("DiskDeviceMappings")
        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("Tags")
        public DescribeImageFromFamilyResponseBodyImageTags tags;

        public static DescribeImageFromFamilyResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImage self = new DescribeImageFromFamilyResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageFromFamilyResponseBodyImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImageFromFamilyResponseBodyImage setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsCopied(Boolean isCopied) {
            this.isCopied = isCopied;
            return this;
        }
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSupportCloudinit(Boolean isSupportCloudinit) {
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageFromFamilyResponseBodyImage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSelfShared(String isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        public DescribeImageFromFamilyResponseBodyImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageFromFamilyResponseBodyImage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImageFromFamilyResponseBodyImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImageFromFamilyResponseBodyImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageFromFamilyResponseBodyImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeImageFromFamilyResponseBodyImage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeImageFromFamilyResponseBodyImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImageFromFamilyResponseBodyImage setDiskDeviceMappings(DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImageFromFamilyResponseBodyImage setTags(DescribeImageFromFamilyResponseBodyImageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImageFromFamilyResponseBodyImageTags getTags() {
            return this.tags;
        }

    }

}
