// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateMeetingRoomGroupHeadersAccountContext accountContext;

    public static CreateMeetingRoomGroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomGroupHeaders self = new CreateMeetingRoomGroupHeaders();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomGroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateMeetingRoomGroupHeaders setAccountContext(CreateMeetingRoomGroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateMeetingRoomGroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateMeetingRoomGroupHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateMeetingRoomGroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomGroupHeadersAccountContext self = new CreateMeetingRoomGroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomGroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
