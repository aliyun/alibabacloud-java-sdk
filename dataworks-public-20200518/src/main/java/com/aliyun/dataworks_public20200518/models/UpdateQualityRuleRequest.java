// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleRequest extends TeaModel {
    /**
     * <p>The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:</p>
     * <br>
     * <p>*   1: indicates that the monitoring rule is a strong rule.</p>
     * <br>
     * <p>*   0: indicates that the monitoring rule is a weak rule.</p>
     * <br>
     * <p>    You can specify whether a monitoring rule is a strong rule based on your business requirements. If a strong rule is used and a critical alert is triggered, nodes are blocked.</p>
     */
    @NameInMap("BlockType")
    public Integer blockType;

    /**
     * <p>The ID of the checker. You can call the [ListQualityRules](~~173995~~) operation to obtain the ID of the checker.</p>
     */
    @NameInMap("Checker")
    public Integer checker;

    /**
     * <p>The description of the monitoring rule.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and an error alert is triggered, nodes are blocked.</p>
     */
    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    /**
     * <p>The ID of the partition filter expression. You can call the [GetQualityEntity](~~173995~~) operation to obtain the ID of the partition filter expression.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The expected value of the monitoring result.</p>
     */
    @NameInMap("ExpectValue")
    public String expectValue;

    /**
     * <p>The ID of the monitoring rule. You can call the [ListQualityRules](~~173995~~) operation to obtain the ID of the monitoring rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The method that is used to collect sample data, such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.</p>
     */
    @NameInMap("MethodName")
    public String methodName;

    /**
     * <p>Specifies whether to enable the monitoring rule in the production environment.</p>
     * <br>
     * <p>*   true: The monitoring rule is triggered when the associated auto triggered node that generates the output data starts to run.</p>
     * <p>*   false: The monitoring rule is not triggered when the associated auto triggered node that generates the output data starts to run.</p>
     */
    @NameInMap("OpenSwitch")
    public Boolean openSwitch;

    /**
     * <p>The comparison operator, such as >, >=, =, ≠, <, or <=.</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Specifies whether the threshold is a dynamic threshold. Valid values:</p>
     * <br>
     * <p>*   0: indicates that the threshold is not a dynamic threshold.</p>
     * <p>*   2: indicates that the threshold is a dynamic threshold.</p>
     */
    @NameInMap("PredictType")
    public Integer predictType;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the name.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the field to be monitored.</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The data type of the field.</p>
     */
    @NameInMap("PropertyType")
    public String propertyType;

    /**
     * <p>The name of the monitoring rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the monitoring rule. Valid values:</p>
     * <br>
     * <p>*   0: The monitoring rule is created by the system.</p>
     * <p>*   1: The monitoring rule is created by a user.</p>
     * <p>*   2: The monitoring rule is a workspace-level rule.</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("TaskSetting")
    public String taskSetting;

    /**
     * <p>The ID of the monitoring template. You can call the [ListQualityRules](~~173995~~) operation to obtain the ID of the monitoring template that is used to create the monitoring rule.</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>The trend of the monitoring result. Valid values:</p>
     * <br>
     * <p>*   up: increasing</p>
     * <p>*   down: decreasing</p>
     * <p>*   abs: absolute value</p>
     */
    @NameInMap("Trend")
    public String trend;

    /**
     * <p>The threshold for a warning alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements.</p>
     */
    @NameInMap("WarningThreshold")
    public String warningThreshold;

    /**
     * <p>The filter condition or custom SQL statement that is used for monitoring.</p>
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
