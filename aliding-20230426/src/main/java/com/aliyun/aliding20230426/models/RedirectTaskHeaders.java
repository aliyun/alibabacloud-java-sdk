// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RedirectTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public RedirectTaskHeadersAccountContext accountContext;

    public static RedirectTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        RedirectTaskHeaders self = new RedirectTaskHeaders();
        return TeaModel.build(map, self);
    }

    public RedirectTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public RedirectTaskHeaders setAccountContext(RedirectTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public RedirectTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class RedirectTaskHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static RedirectTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            RedirectTaskHeadersAccountContext self = new RedirectTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public RedirectTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
