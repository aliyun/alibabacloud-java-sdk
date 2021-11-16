// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleRequest extends TeaModel {
    @NameInMap("BlockType")
    public Integer blockType;

    @NameInMap("Checker")
    public Integer checker;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("ExpectValue")
    public String expectValue;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PredictType")
    public Integer predictType;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Property")
    public String property;

    @NameInMap("PropertyType")
    public String propertyType;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("TemplateId")
    public Integer templateId;

    @NameInMap("Trend")
    public String trend;

    @NameInMap("WarningThreshold")
    public String warningThreshold;

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
