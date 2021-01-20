// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleResourcesRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Resources")
    public String resources;

    public static DeleteMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleResourcesRequest self = new DeleteMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleResourcesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteMetricRuleResourcesRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
