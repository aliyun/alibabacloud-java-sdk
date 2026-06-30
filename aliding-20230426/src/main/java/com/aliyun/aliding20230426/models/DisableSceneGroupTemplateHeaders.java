// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DisableSceneGroupTemplateHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DisableSceneGroupTemplateHeadersAccountContext accountContext;

    public static DisableSceneGroupTemplateHeaders build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneGroupTemplateHeaders self = new DisableSceneGroupTemplateHeaders();
        return TeaModel.build(map, self);
    }

    public DisableSceneGroupTemplateHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DisableSceneGroupTemplateHeaders setAccountContext(DisableSceneGroupTemplateHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DisableSceneGroupTemplateHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DisableSceneGroupTemplateHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DisableSceneGroupTemplateHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DisableSceneGroupTemplateHeadersAccountContext self = new DisableSceneGroupTemplateHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DisableSceneGroupTemplateHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
