// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOpenUrlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetOpenUrlHeadersAccountContext accountContext;

    public static GetOpenUrlHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetOpenUrlHeaders self = new GetOpenUrlHeaders();
        return TeaModel.build(map, self);
    }

    public GetOpenUrlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetOpenUrlHeaders setAccountContext(GetOpenUrlHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetOpenUrlHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetOpenUrlHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetOpenUrlHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetOpenUrlHeadersAccountContext self = new GetOpenUrlHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetOpenUrlHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
