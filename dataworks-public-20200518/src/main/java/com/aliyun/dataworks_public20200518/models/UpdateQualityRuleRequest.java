// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleRequest extends TeaModel {
    /**
     * <p>The strength of the quality rule. You can specify a rule as a strong or weak rule based on the importance of the rule. Valid values:</p>
     * <ul>
     * <li><p>1: strong rule</p>
     * </li>
     * <li><p>0: weak rule
     * If you specify a rule as a strong rule and a critical alert is triggered for the rule, the scheduling of the associated task is blocked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlockType")
    public Integer blockType;

    /**
     * <p>The checker ID. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to query the checker ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Checker")
    public Integer checker;

    /**
     * <p>The description of the quality rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Verify the number of table rows</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The threshold for a critical alert. The threshold specifies the deviation of a check result from the expected value. You can customize the threshold based on your business requirements. If you use a strong rule and a critical alert is triggered, the scheduling of the associated task is blocked.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    /**
     * <p>The ID of the partition filter expression. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to query the ID of the partition filter expression.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The expected value.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ExpectValue")
    public String expectValue;

    /**
     * <p>The rule ID. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to query the rule ID.</p>
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
     * <p>Specifies whether to enable or disable the quality rule. This parameter specifies whether to run the quality rule in the production environment.</p>
     * <ul>
     * <li><p>true: The quality rule is triggered when the scheduling task that is associated with the output table of the rule runs.</p>
     * </li>
     * <li><p>false: The quality rule is not triggered when the scheduling task that is associated with the output table of the rule runs.</p>
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
     * <p>The comparison operator. Valid values: &gt;, &gt;=, =, !=, &lt;, and &lt;=.</p>
     * <blockquote>
     * <p>This parameter is required if you set the Checker parameter to 9.</p>
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
     * <ul>
     * <li><p>0: no</p>
     * </li>
     * <li><p>2: yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PredictType")
    public Integer predictType;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the engine or data source. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the name.</p>
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
     * <p>The data type of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>bigint</p>
     */
    @NameInMap("PropertyType")
    public String propertyType;

    /**
     * <p>The name of the quality rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The variable settings that are inserted before a custom rule. The settings are in the format of x=a,y=b.</p>
     * 
     * <strong>example:</strong>
     * <p>x=a,y=b</p>
     */
    @NameInMap("TaskSetting")
    public String taskSetting;

    /**
     * <p>The ID of the template that is used for the check. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to query the template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>The trend of the check result. Valid values:</p>
     * <ul>
     * <li><p>up: upward trend</p>
     * </li>
     * <li><p>down: downward trend</p>
     * </li>
     * <li><p>abs: absolute value</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("Trend")
    public String trend;

    /**
     * <p>The threshold for a warning alert. The threshold specifies the deviation of a check result from the expected value. You can customize the threshold based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("WarningThreshold")
    public String warningThreshold;

    /**
     * <p>The filter condition or custom SQL statement that is used for the check.</p>
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
