// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRelatedWorkspacesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetRelatedWorkspacesHeadersAccountContext accountContext;

    public static GetRelatedWorkspacesHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedWorkspacesHeaders self = new GetRelatedWorkspacesHeaders();
        return TeaModel.build(map, self);
    }

    public GetRelatedWorkspacesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetRelatedWorkspacesHeaders setAccountContext(GetRelatedWorkspacesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetRelatedWorkspacesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetRelatedWorkspacesHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetRelatedWorkspacesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetRelatedWorkspacesHeadersAccountContext self = new GetRelatedWorkspacesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetRelatedWorkspacesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
