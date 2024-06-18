// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrgHonorTemplateHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateOrgHonorTemplateHeadersAccountContext accountContext;

    public static CreateOrgHonorTemplateHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgHonorTemplateHeaders self = new CreateOrgHonorTemplateHeaders();
        return TeaModel.build(map, self);
    }

    public CreateOrgHonorTemplateHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateOrgHonorTemplateHeaders setAccountContext(CreateOrgHonorTemplateHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateOrgHonorTemplateHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateOrgHonorTemplateHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>208579</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateOrgHonorTemplateHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateOrgHonorTemplateHeadersAccountContext self = new CreateOrgHonorTemplateHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateOrgHonorTemplateHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
