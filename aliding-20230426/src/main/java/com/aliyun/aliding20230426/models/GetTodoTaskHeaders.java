// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTodoTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetTodoTaskHeadersAccountContext accountContext;

    public static GetTodoTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetTodoTaskHeaders self = new GetTodoTaskHeaders();
        return TeaModel.build(map, self);
    }

    public GetTodoTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetTodoTaskHeaders setAccountContext(GetTodoTaskHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetTodoTaskHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetTodoTaskHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetTodoTaskHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetTodoTaskHeadersAccountContext self = new GetTodoTaskHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetTodoTaskHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
