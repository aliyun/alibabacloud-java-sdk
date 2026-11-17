// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSourceResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public UpdateKnowledgeSourceResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. Use it to troubleshoot issues.</p>
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

    public static UpdateKnowledgeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSourceResponseBody self = new UpdateKnowledgeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateKnowledgeSourceResponseBody setData(UpdateKnowledgeSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateKnowledgeSourceResponseBodyData getData() {
        return this.data;
    }

    public UpdateKnowledgeSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateKnowledgeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKnowledgeSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateKnowledgeSourceResponseBodyDataDataSource extends TeaModel {
        /**
         * <p>The DataWorks data source ID. The server uses this ID to resolve the associated workspace, environment, and data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        public static UpdateKnowledgeSourceResponseBodyDataDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDataSource self = new UpdateKnowledgeSourceResponseBodyDataDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk extends TeaModel {
        /**
         * <p>The application ID of Feishu or Lark. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk self = new UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentFeishu extends TeaModel {
        /**
         * <p>The application ID of Feishu or Lark. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentFeishu build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentFeishu self = new UpdateKnowledgeSourceResponseBodyDataDocumentFeishu();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentFeishu setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentFeishu setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentLark extends TeaModel {
        /**
         * <p>The application ID of Feishu or Lark. This is not the AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>app-001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentLark build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentLark self = new UpdateKnowledgeSourceResponseBodyDataDocumentLark();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentLark setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentLark setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces extends TeaModel {
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
         * <p>R&amp;D knowledge</p>
         */
        @NameInMap("SpaceName")
        public String spaceName;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces self = new UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentWeCom extends TeaModel {
        /**
         * <p>The WeCom bot ID.</p>
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
        public java.util.List<UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces> spaces;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentWeCom build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentWeCom self = new UpdateKnowledgeSourceResponseBodyDataDocumentWeCom();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentWeCom setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentWeCom setSpaces(java.util.List<UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces> spaces) {
            this.spaces = spaces;
            return this;
        }
        public java.util.List<UpdateKnowledgeSourceResponseBodyDataDocumentWeComSpaces> getSpaces() {
            return this.spaces;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams extends TeaModel {
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
         * <p>The team ID verified by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("TeamId")
        public String teamId;

        /**
         * <p>The logon name of the team. This is read-only display information.</p>
         * 
         * <strong>example:</strong>
         * <p>example-team</p>
         */
        @NameInMap("TeamLogin")
        public String teamLogin;

        /**
         * <p>The name of the team. This is read-only display information.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample team</p>
         */
        @NameInMap("TeamName")
        public String teamName;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams self = new UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamLogin(String teamLogin) {
            this.teamLogin = teamLogin;
            return this;
        }
        public String getTeamLogin() {
            return this.teamLogin;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }
        public String getTeamName() {
            return this.teamName;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocumentYuque extends TeaModel {
        /**
         * <p>The Yuque team configuration. Each team independently selects the synchronization scope.</p>
         */
        @NameInMap("Teams")
        public java.util.List<UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams> teams;

        public static UpdateKnowledgeSourceResponseBodyDataDocumentYuque build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocumentYuque self = new UpdateKnowledgeSourceResponseBodyDataDocumentYuque();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocumentYuque setTeams(java.util.List<UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams> teams) {
            this.teams = teams;
            return this;
        }
        public java.util.List<UpdateKnowledgeSourceResponseBodyDataDocumentYuqueTeams> getTeams() {
            return this.teams;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataDocument extends TeaModel {
        /**
         * <p>The connector type. Valid values: DINGTALK, FEISHU, LARK, WECOM, and YUQUE. This value cannot be changed after creation.</p>
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
         * <p>The DingTalk configuration. This parameter is present only when the connector type is DINGTALK.</p>
         */
        @NameInMap("DingTalk")
        public UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk dingTalk;

        /**
         * <p>The Feishu configuration. This parameter is present only when the connector type is FEISHU.</p>
         */
        @NameInMap("Feishu")
        public UpdateKnowledgeSourceResponseBodyDataDocumentFeishu feishu;

        /**
         * <p>The Lark configuration. This parameter is present only when the connector type is LARK.</p>
         */
        @NameInMap("Lark")
        public UpdateKnowledgeSourceResponseBodyDataDocumentLark lark;

        /**
         * <p>The WeCom configuration. This parameter is present only when the connector type is WECOM.</p>
         */
        @NameInMap("WeCom")
        public UpdateKnowledgeSourceResponseBodyDataDocumentWeCom weCom;

        /**
         * <p>The Yuque configuration. This parameter is present only when the connector type is YUQUE.</p>
         */
        @NameInMap("Yuque")
        public UpdateKnowledgeSourceResponseBodyDataDocumentYuque yuque;

        public static UpdateKnowledgeSourceResponseBodyDataDocument build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataDocument self = new UpdateKnowledgeSourceResponseBodyDataDocument();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setCredentialConfigured(Boolean credentialConfigured) {
            this.credentialConfigured = credentialConfigured;
            return this;
        }
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setDingTalk(UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDocumentDingTalk getDingTalk() {
            return this.dingTalk;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setFeishu(UpdateKnowledgeSourceResponseBodyDataDocumentFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDocumentFeishu getFeishu() {
            return this.feishu;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setLark(UpdateKnowledgeSourceResponseBodyDataDocumentLark lark) {
            this.lark = lark;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDocumentLark getLark() {
            return this.lark;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setWeCom(UpdateKnowledgeSourceResponseBodyDataDocumentWeCom weCom) {
            this.weCom = weCom;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDocumentWeCom getWeCom() {
            return this.weCom;
        }

        public UpdateKnowledgeSourceResponseBodyDataDocument setYuque(UpdateKnowledgeSourceResponseBodyDataDocumentYuque yuque) {
            this.yuque = yuque;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDocumentYuque getYuque() {
            return this.yuque;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyDataProject extends TeaModel {
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

        public static UpdateKnowledgeSourceResponseBodyDataProject build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyDataProject self = new UpdateKnowledgeSourceResponseBodyDataProject();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyDataProject setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public UpdateKnowledgeSourceResponseBodyDataProject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdateKnowledgeSourceResponseBodyData extends TeaModel {
        /**
         * <p>The creation time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
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
         * <p>The data source information. This field is available only when Type is set to DATA_SOURCE.</p>
         */
        @NameInMap("DataSource")
        public UpdateKnowledgeSourceResponseBodyDataDataSource dataSource;

        /**
         * <p>The optional description of the purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The document information. This field is available only when Type is set to DOCUMENT.</p>
         */
        @NameInMap("Document")
        public UpdateKnowledgeSourceResponseBodyDataDocument document;

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
         * <p>The name users use to identify the source.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales Project</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The project information. This field is available only when Type is set to PROJECT.</p>
         */
        @NameInMap("Project")
        public UpdateKnowledgeSourceResponseBodyDataProject project;

        /**
         * <p>The stable source ID generated by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>src-001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The source type. Valid values: PROJECT (workspace), DATA_SOURCE (DataWorks data source), and DOCUMENT (external document source).</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSourceResponseBodyData self = new UpdateKnowledgeSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSourceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateKnowledgeSourceResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public UpdateKnowledgeSourceResponseBodyData setDataSource(UpdateKnowledgeSourceResponseBodyDataDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDataSource getDataSource() {
            return this.dataSource;
        }

        public UpdateKnowledgeSourceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeSourceResponseBodyData setDocument(UpdateKnowledgeSourceResponseBodyDataDocument document) {
            this.document = document;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataDocument getDocument() {
            return this.document;
        }

        public UpdateKnowledgeSourceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public UpdateKnowledgeSourceResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public UpdateKnowledgeSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeSourceResponseBodyData setProject(UpdateKnowledgeSourceResponseBodyDataProject project) {
            this.project = project;
            return this;
        }
        public UpdateKnowledgeSourceResponseBodyDataProject getProject() {
            return this.project;
        }

        public UpdateKnowledgeSourceResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public UpdateKnowledgeSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
