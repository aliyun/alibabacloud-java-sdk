// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMeetingRoomsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddMeetingRoomsHeadersAccountContext accountContext;

    public static AddMeetingRoomsHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddMeetingRoomsHeaders self = new AddMeetingRoomsHeaders();
        return TeaModel.build(map, self);
    }

    public AddMeetingRoomsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddMeetingRoomsHeaders setAccountContext(AddMeetingRoomsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddMeetingRoomsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddMeetingRoomsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddMeetingRoomsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddMeetingRoomsHeadersAccountContext self = new AddMeetingRoomsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddMeetingRoomsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
