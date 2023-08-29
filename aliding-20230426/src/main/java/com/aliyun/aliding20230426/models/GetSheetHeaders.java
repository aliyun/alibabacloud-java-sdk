// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetSheetHeadersAccountContext accountContext;

    public static GetSheetHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetSheetHeaders self = new GetSheetHeaders();
        return TeaModel.build(map, self);
    }

    public GetSheetHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetSheetHeaders setAccountContext(GetSheetHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetSheetHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetSheetHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetSheetHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetSheetHeadersAccountContext self = new GetSheetHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetSheetHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
