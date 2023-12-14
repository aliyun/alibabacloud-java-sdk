// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceByIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetInstanceByIdHeadersAccountContext accountContext;

    public static GetInstanceByIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceByIdHeaders self = new GetInstanceByIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetInstanceByIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetInstanceByIdHeaders setAccountContext(GetInstanceByIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetInstanceByIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetInstanceByIdHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetInstanceByIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceByIdHeadersAccountContext self = new GetInstanceByIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetInstanceByIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
