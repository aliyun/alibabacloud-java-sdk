// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCardTemplateHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetCardTemplateHeadersAccountContext accountContext;

    public static GetCardTemplateHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetCardTemplateHeaders self = new GetCardTemplateHeaders();
        return TeaModel.build(map, self);
    }

    public GetCardTemplateHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetCardTemplateHeaders setAccountContext(GetCardTemplateHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetCardTemplateHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetCardTemplateHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetCardTemplateHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetCardTemplateHeadersAccountContext self = new GetCardTemplateHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetCardTemplateHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
