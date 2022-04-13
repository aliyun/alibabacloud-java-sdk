// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyResponseBody extends TeaModel {
    @NameInMap("Image")
    public DescribeImageFromFamilyResponseBodyImage image;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageFromFamilyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyResponseBody self = new DescribeImageFromFamilyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromFamilyResponseBody setImage(DescribeImageFromFamilyResponseBodyImage image) {
        this.image = image;
        return this;
    }
    public DescribeImageFromFamilyResponseBodyImage getImage() {
        return this.image;
    }

    public DescribeImageFromFamilyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("Format")
        public String format;

        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        @NameInMap("Size")
        public String size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Type")
        public String type;

        public static DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
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

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
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

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImageFromFamilyResponseBodyImageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImageTagsTag self = new DescribeImageFromFamilyResponseBodyImageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImageTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImageFromFamilyResponseBodyImageTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskDeviceMappings")
        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageFamily")
        public String imageFamily;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("IsCopied")
        public Boolean isCopied;

        @NameInMap("IsSelfShared")
        public String isSelfShared;

        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeImageFromFamilyResponseBodyImageTags tags;

        @NameInMap("Usage")
        public String usage;

        public static DescribeImageFromFamilyResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseBodyImage self = new DescribeImageFromFamilyResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseBodyImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImageFromFamilyResponseBodyImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageFromFamilyResponseBodyImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageFromFamilyResponseBodyImage setDiskDeviceMappings(DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImageFromFamilyResponseBodyImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsCopied(Boolean isCopied) {
            this.isCopied = isCopied;
            return this;
        }
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSelfShared(String isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSupportCloudinit(Boolean isSupportCloudinit) {
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        public DescribeImageFromFamilyResponseBodyImage setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        public DescribeImageFromFamilyResponseBodyImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImageFromFamilyResponseBodyImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImageFromFamilyResponseBodyImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImageFromFamilyResponseBodyImage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeImageFromFamilyResponseBodyImage setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImageFromFamilyResponseBodyImage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImageFromFamilyResponseBodyImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageFromFamilyResponseBodyImage setTags(DescribeImageFromFamilyResponseBodyImageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImageFromFamilyResponseBodyImageTags getTags() {
            return this.tags;
        }

        public DescribeImageFromFamilyResponseBodyImage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}
