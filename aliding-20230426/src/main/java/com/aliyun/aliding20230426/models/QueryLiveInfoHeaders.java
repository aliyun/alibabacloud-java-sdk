// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryLiveInfoHeadersAccountContext accountContext;

    public static QueryLiveInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveInfoHeaders self = new QueryLiveInfoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryLiveInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryLiveInfoHeaders setAccountContext(QueryLiveInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryLiveInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryLiveInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryLiveInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveInfoHeadersAccountContext self = new QueryLiveInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryLiveInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
