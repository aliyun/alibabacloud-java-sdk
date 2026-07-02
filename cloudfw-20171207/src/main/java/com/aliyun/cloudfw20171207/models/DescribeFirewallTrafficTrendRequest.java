// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTrafficTrendRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1758474000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1758470400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeFirewallTrafficTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTrafficTrendRequest self = new DescribeFirewallTrafficTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTrafficTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFirewallTrafficTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFirewallTrafficTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
