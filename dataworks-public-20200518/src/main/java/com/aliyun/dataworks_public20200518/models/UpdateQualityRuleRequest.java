// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleRequest extends TeaModel {
    @NameInMap("BlockType")
    public Integer blockType;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Checker")
    public Integer checker;

    @NameInMap("ExpectValue")
    public String expectValue;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    @NameInMap("Trend")
    public String trend;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("Property")
    public String property;

    @NameInMap("PropertyType")
    public String propertyType;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("WhereCondition")
    public String whereCondition;

    @NameInMap("CriticalThreshold")
    public String criticalThreshold;

    @NameInMap("WarningThreshold")
    public String warningThreshold;

    @NameInMap("TemplateId")
    public Integer templateId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("PredictType")
    public Integer predictType;

    public static UpdateQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityRuleRequest self = new UpdateQualityRuleRequest();
        return TeaModel.build(map, self);
    }

}
