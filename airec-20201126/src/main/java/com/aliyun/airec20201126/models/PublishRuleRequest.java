// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PublishRuleRequest extends TeaModel {
    /**
     * <p>The type of the rule. Example: selection and operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selection</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

    /**
     * <p>The scene ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    public static PublishRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRuleRequest self = new PublishRuleRequest();
        return TeaModel.build(map, self);
    }

    public PublishRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public PublishRuleRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
