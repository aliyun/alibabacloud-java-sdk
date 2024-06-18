// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetEventHeadersAccountContext accountContext;

    public static GetEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetEventHeaders self = new GetEventHeaders();
        return TeaModel.build(map, self);
    }

    public GetEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetEventHeaders setAccountContext(GetEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetEventHeadersAccountContext self = new GetEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
