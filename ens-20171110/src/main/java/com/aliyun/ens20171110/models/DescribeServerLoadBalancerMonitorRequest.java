// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServerLoadBalancerMonitorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-15 17:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5sc1s9zrui8lpb8u7cl4f****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-15 16:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeServerLoadBalancerMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerLoadBalancerMonitorRequest self = new DescribeServerLoadBalancerMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerLoadBalancerMonitorRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeServerLoadBalancerMonitorRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeServerLoadBalancerMonitorRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
