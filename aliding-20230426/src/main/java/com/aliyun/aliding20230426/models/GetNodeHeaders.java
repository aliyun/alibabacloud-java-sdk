// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetNodeHeadersAccountContext accountContext;

    public static GetNodeHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetNodeHeaders self = new GetNodeHeaders();
        return TeaModel.build(map, self);
    }

    public GetNodeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetNodeHeaders setAccountContext(GetNodeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetNodeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetNodeHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetNodeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetNodeHeadersAccountContext self = new GetNodeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetNodeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
