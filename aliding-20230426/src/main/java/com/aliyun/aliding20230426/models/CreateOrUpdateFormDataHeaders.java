// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrUpdateFormDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateOrUpdateFormDataHeadersAccountContext accountContext;

    public static CreateOrUpdateFormDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateFormDataHeaders self = new CreateOrUpdateFormDataHeaders();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateFormDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateOrUpdateFormDataHeaders setAccountContext(CreateOrUpdateFormDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateOrUpdateFormDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateOrUpdateFormDataHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static CreateOrUpdateFormDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateFormDataHeadersAccountContext self = new CreateOrUpdateFormDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateFormDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
