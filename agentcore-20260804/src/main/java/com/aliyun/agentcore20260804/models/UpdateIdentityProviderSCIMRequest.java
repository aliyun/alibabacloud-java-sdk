// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMRequest extends TeaModel {
    /**
     * <p>Submits business parameters as described in this API. The body parameters of the public API are mapped to the backend wrapper by the gateway. Do not mix them with the backend direct connection body wrapper.</p>
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
         * <p>Do not set this parameter to true during CustomSSO initialization. You can only update it later by calling UpdateIdentityProviderSCIM. Determine the result based on operationStatus.</p>
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
