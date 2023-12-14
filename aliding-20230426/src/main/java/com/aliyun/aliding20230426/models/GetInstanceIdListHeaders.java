// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceIdListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetInstanceIdListHeadersAccountContext accountContext;

    public static GetInstanceIdListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdListHeaders self = new GetInstanceIdListHeaders();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetInstanceIdListHeaders setAccountContext(GetInstanceIdListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetInstanceIdListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetInstanceIdListHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetInstanceIdListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceIdListHeadersAccountContext self = new GetInstanceIdListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetInstanceIdListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
