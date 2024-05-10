// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteBatchTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ExecuteBatchTaskHeadersAccountContext accountContext;

    public static ExecuteBatchTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBatchTaskHeaders self = new ExecuteBatchTaskHeaders();
        return TeaModel.build(map, self);
    }

    public ExecuteBatchTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExecuteBatchTaskHeaders setAccountContext(ExecuteBatchTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ExecuteBatchTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ExecuteBatchTaskHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ExecuteBatchTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ExecuteBatchTaskHeadersAccountContext self = new ExecuteBatchTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ExecuteBatchTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
