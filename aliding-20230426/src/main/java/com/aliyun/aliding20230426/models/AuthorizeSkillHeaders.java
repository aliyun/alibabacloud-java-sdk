// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AuthorizeSkillHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AuthorizeSkillHeadersAccountContext accountContext;

    public static AuthorizeSkillHeaders build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSkillHeaders self = new AuthorizeSkillHeaders();
        return TeaModel.build(map, self);
    }

    public AuthorizeSkillHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AuthorizeSkillHeaders setAccountContext(AuthorizeSkillHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AuthorizeSkillHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AuthorizeSkillHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AuthorizeSkillHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeSkillHeadersAccountContext self = new AuthorizeSkillHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AuthorizeSkillHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
