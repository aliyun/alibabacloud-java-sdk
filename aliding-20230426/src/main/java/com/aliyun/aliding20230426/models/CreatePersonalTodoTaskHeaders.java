// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreatePersonalTodoTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreatePersonalTodoTaskHeadersAccountContext accountContext;

    public static CreatePersonalTodoTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTodoTaskHeaders self = new CreatePersonalTodoTaskHeaders();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTodoTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreatePersonalTodoTaskHeaders setAccountContext(CreatePersonalTodoTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreatePersonalTodoTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreatePersonalTodoTaskHeadersAccountContext extends TeaModel {
        @NameInMap("userToken")
        public String userToken;

        public static CreatePersonalTodoTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalTodoTaskHeadersAccountContext self = new CreatePersonalTodoTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreatePersonalTodoTaskHeadersAccountContext setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

    }

}
