// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSceneRuleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleContent")
    public String ruleContent;

    @NameInMap("RuleDescription")
    public String ruleDescription;

    public static CreateSceneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRuleRequest self = new CreateSceneRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSceneRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateSceneRuleRequest setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
        return this;
    }
    public String getRuleContent() {
        return this.ruleContent;
    }

    public CreateSceneRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

}
