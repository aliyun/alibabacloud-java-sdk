// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveContentHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SaveContentHeadersAccountContext accountContext;

    public static SaveContentHeaders build(java.util.Map<String, ?> map) throws Exception {
        SaveContentHeaders self = new SaveContentHeaders();
        return TeaModel.build(map, self);
    }

    public SaveContentHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SaveContentHeaders setAccountContext(SaveContentHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SaveContentHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SaveContentHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SaveContentHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SaveContentHeadersAccountContext self = new SaveContentHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SaveContentHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
