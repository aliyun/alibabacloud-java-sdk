// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRuleRequest extends TeaModel {
    /**
     * <p>The strength of the rule. Valid values:</p>
     * <ul>
     * <li><p>0: weak rule</p>
     * </li>
     * <li><p>1: strong rule</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlockType")
    public Integer blockType;

    /**
     * <p>The ID of the checker. Valid values:</p>
     * <ul>
     * <li><p>2: 7-day average fluctuation</p>
     * </li>
     * <li><p>3: 30-day average fluctuation</p>
     * </li>
     * <li><p>4: day-over-day comparison</p>
     * </li>
     * <li><p>5: week-over-week comparison</p>
     * </li>
     * <li><p>6: month-over-month comparison</p>
     * </li>
     * <li><p>7: 7-day variance fluctuation</p>
     * </li>
     * <li><p>8: 30-day variance fluctuation</p>
     * </li>
     * <li><p>9: comparison with a fixed value</p>
     * </li>
     * <li><p>10: fluctuation detection over 1, 7, and 30 days</p>
     * </li>
     * <li><p>11: comparison with the previous cycle</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Checker")
    public Integer checker;

    /**
     * <p>The comments of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Verification</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The critical threshold. It indicates the deviation of the check result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and a critical alert is triggered, the scheduling task is blocked.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    /**
     * <p>The ID of the partition filter expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15224</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The expected value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExpectValue")
    public String expectValue;

    /**
     * <p>The check method. If you use a custom SQL statement, set this parameter to <code>user_defined</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>count/table_count</p>
     */
    @NameInMap("MethodName")
    public String methodName;

    /**
     * <p>The comparison operator. Examples: <code>&gt;</code>, <code>&gt;=</code>, <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, and <code>&lt;=</code>.</p>
     * <blockquote>
     * <p>If you set the Checker parameter to 9, you must specify the Operator parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Specifies whether to use a dynamic threshold. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PredictType")
    public Integer predictType;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine or data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The field that is monitored by the rule. To perform a table-level check, set this parameter to <code>table_count</code> for the number of rows or <code>table_size</code> for the table size.</p>
     * 
     * <strong>example:</strong>
     * <p>table_id</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The data type of the field. For a table-level check, set this parameter to <code>table</code>. For a field-level check, set this parameter to a specific data type, such as <code>bigint</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>bigint</p>
     */
    @NameInMap("PropertyType")
    public String propertyType;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><p>0: system template</p>
     * </li>
     * <li><p>1: custom SQL</p>
     * </li>
     * <li><p>2: custom template</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The variable settings that are inserted before the custom rule. Format: x=a,y=b.</p>
     * 
     * <strong>example:</strong>
     * <p>x=a,y=b</p>
     */
    @NameInMap("TaskSetting")
    public String taskSetting;

    /**
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>The trend of the check result. Valid values:</p>
     * <ul>
     * <li><p><code>up</code>: upward trend</p>
     * </li>
     * <li><p><code>down</code>: downward trend</p>
     * </li>
     * <li><p><code>abs</code>: absolute value</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abs</p>
     */
    @NameInMap("Trend")
    public String trend;

    /**
     * <p>The warning threshold. It indicates the deviation of the check result from the expected value. You can customize this threshold based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WarningThreshold")
    public String warningThreshold;

    /**
     * <p>The filter condition or custom SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>table_id&gt;1</p>
     */
    @NameInMap("WhereCondition")
    public String whereCondition;

    public static CreateQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRuleRequest self = new CreateQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityRuleRequest setBlockType(Integer blockType) {
        this.blockType = blockType;
        return this;
    }
    public Integer getBlockType() {
        return this.blockType;
    }

    public CreateQualityRuleRequest setChecker(Integer checker) {
        this.checker = checker;
        return this;
    }
    public Integer getChecker() {
        return this.checker;
    }

    public CreateQualityRuleRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateQualityRuleRequest setCriticalThreshold(String criticalThreshold) {
        this.criticalThreshold = criticalThreshold;
        return this;
    }
    public String getCriticalThreshold() {
        return this.criticalThreshold;
    }

    public CreateQualityRuleRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public CreateQualityRuleRequest setExpectValue(String expectValue) {
        this.expectValue = expectValue;
        return this;
    }
    public String getExpectValue() {
        return this.expectValue;
    }

    public CreateQualityRuleRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public CreateQualityRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateQualityRuleRequest setPredictType(Integer predictType) {
        this.predictType = predictType;
        return this;
    }
    public Integer getPredictType() {
        return this.predictType;
    }

    public CreateQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateQualityRuleRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateQualityRuleRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public CreateQualityRuleRequest setPropertyType(String propertyType) {
        this.propertyType = propertyType;
        return this;
    }
    public String getPropertyType() {
        return this.propertyType;
    }

    public CreateQualityRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateQualityRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public CreateQualityRuleRequest setTaskSetting(String taskSetting) {
        this.taskSetting = taskSetting;
        return this;
    }
    public String getTaskSetting() {
        return this.taskSetting;
    }

    public CreateQualityRuleRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public CreateQualityRuleRequest setTrend(String trend) {
        this.trend = trend;
        return this;
    }
    public String getTrend() {
        return this.trend;
    }

    public CreateQualityRuleRequest setWarningThreshold(String warningThreshold) {
        this.warningThreshold = warningThreshold;
        return this;
    }
    public String getWarningThreshold() {
        return this.warningThreshold;
    }

    public CreateQualityRuleRequest setWhereCondition(String whereCondition) {
        this.whereCondition = whereCondition;
        return this;
    }
    public String getWhereCondition() {
        return this.whereCondition;
    }

}
