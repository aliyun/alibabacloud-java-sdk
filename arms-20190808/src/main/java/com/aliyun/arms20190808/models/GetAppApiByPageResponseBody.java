// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppApiByPageResponseBody extends TeaModel {
    // The HTTP status code returned for the request. Valid values:
    // 
    // *   2XX: The request is successful.
    // *   3XX: A redirection message is returned.
    // *   4XX: The request is invalid.
    // *   5XX: A server error occurs.
    @NameInMap("Code")
    public Integer code;

    // The struct returned.
    @NameInMap("Data")
    public GetAppApiByPageResponseBodyData data;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the call is successful. Valid values:
    // 
    // *   `true`: The call is successful.
    // *   `false`: The call fails.
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
        // The information about the API operation.
        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        // The page number of the returned page.
        @NameInMap("Page")
        public Integer page;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("Total")
        public String total;

        public static GetAppApiByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppApiByPageResponseBodyData self = new GetAppApiByPageResponseBodyData();
            return TeaModel.build(map, self);
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
