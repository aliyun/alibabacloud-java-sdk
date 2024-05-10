// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryScheduleConferenceHeadersAccountContext accountContext;

    public static QueryScheduleConferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceHeaders self = new QueryScheduleConferenceHeaders();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryScheduleConferenceHeaders setAccountContext(QueryScheduleConferenceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryScheduleConferenceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryScheduleConferenceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryScheduleConferenceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryScheduleConferenceHeadersAccountContext self = new QueryScheduleConferenceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryScheduleConferenceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
