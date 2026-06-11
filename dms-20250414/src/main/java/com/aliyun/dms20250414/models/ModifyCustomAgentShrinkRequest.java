// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The callback configuration.</p>
     */
    @NameInMap("CallbackConfig")
    public String callbackConfigShrink;

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
    public String executionConfigShrink;

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
    public String knowledgeConfigListShrink;

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
    public String scheduleTaskConfigShrink;

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

    public ModifyCustomAgentShrinkRequest setWebReportConfig(String webReportConfig) {
        this.webReportConfig = webReportConfig;
        return this;
    }
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    public ModifyCustomAgentShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
