// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSourceRequest extends TeaModel {
    /**
     * <p>The client token used to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>source-create-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The data source configuration. This parameter is required when Type is set to DATA_SOURCE.</p>
     */
    @NameInMap("DataSource")
    public CreateKnowledgeSourceRequestDataSource dataSource;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The document configuration. This parameter is required when Type is set to DOCUMENT.</p>
     */
    @NameInMap("Document")
    public CreateKnowledgeSourceRequestDocument document;

    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The name of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales topic project</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The project configuration. This parameter is required when Type is set to PROJECT.</p>
     */
    @NameInMap("Project")
    public CreateKnowledgeSourceRequestProject project;

    /**
     * <p>The type of the knowledge source. Valid values: PROJECT, DATA_SOURCE, and DOCUMENT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateKnowledgeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSourceRequest self = new CreateKnowledgeSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeSourceRequest setDataSource(CreateKnowledgeSourceRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public CreateKnowledgeSourceRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public CreateKnowledgeSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeSourceRequest setDocument(CreateKnowledgeSourceRequestDocument document) {
        this.document = document;
        return this;
    }
    public CreateKnowledgeSourceRequestDocument getDocument() {
        return this.document;
    }

    public CreateKnowledgeSourceRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeSourceRequest setProject(CreateKnowledgeSourceRequestProject project) {
        this.project = project;
        return this;
    }
    public CreateKnowledgeSourceRequestProject getProject() {
        return this.project;
    }

    public CreateKnowledgeSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateKnowledgeSourceRequestDataSource extends TeaModel {
        /**
         * <p>The ID of the DataWorks data source. The server uses this ID to resolve the associated workspace, environment, and data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        public static CreateKnowledgeSourceRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDataSource self = new CreateKnowledgeSourceRequestDataSource();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

    public static class CreateKnowledgeSourceRequestDocumentDingTalk extends TeaModel {
        /**
         * <p>The MCP authorization credential for the DingTalk document connector. This credential is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("McpKey")
        public String mcpKey;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static CreateKnowledgeSourceRequestDocumentDingTalk build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocumentDingTalk self = new CreateKnowledgeSourceRequestDocumentDingTalk();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocumentDingTalk setMcpKey(String mcpKey) {
            this.mcpKey = mcpKey;
            return this;
        }
        public String getMcpKey() {
            return this.mcpKey;
        }

        public CreateKnowledgeSourceRequestDocumentDingTalk setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class CreateKnowledgeSourceRequestDocumentFeishu extends TeaModel {
        /**
         * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The secret of the Feishu or Lark application. This secret is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static CreateKnowledgeSourceRequestDocumentFeishu build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocumentFeishu self = new CreateKnowledgeSourceRequestDocumentFeishu();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocumentFeishu setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateKnowledgeSourceRequestDocumentFeishu setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateKnowledgeSourceRequestDocumentFeishu setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class CreateKnowledgeSourceRequestDocumentLark extends TeaModel {
        /**
         * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The secret of the Feishu or Lark application. This secret is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static CreateKnowledgeSourceRequestDocumentLark build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocumentLark self = new CreateKnowledgeSourceRequestDocumentLark();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocumentLark setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateKnowledgeSourceRequestDocumentLark setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateKnowledgeSourceRequestDocumentLark setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class CreateKnowledgeSourceRequestDocumentWeCom extends TeaModel {
        /**
         * <p>The ID of the WeCom bot.</p>
         * 
         * <strong>example:</strong>
         * <p>bot-001</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>The secret of the WeCom bot. This secret is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("BotSecret")
        public String botSecret;

        /**
         * <p>The IDs of the shared spaces selected for the WeCom connector.</p>
         */
        @NameInMap("SpaceIds")
        public java.util.List<String> spaceIds;

        public static CreateKnowledgeSourceRequestDocumentWeCom build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocumentWeCom self = new CreateKnowledgeSourceRequestDocumentWeCom();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocumentWeCom setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public CreateKnowledgeSourceRequestDocumentWeCom setBotSecret(String botSecret) {
            this.botSecret = botSecret;
            return this;
        }
        public String getBotSecret() {
            return this.botSecret;
        }

        public CreateKnowledgeSourceRequestDocumentWeCom setSpaceIds(java.util.List<String> spaceIds) {
            this.spaceIds = spaceIds;
            return this;
        }
        public java.util.List<String> getSpaceIds() {
            return this.spaceIds;
        }

    }

    public static class CreateKnowledgeSourceRequestDocumentYuqueTeams extends TeaModel {
        /**
         * <p>The URL of the team site.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.yuque.com">https://www.yuque.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        /**
         * <p>The access token for the Yuque team. This token is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Token")
        public String token;

        public static CreateKnowledgeSourceRequestDocumentYuqueTeams build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocumentYuqueTeams self = new CreateKnowledgeSourceRequestDocumentYuqueTeams();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocumentYuqueTeams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateKnowledgeSourceRequestDocumentYuqueTeams setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public CreateKnowledgeSourceRequestDocumentYuqueTeams setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class CreateKnowledgeSourceRequestDocumentYuque extends TeaModel {
        /**
         * <p>The Yuque team configurations. Each team independently selects the synchronization scope.</p>
         */
        @NameInMap("Teams")
        public java.util.List<CreateKnowledgeSourceRequestDocumentYuqueTeams> teams;

        public static CreateKnowledgeSourceRequestDocumentYuque build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocumentYuque self = new CreateKnowledgeSourceRequestDocumentYuque();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocumentYuque setTeams(java.util.List<CreateKnowledgeSourceRequestDocumentYuqueTeams> teams) {
            this.teams = teams;
            return this;
        }
        public java.util.List<CreateKnowledgeSourceRequestDocumentYuqueTeams> getTeams() {
            return this.teams;
        }

    }

    public static class CreateKnowledgeSourceRequestDocument extends TeaModel {
        /**
         * <p>The type of the connector. Valid values: DINGTALK, FEISHU, LARK, WECOM, and YUQUE. The connector type cannot be changed after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>WECOM</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <p>The DingTalk configuration. This parameter is available only when ConnectorType is set to DINGTALK.</p>
         */
        @NameInMap("DingTalk")
        public CreateKnowledgeSourceRequestDocumentDingTalk dingTalk;

        /**
         * <p>The Feishu configuration. This parameter is available only when ConnectorType is set to FEISHU.</p>
         */
        @NameInMap("Feishu")
        public CreateKnowledgeSourceRequestDocumentFeishu feishu;

        /**
         * <p>The Lark configuration. This parameter is available only when ConnectorType is set to LARK.</p>
         */
        @NameInMap("Lark")
        public CreateKnowledgeSourceRequestDocumentLark lark;

        /**
         * <p>The WeCom configuration. This parameter is available only when ConnectorType is set to WECOM.</p>
         */
        @NameInMap("WeCom")
        public CreateKnowledgeSourceRequestDocumentWeCom weCom;

        /**
         * <p>The Yuque configuration. This parameter is available only when ConnectorType is set to YUQUE.</p>
         */
        @NameInMap("Yuque")
        public CreateKnowledgeSourceRequestDocumentYuque yuque;

        public static CreateKnowledgeSourceRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestDocument self = new CreateKnowledgeSourceRequestDocument();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestDocument setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public CreateKnowledgeSourceRequestDocument setDingTalk(CreateKnowledgeSourceRequestDocumentDingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }
        public CreateKnowledgeSourceRequestDocumentDingTalk getDingTalk() {
            return this.dingTalk;
        }

        public CreateKnowledgeSourceRequestDocument setFeishu(CreateKnowledgeSourceRequestDocumentFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public CreateKnowledgeSourceRequestDocumentFeishu getFeishu() {
            return this.feishu;
        }

        public CreateKnowledgeSourceRequestDocument setLark(CreateKnowledgeSourceRequestDocumentLark lark) {
            this.lark = lark;
            return this;
        }
        public CreateKnowledgeSourceRequestDocumentLark getLark() {
            return this.lark;
        }

        public CreateKnowledgeSourceRequestDocument setWeCom(CreateKnowledgeSourceRequestDocumentWeCom weCom) {
            this.weCom = weCom;
            return this;
        }
        public CreateKnowledgeSourceRequestDocumentWeCom getWeCom() {
            return this.weCom;
        }

        public CreateKnowledgeSourceRequestDocument setYuque(CreateKnowledgeSourceRequestDocumentYuque yuque) {
            this.yuque = yuque;
            return this;
        }
        public CreateKnowledgeSourceRequestDocumentYuque getYuque() {
            return this.yuque;
        }

    }

    public static class CreateKnowledgeSourceRequestProject extends TeaModel {
        /**
         * <p>The environment type. This parameter is optional and restricts the read environment to Dev or Prod. If this parameter is not specified, it does not mean that you have the permissions to read data from both environments.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the DataWorks workspace. This field is used to locate the source.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreateKnowledgeSourceRequestProject build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceRequestProject self = new CreateKnowledgeSourceRequestProject();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceRequestProject setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateKnowledgeSourceRequestProject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
