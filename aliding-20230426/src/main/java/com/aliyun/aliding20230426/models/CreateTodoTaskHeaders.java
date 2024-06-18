// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTodoTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateTodoTaskHeadersAccountContext accountContext;

    public static CreateTodoTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoTaskHeaders self = new CreateTodoTaskHeaders();
        return TeaModel.build(map, self);
    }

    public CreateTodoTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateTodoTaskHeaders setAccountContext(CreateTodoTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateTodoTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateTodoTaskHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateTodoTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskHeadersAccountContext self = new CreateTodoTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
