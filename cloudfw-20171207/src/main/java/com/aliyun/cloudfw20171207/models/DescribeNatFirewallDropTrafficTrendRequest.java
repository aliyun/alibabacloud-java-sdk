// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallDropTrafficTrendRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1758334822</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>122.190.56.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1740968766</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeNatFirewallDropTrafficTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallDropTrafficTrendRequest self = new DescribeNatFirewallDropTrafficTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallDropTrafficTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeNatFirewallDropTrafficTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNatFirewallDropTrafficTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
