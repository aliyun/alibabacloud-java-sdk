// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The result code of the request. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The summary of the custom agent whose deletion is accepted. The runtime resources are subsequently cleaned up in the background.</p>
     */
    @NameInMap("data")
    public DeleteCustomAgentResponseBodyData data;

    /**
     * <p>The HTTP status code of the request. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The processing result message of the request. The value is success if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. A successful creation, update, or deletion does not mean that the background operation is complete.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAgentResponseBody self = new DeleteCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCustomAgentResponseBody setData(DeleteCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public DeleteCustomAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteCustomAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the custom agent. You can retrieve it from the response of CreateCustomAgent or ListCustomAgents.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-550e8400e29b41d4a716446655440000</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation method of the agent. The value is CUSTOM for custom agents.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The time when the agent was created. The time is in ISO 8601 format. A trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment method of the agent. Custom agents are deployed and managed by the platform, and the value is MANAGED.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The description of the agent\&quot;s purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversation services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The latest configuration version number. Updates with the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The name of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The compute specifications of the agent. Valid values: INTERACTIVE, STANDARD, and HEAVY.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The overall status of the agent. Valid values: Creating: The agent is being created. Running: The agent is running. Failed: The agent failed. Updating: The agent is being updated. Deleting: The agent is being deleted. Deleted: The agent is deleted. To query the execution progress of the latest configuration, call GetCustomAgent.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the agent was last updated. The time is in ISO 8601 format. A trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The ID of the workspace to which the custom agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DeleteCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCustomAgentResponseBodyData self = new DeleteCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteCustomAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public DeleteCustomAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public DeleteCustomAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteCustomAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DeleteCustomAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteCustomAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public DeleteCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteCustomAgentResponseBodyData setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DeleteCustomAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteCustomAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DeleteCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
