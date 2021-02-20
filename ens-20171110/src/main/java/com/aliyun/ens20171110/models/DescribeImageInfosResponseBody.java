// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Images")
    public DescribeImageInfosResponseBodyImages images;

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

    public static class DescribeImageInfosResponseBodyImagesImage extends TeaModel {
        @NameInMap("Description")
        public String description;

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

        public static DescribeImageInfosResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseBodyImagesImage self = new DescribeImageInfosResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseBodyImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
