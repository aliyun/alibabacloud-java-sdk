// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSourceRequest extends TeaModel {
    /**
     * <p>The complete configuration for Type=DATA_SOURCE.</p>
     */
    @NameInMap("DataSource")
    public UpdateKnowledgeSourceRequestDataSource dataSource;

    /**
     * <p>The new description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The complete configuration for Type=DOCUMENT. Credentials are not returned after they are written.</p>
     */
    @NameInMap("Document")
    public UpdateKnowledgeSourceRequestDocument document;

    /**
     * <p>The ID of the knowledge base to which the source belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The new name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales Project</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The complete configuration for Type=PROJECT.</p>
     */
    @NameInMap("Project")
    public UpdateKnowledgeSourceRequestProject project;

    /**
     * <p>The source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src-001</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    public static UpdateKnowledgeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSourceRequest self = new UpdateKnowledgeSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSourceRequest setDataSource(UpdateKnowledgeSourceRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public UpdateKnowledgeSourceRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public UpdateKnowledgeSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeSourceRequest setDocument(UpdateKnowledgeSourceRequestDocument document) {
        this.document = document;
        return this;
    }
    public UpdateKnowledgeSourceRequestDocument getDocument() {
        return this.document;
    }

    public UpdateKnowledgeSourceRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeSourceRequest setProject(UpdateKnowledgeSourceRequestProject project) {
        this.project = project;
        return this;
    }
    public UpdateKnowledgeSourceRequestProject getProject() {
        return this.project;
    }

    public UpdateKnowledgeSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public static class UpdateKnowledgeSourceRequestDataSource extends TeaModel {
        /**
         * <p>The DataWorks data source ID. The server uses this ID to resolve the associated workspace, environment, and data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        public static UpdateKnowledgeSourceRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDataSource self = new UpdateKnowledgeSourceRequestDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocumentDingTalk extends TeaModel {
        /**
         * <p>The MCP authorization credential for the DingTalk document connector. This credential is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("McpKey")
        public String mcpKey;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static UpdateKnowledgeSourceRequestDocumentDingTalk build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocumentDingTalk self = new UpdateKnowledgeSourceRequestDocumentDingTalk();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocumentDingTalk setMcpKey(String mcpKey) {
            this.mcpKey = mcpKey;
            return this;
        }
        public String getMcpKey() {
            return this.mcpKey;
        }

        public UpdateKnowledgeSourceRequestDocumentDingTalk setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocumentFeishu extends TeaModel {
        /**
         * <p>The application ID of Feishu or Lark. This is not the AppSecret.</p>
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
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static UpdateKnowledgeSourceRequestDocumentFeishu build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocumentFeishu self = new UpdateKnowledgeSourceRequestDocumentFeishu();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocumentFeishu setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateKnowledgeSourceRequestDocumentFeishu setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public UpdateKnowledgeSourceRequestDocumentFeishu setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocumentLark extends TeaModel {
        /**
         * <p>The application ID of Feishu or Lark. This is not the AppSecret.</p>
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
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static UpdateKnowledgeSourceRequestDocumentLark build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocumentLark self = new UpdateKnowledgeSourceRequestDocumentLark();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocumentLark setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateKnowledgeSourceRequestDocumentLark setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public UpdateKnowledgeSourceRequestDocumentLark setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocumentWeCom extends TeaModel {
        /**
         * <p>The WeCom bot ID.</p>
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

        public static UpdateKnowledgeSourceRequestDocumentWeCom build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocumentWeCom self = new UpdateKnowledgeSourceRequestDocumentWeCom();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocumentWeCom setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public UpdateKnowledgeSourceRequestDocumentWeCom setBotSecret(String botSecret) {
            this.botSecret = botSecret;
            return this;
        }
        public String getBotSecret() {
            return this.botSecret;
        }

        public UpdateKnowledgeSourceRequestDocumentWeCom setSpaceIds(java.util.List<String> spaceIds) {
            this.spaceIds = spaceIds;
            return this;
        }
        public java.util.List<String> getSpaceIds() {
            return this.spaceIds;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocumentYuqueTeams extends TeaModel {
        /**
         * <p>The URL of the team site.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.yuque.com">https://www.yuque.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        /**
         * <p>The Yuque team access credential. This credential is used only for creation or updates and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Token")
        public String token;

        public static UpdateKnowledgeSourceRequestDocumentYuqueTeams build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocumentYuqueTeams self = new UpdateKnowledgeSourceRequestDocumentYuqueTeams();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocumentYuqueTeams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateKnowledgeSourceRequestDocumentYuqueTeams setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public UpdateKnowledgeSourceRequestDocumentYuqueTeams setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocumentYuque extends TeaModel {
        /**
         * <p>The Yuque team configuration. Each team independently selects the synchronization scope.</p>
         */
        @NameInMap("Teams")
        public java.util.List<UpdateKnowledgeSourceRequestDocumentYuqueTeams> teams;

        public static UpdateKnowledgeSourceRequestDocumentYuque build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocumentYuque self = new UpdateKnowledgeSourceRequestDocumentYuque();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocumentYuque setTeams(java.util.List<UpdateKnowledgeSourceRequestDocumentYuqueTeams> teams) {
            this.teams = teams;
            return this;
        }
        public java.util.List<UpdateKnowledgeSourceRequestDocumentYuqueTeams> getTeams() {
            return this.teams;
        }

    }

    public static class UpdateKnowledgeSourceRequestDocument extends TeaModel {
        /**
         * <p>The connector type. Valid values: DINGTALK, FEISHU, LARK, WECOM, and YUQUE. This value cannot be changed after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>WECOM</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <p>The DingTalk configuration. This parameter is present only when the connector type is DINGTALK.</p>
         */
        @NameInMap("DingTalk")
        public UpdateKnowledgeSourceRequestDocumentDingTalk dingTalk;

        /**
         * <p>The Feishu configuration. This parameter is present only when the connector type is FEISHU.</p>
         */
        @NameInMap("Feishu")
        public UpdateKnowledgeSourceRequestDocumentFeishu feishu;

        /**
         * <p>The Lark configuration. This parameter is present only when the connector type is LARK.</p>
         */
        @NameInMap("Lark")
        public UpdateKnowledgeSourceRequestDocumentLark lark;

        /**
         * <p>The WeCom configuration. This parameter is present only when the connector type is WECOM.</p>
         */
        @NameInMap("WeCom")
        public UpdateKnowledgeSourceRequestDocumentWeCom weCom;

        /**
         * <p>The Yuque configuration. This parameter is present only when the connector type is YUQUE.</p>
         */
        @NameInMap("Yuque")
        public UpdateKnowledgeSourceRequestDocumentYuque yuque;

        public static UpdateKnowledgeSourceRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestDocument self = new UpdateKnowledgeSourceRequestDocument();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestDocument setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public UpdateKnowledgeSourceRequestDocument setDingTalk(UpdateKnowledgeSourceRequestDocumentDingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }
        public UpdateKnowledgeSourceRequestDocumentDingTalk getDingTalk() {
            return this.dingTalk;
        }

        public UpdateKnowledgeSourceRequestDocument setFeishu(UpdateKnowledgeSourceRequestDocumentFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public UpdateKnowledgeSourceRequestDocumentFeishu getFeishu() {
            return this.feishu;
        }

        public UpdateKnowledgeSourceRequestDocument setLark(UpdateKnowledgeSourceRequestDocumentLark lark) {
            this.lark = lark;
            return this;
        }
        public UpdateKnowledgeSourceRequestDocumentLark getLark() {
            return this.lark;
        }

        public UpdateKnowledgeSourceRequestDocument setWeCom(UpdateKnowledgeSourceRequestDocumentWeCom weCom) {
            this.weCom = weCom;
            return this;
        }
        public UpdateKnowledgeSourceRequestDocumentWeCom getWeCom() {
            return this.weCom;
        }

        public UpdateKnowledgeSourceRequestDocument setYuque(UpdateKnowledgeSourceRequestDocumentYuque yuque) {
            this.yuque = yuque;
            return this;
        }
        public UpdateKnowledgeSourceRequestDocumentYuque getYuque() {
            return this.yuque;
        }

    }

    public static class UpdateKnowledgeSourceRequestProject extends TeaModel {
        /**
         * <p>Optional. Limits the read environment to Dev or Prod. If this parameter is not specified, cross-environment read access is not granted.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The DataWorks workspace ID, which is used to locate the source.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static UpdateKnowledgeSourceRequestProject build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceRequestProject self = new UpdateKnowledgeSourceRequestProject();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceRequestProject setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public UpdateKnowledgeSourceRequestProject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
