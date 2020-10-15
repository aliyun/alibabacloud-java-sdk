// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

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

    public DescribeImagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImagesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImagesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesResponse setImages(DescribeImagesResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeImagesResponseImages getImages() {
        return this.images;
    }

    public static class DescribeImagesResponseImagesImage extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        @Validation(required = true)
        public String imageOwnerAlias;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("Architecture")
        @Validation(required = true)
        public String architecture;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ImageSize")
        @Validation(required = true)
        public String imageSize;

        public static DescribeImagesResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImagesImage self = new DescribeImagesResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagesResponseImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImagesResponseImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagesResponseImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImagesResponseImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseImagesImage setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
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

        public DescribeImagesResponseImages setImage(java.util.List<DescribeImagesResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeImagesResponseImagesImage> getImage() {
            return this.image;
        }

    }

}
