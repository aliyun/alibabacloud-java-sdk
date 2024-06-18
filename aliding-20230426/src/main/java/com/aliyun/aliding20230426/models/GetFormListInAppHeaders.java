// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormListInAppHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetFormListInAppHeadersAccountContext accountContext;

    public static GetFormListInAppHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetFormListInAppHeaders self = new GetFormListInAppHeaders();
        return TeaModel.build(map, self);
    }

    public GetFormListInAppHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetFormListInAppHeaders setAccountContext(GetFormListInAppHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetFormListInAppHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetFormListInAppHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetFormListInAppHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetFormListInAppHeadersAccountContext self = new GetFormListInAppHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetFormListInAppHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
