// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateTodoTaskHeadersAccountContext accountContext;

    public static UpdateTodoTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskHeaders self = new UpdateTodoTaskHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateTodoTaskHeaders setAccountContext(UpdateTodoTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateTodoTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateTodoTaskHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UpdateTodoTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateTodoTaskHeadersAccountContext self = new UpdateTodoTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateTodoTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
