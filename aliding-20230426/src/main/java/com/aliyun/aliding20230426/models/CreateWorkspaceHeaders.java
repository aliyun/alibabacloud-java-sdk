// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateWorkspaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateWorkspaceHeadersAccountContext accountContext;

    public static CreateWorkspaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceHeaders self = new CreateWorkspaceHeaders();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateWorkspaceHeaders setAccountContext(CreateWorkspaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateWorkspaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateWorkspaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateWorkspaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceHeadersAccountContext self = new CreateWorkspaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
