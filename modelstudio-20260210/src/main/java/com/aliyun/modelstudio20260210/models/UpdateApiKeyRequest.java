// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateApiKeyRequest extends TeaModel {
    /**
     * <p>The API key permission settings.</p>
     * <blockquote>
     * <p>Do not fill in this section or fill it in completely for each UpdateApiKey operation. Otherwise, the configuration may not match your expectations.</p>
     * </blockquote>
     */
    @NameInMap("auth")
    public UpdateApiKeyRequestAuth auth;

    /**
     * <p>The description.</p>
     * 
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

    public static class UpdateApiKeyRequestAuthModelAccessScope extends TeaModel {
        /**
         * <p>The list of accessible models.</p>
         * <blockquote>
         * <p>Notice: The content takes effect only when allowAllModels is set to false.</p>
         * </blockquote>
         */
        @NameInMap("accessibleModels")
        public java.util.List<String> accessibleModels;

        /**
         * <p>Specifies whether to allow access to all models with granted inference permissions in the workspace. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         */
        @NameInMap("allowAllModels")
        public Boolean allowAllModels;

        public static UpdateApiKeyRequestAuthModelAccessScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiKeyRequestAuthModelAccessScope self = new UpdateApiKeyRequestAuthModelAccessScope();
            return TeaModel.build(map, self);
        }

        public UpdateApiKeyRequestAuthModelAccessScope setAccessibleModels(java.util.List<String> accessibleModels) {
            this.accessibleModels = accessibleModels;
            return this;
        }
        public java.util.List<String> getAccessibleModels() {
            return this.accessibleModels;
        }

        public UpdateApiKeyRequestAuthModelAccessScope setAllowAllModels(Boolean allowAllModels) {
            this.allowAllModels = allowAllModels;
            return this;
        }
        public Boolean getAllowAllModels() {
            return this.allowAllModels;
        }

    }

    public static class UpdateApiKeyRequestAuth extends TeaModel {
        /**
         * <p>The IP access whitelist.</p>
         * <blockquote>
         * <ul>
         * <li>When you customize the permission scope, if the IP access whitelist is not specified, the server sets it to IPv4 (0.0.0.0/0) and IPv6 (::/0) by default, which allows all traffic.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("accessIps")
        public java.util.List<String> accessIps;

        /**
         * <p>The model access scope.</p>
         */
        @NameInMap("modelAccessScope")
        public UpdateApiKeyRequestAuthModelAccessScope modelAccessScope;

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

        public UpdateApiKeyRequestAuth setModelAccessScope(UpdateApiKeyRequestAuthModelAccessScope modelAccessScope) {
            this.modelAccessScope = modelAccessScope;
            return this;
        }
        public UpdateApiKeyRequestAuthModelAccessScope getModelAccessScope() {
            return this.modelAccessScope;
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
