// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteTodoTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteTodoTaskHeadersAccountContext accountContext;

    public static DeleteTodoTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteTodoTaskHeaders self = new DeleteTodoTaskHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteTodoTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteTodoTaskHeaders setAccountContext(DeleteTodoTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteTodoTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteTodoTaskHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteTodoTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteTodoTaskHeadersAccountContext self = new DeleteTodoTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteTodoTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
