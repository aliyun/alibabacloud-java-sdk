// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMobilesCardSupportResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMobilesCardSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMobilesCardSupportResponseBody self = new QueryMobilesCardSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMobilesCardSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMobilesCardSupportResponseBody setData(QueryMobilesCardSupportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMobilesCardSupportResponseBodyData getData() {
        return this.data;
    }

    public QueryMobilesCardSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMobilesCardSupportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMobilesCardSupportResponseBodyDataQueryResult extends TeaModel {
        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Support")
        public Boolean support;

        public static QueryMobilesCardSupportResponseBodyDataQueryResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMobilesCardSupportResponseBodyDataQueryResult self = new QueryMobilesCardSupportResponseBodyDataQueryResult();
            return TeaModel.build(map, self);
        }

        public QueryMobilesCardSupportResponseBodyDataQueryResult setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryMobilesCardSupportResponseBodyDataQueryResult setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

    public static class QueryMobilesCardSupportResponseBodyData extends TeaModel {
        @NameInMap("QueryResult")
        public java.util.List<QueryMobilesCardSupportResponseBodyDataQueryResult> queryResult;

        public static QueryMobilesCardSupportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMobilesCardSupportResponseBodyData self = new QueryMobilesCardSupportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMobilesCardSupportResponseBodyData setQueryResult(java.util.List<QueryMobilesCardSupportResponseBodyDataQueryResult> queryResult) {
            this.queryResult = queryResult;
            return this;
        }
        public java.util.List<QueryMobilesCardSupportResponseBodyDataQueryResult> getQueryResult() {
            return this.queryResult;
        }

    }

}
