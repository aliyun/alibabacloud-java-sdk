// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServerLoadBalancerListenMonitorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-16 16:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5rcvo1n1t3hykfhhjwjgqp****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-16 15:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("VPort")
    public String VPort;

    public static DescribeServerLoadBalancerListenMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerLoadBalancerListenMonitorRequest self = new DescribeServerLoadBalancerListenMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerLoadBalancerListenMonitorRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeServerLoadBalancerListenMonitorRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeServerLoadBalancerListenMonitorRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeServerLoadBalancerListenMonitorRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeServerLoadBalancerListenMonitorRequest setVPort(String VPort) {
        this.VPort = VPort;
        return this;
    }
    public String getVPort() {
        return this.VPort;
    }

}
