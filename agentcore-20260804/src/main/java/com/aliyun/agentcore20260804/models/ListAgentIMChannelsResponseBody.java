// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentIMChannelsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The IM channel list.</p>
     */
    @NameInMap("items")
    public java.util.List<ListAgentIMChannelsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned per page for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next page. An empty value indicates that the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListAgentIMChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentIMChannelsResponseBody self = new ListAgentIMChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentIMChannelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentIMChannelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentIMChannelsResponseBody setItems(java.util.List<ListAgentIMChannelsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAgentIMChannelsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAgentIMChannelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentIMChannelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentIMChannelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentIMChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentIMChannelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgentIMChannelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgentIMChannelsResponseBodyItemsChannelConfig extends TeaModel {
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

        public static ListAgentIMChannelsResponseBodyItemsChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAgentIMChannelsResponseBodyItemsChannelConfig self = new ListAgentIMChannelsResponseBodyItemsChannelConfig();
            return TeaModel.build(map, self);
        }

        public ListAgentIMChannelsResponseBodyItemsChannelConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public ListAgentIMChannelsResponseBodyItemsChannelConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

    }

    public static class ListAgentIMChannelsResponseBodyItemsCredentialSummary extends TeaModel {
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

        public static ListAgentIMChannelsResponseBodyItemsCredentialSummary build(java.util.Map<String, ?> map) throws Exception {
            ListAgentIMChannelsResponseBodyItemsCredentialSummary self = new ListAgentIMChannelsResponseBodyItemsCredentialSummary();
            return TeaModel.build(map, self);
        }

        public ListAgentIMChannelsResponseBodyItemsCredentialSummary setConfiguredSecretFields(java.util.List<String> configuredSecretFields) {
            this.configuredSecretFields = configuredSecretFields;
            return this;
        }
        public java.util.List<String> getConfiguredSecretFields() {
            return this.configuredSecretFields;
        }

        public ListAgentIMChannelsResponseBodyItemsCredentialSummary setNonSecretFields(java.util.Map<String, String> nonSecretFields) {
            this.nonSecretFields = nonSecretFields;
            return this;
        }
        public java.util.Map<String, String> getNonSecretFields() {
            return this.nonSecretFields;
        }

    }

    public static class ListAgentIMChannelsResponseBodyItems extends TeaModel {
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
        public ListAgentIMChannelsResponseBodyItemsChannelConfig channelConfig;

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
        public ListAgentIMChannelsResponseBodyItemsCredentialSummary credentialSummary;

        /**
         * <p>Indicates whether the IM channel is enabled. Default value upon creation: true.</p>
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
         * <p>The ID of the bound ServiceEndpoint. The endpoint must belong to the specified agent and its current version, be in the ready state, and have a public network address.</p>
         * 
         * <strong>example:</strong>
         * <p>se-1</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The IM channel status. Valid values:</p>
         * <ul>
         * <li>CREATING: being created.</li>
         * <li>READY: ready.</li>
         * <li>UPDATING: being updated.</li>
         * <li>FAILED: failed.</li>
         * <li>DELETING: being deleted.</li>
         * <li>DELETE_FAILED: deletion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the current status of the IM channel.</p>
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

        public static ListAgentIMChannelsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAgentIMChannelsResponseBodyItems self = new ListAgentIMChannelsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAgentIMChannelsResponseBodyItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentIMChannelsResponseBodyItems setChannelConfig(ListAgentIMChannelsResponseBodyItemsChannelConfig channelConfig) {
            this.channelConfig = channelConfig;
            return this;
        }
        public ListAgentIMChannelsResponseBodyItemsChannelConfig getChannelConfig() {
            return this.channelConfig;
        }

        public ListAgentIMChannelsResponseBodyItems setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ListAgentIMChannelsResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAgentIMChannelsResponseBodyItems setCredentialSummary(ListAgentIMChannelsResponseBodyItemsCredentialSummary credentialSummary) {
            this.credentialSummary = credentialSummary;
            return this;
        }
        public ListAgentIMChannelsResponseBodyItemsCredentialSummary getCredentialSummary() {
            return this.credentialSummary;
        }

        public ListAgentIMChannelsResponseBodyItems setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAgentIMChannelsResponseBodyItems setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public ListAgentIMChannelsResponseBodyItems setImChannelId(String imChannelId) {
            this.imChannelId = imChannelId;
            return this;
        }
        public String getImChannelId() {
            return this.imChannelId;
        }

        public ListAgentIMChannelsResponseBodyItems setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public ListAgentIMChannelsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAgentIMChannelsResponseBodyItems setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListAgentIMChannelsResponseBodyItems setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAgentIMChannelsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
