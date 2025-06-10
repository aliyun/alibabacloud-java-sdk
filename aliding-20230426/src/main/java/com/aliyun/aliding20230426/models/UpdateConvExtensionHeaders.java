// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateConvExtensionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateConvExtensionHeadersAccountContext accountContext;

    public static UpdateConvExtensionHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateConvExtensionHeaders self = new UpdateConvExtensionHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateConvExtensionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateConvExtensionHeaders setAccountContext(UpdateConvExtensionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateConvExtensionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateConvExtensionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateConvExtensionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateConvExtensionHeadersAccountContext self = new UpdateConvExtensionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateConvExtensionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
