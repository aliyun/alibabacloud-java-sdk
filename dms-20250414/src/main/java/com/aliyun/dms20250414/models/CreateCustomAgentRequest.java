// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateCustomAgentRequest extends TeaModel {
    /**
     * <p>The type of the custom agent. Valid values:</p>
     * <ul>
     * <li>Default: the system-built-in custom agent. Each workspace can have at most one Default agent, and it cannot be deleted.</li>
     * <li>Common: a regular custom agent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Common</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The callback feature configuration.</p>
     */
    @NameInMap("CallbackConfig")
    public CreateCustomAgentRequestCallbackConfig callbackConfig;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The specified data scope, in <strong>JSON character string format</strong>.</p>
     * <ul>
     * <li>General parameter descriptions<ul>
     * <li>tableFlag: true specifies the data scope.</li>
     * <li>scope: personal is a fixed value.</li>
     * <li>personal: the parameters for file and database types.</li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>File type</strong>: pass parameters in the following format:</p>
     * <ul>
     * <li>DataSourceType: remote_data_center is a fixed value.</li>
     * <li>FileId: the file ID.</li>
     * <li>Database: the database name returned by the ListDataCenterTable operation, which is usually the file name.</li>
     * <li>Tables: the table names returned by the ListDataCenterTable operation.</li>
     * <li>TableIds: the table IDs returned by the ListDataCenterTable operation.</li>
     * <li>RegionId: the current region.</li>
     * </ul>
     * <pre><code>{
     *   &quot;tableFlag&quot;: true,
     *   &quot;scope&quot;: &quot;personal&quot;,
     *   &quot;personal&quot;: {
     *     &quot;DataSourceType&quot;: &quot;remote_data_center&quot;,
     *     &quot;FileId&quot;: &quot;f-f0jksn001ibmkoo********6v2zn6&quot;,
     *     &quot;Database&quot;: &quot;diamonds.csv&quot;,
     *     &quot;Tables&quot;: [
     *       &quot;diamonds&quot;
     *     ],
     *     &quot;TableIds&quot;: [
     *       &quot;35hfn94pxl********50pi&quot;
     *     ],
     *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
     *   }
     * }
     * </code></pre>
     * <p><strong>Database type</strong>: pass parameters in the following format:</p>
     * <ul>
     * <li>DataSourceType: database is a fixed value.</li>
     * <li>DmsInstanceId: the DMS instance ID returned by the data center API.</li>
     * <li>DmsDatabaseId: the DMS database ID returned by the data center API.</li>
     * <li>FileId: the instance name (<strong>[Deprecated]</strong>).</li>
     * <li>DbName: the database name returned by the data center API.</li>
     * <li>Database: the database name returned by the data center API.</li>
     * <li>Tables: the table names returned by the data center API.</li>
     * <li>TableIds: the table IDs returned by the data center API.</li>
     * <li>Engine: the database engine type, such as mysql or postgresql.</li>
     * <li>RegionId: the current region.</li>
     * </ul>
     * <pre><code>{
     *   &quot;tableFlag&quot;: true,
     *   &quot;scope&quot;: &quot;personal&quot;,
     *   &quot;personal&quot;: {
     *     &quot;DataSourceType&quot;: &quot;database&quot;,
     *     &quot;DmsInstanceId&quot;: &quot;284***8&quot;,
     *     &quot;DmsDatabaseId&quot;: &quot;769***45&quot;,
     *     &quot;FileId&quot;: &quot;pgm-bp15095e*******6t&quot;,
     *     &quot;DbName&quot;: &quot;pg_catalog&quot;,
     *     &quot;Database&quot;: &quot;pg_catalog&quot;,
     *     &quot;Tables&quot;: [
     *       &quot;pg_aggregate&quot;
     *     ],
     *     &quot;TableIds&quot;: [
     *       &quot;5263****31&quot;
     *     ],
     *     &quot;Engine&quot;: &quot;postgresql&quot;,
     *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
     *   }
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;tableFlag&quot; : true,
     *   &quot;scope&quot; : &quot;personal&quot;,
     *   &quot;personal&quot; : {
     *     &quot;DataSourceType&quot; : &quot;remote_data_center&quot;,
     *     &quot;FileId&quot; : &quot;f-5qlrwaw10<strong><strong><strong><strong>s3gpw1z&quot;,
     *     &quot;Database&quot; : &quot;Test table</strong></strong></strong>.xlsx&quot;,
     *     &quot;Tables&quot; : [ &quot;Sheet1&quot; ],
     *     &quot;TableIds&quot; : [ &quot;</strong>****&quot; ],
     *     &quot;RegionId&quot; : &quot;cn-hangzhou&quot;
     *   }
     * }</p>
     */
    @NameInMap("DataJson")
    public String dataJson;

    /**
     * <p>The description of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution configuration.</p>
     */
    @NameInMap("ExecutionConfig")
    public CreateCustomAgentRequestExecutionConfig executionConfig;

    /**
     * <p>The instructions.</p>
     * <ul>
     * <li>Input limit: up to 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Core metric definitions:</p>
     * <ol>
     * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including both paid and unpaid orders.</li>
     * <li>Order volume refers to the number of valid daily orders.</li>
     * <li>UV (Unique Visitors) refers to the number of deduplicated users visiting the website or app.</li>
     * <li>Conversion rate = Paid orders / UV, reflecting the traffic conversion efficiency</li>
     * </ol>
     */
    @NameInMap("Instruction")
    public String instruction;

    /**
     * <p>The knowledge.</p>
     * <ul>
     * <li>Input limit: up to 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Core metric definitions:</p>
     * <ol>
     * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including both paid and unpaid orders.</li>
     * <li>Order volume refers to the number of valid daily orders.</li>
     * <li>UV (Unique Visitors) refers to the number of deduplicated users visiting the website or app.</li>
     * <li>Conversion rate = Paid orders / UV, reflecting the traffic conversion efficiency</li>
     * </ol>
     */
    @NameInMap("Knowledge")
    public String knowledge;

    /**
     * <p>The external knowledge bases.</p>
     */
    @NameInMap("KnowledgeConfigList")
    public java.util.List<CreateCustomAgentRequestKnowledgeConfigList> knowledgeConfigList;

    /**
     * <p>The knowledge semantic configuration list.</p>
     */
    @NameInMap("KnowledgeSemanticConfigList")
    public java.util.List<CreateCustomAgentRequestKnowledgeSemanticConfigList> knowledgeSemanticConfigList;

    /**
     * <p>The name of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent test name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of recommended questions.</p>
     * <ul>
     * <li>You can configure up to 10 recommended questions.</li>
     * </ul>
     */
    @NameInMap("RecommendQuestionList")
    public java.util.List<String> recommendQuestionList;

    /**
     * <p>The ID of the referenced historical session.</p>
     * 
     * <strong>example:</strong>
     * <p>99crainsjnveo*******vynid</p>
     */
    @NameInMap("RelatedSessionId")
    public String relatedSessionId;

    /**
     * <p>The scheduled task configuration.</p>
     */
    @NameInMap("ScheduleTaskConfig")
    public CreateCustomAgentRequestScheduleTaskConfig scheduleTaskConfig;

    /**
     * <p>The text report format.</p>
     * 
     * <strong>example:</strong>
     * <p>The text report requires that all numbers be written as Chinese numerals instead of Arabic numerals</p>
     */
    @NameInMap("TextReportConfig")
    public String textReportConfig;

    /**
     * <p>The list of user-specified skills.</p>
     */
    @NameInMap("UserSpecifiedSkillList")
    public java.util.List<String> userSpecifiedSkillList;

    /**
     * <p>The web report format.</p>
     * 
     * <strong>example:</strong>
     * <p>The web report requires that all numbers be written as Chinese numerals instead of Arabic numerals</p>
     */
    @NameInMap("WebReportConfig")
    public String webReportConfig;

    /**
     * <p>The web report theme.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("WebReportTheme")
    public String webReportTheme;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>56kv1pvl9uvt9**********bb</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentRequest self = new CreateCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public CreateCustomAgentRequest setCallbackConfig(CreateCustomAgentRequestCallbackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public CreateCustomAgentRequestCallbackConfig getCallbackConfig() {
        return this.callbackConfig;
    }

    public CreateCustomAgentRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateCustomAgentRequest setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

    public CreateCustomAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomAgentRequest setExecutionConfig(CreateCustomAgentRequestExecutionConfig executionConfig) {
        this.executionConfig = executionConfig;
        return this;
    }
    public CreateCustomAgentRequestExecutionConfig getExecutionConfig() {
        return this.executionConfig;
    }

    public CreateCustomAgentRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public CreateCustomAgentRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

    public CreateCustomAgentRequest setKnowledgeConfigList(java.util.List<CreateCustomAgentRequestKnowledgeConfigList> knowledgeConfigList) {
        this.knowledgeConfigList = knowledgeConfigList;
        return this;
    }
    public java.util.List<CreateCustomAgentRequestKnowledgeConfigList> getKnowledgeConfigList() {
        return this.knowledgeConfigList;
    }

    public CreateCustomAgentRequest setKnowledgeSemanticConfigList(java.util.List<CreateCustomAgentRequestKnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
        this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
        return this;
    }
    public java.util.List<CreateCustomAgentRequestKnowledgeSemanticConfigList> getKnowledgeSemanticConfigList() {
        return this.knowledgeSemanticConfigList;
    }

    public CreateCustomAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomAgentRequest setRecommendQuestionList(java.util.List<String> recommendQuestionList) {
        this.recommendQuestionList = recommendQuestionList;
        return this;
    }
    public java.util.List<String> getRecommendQuestionList() {
        return this.recommendQuestionList;
    }

    public CreateCustomAgentRequest setRelatedSessionId(String relatedSessionId) {
        this.relatedSessionId = relatedSessionId;
        return this;
    }
    public String getRelatedSessionId() {
        return this.relatedSessionId;
    }

    public CreateCustomAgentRequest setScheduleTaskConfig(CreateCustomAgentRequestScheduleTaskConfig scheduleTaskConfig) {
        this.scheduleTaskConfig = scheduleTaskConfig;
        return this;
    }
    public CreateCustomAgentRequestScheduleTaskConfig getScheduleTaskConfig() {
        return this.scheduleTaskConfig;
    }

    public CreateCustomAgentRequest setTextReportConfig(String textReportConfig) {
        this.textReportConfig = textReportConfig;
        return this;
    }
    public String getTextReportConfig() {
        return this.textReportConfig;
    }

    public CreateCustomAgentRequest setUserSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
        this.userSpecifiedSkillList = userSpecifiedSkillList;
        return this;
    }
    public java.util.List<String> getUserSpecifiedSkillList() {
        return this.userSpecifiedSkillList;
    }

    public CreateCustomAgentRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    public CreateCustomAgentRequest setWebReportTheme(String webReportTheme) {
        this.webReportTheme = webReportTheme;
        return this;
    }
    public String getWebReportTheme() {
        return this.webReportTheme;
    }

    public CreateCustomAgentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateCustomAgentRequestCallbackConfig extends TeaModel {
        /**
         * <p>The parameters to invoke the callback tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("CallbackArgs")
        public String callbackArgs;

        /**
         * <p>The prompt for generating the parameters to invoke the callback tool.</p>
         * 
         * <strong>example:</strong>
         * <p>send web report to <a href="mailto:123456@163.com">123456@163.com</a></p>
         */
        @NameInMap("CallbackPrompt")
        public String callbackPrompt;

        /**
         * <p>The timing to invoke the callback tool.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallbackTime")
        public Integer callbackTime;

        /**
         * <p>The callback tool identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>Mcp serverId (6te...g7a)</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        /**
         * <p>The callback tool type.</p>
         * 
         * <strong>example:</strong>
         * <p>Mcp</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateCustomAgentRequestCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestCallbackConfig self = new CreateCustomAgentRequestCallbackConfig();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestCallbackConfig setCallbackArgs(String callbackArgs) {
            this.callbackArgs = callbackArgs;
            return this;
        }
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        public CreateCustomAgentRequestCallbackConfig setCallbackPrompt(String callbackPrompt) {
            this.callbackPrompt = callbackPrompt;
            return this;
        }
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        public CreateCustomAgentRequestCallbackConfig setCallbackTime(Integer callbackTime) {
            this.callbackTime = callbackTime;
            return this;
        }
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        public CreateCustomAgentRequestCallbackConfig setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public CreateCustomAgentRequestCallbackConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentRequestExecutionConfig extends TeaModel {
        /**
         * <p>Specifies whether to prohibit appending data sources in a session.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForbiddenAppendDataSource")
        public Boolean forbiddenAppendDataSource;

        /**
         * <p>Specifies whether to prohibit user inquiries during the process.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipAskHuman")
        public Boolean skipAskHuman;

        /**
         * <p>Specifies whether to skip the plan confirmation step.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipPlan")
        public Boolean skipPlan;

        /**
         * <p>Specifies whether to skip all SQL confirmations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipSqlConfirm")
        public Boolean skipSqlConfirm;

        /**
         * <p>Specifies whether to skip the confirmation for generating a web report.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipWebReportConfirm")
        public Boolean skipWebReportConfirm;

        public static CreateCustomAgentRequestExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestExecutionConfig self = new CreateCustomAgentRequestExecutionConfig();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestExecutionConfig setForbiddenAppendDataSource(Boolean forbiddenAppendDataSource) {
            this.forbiddenAppendDataSource = forbiddenAppendDataSource;
            return this;
        }
        public Boolean getForbiddenAppendDataSource() {
            return this.forbiddenAppendDataSource;
        }

        public CreateCustomAgentRequestExecutionConfig setSkipAskHuman(Boolean skipAskHuman) {
            this.skipAskHuman = skipAskHuman;
            return this;
        }
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        public CreateCustomAgentRequestExecutionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        public CreateCustomAgentRequestExecutionConfig setSkipSqlConfirm(Boolean skipSqlConfirm) {
            this.skipSqlConfirm = skipSqlConfirm;
            return this;
        }
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        public CreateCustomAgentRequestExecutionConfig setSkipWebReportConfirm(Boolean skipWebReportConfirm) {
            this.skipWebReportConfirm = skipWebReportConfirm;
            return this;
        }
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

    }

    public static class CreateCustomAgentRequestKnowledgeConfigList extends TeaModel {
        /**
         * <p>The access type. If you do not specify this parameter, the default value is mcp. Valid values:</p>
         * <ul>
         * <li>mcp: access through MCP. You must pass the McpServerId parameter.</li>
         * <li>dms_kb: access through DMS knowledge base. You must pass the KbUuid parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-HZ-6anhdzx7hddf9*******obx</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nhdpt9adf6ac**********ca</p>
         */
        @NameInMap("McpServerId")
        public String mcpServerId;

        public static CreateCustomAgentRequestKnowledgeConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestKnowledgeConfigList self = new CreateCustomAgentRequestKnowledgeConfigList();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestKnowledgeConfigList setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public CreateCustomAgentRequestKnowledgeConfigList setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public CreateCustomAgentRequestKnowledgeConfigList setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

    }

    public static class CreateCustomAgentRequestKnowledgeSemanticConfigList extends TeaModel {
        /**
         * <p>The DMS database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81512473</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The DMS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1532071</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The knowledge UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ca8f50d782*******02e87</p>
         */
        @NameInMap("KnowledgeUuid")
        public String knowledgeUuid;

        /**
         * <p>The knowledge semantic type. Valid values:</p>
         * <ul>
         * <li>sql_template: SQL template.</li>
         * <li>ossie_model: Ossie semantic view.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sql_template</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateCustomAgentRequestKnowledgeSemanticConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestKnowledgeSemanticConfigList self = new CreateCustomAgentRequestKnowledgeSemanticConfigList();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestKnowledgeSemanticConfigList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public CreateCustomAgentRequestKnowledgeSemanticConfigList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateCustomAgentRequestKnowledgeSemanticConfigList setKnowledgeUuid(String knowledgeUuid) {
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }
        public String getKnowledgeUuid() {
            return this.knowledgeUuid;
        }

        public CreateCustomAgentRequestKnowledgeSemanticConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentRequestScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for time-based scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The query for the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze this data and provide a brief report</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of the referenced historical session.</p>
         * 
         * <strong>example:</strong>
         * <p>4m24*****mg7j2v</p>
         */
        @NameInMap("RelatedSessionId")
        public String relatedSessionId;

        public static CreateCustomAgentRequestScheduleTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestScheduleTaskConfig self = new CreateCustomAgentRequestScheduleTaskConfig();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestScheduleTaskConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public CreateCustomAgentRequestScheduleTaskConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public CreateCustomAgentRequestScheduleTaskConfig setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

    }

}
