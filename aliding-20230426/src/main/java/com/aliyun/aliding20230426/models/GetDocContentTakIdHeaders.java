// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentTakIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDocContentTakIdHeadersAccountContext accountContext;

    public static GetDocContentTakIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentTakIdHeaders self = new GetDocContentTakIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetDocContentTakIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDocContentTakIdHeaders setAccountContext(GetDocContentTakIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDocContentTakIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDocContentTakIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDocContentTakIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDocContentTakIdHeadersAccountContext self = new GetDocContentTakIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDocContentTakIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
