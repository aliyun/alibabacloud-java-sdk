// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    @NameInMap("MatchType")
    public Integer matchType;

    @NameInMap("Name")
    public String name;

    @NameInMap("QualityRuleId")
    public Long qualityRuleId;

    @NameInMap("RuleTag")
    public Integer ruleTag;

    public static EditQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EditQualityRuleRequest self = new EditQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public EditQualityRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EditQualityRuleRequest setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public EditQualityRuleRequest setMatchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }
    public Integer getMatchType() {
        return this.matchType;
    }

    public EditQualityRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditQualityRuleRequest setQualityRuleId(Long qualityRuleId) {
        this.qualityRuleId = qualityRuleId;
        return this;
    }
    public Long getQualityRuleId() {
        return this.qualityRuleId;
    }

    public EditQualityRuleRequest setRuleTag(Integer ruleTag) {
        this.ruleTag = ruleTag;
        return this;
    }
    public Integer getRuleTag() {
        return this.ruleTag;
    }

}
