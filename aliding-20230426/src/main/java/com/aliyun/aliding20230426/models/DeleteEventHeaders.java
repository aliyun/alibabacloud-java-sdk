// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteEventHeadersAccountContext accountContext;

    public static DeleteEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventHeaders self = new DeleteEventHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteEventHeaders setAccountContext(DeleteEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteEventHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static DeleteEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventHeadersAccountContext self = new DeleteEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
