// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesSummaryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMinutesSummaryHeadersAccountContext accountContext;

    public static QueryMinutesSummaryHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesSummaryHeaders self = new QueryMinutesSummaryHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMinutesSummaryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMinutesSummaryHeaders setAccountContext(QueryMinutesSummaryHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMinutesSummaryHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMinutesSummaryHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryMinutesSummaryHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryHeadersAccountContext self = new QueryMinutesSummaryHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
