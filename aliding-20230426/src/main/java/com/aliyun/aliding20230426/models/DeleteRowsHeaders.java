// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteRowsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteRowsHeadersAccountContext accountContext;

    public static DeleteRowsHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowsHeaders self = new DeleteRowsHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteRowsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteRowsHeaders setAccountContext(DeleteRowsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteRowsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteRowsHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static DeleteRowsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteRowsHeadersAccountContext self = new DeleteRowsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteRowsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
