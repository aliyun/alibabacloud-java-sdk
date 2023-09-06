// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMeetingRoomHeadersAccountContext accountContext;

    public static QueryMeetingRoomHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomHeaders self = new QueryMeetingRoomHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMeetingRoomHeaders setAccountContext(QueryMeetingRoomHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMeetingRoomHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMeetingRoomHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static QueryMeetingRoomHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomHeadersAccountContext self = new QueryMeetingRoomHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
