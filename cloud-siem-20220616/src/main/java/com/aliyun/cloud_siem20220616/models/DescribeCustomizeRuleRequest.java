// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DescribeCustomizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleRequest self = new DescribeCustomizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCustomizeRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
