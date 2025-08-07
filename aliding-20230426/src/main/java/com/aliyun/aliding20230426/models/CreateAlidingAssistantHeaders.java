// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateAlidingAssistantHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateAlidingAssistantHeadersAccountContext accountContext;

    public static CreateAlidingAssistantHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateAlidingAssistantHeaders self = new CreateAlidingAssistantHeaders();
        return TeaModel.build(map, self);
    }

    public CreateAlidingAssistantHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateAlidingAssistantHeaders setAccountContext(CreateAlidingAssistantHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateAlidingAssistantHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateAlidingAssistantHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateAlidingAssistantHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateAlidingAssistantHeadersAccountContext self = new CreateAlidingAssistantHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateAlidingAssistantHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
