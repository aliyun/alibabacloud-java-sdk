// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    public DescribeExportImageInfoResponseImages images;

    public static DescribeExportImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageInfoResponse self = new DescribeExportImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExportImageInfoResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeExportImageInfoResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExportImageInfoResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExportImageInfoResponse setImages(DescribeExportImageInfoResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeExportImageInfoResponseImages getImages() {
        return this.images;
    }

    public static class DescribeExportImageInfoResponseImagesImage extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        @NameInMap("Architecture")
        @Validation(required = true)
        public String architecture;

        @NameInMap("ImageOwnerAlias")
        @Validation(required = true)
        public String imageOwnerAlias;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("ImageExportStatus")
        @Validation(required = true)
        public String imageExportStatus;

        @NameInMap("ExportedImageURL")
        @Validation(required = true)
        public String exportedImageURL;

        public static DescribeExportImageInfoResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeExportImageInfoResponseImagesImage self = new DescribeExportImageInfoResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeExportImageInfoResponseImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeExportImageInfoResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeExportImageInfoResponseImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeExportImageInfoResponseImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeExportImageInfoResponseImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeExportImageInfoResponseImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeExportImageInfoResponseImagesImage setImageExportStatus(String imageExportStatus) {
            this.imageExportStatus = imageExportStatus;
            return this;
        }
        public String getImageExportStatus() {
            return this.imageExportStatus;
        }

        public DescribeExportImageInfoResponseImagesImage setExportedImageURL(String exportedImageURL) {
            this.exportedImageURL = exportedImageURL;
            return this;
        }
        public String getExportedImageURL() {
            return this.exportedImageURL;
        }

    }

    public static class DescribeExportImageInfoResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeExportImageInfoResponseImagesImage> image;

        public static DescribeExportImageInfoResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeExportImageInfoResponseImages self = new DescribeExportImageInfoResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeExportImageInfoResponseImages setImage(java.util.List<DescribeExportImageInfoResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeExportImageInfoResponseImagesImage> getImage() {
            return this.image;
        }

    }

}
