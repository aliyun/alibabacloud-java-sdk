// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspacesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetWorkspacesHeadersAccountContext accountContext;

    public static GetWorkspacesHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacesHeaders self = new GetWorkspacesHeaders();
        return TeaModel.build(map, self);
    }

    public GetWorkspacesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetWorkspacesHeaders setAccountContext(GetWorkspacesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetWorkspacesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetWorkspacesHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetWorkspacesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacesHeadersAccountContext self = new GetWorkspacesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetWorkspacesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
