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

    }

    public static class DescribeImagesResponseImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        @Validation(required = true)
        public java.util.List<DescribeImagesResponseImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImagesResponseImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImageDiskDeviceMappings self = new DescribeImagesResponseImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeImagesResponseImagesImageTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImagesResponseImagesImageTagsTag> tag;

        public static DescribeImagesResponseImagesImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImageTags self = new DescribeImagesResponseImagesImageTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeImagesResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeImagesResponseImagesImage> image;

        public static DescribeImagesResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImages self = new DescribeImagesResponseImages();
            return TeaModel.build(map, self);
        }

    }

}
