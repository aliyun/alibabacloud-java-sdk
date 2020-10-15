// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Images")
    @Validation(required = true)
    public DescribeImageInfosResponseImages images;

    public static DescribeImageInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfosResponse self = new DescribeImageInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageInfosResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageInfosResponse setImages(DescribeImageInfosResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeImageInfosResponseImages getImages() {
        return this.images;
    }

    public static class DescribeImageInfosResponseImagesImage extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ImageVersion")
        @Validation(required = true)
        public String imageVersion;

        @NameInMap("OSType")
        @Validation(required = true)
        public String OSType;

        @NameInMap("OSName")
        @Validation(required = true)
        public String OSName;

        @NameInMap("ImageSize")
        @Validation(required = true)
        public String imageSize;

        public static DescribeImageInfosResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseImagesImage self = new DescribeImageInfosResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageInfosResponseImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageInfosResponseImagesImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageInfosResponseImagesImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImageInfosResponseImagesImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeImageInfosResponseImagesImage setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
        }

    }

    public static class DescribeImageInfosResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeImageInfosResponseImagesImage> image;

        public static DescribeImageInfosResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfosResponseImages self = new DescribeImageInfosResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfosResponseImages setImage(java.util.List<DescribeImageInfosResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeImageInfosResponseImagesImage> getImage() {
            return this.image;
        }

    }

}
