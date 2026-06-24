// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageRequest extends TeaModel {
    /**
     * <p>The agent ID. This is a required field. You can obtain the current AgentId from the response of the CreateAgentSession operation. Agent resources have a lifecycle, so the AgentId you need to specify may change with each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The Data Management unit you are currently in. If you choose to analyze a database, this information is used to correctly connect to your Data Management instance. You can check your current Data Management unit in the Data Management console. If you are a user of Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>), set this parameter to ap-southeast-1.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. This parameter can be left empty. This parameter supports only a single data source. Use the DataSources parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DataSource")
    public SendChatMessageRequestDataSource dataSource;

    /**
     * <p>The detailed data source information. This parameter can be left empty.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<SendChatMessageRequestDataSources> dataSources;

    /**
     * <p>The message content to send to the Agent in this request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>what can you do?</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message type. Default value: <code>[primary]</code>.  </p>
     * <ul>
     * <li><p>For regular interactions with the Agent, set the message type to <code>[primary]</code>.</p>
     * </li>
     * <li><p>When the message is a response to the Agent\&quot;s Human-in-Loop question, set the type to <code>[additional]</code>.</p>
     * </li>
     * <li><p>When the message is intended to trigger report generation, set the type to <code>[report]</code>.</p>
     * </li>
     * <li><p>When the message is intended to cancel the current session, set the type to <code>[cancel]</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The parent session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20qrliuoo7p2vlsfg*****</p>
     */
    @NameInMap("ParentSessionId")
    public String parentSessionId;

    /**
     * <p>This field is required when the message type is <code>additional</code>. Specify the specific question that the Agent asks the user through Human-in-Loop.</p>
     * 
     * <strong>example:</strong>
     * <p>请提供计算GMV的口径。</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The quoted content to pass in. This is typically used during interactions with the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <p><strong>Important</strong></p>
     * <p>When this message is a reply to an Agent message (for example, the Agent asks a clarifying question through ASK_HUMAN), set reply_to to the exact Checkpoint sequence number carried by that Agent message. If this message is not a targeted reply, such as requesting further in-depth analysis after analysis is complete, leave reply_to empty or set it to &quot;0&quot;.  </p>
     * <p>This field affects how the Agent decides to process the message. Passing an incorrect value may lead to analysis results that do not meet expectations.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>The special configuration for this session. For the same session, only the configuration passed with the first SendMessage call takes effect.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public SendChatMessageRequestSessionConfig sessionConfig;

    /**
     * <p>The session ID. This is a required field. You can obtain the SessionId by calling the CreateAgentSession operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sess_***</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The configuration items that affect only the current task.</p>
     */
    @NameInMap("TaskConfig")
    public SendChatMessageRequestTaskConfig taskConfig;

    public static SendChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageRequest self = new SendChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatMessageRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SendChatMessageRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public SendChatMessageRequest setDataSource(SendChatMessageRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public SendChatMessageRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public SendChatMessageRequest setDataSources(java.util.List<SendChatMessageRequestDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<SendChatMessageRequestDataSources> getDataSources() {
        return this.dataSources;
    }

    public SendChatMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendChatMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatMessageRequest setParentSessionId(String parentSessionId) {
        this.parentSessionId = parentSessionId;
        return this;
    }
    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public SendChatMessageRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public SendChatMessageRequest setQuotedMessage(String quotedMessage) {
        this.quotedMessage = quotedMessage;
        return this;
    }
    public String getQuotedMessage() {
        return this.quotedMessage;
    }

    public SendChatMessageRequest setReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }
    public String getReplyTo() {
        return this.replyTo;
    }

    public SendChatMessageRequest setSessionConfig(SendChatMessageRequestSessionConfig sessionConfig) {
        this.sessionConfig = sessionConfig;
        return this;
    }
    public SendChatMessageRequestSessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    public SendChatMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendChatMessageRequest setTaskConfig(SendChatMessageRequestTaskConfig taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }
    public SendChatMessageRequestTaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    public static class SendChatMessageRequestDataSource extends TeaModel {
        /**
         * <p>Deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>remote_data_center: file</li>
         * <li>database: database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remote_data_center</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>Deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The ID of the database in Data Management.</p>
         * 
         * <strong>example:</strong>
         * <p>23******</p>
         */
        @NameInMap("DmsDatabaseId")
        public String dmsDatabaseId;

        /**
         * <p>The ID of the instance in Data Management.</p>
         * 
         * <strong>example:</strong>
         * <p>12******</p>
         */
        @NameInMap("DmsInstanceId")
        public String dmsInstanceId;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of table names to analyze.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static SendChatMessageRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestDataSource self = new SendChatMessageRequestDataSource();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestDataSource setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public SendChatMessageRequestDataSource setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public SendChatMessageRequestDataSource setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public SendChatMessageRequestDataSource setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SendChatMessageRequestDataSource setDmsDatabaseId(String dmsDatabaseId) {
            this.dmsDatabaseId = dmsDatabaseId;
            return this;
        }
        public String getDmsDatabaseId() {
            return this.dmsDatabaseId;
        }

        public SendChatMessageRequestDataSource setDmsInstanceId(String dmsInstanceId) {
            this.dmsInstanceId = dmsInstanceId;
            return this;
        }
        public String getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        public SendChatMessageRequestDataSource setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public SendChatMessageRequestDataSource setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendChatMessageRequestDataSource setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SendChatMessageRequestDataSource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SendChatMessageRequestDataSource setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

    public static class SendChatMessageRequestDataSources extends TeaModel {
        /**
         * <p>Deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>remote_data_center: file</li>
         * <li>database: database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remote_data_center</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>Deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>mydatabase</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The ID of the database in Data Management.</p>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        @NameInMap("DmsDatabaseId")
        public String dmsDatabaseId;

        /**
         * <p>The ID of the instance in Data Management.</p>
         * 
         * <strong>example:</strong>
         * <p>248*****</p>
         */
        @NameInMap("DmsInstanceId")
        public String dmsInstanceId;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-4w*******</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of table names to analyze.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static SendChatMessageRequestDataSources build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestDataSources self = new SendChatMessageRequestDataSources();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public SendChatMessageRequestDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public SendChatMessageRequestDataSources setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public SendChatMessageRequestDataSources setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SendChatMessageRequestDataSources setDmsDatabaseId(String dmsDatabaseId) {
            this.dmsDatabaseId = dmsDatabaseId;
            return this;
        }
        public String getDmsDatabaseId() {
            return this.dmsDatabaseId;
        }

        public SendChatMessageRequestDataSources setDmsInstanceId(String dmsInstanceId) {
            this.dmsInstanceId = dmsInstanceId;
            return this;
        }
        public String getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        public SendChatMessageRequestDataSources setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public SendChatMessageRequestDataSources setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendChatMessageRequestDataSources setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SendChatMessageRequestDataSources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SendChatMessageRequestDataSources setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

    public static class SendChatMessageRequestSessionConfig extends TeaModel {
        /**
         * <p>Deprecated. Use the input parameter of CreateAgentSession instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>Deprecated. Use the input parameter of CreateAgentSession instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <p>Currently only Chinese and English are supported. The default value is Chinese. Only uppercase values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li><strong>ASK_DATA</strong>: data query mode.</li>
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
         * <p>The text of up to 64 characters that is used as a watermark in the generated PDF report.</p>
         * 
         * <strong>example:</strong>
         * <p>示例水印</p>
         */
        @NameInMap("ReportWaterMark")
        public String reportWaterMark;

        /**
         * <p>Specifies whether to disable user inquiries during the process.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SkipAskHuman")
        public Boolean skipAskHuman;

        /**
         * <p>Specifies whether to skip the plan confirmation step.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SkipPlan")
        public Boolean skipPlan;

        /**
         * <p>Specifies whether to skip all SQL confirmations.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("SkipSqlConfirm")
        public Boolean skipSqlConfirm;

        /**
         * <p>Specifies whether to skip the web report generation confirmation.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SkipWebReportConfirm")
        public Boolean skipWebReportConfirm;

        public static SendChatMessageRequestSessionConfig build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestSessionConfig self = new SendChatMessageRequestSessionConfig();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestSessionConfig setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public SendChatMessageRequestSessionConfig setCustomAgentStage(String customAgentStage) {
            this.customAgentStage = customAgentStage;
            return this;
        }
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        public SendChatMessageRequestSessionConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public SendChatMessageRequestSessionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public SendChatMessageRequestSessionConfig setReportWaterMark(String reportWaterMark) {
            this.reportWaterMark = reportWaterMark;
            return this;
        }
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        public SendChatMessageRequestSessionConfig setSkipAskHuman(Boolean skipAskHuman) {
            this.skipAskHuman = skipAskHuman;
            return this;
        }
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        public SendChatMessageRequestSessionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        public SendChatMessageRequestSessionConfig setSkipSqlConfirm(Boolean skipSqlConfirm) {
            this.skipSqlConfirm = skipSqlConfirm;
            return this;
        }
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        public SendChatMessageRequestSessionConfig setSkipWebReportConfirm(Boolean skipWebReportConfirm) {
            this.skipWebReportConfirm = skipWebReportConfirm;
            return this;
        }
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

    }

    public static class SendChatMessageRequestTaskConfigReportConfig extends TeaModel {
        /**
         * <p>The prompt that the report must follow.</p>
         * 
         * <strong>example:</strong>
         * <p>generate a report</p>
         */
        @NameInMap("ReportPrompt")
        public String reportPrompt;

        /**
         * <p>The report theme. Valid values: default, journal, legacy, and neobrutalism.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ReportTheme")
        public String reportTheme;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>TextReport: generates a text report.</li>
         * <li>WebReport: generates a web report.
         * Currently only WebReport is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WebReport</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        public static SendChatMessageRequestTaskConfigReportConfig build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestTaskConfigReportConfig self = new SendChatMessageRequestTaskConfigReportConfig();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestTaskConfigReportConfig setReportPrompt(String reportPrompt) {
            this.reportPrompt = reportPrompt;
            return this;
        }
        public String getReportPrompt() {
            return this.reportPrompt;
        }

        public SendChatMessageRequestTaskConfigReportConfig setReportTheme(String reportTheme) {
            this.reportTheme = reportTheme;
            return this;
        }
        public String getReportTheme() {
            return this.reportTheme;
        }

        public SendChatMessageRequestTaskConfigReportConfig setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

    }

    public static class SendChatMessageRequestTaskConfig extends TeaModel {
        /**
         * <p>The report rule configuration. Only when MessageType is REPORT, a report task is executed based on this configuration.</p>
         */
        @NameInMap("ReportConfig")
        public SendChatMessageRequestTaskConfigReportConfig reportConfig;

        public static SendChatMessageRequestTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestTaskConfig self = new SendChatMessageRequestTaskConfig();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestTaskConfig setReportConfig(SendChatMessageRequestTaskConfigReportConfig reportConfig) {
            this.reportConfig = reportConfig;
            return this;
        }
        public SendChatMessageRequestTaskConfigReportConfig getReportConfig() {
            return this.reportConfig;
        }

    }

}
