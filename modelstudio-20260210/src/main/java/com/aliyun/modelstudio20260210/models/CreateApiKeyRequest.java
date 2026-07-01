// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    /**
     * <p>The API key permission settings.</p>
     */
    @NameInMap("auth")
    public CreateApiKeyRequestAuth auth;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The workspace ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you leave this parameter empty, the API key is automatically assigned to the default workspace.</li>
     * </ul>
     * </blockquote>
     * 
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

    public static class CreateApiKeyRequestAuthModelAccessScope extends TeaModel {
        /**
         * <p>The list of accessible models.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when allowAllModels is set to false.</p>
         * </blockquote>
         */
        @NameInMap("accessibleModels")
        public java.util.List<String> accessibleModels;

        /**
         * <p>Specifies whether all models with granted inference permissions in the workspace are accessible. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowAllModels")
        public Boolean allowAllModels;

        public static CreateApiKeyRequestAuthModelAccessScope build(java.util.Map<String, ?> map) throws Exception {
            CreateApiKeyRequestAuthModelAccessScope self = new CreateApiKeyRequestAuthModelAccessScope();
            return TeaModel.build(map, self);
        }

        public CreateApiKeyRequestAuthModelAccessScope setAccessibleModels(java.util.List<String> accessibleModels) {
            this.accessibleModels = accessibleModels;
            return this;
        }
        public java.util.List<String> getAccessibleModels() {
            return this.accessibleModels;
        }

        public CreateApiKeyRequestAuthModelAccessScope setAllowAllModels(Boolean allowAllModels) {
            this.allowAllModels = allowAllModels;
            return this;
        }
        public Boolean getAllowAllModels() {
            return this.allowAllModels;
        }

    }

    public static class CreateApiKeyRequestAuth extends TeaModel {
        /**
         * <p>The IP access whitelist.</p>
         * <blockquote>
         * <ul>
         * <li>When you set custom permissions and leave the IP access whitelist empty, the server sets the default values to IPv4 (0.0.0.0/0) and IPv6 (::/0), which allows all traffic.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("accessIps")
        public java.util.List<String> accessIps;

        /**
         * <p>The model access scope.</p>
         */
        @NameInMap("modelAccessScope")
        public CreateApiKeyRequestAuthModelAccessScope modelAccessScope;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>All: all permissions.</li>
         * <li>Custom: custom permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
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

        public CreateApiKeyRequestAuth setModelAccessScope(CreateApiKeyRequestAuthModelAccessScope modelAccessScope) {
            this.modelAccessScope = modelAccessScope;
            return this;
        }
        public CreateApiKeyRequestAuthModelAccessScope getModelAccessScope() {
            return this.modelAccessScope;
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
