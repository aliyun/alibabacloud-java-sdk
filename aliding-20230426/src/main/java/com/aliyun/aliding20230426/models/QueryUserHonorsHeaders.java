// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryUserHonorsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryUserHonorsHeadersAccountContext accountContext;

    public static QueryUserHonorsHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryUserHonorsHeaders self = new QueryUserHonorsHeaders();
        return TeaModel.build(map, self);
    }

    public QueryUserHonorsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryUserHonorsHeaders setAccountContext(QueryUserHonorsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryUserHonorsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryUserHonorsHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>243331014234180628</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryUserHonorsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryUserHonorsHeadersAccountContext self = new QueryUserHonorsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryUserHonorsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
