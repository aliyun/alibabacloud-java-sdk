// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateMeetingRoomHeadersAccountContext accountContext;

    public static UpdateMeetingRoomHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomHeaders self = new UpdateMeetingRoomHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateMeetingRoomHeaders setAccountContext(UpdateMeetingRoomHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateMeetingRoomHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateMeetingRoomHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateMeetingRoomHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMeetingRoomHeadersAccountContext self = new UpdateMeetingRoomHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateMeetingRoomHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
