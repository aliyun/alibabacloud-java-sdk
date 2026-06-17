// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDropTrafficTrendRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1747792853</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: ascending order.</p>
     * </li>
     * <li><p><strong>desc</strong>: descending order. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sorting criterion.</p>
     * 
     * <strong>example:</strong>
     * <p>LastTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>183.237.161.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The time point of the traffic. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
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
