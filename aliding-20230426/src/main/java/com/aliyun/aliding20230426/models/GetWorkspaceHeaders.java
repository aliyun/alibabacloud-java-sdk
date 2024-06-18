// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetWorkspaceHeadersAccountContext accountContext;

    public static GetWorkspaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceHeaders self = new GetWorkspaceHeaders();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetWorkspaceHeaders setAccountContext(GetWorkspaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetWorkspaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetWorkspaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetWorkspaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceHeadersAccountContext self = new GetWorkspaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
