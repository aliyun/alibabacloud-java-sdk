// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentIMChannelResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The IM channel information after creation.</p>
     */
    @NameInMap("data")
    public CreateAgentIMChannelResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
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
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateAgentIMChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentIMChannelResponseBody self = new CreateAgentIMChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentIMChannelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentIMChannelResponseBody setData(CreateAgentIMChannelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentIMChannelResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentIMChannelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAgentIMChannelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentIMChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentIMChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentIMChannelResponseBodyDataChannelConfig extends TeaModel {
        /**
         * <p>Specifies whether to display the thinking process in IM messages. Default value: false.</p>
         */
        @NameInMap("showThinking")
        public Boolean showThinking;

        /**
         * <p>Specifies whether to display the tool calling process in IM messages. Default value: false.</p>
         */
        @NameInMap("showToolCalls")
        public Boolean showToolCalls;

        public static CreateAgentIMChannelResponseBodyDataChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentIMChannelResponseBodyDataChannelConfig self = new CreateAgentIMChannelResponseBodyDataChannelConfig();
            return TeaModel.build(map, self);
        }

        public CreateAgentIMChannelResponseBodyDataChannelConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public CreateAgentIMChannelResponseBodyDataChannelConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

    }

    public static class CreateAgentIMChannelResponseBodyDataCredentialSummary extends TeaModel {
        /**
         * <p>The list of configured secret field names. Secret values are not included.</p>
         */
        @NameInMap("configuredSecretFields")
        public java.util.List<String> configuredSecretFields;

        /**
         * <p>The non-sensitive credential fields and their values.</p>
         */
        @NameInMap("nonSecretFields")
        public java.util.Map<String, String> nonSecretFields;

        public static CreateAgentIMChannelResponseBodyDataCredentialSummary build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentIMChannelResponseBodyDataCredentialSummary self = new CreateAgentIMChannelResponseBodyDataCredentialSummary();
            return TeaModel.build(map, self);
        }

        public CreateAgentIMChannelResponseBodyDataCredentialSummary setConfiguredSecretFields(java.util.List<String> configuredSecretFields) {
            this.configuredSecretFields = configuredSecretFields;
            return this;
        }
        public java.util.List<String> getConfiguredSecretFields() {
            return this.configuredSecretFields;
        }

        public CreateAgentIMChannelResponseBodyDataCredentialSummary setNonSecretFields(java.util.Map<String, String> nonSecretFields) {
            this.nonSecretFields = nonSecretFields;
            return this;
        }
        public java.util.Map<String, String> getNonSecretFields() {
            return this.nonSecretFields;
        }

    }

    public static class CreateAgentIMChannelResponseBodyData extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The channel behavior configuration.</p>
         */
        @NameInMap("channelConfig")
        public CreateAgentIMChannelResponseBodyDataChannelConfig channelConfig;

        /**
         * <p>The IM channel type. Valid values:</p>
         * <ul>
         * <li>DINGTALK: DingTalk.</li>
         * <li>FEISHU: Lark.</li>
         * <li>WECOM: WeCom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The channel credential summary. Only non-sensitive fields and configured secret field names are returned. Secret values are not returned.</p>
         */
        @NameInMap("credentialSummary")
        public CreateAgentIMChannelResponseBodyDataCredentialSummary credentialSummary;

        /**
         * <p>Specifies whether to enable the IM channel. Default value: true.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The public network access URL of the attached ServiceEndpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agent.example.com">https://agent.example.com</a></p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>The IM channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-1</p>
         */
        @NameInMap("imChannelId")
        public String imChannelId;

        /**
         * <p>The ID of the ServiceEndpoint to bind. The endpoint must belong to the specified agent and its current version, be in the ready state, and have a public network address.</p>
         * 
         * <strong>example:</strong>
         * <p>se-1</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The IM channel status. Valid values:</p>
         * <ul>
         * <li>CREATING: Being created.</li>
         * <li>READY: Ready.</li>
         * <li>UPDATING: Being updated.</li>
         * <li>FAILED: Failed.</li>
         * <li>DELETING: Being deleted.</li>
         * <li>DELETE_FAILED: Deletion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the current IM channel status.</p>
         * 
         * <strong>example:</strong>
         * <p>AppFlow creation failed</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The update time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateAgentIMChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentIMChannelResponseBodyData self = new CreateAgentIMChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentIMChannelResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateAgentIMChannelResponseBodyData setChannelConfig(CreateAgentIMChannelResponseBodyDataChannelConfig channelConfig) {
            this.channelConfig = channelConfig;
            return this;
        }
        public CreateAgentIMChannelResponseBodyDataChannelConfig getChannelConfig() {
            return this.channelConfig;
        }

        public CreateAgentIMChannelResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public CreateAgentIMChannelResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAgentIMChannelResponseBodyData setCredentialSummary(CreateAgentIMChannelResponseBodyDataCredentialSummary credentialSummary) {
            this.credentialSummary = credentialSummary;
            return this;
        }
        public CreateAgentIMChannelResponseBodyDataCredentialSummary getCredentialSummary() {
            return this.credentialSummary;
        }

        public CreateAgentIMChannelResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAgentIMChannelResponseBodyData setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public CreateAgentIMChannelResponseBodyData setImChannelId(String imChannelId) {
            this.imChannelId = imChannelId;
            return this;
        }
        public String getImChannelId() {
            return this.imChannelId;
        }

        public CreateAgentIMChannelResponseBodyData setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public CreateAgentIMChannelResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAgentIMChannelResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public CreateAgentIMChannelResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateAgentIMChannelResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
