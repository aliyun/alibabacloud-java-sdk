// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The images.</p>
     */
    @NameInMap("Images")
    public java.util.List<ListRepoTagResponseBodyImages> images;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepoTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagResponseBody self = new ListRepoTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoTagResponseBody setImages(java.util.List<ListRepoTagResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListRepoTagResponseBodyImages> getImages() {
        return this.images;
    }

    public ListRepoTagResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoTagResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoTagResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoTagResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoTagResponseBodyImages extends TeaModel {
        /**
         * <p>The digest of the image.</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The time when the image was created.</p>
         */
        @NameInMap("ImageCreate")
        public String imageCreate;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The size of the image.</p>
         */
        @NameInMap("ImageSize")
        public Long imageSize;

        /**
         * <p>The time when the image was last updated.</p>
         */
        @NameInMap("ImageUpdate")
        public String imageUpdate;

        /**
         * <p>The status of the image.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag of the image.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ListRepoTagResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListRepoTagResponseBodyImages self = new ListRepoTagResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListRepoTagResponseBodyImages setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListRepoTagResponseBodyImages setImageCreate(String imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }
        public String getImageCreate() {
            return this.imageCreate;
        }

        public ListRepoTagResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListRepoTagResponseBodyImages setImageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Long getImageSize() {
            return this.imageSize;
        }

        public ListRepoTagResponseBodyImages setImageUpdate(String imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }
        public String getImageUpdate() {
            return this.imageUpdate;
        }

        public ListRepoTagResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRepoTagResponseBodyImages setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
