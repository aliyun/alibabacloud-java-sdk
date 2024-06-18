// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeCalendarHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UnsubscribeCalendarHeadersAccountContext accountContext;

    public static UnsubscribeCalendarHeaders build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeCalendarHeaders self = new UnsubscribeCalendarHeaders();
        return TeaModel.build(map, self);
    }

    public UnsubscribeCalendarHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UnsubscribeCalendarHeaders setAccountContext(UnsubscribeCalendarHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UnsubscribeCalendarHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UnsubscribeCalendarHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UnsubscribeCalendarHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UnsubscribeCalendarHeadersAccountContext self = new UnsubscribeCalendarHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UnsubscribeCalendarHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
