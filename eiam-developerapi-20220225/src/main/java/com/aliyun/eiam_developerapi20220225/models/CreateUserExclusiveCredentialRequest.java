// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateUserExclusiveCredentialRequest extends TeaModel {
    /**
     * <p>The credential content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("credentialContent")
    public CreateUserExclusiveCredentialRequestCredentialContent credentialContent;

    @NameInMap("credentialExternalId")
    public String credentialExternalId;

    /**
     * <p>The credential identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("credentialIdentifier")
    public String credentialIdentifier;

    /**
     * <p>The credential name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_name</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>The scenarios label of the credential. Valid values:</p>
     * <ul>
     * <li>llm: large language model.</li>
     * <li>saas: third-party SaaS service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("credentialScenarioLabel")
    public String credentialScenarioLabel;

    /**
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li>api_key: API Key authentication credential.</li>
     * <li>oauth_client: OAuth client authentication credential.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("credentialType")
    public String credentialType;

    /**
     * <p>The credential description.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_description</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("returnCiphertext")
    public Boolean returnCiphertext;

    public static CreateUserExclusiveCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserExclusiveCredentialRequest self = new CreateUserExclusiveCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserExclusiveCredentialRequest setCredentialContent(CreateUserExclusiveCredentialRequestCredentialContent credentialContent) {
        this.credentialContent = credentialContent;
        return this;
    }
    public CreateUserExclusiveCredentialRequestCredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    public CreateUserExclusiveCredentialRequest setCredentialExternalId(String credentialExternalId) {
        this.credentialExternalId = credentialExternalId;
        return this;
    }
    public String getCredentialExternalId() {
        return this.credentialExternalId;
    }

    public CreateUserExclusiveCredentialRequest setCredentialIdentifier(String credentialIdentifier) {
        this.credentialIdentifier = credentialIdentifier;
        return this;
    }
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

    public CreateUserExclusiveCredentialRequest setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateUserExclusiveCredentialRequest setCredentialScenarioLabel(String credentialScenarioLabel) {
        this.credentialScenarioLabel = credentialScenarioLabel;
        return this;
    }
    public String getCredentialScenarioLabel() {
        return this.credentialScenarioLabel;
    }

    public CreateUserExclusiveCredentialRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public CreateUserExclusiveCredentialRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserExclusiveCredentialRequest setReturnCiphertext(Boolean returnCiphertext) {
        this.returnCiphertext = returnCiphertext;
        return this;
    }
    public Boolean getReturnCiphertext() {
        return this.returnCiphertext;
    }

    public static class CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent extends TeaModel {
        /**
         * <p>The value of the API Key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-nsklncmwizncxxxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        public static CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent self = new CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent();
            return TeaModel.build(map, self);
        }

        public CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

    }

    public static class CreateUserExclusiveCredentialRequestCredentialContent extends TeaModel {
        /**
         * <p>The credential content for the API Key credential type.</p>
         */
        @NameInMap("apiKeyContent")
        public CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent apiKeyContent;

        public static CreateUserExclusiveCredentialRequestCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            CreateUserExclusiveCredentialRequestCredentialContent self = new CreateUserExclusiveCredentialRequestCredentialContent();
            return TeaModel.build(map, self);
        }

        public CreateUserExclusiveCredentialRequestCredentialContent setApiKeyContent(CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent apiKeyContent) {
            this.apiKeyContent = apiKeyContent;
            return this;
        }
        public CreateUserExclusiveCredentialRequestCredentialContentApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

    }

}
