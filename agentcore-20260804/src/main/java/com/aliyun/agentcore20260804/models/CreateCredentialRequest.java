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
         * <p>The ID of the applicable MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The name of the resource. This parameter is empty if the resource is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-service</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The type of the resource. Set the value to mcpServer, which indicates an MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcpServer</p>
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
         * <p>The credential content, submitted as a JSON string. For the apiKey type, it contains only a non-empty apiKey. For the mcpHeader type, it contains a non-empty headers array, where each item includes a name and a value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>The credential type. Valid values: apiKey (API key) and mcpHeader (MCP request header).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <p>The description of the credential. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>API key used to call the model service in the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the credential. The name must be unique within the workspace, contain only letters, digits, periods, underscores, and hyphens, and be 3 to 99 characters in length. Runtime reserved names cannot be used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of applicable resources for an mcpHeader credential. This parameter must be non-empty when resourceScope is set to SPECIFIED, and must be omitted when resourceScope is set to ALL.</p>
         */
        @NameInMap("resourceRefs")
        public java.util.List<CreateCredentialRequestBodyResourceRefs> resourceRefs;

        /**
         * <p>The application scope of an mcpHeader credential. This parameter is supported only for the mcpHeader type. ALL indicates all MCP services, and SPECIFIED indicates the MCP services specified in resourceRefs. Do not submit this field for the apiKey type.</p>
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
