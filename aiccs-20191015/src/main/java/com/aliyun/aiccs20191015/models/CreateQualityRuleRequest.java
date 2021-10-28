// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    @NameInMap("MatchType")
    public Integer matchType;

    @NameInMap("Name")
    public String name;

    @NameInMap("RuleTag")
    public Integer ruleTag;

    public static CreateQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRuleRequest self = new CreateQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQualityRuleRequest setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public CreateQualityRuleRequest setMatchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }
    public Integer getMatchType() {
        return this.matchType;
    }

    public CreateQualityRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateQualityRuleRequest setRuleTag(Integer ruleTag) {
        this.ruleTag = ruleTag;
        return this;
    }
    public Integer getRuleTag() {
        return this.ruleTag;
    }

}
