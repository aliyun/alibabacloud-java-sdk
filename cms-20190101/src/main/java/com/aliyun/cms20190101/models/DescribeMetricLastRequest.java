// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricLastRequest extends TeaModel {
    /**
     * <p>The monitoring dimensions of the specified resource.</p>
     * <p>Format: a collection of <code>key:value</code> pairs. Example: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> or <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
     * <blockquote>
     * <p>A maximum of 50 instances can be queried in a single request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end time for querying the metric.</p>
     * <p>The system automatically limits the query start time (query window size) based on data granularity:</p>
     * <ol>
     * <li>Second-level data: The maximum query span is 20 minutes (start time = Max(startTime, EndTime - 20min)).</li>
     * <li>Minute-level data: The maximum query span is 2 hours (start time = Max(startTime, EndTime - 2h)).</li>
     * <li>Hour-level data: The maximum query span is 2 days (start time = Max(startTime, EndTime - 2d)).</li>
     * </ol>
     * <blockquote>
     * <p>If the specified startTime is earlier than the limit, the system automatically uses the limit as the actual query start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-01-31 10:10:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression for real-time computation on existing query results.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries per page for monitoring data. This parameter is used for paged query.</p>
     * <p>Default value: 1000, which indicates 1000 entries of monitoring data per page.</p>
     * <blockquote>
     * <p>The maximum value of Length in a single request is 1440.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The metric name of the cloud service.</p>
     * <p>For information about metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <p>For information about namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The pagination cursor.</p>
     * <ul>
     * <li>If the query results that match the filter conditions exceed the page size, a pagination cursor is returned.</li>
     * <li>To retrieve the next page of data, use the returned cursor value as the request parameter until no cursor value is returned, which indicates that all data has been retrieved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>15761432850009dd70bb64cff1f0fff6c0b08ffff073be5fb1e785e2b020f7fed9b5e137bd810a6d6cff5ae****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <p>Valid values: 15, 60, 900, and 3600.</p>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the statistical period, monitoring data is queried based on the reporting period that was specified when the metric was registered.<ul>
     * <li>The statistical period varies by metric (<code>MetricName</code>) for each cloud service. For more information, see the <code>Min Periods</code> column on the metric list page of the target cloud service in <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time.</p>
     * <p>Two formats are supported: 1. A UNIX timestamp string in milliseconds (ms), which represents the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC. 2. A time string in the ISO 8601 format of YYYY-MM-DDThh:mm:ssZ in UTC.</p>
     * <blockquote>
     * <p>The query range uses a left-exclusive and right-inclusive mode. StartTime cannot be equal to or greater than EndTime, and the interval between them must be less than or equal to 31 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-01-31 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricLastRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricLastRequest self = new DescribeMetricLastRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricLastRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricLastRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricLastRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public DescribeMetricLastRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricLastRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricLastRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricLastRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricLastRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricLastRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricLastRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
