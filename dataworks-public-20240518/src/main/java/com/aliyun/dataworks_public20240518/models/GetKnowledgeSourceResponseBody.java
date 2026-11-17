// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeSourceResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when a request fails.</p>
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
    public GetKnowledgeSourceResponseBodyData data;

    /**
     * <p>The security error message returned when the request fails.</p>
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

    public static GetKnowledgeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeSourceResponseBody self = new GetKnowledgeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeSourceResponseBody setData(GetKnowledgeSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeSourceResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeSourceResponseBodyDataDataSource extends TeaModel {
        /**
         * <p>The DataWorks data source ID. The server uses this ID to resolve the associated workspace, environment, and data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        public static GetKnowledgeSourceResponseBodyDataDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDataSource self = new GetKnowledgeSourceResponseBodyDataDataSource();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentDingTalk extends TeaModel {
        /**
         * <p>The Feishu or Lark application ID. This is not the AppSecret.</p>
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

        public static GetKnowledgeSourceResponseBodyDataDocumentDingTalk build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentDingTalk self = new GetKnowledgeSourceResponseBodyDataDocumentDingTalk();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentDingTalk setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentDingTalk setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentFeishu extends TeaModel {
        /**
         * <p>The Feishu or Lark application ID. This is not the AppSecret.</p>
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

        public static GetKnowledgeSourceResponseBodyDataDocumentFeishu build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentFeishu self = new GetKnowledgeSourceResponseBodyDataDocumentFeishu();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentFeishu setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentFeishu setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentLark extends TeaModel {
        /**
         * <p>The Feishu or Lark application ID. This is not the AppSecret.</p>
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

        public static GetKnowledgeSourceResponseBodyDataDocumentLark build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentLark self = new GetKnowledgeSourceResponseBodyDataDocumentLark();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentLark setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentLark setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces extends TeaModel {
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

        public static GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces self = new GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentWeCom extends TeaModel {
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
        public java.util.List<GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces> spaces;

        public static GetKnowledgeSourceResponseBodyDataDocumentWeCom build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentWeCom self = new GetKnowledgeSourceResponseBodyDataDocumentWeCom();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentWeCom setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentWeCom setSpaces(java.util.List<GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces> spaces) {
            this.spaces = spaces;
            return this;
        }
        public java.util.List<GetKnowledgeSourceResponseBodyDataDocumentWeComSpaces> getSpaces() {
            return this.spaces;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams extends TeaModel {
        /**
         * <p>The team site address.</p>
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
         * <p>Sample team</p>
         */
        @NameInMap("TeamName")
        public String teamName;

        public static GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams self = new GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamLogin(String teamLogin) {
            this.teamLogin = teamLogin;
            return this;
        }
        public String getTeamLogin() {
            return this.teamLogin;
        }

        public GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }
        public String getTeamName() {
            return this.teamName;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocumentYuque extends TeaModel {
        /**
         * <p>The Yuque team configuration. Each team independently selects the synchronization scope.</p>
         */
        @NameInMap("Teams")
        public java.util.List<GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams> teams;

        public static GetKnowledgeSourceResponseBodyDataDocumentYuque build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocumentYuque self = new GetKnowledgeSourceResponseBodyDataDocumentYuque();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocumentYuque setTeams(java.util.List<GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams> teams) {
            this.teams = teams;
            return this;
        }
        public java.util.List<GetKnowledgeSourceResponseBodyDataDocumentYuqueTeams> getTeams() {
            return this.teams;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataDocument extends TeaModel {
        /**
         * <p>The connector type. Valid values: DINGTALK, FEISHU, LARK, WECOM, and YUQUE. The connector type cannot be changed after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>WECOM</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <p>Indicates whether the credentials required for the connector are configured. This is a read-only field and does not return the credential content or ciphertext.</p>
         */
        @NameInMap("CredentialConfigured")
        public Boolean credentialConfigured;

        /**
         * <p>The DingTalk configuration. This field exists only when the connector type is DingTalk.</p>
         */
        @NameInMap("DingTalk")
        public GetKnowledgeSourceResponseBodyDataDocumentDingTalk dingTalk;

        /**
         * <p>The Feishu configuration. This field exists only when the connector type is Feishu.</p>
         */
        @NameInMap("Feishu")
        public GetKnowledgeSourceResponseBodyDataDocumentFeishu feishu;

        /**
         * <p>The Lark configuration. This field exists only when the connector type is Lark.</p>
         */
        @NameInMap("Lark")
        public GetKnowledgeSourceResponseBodyDataDocumentLark lark;

        /**
         * <p>The WeCom configuration. This field exists only when the connector type is WeCom.</p>
         */
        @NameInMap("WeCom")
        public GetKnowledgeSourceResponseBodyDataDocumentWeCom weCom;

        /**
         * <p>The Yuque configuration. This field exists only when the connector type is Yuque.</p>
         */
        @NameInMap("Yuque")
        public GetKnowledgeSourceResponseBodyDataDocumentYuque yuque;

        public static GetKnowledgeSourceResponseBodyDataDocument build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataDocument self = new GetKnowledgeSourceResponseBodyDataDocument();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataDocument setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public GetKnowledgeSourceResponseBodyDataDocument setCredentialConfigured(Boolean credentialConfigured) {
            this.credentialConfigured = credentialConfigured;
            return this;
        }
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        public GetKnowledgeSourceResponseBodyDataDocument setDingTalk(GetKnowledgeSourceResponseBodyDataDocumentDingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDocumentDingTalk getDingTalk() {
            return this.dingTalk;
        }

        public GetKnowledgeSourceResponseBodyDataDocument setFeishu(GetKnowledgeSourceResponseBodyDataDocumentFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDocumentFeishu getFeishu() {
            return this.feishu;
        }

        public GetKnowledgeSourceResponseBodyDataDocument setLark(GetKnowledgeSourceResponseBodyDataDocumentLark lark) {
            this.lark = lark;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDocumentLark getLark() {
            return this.lark;
        }

        public GetKnowledgeSourceResponseBodyDataDocument setWeCom(GetKnowledgeSourceResponseBodyDataDocumentWeCom weCom) {
            this.weCom = weCom;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDocumentWeCom getWeCom() {
            return this.weCom;
        }

        public GetKnowledgeSourceResponseBodyDataDocument setYuque(GetKnowledgeSourceResponseBodyDataDocumentYuque yuque) {
            this.yuque = yuque;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDocumentYuque getYuque() {
            return this.yuque;
        }

    }

    public static class GetKnowledgeSourceResponseBodyDataProject extends TeaModel {
        /**
         * <p>The optional environment type that restricts read access to Dev or Prod. If this field is not specified, it does not mean that cross-environment read access is granted.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The DataWorks workspace ID. This is a source location field.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetKnowledgeSourceResponseBodyDataProject build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyDataProject self = new GetKnowledgeSourceResponseBodyDataProject();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyDataProject setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetKnowledgeSourceResponseBodyDataProject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetKnowledgeSourceResponseBodyData extends TeaModel {
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
         * <p>The data source information. This field exists only when Type is set to DATA_SOURCE.</p>
         */
        @NameInMap("DataSource")
        public GetKnowledgeSourceResponseBodyDataDataSource dataSource;

        /**
         * <p>The optional description of the purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The document information. This field exists only when Type is set to DOCUMENT.</p>
         */
        @NameInMap("Document")
        public GetKnowledgeSourceResponseBodyDataDocument document;

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
         * <p>The name used by users to identify the source.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales topic project</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The project information. This field exists only when Type is set to PROJECT.</p>
         */
        @NameInMap("Project")
        public GetKnowledgeSourceResponseBodyDataProject project;

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

        public static GetKnowledgeSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeSourceResponseBodyData self = new GetKnowledgeSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeSourceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetKnowledgeSourceResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetKnowledgeSourceResponseBodyData setDataSource(GetKnowledgeSourceResponseBodyDataDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDataSource getDataSource() {
            return this.dataSource;
        }

        public GetKnowledgeSourceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgeSourceResponseBodyData setDocument(GetKnowledgeSourceResponseBodyDataDocument document) {
            this.document = document;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataDocument getDocument() {
            return this.document;
        }

        public GetKnowledgeSourceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgeSourceResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetKnowledgeSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeSourceResponseBodyData setProject(GetKnowledgeSourceResponseBodyDataProject project) {
            this.project = project;
            return this;
        }
        public GetKnowledgeSourceResponseBodyDataProject getProject() {
            return this.project;
        }

        public GetKnowledgeSourceResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetKnowledgeSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
