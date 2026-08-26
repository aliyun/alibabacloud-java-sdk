// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageRequest extends TeaModel {
    /**
     * <p><strong>[Optimized]</strong> This field is now automatically obtained by the backend. You do not need to specify this field.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p><strong>[Optimized]</strong> This field is now automatically obtained by the backend. You do not need to specify this field when calling the API.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. This parameter can be left empty. This parameter supports only one data source. Use the DataSources parameter instead.</p>
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
     * <p>The message content to send to the Agent.</p>
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
     * <li><p>For regular interactions with the Agent, the message type is <code>[primary]</code>.</p>
     * </li>
     * <li><p>When the message is a response to the Agent\&quot;s Human-in-Loop question, the type should be <code>[additional]</code>.</p>
     * </li>
     * <li><p>When the message is intended to trigger a report generation, the type should be <code>[report]</code>.</p>
     * </li>
     * <li><p>When the message is intended to cancel the current session, the type should be <code>[cancel]</code>.</p>
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
     * <p>Please provide the criteria for calculating GMV</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The quoted content. This is typically used during interactions with the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <p><strong>Important</strong></p>
     * <p>When this message is a reply to an Agent message (for example, the Agent asks a clarification question through ASK_HUMAN), reply_to must be set to the exact Checkpoint sequence number carried in that Agent message. If this message is not a targeted reply, such as requesting the Agent to perform further in-depth analysis after the analysis is complete, reply_to can be left empty or set to &quot;0&quot;.  </p>
     * <p>This field affects how the Agent decides to process the message. Passing an incorrect value may result in analysis results that do not meet expectations.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>The special configuration for the current session. For the same session, only the configuration included in the first SendMessage call takes effect.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public SendChatMessageRequestSessionConfig sessionConfig;

    /**
     * <p>The session ID. This is an optional field used for multi-turn conversations.</p>
     * <ul>
     * <li>You can start a conversation without specifying this field. The response includes the SessionID for the current session.</li>
     * <li>You can also manually create a session ID by calling the CreateDataAgentSession operation and include the ID when initiating a conversation.</li>
     * <li>If you need multi-turn conversations (such as follow-up questions or confirming execution plans), include the SessionID returned by the previous SendChatMessage call.</li>
     * </ul>
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

    /**
     * <p>The user\&quot;s OSS bucket. If this field is left empty, the analysis results are securely stored in the built-in storage.</p>
     * 
     * <strong>example:</strong>
     * <p>my-bucket</p>
     */
    @NameInMap("UserOssBucket")
    public String userOssBucket;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c1p71ne***baexrt3o</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

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

    public SendChatMessageRequest setUserOssBucket(String userOssBucket) {
        this.userOssBucket = userOssBucket;
        return this;
    }
    public String getUserOssBucket() {
        return this.userOssBucket;
    }

    public SendChatMessageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SendChatMessageRequestDataSourcePermissionTables extends TeaModel {
        /**
         * <p>The list of columns that are allowed to be queried in the current table. If this field is left empty, all columns can be queried. If specified, SQL statements that exceed the allowed scope are blocked. For example, syntax such as SELECT * is blocked. To ensure DataAgent analysis effectiveness, avoid specifying columns beyond the allowed scope in the DataAgent prompts, knowledge, or instructions modules. Otherwise, unauthorized SQL statements may be generated and blocked, which reduces DataAgent analysis speed and effectiveness.</p>
         */
        @NameInMap("AllowedColumns")
        public java.util.List<String> allowedColumns;

        /**
         * <p>The required row filter condition for the current table. If this field is left empty, it is ignored. If specified, all SQL statements involving this table are validated to check whether they include the filter field and whether the WHERE condition meets the constraint. SQL statements that do not meet the constraint are rejected. Ensure the validation condition format is correct.</p>
         * 
         * <strong>example:</strong>
         * <p>region = \&quot;east\&quot;</p>
         */
        @NameInMap("RequiredRowFilter")
        public String requiredRowFilter;

        /**
         * <p>The table name to which the permission constraint rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>sample_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static SendChatMessageRequestDataSourcePermissionTables build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestDataSourcePermissionTables self = new SendChatMessageRequestDataSourcePermissionTables();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestDataSourcePermissionTables setAllowedColumns(java.util.List<String> allowedColumns) {
            this.allowedColumns = allowedColumns;
            return this;
        }
        public java.util.List<String> getAllowedColumns() {
            return this.allowedColumns;
        }

        public SendChatMessageRequestDataSourcePermissionTables setRequiredRowFilter(String requiredRowFilter) {
            this.requiredRowFilter = requiredRowFilter;
            return this;
        }
        public String getRequiredRowFilter() {
            return this.requiredRowFilter;
        }

        public SendChatMessageRequestDataSourcePermissionTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class SendChatMessageRequestDataSourcePermission extends TeaModel {
        /**
         * <p>The table-level permission constraints for querying the current data source. Each item in the list represents the permission constraints for a table.</p>
         */
        @NameInMap("Tables")
        public java.util.List<SendChatMessageRequestDataSourcePermissionTables> tables;

        public static SendChatMessageRequestDataSourcePermission build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestDataSourcePermission self = new SendChatMessageRequestDataSourcePermission();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestDataSourcePermission setTables(java.util.List<SendChatMessageRequestDataSourcePermissionTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<SendChatMessageRequestDataSourcePermissionTables> getTables() {
            return this.tables;
        }

    }

    public static class SendChatMessageRequestDataSource extends TeaModel {
        /**
         * <p>Deprecated. You do not need to specify this field.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source type. Valid values: <code>[remote_data_center, database]</code>, indicating that the analysis is performed on a file or a database.</p>
         * 
         * <strong>example:</strong>
         * <p>remote_data_center</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>Deprecated. You do not need to specify this field.</p>
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
         * <p>Deprecated. You do not need to specify this field.</p>
         * 
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The permission constraints for querying the current data source. The permission constraint feature is available through a canary release. This field does not take effect for users who are not included in the canary release.</p>
         */
        @NameInMap("Permission")
        public SendChatMessageRequestDataSourcePermission permission;

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

        public SendChatMessageRequestDataSource setPermission(SendChatMessageRequestDataSourcePermission permission) {
            this.permission = permission;
            return this;
        }
        public SendChatMessageRequestDataSourcePermission getPermission() {
            return this.permission;
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

    public static class SendChatMessageRequestDataSourcesPermissionTables extends TeaModel {
        /**
         * <p>The list of columns that are allowed to be queried in the current table. If this field is left empty, all columns can be queried. If specified, SQL statements that exceed the allowed scope are blocked. For example, syntax such as SELECT * is blocked. To ensure DataAgent analysis effectiveness, avoid specifying columns beyond the allowed scope in the DataAgent prompts, knowledge, or instructions modules. Otherwise, unauthorized SQL statements may be generated and blocked, which reduces DataAgent analysis speed and effectiveness.</p>
         */
        @NameInMap("AllowedColumns")
        public java.util.List<String> allowedColumns;

        /**
         * <p>The required row filter condition for the current table. If this field is left empty, it is ignored. If specified, all SQL statements involving this table are validated to check whether they include the filter field and whether the WHERE condition meets the constraint. SQL statements that do not meet the constraint are rejected. Ensure the validation condition format is correct.</p>
         * 
         * <strong>example:</strong>
         * <p>region = \&quot;east\&quot;</p>
         */
        @NameInMap("RequiredRowFilter")
        public String requiredRowFilter;

        /**
         * <p>The table name to which the permission constraint rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>sample_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static SendChatMessageRequestDataSourcesPermissionTables build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestDataSourcesPermissionTables self = new SendChatMessageRequestDataSourcesPermissionTables();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestDataSourcesPermissionTables setAllowedColumns(java.util.List<String> allowedColumns) {
            this.allowedColumns = allowedColumns;
            return this;
        }
        public java.util.List<String> getAllowedColumns() {
            return this.allowedColumns;
        }

        public SendChatMessageRequestDataSourcesPermissionTables setRequiredRowFilter(String requiredRowFilter) {
            this.requiredRowFilter = requiredRowFilter;
            return this;
        }
        public String getRequiredRowFilter() {
            return this.requiredRowFilter;
        }

        public SendChatMessageRequestDataSourcesPermissionTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class SendChatMessageRequestDataSourcesPermission extends TeaModel {
        /**
         * <p>The table-level permission constraints for querying the current data source. Each item in the list represents the permission constraints for a table.</p>
         */
        @NameInMap("Tables")
        public java.util.List<SendChatMessageRequestDataSourcesPermissionTables> tables;

        public static SendChatMessageRequestDataSourcesPermission build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestDataSourcesPermission self = new SendChatMessageRequestDataSourcesPermission();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestDataSourcesPermission setTables(java.util.List<SendChatMessageRequestDataSourcesPermissionTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<SendChatMessageRequestDataSourcesPermissionTables> getTables() {
            return this.tables;
        }

    }

    public static class SendChatMessageRequestDataSources extends TeaModel {
        /**
         * <p>Deprecated. You do not need to specify this field.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source type. Valid values: remote_data_center, database. These values indicate that the analysis is performed on a file or a database.</p>
         * 
         * <strong>example:</strong>
         * <p>remote_data_center</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>Deprecated. You do not need to specify this field.</p>
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
         * <p>Deprecated. You do not need to specify this field.</p>
         * 
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The permission constraints for querying the current data source. The permission constraint feature is available through a canary release. This field does not take effect for users who are not included in the canary release.</p>
         */
        @NameInMap("Permission")
        public SendChatMessageRequestDataSourcesPermission permission;

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

        public SendChatMessageRequestDataSources setPermission(SendChatMessageRequestDataSourcesPermission permission) {
            this.permission = permission;
            return this;
        }
        public SendChatMessageRequestDataSourcesPermission getPermission() {
            return this.permission;
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
         * <p>The custom Agent ID. A custom Agent is an entity used to customize the analysis process. You can create one in the DataAgent console or by calling the CreateCustomAgent operation. The custom Agent ID is a string that starts with <code>ca-</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-asfkjhqwe***aesrfqa</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The stage of the custom Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <p>Specifies whether to enable web search.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public String enableSearch;

        /**
         * <p>The list of knowledge base IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dasd***cc211</p>
         */
        @NameInMap("KbUuidList")
        public String kbUuidList;

        /**
         * <p>Currently only Chinese and English are supported. The default value is Chinese. Only uppercase values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The MCP server IDs in the session configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>2q1tu90**********6uttu2nw</p>
         */
        @NameInMap("McpServerIds")
        public String mcpServerIds;

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
         * <p>Specifies whether to enable the plan. Valid values: disable, enable, force. Default value: enable.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("PlanMode")
        public String planMode;

        /**
         * <p>The text (up to 64 characters) used as a watermark in the generated PDF report.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-watermark</p>
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

        @NameInMap("UserSpecifiedSkillList")
        public java.util.List<String> userSpecifiedSkillList;

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

        public SendChatMessageRequestSessionConfig setEnableSearch(String enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public String getEnableSearch() {
            return this.enableSearch;
        }

        public SendChatMessageRequestSessionConfig setKbUuidList(String kbUuidList) {
            this.kbUuidList = kbUuidList;
            return this;
        }
        public String getKbUuidList() {
            return this.kbUuidList;
        }

        public SendChatMessageRequestSessionConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public SendChatMessageRequestSessionConfig setMcpServerIds(String mcpServerIds) {
            this.mcpServerIds = mcpServerIds;
            return this;
        }
        public String getMcpServerIds() {
            return this.mcpServerIds;
        }

        public SendChatMessageRequestSessionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public SendChatMessageRequestSessionConfig setPlanMode(String planMode) {
            this.planMode = planMode;
            return this;
        }
        public String getPlanMode() {
            return this.planMode;
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

        public SendChatMessageRequestSessionConfig setUserSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
            this.userSpecifiedSkillList = userSpecifiedSkillList;
            return this;
        }
        public java.util.List<String> getUserSpecifiedSkillList() {
            return this.userSpecifiedSkillList;
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
         * <p>The report theme. Valid values: default, journal, legacy, neobrutalism.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ReportTheme")
        public String reportTheme;

        /**
         * <p>The service type. Valid values: TextReport, WebReport. These values indicate that the current task generates a text report or a web report. Currently only WebReport is supported.</p>
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
