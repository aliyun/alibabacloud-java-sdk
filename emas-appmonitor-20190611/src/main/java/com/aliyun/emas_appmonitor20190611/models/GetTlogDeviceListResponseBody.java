// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogDeviceListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetTlogDeviceListResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>AB8AB5EC-9636-421D-AE7C-BB227DFC95B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTlogDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTlogDeviceListResponseBody self = new GetTlogDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTlogDeviceListResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetTlogDeviceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTlogDeviceListResponseBody setModel(GetTlogDeviceListResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetTlogDeviceListResponseBodyModel getModel() {
        return this.model;
    }

    public GetTlogDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTlogDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTlogDeviceListResponseBodyModel extends TeaModel {
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
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetTlogDeviceListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetTlogDeviceListResponseBodyModel self = new GetTlogDeviceListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetTlogDeviceListResponseBodyModel setItems(java.util.List<?> items) {
            this.items = items;
            return this;
        }
        public java.util.List<?> getItems() {
            return this.items;
        }

        public GetTlogDeviceListResponseBodyModel setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetTlogDeviceListResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetTlogDeviceListResponseBodyModel setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public GetTlogDeviceListResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
