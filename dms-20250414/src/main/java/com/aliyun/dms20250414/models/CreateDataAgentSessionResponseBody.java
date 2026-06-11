// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The response structure.</p>
     */
    @NameInMap("Data")
    public CreateDataAgentSessionResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CB***********3F1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSessionResponseBody self = new CreateDataAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSessionResponseBody setData(CreateDataAgentSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentSessionResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentSessionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentSessionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentSessionResponseBodyDataSessionConfig extends TeaModel {
        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-e*******ckd</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The stage of the custom agent. Valid values:</p>
         * <ul>
         * <li><p><strong>debug</strong>: Debug stage</p>
         * </li>
         * <li><p><strong>prod</strong>: Production stage</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <p>Indicates whether web search is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        @NameInMap("EncryptKey")
        public String encryptKey;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("KbUuidList")
        public java.util.List<String> kbUuidList;

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><p><strong>CHINESE</strong>: Chinese</p>
         * </li>
         * <li><p><strong>ENGLISH</strong>: English</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>A list of MCP server IDs.</p>
         */
        @NameInMap("McpServerIds")
        public java.util.List<String> mcpServerIds;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li><p><strong>ASK_DATA</strong>: Quick Inquiry Mode</p>
         * </li>
         * <li><p><strong>ANALYSIS</strong>: Analysis Mode</p>
         * </li>
         * <li><p><strong>INSIGHT</strong>: Insight Mode</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS</p>
         */
        @NameInMap("Mode")
        public String mode;

        @NameInMap("ReportPageWidth")
        public Long reportPageWidth;

        @NameInMap("ReportWaterMark")
        public String reportWaterMark;

        /**
         * <p>The name of the user\&quot;s OSS bucket.</p>
         * <ul>
         * <li>Analysis files and report artifacts can be uploaded to this OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user-oss-bucket</p>
         */
        @NameInMap("UserOssBucket")
        public String userOssBucket;

        public static CreateDataAgentSessionResponseBodyDataSessionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentSessionResponseBodyDataSessionConfig self = new CreateDataAgentSessionResponseBodyDataSessionConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setCustomAgentStage(String customAgentStage) {
            this.customAgentStage = customAgentStage;
            return this;
        }
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setKbUuidList(java.util.List<String> kbUuidList) {
            this.kbUuidList = kbUuidList;
            return this;
        }
        public java.util.List<String> getKbUuidList() {
            return this.kbUuidList;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setMcpServerIds(java.util.List<String> mcpServerIds) {
            this.mcpServerIds = mcpServerIds;
            return this;
        }
        public java.util.List<String> getMcpServerIds() {
            return this.mcpServerIds;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setReportPageWidth(Long reportPageWidth) {
            this.reportPageWidth = reportPageWidth;
            return this;
        }
        public Long getReportPageWidth() {
            return this.reportPageWidth;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setReportWaterMark(String reportWaterMark) {
            this.reportWaterMark = reportWaterMark;
            return this;
        }
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        public CreateDataAgentSessionResponseBodyDataSessionConfig setUserOssBucket(String userOssBucket) {
            this.userOssBucket = userOssBucket;
            return this;
        }
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

    }

    public static class CreateDataAgentSessionResponseBodyData extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cu0cs*******mf</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The time when the session was created, in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765262307992</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the associated file.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("File")
        public String file;

        /**
         * <p>Indicates whether the current user has favorited the session.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Saved")
        public Boolean saved;

        /**
         * <p>The session configuration.</p>
         */
        @NameInMap("SessionConfig")
        public CreateDataAgentSessionResponseBodyDataSessionConfig sessionConfig;

        /**
         * <p>The agent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>976*********p</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The session status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>帮我分析一下这份数据，给出报告。</p>
         */
        @NameInMap("Title")
        public String title;

        public static CreateDataAgentSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentSessionResponseBodyData self = new CreateDataAgentSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentSessionResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateDataAgentSessionResponseBodyData setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public CreateDataAgentSessionResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateDataAgentSessionResponseBodyData setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public CreateDataAgentSessionResponseBodyData setSaved(Boolean saved) {
            this.saved = saved;
            return this;
        }
        public Boolean getSaved() {
            return this.saved;
        }

        public CreateDataAgentSessionResponseBodyData setSessionConfig(CreateDataAgentSessionResponseBodyDataSessionConfig sessionConfig) {
            this.sessionConfig = sessionConfig;
            return this;
        }
        public CreateDataAgentSessionResponseBodyDataSessionConfig getSessionConfig() {
            return this.sessionConfig;
        }

        public CreateDataAgentSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateDataAgentSessionResponseBodyData setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public CreateDataAgentSessionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
