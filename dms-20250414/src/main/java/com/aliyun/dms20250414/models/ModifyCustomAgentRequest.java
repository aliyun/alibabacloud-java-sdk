// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentRequest extends TeaModel {
    /**
     * <p>The callback configuration.</p>
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
     * <p>The data scope for the agent, specified in a <strong>JSON-formatted string</strong>.</p>
     * <ul>
     * <li><p>General parameters:</p>
     * <ul>
     * <li><p><code>tableFlag</code>: Set this to <code>true</code> to specify the data scope.</p>
     * </li>
     * <li><p><code>scope</code>: The value must be <code>personal</code>.</p>
     * </li>
     * <li><p><code>personal</code>: The parameters for files or databases.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>For files</strong>, use the following parameters:</p>
     * <ul>
     * <li><p><code>DataSourceType</code>: The value must be <code>remote_data_center</code>.</p>
     * </li>
     * <li><p><code>FileId</code>: The file ID.</p>
     * </li>
     * <li><p><code>Database</code>: The database name returned by the <code>ListDataCenterTable</code> operation. This is typically the file name.</p>
     * </li>
     * <li><p><code>Tables</code>: The table names returned by the <code>ListDataCenterTable</code> operation.</p>
     * </li>
     * <li><p><code>TableIds</code>: The table IDs returned by the <code>ListDataCenterTable</code> operation.</p>
     * </li>
     * <li><p><code>RegionId</code>: The current region.</p>
     * </li>
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
     * <p><strong>For databases</strong>, use the following parameters:</p>
     * <ul>
     * <li><p><code>DataSourceType</code>: The value must be <code>database</code>.</p>
     * </li>
     * <li><p><code>DmsInstanceId</code>: The ID of the DMS instance, which is returned by the data center API.</p>
     * </li>
     * <li><p><code>DmsDatabaseId</code>: The ID of the DMS database, which is returned by the data center API.</p>
     * </li>
     * <li><p><code>FileId</code>: The instance name. This parameter is deprecated.</p>
     * </li>
     * <li><p><code>DbName</code>: The database name returned by the data center API.</p>
     * </li>
     * <li><p><code>Database</code>: The database name returned by the data center API.</p>
     * </li>
     * <li><p><code>Tables</code>: The table names returned by the data center API.</p>
     * </li>
     * <li><p><code>TableIds</code>: The table IDs returned by the data center API.</p>
     * </li>
     * <li><p><code>Engine</code>: The database engine type. Valid values: <code>mysql</code> and <code>postgresql</code>.</p>
     * </li>
     * <li><p><code>RegionId</code>: The current region.</p>
     * </li>
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
     *     &quot;Database&quot; : &quot;测试表格</strong></strong></strong>.xlsx&quot;,
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
     * <p>Agent测试描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution configuration.</p>
     */
    @NameInMap("ExecutionConfig")
    public ModifyCustomAgentRequestExecutionConfig executionConfig;

    /**
     * <p>The system instruction for the custom agent.</p>
     * <ul>
     * <li>The maximum length is 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>分析框架：
     * 1、需按日、周、月维度监控核心指标（GMV、订单量、UV、转化率），分析趋势变化及同比/环比波动；
     * 2、划分新老客、渠道、地域进行拆解，识别增长来源与短板；
     * 3、结合用户行为路径（浏览→加购→支付）开展漏斗分析，定位流失环节；</p>
     */
    @NameInMap("Instruction")
    public String instruction;

    /**
     * <p>A text-based knowledge base for the custom agent.</p>
     * <ul>
     * <li>The maximum length is 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>核心指标定义：
     * 1、GMV（成交总额）指订单金额总和，含已支付及未支付成功订单；
     * 2、订单量为每日有效下单笔数；
     * 3、UV（独立访客）指访问网站或APP的去重用户数；
     * 4、转化率=支付订单数 / UV，反映流量转化效率；</p>
     */
    @NameInMap("Knowledge")
    public String knowledge;

    /**
     * <p>The configurations for the external knowledge base.</p>
     */
    @NameInMap("KnowledgeConfigList")
    public java.util.List<ModifyCustomAgentRequestKnowledgeConfigList> knowledgeConfigList;

    /**
     * <p>The name of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent测试名称</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RelatedSessionId")
    public String relatedSessionId;

    /**
     * <p>The configuration for the scheduled task.</p>
     */
    @NameInMap("ScheduleTaskConfig")
    public ModifyCustomAgentRequestScheduleTaskConfig scheduleTaskConfig;

    /**
     * <p>The formatting instructions for the text report.</p>
     * <ul>
     * <li>The maximum length is 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>文字报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
     */
    @NameInMap("TextReportConfig")
    public String textReportConfig;

    /**
     * <p>The formatting instructions for the web report.</p>
     * <ul>
     * <li>The maximum length is 50,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>网页报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
     */
    @NameInMap("WebReportConfig")
    public String webReportConfig;

    /**
     * <p>The ID of the workspace.</p>
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

    public ModifyCustomAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public ModifyCustomAgentRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
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
         * <p>The arguments for the callback.</p>
         */
        @NameInMap("CallbackArgs")
        public String callbackArgs;

        /**
         * <p>The prompt to use for the callback.</p>
         */
        @NameInMap("CallbackPrompt")
        public String callbackPrompt;

        /**
         * <p>The timestamp of the callback.</p>
         */
        @NameInMap("CallbackTime")
        public Integer callbackTime;

        /**
         * <p>The ID of the tool to call.</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        /**
         * <p>The callback type.</p>
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
         * <p>Specifies whether to prevent the agent from asking for user input during execution.</p>
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
         * <p>Specifies whether to skip all SQL confirmation steps.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipSqlConfirm")
        public Boolean skipSqlConfirm;

        /**
         * <p>Specifies whether to skip the confirmation for web report generation.</p>
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
         * <p>The access type.</p>
         * <ul>
         * <li><code>mcp</code>: Connects via the MCP service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The UUID of the knowledge base.</p>
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

    public static class ModifyCustomAgentRequestScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for the scheduled task.</p>
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
         * <p>分析一下这份数据，给出简报</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of a previous session to use as a reference.</p>
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
