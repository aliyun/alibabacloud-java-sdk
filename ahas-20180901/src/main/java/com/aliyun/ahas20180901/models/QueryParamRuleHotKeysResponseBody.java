// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryParamRuleHotKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRuleHotKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeysResponseBody self = new QueryParamRuleHotKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRuleHotKeysResponseBody setData(QueryParamRuleHotKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryParamRuleHotKeysResponseBodyData getData() {
        return this.data;
    }

    public QueryParamRuleHotKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRuleHotKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRuleHotKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRuleHotKeysResponseBodyData extends TeaModel {
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

        public static QueryParamRuleHotKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeysResponseBodyData self = new QueryParamRuleHotKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeysResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryParamRuleHotKeysResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryParamRuleHotKeysResponseBodyData setRules(java.util.List<String> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<String> getRules() {
            return this.rules;
        }

        public QueryParamRuleHotKeysResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryParamRuleHotKeysResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
