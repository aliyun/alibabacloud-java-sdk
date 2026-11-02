// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenMonitorRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-30 08:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The load balancer instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5q73cv04zeyh43lh74lp4****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The network protocol, such as TCP or UDP.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15 16:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The VIP port of the load balancer instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("VPort")
    public String VPort;

    public static DescribeLoadBalancerListenMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenMonitorRequest self = new DescribeLoadBalancerListenMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenMonitorRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLoadBalancerListenMonitorRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerListenMonitorRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeLoadBalancerListenMonitorRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLoadBalancerListenMonitorRequest setVPort(String VPort) {
        this.VPort = VPort;
        return this;
    }
    public String getVPort() {
        return this.VPort;
    }

}
