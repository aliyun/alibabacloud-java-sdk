// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class PublishRuleRequest extends TeaModel {
    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("SceneId")
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
