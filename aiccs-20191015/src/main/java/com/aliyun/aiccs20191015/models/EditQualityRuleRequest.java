// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityRuleRequest extends TeaModel {
    /**
     * <p>The ID of the AICCS instance. You can obtain the instance ID in the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of keywords.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    /**
     * <p>The keyword match type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Matches any keyword.</li>
     * <li><strong>2</strong>: Matches all keywords.</li>
     * <li><strong>3</strong>: Matches no keyword.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the quality check rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated quality check rule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the quality check item rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5369</p>
     */
    @NameInMap("QualityRuleId")
    public Long qualityRuleId;

    /**
     * <p>The tag of the quality check rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>638</p>
     */
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
