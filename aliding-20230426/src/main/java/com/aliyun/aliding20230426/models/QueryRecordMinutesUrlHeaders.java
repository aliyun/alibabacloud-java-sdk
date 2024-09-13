// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRecordMinutesUrlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryRecordMinutesUrlHeadersAccountContext accountContext;

    public static QueryRecordMinutesUrlHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordMinutesUrlHeaders self = new QueryRecordMinutesUrlHeaders();
        return TeaModel.build(map, self);
    }

    public QueryRecordMinutesUrlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryRecordMinutesUrlHeaders setAccountContext(QueryRecordMinutesUrlHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryRecordMinutesUrlHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryRecordMinutesUrlHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryRecordMinutesUrlHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordMinutesUrlHeadersAccountContext self = new QueryRecordMinutesUrlHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryRecordMinutesUrlHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
