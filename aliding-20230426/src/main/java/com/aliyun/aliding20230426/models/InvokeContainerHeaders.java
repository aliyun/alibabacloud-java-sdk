// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeContainerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("accountContext")
    public InvokeContainerHeadersAccountContext accountContext;

    public static InvokeContainerHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvokeContainerHeaders self = new InvokeContainerHeaders();
        return TeaModel.build(map, self);
    }

    public InvokeContainerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvokeContainerHeaders setAccountContext(InvokeContainerHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InvokeContainerHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InvokeContainerHeadersAccountContext extends TeaModel {
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

        public static InvokeContainerHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InvokeContainerHeadersAccountContext self = new InvokeContainerHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InvokeContainerHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public InvokeContainerHeadersAccountContext setAlidingSsoTicket(String alidingSsoTicket) {
            this.alidingSsoTicket = alidingSsoTicket;
            return this;
        }
        public String getAlidingSsoTicket() {
            return this.alidingSsoTicket;
        }

        public InvokeContainerHeadersAccountContext setSsoTicket(String ssoTicket) {
            this.ssoTicket = ssoTicket;
            return this;
        }
        public String getSsoTicket() {
            return this.ssoTicket;
        }

    }

}
