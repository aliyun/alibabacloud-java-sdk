// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormComponentDefinitionListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetFormComponentDefinitionListHeadersAccountContext accountContext;

    public static GetFormComponentDefinitionListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetFormComponentDefinitionListHeaders self = new GetFormComponentDefinitionListHeaders();
        return TeaModel.build(map, self);
    }

    public GetFormComponentDefinitionListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetFormComponentDefinitionListHeaders setAccountContext(GetFormComponentDefinitionListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetFormComponentDefinitionListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetFormComponentDefinitionListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetFormComponentDefinitionListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetFormComponentDefinitionListHeadersAccountContext self = new GetFormComponentDefinitionListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetFormComponentDefinitionListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
