// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The type of the custom agent. Valid values:</p>
     * <ul>
     * <li>Default: The built-in custom agent. Each workspace can have at most one agent of this type, and it cannot be deleted.</li>
     * <li>Common: A regular custom agent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Common</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    @NameInMap("CallbackConfig")
    public String callbackConfigShrink;

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
     * <li>General parameter description:<ul>
     * <li>tableFlag: Set to true to specify the data scope.</li>
     * <li>scope: Set to personal as a fixed value.</li>
     * <li>personal: The parameters for file and database types.</li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>File type</strong>: Pass parameters in the following format:</p>
     * <ul>
     * <li>DataSourceType: Set to remote_data_center as a fixed value.</li>
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
     * <li>DataSourceType: Set to database as a fixed value.</li>
     * <li>DmsInstanceId: The DMS instance ID returned by the data center operation.</li>
     * <li>DmsDatabaseId: The DMS database ID returned by the data center operation.</li>
     * <li>FileId: The instance name. (Deprecated)</li>
     * <li>DbName: The database name returned by the data center operation.</li>
     * <li>Database: The database name returned by the data center operation.</li>
     * <li>Tables: The table names returned by the data center operation.</li>
     * <li>TableIds: The table IDs returned by the data center operation.</li>
     * <li>Engine: The engine type, such as mysql or postgresql.</li>
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
     *     &quot;Database&quot; : &quot;Sample table</strong></strong></strong>.xlsx&quot;,
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
     * <p>Sample agent description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution configuration.</p>
     */
    @NameInMap("ExecutionConfig")
    public String executionConfigShrink;

    /**
     * <p>The instructions. Maximum length: 10,000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Core metric definitions:</p>
     * <ol>
     * <li>GMV (Gross Merchandise Volume) refers to the total sum of order amounts, including both paid and unpaid orders.</li>
     * <li>Order volume refers to the number of valid orders placed per day.</li>
     * <li>UV (Unique Visitors) refers to the number of deduplicated users visiting the website or app.</li>
     * <li>Conversion rate = Number of paid orders / UV, reflecting the traffic conversion efficiency</li>
     * </ol>
     */
    @NameInMap("Instruction")
    public String instruction;

    /**
     * <p>The knowledge. Maximum length: 10,000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Core metric definitions:</p>
     * <ol>
     * <li>GMV (Gross Merchandise Volume) refers to the total sum of order amounts, including both paid and unpaid orders.</li>
     * <li>Order volume refers to the number of valid orders placed per day.</li>
     * <li>UV (Unique Visitors) refers to the number of deduplicated users visiting the website or app.</li>
     * <li>Conversion rate = Number of paid orders / UV, reflecting the traffic conversion efficiency</li>
     * </ol>
     */
    @NameInMap("Knowledge")
    public String knowledge;

    /**
     * <p>The external knowledge bases.</p>
     */
    @NameInMap("KnowledgeConfigList")
    public String knowledgeConfigListShrink;

    @NameInMap("KnowledgeSemanticConfigList")
    public String knowledgeSemanticConfigListShrink;

    /**
     * <p>The name of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample agent name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of recommended questions. You can configure up to 10 recommended questions.</p>
     */
    @NameInMap("RecommendQuestionList")
    public String recommendQuestionListShrink;

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
    public String scheduleTaskConfigShrink;

    /**
     * <p>The text report format.</p>
     * 
     * <strong>example:</strong>
     * <p>For the text report, use Chinese characters for all numbers instead of Arabic numerals</p>
     */
    @NameInMap("TextReportConfig")
    public String textReportConfig;

    /**
     * <p>The list of user-specified skills.</p>
     */
    @NameInMap("UserSpecifiedSkillList")
    public String userSpecifiedSkillListShrink;

    /**
     * <p>The web report format.</p>
     * 
     * <strong>example:</strong>
     * <p>For the web report, use Chinese characters for all numbers instead of Arabic numerals</p>
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

    public static CreateCustomAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentShrinkRequest self = new CreateCustomAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentShrinkRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public CreateCustomAgentShrinkRequest setCallbackConfigShrink(String callbackConfigShrink) {
        this.callbackConfigShrink = callbackConfigShrink;
        return this;
    }
    public String getCallbackConfigShrink() {
        return this.callbackConfigShrink;
    }

    public CreateCustomAgentShrinkRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateCustomAgentShrinkRequest setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

    public CreateCustomAgentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomAgentShrinkRequest setExecutionConfigShrink(String executionConfigShrink) {
        this.executionConfigShrink = executionConfigShrink;
        return this;
    }
    public String getExecutionConfigShrink() {
        return this.executionConfigShrink;
    }

    public CreateCustomAgentShrinkRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public CreateCustomAgentShrinkRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

    public CreateCustomAgentShrinkRequest setKnowledgeConfigListShrink(String knowledgeConfigListShrink) {
        this.knowledgeConfigListShrink = knowledgeConfigListShrink;
        return this;
    }
    public String getKnowledgeConfigListShrink() {
        return this.knowledgeConfigListShrink;
    }

    public CreateCustomAgentShrinkRequest setKnowledgeSemanticConfigListShrink(String knowledgeSemanticConfigListShrink) {
        this.knowledgeSemanticConfigListShrink = knowledgeSemanticConfigListShrink;
        return this;
    }
    public String getKnowledgeSemanticConfigListShrink() {
        return this.knowledgeSemanticConfigListShrink;
    }

    public CreateCustomAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomAgentShrinkRequest setRecommendQuestionListShrink(String recommendQuestionListShrink) {
        this.recommendQuestionListShrink = recommendQuestionListShrink;
        return this;
    }
    public String getRecommendQuestionListShrink() {
        return this.recommendQuestionListShrink;
    }

    public CreateCustomAgentShrinkRequest setRelatedSessionId(String relatedSessionId) {
        this.relatedSessionId = relatedSessionId;
        return this;
    }
    public String getRelatedSessionId() {
        return this.relatedSessionId;
    }

    public CreateCustomAgentShrinkRequest setScheduleTaskConfigShrink(String scheduleTaskConfigShrink) {
        this.scheduleTaskConfigShrink = scheduleTaskConfigShrink;
        return this;
    }
    public String getScheduleTaskConfigShrink() {
        return this.scheduleTaskConfigShrink;
    }

    public CreateCustomAgentShrinkRequest setTextReportConfig(String textReportConfig) {
        this.textReportConfig = textReportConfig;
        return this;
    }
    public String getTextReportConfig() {
        return this.textReportConfig;
    }

    public CreateCustomAgentShrinkRequest setUserSpecifiedSkillListShrink(String userSpecifiedSkillListShrink) {
        this.userSpecifiedSkillListShrink = userSpecifiedSkillListShrink;
        return this;
    }
    public String getUserSpecifiedSkillListShrink() {
        return this.userSpecifiedSkillListShrink;
    }

    public CreateCustomAgentShrinkRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    public CreateCustomAgentShrinkRequest setWebReportTheme(String webReportTheme) {
        this.webReportTheme = webReportTheme;
        return this;
    }
    public String getWebReportTheme() {
        return this.webReportTheme;
    }

    public CreateCustomAgentShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
