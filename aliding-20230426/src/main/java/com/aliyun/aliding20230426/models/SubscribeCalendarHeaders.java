// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeCalendarHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SubscribeCalendarHeadersAccountContext accountContext;

    public static SubscribeCalendarHeaders build(java.util.Map<String, ?> map) throws Exception {
        SubscribeCalendarHeaders self = new SubscribeCalendarHeaders();
        return TeaModel.build(map, self);
    }

    public SubscribeCalendarHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SubscribeCalendarHeaders setAccountContext(SubscribeCalendarHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SubscribeCalendarHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SubscribeCalendarHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SubscribeCalendarHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SubscribeCalendarHeadersAccountContext self = new SubscribeCalendarHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SubscribeCalendarHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
