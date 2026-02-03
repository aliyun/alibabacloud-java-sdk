// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_12345</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    @NameInMap("DataSource")
    public SendChatMessageRequestDataSource dataSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>what can you do?</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("ParentSessionId")
    public String parentSessionId;

    @NameInMap("Question")
    public String question;

    /**
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public SendChatMessageRequestSessionConfig sessionConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sess_12345</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

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

    public static class SendChatMessageRequestDataSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>remote_data_center</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <strong>example:</strong>
         * <p>fsy_trial</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>11231</p>
         */
        @NameInMap("DmsDatabaseId")
        public String dmsDatabaseId;

        /**
         * <strong>example:</strong>
         * <p>2310246</p>
         */
        @NameInMap("DmsInstanceId")
        public String dmsInstanceId;

        /**
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>353676</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

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

    public static class SendChatMessageRequestSessionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        @NameInMap("Language")
        public String language;

        @NameInMap("ReportWaterMark")
        public String reportWaterMark;

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

        public SendChatMessageRequestSessionConfig setReportWaterMark(String reportWaterMark) {
            this.reportWaterMark = reportWaterMark;
            return this;
        }
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

    }

}
