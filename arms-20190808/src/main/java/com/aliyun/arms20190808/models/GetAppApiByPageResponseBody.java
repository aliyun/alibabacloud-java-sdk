// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppApiByPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <br>
     * <p>*   2XX: The request was successful.</p>
     * <p>*   3XX: A redirection message was returned.</p>
     * <p>*   4XX: The request was invalid.</p>
     * <p>*   5XX: A server error occurred.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public GetAppApiByPageResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppApiByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppApiByPageResponseBody self = new GetAppApiByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppApiByPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAppApiByPageResponseBody setData(GetAppApiByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppApiByPageResponseBodyData getData() {
        return this.data;
    }

    public GetAppApiByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppApiByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppApiByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppApiByPageResponseBodyData extends TeaModel {
        /**
         * <p>Is completed.</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The data entries.</p>
         */
        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("Total")
        public String total;

        public static GetAppApiByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppApiByPageResponseBodyData self = new GetAppApiByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppApiByPageResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetAppApiByPageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public GetAppApiByPageResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetAppApiByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAppApiByPageResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
