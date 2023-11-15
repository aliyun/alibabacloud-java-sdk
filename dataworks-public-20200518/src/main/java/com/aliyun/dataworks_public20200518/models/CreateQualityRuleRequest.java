// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRuleRequest extends TeaModel {
    /**
     * <p>The strength of the monitoring rule. Valid values: 0 and 1. 0 indicates that the monitoring rule is a weak rule. 1 indicates that the monitoring rule is a strong rule.</p>
     */
    @NameInMap("BlockType")
    public Integer blockType;

    /**
     * <p>The ID of the checker.</p>
     */
    @NameInMap("Checker")
    public Integer checker;

    /**
     * <p>The description of the monitoring rule.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and a critical alert is reported, nodes are blocked.</p>
     */
    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    /**
     * <p>The ID of the partition filter expression.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The expected value of the monitoring result.</p>
     */
    @NameInMap("ExpectValue")
    public String expectValue;

    /**
     * <p>The method used to collect sample data. If you want to use a custom SQL statement as a sampling method, set this parameter to user_defined.</p>
     */
    @NameInMap("MethodName")
    public String methodName;

    /**
     * <p>The comparison operator of the monitoring rule.</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Specifies whether the monitoring rule is a dynamic threshold rule. Valid values: 0 and 2. 0 indicates that the monitoring rule is not a dynamic threshold rule. 2 indicates that the monitoring rule is a dynamic threshold rule.</p>
     */
    @NameInMap("PredictType")
    public Integer predictType;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The fields that you want to monitor. If you want to monitor all fields in a table and check the table rows, set this parameter to table_count. If you want to monitor all fields in a table and check the table size, set this parameter to table_size.</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The data type of the fields that you want to monitor. If you want to monitor all fields in a table, set this parameter to table. If you want to monitor only a specific field, set this parameter to bigint.</p>
     */
    @NameInMap("PropertyType")
    public String propertyType;

    /**
     * <p>The name of the monitoring rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the monitoring rule. Valid values: 0, 1, and 2. 0 indicates that the monitoring rule is created by the system. 1 indicates that the monitoring rule is created by a user. 2 indicates that the monitoring rule is a workspace-level rule.</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("TaskSetting")
    public String taskSetting;

    /**
     * <p>The ID of the template that is used to create the monitoring rule.</p>
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
     * <p>The filter condition or custom SQL statement.</p>
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
