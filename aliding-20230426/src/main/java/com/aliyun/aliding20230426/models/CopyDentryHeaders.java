// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CopyDentryHeadersAccountContext accountContext;

    public static CopyDentryHeaders build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryHeaders self = new CopyDentryHeaders();
        return TeaModel.build(map, self);
    }

    public CopyDentryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CopyDentryHeaders setAccountContext(CopyDentryHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CopyDentryHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CopyDentryHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CopyDentryHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryHeadersAccountContext self = new CopyDentryHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CopyDentryHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
