// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeDataAgentSessionResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
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
     * <p>The return value. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
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

    public static class DescribeDataAgentSessionResponseBodyDataArtifacts extends TeaModel {
        /**
         * <p>The brief description of the artifact. This value may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>a simple report</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the backend completed the artifact task. This is a UNIX timestamp accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1778743587</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The globally unique artifact ID. If the report is produced by calling SendChatMessage with MessageType set to REPORT, the artifact ID is the same as the MessageId in the response of the SendChatMessage operation.</p>
         * 
         * <strong>example:</strong>
         * <p>bab******33e1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The artifact name. This is typically a string concatenated by the system and is aligned with the name field in the ListFileUpload operation. You can use this field to query the download URL of the artifact file.</p>
         * 
         * <strong>example:</strong>
         * <p>report_****_2026****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the backend received the artifact request. This is a UNIX timestamp accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1778743587</p>
         */
        @NameInMap("ReceiveTime")
        public String receiveTime;

        /**
         * <p>The time when the backend actually started running the artifact task. This is a UNIX timestamp accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1778743587</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The artifact status. Valid values:</p>
         * <ul>
         * <li><p>PENDING: The backend has received the task but has not started it.</p>
         * </li>
         * <li><p>RUNNING: The backend has started the task but has not completed it.</p>
         * </li>
         * <li><p>SUCCESS: The task succeeded. You can query the file information by calling the ListFileUpload operation.</p>
         * </li>
         * <li><p>FAILED: The task failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The artifact type. Valid values: TextReport, WebReport.</p>
         * 
         * <strong>example:</strong>
         * <p>WebReport</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDataAgentSessionResponseBodyDataArtifacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSessionResponseBodyDataArtifacts self = new DescribeDataAgentSessionResponseBodyDataArtifacts();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataAgentSessionResponseBodyDataArtifacts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDataAgentSessionResponseBodyDataChatHistoryLocations extends TeaModel {
        /**
         * <p>The key of the chat replay history.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The OSS download URL of the chat replay history.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
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

    public static class DescribeDataAgentSessionResponseBodyDataDataSources extends TeaModel {
        /**
         * <p>The data source category. Valid values:</p>
         * <ul>
         * <li><p><strong>CHAT</strong>: specified through the CreateDataAgentSession or SendChatMessage operation during a conversation.</p>
         * </li>
         * <li><p><strong>CUSTOM_AGENT</strong>: from the preset analysis data scope in a custom agent.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHAT</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The data source details.</p>
         * <p>When Category is CHAT or CUSTOM_AGENT, the structure of Detail is aligned with the structure of a single element in the DataSources parameter of the SendChatMessage operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Detail")
        public String detail;

        public static DescribeDataAgentSessionResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSessionResponseBodyDataDataSources self = new DescribeDataAgentSessionResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSessionResponseBodyDataDataSources setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDataAgentSessionResponseBodyDataDataSources setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class DescribeDataAgentSessionResponseBodyDataRecallResults extends TeaModel {
        /**
         * <p>The content of the recalled knowledge chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>sky is blue</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The similarity score of this data entry. The scoring algorithm is related to the algorithm (l2/ip/cosine) specified when the index was created.</p>
         * 
         * <strong>example:</strong>
         * <p>0.65</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The type of the recalled knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDataAgentSessionResponseBodyDataRecallResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSessionResponseBodyDataRecallResults self = new DescribeDataAgentSessionResponseBodyDataRecallResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSessionResponseBodyDataRecallResults setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDataAgentSessionResponseBodyDataRecallResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public DescribeDataAgentSessionResponseBodyDataRecallResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDataAgentSessionResponseBodyDataSessionConfig extends TeaModel {
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
         * <li><strong>debug</strong>: test stage.</li>
         * <li><strong>prod</strong>: production stage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <p>Specifies whether to enable web search.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The encryption key for storing artifacts in OSS (both built-in and user-specified). This is typically specified in CreateDataAgentSession.</p>
         * 
         * <strong>example:</strong>
         * <p>ay***1Te</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>The encryption type for storing artifacts in OSS (both built-in and user-specified).</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The list of knowledge base IDs for the current session.</p>
         */
        @NameInMap("KbUuidList")
        public java.util.List<String> kbUuidList;

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><strong>CHINESE</strong>: Chinese.</li>
         * <li><strong>ENGLISH</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The list of MCP server IDs in the session configuration.</p>
         */
        @NameInMap("McpServerIds")
        public java.util.List<String> mcpServerIds;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li><strong>ASK_DATA</strong>: ask data mode.</li>
         * <li><strong>ANALYSIS</strong>: analysis mode.</li>
         * <li><strong>INSIGHT</strong>: insight mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The report page width.</p>
         * 
         * <strong>example:</strong>
         * <p>300mm</p>
         */
        @NameInMap("ReportPageWidth")
        public Long reportPageWidth;

        /**
         * <p>The report watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ReportWaterMark")
        public String reportWaterMark;

        /**
         * <p>The name of the user OSS bucket.</p>
         * <ul>
         * <li>Analysis process files and report artifacts can be uploaded to the user-specified OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user-oss-bucket</p>
         */
        @NameInMap("UserOssBucket")
        public String userOssBucket;

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

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setKbUuidList(java.util.List<String> kbUuidList) {
            this.kbUuidList = kbUuidList;
            return this;
        }
        public java.util.List<String> getKbUuidList() {
            return this.kbUuidList;
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

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setReportPageWidth(Long reportPageWidth) {
            this.reportPageWidth = reportPageWidth;
            return this;
        }
        public Long getReportPageWidth() {
            return this.reportPageWidth;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setReportWaterMark(String reportWaterMark) {
            this.reportWaterMark = reportWaterMark;
            return this;
        }
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        public DescribeDataAgentSessionResponseBodyDataSessionConfig setUserOssBucket(String userOssBucket) {
            this.userOssBucket = userOssBucket;
            return this;
        }
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

    }

    public static class DescribeDataAgentSessionResponseBodyData extends TeaModel {
        /**
         * <p>The current agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cu0cs*******mf</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The current agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The list of artifacts produced by the session. Currently, only reports are included.</p>
         */
        @NameInMap("Artifacts")
        public java.util.List<DescribeDataAgentSessionResponseBodyDataArtifacts> artifacts;

        /**
         * <p>The chat replay history.</p>
         */
        @NameInMap("ChatHistoryLocations")
        public java.util.List<DescribeDataAgentSessionResponseBodyDataChatHistoryLocations> chatHistoryLocations;

        /**
         * <p>The time when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1731645908000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The list of data sources used in the current session.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<DescribeDataAgentSessionResponseBodyDataDataSources> dataSources;

        /**
         * <p>Indicates whether the session is saved as a favorite in the workspace by the current logged-in user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FavoriteInWorkspace")
        public String favoriteInWorkspace;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("File")
        public String file;

        /**
         * <p>The recall results from the knowledge base and memory for the current session.</p>
         */
        @NameInMap("RecallResults")
        public java.util.List<DescribeDataAgentSessionResponseBodyDataRecallResults> recallResults;

        /**
         * <p>Indicates whether the session is saved as a favorite by the current logged-in user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Saved")
        public Boolean saved;

        /**
         * <p>The session configuration item.</p>
         */
        @NameInMap("SessionConfig")
        public DescribeDataAgentSessionResponseBodyDataSessionConfig sessionConfig;

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
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>分析一下这份文件，给出报告。</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the session owner.</p>
         * 
         * <strong>example:</strong>
         * <p>2096******</p>
         */
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

        public DescribeDataAgentSessionResponseBodyData setArtifacts(java.util.List<DescribeDataAgentSessionResponseBodyDataArtifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<DescribeDataAgentSessionResponseBodyDataArtifacts> getArtifacts() {
            return this.artifacts;
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

        public DescribeDataAgentSessionResponseBodyData setDataSources(java.util.List<DescribeDataAgentSessionResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<DescribeDataAgentSessionResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
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

        public DescribeDataAgentSessionResponseBodyData setRecallResults(java.util.List<DescribeDataAgentSessionResponseBodyDataRecallResults> recallResults) {
            this.recallResults = recallResults;
            return this;
        }
        public java.util.List<DescribeDataAgentSessionResponseBodyDataRecallResults> getRecallResults() {
            return this.recallResults;
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
