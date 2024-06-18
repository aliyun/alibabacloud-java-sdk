// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskExecutorStatusHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateTodoTaskExecutorStatusHeadersAccountContext accountContext;

    public static UpdateTodoTaskExecutorStatusHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskExecutorStatusHeaders self = new UpdateTodoTaskExecutorStatusHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskExecutorStatusHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateTodoTaskExecutorStatusHeaders setAccountContext(UpdateTodoTaskExecutorStatusHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateTodoTaskExecutorStatusHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateTodoTaskExecutorStatusHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateTodoTaskExecutorStatusHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateTodoTaskExecutorStatusHeadersAccountContext self = new UpdateTodoTaskExecutorStatusHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateTodoTaskExecutorStatusHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
