// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertMultiDimTableRecordHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InsertMultiDimTableRecordHeadersAccountContext accountContext;

    public static InsertMultiDimTableRecordHeaders build(java.util.Map<String, ?> map) throws Exception {
        InsertMultiDimTableRecordHeaders self = new InsertMultiDimTableRecordHeaders();
        return TeaModel.build(map, self);
    }

    public InsertMultiDimTableRecordHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InsertMultiDimTableRecordHeaders setAccountContext(InsertMultiDimTableRecordHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InsertMultiDimTableRecordHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InsertMultiDimTableRecordHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static InsertMultiDimTableRecordHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InsertMultiDimTableRecordHeadersAccountContext self = new InsertMultiDimTableRecordHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InsertMultiDimTableRecordHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
