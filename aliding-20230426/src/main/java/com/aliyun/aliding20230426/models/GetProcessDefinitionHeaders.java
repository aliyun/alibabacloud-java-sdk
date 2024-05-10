// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetProcessDefinitionHeadersAccountContext accountContext;

    public static GetProcessDefinitionHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetProcessDefinitionHeaders self = new GetProcessDefinitionHeaders();
        return TeaModel.build(map, self);
    }

    public GetProcessDefinitionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetProcessDefinitionHeaders setAccountContext(GetProcessDefinitionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetProcessDefinitionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetProcessDefinitionHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetProcessDefinitionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionHeadersAccountContext self = new GetProcessDefinitionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
