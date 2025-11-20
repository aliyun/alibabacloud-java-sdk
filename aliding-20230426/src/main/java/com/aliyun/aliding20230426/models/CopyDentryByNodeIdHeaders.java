// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryByNodeIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CopyDentryByNodeIdHeadersAccountContext accountContext;

    public static CopyDentryByNodeIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryByNodeIdHeaders self = new CopyDentryByNodeIdHeaders();
        return TeaModel.build(map, self);
    }

    public CopyDentryByNodeIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CopyDentryByNodeIdHeaders setAccountContext(CopyDentryByNodeIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CopyDentryByNodeIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CopyDentryByNodeIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CopyDentryByNodeIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryByNodeIdHeadersAccountContext self = new CopyDentryByNodeIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CopyDentryByNodeIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
