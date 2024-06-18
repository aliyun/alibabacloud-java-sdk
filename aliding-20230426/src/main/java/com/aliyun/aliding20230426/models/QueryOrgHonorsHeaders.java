// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgHonorsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryOrgHonorsHeadersAccountContext accountContext;

    public static QueryOrgHonorsHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgHonorsHeaders self = new QueryOrgHonorsHeaders();
        return TeaModel.build(map, self);
    }

    public QueryOrgHonorsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryOrgHonorsHeaders setAccountContext(QueryOrgHonorsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryOrgHonorsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryOrgHonorsHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>243331014234180628</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryOrgHonorsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryOrgHonorsHeadersAccountContext self = new QueryOrgHonorsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryOrgHonorsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
