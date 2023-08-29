// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ClearHeadersAccountContext accountContext;

    public static ClearHeaders build(java.util.Map<String, ?> map) throws Exception {
        ClearHeaders self = new ClearHeaders();
        return TeaModel.build(map, self);
    }

    public ClearHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ClearHeaders setAccountContext(ClearHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ClearHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ClearHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static ClearHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ClearHeadersAccountContext self = new ClearHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ClearHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
