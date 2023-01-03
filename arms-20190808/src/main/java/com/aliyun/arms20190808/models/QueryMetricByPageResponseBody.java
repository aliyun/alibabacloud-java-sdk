// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricByPageResponseBody extends TeaModel {
    // The HTTP status code returned for the request. Valid values:
    // 
    // *   2XX: The request was successful.
    // *   3XX: A redirection message was returned.
    // *   4XX: The request was invalid.
    // *   5XX: A server error occurred.
    @NameInMap("Code")
    public String code;

    // The struct returned.
    @NameInMap("Data")
    public QueryMetricByPageResponseBodyData data;

    // The error message returned if the call fails.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the call was successful. Valid values:
    // 
    // *   `true`: The call was successful.
    // *   `false`: The call failed.
    @NameInMap("Success")
    public Boolean success;

    public static QueryMetricByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricByPageResponseBody self = new QueryMetricByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMetricByPageResponseBody setData(QueryMetricByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMetricByPageResponseBodyData getData() {
        return this.data;
    }

    public QueryMetricByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMetricByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMetricByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMetricByPageResponseBodyData extends TeaModel {
        // The data entries returned.
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
        public Integer total;

        public static QueryMetricByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricByPageResponseBodyData self = new QueryMetricByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMetricByPageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public QueryMetricByPageResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryMetricByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMetricByPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
