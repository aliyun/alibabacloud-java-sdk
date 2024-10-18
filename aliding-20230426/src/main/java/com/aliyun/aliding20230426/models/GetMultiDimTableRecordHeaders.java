// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableRecordHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMultiDimTableRecordHeadersAccountContext accountContext;

    public static GetMultiDimTableRecordHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableRecordHeaders self = new GetMultiDimTableRecordHeaders();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableRecordHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMultiDimTableRecordHeaders setAccountContext(GetMultiDimTableRecordHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMultiDimTableRecordHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMultiDimTableRecordHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetMultiDimTableRecordHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableRecordHeadersAccountContext self = new GetMultiDimTableRecordHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableRecordHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
