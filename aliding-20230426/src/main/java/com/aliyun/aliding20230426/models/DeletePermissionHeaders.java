// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeletePermissionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeletePermissionHeadersAccountContext accountContext;

    public static DeletePermissionHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeletePermissionHeaders self = new DeletePermissionHeaders();
        return TeaModel.build(map, self);
    }

    public DeletePermissionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeletePermissionHeaders setAccountContext(DeletePermissionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeletePermissionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeletePermissionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeletePermissionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeletePermissionHeadersAccountContext self = new DeletePermissionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeletePermissionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
