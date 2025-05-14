// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableRecordsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteMultiDimTableRecordsHeadersAccountContext accountContext;

    public static DeleteMultiDimTableRecordsHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableRecordsHeaders self = new DeleteMultiDimTableRecordsHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableRecordsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteMultiDimTableRecordsHeaders setAccountContext(DeleteMultiDimTableRecordsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteMultiDimTableRecordsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteMultiDimTableRecordsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteMultiDimTableRecordsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMultiDimTableRecordsHeadersAccountContext self = new DeleteMultiDimTableRecordsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteMultiDimTableRecordsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
