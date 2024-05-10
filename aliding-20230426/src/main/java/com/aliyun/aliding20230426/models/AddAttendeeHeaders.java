// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddAttendeeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddAttendeeHeadersAccountContext accountContext;

    public static AddAttendeeHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddAttendeeHeaders self = new AddAttendeeHeaders();
        return TeaModel.build(map, self);
    }

    public AddAttendeeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddAttendeeHeaders setAccountContext(AddAttendeeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddAttendeeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddAttendeeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddAttendeeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddAttendeeHeadersAccountContext self = new AddAttendeeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddAttendeeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
