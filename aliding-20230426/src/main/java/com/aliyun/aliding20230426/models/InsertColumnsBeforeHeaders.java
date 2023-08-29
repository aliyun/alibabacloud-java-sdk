// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertColumnsBeforeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InsertColumnsBeforeHeadersAccountContext accountContext;

    public static InsertColumnsBeforeHeaders build(java.util.Map<String, ?> map) throws Exception {
        InsertColumnsBeforeHeaders self = new InsertColumnsBeforeHeaders();
        return TeaModel.build(map, self);
    }

    public InsertColumnsBeforeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InsertColumnsBeforeHeaders setAccountContext(InsertColumnsBeforeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InsertColumnsBeforeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InsertColumnsBeforeHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static InsertColumnsBeforeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InsertColumnsBeforeHeadersAccountContext self = new InsertColumnsBeforeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InsertColumnsBeforeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
