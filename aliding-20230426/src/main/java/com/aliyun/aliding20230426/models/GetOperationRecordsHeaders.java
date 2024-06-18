// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOperationRecordsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetOperationRecordsHeadersAccountContext accountContext;

    public static GetOperationRecordsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordsHeaders self = new GetOperationRecordsHeaders();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetOperationRecordsHeaders setAccountContext(GetOperationRecordsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetOperationRecordsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetOperationRecordsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetOperationRecordsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordsHeadersAccountContext self = new GetOperationRecordsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
