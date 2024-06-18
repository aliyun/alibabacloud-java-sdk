// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDingtalkPersonalTodoTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateDingtalkPersonalTodoTaskHeadersAccountContext accountContext;

    public static CreateDingtalkPersonalTodoTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateDingtalkPersonalTodoTaskHeaders self = new CreateDingtalkPersonalTodoTaskHeaders();
        return TeaModel.build(map, self);
    }

    public CreateDingtalkPersonalTodoTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateDingtalkPersonalTodoTaskHeaders setAccountContext(CreateDingtalkPersonalTodoTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateDingtalkPersonalTodoTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateDingtalkPersonalTodoTaskHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateDingtalkPersonalTodoTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateDingtalkPersonalTodoTaskHeadersAccountContext self = new CreateDingtalkPersonalTodoTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateDingtalkPersonalTodoTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
