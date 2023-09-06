// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMeetingRoomListHeadersAccountContext accountContext;

    public static QueryMeetingRoomListHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomListHeaders self = new QueryMeetingRoomListHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMeetingRoomListHeaders setAccountContext(QueryMeetingRoomListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMeetingRoomListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMeetingRoomListHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static QueryMeetingRoomListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomListHeadersAccountContext self = new QueryMeetingRoomListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
