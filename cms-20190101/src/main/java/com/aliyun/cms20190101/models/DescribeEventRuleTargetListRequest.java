// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleTargetListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the event-triggered alert rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DescribeEventRuleTargetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleTargetListRequest self = new DescribeEventRuleTargetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleTargetListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEventRuleTargetListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
