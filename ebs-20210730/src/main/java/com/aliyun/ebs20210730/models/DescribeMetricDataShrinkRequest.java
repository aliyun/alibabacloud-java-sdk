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
     * <p>Dimension map, in JSON format, representing the dimensions being queried. The currently available keys are:</p>
     * <ul>
     * <li>DiskId: Cloud disk name, e.g., d-xxx.</li>
     * <li>DeviceType: Type of cloud disk, system indicates system disk, data indicates data disk.</li>
     * <li>DeviceCategory: Category of cloud disk, e.g., cloud_essd.</li>
     * <li>EcsInstanceId: Name of the ECS instance where the disk is located, e.g., i-xxx.</li>
     * </ul>
     * <p>The returned results are the intersection of all dimension filter conditions.</p>
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
     * <p>The interval for obtaining metric data. Unit: seconds. The default value is 5 seconds. Possible values include:</p>
     * <ul>
     * <li>5: 5s precision query, can query up to 12 hours of data</li>
     * <li>10: 10s precision query, can query up to 24 hours of data</li>
     * <li>60: 60s precision query, can query up to 7 days of data</li>
     * <li>3600: 3600s precision query, can query up to 30 days of data</li>
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
     * <p>The start time point for obtaining metric data. The earliest selectable time is one year before the current moment. When both StartTime and EndTime parameters are empty, it defaults to querying the most recent period\&quot;s monitoring metrics. Represented according to the ISO 8601 standard, using UTC +0 time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
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
