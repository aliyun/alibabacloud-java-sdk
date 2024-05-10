// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryConferenceMembersHeadersAccountContext accountContext;

    public static QueryConferenceMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceMembersHeaders self = new QueryConferenceMembersHeaders();
        return TeaModel.build(map, self);
    }

    public QueryConferenceMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryConferenceMembersHeaders setAccountContext(QueryConferenceMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryConferenceMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryConferenceMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryConferenceMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceMembersHeadersAccountContext self = new QueryConferenceMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryConferenceMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
