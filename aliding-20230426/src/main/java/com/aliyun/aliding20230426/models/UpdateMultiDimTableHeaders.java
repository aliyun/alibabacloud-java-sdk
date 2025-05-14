// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateMultiDimTableHeadersAccountContext accountContext;

    public static UpdateMultiDimTableHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableHeaders self = new UpdateMultiDimTableHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateMultiDimTableHeaders setAccountContext(UpdateMultiDimTableHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateMultiDimTableHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateMultiDimTableHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateMultiDimTableHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableHeadersAccountContext self = new UpdateMultiDimTableHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
