// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataShrinkRequest extends TeaModel {
    /**
     * <p>The method for aggregating data over time. Valid values:</p>
     * <ul>
     * <li>SUM_OVER_TIME</li>
     * <li>COUNT_OVER_TIME</li>
     * <li>AVG_OVER_TIME</li>
     * <li>MAX_OVER_TIME</li>
     * <li>MIN_OVER_TIME</li>
     * <li>SUM_OVER_TIME_LCRO: The sum of values in a left-closed, right-open interval.</li>
     * <li>AVG_OVER_TIME_LCRO: The average of values in a left-closed, right-open interval.</li>
     * <li>SUM_OVER_TIME_LORC: The sum of values in a left-open, right-closed interval.</li>
     * <li>AVG_OVER_TIME_LORC: The average of values in a left-open, right-closed interval.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVG_OVER_TIME</p>
     */
    @NameInMap("AggreOps")
    public String aggreOps;

    /**
     * <p>The method for aggregating data across different lines. Valid values:</p>
     * <ul>
     * <li>NON: No aggregation is performed.</li>
     * <li>SUM: The sum of values.</li>
     * <li>AVG: The average of values.</li>
     * <li>COUNT: The number of values.</li>
     * <li>MAX: The maximum value.</li>
     * <li>MIN: The minimum value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NON</p>
     */
    @NameInMap("AggreOverLineOps")
    public String aggreOverLineOps;

    /**
     * <p>A map of dimensions in the JSON format. The map specifies the dimensions to query. The following keys are supported:</p>
     * <ul>
     * <li>DiskId: The disk name, such as d-xxx.</li>
     * <li>DeviceType: The disk category. \<code>system\\</code> indicates a system disk and \<code>data\\</code> indicates a data disk.</li>
     * <li>DeviceCategory: The disk type, such as cloud_essd.</li>
     * <li>EcsInstanceId: The name of the ECS instance to which the disk is attached, such as i-xxx.</li>
     * <li>Azone: The zone, such as cn-hangzhou-a.</li>
     * </ul>
     * <p>The returned results are the intersection of all specified dimension-based filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DiskId&quot;:[&quot;d-bp14xxxx&quot;,&quot;d-bp11xxxx&quot;], &quot;DeviceCategory&quot;: [&quot;cloud_essd&quot;]}</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query metric data. The time cannot be later than the current time. The time must be in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-21T02:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A list of fields for grouping and aggregation.</p>
     */
    @NameInMap("GroupByLabels")
    public String groupByLabelsShrink;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <ul>
     * <li>disk_bps_percent</li>
     * <li>disk_iops_percent</li>
     * <li>disk_read_block_size</li>
     * <li>disk_read_bps</li>
     * <li>disk_read_iops</li>
     * <li>disk_write_block_size</li>
     * <li>disk_write_bps</li>
     * <li>disk_write_iops</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disk_bps_percent</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The interval at which to query metric data. Unit: seconds. The default value is 5. Valid values:</p>
     * <ul>
     * <li>5: 5-second precision. You can query data within a 12-hour time range.</li>
     * <li>10: 10-second precision. You can query data within a 24-hour time range.</li>
     * <li>60: 60-second precision. You can query data within a 7-day time range.</li>
     * <li>300: 300-second precision. You can query data within a 30-day time range.</li>
     * <li>600: 600-second precision. You can query data within a 30-day time range.</li>
     * <li>3600: 3600-second precision. You can query data within a 30-day time range.</li>
     * </ul>
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
     * <p>The beginning of the time range to query metric data. The start time can be up to 30 days before the current time. If you leave both the StartTime and EndTime parameters empty, the system queries the metrics for the most recent period. The time must be in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-21T01:50:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataShrinkRequest self = new DescribeMetricDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDataShrinkRequest setAggreOps(String aggreOps) {
        this.aggreOps = aggreOps;
        return this;
    }
    public String getAggreOps() {
        return this.aggreOps;
    }

    public DescribeMetricDataShrinkRequest setAggreOverLineOps(String aggreOverLineOps) {
        this.aggreOverLineOps = aggreOverLineOps;
        return this;
    }
    public String getAggreOverLineOps() {
        return this.aggreOverLineOps;
    }

    public DescribeMetricDataShrinkRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricDataShrinkRequest setGroupByLabelsShrink(String groupByLabelsShrink) {
        this.groupByLabelsShrink = groupByLabelsShrink;
        return this;
    }
    public String getGroupByLabelsShrink() {
        return this.groupByLabelsShrink;
    }

    public DescribeMetricDataShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricDataShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeMetricDataShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
