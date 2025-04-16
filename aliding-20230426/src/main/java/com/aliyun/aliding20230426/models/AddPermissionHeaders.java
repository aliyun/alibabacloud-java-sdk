// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddPermissionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddPermissionHeadersAccountContext accountContext;

    public static AddPermissionHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddPermissionHeaders self = new AddPermissionHeaders();
        return TeaModel.build(map, self);
    }

    public AddPermissionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddPermissionHeaders setAccountContext(AddPermissionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddPermissionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddPermissionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddPermissionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddPermissionHeadersAccountContext self = new AddPermissionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddPermissionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
