// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScenegroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetScenegroupHeadersAccountContext accountContext;

    public static GetScenegroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetScenegroupHeaders self = new GetScenegroupHeaders();
        return TeaModel.build(map, self);
    }

    public GetScenegroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetScenegroupHeaders setAccountContext(GetScenegroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetScenegroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetScenegroupHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetScenegroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetScenegroupHeadersAccountContext self = new GetScenegroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetScenegroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
