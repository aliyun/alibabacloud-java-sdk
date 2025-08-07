// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ChangeDingTalkIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ChangeDingTalkIdHeadersAccountContext accountContext;

    public static ChangeDingTalkIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        ChangeDingTalkIdHeaders self = new ChangeDingTalkIdHeaders();
        return TeaModel.build(map, self);
    }

    public ChangeDingTalkIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ChangeDingTalkIdHeaders setAccountContext(ChangeDingTalkIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ChangeDingTalkIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ChangeDingTalkIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ChangeDingTalkIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ChangeDingTalkIdHeadersAccountContext self = new ChangeDingTalkIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ChangeDingTalkIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
