// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class EnableSceneGroupTemplateHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public EnableSceneGroupTemplateHeadersAccountContext accountContext;

    public static EnableSceneGroupTemplateHeaders build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneGroupTemplateHeaders self = new EnableSceneGroupTemplateHeaders();
        return TeaModel.build(map, self);
    }

    public EnableSceneGroupTemplateHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public EnableSceneGroupTemplateHeaders setAccountContext(EnableSceneGroupTemplateHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public EnableSceneGroupTemplateHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class EnableSceneGroupTemplateHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static EnableSceneGroupTemplateHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            EnableSceneGroupTemplateHeadersAccountContext self = new EnableSceneGroupTemplateHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public EnableSceneGroupTemplateHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
