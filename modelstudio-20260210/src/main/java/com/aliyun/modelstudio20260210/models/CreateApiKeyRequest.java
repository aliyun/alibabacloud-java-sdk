// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    @NameInMap("auth")
    public CreateApiKeyRequestAuth auth;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>ws-8af73c50f5596193</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyRequest setAuth(CreateApiKeyRequestAuth auth) {
        this.auth = auth;
        return this;
    }
    public CreateApiKeyRequestAuth getAuth() {
        return this.auth;
    }

    public CreateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateApiKeyRequestAuth extends TeaModel {
        @NameInMap("accessIps")
        public java.util.List<String> accessIps;

        /**
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateApiKeyRequestAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateApiKeyRequestAuth self = new CreateApiKeyRequestAuth();
            return TeaModel.build(map, self);
        }

        public CreateApiKeyRequestAuth setAccessIps(java.util.List<String> accessIps) {
            this.accessIps = accessIps;
            return this;
        }
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        public CreateApiKeyRequestAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
