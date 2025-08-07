// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAlidingAssistantInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetAlidingAssistantInfoHeadersAccountContext accountContext;

    public static GetAlidingAssistantInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetAlidingAssistantInfoHeaders self = new GetAlidingAssistantInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetAlidingAssistantInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetAlidingAssistantInfoHeaders setAccountContext(GetAlidingAssistantInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetAlidingAssistantInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetAlidingAssistantInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetAlidingAssistantInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetAlidingAssistantInfoHeadersAccountContext self = new GetAlidingAssistantInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetAlidingAssistantInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
