// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RevealServiceCredentialResponseBody extends TeaModel {
    /**
     * <p>The response code. The value is Ok if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The currently active credential data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;serviceId&quot;:&quot;svc-xxxxxxxx&quot;,&quot;provider&quot;:&quot;qwen&quot;,&quot;credentialType&quot;:&quot;apiKey&quot;,&quot;configRevision&quot;:&quot;1&quot;,&quot;credential&quot;:{&quot;apiKeyGenerateMode&quot;:&quot;Custom&quot;,&quot;apiKeys&quot;:[&quot;sk-xxxxxxxx&quot;]}}</p>
     */
    @NameInMap("data")
    public RevealServiceCredentialResponseBodyData data;

    /**
     * <p>The response message. The value is success if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RevealServiceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevealServiceCredentialResponseBody self = new RevealServiceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public RevealServiceCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevealServiceCredentialResponseBody setData(RevealServiceCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RevealServiceCredentialResponseBodyData getData() {
        return this.data;
    }

    public RevealServiceCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevealServiceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RevealServiceCredentialResponseBodyDataCredential extends TeaModel {
        /**
         * <p>The API key generation mode. Valid values: Custom and Reference. Historical null values are treated as Custom.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("apiKeyGenerateMode")
        public String apiKeyGenerateMode;

        /**
         * <p>The list of Key Management Service (KMS) reference names. This parameter is returned only in Reference mode. The reference values are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;my-kms-ref&quot;]</p>
         */
        @NameInMap("apiKeyReferences")
        public java.util.List<String> apiKeyReferences;

        /**
         * <p>The list of custom API keys. This parameter is returned only when apiKeyGenerateMode is set to Custom. The keys are returned in the original order without deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sk-xxxxxxxx&quot;,&quot;sk-yyyyyyyy&quot;]</p>
         */
        @NameInMap("apiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>The AWS access key ID for Bedrock.</p>
         * 
         * <strong>example:</strong>
         * <p>AKIAxxxxxxxx</p>
         */
        @NameInMap("awsAccessKey")
        public String awsAccessKey;

        /**
         * <p>The AWS region for Bedrock.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("awsRegion")
        public String awsRegion;

        /**
         * <p>The AWS secret access key for Bedrock.</p>
         * 
         * <strong>example:</strong>
         * <p>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</p>
         */
        @NameInMap("awsSecretKey")
        public String awsSecretKey;

        /**
         * <p>The source of the credential. The value is pai-eas when the credential is backfilled by the PAI-EAS system.</p>
         * 
         * <strong>example:</strong>
         * <p>pai-eas</p>
         */
        @NameInMap("credentialSource")
        public String credentialSource;

        /**
         * <p>The Bedrock endpoint mode. The value is runtime for historical null values.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        @NameInMap("endpointMode")
        public String endpointMode;

        /**
         * <p>The access key ID for Kling.</p>
         * 
         * <strong>example:</strong>
         * <p>AKxxxxxxxx</p>
         */
        @NameInMap("klingAccessKey")
        public String klingAccessKey;

        /**
         * <p>The secret access key for Kling.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-kling-9f2c1d7e</p>
         */
        @NameInMap("klingSecretKey")
        public String klingSecretKey;

        /**
         * <p>The original JSON text of the Vertex service account. The text is neither parsed nor reordered.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;service_account&quot;,&quot;private_key&quot;:&quot;********&quot;}</p>
         */
        @NameInMap("vertexAuthKey")
        public String vertexAuthKey;

        /**
         * <p>The Vertex project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-gcp-project</p>
         */
        @NameInMap("vertexProjectId")
        public String vertexProjectId;

        /**
         * <p>The region for Vertex.</p>
         * 
         * <strong>example:</strong>
         * <p>us-central1</p>
         */
        @NameInMap("vertexRegion")
        public String vertexRegion;

        public static RevealServiceCredentialResponseBodyDataCredential build(java.util.Map<String, ?> map) throws Exception {
            RevealServiceCredentialResponseBodyDataCredential self = new RevealServiceCredentialResponseBodyDataCredential();
            return TeaModel.build(map, self);
        }

        public RevealServiceCredentialResponseBodyDataCredential setApiKeyGenerateMode(String apiKeyGenerateMode) {
            this.apiKeyGenerateMode = apiKeyGenerateMode;
            return this;
        }
        public String getApiKeyGenerateMode() {
            return this.apiKeyGenerateMode;
        }

        public RevealServiceCredentialResponseBodyDataCredential setApiKeyReferences(java.util.List<String> apiKeyReferences) {
            this.apiKeyReferences = apiKeyReferences;
            return this;
        }
        public java.util.List<String> getApiKeyReferences() {
            return this.apiKeyReferences;
        }

        public RevealServiceCredentialResponseBodyDataCredential setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public RevealServiceCredentialResponseBodyDataCredential setAwsAccessKey(String awsAccessKey) {
            this.awsAccessKey = awsAccessKey;
            return this;
        }
        public String getAwsAccessKey() {
            return this.awsAccessKey;
        }

        public RevealServiceCredentialResponseBodyDataCredential setAwsRegion(String awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public String getAwsRegion() {
            return this.awsRegion;
        }

        public RevealServiceCredentialResponseBodyDataCredential setAwsSecretKey(String awsSecretKey) {
            this.awsSecretKey = awsSecretKey;
            return this;
        }
        public String getAwsSecretKey() {
            return this.awsSecretKey;
        }

        public RevealServiceCredentialResponseBodyDataCredential setCredentialSource(String credentialSource) {
            this.credentialSource = credentialSource;
            return this;
        }
        public String getCredentialSource() {
            return this.credentialSource;
        }

        public RevealServiceCredentialResponseBodyDataCredential setEndpointMode(String endpointMode) {
            this.endpointMode = endpointMode;
            return this;
        }
        public String getEndpointMode() {
            return this.endpointMode;
        }

        public RevealServiceCredentialResponseBodyDataCredential setKlingAccessKey(String klingAccessKey) {
            this.klingAccessKey = klingAccessKey;
            return this;
        }
        public String getKlingAccessKey() {
            return this.klingAccessKey;
        }

        public RevealServiceCredentialResponseBodyDataCredential setKlingSecretKey(String klingSecretKey) {
            this.klingSecretKey = klingSecretKey;
            return this;
        }
        public String getKlingSecretKey() {
            return this.klingSecretKey;
        }

        public RevealServiceCredentialResponseBodyDataCredential setVertexAuthKey(String vertexAuthKey) {
            this.vertexAuthKey = vertexAuthKey;
            return this;
        }
        public String getVertexAuthKey() {
            return this.vertexAuthKey;
        }

        public RevealServiceCredentialResponseBodyDataCredential setVertexProjectId(String vertexProjectId) {
            this.vertexProjectId = vertexProjectId;
            return this;
        }
        public String getVertexProjectId() {
            return this.vertexProjectId;
        }

        public RevealServiceCredentialResponseBodyDataCredential setVertexRegion(String vertexRegion) {
            this.vertexRegion = vertexRegion;
            return this;
        }
        public String getVertexRegion() {
            return this.vertexRegion;
        }

    }

    public static class RevealServiceCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The current configuration revision. The value is legacy for historical objects.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("configRevision")
        public String configRevision;

        /**
         * <p>The credential object of the currently active type. Only the fields corresponding to the credentialType are populated.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKeyGenerateMode&quot;:&quot;Custom&quot;,&quot;apiKeys&quot;:[&quot;sk-xxxxxxxx&quot;]}</p>
         */
        @NameInMap("credential")
        public RevealServiceCredentialResponseBodyDataCredential credential;

        /**
         * <p>The currently active credential type. Valid values: apiKey, bedrock, vertex, and kling.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <p>The name of the provider, such as qwen, openai, bedrock, vertex, kling, or pai-eas.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The unique ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxxxxxxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        public static RevealServiceCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RevealServiceCredentialResponseBodyData self = new RevealServiceCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RevealServiceCredentialResponseBodyData setConfigRevision(String configRevision) {
            this.configRevision = configRevision;
            return this;
        }
        public String getConfigRevision() {
            return this.configRevision;
        }

        public RevealServiceCredentialResponseBodyData setCredential(RevealServiceCredentialResponseBodyDataCredential credential) {
            this.credential = credential;
            return this;
        }
        public RevealServiceCredentialResponseBodyDataCredential getCredential() {
            return this.credential;
        }

        public RevealServiceCredentialResponseBodyData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public RevealServiceCredentialResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public RevealServiceCredentialResponseBodyData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

}
