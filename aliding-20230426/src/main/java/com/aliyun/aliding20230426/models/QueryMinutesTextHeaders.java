// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesTextHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMinutesTextHeadersAccountContext accountContext;

    public static QueryMinutesTextHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesTextHeaders self = new QueryMinutesTextHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMinutesTextHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMinutesTextHeaders setAccountContext(QueryMinutesTextHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMinutesTextHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMinutesTextHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryMinutesTextHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesTextHeadersAccountContext self = new QueryMinutesTextHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMinutesTextHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
