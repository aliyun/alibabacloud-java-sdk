// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteWorkspaceMembersHeadersAccountContext accountContext;

    public static DeleteWorkspaceMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMembersHeaders self = new DeleteWorkspaceMembersHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteWorkspaceMembersHeaders setAccountContext(DeleteWorkspaceMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteWorkspaceMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteWorkspaceMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteWorkspaceMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceMembersHeadersAccountContext self = new DeleteWorkspaceMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
