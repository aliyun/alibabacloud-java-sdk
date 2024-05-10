// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveMeetingRoomsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public RemoveMeetingRoomsHeadersAccountContext accountContext;

    public static RemoveMeetingRoomsHeaders build(java.util.Map<String, ?> map) throws Exception {
        RemoveMeetingRoomsHeaders self = new RemoveMeetingRoomsHeaders();
        return TeaModel.build(map, self);
    }

    public RemoveMeetingRoomsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public RemoveMeetingRoomsHeaders setAccountContext(RemoveMeetingRoomsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public RemoveMeetingRoomsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class RemoveMeetingRoomsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static RemoveMeetingRoomsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            RemoveMeetingRoomsHeadersAccountContext self = new RemoveMeetingRoomsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public RemoveMeetingRoomsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
