// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateWorkspaceMembersHeadersAccountContext accountContext;

    public static UpdateWorkspaceMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceMembersHeaders self = new UpdateWorkspaceMembersHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateWorkspaceMembersHeaders setAccountContext(UpdateWorkspaceMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateWorkspaceMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateWorkspaceMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateWorkspaceMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceMembersHeadersAccountContext self = new UpdateWorkspaceMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
