// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRulesResponseBody self = new QueryParamRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRulesResponseBody setData(QueryParamRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamRulesResponseBodyData getData() {
        return this.data;
    }

    public QueryParamRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRulesResponseBodyData extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rules")
        public java.util.List<String> rules;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryParamRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRulesResponseBodyData self = new QueryParamRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRulesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamRulesResponseBodyData setRules(java.util.List<String> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<String> getRules() {
            return this.rules;
        }

        public QueryParamRulesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamRulesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
