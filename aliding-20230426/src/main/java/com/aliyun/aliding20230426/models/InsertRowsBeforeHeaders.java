// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertRowsBeforeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InsertRowsBeforeHeadersAccountContext accountContext;

    public static InsertRowsBeforeHeaders build(java.util.Map<String, ?> map) throws Exception {
        InsertRowsBeforeHeaders self = new InsertRowsBeforeHeaders();
        return TeaModel.build(map, self);
    }

    public InsertRowsBeforeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InsertRowsBeforeHeaders setAccountContext(InsertRowsBeforeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InsertRowsBeforeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InsertRowsBeforeHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static InsertRowsBeforeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InsertRowsBeforeHeadersAccountContext self = new InsertRowsBeforeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InsertRowsBeforeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
