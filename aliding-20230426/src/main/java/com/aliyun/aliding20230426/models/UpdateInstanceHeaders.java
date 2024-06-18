// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateInstanceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateInstanceHeadersAccountContext accountContext;

    public static UpdateInstanceHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceHeaders self = new UpdateInstanceHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateInstanceHeaders setAccountContext(UpdateInstanceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateInstanceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateInstanceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateInstanceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceHeadersAccountContext self = new UpdateInstanceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
