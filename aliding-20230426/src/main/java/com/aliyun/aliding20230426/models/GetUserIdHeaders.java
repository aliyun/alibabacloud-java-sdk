// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetUserIdHeadersAccountContext accountContext;

    public static GetUserIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdHeaders self = new GetUserIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserIdHeaders setAccountContext(GetUserIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetUserIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetUserIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetUserIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdHeadersAccountContext self = new GetUserIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetUserIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
