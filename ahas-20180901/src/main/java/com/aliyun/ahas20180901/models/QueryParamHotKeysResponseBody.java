// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamHotKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamHotKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamHotKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamHotKeysResponseBody self = new QueryParamHotKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamHotKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamHotKeysResponseBody setData(QueryParamHotKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamHotKeysResponseBodyData getData() {
        return this.data;
    }

    public QueryParamHotKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamHotKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamHotKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamHotKeysResponseBodyDataMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Integer value;

        public static QueryParamHotKeysResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryParamHotKeysResponseBodyDataMetrics self = new QueryParamHotKeysResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryParamHotKeysResponseBodyDataMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryParamHotKeysResponseBodyDataMetrics setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryParamHotKeysResponseBodyData extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<QueryParamHotKeysResponseBodyDataMetrics> metrics;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryParamHotKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamHotKeysResponseBodyData self = new QueryParamHotKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamHotKeysResponseBodyData setMetrics(java.util.List<QueryParamHotKeysResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryParamHotKeysResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryParamHotKeysResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamHotKeysResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamHotKeysResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamHotKeysResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
