// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAllSheetsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetAllSheetsHeadersAccountContext accountContext;

    public static GetAllSheetsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetAllSheetsHeaders self = new GetAllSheetsHeaders();
        return TeaModel.build(map, self);
    }

    public GetAllSheetsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetAllSheetsHeaders setAccountContext(GetAllSheetsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetAllSheetsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetAllSheetsHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetAllSheetsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetAllSheetsHeadersAccountContext self = new GetAllSheetsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetAllSheetsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
