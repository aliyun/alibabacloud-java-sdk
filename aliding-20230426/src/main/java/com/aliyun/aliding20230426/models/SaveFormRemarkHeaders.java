// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveFormRemarkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SaveFormRemarkHeadersAccountContext accountContext;

    public static SaveFormRemarkHeaders build(java.util.Map<String, ?> map) throws Exception {
        SaveFormRemarkHeaders self = new SaveFormRemarkHeaders();
        return TeaModel.build(map, self);
    }

    public SaveFormRemarkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SaveFormRemarkHeaders setAccountContext(SaveFormRemarkHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SaveFormRemarkHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SaveFormRemarkHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SaveFormRemarkHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SaveFormRemarkHeadersAccountContext self = new SaveFormRemarkHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SaveFormRemarkHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
