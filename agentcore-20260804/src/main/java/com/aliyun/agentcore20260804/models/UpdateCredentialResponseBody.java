// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCredentialResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The updated credential information.</p>
     */
    @NameInMap("data")
    public UpdateCredentialResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
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
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialResponseBody self = new UpdateCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCredentialResponseBody setData(UpdateCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCredentialResponseBodyData getData() {
        return this.data;
    }

    public UpdateCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateCredentialResponseBodyDataResourceRefs extends TeaModel {
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

        public static UpdateCredentialResponseBodyDataResourceRefs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialResponseBodyDataResourceRefs self = new UpdateCredentialResponseBodyDataResourceRefs();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialResponseBodyDataResourceRefs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateCredentialResponseBodyDataResourceRefs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public UpdateCredentialResponseBodyDataResourceRefs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class UpdateCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The creation time in UTC, formatted in RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-123456</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The masked credential content. If credentialType is set to apiKey, the apiKey value is returned as asterisks (*) of equal length.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;****************&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>The credential type. Currently, only apiKey is supported.</p>
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
         * 
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Each item contains resourceType, resourceId, and resourceName. resourceName is empty if the resource has been deleted.</p>
         */
        @NameInMap("resourceRefs")
        public java.util.List<UpdateCredentialResponseBodyDataResourceRefs> resourceRefs;

        /**
         * <p>The credential resource scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("resourceScope")
        public String resourceScope;

        /**
         * <p>The time of the last modification in UTC, formatted in RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialResponseBodyData self = new UpdateCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateCredentialResponseBodyData setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public UpdateCredentialResponseBodyData setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public UpdateCredentialResponseBodyData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public UpdateCredentialResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCredentialResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCredentialResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateCredentialResponseBodyData setResourceRefs(java.util.List<UpdateCredentialResponseBodyDataResourceRefs> resourceRefs) {
            this.resourceRefs = resourceRefs;
            return this;
        }
        public java.util.List<UpdateCredentialResponseBodyDataResourceRefs> getResourceRefs() {
            return this.resourceRefs;
        }

        public UpdateCredentialResponseBodyData setResourceScope(String resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public String getResourceScope() {
            return this.resourceScope;
        }

        public UpdateCredentialResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateCredentialResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
