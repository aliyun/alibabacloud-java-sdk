// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeRuleRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("RuleType")
    public String ruleType;

    public static DescribeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleRequest self = new DescribeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public DescribeRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
