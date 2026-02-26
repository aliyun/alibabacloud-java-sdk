// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InvokeSkillHeadersAccountContext accountContext;

    public static InvokeSkillHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvokeSkillHeaders self = new InvokeSkillHeaders();
        return TeaModel.build(map, self);
    }

    public InvokeSkillHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvokeSkillHeaders setAccountContext(InvokeSkillHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InvokeSkillHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InvokeSkillHeadersAccountContext extends TeaModel {
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

        public static InvokeSkillHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InvokeSkillHeadersAccountContext self = new InvokeSkillHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InvokeSkillHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public InvokeSkillHeadersAccountContext setAlidingSsoTicket(String alidingSsoTicket) {
            this.alidingSsoTicket = alidingSsoTicket;
            return this;
        }
        public String getAlidingSsoTicket() {
            return this.alidingSsoTicket;
        }

        public InvokeSkillHeadersAccountContext setSsoTicket(String ssoTicket) {
            this.ssoTicket = ssoTicket;
            return this;
        }
        public String getSsoTicket() {
            return this.ssoTicket;
        }

    }

}
