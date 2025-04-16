// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdatePermissionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdatePermissionHeadersAccountContext accountContext;

    public static UpdatePermissionHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdatePermissionHeaders self = new UpdatePermissionHeaders();
        return TeaModel.build(map, self);
    }

    public UpdatePermissionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdatePermissionHeaders setAccountContext(UpdatePermissionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdatePermissionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdatePermissionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdatePermissionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdatePermissionHeadersAccountContext self = new UpdatePermissionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdatePermissionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
