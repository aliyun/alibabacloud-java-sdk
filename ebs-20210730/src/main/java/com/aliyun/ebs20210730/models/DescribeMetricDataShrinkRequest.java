// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataShrinkRequest extends TeaModel {
    /**
     * <p>Aggregation method over time. Possible values include:</p>
     * <ul>
     * <li>SUM_OVER_TIME</li>
     * <li>COUNT_OVER_TIME</li>
     * <li>AVG_OVER_TIME</li>
     * <li>MAX_OVER_TIME</li>
     * <li>MIN_OVER_TIME</li>
     * <li>SUM_OVER_TIME_LCRO: Sum over a left-closed, right-open interval</li>
     * <li>AVG_OVER_TIME_LCRO: Average over a left-closed, right-open interval</li>
     * <li>SUM_OVER_TIME_LORC: Sum over a left-open, right-closed interval</li>
     * <li>AVG_OVER_TIME_LORC: Average over a left-open, right-closed interval</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVG_OVER_TIME</p>
     */
    @NameInMap("AggreOps")
    public String aggreOps;

    /**
     * <p>Aggregation method between lines. Possible values include:</p>
     * <ul>
     * <li>NON: No aggregation</li>
     * <li>SUM: Sum</li>
     * <li>AVG: Average</li>
     * <li>COUNT: Count</li>
     * <li>MAX: Maximum</li>
     * <li>MIN: Minimum</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NON</p>
     */
    @NameInMap("AggreOverLineOps")
    public String aggreOverLineOps;

    /**
     * <p>The dimension map, in the JSON format. Valid values:</p>
     * <ul>
     * <li>DiskId: the disk name. Example: d-xxx.</li>
     * <li>DeviceType: the disk type. system indicates the system disk, and data indicates the data disk.</li>
     * <li>DeviceCategory: the disk category. Example: cloud_essd.</li>
     * <li>EcsInstanceId: the ECS instance name. Example: i-xxx.</li>
     * <li>Azone: the zone, such as cn-hangzhou-a.</li>
     * </ul>
     * <p>The returned result is the intersection of all dimension filtering conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DiskId&quot;:[&quot;d-bp14xxxx&quot;,&quot;d-bp11xxxx&quot;], &quot;DeviceCategory&quot;: [&quot;cloud_essd&quot;]}</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end time point for obtaining metric data. It should not be later than the current moment. Represented according to the ISO 8601 standard, using UTC +0 time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-21T02:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of fields used for grouping and aggregation.</p>
     */
    @NameInMap("GroupByLabels")
    public String groupByLabelsShrink;

    /**
     * <p>Metric name. Possible values include:</p>
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
     * <p>The granularity at which data is collected for the metric. Unit: seconds. Default value: 5. Valid values:</p>
     * <ul>
     * <li>5: 5 seconds. The query time range can be up to 12 hours.</li>
     * <li>10: 10 seconds. The query time range can be up to 24 hours.</li>
     * <li>60: 60 seconds. The query time range can be up to 7 days.</li>
     * <li>300: 300 seconds. The query time range can be up to 30 days.</li>
     * <li>600: 600 seconds. The query time range can be up to 30 days.</li>
     * <li>3600: 3,600 seconds. The query time range can be up to 30 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. You can specify a point in time that is up to 30 days before the current time. If both StartTime and EndTime are left empty, the monitoring metric data of the most recent statistical period is queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
