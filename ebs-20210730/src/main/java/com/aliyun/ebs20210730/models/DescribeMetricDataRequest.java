// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataRequest extends TeaModel {
    /**
     * <p>Aggregation method in time dimension. Valid values:</p>
     * <ul>
     * <li>SUM</li>
     * <li>COUNT</li>
     * <li>AVG</li>
     * <li>MAX</li>
     * <li>MIN</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUM</p>
     */
    @NameInMap("AggreOps")
    public String aggreOps;

    /**
     * <p>The dimension map in the JSON format. A dimension is a key-value pair. Valid dimension key: diskId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;diskId&quot;:[&quot;d-bp14xxxx&quot;,&quot;d-bp11xxxx&quot;]}</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query. The specified time must be later than the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-21T02:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <ul>
     * <li>disk_bps_percent</li>
     * <li>disk_iops_percent</li>
     * <li>disk_read_block_size</li>
     * <li>disk_read_bps</li>
     * <li>disk_read_iops</li>
     * <li>disk_read_latency</li>
     * <li>disk_write_block_size</li>
     * <li>disk_write_bps</li>
     * <li>disk_write_iops</li>
     * <li>disk_write_latency</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disk_bps_percent</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The interval at which metric data is collected. Unit: seconds. Default value: 60. Valid values: 60, 300, 600, and 3600, which support queries for time ranges of up to 2 hours, 2 hours, 1 day, and 7 days, respectively. For example, if you set Period to 60, the end time is less than 2 hours from the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. You can specify a point in time that is up to one year apart from the current time. If StartTime and EndTime are both unspecified, the monitoring metric data of the last Period value is queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-21T01:50:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataRequest self = new DescribeMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDataRequest setAggreOps(String aggreOps) {
        this.aggreOps = aggreOps;
        return this;
    }
    public String getAggreOps() {
        return this.aggreOps;
    }

    public DescribeMetricDataRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeMetricDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
