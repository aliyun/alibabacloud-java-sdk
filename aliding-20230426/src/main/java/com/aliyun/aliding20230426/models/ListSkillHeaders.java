// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListSkillHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListSkillHeadersAccountContext accountContext;

    public static ListSkillHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListSkillHeaders self = new ListSkillHeaders();
        return TeaModel.build(map, self);
    }

    public ListSkillHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListSkillHeaders setAccountContext(ListSkillHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListSkillHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListSkillHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListSkillHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListSkillHeadersAccountContext self = new ListSkillHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListSkillHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
