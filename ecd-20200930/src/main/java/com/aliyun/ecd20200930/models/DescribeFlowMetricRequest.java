// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricRequest extends TeaModel {
    /**
     * <p>The end of the time range to query data. The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>*   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance. The value can be the ID of the cloud desktop or the ID of the Internet access package.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance. You can select a cloud desktop or a network package as an instance. If you select a cloud desktop as an instance, you need to configure the `InstanceId` and `MetricType` parameters. If you select a network package as an instance, you also need to must configure the parameters.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The type of the monitoring data. The monitoring data includes the inbound bandwidth and the outbound bandwidth of the cloud desktop, or the workspace bandwidth that is originated from or destined for the Internet.</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The interval at which monitoring data is collected. Unit: seconds.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>*   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeFlowMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricRequest self = new DescribeFlowMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeFlowMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFlowMetricRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeFlowMetricRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeFlowMetricRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeFlowMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowMetricRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
