// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SwitchMainOrgHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SwitchMainOrgHeadersAccountContext accountContext;

    public static SwitchMainOrgHeaders build(java.util.Map<String, ?> map) throws Exception {
        SwitchMainOrgHeaders self = new SwitchMainOrgHeaders();
        return TeaModel.build(map, self);
    }

    public SwitchMainOrgHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SwitchMainOrgHeaders setAccountContext(SwitchMainOrgHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SwitchMainOrgHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SwitchMainOrgHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SwitchMainOrgHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SwitchMainOrgHeadersAccountContext self = new SwitchMainOrgHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SwitchMainOrgHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
