// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteColumnsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteColumnsHeadersAccountContext accountContext;

    public static DeleteColumnsHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteColumnsHeaders self = new DeleteColumnsHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteColumnsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteColumnsHeaders setAccountContext(DeleteColumnsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteColumnsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteColumnsHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteColumnsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteColumnsHeadersAccountContext self = new DeleteColumnsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteColumnsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
