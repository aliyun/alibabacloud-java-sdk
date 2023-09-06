// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InviteUsersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InviteUsersHeadersAccountContext accountContext;

    public static InviteUsersHeaders build(java.util.Map<String, ?> map) throws Exception {
        InviteUsersHeaders self = new InviteUsersHeaders();
        return TeaModel.build(map, self);
    }

    public InviteUsersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InviteUsersHeaders setAccountContext(InviteUsersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InviteUsersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InviteUsersHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static InviteUsersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InviteUsersHeadersAccountContext self = new InviteUsersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InviteUsersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
