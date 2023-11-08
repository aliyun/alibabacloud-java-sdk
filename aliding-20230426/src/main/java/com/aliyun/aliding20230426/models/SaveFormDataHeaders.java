// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveFormDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SaveFormDataHeadersAccountContext accountContext;

    public static SaveFormDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        SaveFormDataHeaders self = new SaveFormDataHeaders();
        return TeaModel.build(map, self);
    }

    public SaveFormDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SaveFormDataHeaders setAccountContext(SaveFormDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SaveFormDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SaveFormDataHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static SaveFormDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SaveFormDataHeadersAccountContext self = new SaveFormDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SaveFormDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
