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
         * <p>The new credential content. The value is a JSON string. If credentialType is set to apiKey, only the apiKey field can be included, and the value cannot be empty. At least one of credentialMetadata and description must be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>The new credential description. The description can be up to 256 characters in length. At least one of description and credentialMetadata must be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>API Key used for calling model services in the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>This parameter is required and must be a non-empty array when resourceScope is set to SPECIFIED. Each item contains resourceType and resourceId. resourceName is optional.</p>
         */
        @NameInMap("resourceRefs")
        public java.util.List<UpdateCredentialRequestBodyResourceRefs> resourceRefs;

        /**
         * <p>ALL indicates all resources. SPECIFIED indicates that the credential applies only to the resources specified in resourceRefs.</p>
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
