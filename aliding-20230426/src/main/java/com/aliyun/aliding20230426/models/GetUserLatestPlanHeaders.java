// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserLatestPlanHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetUserLatestPlanHeadersAccountContext accountContext;

    public static GetUserLatestPlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserLatestPlanHeaders self = new GetUserLatestPlanHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserLatestPlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserLatestPlanHeaders setAccountContext(GetUserLatestPlanHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetUserLatestPlanHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetUserLatestPlanHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetUserLatestPlanHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserLatestPlanHeadersAccountContext self = new GetUserLatestPlanHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetUserLatestPlanHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
