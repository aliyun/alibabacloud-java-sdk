// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeSourcesResponseBody extends TeaModel {
    /**
     * <p>The business error code. This code is used to determine the error type when the request fails.</p>
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
    public ListKnowledgeSourcesResponseBodyData data;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

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

    public static ListKnowledgeSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeSourcesResponseBody self = new ListKnowledgeSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeSourcesResponseBody setData(ListKnowledgeSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeSourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDataSource extends TeaModel {
        /**
         * <p>The ID of the DataWorks data source. The server uses this ID to resolve the workspace, environment, and data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        public static ListKnowledgeSourcesResponseBodyDataSourcesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDataSource self = new ListKnowledgeSourcesResponseBodyDataSourcesDataSource();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk extends TeaModel {
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

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu extends TeaModel {
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

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark extends TeaModel {
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

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces extends TeaModel {
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

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom extends TeaModel {
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
        public java.util.List<ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces> spaces;

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom setSpaces(java.util.List<ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces> spaces) {
            this.spaces = spaces;
            return this;
        }
        public java.util.List<ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeComSpaces> getSpaces() {
            return this.spaces;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams extends TeaModel {
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

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams setTeamLogin(String teamLogin) {
            this.teamLogin = teamLogin;
            return this;
        }
        public String getTeamLogin() {
            return this.teamLogin;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }
        public String getTeamName() {
            return this.teamName;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque extends TeaModel {
        /**
         * <p>The Yuque team configurations. Each team independently selects the synchronization scope.</p>
         */
        @NameInMap("Teams")
        public java.util.List<ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams> teams;

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque self = new ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque setTeams(java.util.List<ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams> teams) {
            this.teams = teams;
            return this;
        }
        public java.util.List<ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuqueTeams> getTeams() {
            return this.teams;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesDocument extends TeaModel {
        /**
         * <p>The connector type. Valid values: DINGTALK, FEISHU, LARK, WECOM, or YUQUE. The connector type cannot be changed after the source is created.</p>
         * 
         * <strong>example:</strong>
         * <p>WECOM</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <p>Indicates whether the credentials required by the connector are configured. This field is read-only, and the credential content or ciphertext is not returned.</p>
         */
        @NameInMap("CredentialConfigured")
        public Boolean credentialConfigured;

        /**
         * <p>The DingTalk configuration. This field is available only when the connector type is DingTalk.</p>
         */
        @NameInMap("DingTalk")
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk dingTalk;

        /**
         * <p>The Feishu configuration. This field is available only when the connector type is Feishu.</p>
         */
        @NameInMap("Feishu")
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu feishu;

        /**
         * <p>The Lark configuration. This field is available only when the connector type is Lark.</p>
         */
        @NameInMap("Lark")
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark lark;

        /**
         * <p>The WeCom configuration. This field is available only when the connector type is WeCom.</p>
         */
        @NameInMap("WeCom")
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom weCom;

        /**
         * <p>The Yuque configuration. This field is available only when the connector type is Yuque.</p>
         */
        @NameInMap("Yuque")
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque yuque;

        public static ListKnowledgeSourcesResponseBodyDataSourcesDocument build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesDocument self = new ListKnowledgeSourcesResponseBodyDataSourcesDocument();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setCredentialConfigured(Boolean credentialConfigured) {
            this.credentialConfigured = credentialConfigured;
            return this;
        }
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setDingTalk(ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentDingTalk getDingTalk() {
            return this.dingTalk;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setFeishu(ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentFeishu getFeishu() {
            return this.feishu;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setLark(ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark lark) {
            this.lark = lark;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentLark getLark() {
            return this.lark;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setWeCom(ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom weCom) {
            this.weCom = weCom;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentWeCom getWeCom() {
            return this.weCom;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesDocument setYuque(ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque yuque) {
            this.yuque = yuque;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDocumentYuque getYuque() {
            return this.yuque;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSourcesProject extends TeaModel {
        /**
         * <p>The environment type. This optional field restricts the read environment to Dev or Prod. If this field is not specified, it does not mean that you have the permissions to read both environments.</p>
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

        public static ListKnowledgeSourcesResponseBodyDataSourcesProject build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSourcesProject self = new ListKnowledgeSourcesResponseBodyDataSourcesProject();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesProject setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListKnowledgeSourcesResponseBodyDataSourcesProject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyDataSources extends TeaModel {
        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
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
        public ListKnowledgeSourcesResponseBodyDataSourcesDataSource dataSource;

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
        public ListKnowledgeSourcesResponseBodyDataSourcesDocument document;

        /**
         * <p>The ID of the knowledge base to which the source belongs. The source cannot be migrated to another knowledge base after it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The last modification time. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>Sales Topic Project</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The project information. This field is available only when Type is set to PROJECT.</p>
         */
        @NameInMap("Project")
        public ListKnowledgeSourcesResponseBodyDataSourcesProject project;

        /**
         * <p>The stable source ID generated by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>src-001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The source type. Valid values: PROJECT (workspace), DATA_SOURCE (DataWorks data source), or DOCUMENT (external document source).</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListKnowledgeSourcesResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyDataSources self = new ListKnowledgeSourcesResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyDataSources setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setDataSource(ListKnowledgeSourcesResponseBodyDataSourcesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setDocument(ListKnowledgeSourcesResponseBodyDataSourcesDocument document) {
            this.document = document;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesDocument getDocument() {
            return this.document;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setProject(ListKnowledgeSourcesResponseBodyDataSourcesProject project) {
            this.project = project;
            return this;
        }
        public ListKnowledgeSourcesResponseBodyDataSourcesProject getProject() {
            return this.project;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListKnowledgeSourcesResponseBodyDataSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListKnowledgeSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The pagination token for the next page. If no next page exists, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The knowledge sources that you have permission to read on the current page.</p>
         */
        @NameInMap("Sources")
        public java.util.List<ListKnowledgeSourcesResponseBodyDataSources> sources;

        public static ListKnowledgeSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeSourcesResponseBodyData self = new ListKnowledgeSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeSourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListKnowledgeSourcesResponseBodyData setSources(java.util.List<ListKnowledgeSourcesResponseBodyDataSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<ListKnowledgeSourcesResponseBodyDataSources> getSources() {
            return this.sources;
        }

    }

}
