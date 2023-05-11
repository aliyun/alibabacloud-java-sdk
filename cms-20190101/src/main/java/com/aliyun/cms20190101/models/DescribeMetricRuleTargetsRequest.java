// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DescribeMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTargetsRequest self = new DescribeMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricRuleTargetsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
