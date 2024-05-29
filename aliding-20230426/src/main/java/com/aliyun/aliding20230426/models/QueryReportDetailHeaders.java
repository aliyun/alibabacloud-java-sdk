// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryReportDetailHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryReportDetailHeadersAccountContext accountContext;

    public static QueryReportDetailHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryReportDetailHeaders self = new QueryReportDetailHeaders();
        return TeaModel.build(map, self);
    }

    public QueryReportDetailHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryReportDetailHeaders setAccountContext(QueryReportDetailHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryReportDetailHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryReportDetailHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryReportDetailHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryReportDetailHeadersAccountContext self = new QueryReportDetailHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryReportDetailHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
