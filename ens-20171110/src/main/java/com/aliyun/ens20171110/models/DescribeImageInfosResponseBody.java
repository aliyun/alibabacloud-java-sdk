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

    /**
     * <p>The information about images.</p>
     */
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

    public static class DescribeImageInfosResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The computing type of the image. Valid values:</p>
         * <ul>
         * <li>ens_vm: x86 computing.</li>
         * <li>arm_vm: ARM computing.</li>
         * <li>bare_metal: x86 bare machine.</li>
         * <li>pcfarm: heterogeneous computing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ens_vm</p>
         */
        @NameInMap("ComputeType")
        public String computeType;

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_2017****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_2017****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ImageSize")
        public String imageSize;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The type of the image. Valid values: <strong>centos</strong>, <strong>debian</strong>, <strong>ubuntu</strong>, and <strong>windows</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>centos</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The type of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

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
