// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSceneRuleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleContent")
    public String ruleContent;

    @NameInMap("RuleDescription")
    public String ruleDescription;

    public static UpdateSceneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneRuleRequest self = new UpdateSceneRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSceneRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateSceneRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateSceneRuleRequest setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
        return this;
    }
    public String getRuleContent() {
        return this.ruleContent;
    }

    public UpdateSceneRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

}
