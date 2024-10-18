// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableSheetHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMultiDimTableSheetHeadersAccountContext accountContext;

    public static GetMultiDimTableSheetHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableSheetHeaders self = new GetMultiDimTableSheetHeaders();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableSheetHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMultiDimTableSheetHeaders setAccountContext(GetMultiDimTableSheetHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMultiDimTableSheetHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMultiDimTableSheetHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetMultiDimTableSheetHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableSheetHeadersAccountContext self = new GetMultiDimTableSheetHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableSheetHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
