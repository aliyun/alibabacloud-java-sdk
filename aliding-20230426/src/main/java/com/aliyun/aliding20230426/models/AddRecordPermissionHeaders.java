// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddRecordPermissionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddRecordPermissionHeadersAccountContext accountContext;

    public static AddRecordPermissionHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddRecordPermissionHeaders self = new AddRecordPermissionHeaders();
        return TeaModel.build(map, self);
    }

    public AddRecordPermissionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddRecordPermissionHeaders setAccountContext(AddRecordPermissionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddRecordPermissionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddRecordPermissionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddRecordPermissionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddRecordPermissionHeadersAccountContext self = new AddRecordPermissionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddRecordPermissionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
