// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParameHotKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParameHotKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParameHotKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParameHotKeysResponseBody self = new QueryParameHotKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParameHotKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParameHotKeysResponseBody setData(QueryParameHotKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParameHotKeysResponseBodyData getData() {
        return this.data;
    }

    public QueryParameHotKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParameHotKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParameHotKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParameHotKeysResponseBodyDataMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Integer value;

        public static QueryParameHotKeysResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryParameHotKeysResponseBodyDataMetrics self = new QueryParameHotKeysResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryParameHotKeysResponseBodyDataMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryParameHotKeysResponseBodyDataMetrics setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryParameHotKeysResponseBodyData extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<QueryParameHotKeysResponseBodyDataMetrics> metrics;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryParameHotKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParameHotKeysResponseBodyData self = new QueryParameHotKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParameHotKeysResponseBodyData setMetrics(java.util.List<QueryParameHotKeysResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryParameHotKeysResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryParameHotKeysResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParameHotKeysResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParameHotKeysResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParameHotKeysResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
