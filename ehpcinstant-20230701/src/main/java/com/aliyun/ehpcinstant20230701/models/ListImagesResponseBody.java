// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<ListImagesResponseBodyImages> images;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setImages(java.util.List<ListImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListImagesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListImagesResponseBodyImages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>2022-12-09T07:06:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp181x855551ww5yq****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VM</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <strong>example:</strong>
         * <p>app-image</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OsTag")
        public String osTag;

        /**
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListImagesResponseBodyImages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ListImagesResponseBodyImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListImagesResponseBodyImages setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListImagesResponseBodyImages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
