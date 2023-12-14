// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class TerminateInstanceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public TerminateInstanceHeadersAccountContext accountContext;

    public static TerminateInstanceHeaders build(java.util.Map<String, ?> map) throws Exception {
        TerminateInstanceHeaders self = new TerminateInstanceHeaders();
        return TeaModel.build(map, self);
    }

    public TerminateInstanceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public TerminateInstanceHeaders setAccountContext(TerminateInstanceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public TerminateInstanceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class TerminateInstanceHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static TerminateInstanceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            TerminateInstanceHeadersAccountContext self = new TerminateInstanceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public TerminateInstanceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
