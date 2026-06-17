// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to overwrite. Valid values:</p>
     * <ul>
     * <li><p>true: overwrites. The resources submitted this time overwrite the previously associated resources. That is, full modification is performed.</p>
     * </li>
     * <li><p>false: does not overwrite. The resources submitted this time do not overwrite the previously associated resources (the associated resources are the historical associated resources plus the resources submitted this time). That is, incremental modification is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Overwrite")
    public String overwrite;

    /**
     * <p>The associated resources. The value is in the JSON array format.</p>
     * <blockquote>
     * <p>A maximum of 100 resource instances can be added at a time, and an alert rule can be associated with a maximum of 3,000 instances.</p>
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
