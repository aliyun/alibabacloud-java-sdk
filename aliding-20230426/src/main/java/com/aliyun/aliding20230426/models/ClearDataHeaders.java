// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ClearDataHeadersAccountContext accountContext;

    public static ClearDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        ClearDataHeaders self = new ClearDataHeaders();
        return TeaModel.build(map, self);
    }

    public ClearDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ClearDataHeaders setAccountContext(ClearDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ClearDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ClearDataHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ClearDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ClearDataHeadersAccountContext self = new ClearDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ClearDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
