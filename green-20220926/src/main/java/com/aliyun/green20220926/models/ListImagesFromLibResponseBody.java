// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImagesFromLibResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<ListImagesFromLibResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>2022-11-30 16:30:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/IMG_2123.jpg">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/IMG_2123.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
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
