// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to overwrite existing resources. Valid values:</p>
     * <ul>
     * <li>true: The resources submitted this time overwrite the previously associated resources.</li>
     * <li>false: The resources submitted this time do not overwrite the previously associated resources. The associated resources after submission include the previously associated resources and the resources submitted this time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Overwrite")
    public String overwrite;

    /**
     * <p>The resources that are associated with the alert rule. Set the value to a JSON array.</p>
     * <blockquote>
     * <p> You can add up to 100 resources each time. An alert rule can be associated with up to 3,000 resources.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-a2d5q7pm3f9yr29e****&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze3w55tr2rcpejpcfap_59c96b85-0339-4f35-ba66-ae4e34d3****</p>
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
