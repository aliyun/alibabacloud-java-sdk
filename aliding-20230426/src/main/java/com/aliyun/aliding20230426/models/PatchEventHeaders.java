// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class PatchEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public PatchEventHeadersAccountContext accountContext;

    public static PatchEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        PatchEventHeaders self = new PatchEventHeaders();
        return TeaModel.build(map, self);
    }

    public PatchEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PatchEventHeaders setAccountContext(PatchEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public PatchEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class PatchEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static PatchEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            PatchEventHeadersAccountContext self = new PatchEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public PatchEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
