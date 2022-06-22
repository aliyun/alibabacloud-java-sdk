// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeysWithNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamRuleHotKeysWithNameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRuleHotKeysWithNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeysWithNameResponseBody self = new QueryParamRuleHotKeysWithNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeysWithNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRuleHotKeysWithNameResponseBody setData(QueryParamRuleHotKeysWithNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamRuleHotKeysWithNameResponseBodyData getData() {
        return this.data;
    }

    public QueryParamRuleHotKeysWithNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRuleHotKeysWithNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRuleHotKeysWithNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRuleHotKeysWithNameResponseBodyDataMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Integer value;

        public static QueryParamRuleHotKeysWithNameResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeysWithNameResponseBodyDataMetrics self = new QueryParamRuleHotKeysWithNameResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeysWithNameResponseBodyDataMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryParamRuleHotKeysWithNameResponseBodyDataMetrics setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryParamRuleHotKeysWithNameResponseBodyData extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<QueryParamRuleHotKeysWithNameResponseBodyDataMetrics> metrics;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryParamRuleHotKeysWithNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeysWithNameResponseBodyData self = new QueryParamRuleHotKeysWithNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeysWithNameResponseBodyData setMetrics(java.util.List<QueryParamRuleHotKeysWithNameResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryParamRuleHotKeysWithNameResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryParamRuleHotKeysWithNameResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamRuleHotKeysWithNameResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamRuleHotKeysWithNameResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamRuleHotKeysWithNameResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
