// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeByUrlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetNodeByUrlHeadersAccountContext accountContext;

    public static GetNodeByUrlHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByUrlHeaders self = new GetNodeByUrlHeaders();
        return TeaModel.build(map, self);
    }

    public GetNodeByUrlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetNodeByUrlHeaders setAccountContext(GetNodeByUrlHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetNodeByUrlHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetNodeByUrlHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetNodeByUrlHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetNodeByUrlHeadersAccountContext self = new GetNodeByUrlHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetNodeByUrlHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
