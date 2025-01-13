// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InvokeSkillHeadersAccountContext accountContext;

    public static InvokeSkillHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvokeSkillHeaders self = new InvokeSkillHeaders();
        return TeaModel.build(map, self);
    }

    public InvokeSkillHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvokeSkillHeaders setAccountContext(InvokeSkillHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InvokeSkillHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InvokeSkillHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static InvokeSkillHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InvokeSkillHeadersAccountContext self = new InvokeSkillHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InvokeSkillHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
