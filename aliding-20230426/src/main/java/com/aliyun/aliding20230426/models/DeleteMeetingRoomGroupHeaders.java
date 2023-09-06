// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomGroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteMeetingRoomGroupHeadersAccountContext accountContext;

    public static DeleteMeetingRoomGroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomGroupHeaders self = new DeleteMeetingRoomGroupHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomGroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteMeetingRoomGroupHeaders setAccountContext(DeleteMeetingRoomGroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteMeetingRoomGroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteMeetingRoomGroupHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static DeleteMeetingRoomGroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMeetingRoomGroupHeadersAccountContext self = new DeleteMeetingRoomGroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteMeetingRoomGroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
