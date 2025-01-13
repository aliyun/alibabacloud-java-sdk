// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyResponseBody extends TeaModel {
    /**
     * <p>The image information.</p>
     */
    @NameInMap("Image")
    public DescribeImageFromFamilyResponseBodyImage image;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
        /**
         * <p>The device name of the disk. Example: /dev/xvdb.</p>
         * <blockquote>
         * <p> This parameter will be removed in the future. To ensure compatibility, we recommend that you use other parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The image format.</p>
         * 
         * <strong>example:</strong>
         * <p>qcow2</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket that contains the imported image file.</p>
         * 
         * <strong>example:</strong>
         * <p>testEcsImport</p>
         */
        @NameInMap("ImportOSSBucket")
        public String importOSSBucket;

        /**
         * <p>The OSS object to which the imported image belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>imageImport</p>
         */
        @NameInMap("ImportOSSObject")
        public String importOSSObject;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17ot2q7x72ggtw****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The image type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
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
        /**
         * <p>The tag key of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        /**
         * <p>The architecture of the image. Valid values:</p>
         * <ul>
         * <li>i386</li>
         * <li>x86_64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The time when the image was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-10T01:01:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mappings between the disk and the snapshot in the image.</p>
         */
        @NameInMap("DiskDeviceMappings")
        public DescribeImageFromFamilyResponseBodyImageDiskDeviceMappings diskDeviceMappings;

        /**
         * <p>The name of the image family.</p>
         * 
         * <strong>example:</strong>
         * <p>testImageFamily</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1g7004ksh0oeuc****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The alias of the image owner. Valid values:</p>
         * <ul>
         * <li>system: public images provided by Alibaba Cloud</li>
         * <li>self: your custom images</li>
         * <li>others: shared images from other Alibaba Cloud accounts</li>
         * <li>marketplace: Alibaba Cloud Marketplace images</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>Indicates whether the image is a copy of another image.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCopied")
        public Boolean isCopied;

        /**
         * <p>Indicates whether the custom image was shared to other Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSelfShared")
        public String isSelfShared;

        /**
         * <p>Indicates whether you have subscribed to the service terms of the image product corresponding to the image product code.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        /**
         * <p>Indicates whether cloud-init is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSupportCloudinit")
        public Boolean isSupportCloudinit;

        /**
         * <p>Indicates whether the image can be used on I/O optimized instances.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSupportIoOptimized")
        public Boolean isSupportIoOptimized;

        /**
         * <p>The display name of the operating system in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux 2.1903</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li>windows</li>
         * <li>linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The product code of the Alibaba Cloud Marketplace image.</p>
         * 
         * <strong>example:</strong>
         * <p>jxsc00****</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The image creation progress in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The state of the image. Valid values:</p>
         * <ul>
         * <li>UnAvailable</li>
         * <li>Available</li>
         * <li>Creating</li>
         * <li>CreateFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the image.</p>
         */
        @NameInMap("Tags")
        public DescribeImageFromFamilyResponseBodyImageTags tags;

        /**
         * <p>Indicates whether the image has been used to create ECS instances. Valid values:</p>
         * <ul>
         * <li>instance: The image was used to create one or more ECS instances.</li>
         * <li>none: The image was not used to create ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
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
