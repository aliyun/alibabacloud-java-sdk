// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityRuleRequest extends TeaModel {
    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The keywords.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    /**
     * <p>The keyword match type. Valid values:	</p>
     * <ul>
     * <li><strong>1</strong>: Any keyword appears.</li>
     * <li><strong>2</strong>: All keywords appear.</li>
     * <li><strong>3</strong>: No keyword appears.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the quality check.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated quality check rule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tag of the quality check rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>638</p>
     */
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
