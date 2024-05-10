// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMineWorkspaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMineWorkspaceHeadersAccountContext accountContext;

    public static GetMineWorkspaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMineWorkspaceHeaders self = new GetMineWorkspaceHeaders();
        return TeaModel.build(map, self);
    }

    public GetMineWorkspaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMineWorkspaceHeaders setAccountContext(GetMineWorkspaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMineWorkspaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMineWorkspaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetMineWorkspaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMineWorkspaceHeadersAccountContext self = new GetMineWorkspaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMineWorkspaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
