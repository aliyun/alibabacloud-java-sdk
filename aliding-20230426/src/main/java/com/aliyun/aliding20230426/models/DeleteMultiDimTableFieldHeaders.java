// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableFieldHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteMultiDimTableFieldHeadersAccountContext accountContext;

    public static DeleteMultiDimTableFieldHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableFieldHeaders self = new DeleteMultiDimTableFieldHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableFieldHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteMultiDimTableFieldHeaders setAccountContext(DeleteMultiDimTableFieldHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteMultiDimTableFieldHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteMultiDimTableFieldHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteMultiDimTableFieldHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMultiDimTableFieldHeadersAccountContext self = new DeleteMultiDimTableFieldHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteMultiDimTableFieldHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
