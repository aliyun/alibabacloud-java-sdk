// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialRequest extends TeaModel {
    /**
     * <p>Ensures idempotence. Generate a unique value on your client for each request. The ClientToken value must contain only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The credential content.</p>
     */
    @NameInMap("CredentialContent")
    public UpdateCredentialRequestCredentialContent credentialContent;

    /**
     * <p>The credential ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("CredentialId")
    public String credentialId;

    /**
     * <p>The credential name.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_name</p>
     */
    @NameInMap("CredentialName")
    public String credentialName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialRequest self = new UpdateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCredentialRequest setCredentialContent(UpdateCredentialRequestCredentialContent credentialContent) {
        this.credentialContent = credentialContent;
        return this;
    }
    public UpdateCredentialRequestCredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    public UpdateCredentialRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public UpdateCredentialRequest setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateCredentialRequestCredentialContentApiKeyContent extends TeaModel {
        /**
         * <p>The API key value.</p>
         * 
         * <strong>example:</strong>
         * <p>nsklnertyt5ddwizncxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        public static UpdateCredentialRequestCredentialContentApiKeyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialRequestCredentialContentApiKeyContent self = new UpdateCredentialRequestCredentialContentApiKeyContent();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialRequestCredentialContentApiKeyContent setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

    }

    public static class UpdateCredentialRequestCredentialContentOAuthClientContent extends TeaModel {
        /**
         * <p>The client_id in the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client_secret in the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>nsklncmwizncxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static UpdateCredentialRequestCredentialContentOAuthClientContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialRequestCredentialContentOAuthClientContent self = new UpdateCredentialRequestCredentialContentOAuthClientContent();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialRequestCredentialContentOAuthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateCredentialRequestCredentialContentOAuthClientContent setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class UpdateCredentialRequestCredentialContent extends TeaModel {
        /**
         * <p>The credential content for an API key credential type.</p>
         */
        @NameInMap("ApiKeyContent")
        public UpdateCredentialRequestCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>The credential content for an OAuth client authentication credential type.</p>
         */
        @NameInMap("OAuthClientContent")
        public UpdateCredentialRequestCredentialContentOAuthClientContent OAuthClientContent;

        public static UpdateCredentialRequestCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialRequestCredentialContent self = new UpdateCredentialRequestCredentialContent();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialRequestCredentialContent setApiKeyContent(UpdateCredentialRequestCredentialContentApiKeyContent apiKeyContent) {
            this.apiKeyContent = apiKeyContent;
            return this;
        }
        public UpdateCredentialRequestCredentialContentApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

        public UpdateCredentialRequestCredentialContent setOAuthClientContent(UpdateCredentialRequestCredentialContentOAuthClientContent OAuthClientContent) {
            this.OAuthClientContent = OAuthClientContent;
            return this;
        }
        public UpdateCredentialRequestCredentialContentOAuthClientContent getOAuthClientContent() {
            return this.OAuthClientContent;
        }

    }

}
