// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMinutesHeadersAccountContext accountContext;

    public static QueryMinutesHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesHeaders self = new QueryMinutesHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMinutesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMinutesHeaders setAccountContext(QueryMinutesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMinutesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMinutesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryMinutesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesHeadersAccountContext self = new QueryMinutesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMinutesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
