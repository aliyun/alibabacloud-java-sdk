// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomGroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateMeetingRoomGroupHeadersAccountContext accountContext;

    public static UpdateMeetingRoomGroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomGroupHeaders self = new UpdateMeetingRoomGroupHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomGroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateMeetingRoomGroupHeaders setAccountContext(UpdateMeetingRoomGroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateMeetingRoomGroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateMeetingRoomGroupHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UpdateMeetingRoomGroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMeetingRoomGroupHeadersAccountContext self = new UpdateMeetingRoomGroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateMeetingRoomGroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
