// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMeetingRoomGroupListHeadersAccountContext accountContext;

    public static QueryMeetingRoomGroupListHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupListHeaders self = new QueryMeetingRoomGroupListHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMeetingRoomGroupListHeaders setAccountContext(QueryMeetingRoomGroupListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMeetingRoomGroupListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMeetingRoomGroupListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryMeetingRoomGroupListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomGroupListHeadersAccountContext self = new QueryMeetingRoomGroupListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomGroupListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
