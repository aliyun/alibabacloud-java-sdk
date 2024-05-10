// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteMeetingRoomHeadersAccountContext accountContext;

    public static DeleteMeetingRoomHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomHeaders self = new DeleteMeetingRoomHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteMeetingRoomHeaders setAccountContext(DeleteMeetingRoomHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteMeetingRoomHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteMeetingRoomHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteMeetingRoomHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMeetingRoomHeadersAccountContext self = new DeleteMeetingRoomHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteMeetingRoomHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
