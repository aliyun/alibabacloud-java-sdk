// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateStatusHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateStatusHeadersAccountContext accountContext;

    public static UpdateStatusHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusHeaders self = new UpdateStatusHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateStatusHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateStatusHeaders setAccountContext(UpdateStatusHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateStatusHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateStatusHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UpdateStatusHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateStatusHeadersAccountContext self = new UpdateStatusHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateStatusHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
