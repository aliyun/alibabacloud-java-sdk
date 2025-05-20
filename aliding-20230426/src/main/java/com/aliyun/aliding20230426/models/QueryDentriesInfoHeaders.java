// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentriesInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryDentriesInfoHeadersAccountContext accountContext;

    public static QueryDentriesInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryDentriesInfoHeaders self = new QueryDentriesInfoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryDentriesInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryDentriesInfoHeaders setAccountContext(QueryDentriesInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryDentriesInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryDentriesInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryDentriesInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryDentriesInfoHeadersAccountContext self = new QueryDentriesInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryDentriesInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
