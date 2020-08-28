// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRuleRequest extends TeaModel {
    @NameInMap("BlockType")
    @Validation(required = true)
    public Integer blockType;

    @NameInMap("EntityId")
    @Validation(required = true)
    public Long entityId;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Checker")
    public Integer checker;

    @NameInMap("ExpectValue")
    public String expectValue;

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
    @Validation(required = true)
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
    @Validation(required = true)
    public String ruleName;

    @NameInMap("PredictType")
    @Validation(required = true)
    public Integer predictType;

    public static CreateQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRuleRequest self = new CreateQualityRuleRequest();
        return TeaModel.build(map, self);
    }

}
