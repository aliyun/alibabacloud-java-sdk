// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateMeetingRoomHeadersAccountContext accountContext;

    public static CreateMeetingRoomHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomHeaders self = new CreateMeetingRoomHeaders();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateMeetingRoomHeaders setAccountContext(CreateMeetingRoomHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateMeetingRoomHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateMeetingRoomHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateMeetingRoomHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomHeadersAccountContext self = new CreateMeetingRoomHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
