// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleRequest extends TeaModel {
    /**
     * <p>The strength of the quality check rule. The strength indicates the importance of the rule. Valid values:</p>
     * <ul>
     * <li>1: strong rule.</li>
     * <li>0: weak rule.
     * You can set important rules as strong rules based on your business requirements. If a strong rule is used and a red alert is triggered, the scheduling task is blocked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlockType")
    public Integer blockType;

    /**
     * <p>The checker ID.
     * 2: 7-day average fluctuation.
     * 3: 30-day average fluctuation.
     * 4: 1-day cycle comparison.
     * 5: 7-day cycle comparison.
     * 6: 30-day cycle comparison.
     * 7: 7-day variance fluctuation.
     * 8: 30-day variance fluctuation.
     * 9: comparison with a fixed value.
     * 10: 1-, 7-, and 30-day fluctuation detection.
     * 11: previous cycle comparison.
     * You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the checker ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Checker")
    public Integer checker;

    /**
     * <p>The description of the quality check rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Verify the number of table rows</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The red alert threshold. This value indicates the degree of deviation from the expected sample value. You can customize this threshold based on your business requirements. If a strong rule is used and the red threshold is triggered, the scheduling task is blocked.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    /**
     * <p>The ID of the partition expression. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the partition expression ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The expected value of the check result.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ExpectValue")
    public String expectValue;

    /**
     * <p>The ID of the quality check rule. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the method used to collect sample data. Valid values: avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, and table_count-count_distinct.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_count</p>
     */
    @NameInMap("MethodName")
    public String methodName;

    /**
     * <p>The enabled or disabled status of the rule, which controls whether the quality rule runs in the production environment.</p>
     * <ul>
     * <li><p>true: When the scheduling task associated with the output table data of the data quality rule is executed, the quality rule check is triggered.</p>
     * </li>
     * <li><p>false: When the scheduling task associated with the output table data of the data quality rule is executed, the quality rule check is not triggered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenSwitch")
    public Boolean openSwitch;

    /**
     * <p>The comparison operator. Valid values: &gt;, &gt;=, =, ≠, &lt;, and &lt;=.</p>
     * <blockquote>
     * <p>When Checker is set to 9, Operator is a required parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Specifies whether the threshold is dynamic. Valid values:</p>
     * <ul>
     * <li>0: non-dynamic threshold.</li>
     * <li>2: dynamic threshold.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PredictType")
    public Integer predictType;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the engine or data source. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The type of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>bigint</p>
     */
    @NameInMap("PropertyType")
    public String propertyType;

    /**
     * <p>The name of the quality check rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li>0: system template rule.</li>
     * <li>1: custom SQL rule.</li>
     * <li>4: custom template rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The variable settings inserted before the custom rule, in the format of x=a,y=b.</p>
     * 
     * <strong>example:</strong>
     * <p>x=a,y=b</p>
     */
    @NameInMap("TaskSetting")
    public String taskSetting;

    /**
     * <p>The ID of the check template. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the check template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>The trend of the check result. Valid values:</p>
     * <ul>
     * <li>up: upward trend.</li>
     * <li>down: downward trend.</li>
     * <li>abs: absolute value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("Trend")
    public String trend;

    /**
     * <p>The orange alert threshold. This value indicates the degree of deviation from the expected sample value. You can customize this threshold based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("WarningThreshold")
    public String warningThreshold;

    /**
     * <p>The filter condition or custom SQL statement used by the check task.</p>
     * 
     * <strong>example:</strong>
     * <p>dt=$[yyyymmdd]</p>
     */
    @NameInMap("WhereCondition")
    public String whereCondition;

    public static UpdateQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityRuleRequest self = new UpdateQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityRuleRequest setBlockType(Integer blockType) {
        this.blockType = blockType;
        return this;
    }
    public Integer getBlockType() {
        return this.blockType;
    }

    public UpdateQualityRuleRequest setChecker(Integer checker) {
        this.checker = checker;
        return this;
    }
    public Integer getChecker() {
        return this.checker;
    }

    public UpdateQualityRuleRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateQualityRuleRequest setCriticalThreshold(String criticalThreshold) {
        this.criticalThreshold = criticalThreshold;
        return this;
    }
    public String getCriticalThreshold() {
        return this.criticalThreshold;
    }

    public UpdateQualityRuleRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public UpdateQualityRuleRequest setExpectValue(String expectValue) {
        this.expectValue = expectValue;
        return this;
    }
    public String getExpectValue() {
        return this.expectValue;
    }

    public UpdateQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateQualityRuleRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateQualityRuleRequest setOpenSwitch(Boolean openSwitch) {
        this.openSwitch = openSwitch;
        return this;
    }
    public Boolean getOpenSwitch() {
        return this.openSwitch;
    }

    public UpdateQualityRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateQualityRuleRequest setPredictType(Integer predictType) {
        this.predictType = predictType;
        return this;
    }
    public Integer getPredictType() {
        return this.predictType;
    }

    public UpdateQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateQualityRuleRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateQualityRuleRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public UpdateQualityRuleRequest setPropertyType(String propertyType) {
        this.propertyType = propertyType;
        return this;
    }
    public String getPropertyType() {
        return this.propertyType;
    }

    public UpdateQualityRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateQualityRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public UpdateQualityRuleRequest setTaskSetting(String taskSetting) {
        this.taskSetting = taskSetting;
        return this;
    }
    public String getTaskSetting() {
        return this.taskSetting;
    }

    public UpdateQualityRuleRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public UpdateQualityRuleRequest setTrend(String trend) {
        this.trend = trend;
        return this;
    }
    public String getTrend() {
        return this.trend;
    }

    public UpdateQualityRuleRequest setWarningThreshold(String warningThreshold) {
        this.warningThreshold = warningThreshold;
        return this;
    }
    public String getWarningThreshold() {
        return this.warningThreshold;
    }

    public UpdateQualityRuleRequest setWhereCondition(String whereCondition) {
        this.whereCondition = whereCondition;
        return this;
    }
    public String getWhereCondition() {
        return this.whereCondition;
    }

}
