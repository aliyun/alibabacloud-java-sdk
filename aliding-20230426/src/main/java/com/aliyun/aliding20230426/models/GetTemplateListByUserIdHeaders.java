// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTemplateListByUserIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetTemplateListByUserIdHeadersAccountContext accountContext;

    public static GetTemplateListByUserIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateListByUserIdHeaders self = new GetTemplateListByUserIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetTemplateListByUserIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetTemplateListByUserIdHeaders setAccountContext(GetTemplateListByUserIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetTemplateListByUserIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetTemplateListByUserIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetTemplateListByUserIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateListByUserIdHeadersAccountContext self = new GetTemplateListByUserIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetTemplateListByUserIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
