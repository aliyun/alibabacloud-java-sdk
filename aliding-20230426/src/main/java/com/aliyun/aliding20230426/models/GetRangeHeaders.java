// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRangeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetRangeHeadersAccountContext accountContext;

    public static GetRangeHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetRangeHeaders self = new GetRangeHeaders();
        return TeaModel.build(map, self);
    }

    public GetRangeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetRangeHeaders setAccountContext(GetRangeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetRangeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetRangeHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetRangeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetRangeHeadersAccountContext self = new GetRangeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetRangeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
