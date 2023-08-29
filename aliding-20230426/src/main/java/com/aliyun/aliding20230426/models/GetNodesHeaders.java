// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetNodesHeadersAccountContext accountContext;

    public static GetNodesHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetNodesHeaders self = new GetNodesHeaders();
        return TeaModel.build(map, self);
    }

    public GetNodesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetNodesHeaders setAccountContext(GetNodesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetNodesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetNodesHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetNodesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetNodesHeadersAccountContext self = new GetNodesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetNodesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
