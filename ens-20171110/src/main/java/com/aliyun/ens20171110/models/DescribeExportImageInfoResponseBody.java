// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageInfoResponseBody extends TeaModel {
    /**
     * <p>The returned result. For more information, see the Images parameter described in the JSON-formatted sample success response.</p>
     */
    @NameInMap("Images")
    public DescribeExportImageInfoResponseBodyImages images;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The architecture of the image. Example: **x86_64**.</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The time when the image was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The URL of the exported image.</p>
         */
        @NameInMap("ExportedImageURL")
        public String exportedImageURL;

        /**
         * <p>The export status of the image. Valid values:</p>
         * <br>
         * <p>*   Exporting</p>
         * <p>*   Exported</p>
         * <p>*   ExportError</p>
         * <p>*   Unexported</p>
         */
        @NameInMap("ImageExportStatus")
        public String imageExportStatus;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The source of the image. Valid values:</p>
         * <br>
         * <p>*   system: public image</p>
         * <p>*   self: custom image</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The OS.</p>
         */
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
