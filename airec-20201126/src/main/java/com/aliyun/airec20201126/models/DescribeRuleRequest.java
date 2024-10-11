// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeRuleRequest extends TeaModel {
    /**
     * <p>The returned result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selection</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

    /**
     * <p>The type of the rule.</p>
     * <p>Valid values: selection and operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    public static DescribeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleRequest self = new DescribeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeRuleRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
