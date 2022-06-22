// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryEventsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventsResponseBody self = new QueryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventsResponseBody setData(java.util.List<QueryEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryEventsResponseBodyData> getData() {
        return this.data;
    }

    public QueryEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventsResponseBodyDataResult extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryEventsResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryEventsResponseBodyDataResult self = new QueryEventsResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryEventsResponseBodyDataResult setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryEventsResponseBodyData extends TeaModel {
        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("result")
        public java.util.List<QueryEventsResponseBodyDataResult> result;

        @NameInMap("totalItem")
        public Long totalItem;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static QueryEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventsResponseBodyData self = new QueryEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEventsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEventsResponseBodyData setResult(java.util.List<QueryEventsResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryEventsResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryEventsResponseBodyData setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public QueryEventsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
