// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateFormDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateFormDataHeadersAccountContext accountContext;

    public static UpdateFormDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormDataHeaders self = new UpdateFormDataHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateFormDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateFormDataHeaders setAccountContext(UpdateFormDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateFormDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateFormDataHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateFormDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateFormDataHeadersAccountContext self = new UpdateFormDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateFormDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
