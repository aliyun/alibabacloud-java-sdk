// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogCollectListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetTlogCollectListResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>AB8AB5EC-9636-421D-AE7C-BB227DFC95B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTlogCollectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTlogCollectListResponseBody self = new GetTlogCollectListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTlogCollectListResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetTlogCollectListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTlogCollectListResponseBody setModel(GetTlogCollectListResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetTlogCollectListResponseBodyModel getModel() {
        return this.model;
    }

    public GetTlogCollectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTlogCollectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTlogCollectListResponseBodyModel extends TeaModel {
        @NameInMap("Items")
        public java.util.List<?> items;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pages")
        public Long pages;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetTlogCollectListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetTlogCollectListResponseBodyModel self = new GetTlogCollectListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetTlogCollectListResponseBodyModel setItems(java.util.List<?> items) {
            this.items = items;
            return this;
        }
        public java.util.List<?> getItems() {
            return this.items;
        }

        public GetTlogCollectListResponseBodyModel setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetTlogCollectListResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetTlogCollectListResponseBodyModel setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public GetTlogCollectListResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
