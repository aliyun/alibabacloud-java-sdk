// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryConferenceInfoHeadersAccountContext accountContext;

    public static QueryConferenceInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoHeaders self = new QueryConferenceInfoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryConferenceInfoHeaders setAccountContext(QueryConferenceInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryConferenceInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryConferenceInfoHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>208579</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryConferenceInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceInfoHeadersAccountContext self = new QueryConferenceInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryConferenceInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
