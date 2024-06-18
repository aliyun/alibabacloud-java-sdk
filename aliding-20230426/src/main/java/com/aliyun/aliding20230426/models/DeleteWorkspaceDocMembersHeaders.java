// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceDocMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteWorkspaceDocMembersHeadersAccountContext accountContext;

    public static DeleteWorkspaceDocMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceDocMembersHeaders self = new DeleteWorkspaceDocMembersHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceDocMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteWorkspaceDocMembersHeaders setAccountContext(DeleteWorkspaceDocMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteWorkspaceDocMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteWorkspaceDocMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteWorkspaceDocMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceDocMembersHeadersAccountContext self = new DeleteWorkspaceDocMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceDocMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
