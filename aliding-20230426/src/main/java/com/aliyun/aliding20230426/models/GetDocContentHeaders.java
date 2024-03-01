// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDocContentHeadersAccountContext accountContext;

    public static GetDocContentHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentHeaders self = new GetDocContentHeaders();
        return TeaModel.build(map, self);
    }

    public GetDocContentHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDocContentHeaders setAccountContext(GetDocContentHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDocContentHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDocContentHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetDocContentHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDocContentHeadersAccountContext self = new GetDocContentHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDocContentHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
