// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryDentryHeadersAccountContext accountContext;

    public static QueryDentryHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryDentryHeaders self = new QueryDentryHeaders();
        return TeaModel.build(map, self);
    }

    public QueryDentryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryDentryHeaders setAccountContext(QueryDentryHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryDentryHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryDentryHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryDentryHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryHeadersAccountContext self = new QueryDentryHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryDentryHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
