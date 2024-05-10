// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchUserListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryLiveWatchUserListHeadersAccountContext accountContext;

    public static QueryLiveWatchUserListHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchUserListHeaders self = new QueryLiveWatchUserListHeaders();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchUserListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryLiveWatchUserListHeaders setAccountContext(QueryLiveWatchUserListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryLiveWatchUserListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryLiveWatchUserListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryLiveWatchUserListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveWatchUserListHeadersAccountContext self = new QueryLiveWatchUserListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryLiveWatchUserListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
