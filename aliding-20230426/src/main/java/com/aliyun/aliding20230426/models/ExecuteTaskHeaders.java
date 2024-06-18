// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ExecuteTaskHeadersAccountContext accountContext;

    public static ExecuteTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTaskHeaders self = new ExecuteTaskHeaders();
        return TeaModel.build(map, self);
    }

    public ExecuteTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExecuteTaskHeaders setAccountContext(ExecuteTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ExecuteTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ExecuteTaskHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ExecuteTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTaskHeadersAccountContext self = new ExecuteTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ExecuteTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
