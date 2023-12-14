// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecutePlatformTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ExecutePlatformTaskHeadersAccountContext accountContext;

    public static ExecutePlatformTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExecutePlatformTaskHeaders self = new ExecutePlatformTaskHeaders();
        return TeaModel.build(map, self);
    }

    public ExecutePlatformTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExecutePlatformTaskHeaders setAccountContext(ExecutePlatformTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ExecutePlatformTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ExecutePlatformTaskHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static ExecutePlatformTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ExecutePlatformTaskHeadersAccountContext self = new ExecutePlatformTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ExecutePlatformTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
