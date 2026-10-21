// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentRequest extends TeaModel {
    /**
     * <p>The callback feature configuration.</p>
     */
    @NameInMap("CallbackConfig")
    public ModifyCustomAgentRequestCallbackConfig callbackConfig;

    /**
     * <p>The ID of the custom agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-4y3ca4khkcu**********ysf</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The specified data scope in <strong>JSON character string format</strong>.</p>
     * <ul>
     * <li>General metric descriptions:<ul>
     * <li>tableFlag: true indicates that a data scope is specified.</li>
     * <li>scope: The fixed value personal.</li>
     * <li>personal: The parameters for file and database types.</li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>File type</strong>: Pass parameters in the following format:</p>
     * <ul>
     * <li>DataSourceType: The fixed value remote_data_center.</li>
     * <li>FileId: The file ID.</li>
     * <li>Database: The database name returned by the ListDataCenterTable operation, which is usually the file name.</li>
     * <li>Tables: The table names returned by the ListDataCenterTable operation.</li>
     * <li>TableIds: The table IDs returned by the ListDataCenterTable operation.</li>
     * <li>RegionId: The current region.</li>
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
     * <p><strong>Database type</strong>: Pass parameters in the following format:</p>
     * <ul>
     * <li>DataSourceType: The fixed value database.</li>
     * <li>DmsInstanceId: The DMS instance ID returned by the data center operation.</li>
     * <li>DmsDatabaseId: The DMS database ID returned by the data center operation.</li>
     * <li>FileId: The instance name. <strong>[Deprecated]</strong></li>
     * <li>DbName: The database name returned by the data center operation.</li>
     * <li>Database: The database name returned by the data center operation.</li>
     * <li>Tables: The table names returned by the data center operation.</li>
     * <li>TableIds: The table IDs returned by the data center operation.</li>
     * <li>Engine: The DPI engine type (mysql or postgresql).</li>
     * <li>RegionId: The current region.</li>
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
     * <p>Test agent description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution configuration.</p>
     */
    @NameInMap("ExecutionConfig")
    public ModifyCustomAgentRequestExecutionConfig executionConfig;

    /**
     * <p>The instructions.</p>
     * <ul>
     * <li>Input limit: Maximum of 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Analysis framework:</p>
     * <ol>
     * <li>Monitor core metrics (GMV, order volume, UV, conversion rate) on a daily, weekly, and monthly basis, and analyze trend changes and year-over-year or month-over-month fluctuations.</li>
     * <li>Segment by new and existing customers, channels, and regions to identify growth drivers and weaknesses.</li>
     * <li>Conduct funnel analysis based on user behavior paths (browse → add to cart → pay) to locate churn points</li>
     * </ol>
     */
    @NameInMap("Instruction")
    public String instruction;

    /**
     * <p>The knowledge.</p>
     * <ul>
     * <li>Input limit: Maximum of 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Core metric definitions:</p>
     * <ol>
     * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including both successfully paid and unpaid orders.</li>
     * <li>Order volume is the number of valid orders placed per day.</li>
     * <li>UV (Unique Visitors) refers to the number of deduplicated users who visit the website or app.</li>
     * <li>Conversion rate = Number of paid orders / UV, reflecting the traffic conversion efficiency</li>
     * </ol>
     */
    @NameInMap("Knowledge")
    public String knowledge;

    /**
     * <p>The external knowledge bases.</p>
     */
    @NameInMap("KnowledgeConfigList")
    public java.util.List<ModifyCustomAgentRequestKnowledgeConfigList> knowledgeConfigList;

    /**
     * <p>The knowledge semantic configuration list.</p>
     */
    @NameInMap("KnowledgeSemanticConfigList")
    public java.util.List<ModifyCustomAgentRequestKnowledgeSemanticConfigList> knowledgeSemanticConfigList;

    /**
     * <p>The name of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Test agent name</p>
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
     * <p>ski-sldk8v******3owd</p>
     */
    @NameInMap("RelatedSessionId")
    public String relatedSessionId;

    /**
     * <p>The scheduled task configuration.</p>
     */
    @NameInMap("ScheduleTaskConfig")
    public ModifyCustomAgentRequestScheduleTaskConfig scheduleTaskConfig;

    /**
     * <p>The text report format.</p>
     * <ul>
     * <li>Input limit: Maximum of 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The text report requires that all numbers be spelled out in words instead of using Arabic numerals</p>
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
     * <ul>
     * <li>Input limit: Maximum of 50,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The web report requires that all numbers be spelled out in words instead of using Arabic numerals</p>
     */
    @NameInMap("WebReportConfig")
    public String webReportConfig;

    /**
     * <p>The web report theme. Valid values:</p>
     * <ul>
     * <li>default: Default.</li>
     * <li>journal: Journal.</li>
     * <li>legacy: Legacy.</li>
     * <li>neobrutalism: Neobrutalism.</li>
     * <li>infographic: Infographic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
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

    public static ModifyCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomAgentRequest self = new ModifyCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomAgentRequest setCallbackConfig(ModifyCustomAgentRequestCallbackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public ModifyCustomAgentRequestCallbackConfig getCallbackConfig() {
        return this.callbackConfig;
    }

    public ModifyCustomAgentRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public ModifyCustomAgentRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public ModifyCustomAgentRequest setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

    public ModifyCustomAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCustomAgentRequest setExecutionConfig(ModifyCustomAgentRequestExecutionConfig executionConfig) {
        this.executionConfig = executionConfig;
        return this;
    }
    public ModifyCustomAgentRequestExecutionConfig getExecutionConfig() {
        return this.executionConfig;
    }

    public ModifyCustomAgentRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public ModifyCustomAgentRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

    public ModifyCustomAgentRequest setKnowledgeConfigList(java.util.List<ModifyCustomAgentRequestKnowledgeConfigList> knowledgeConfigList) {
        this.knowledgeConfigList = knowledgeConfigList;
        return this;
    }
    public java.util.List<ModifyCustomAgentRequestKnowledgeConfigList> getKnowledgeConfigList() {
        return this.knowledgeConfigList;
    }

    public ModifyCustomAgentRequest setKnowledgeSemanticConfigList(java.util.List<ModifyCustomAgentRequestKnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
        this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
        return this;
    }
    public java.util.List<ModifyCustomAgentRequestKnowledgeSemanticConfigList> getKnowledgeSemanticConfigList() {
        return this.knowledgeSemanticConfigList;
    }

    public ModifyCustomAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCustomAgentRequest setRecommendQuestionList(java.util.List<String> recommendQuestionList) {
        this.recommendQuestionList = recommendQuestionList;
        return this;
    }
    public java.util.List<String> getRecommendQuestionList() {
        return this.recommendQuestionList;
    }

    public ModifyCustomAgentRequest setRelatedSessionId(String relatedSessionId) {
        this.relatedSessionId = relatedSessionId;
        return this;
    }
    public String getRelatedSessionId() {
        return this.relatedSessionId;
    }

    public ModifyCustomAgentRequest setScheduleTaskConfig(ModifyCustomAgentRequestScheduleTaskConfig scheduleTaskConfig) {
        this.scheduleTaskConfig = scheduleTaskConfig;
        return this;
    }
    public ModifyCustomAgentRequestScheduleTaskConfig getScheduleTaskConfig() {
        return this.scheduleTaskConfig;
    }

    public ModifyCustomAgentRequest setTextReportConfig(String textReportConfig) {
        this.textReportConfig = textReportConfig;
        return this;
    }
    public String getTextReportConfig() {
        return this.textReportConfig;
    }

    public ModifyCustomAgentRequest setUserSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
        this.userSpecifiedSkillList = userSpecifiedSkillList;
        return this;
    }
    public java.util.List<String> getUserSpecifiedSkillList() {
        return this.userSpecifiedSkillList;
    }

    public ModifyCustomAgentRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    public ModifyCustomAgentRequest setWebReportTheme(String webReportTheme) {
        this.webReportTheme = webReportTheme;
        return this;
    }
    public String getWebReportTheme() {
        return this.webReportTheme;
    }

    public ModifyCustomAgentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ModifyCustomAgentRequestCallbackConfig extends TeaModel {
        /**
         * <p>The invoke parameters for callback tool calling.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("CallbackArgs")
        public String callbackArgs;

        /**
         * <p>The prompt for generating invoke parameters for callback tool calling.</p>
         * 
         * <strong>example:</strong>
         * <p>send web report to <a href="mailto:123456@163.com">123456@163.com</a></p>
         */
        @NameInMap("CallbackPrompt")
        public String callbackPrompt;

        /**
         * <p>The invoke timing for callback tool calling.</p>
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

        public static ModifyCustomAgentRequestCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentRequestCallbackConfig self = new ModifyCustomAgentRequestCallbackConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentRequestCallbackConfig setCallbackArgs(String callbackArgs) {
            this.callbackArgs = callbackArgs;
            return this;
        }
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        public ModifyCustomAgentRequestCallbackConfig setCallbackPrompt(String callbackPrompt) {
            this.callbackPrompt = callbackPrompt;
            return this;
        }
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        public ModifyCustomAgentRequestCallbackConfig setCallbackTime(Integer callbackTime) {
            this.callbackTime = callbackTime;
            return this;
        }
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        public ModifyCustomAgentRequestCallbackConfig setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public ModifyCustomAgentRequestCallbackConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyCustomAgentRequestExecutionConfig extends TeaModel {
        /**
         * <p>Specifies whether to prohibit appending data sources in a session.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForbiddenAppendDataSource")
        public Boolean forbiddenAppendDataSource;

        /**
         * <p>Specifies whether to disable user inquiries during the process.</p>
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

        public static ModifyCustomAgentRequestExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentRequestExecutionConfig self = new ModifyCustomAgentRequestExecutionConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentRequestExecutionConfig setForbiddenAppendDataSource(Boolean forbiddenAppendDataSource) {
            this.forbiddenAppendDataSource = forbiddenAppendDataSource;
            return this;
        }
        public Boolean getForbiddenAppendDataSource() {
            return this.forbiddenAppendDataSource;
        }

        public ModifyCustomAgentRequestExecutionConfig setSkipAskHuman(Boolean skipAskHuman) {
            this.skipAskHuman = skipAskHuman;
            return this;
        }
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        public ModifyCustomAgentRequestExecutionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        public ModifyCustomAgentRequestExecutionConfig setSkipSqlConfirm(Boolean skipSqlConfirm) {
            this.skipSqlConfirm = skipSqlConfirm;
            return this;
        }
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        public ModifyCustomAgentRequestExecutionConfig setSkipWebReportConfirm(Boolean skipWebReportConfirm) {
            this.skipWebReportConfirm = skipWebReportConfirm;
            return this;
        }
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

    }

    public static class ModifyCustomAgentRequestKnowledgeConfigList extends TeaModel {
        /**
         * <p>The access type. If you do not specify this parameter, the default value is mcp. Valid values:</p>
         * <ul>
         * <li>mcp: Access through MCP. You must pass the McpServerId parameter.</li>
         * <li>dms_kb: Access through DMS knowledge base. You must pass the KbUuid parameter.</li>
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
         * <p>The ID of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>nhdpt9adf6ac**********ca</p>
         */
        @NameInMap("McpServerId")
        public String mcpServerId;

        public static ModifyCustomAgentRequestKnowledgeConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentRequestKnowledgeConfigList self = new ModifyCustomAgentRequestKnowledgeConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentRequestKnowledgeConfigList setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ModifyCustomAgentRequestKnowledgeConfigList setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public ModifyCustomAgentRequestKnowledgeConfigList setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

    }

    public static class ModifyCustomAgentRequestKnowledgeSemanticConfigList extends TeaModel {
        /**
         * <p>The DMS database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69305251</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The DMS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2086427</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The knowledge UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ca8f50d78*****1f4b8410f02e87</p>
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

        public static ModifyCustomAgentRequestKnowledgeSemanticConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentRequestKnowledgeSemanticConfigList self = new ModifyCustomAgentRequestKnowledgeSemanticConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentRequestKnowledgeSemanticConfigList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ModifyCustomAgentRequestKnowledgeSemanticConfigList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyCustomAgentRequestKnowledgeSemanticConfigList setKnowledgeUuid(String knowledgeUuid) {
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }
        public String getKnowledgeUuid() {
            return this.knowledgeUuid;
        }

        public ModifyCustomAgentRequestKnowledgeSemanticConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyCustomAgentRequestScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for time-based scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0,1 ? * 1-7</p>
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

        public static ModifyCustomAgentRequestScheduleTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentRequestScheduleTaskConfig self = new ModifyCustomAgentRequestScheduleTaskConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentRequestScheduleTaskConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyCustomAgentRequestScheduleTaskConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ModifyCustomAgentRequestScheduleTaskConfig setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

    }

}
