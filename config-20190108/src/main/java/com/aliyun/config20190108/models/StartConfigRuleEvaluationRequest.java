// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static StartConfigRuleEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationRequest self = new StartConfigRuleEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
