// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportUnReadCountHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetReportUnReadCountHeadersAccountContext accountContext;

    public static GetReportUnReadCountHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetReportUnReadCountHeaders self = new GetReportUnReadCountHeaders();
        return TeaModel.build(map, self);
    }

    public GetReportUnReadCountHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetReportUnReadCountHeaders setAccountContext(GetReportUnReadCountHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetReportUnReadCountHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetReportUnReadCountHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetReportUnReadCountHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetReportUnReadCountHeadersAccountContext self = new GetReportUnReadCountHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetReportUnReadCountHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
