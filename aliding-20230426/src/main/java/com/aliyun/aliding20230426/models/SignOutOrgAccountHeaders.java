// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SignOutOrgAccountHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SignOutOrgAccountHeadersAccountContext accountContext;

    public static SignOutOrgAccountHeaders build(java.util.Map<String, ?> map) throws Exception {
        SignOutOrgAccountHeaders self = new SignOutOrgAccountHeaders();
        return TeaModel.build(map, self);
    }

    public SignOutOrgAccountHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SignOutOrgAccountHeaders setAccountContext(SignOutOrgAccountHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SignOutOrgAccountHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SignOutOrgAccountHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SignOutOrgAccountHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SignOutOrgAccountHeadersAccountContext self = new SignOutOrgAccountHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SignOutOrgAccountHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
