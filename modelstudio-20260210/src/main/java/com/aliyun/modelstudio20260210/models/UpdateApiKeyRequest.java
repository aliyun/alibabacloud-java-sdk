// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateApiKeyRequest extends TeaModel {
    @NameInMap("auth")
    public UpdateApiKeyRequestAuth auth;

    /**
     * <strong>example:</strong>
     * <p>update description.</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyRequest self = new UpdateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyRequest setAuth(UpdateApiKeyRequestAuth auth) {
        this.auth = auth;
        return this;
    }
    public UpdateApiKeyRequestAuth getAuth() {
        return this.auth;
    }

    public UpdateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateApiKeyRequestAuth extends TeaModel {
        @NameInMap("accessIps")
        public java.util.List<String> accessIps;

        @NameInMap("type")
        public String type;

        public static UpdateApiKeyRequestAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiKeyRequestAuth self = new UpdateApiKeyRequestAuth();
            return TeaModel.build(map, self);
        }

        public UpdateApiKeyRequestAuth setAccessIps(java.util.List<String> accessIps) {
            this.accessIps = accessIps;
            return this;
        }
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        public UpdateApiKeyRequestAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
