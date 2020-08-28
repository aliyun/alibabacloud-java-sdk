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

    }

    public static class DescribeImageFromFamilyResponseImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        @Validation(required = true)
        public java.util.List<DescribeImageFromFamilyResponseImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImageFromFamilyResponseImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImageDiskDeviceMappings self = new DescribeImageFromFamilyResponseImageDiskDeviceMappings();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeImageFromFamilyResponseImageTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImageFromFamilyResponseImageTagsTag> tag;

        public static DescribeImageFromFamilyResponseImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromFamilyResponseImageTags self = new DescribeImageFromFamilyResponseImageTags();
            return TeaModel.build(map, self);
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

    }

}
