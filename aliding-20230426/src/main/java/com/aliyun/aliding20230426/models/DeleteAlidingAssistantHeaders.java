// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteAlidingAssistantHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteAlidingAssistantHeadersAccountContext accountContext;

    public static DeleteAlidingAssistantHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlidingAssistantHeaders self = new DeleteAlidingAssistantHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteAlidingAssistantHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteAlidingAssistantHeaders setAccountContext(DeleteAlidingAssistantHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteAlidingAssistantHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteAlidingAssistantHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteAlidingAssistantHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlidingAssistantHeadersAccountContext self = new DeleteAlidingAssistantHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteAlidingAssistantHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
