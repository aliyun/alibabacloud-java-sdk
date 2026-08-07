// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserDocumentPermissionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetUserDocumentPermissionHeadersAccountContext accountContext;

    public static GetUserDocumentPermissionHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserDocumentPermissionHeaders self = new GetUserDocumentPermissionHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserDocumentPermissionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserDocumentPermissionHeaders setAccountContext(GetUserDocumentPermissionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetUserDocumentPermissionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetUserDocumentPermissionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetUserDocumentPermissionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserDocumentPermissionHeadersAccountContext self = new GetUserDocumentPermissionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetUserDocumentPermissionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
