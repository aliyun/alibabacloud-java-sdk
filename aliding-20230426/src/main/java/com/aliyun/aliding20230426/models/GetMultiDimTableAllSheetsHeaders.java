// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllSheetsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMultiDimTableAllSheetsHeadersAccountContext accountContext;

    public static GetMultiDimTableAllSheetsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllSheetsHeaders self = new GetMultiDimTableAllSheetsHeaders();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllSheetsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMultiDimTableAllSheetsHeaders setAccountContext(GetMultiDimTableAllSheetsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMultiDimTableAllSheetsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMultiDimTableAllSheetsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetMultiDimTableAllSheetsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableAllSheetsHeadersAccountContext self = new GetMultiDimTableAllSheetsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableAllSheetsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
