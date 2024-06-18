// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSheetHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteSheetHeadersAccountContext accountContext;

    public static DeleteSheetHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteSheetHeaders self = new DeleteSheetHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteSheetHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteSheetHeaders setAccountContext(DeleteSheetHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteSheetHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteSheetHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteSheetHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteSheetHeadersAccountContext self = new DeleteSheetHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteSheetHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
