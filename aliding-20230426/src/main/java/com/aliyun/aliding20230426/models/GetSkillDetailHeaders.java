// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillDetailHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetSkillDetailHeadersAccountContext accountContext;

    public static GetSkillDetailHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetSkillDetailHeaders self = new GetSkillDetailHeaders();
        return TeaModel.build(map, self);
    }

    public GetSkillDetailHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetSkillDetailHeaders setAccountContext(GetSkillDetailHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetSkillDetailHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetSkillDetailHeadersAccountContext extends TeaModel {
        /**
         * <p>Buc SsoTicket</p>
         * 
         * <strong>example:</strong>
         * <p>bucxxx</p>
         */
        @NameInMap("SsoTicket")
        public String ssoTicket;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetSkillDetailHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetSkillDetailHeadersAccountContext self = new GetSkillDetailHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetSkillDetailHeadersAccountContext setSsoTicket(String ssoTicket) {
            this.ssoTicket = ssoTicket;
            return this;
        }
        public String getSsoTicket() {
            return this.ssoTicket;
        }

        public GetSkillDetailHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
