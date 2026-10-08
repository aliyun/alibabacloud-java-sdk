// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokePageHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("accountContext")
    public InvokePageHeadersAccountContext accountContext;

    public static InvokePageHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvokePageHeaders self = new InvokePageHeaders();
        return TeaModel.build(map, self);
    }

    public InvokePageHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvokePageHeaders setAccountContext(InvokePageHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InvokePageHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InvokePageHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("alidingSsoTicket")
        public String alidingSsoTicket;

        @NameInMap("ssoTicket")
        public String ssoTicket;

        public static InvokePageHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InvokePageHeadersAccountContext self = new InvokePageHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InvokePageHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public InvokePageHeadersAccountContext setAlidingSsoTicket(String alidingSsoTicket) {
            this.alidingSsoTicket = alidingSsoTicket;
            return this;
        }
        public String getAlidingSsoTicket() {
            return this.alidingSsoTicket;
        }

        public InvokePageHeadersAccountContext setSsoTicket(String ssoTicket) {
            this.ssoTicket = ssoTicket;
            return this;
        }
        public String getSsoTicket() {
            return this.ssoTicket;
        }

    }

}
