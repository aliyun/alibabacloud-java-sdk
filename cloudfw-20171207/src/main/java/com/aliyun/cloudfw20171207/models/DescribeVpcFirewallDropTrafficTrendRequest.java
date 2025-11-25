// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDropTrafficTrendRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1747792853</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>LastTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>183.237.161.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>1739337840</p>
     */
    @NameInMap("TrafficTime")
    public Long trafficTime;

    public static DescribeVpcFirewallDropTrafficTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDropTrafficTrendRequest self = new DescribeVpcFirewallDropTrafficTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDropTrafficTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeVpcFirewallDropTrafficTrendRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeVpcFirewallDropTrafficTrendRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeVpcFirewallDropTrafficTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeVpcFirewallDropTrafficTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeVpcFirewallDropTrafficTrendRequest setTrafficTime(Long trafficTime) {
        this.trafficTime = trafficTime;
        return this;
    }
    public Long getTrafficTime() {
        return this.trafficTime;
    }

}
