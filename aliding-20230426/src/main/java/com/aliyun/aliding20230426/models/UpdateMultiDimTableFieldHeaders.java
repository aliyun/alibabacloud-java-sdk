// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableFieldHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateMultiDimTableFieldHeadersAccountContext accountContext;

    public static UpdateMultiDimTableFieldHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableFieldHeaders self = new UpdateMultiDimTableFieldHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableFieldHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateMultiDimTableFieldHeaders setAccountContext(UpdateMultiDimTableFieldHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateMultiDimTableFieldHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateMultiDimTableFieldHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateMultiDimTableFieldHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableFieldHeadersAccountContext self = new UpdateMultiDimTableFieldHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableFieldHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
