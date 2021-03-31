// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Image")
    @Validation(required = true)
    public DescribeImageFromFamilyResponseImage image;

    public static DescribeImageFromFamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyResponse self = new DescribeImageFromFamilyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromFamilyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageFromFamilyResponse setImage(DescribeImageFromFamilyResponseImage image) {
        this.image = image;
        return this;
    }
    public DescribeImageFromFamilyResponseImage getImage() {
        return this.image;
    }

    public static class DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
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

        public static DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setImportOSSBucket(String importOSSBucket) {
            this.importOSSBucket = importOSSBucket;
            return this;
        }
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping setImportOSSObject(String importOSSObject) {
            this.importOSSObject = importOSSObject;
            return this;
        }
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

    }

    public static class DescribeImageFromFamilyResponseImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        @Validation(required = true)
        public java.util.List<DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImageFromFamilyResponseImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImageDiskDeviceMappings self = new DescribeImageFromFamilyResponseImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImageFromFamilyResponseImageTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeImageFromFamilyResponseImageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImageTagsTag self = new DescribeImageFromFamilyResponseImageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseImageTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImageFromFamilyResponseImageTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImageFromFamilyResponseImageTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImageFromFamilyResponseImageTagsTag> tag;

        public static DescribeImageFromFamilyResponseImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImageTags self = new DescribeImageFromFamilyResponseImageTags();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseImageTags setTag(java.util.List<DescribeImageFromFamilyResponseImageTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImageFromFamilyResponseImageTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImageFromFamilyResponseImage extends TeaModel {
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

        @NameInMap("DiskDeviceMappings")
        @Validation(required = true)
        public DescribeImageFromFamilyResponseImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeImageFromFamilyResponseImageTags tags;

        public static DescribeImageFromFamilyResponseImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImage self = new DescribeImageFromFamilyResponseImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromFamilyResponseImage setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImageFromFamilyResponseImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageFromFamilyResponseImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImageFromFamilyResponseImage setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImageFromFamilyResponseImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageFromFamilyResponseImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageFromFamilyResponseImage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImageFromFamilyResponseImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImageFromFamilyResponseImage setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        public DescribeImageFromFamilyResponseImage setIsSupportCloudinit(Boolean isSupportCloudinit) {
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        public DescribeImageFromFamilyResponseImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImageFromFamilyResponseImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImageFromFamilyResponseImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageFromFamilyResponseImage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeImageFromFamilyResponseImage setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeImageFromFamilyResponseImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageFromFamilyResponseImage setIsSelfShared(String isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        public DescribeImageFromFamilyResponseImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImageFromFamilyResponseImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImageFromFamilyResponseImage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeImageFromFamilyResponseImage setIsCopied(Boolean isCopied) {
            this.isCopied = isCopied;
            return this;
        }
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        public DescribeImageFromFamilyResponseImage setDiskDeviceMappings(DescribeImageFromFamilyResponseImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImageFromFamilyResponseImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImageFromFamilyResponseImage setTags(DescribeImageFromFamilyResponseImageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImageFromFamilyResponseImageTags getTags() {
            return this.tags;
        }

    }

}
