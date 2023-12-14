// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetActivityListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetActivityListHeadersAccountContext accountContext;

    public static GetActivityListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetActivityListHeaders self = new GetActivityListHeaders();
        return TeaModel.build(map, self);
    }

    public GetActivityListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetActivityListHeaders setAccountContext(GetActivityListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetActivityListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetActivityListHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetActivityListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetActivityListHeadersAccountContext self = new GetActivityListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetActivityListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
