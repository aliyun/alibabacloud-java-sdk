// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateWorkspaceDocHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateWorkspaceDocHeadersAccountContext accountContext;

    public static CreateWorkspaceDocHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceDocHeaders self = new CreateWorkspaceDocHeaders();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceDocHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateWorkspaceDocHeaders setAccountContext(CreateWorkspaceDocHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateWorkspaceDocHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateWorkspaceDocHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static CreateWorkspaceDocHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceDocHeadersAccountContext self = new CreateWorkspaceDocHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceDocHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
