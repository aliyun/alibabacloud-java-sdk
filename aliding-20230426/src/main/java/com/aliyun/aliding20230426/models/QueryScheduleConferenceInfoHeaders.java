// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryScheduleConferenceInfoHeadersAccountContext accountContext;

    public static QueryScheduleConferenceInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceInfoHeaders self = new QueryScheduleConferenceInfoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryScheduleConferenceInfoHeaders setAccountContext(QueryScheduleConferenceInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryScheduleConferenceInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryScheduleConferenceInfoHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryScheduleConferenceInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryScheduleConferenceInfoHeadersAccountContext self = new QueryScheduleConferenceInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryScheduleConferenceInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
