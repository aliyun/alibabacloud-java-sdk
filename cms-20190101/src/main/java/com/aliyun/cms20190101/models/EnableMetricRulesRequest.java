// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the alert rules.</p>
     * <br>
     * <p>Valid values of N: 1 to 100.</p>
     * <br>
     * <p>For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleId")
    public java.util.List<String> ruleId;

    public static EnableMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRulesRequest self = new EnableMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableMetricRulesRequest setRuleId(java.util.List<String> ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public java.util.List<String> getRuleId() {
        return this.ruleId;
    }

}
