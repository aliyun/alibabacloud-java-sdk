// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyStatisticsOnNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRuleHotKeyStatisticsOnNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyStatisticsOnNodeResponseBody self = new QueryParamRuleHotKeyStatisticsOnNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody setData(QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData getData() {
        return this.data;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData extends TeaModel {
        @NameInMap("NodeMetrics")
        public java.util.Map<String, ?> nodeMetrics;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData self = new QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData setNodeMetrics(java.util.Map<String, ?> nodeMetrics) {
            this.nodeMetrics = nodeMetrics;
            return this;
        }
        public java.util.Map<String, ?> getNodeMetrics() {
            return this.nodeMetrics;
        }

        public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamRuleHotKeyStatisticsOnNodeResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
