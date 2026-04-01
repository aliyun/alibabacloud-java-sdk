// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Images")
    public DescribeImageInfosResponseBodyImages images;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5568A08C-10A9-47F3-902F-647298B463FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfosResponseBody self = new DescribeImageInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfosResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageInfosResponseBody setImages(DescribeImageInfosResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeImageInfosResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeImageInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Size")
        public String size;

        @NameInMap("Type")
        public String type;

        @NameInMap("imageId")
        public String imageId;

        public static DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

    public static class DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings self = new DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImageInfosResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImageInfosResponseBodyImagesImage extends TeaModel {
        @NameInMap("ComputeType")
        public String computeType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskDeviceMappings")
        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageSize")
        public String imageSize;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeImageInfosResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseBodyImagesImage self = new DescribeImageInfosResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseBodyImagesImage setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public DescribeImageInfosResponseBodyImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageInfosResponseBodyImagesImage setDiskDeviceMappings(DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImageInfosResponseBodyImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImageInfosResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageInfosResponseBodyImagesImage setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
        }

        public DescribeImageInfosResponseBodyImagesImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageInfosResponseBodyImagesImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImageInfosResponseBodyImagesImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImageInfosResponseBodyImagesImage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeImageInfosResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeImageInfosResponseBodyImagesImage> image;

        public static DescribeImageInfosResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseBodyImages self = new DescribeImageInfosResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseBodyImages setImage(java.util.List<DescribeImageInfosResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeImageInfosResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
