// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("SilenceTime")
    public String silenceTime;

    public static DescribeEventRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeRequest self = new DescribeEventRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEventRuleAttributeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeEventRuleAttributeRequest setSilenceTime(String silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public String getSilenceTime() {
        return this.silenceTime;
    }

}
