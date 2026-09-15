// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    /**
     * <p>The request body for creating a credential.</p>
     */
    @NameInMap("body")
    public CreateCredentialRequestBody body;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialRequest self = new CreateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialRequest setBody(CreateCredentialRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateCredentialRequestBody getBody() {
        return this.body;
    }

    public CreateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateCredentialRequestBodyResourceRefs extends TeaModel {
        /**
         * <p>The unique identifier of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-xxxx</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource name. This value is empty if the resource has been deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The resource type, such as agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static CreateCredentialRequestBodyResourceRefs build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialRequestBodyResourceRefs self = new CreateCredentialRequestBodyResourceRefs();
            return TeaModel.build(map, self);
        }

        public CreateCredentialRequestBodyResourceRefs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateCredentialRequestBodyResourceRefs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public CreateCredentialRequestBodyResourceRefs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CreateCredentialRequestBody extends TeaModel {
        /**
         * <p>The credential content. The value is a JSON string. When credentialType is set to apiKey, the content can contain only the apiKey field, and the value cannot be empty. After being written, the content can only be queried in masked form.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>The credential type. Currently, only apiKey is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <p>The credential description. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>API Key used for calling model services in the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The credential name. The name must be unique within the workspace and can contain only letters, digits, periods (.), underscores (_), and hyphens (-). The name must be 3 to 128 characters in length and cannot use runtime reserved names.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>This parameter is required and must be a non-empty array when resourceScope is set to SPECIFIED. Each item contains resourceType and resourceId. resourceName is optional.</p>
         */
        @NameInMap("resourceRefs")
        public java.util.List<CreateCredentialRequestBodyResourceRefs> resourceRefs;

        /**
         * <p>ALL indicates all resources. SPECIFIED indicates that the credential applies only to the resources specified in resourceRefs.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("resourceScope")
        public String resourceScope;

        public static CreateCredentialRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialRequestBody self = new CreateCredentialRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateCredentialRequestBody setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public CreateCredentialRequestBody setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public CreateCredentialRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCredentialRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCredentialRequestBody setResourceRefs(java.util.List<CreateCredentialRequestBodyResourceRefs> resourceRefs) {
            this.resourceRefs = resourceRefs;
            return this;
        }
        public java.util.List<CreateCredentialRequestBodyResourceRefs> getResourceRefs() {
            return this.resourceRefs;
        }

        public CreateCredentialRequestBody setResourceScope(String resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public String getResourceScope() {
            return this.resourceScope;
        }

    }

}
