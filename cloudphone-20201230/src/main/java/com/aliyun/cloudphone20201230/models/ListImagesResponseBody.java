// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    /**
     * <p>The list of images.</p>
     */
    @NameInMap("Images")
    public ListImagesResponseBodyImages images;

    /**
     * <p>The maximum number of entries that is returned on each page. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of images.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setImages(ListImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public ListImagesResponseBodyImages getImages() {
        return this.images;
    }

    public ListImagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImagesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListImagesResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The time when the image was created. The time follows the ISO 8601 standard.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The image description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image type.</p>
         */
        @NameInMap("ImageCategory")
        public String imageCategory;

        /**
         * <p>The image ID.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Indicates whether the image is shared with other Alibaba Cloud accounts.</p>
         */
        @NameInMap("IsSelfShared")
        public Boolean isSelfShared;

        /**
         * <p>The display name of the OS in Chinese.</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The display name of the OS in English.</p>
         */
        @NameInMap("OSNameEn")
        public String OSNameEn;

        /**
         * <p>The image OS.</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The OS distribution.</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The progress of image creation.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The image state.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the image is used by instances. Valid values:</p>
         * <br>
         * <p>*   none: The image is idle.</p>
         * <p>*   instance: The image is used by instances.</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static ListImagesResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesImage self = new ListImagesResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListImagesResponseBodyImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImagesResponseBodyImagesImage setImageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public String getImageCategory() {
            return this.imageCategory;
        }

        public ListImagesResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListImagesResponseBodyImagesImage setIsSelfShared(Boolean isSelfShared) {
            this.isSelfShared = isSelfShared;
            return this;
        }
        public Boolean getIsSelfShared() {
            return this.isSelfShared;
        }

        public ListImagesResponseBodyImagesImage setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public ListImagesResponseBodyImagesImage setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public ListImagesResponseBodyImagesImage setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public ListImagesResponseBodyImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListImagesResponseBodyImagesImage setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListImagesResponseBodyImagesImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImagesResponseBodyImagesImage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListImagesResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<ListImagesResponseBodyImagesImage> image;

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setImage(java.util.List<ListImagesResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<ListImagesResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
