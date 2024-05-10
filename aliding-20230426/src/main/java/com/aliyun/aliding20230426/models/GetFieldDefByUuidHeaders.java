// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFieldDefByUuidHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetFieldDefByUuidHeadersAccountContext accountContext;

    public static GetFieldDefByUuidHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetFieldDefByUuidHeaders self = new GetFieldDefByUuidHeaders();
        return TeaModel.build(map, self);
    }

    public GetFieldDefByUuidHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetFieldDefByUuidHeaders setAccountContext(GetFieldDefByUuidHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetFieldDefByUuidHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetFieldDefByUuidHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetFieldDefByUuidHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetFieldDefByUuidHeadersAccountContext self = new GetFieldDefByUuidHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetFieldDefByUuidHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
