// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImagesFromLibResponseBody extends TeaModel {
    /**
     * <p>The error code, which is consistent with the HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The data on the current page.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListImagesFromLibResponseBodyItems> items;

    /**
     * <p>The further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The backend-assigned ID that uniquely identifies a request. This ID can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The success flag.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of images.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListImagesFromLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesFromLibResponseBody self = new ListImagesFromLibResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesFromLibResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListImagesFromLibResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListImagesFromLibResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListImagesFromLibResponseBody setItems(java.util.List<ListImagesFromLibResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListImagesFromLibResponseBodyItems> getItems() {
        return this.items;
    }

    public ListImagesFromLibResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListImagesFromLibResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesFromLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesFromLibResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListImagesFromLibResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListImagesFromLibResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-30 16:30:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/IMG_2123.jpg">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/IMG_2123.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/IMG_2123.jpg">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/IMG_2123.jpg</a></p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        public static ListImagesFromLibResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListImagesFromLibResponseBodyItems self = new ListImagesFromLibResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListImagesFromLibResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListImagesFromLibResponseBodyItems setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesFromLibResponseBodyItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListImagesFromLibResponseBodyItems setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

    }

}
