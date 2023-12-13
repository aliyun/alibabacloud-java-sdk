// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the event-triggered alert rule.</p>
     * <br>
     * <p>For information about how to obtain the name of an event-triggered alert rule, see [DescribeEventRuleList](~~114996~~).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met.</p>
     * <br>
     * <p>Unit: seconds. Default value: 86400, which indicates one day.</p>
     * <br>
     * <p>>  Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.</p>
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
