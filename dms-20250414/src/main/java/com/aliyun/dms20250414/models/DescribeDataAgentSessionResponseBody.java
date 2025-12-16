// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentSessionResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDataAgentSessionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>18****-*****-*******7A3122F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDataAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentSessionResponseBody self = new DescribeDataAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentSessionResponseBody setData(DescribeDataAgentSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataAgentSessionResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataAgentSessionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDataAgentSessionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDataAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataAgentSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataAgentSessionResponseBodyDataChatHistoryLocations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Url")
        public String url;

        public static DescribeDataAgentSessionResponseBodyDataChatHistoryLocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSessionResponseBodyDataChatHistoryLocations self = new DescribeDataAgentSessionResponseBodyDataChatHistoryLocations();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSessionResponseBodyDataChatHistoryLocations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataAgentSessionResponseBodyDataChatHistoryLocations setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeDataAgentSessionResponseBodyDataSessionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ca-e*******ckd</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        @NameInMap("McpServerIds")
        public java.util.List<String> mcpServerIds;

        /**
         * <strong>example:</strong>
         * <p>ANALYSIS</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static DescribeDataAgentSessionResponseBodyDataSessionConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSessionResponseBodyDataSessionConfig self = new DescribeDataAgentSessionResponseBodyDataSessionConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setCustomAgentStage(String customAgentStage) {
            this.customAgentStage = customAgentStage;
            return this;
        }
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setMcpServerIds(java.util.List<String> mcpServerIds) {
            this.mcpServerIds = mcpServerIds;
            return this;
        }
        public java.util.List<String> getMcpServerIds() {
            return this.mcpServerIds;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class DescribeDataAgentSessionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cu0cs*******mf</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentStatus")
        public String agentStatus;

        @NameInMap("ChatHistoryLocations")
        public java.util.List<DescribeDataAgentSessionResponseBodyDataChatHistoryLocations> chatHistoryLocations;

        /**
         * <strong>example:</strong>
         * <p>1731645908000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FavoriteInWorkspace")
        public String favoriteInWorkspace;

        /**
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("File")
        public String file;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Saved")
        public Boolean saved;

        @NameInMap("SessionConfig")
        public DescribeDataAgentSessionResponseBodyDataSessionConfig sessionConfig;

        /**
         * <strong>example:</strong>
         * <p>976*********p</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("SessionStatus")
        public String sessionStatus;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserId")
        public String userId;

        public static DescribeDataAgentSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSessionResponseBodyData self = new DescribeDataAgentSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSessionResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public DescribeDataAgentSessionResponseBodyData setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeDataAgentSessionResponseBodyData setChatHistoryLocations(java.util.List<DescribeDataAgentSessionResponseBodyDataChatHistoryLocations> chatHistoryLocations) {
            this.chatHistoryLocations = chatHistoryLocations;
            return this;
        }
        public java.util.List<DescribeDataAgentSessionResponseBodyDataChatHistoryLocations> getChatHistoryLocations() {
            return this.chatHistoryLocations;
        }

        public DescribeDataAgentSessionResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDataAgentSessionResponseBodyData setFavoriteInWorkspace(String favoriteInWorkspace) {
            this.favoriteInWorkspace = favoriteInWorkspace;
            return this;
        }
        public String getFavoriteInWorkspace() {
            return this.favoriteInWorkspace;
        }

        public DescribeDataAgentSessionResponseBodyData setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public DescribeDataAgentSessionResponseBodyData setSaved(Boolean saved) {
            this.saved = saved;
            return this;
        }
        public Boolean getSaved() {
            return this.saved;
        }

        public DescribeDataAgentSessionResponseBodyData setSessionConfig(DescribeDataAgentSessionResponseBodyDataSessionConfig sessionConfig) {
            this.sessionConfig = sessionConfig;
            return this;
        }
        public DescribeDataAgentSessionResponseBodyDataSessionConfig getSessionConfig() {
            return this.sessionConfig;
        }

        public DescribeDataAgentSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeDataAgentSessionResponseBodyData setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeDataAgentSessionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeDataAgentSessionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
