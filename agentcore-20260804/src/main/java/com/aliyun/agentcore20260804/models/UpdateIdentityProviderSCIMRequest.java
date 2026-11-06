// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMRequest extends TeaModel {
    /**
     * <p>The business parameters submitted in the request body. The body parameters of public APIs are mapped to backend wrappers by the gateway and must not be mixed with direct backend body wrappers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateIdentityProviderSCIMRequestBody body;

    public static UpdateIdentityProviderSCIMRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderSCIMRequest self = new UpdateIdentityProviderSCIMRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderSCIMRequest setBody(UpdateIdentityProviderSCIMRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateIdentityProviderSCIMRequestBody getBody() {
        return this.body;
    }

    public static class UpdateIdentityProviderSCIMRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to enable SCIM synchronization. Do not set this parameter to true during CustomSSO initialization. You can update this parameter only by calling UpdateIdentityProviderSCIM. Check the operationStatus field to determine the result.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        public static UpdateIdentityProviderSCIMRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderSCIMRequestBody self = new UpdateIdentityProviderSCIMRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderSCIMRequestBody setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

    }

}
