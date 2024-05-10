// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveAttendeeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public RemoveAttendeeHeadersAccountContext accountContext;

    public static RemoveAttendeeHeaders build(java.util.Map<String, ?> map) throws Exception {
        RemoveAttendeeHeaders self = new RemoveAttendeeHeaders();
        return TeaModel.build(map, self);
    }

    public RemoveAttendeeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public RemoveAttendeeHeaders setAccountContext(RemoveAttendeeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public RemoveAttendeeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class RemoveAttendeeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static RemoveAttendeeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            RemoveAttendeeHeadersAccountContext self = new RemoveAttendeeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public RemoveAttendeeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
