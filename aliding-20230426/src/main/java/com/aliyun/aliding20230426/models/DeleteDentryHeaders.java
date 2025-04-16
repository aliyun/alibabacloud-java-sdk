// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteDentryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteDentryHeadersAccountContext accountContext;

    public static DeleteDentryHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteDentryHeaders self = new DeleteDentryHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteDentryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteDentryHeaders setAccountContext(DeleteDentryHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteDentryHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteDentryHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteDentryHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteDentryHeadersAccountContext self = new DeleteDentryHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteDentryHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
