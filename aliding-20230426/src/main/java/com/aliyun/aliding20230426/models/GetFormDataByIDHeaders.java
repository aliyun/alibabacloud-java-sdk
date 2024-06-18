// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormDataByIDHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetFormDataByIDHeadersAccountContext accountContext;

    public static GetFormDataByIDHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetFormDataByIDHeaders self = new GetFormDataByIDHeaders();
        return TeaModel.build(map, self);
    }

    public GetFormDataByIDHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetFormDataByIDHeaders setAccountContext(GetFormDataByIDHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetFormDataByIDHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetFormDataByIDHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetFormDataByIDHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetFormDataByIDHeadersAccountContext self = new GetFormDataByIDHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetFormDataByIDHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
