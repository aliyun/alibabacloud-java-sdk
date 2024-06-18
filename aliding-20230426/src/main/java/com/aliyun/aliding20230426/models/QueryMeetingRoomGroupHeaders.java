// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryMeetingRoomGroupHeadersAccountContext accountContext;

    public static QueryMeetingRoomGroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupHeaders self = new QueryMeetingRoomGroupHeaders();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryMeetingRoomGroupHeaders setAccountContext(QueryMeetingRoomGroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryMeetingRoomGroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryMeetingRoomGroupHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryMeetingRoomGroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomGroupHeadersAccountContext self = new QueryMeetingRoomGroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomGroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
