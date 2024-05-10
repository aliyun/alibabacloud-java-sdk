// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceDocMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddWorkspaceDocMembersHeadersAccountContext accountContext;

    public static AddWorkspaceDocMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceDocMembersHeaders self = new AddWorkspaceDocMembersHeaders();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceDocMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddWorkspaceDocMembersHeaders setAccountContext(AddWorkspaceDocMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddWorkspaceDocMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddWorkspaceDocMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddWorkspaceDocMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceDocMembersHeadersAccountContext self = new AddWorkspaceDocMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceDocMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
