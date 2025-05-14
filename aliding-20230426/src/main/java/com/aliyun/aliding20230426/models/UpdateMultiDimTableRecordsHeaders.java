// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableRecordsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateMultiDimTableRecordsHeadersAccountContext accountContext;

    public static UpdateMultiDimTableRecordsHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableRecordsHeaders self = new UpdateMultiDimTableRecordsHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableRecordsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateMultiDimTableRecordsHeaders setAccountContext(UpdateMultiDimTableRecordsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateMultiDimTableRecordsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateMultiDimTableRecordsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateMultiDimTableRecordsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableRecordsHeadersAccountContext self = new UpdateMultiDimTableRecordsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableRecordsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
