// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetSkillsHeadersAccountContext accountContext;

    public static GetSkillsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetSkillsHeaders self = new GetSkillsHeaders();
        return TeaModel.build(map, self);
    }

    public GetSkillsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetSkillsHeaders setAccountContext(GetSkillsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetSkillsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetSkillsHeadersAccountContext extends TeaModel {
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

        public static GetSkillsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetSkillsHeadersAccountContext self = new GetSkillsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetSkillsHeadersAccountContext setSsoTicket(String ssoTicket) {
            this.ssoTicket = ssoTicket;
            return this;
        }
        public String getSsoTicket() {
            return this.ssoTicket;
        }

        public GetSkillsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
