// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleResourcesRequest extends TeaModel {
    @NameInMap("Overwrite")
    public String overwrite;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("RuleId")
    public String ruleId;

    public static CreateMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleResourcesRequest self = new CreateMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleResourcesRequest setOverwrite(String overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public String getOverwrite() {
        return this.overwrite;
    }

    public CreateMetricRuleResourcesRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public CreateMetricRuleResourcesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
