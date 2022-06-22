// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyOnNodesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamRuleHotKeyOnNodesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRuleHotKeyOnNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyOnNodesResponseBody self = new QueryParamRuleHotKeyOnNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyOnNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRuleHotKeyOnNodesResponseBody setData(QueryParamRuleHotKeyOnNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamRuleHotKeyOnNodesResponseBodyData getData() {
        return this.data;
    }

    public QueryParamRuleHotKeyOnNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRuleHotKeyOnNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRuleHotKeyOnNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Integer value;

        public static QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics self = new QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryParamRuleHotKeyOnNodesResponseBodyData extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics> metrics;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryParamRuleHotKeyOnNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeyOnNodesResponseBodyData self = new QueryParamRuleHotKeyOnNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyData setMetrics(java.util.List<QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryParamRuleHotKeyOnNodesResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamRuleHotKeyOnNodesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
