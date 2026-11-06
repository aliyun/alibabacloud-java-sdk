// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCredentialRequest extends TeaModel {
    /**
     * <p>The request body for updating the credential.</p>
     */
    @NameInMap("body")
    public UpdateCredentialRequestBody body;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialRequest self = new UpdateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialRequest setBody(UpdateCredentialRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialRequestBody getBody() {
        return this.body;
    }

    public UpdateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateCredentialRequestBodyResourceRefs extends TeaModel {
        /**
         * <p>The ID of the applicable MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource name. This field is empty if the resource has been deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-service</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The resource type. Currently, the value is mcpServer, which indicates an MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcpServer</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static UpdateCredentialRequestBodyResourceRefs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialRequestBodyResourceRefs self = new UpdateCredentialRequestBodyResourceRefs();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialRequestBodyResourceRefs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateCredentialRequestBodyResourceRefs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public UpdateCredentialRequestBodyResourceRefs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class UpdateCredentialRequestBody extends TeaModel {
        /**
         * <p>The credential content, submitted as a JSON string. For the apiKey type, it contains only a non-empty apiKey. For the mcpHeader type, it contains a non-empty headers array, where each item includes a name and a value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>The new credential description. The description can be up to 256 characters in length. If omitted, the original description is retained. It can be updated independently of the credential content or application scope.</p>
         * 
         * <strong>example:</strong>
         * <p>API key used to call the model service in the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The list of applicable resources for the MCP header credential. If submitted, resourceScope must also be submitted. An empty array [] is allowed when the scope is SPECIFIED. Omit this field when the scope is ALL.</p>
         */
        @NameInMap("resourceRefs")
        public java.util.List<UpdateCredentialRequestBodyResourceRefs> resourceRefs;

        /**
         * <p>The application scope of the MCP header credential. This field is supported only for the mcpHeader type. ALL indicates all MCP services, and SPECIFIED indicates the MCP services specified in resourceRefs. Do not submit this field for the apiKey type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("resourceScope")
        public String resourceScope;

        public static UpdateCredentialRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialRequestBody self = new UpdateCredentialRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialRequestBody setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public UpdateCredentialRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCredentialRequestBody setResourceRefs(java.util.List<UpdateCredentialRequestBodyResourceRefs> resourceRefs) {
            this.resourceRefs = resourceRefs;
            return this;
        }
        public java.util.List<UpdateCredentialRequestBodyResourceRefs> getResourceRefs() {
            return this.resourceRefs;
        }

        public UpdateCredentialRequestBody setResourceScope(String resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public String getResourceScope() {
            return this.resourceScope;
        }

    }

}
