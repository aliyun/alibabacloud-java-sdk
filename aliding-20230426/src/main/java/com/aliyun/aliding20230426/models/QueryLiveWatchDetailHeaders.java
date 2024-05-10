// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchDetailHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryLiveWatchDetailHeadersAccountContext accountContext;

    public static QueryLiveWatchDetailHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchDetailHeaders self = new QueryLiveWatchDetailHeaders();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchDetailHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryLiveWatchDetailHeaders setAccountContext(QueryLiveWatchDetailHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryLiveWatchDetailHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryLiveWatchDetailHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryLiveWatchDetailHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveWatchDetailHeadersAccountContext self = new QueryLiveWatchDetailHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryLiveWatchDetailHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
