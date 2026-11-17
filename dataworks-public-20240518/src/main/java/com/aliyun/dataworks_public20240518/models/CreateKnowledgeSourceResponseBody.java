// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSourceResponseBody extends TeaModel {
    /**
     * <p>The business error code. It is used to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned upon success.</p>
     */
    @NameInMap("Data")
    public CreateKnowledgeSourceResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateKnowledgeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSourceResponseBody self = new CreateKnowledgeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeSourceResponseBody setData(CreateKnowledgeSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKnowledgeSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateKnowledgeSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateKnowledgeSourceResponseBodyDataDataSource extends TeaModel {
        /**
         * <p>The ID of the DataWorks data source. The server uses this ID to resolve the associated workspace, environment, and data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        public static CreateKnowledgeSourceResponseBodyDataDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDataSource self = new CreateKnowledgeSourceResponseBodyDataDataSource();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentDingTalk extends TeaModel {
        /**
         * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static CreateKnowledgeSourceResponseBodyDataDocumentDingTalk build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentDingTalk self = new CreateKnowledgeSourceResponseBodyDataDocumentDingTalk();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentDingTalk setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentDingTalk setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentFeishu extends TeaModel {
        /**
         * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static CreateKnowledgeSourceResponseBodyDataDocumentFeishu build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentFeishu self = new CreateKnowledgeSourceResponseBodyDataDocumentFeishu();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentFeishu setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentFeishu setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentLark extends TeaModel {
        /**
         * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static CreateKnowledgeSourceResponseBodyDataDocumentLark build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentLark self = new CreateKnowledgeSourceResponseBodyDataDocumentLark();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentLark setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentLark setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces extends TeaModel {
        /**
         * <p>The identity of the shared space.</p>
         * 
         * <strong>example:</strong>
         * <p>space-001</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        /**
         * <p>The display name verified by the server. This field is not used for identity verification.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Knowledge</p>
         */
        @NameInMap("SpaceName")
        public String spaceName;

        public static CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces self = new CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentWeCom extends TeaModel {
        /**
         * <p>The ID of the WeCom bot.</p>
         * 
         * <strong>example:</strong>
         * <p>bot-001</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>The selected shared spaces, including their identities and display names.</p>
         */
        @NameInMap("Spaces")
        public java.util.List<CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces> spaces;

        public static CreateKnowledgeSourceResponseBodyDataDocumentWeCom build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentWeCom self = new CreateKnowledgeSourceResponseBodyDataDocumentWeCom();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentWeCom setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentWeCom setSpaces(java.util.List<CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces> spaces) {
            this.spaces = spaces;
            return this;
        }
        public java.util.List<CreateKnowledgeSourceResponseBodyDataDocumentWeComSpaces> getSpaces() {
            return this.spaces;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams extends TeaModel {
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
         * <p>The team ID verified by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("TeamId")
        public String teamId;

        /**
         * <p>The team logon name. This is read-only display information.</p>
         * 
         * <strong>example:</strong>
         * <p>example-team</p>
         */
        @NameInMap("TeamLogin")
        public String teamLogin;

        /**
         * <p>The team name. This is read-only display information.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample Team</p>
         */
        @NameInMap("TeamName")
        public String teamName;

        public static CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams self = new CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamLogin(String teamLogin) {
            this.teamLogin = teamLogin;
            return this;
        }
        public String getTeamLogin() {
            return this.teamLogin;
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }
        public String getTeamName() {
            return this.teamName;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocumentYuque extends TeaModel {
        /**
         * <p>The Yuque team configurations. Each team independently selects the synchronization scope.</p>
         */
        @NameInMap("Teams")
        public java.util.List<CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams> teams;

        public static CreateKnowledgeSourceResponseBodyDataDocumentYuque build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocumentYuque self = new CreateKnowledgeSourceResponseBodyDataDocumentYuque();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocumentYuque setTeams(java.util.List<CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams> teams) {
            this.teams = teams;
            return this;
        }
        public java.util.List<CreateKnowledgeSourceResponseBodyDataDocumentYuqueTeams> getTeams() {
            return this.teams;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataDocument extends TeaModel {
        /**
         * <p>The type of the connector. Valid values: DINGTALK, FEISHU, LARK, WECOM, and YUQUE. The connector type cannot be changed after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>WECOM</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <p>Indicates whether the credentials required for the connector are configured. This field is read-only and does not return the credential content or ciphertext.</p>
         */
        @NameInMap("CredentialConfigured")
        public Boolean credentialConfigured;

        /**
         * <p>The DingTalk configuration. This parameter is available only when ConnectorType is set to DINGTALK.</p>
         */
        @NameInMap("DingTalk")
        public CreateKnowledgeSourceResponseBodyDataDocumentDingTalk dingTalk;

        /**
         * <p>The Feishu configuration. This parameter is available only when ConnectorType is set to FEISHU.</p>
         */
        @NameInMap("Feishu")
        public CreateKnowledgeSourceResponseBodyDataDocumentFeishu feishu;

        /**
         * <p>The Lark configuration. This parameter is available only when ConnectorType is set to LARK.</p>
         */
        @NameInMap("Lark")
        public CreateKnowledgeSourceResponseBodyDataDocumentLark lark;

        /**
         * <p>The WeCom configuration. This parameter is available only when ConnectorType is set to WECOM.</p>
         */
        @NameInMap("WeCom")
        public CreateKnowledgeSourceResponseBodyDataDocumentWeCom weCom;

        /**
         * <p>The Yuque configuration. This parameter is available only when ConnectorType is set to YUQUE.</p>
         */
        @NameInMap("Yuque")
        public CreateKnowledgeSourceResponseBodyDataDocumentYuque yuque;

        public static CreateKnowledgeSourceResponseBodyDataDocument build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataDocument self = new CreateKnowledgeSourceResponseBodyDataDocument();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setCredentialConfigured(Boolean credentialConfigured) {
            this.credentialConfigured = credentialConfigured;
            return this;
        }
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setDingTalk(CreateKnowledgeSourceResponseBodyDataDocumentDingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDocumentDingTalk getDingTalk() {
            return this.dingTalk;
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setFeishu(CreateKnowledgeSourceResponseBodyDataDocumentFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDocumentFeishu getFeishu() {
            return this.feishu;
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setLark(CreateKnowledgeSourceResponseBodyDataDocumentLark lark) {
            this.lark = lark;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDocumentLark getLark() {
            return this.lark;
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setWeCom(CreateKnowledgeSourceResponseBodyDataDocumentWeCom weCom) {
            this.weCom = weCom;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDocumentWeCom getWeCom() {
            return this.weCom;
        }

        public CreateKnowledgeSourceResponseBodyDataDocument setYuque(CreateKnowledgeSourceResponseBodyDataDocumentYuque yuque) {
            this.yuque = yuque;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDocumentYuque getYuque() {
            return this.yuque;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyDataProject extends TeaModel {
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

        public static CreateKnowledgeSourceResponseBodyDataProject build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyDataProject self = new CreateKnowledgeSourceResponseBodyDataProject();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyDataProject setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateKnowledgeSourceResponseBodyDataProject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class CreateKnowledgeSourceResponseBodyData extends TeaModel {
        /**
         * <p>The creation time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator. This field is written by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>This field is present only when Type is DATA_SOURCE.</p>
         */
        @NameInMap("DataSource")
        public CreateKnowledgeSourceResponseBodyDataDataSource dataSource;

        /**
         * <p>The description of the source’s purpose. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This field is present only when Type is DOCUMENT.</p>
         */
        @NameInMap("Document")
        public CreateKnowledgeSourceResponseBodyDataDocument document;

        /**
         * <p>The ID of the knowledge base to which the source belongs. The source cannot be migrated to another knowledge base after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The last modification time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200300000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name used to identify the source.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales topic project</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This field is present only when Type is PROJECT.</p>
         */
        @NameInMap("Project")
        public CreateKnowledgeSourceResponseBodyDataProject project;

        /**
         * <p>The stable source ID generated by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>src-001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The type of the source. Valid values: PROJECT (workspace), DATA_SOURCE (DataWorks data source), and DOCUMENT (external document source).</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateKnowledgeSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeSourceResponseBodyData self = new CreateKnowledgeSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeSourceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateKnowledgeSourceResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public CreateKnowledgeSourceResponseBodyData setDataSource(CreateKnowledgeSourceResponseBodyDataDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDataSource getDataSource() {
            return this.dataSource;
        }

        public CreateKnowledgeSourceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeSourceResponseBodyData setDocument(CreateKnowledgeSourceResponseBodyDataDocument document) {
            this.document = document;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataDocument getDocument() {
            return this.document;
        }

        public CreateKnowledgeSourceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public CreateKnowledgeSourceResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateKnowledgeSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeSourceResponseBodyData setProject(CreateKnowledgeSourceResponseBodyDataProject project) {
            this.project = project;
            return this;
        }
        public CreateKnowledgeSourceResponseBodyDataProject getProject() {
            return this.project;
        }

        public CreateKnowledgeSourceResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public CreateKnowledgeSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
