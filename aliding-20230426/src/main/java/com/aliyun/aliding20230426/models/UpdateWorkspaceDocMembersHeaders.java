// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDocMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateWorkspaceDocMembersHeadersAccountContext accountContext;

    public static UpdateWorkspaceDocMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDocMembersHeaders self = new UpdateWorkspaceDocMembersHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDocMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateWorkspaceDocMembersHeaders setAccountContext(UpdateWorkspaceDocMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateWorkspaceDocMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateWorkspaceDocMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateWorkspaceDocMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceDocMembersHeadersAccountContext self = new UpdateWorkspaceDocMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceDocMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
