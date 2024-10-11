// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeUserMetricsRequest extends TeaModel {
    /**
     * <p>The end time. The value is a timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1567155600</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The type of the user metric that you want to query. Valid values: pvCtr and uvCtr.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pvCtr</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The start time. The value is a timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1567152000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static DescribeUserMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserMetricsRequest self = new DescribeUserMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUserMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeUserMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
