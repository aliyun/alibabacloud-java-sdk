// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllFieldsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMultiDimTableAllFieldsHeadersAccountContext accountContext;

    public static GetMultiDimTableAllFieldsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllFieldsHeaders self = new GetMultiDimTableAllFieldsHeaders();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllFieldsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMultiDimTableAllFieldsHeaders setAccountContext(GetMultiDimTableAllFieldsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMultiDimTableAllFieldsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMultiDimTableAllFieldsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetMultiDimTableAllFieldsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableAllFieldsHeadersAccountContext self = new GetMultiDimTableAllFieldsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableAllFieldsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
