// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryGroupLiveInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryGroupLiveInfoHeadersAccountContext accountContext;

    public static QueryGroupLiveInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupLiveInfoHeaders self = new QueryGroupLiveInfoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryGroupLiveInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryGroupLiveInfoHeaders setAccountContext(QueryGroupLiveInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryGroupLiveInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryGroupLiveInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryGroupLiveInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupLiveInfoHeadersAccountContext self = new QueryGroupLiveInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryGroupLiveInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
