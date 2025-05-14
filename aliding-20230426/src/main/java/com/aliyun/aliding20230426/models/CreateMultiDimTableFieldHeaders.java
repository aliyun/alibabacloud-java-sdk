// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMultiDimTableFieldHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateMultiDimTableFieldHeadersAccountContext accountContext;

    public static CreateMultiDimTableFieldHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiDimTableFieldHeaders self = new CreateMultiDimTableFieldHeaders();
        return TeaModel.build(map, self);
    }

    public CreateMultiDimTableFieldHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateMultiDimTableFieldHeaders setAccountContext(CreateMultiDimTableFieldHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateMultiDimTableFieldHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateMultiDimTableFieldHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateMultiDimTableFieldHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiDimTableFieldHeadersAccountContext self = new CreateMultiDimTableFieldHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateMultiDimTableFieldHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
