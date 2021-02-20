// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageInfoResponseBody extends TeaModel {
    @NameInMap("Images")
    public DescribeExportImageInfoResponseBodyImages images;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeExportImageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageInfoResponseBody self = new DescribeExportImageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageInfoResponseBody setImages(DescribeExportImageInfoResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeExportImageInfoResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeExportImageInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExportImageInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExportImageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExportImageInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExportImageInfoResponseBodyImagesImage extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ExportedImageURL")
        public String exportedImageURL;

        @NameInMap("ImageExportStatus")
        public String imageExportStatus;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("Platform")
        public String platform;

        public static DescribeExportImageInfoResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeExportImageInfoResponseBodyImagesImage self = new DescribeExportImageInfoResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeExportImageInfoResponseBodyImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setExportedImageURL(String exportedImageURL) {
            this.exportedImageURL = exportedImageURL;
            return this;
        }
        public String getExportedImageURL() {
            return this.exportedImageURL;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setImageExportStatus(String imageExportStatus) {
            this.imageExportStatus = imageExportStatus;
            return this;
        }
        public String getImageExportStatus() {
            return this.imageExportStatus;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeExportImageInfoResponseBodyImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

    public static class DescribeExportImageInfoResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeExportImageInfoResponseBodyImagesImage> image;

        public static DescribeExportImageInfoResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeExportImageInfoResponseBodyImages self = new DescribeExportImageInfoResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeExportImageInfoResponseBodyImages setImage(java.util.List<DescribeExportImageInfoResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeExportImageInfoResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
