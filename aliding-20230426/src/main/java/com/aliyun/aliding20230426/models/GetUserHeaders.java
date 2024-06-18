// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetUserHeadersAccountContext accountContext;

    public static GetUserHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserHeaders self = new GetUserHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserHeaders setAccountContext(GetUserHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetUserHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetUserHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetUserHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserHeadersAccountContext self = new GetUserHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetUserHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
