// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddWorkspaceHeadersAccountContext accountContext;

    public static AddWorkspaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceHeaders self = new AddWorkspaceHeaders();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddWorkspaceHeaders setAccountContext(AddWorkspaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddWorkspaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddWorkspaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddWorkspaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceHeadersAccountContext self = new AddWorkspaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
