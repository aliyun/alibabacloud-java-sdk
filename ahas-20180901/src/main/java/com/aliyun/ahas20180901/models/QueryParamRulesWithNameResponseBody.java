// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRulesWithNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamRulesWithNameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRulesWithNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRulesWithNameResponseBody self = new QueryParamRulesWithNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRulesWithNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRulesWithNameResponseBody setData(QueryParamRulesWithNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamRulesWithNameResponseBodyData getData() {
        return this.data;
    }

    public QueryParamRulesWithNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRulesWithNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRulesWithNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRulesWithNameResponseBodyData extends TeaModel {
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

        public static QueryParamRulesWithNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRulesWithNameResponseBodyData self = new QueryParamRulesWithNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRulesWithNameResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamRulesWithNameResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamRulesWithNameResponseBodyData setRules(java.util.List<String> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<String> getRules() {
            return this.rules;
        }

        public QueryParamRulesWithNameResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamRulesWithNameResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
