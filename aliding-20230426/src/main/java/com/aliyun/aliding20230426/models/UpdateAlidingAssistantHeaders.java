// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateAlidingAssistantHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateAlidingAssistantHeadersAccountContext accountContext;

    public static UpdateAlidingAssistantHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlidingAssistantHeaders self = new UpdateAlidingAssistantHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateAlidingAssistantHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateAlidingAssistantHeaders setAccountContext(UpdateAlidingAssistantHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateAlidingAssistantHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateAlidingAssistantHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateAlidingAssistantHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlidingAssistantHeadersAccountContext self = new UpdateAlidingAssistantHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateAlidingAssistantHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
