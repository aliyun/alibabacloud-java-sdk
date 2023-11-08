// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteFormDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteFormDataHeadersAccountContext accountContext;

    public static DeleteFormDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteFormDataHeaders self = new DeleteFormDataHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteFormDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteFormDataHeaders setAccountContext(DeleteFormDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteFormDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteFormDataHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static DeleteFormDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteFormDataHeadersAccountContext self = new DeleteFormDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteFormDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
