// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentVersionResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS if the request is successful, or an error code if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the fixed agent version. The configuration field contains the agent configuration at the time the version was saved.</p>
     */
    @NameInMap("data")
    public GetAgentVersionResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. The value is success if the request is successful, or an error message if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetAgentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentVersionResponseBody self = new GetAgentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentVersionResponseBody setData(GetAgentVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentVersionResponseBodyData getData() {
        return this.data;
    }

    public GetAgentVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentVersionResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the managed or custom agent that owns the version.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The system-generated version number that increments for each agent, such as v1 and v2. This is used when querying or deleting versions, and when referencing versions in service endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>Indicates only whether the version template and artifact archiving are complete, and does not represent the deployment or running status. A value of READY indicates that the archiving is complete. A value of INVALID indicates that the archiving is missing or inconsistent.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("artifactStatus")
        public String artifactStatus;

        /**
         * <p>For managed agents, the structure is consistent with the data structure of GetManagedAgent. For custom agents, the structure is consistent with the data structure of GetCustomAgent. The desensitization rules are the same.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentId&quot;:&quot;agent-0123456789abcdef0123456789abcdef&quot;,&quot;workspaceId&quot;:&quot;ws-0123456789abcdef01234&quot;,&quot;name&quot;:&quot;customer-service&quot;,&quot;description&quot;:&quot;Customer service agent&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;latestSpecVersion&quot;:2,&quot;instruction&quot;:&quot;You are a customer service assistant.&quot;}</p>
         */
        @NameInMap("configuration")
        public java.util.Map<String, ?> configuration;

        /**
         * <p>The time when the version was saved, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T01:02:03Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The UID of the Alibaba Cloud account of the caller who saved the version. If the API is called by a RAM user, this value is the UID of the Alibaba Cloud account to which the RAM user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The version description provided when the version was saved. It can contain up to 1,024 characters. If no description was provided when the version was saved, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Stable version for the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The effective release serial number of the agent when the version was saved, which is the effectiveSpecVersion at that time. This value does not change after the version is saved.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("targetSpecVersion")
        public Long targetSpecVersion;

        /**
         * <p>The display name specified by the user when the version was saved. For earlier saved versions that did not record a name, the agentVersion is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Production stable version V1.0</p>
         */
        @NameInMap("versionName")
        public String versionName;

        /**
         * <p>The ID of the AgentCore workspace where the agent that owns the version resides.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetAgentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentVersionResponseBodyData self = new GetAgentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentVersionResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetAgentVersionResponseBodyData setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public GetAgentVersionResponseBodyData setArtifactStatus(String artifactStatus) {
            this.artifactStatus = artifactStatus;
            return this;
        }
        public String getArtifactStatus() {
            return this.artifactStatus;
        }

        public GetAgentVersionResponseBodyData setConfiguration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
        }

        public GetAgentVersionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAgentVersionResponseBodyData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetAgentVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentVersionResponseBodyData setTargetSpecVersion(Long targetSpecVersion) {
            this.targetSpecVersion = targetSpecVersion;
            return this;
        }
        public Long getTargetSpecVersion() {
            return this.targetSpecVersion;
        }

        public GetAgentVersionResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public GetAgentVersionResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
