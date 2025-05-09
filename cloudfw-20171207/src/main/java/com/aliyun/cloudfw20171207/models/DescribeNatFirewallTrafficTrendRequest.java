// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallTrafficTrendRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp that is accurate to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1739330580</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>60</strong>: 1 minute</li>
     * <li><strong>1800</strong>: 30 minutes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxxxxx</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The private IP address of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>10.100.134.60</p>
     */
    @NameInMap("SrcPrivateIP")
    public String srcPrivateIP;

    /**
     * <p>The public IP address of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>47.112.210.136</p>
     */
    @NameInMap("SrcPublicIP")
    public String srcPublicIP;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1739326980</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeNatFirewallTrafficTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallTrafficTrendRequest self = new DescribeNatFirewallTrafficTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallTrafficTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeNatFirewallTrafficTrendRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeNatFirewallTrafficTrendRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatFirewallTrafficTrendRequest setSrcPrivateIP(String srcPrivateIP) {
        this.srcPrivateIP = srcPrivateIP;
        return this;
    }
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    public DescribeNatFirewallTrafficTrendRequest setSrcPublicIP(String srcPublicIP) {
        this.srcPublicIP = srcPublicIP;
        return this;
    }
    public String getSrcPublicIP() {
        return this.srcPublicIP;
    }

    public DescribeNatFirewallTrafficTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
