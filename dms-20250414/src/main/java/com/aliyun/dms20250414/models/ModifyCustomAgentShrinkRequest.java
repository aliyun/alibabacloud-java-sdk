// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentShrinkRequest extends TeaModel {
    @NameInMap("CallbackConfig")
    public String callbackConfigShrink;

    /**
     * <p>The custom agent ID.</p>
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
     * <li>Common parameter description<ul>
     * <li>tableFlag: true indicates a specified data scope.</li>
     * <li>scope: personal is a fixed value.</li>
     * <li>personal: pass parameters for file or database types.</li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>File type</strong>. Pass parameters in the following format:</p>
     * <ul>
     * <li>DataSourceType: remote_data_center is a fixed value.</li>
     * <li>FileId: the file ID.</li>
     * <li>Database: the database name returned by the ListDataCenterTable operation, which is typically the file name.</li>
     * <li>Tables: the table name returned by the ListDataCenterTable operation.</li>
     * <li>TableIds: the TableId returned by the ListDataCenterTable operation.</li>
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
     * <p><strong>Database type</strong>. Pass parameters as follows:</p>
     * <ul>
     * <li>DataSourceType: database is a fixed value.</li>
     * <li>DmsInstanceId: the DMS instance ID returned by the data center operation.</li>
     * <li>DmsDatabaseId: the DMS database ID returned by the data center operation.</li>
     * <li>FileId: the instance name (deprecated).</li>
     * <li>DbName: the database name returned by the data center operation.</li>
     * <li>Database: the database name returned by the data center operation.</li>
     * <li>Tables: the table name returned by the data center operation.</li>
     * <li>TableIds: the TableId returned by the data center operation.</li>
     * <li>Engine: the engine type (mysql or postgresql).</li>
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
     *     &quot;Database&quot; : &quot;TestTable</strong></strong></strong>.xlsx&quot;,
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
     * <p>AgentTestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution configuration.</p>
     */
    @NameInMap("ExecutionConfig")
    public String executionConfigShrink;

    /**
     * <p>The instruction.</p>
     * <ul>
     * <li>Input limit: up to 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Analysis framework:</p>
     * <ol>
     * <li>Monitor core metrics (GMV, order volume, UV, conversion rate) by day, week, and month dimensions, and analyze trends and year-over-year/month-over-month fluctuations.</li>
     * <li>Segment by new/existing customers, channels, and regions to identify growth sources and weaknesses.</li>
     * <li>Conduct funnel analysis based on user behavior paths (browse → add to cart → payment) to identify drop-off points</li>
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
     * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including paid and unpaid orders.</li>
     * <li>Order volume is the number of valid orders placed per day.</li>
     * <li>UV (Unique Visitors) refers to the deduplicated number of users who visit the website or app.</li>
     * <li>Conversion rate = number of paid orders / UV, reflecting traffic conversion efficiency</li>
     * </ol>
     */
    @NameInMap("Knowledge")
    public String knowledge;

    /**
     * <p>The external knowledge base list.</p>
     */
    @NameInMap("KnowledgeConfigList")
    public String knowledgeConfigListShrink;

    @NameInMap("KnowledgeSemanticConfigList")
    public String knowledgeSemanticConfigListShrink;

    /**
     * <p>The name of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTestName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the referenced historical session.</p>
     */
    @NameInMap("RelatedSessionId")
    public String relatedSessionId;

    /**
     * <p>The scheduled task configuration.</p>
     */
    @NameInMap("ScheduleTaskConfig")
    public String scheduleTaskConfigShrink;

    /**
     * <p>The text report format.</p>
     * <ul>
     * <li>Input limit: up to 10,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The text report requires all numbers to be written in Chinese characters instead of Arabic numerals</p>
     */
    @NameInMap("TextReportConfig")
    public String textReportConfig;

    @NameInMap("UserSpecifiedSkillList")
    public String userSpecifiedSkillListShrink;

    /**
     * <p>The web report format.</p>
     * <ul>
     * <li>Input limit: up to 50,000 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The web report requires all numbers to be written in Chinese characters instead of Arabic numerals</p>
     */
    @NameInMap("WebReportConfig")
    public String webReportConfig;

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

    public static ModifyCustomAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomAgentShrinkRequest self = new ModifyCustomAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomAgentShrinkRequest setCallbackConfigShrink(String callbackConfigShrink) {
        this.callbackConfigShrink = callbackConfigShrink;
        return this;
    }
    public String getCallbackConfigShrink() {
        return this.callbackConfigShrink;
    }

    public ModifyCustomAgentShrinkRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public ModifyCustomAgentShrinkRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public ModifyCustomAgentShrinkRequest setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

    public ModifyCustomAgentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCustomAgentShrinkRequest setExecutionConfigShrink(String executionConfigShrink) {
        this.executionConfigShrink = executionConfigShrink;
        return this;
    }
    public String getExecutionConfigShrink() {
        return this.executionConfigShrink;
    }

    public ModifyCustomAgentShrinkRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public ModifyCustomAgentShrinkRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

    public ModifyCustomAgentShrinkRequest setKnowledgeConfigListShrink(String knowledgeConfigListShrink) {
        this.knowledgeConfigListShrink = knowledgeConfigListShrink;
        return this;
    }
    public String getKnowledgeConfigListShrink() {
        return this.knowledgeConfigListShrink;
    }

    public ModifyCustomAgentShrinkRequest setKnowledgeSemanticConfigListShrink(String knowledgeSemanticConfigListShrink) {
        this.knowledgeSemanticConfigListShrink = knowledgeSemanticConfigListShrink;
        return this;
    }
    public String getKnowledgeSemanticConfigListShrink() {
        return this.knowledgeSemanticConfigListShrink;
    }

    public ModifyCustomAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCustomAgentShrinkRequest setRelatedSessionId(String relatedSessionId) {
        this.relatedSessionId = relatedSessionId;
        return this;
    }
    public String getRelatedSessionId() {
        return this.relatedSessionId;
    }

    public ModifyCustomAgentShrinkRequest setScheduleTaskConfigShrink(String scheduleTaskConfigShrink) {
        this.scheduleTaskConfigShrink = scheduleTaskConfigShrink;
        return this;
    }
    public String getScheduleTaskConfigShrink() {
        return this.scheduleTaskConfigShrink;
    }

    public ModifyCustomAgentShrinkRequest setTextReportConfig(String textReportConfig) {
        this.textReportConfig = textReportConfig;
        return this;
    }
    public String getTextReportConfig() {
        return this.textReportConfig;
    }

    public ModifyCustomAgentShrinkRequest setUserSpecifiedSkillListShrink(String userSpecifiedSkillListShrink) {
        this.userSpecifiedSkillListShrink = userSpecifiedSkillListShrink;
        return this;
    }
    public String getUserSpecifiedSkillListShrink() {
        return this.userSpecifiedSkillListShrink;
    }

    public ModifyCustomAgentShrinkRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    public ModifyCustomAgentShrinkRequest setWebReportTheme(String webReportTheme) {
        this.webReportTheme = webReportTheme;
        return this;
    }
    public String getWebReportTheme() {
        return this.webReportTheme;
    }

    public ModifyCustomAgentShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
