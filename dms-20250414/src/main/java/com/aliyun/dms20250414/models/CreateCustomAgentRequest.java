// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateCustomAgentRequest extends TeaModel {
    @NameInMap("CallbackConfig")
    public CreateCustomAgentRequestCallbackConfig callbackConfig;

    /**
     * <p>The ID of the DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data range, specified as a <strong>JSON string</strong>.</p>
     * <ul>
     * <li><p>General parameters</p>
     * <ul>
     * <li><p><code>tableFlag</code>: Set to <code>true</code> to specify a data range.</p>
     * </li>
     * <li><p><code>scope</code>: The value must be <code>personal</code>.</p>
     * </li>
     * <li><p><code>personal</code>: Contains the parameters for a file or database.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>File type</strong>: Use the following parameters.</p>
     * <ul>
     * <li><p><code>DataSourceType</code>: The value must be <code>remote_data_center</code>.</p>
     * </li>
     * <li><p><code>FileId</code>: The ID of the file.</p>
     * </li>
     * <li><p><code>Database</code>: The name of the database returned by the <code>ListDataCenterTable</code> operation. This is typically the file name.</p>
     * </li>
     * <li><p><code>Tables</code>: The names of the tables returned by the <code>ListDataCenterTable</code> operation.</p>
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
     * <p><strong>Database type</strong>: Use the following parameters.</p>
     * <ul>
     * <li><p><code>DataSourceType</code>: The value must be <code>database</code>.</p>
     * </li>
     * <li><p><code>DmsInstanceId</code>: The ID of the DMS instance returned by the data center API.</p>
     * </li>
     * <li><p><code>DmsDatabaseId</code>: The ID of the DMS database returned by the data center API.</p>
     * </li>
     * <li><p><code>FileId</code>: The instance name. This parameter is deprecated.</p>
     * </li>
     * <li><p><code>DbName</code>: The name of the database returned by the data center API.</p>
     * </li>
     * <li><p><code>Database</code>: The name of the database returned by the data center API.</p>
     * </li>
     * <li><p><code>Tables</code>: The names of the tables returned by the data center API.</p>
     * </li>
     * <li><p><code>TableIds</code>: The table IDs returned by the data center API.</p>
     * </li>
     * <li><p><code>Engine</code>: The database engine. Valid values: <code>mysql</code> and <code>postgresql</code>.</p>
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
    public CreateCustomAgentRequestExecutionConfig executionConfig;

    /**
     * <p>The instruction for the custom agent.</p>
     * <ul>
     * <li>Maximum length: 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>核心指标定义：
     * 1、GMV（成交总额）指订单金额总和，含已支付及未支付成功订单；
     * 2、订单量为每日有效下单笔数；
     * 3、UV（独立访客）指访问网站或APP的去重用户数；
     * 4、转化率=支付订单数 / UV，反映流量转化效率；</p>
     */
    @NameInMap("Instruction")
    public String instruction;

    /**
     * <p>The knowledge for the custom agent.</p>
     * <ul>
     * <li>Maximum length: 10,000 characters.</li>
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
     * <p>A list of external knowledge bases.</p>
     */
    @NameInMap("KnowledgeConfigList")
    public java.util.List<CreateCustomAgentRequestKnowledgeConfigList> knowledgeConfigList;

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
    public CreateCustomAgentRequestScheduleTaskConfig scheduleTaskConfig;

    /**
     * <p>The formatting requirements for the text report.</p>
     * 
     * <strong>example:</strong>
     * <p>文字报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
     */
    @NameInMap("TextReportConfig")
    public String textReportConfig;

    /**
     * <p>The formatting requirements for the web report.</p>
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

    public static CreateCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentRequest self = new CreateCustomAgentRequest();
        return TeaModel.build(map, self);
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

    public CreateCustomAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public CreateCustomAgentRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    public CreateCustomAgentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateCustomAgentRequestCallbackConfig extends TeaModel {
        @NameInMap("CallbackArgs")
        public String callbackArgs;

        @NameInMap("CallbackPrompt")
        public String callbackPrompt;

        @NameInMap("CallbackTime")
        public Integer callbackTime;

        @NameInMap("ToolId")
        public String toolId;

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
         * <p>Specifies whether to skip asking the user for input during execution.</p>
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
         * <p>Specifies whether to skip the web report confirmation step.</p>
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
         * <p>The access type.</p>
         * <ul>
         * <li><code>mcp</code>: Access via an MCP server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        @NameInMap("AccessType")
        public String accessType;

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

    public static class CreateCustomAgentRequestScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for the scheduled task.</p>
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
         * <p>分析一下这份数据，给出简报</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of a previous session to use for reference.</p>
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
