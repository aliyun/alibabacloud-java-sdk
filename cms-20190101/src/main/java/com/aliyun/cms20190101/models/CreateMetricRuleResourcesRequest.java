// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to overwrite the existing data. Valid values:</p>
     * <br>
     * <p>*   true: The resources submitted this time will overwrite the previous associated resources.</p>
     * <p>*   false: The resources submitted this time will not overwrite the previous associated resources. The associated resources after submission include the previous associated resources and the resources submitted this time.</p>
     */
    @NameInMap("Overwrite")
    public String overwrite;

    /**
     * <p>The resources to be associated with the alert rule. The value is a JSON array.</p>
     * <br>
     * <p>>  You can add up to 100 resources each time. An alert rule can be associated with up to 3,000 resources.</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     */
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
