// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricListRequest extends TeaModel {
    /**
     * <p>The dimensions that specify the resources to be monitored.</p>
     * <p>Format: a collection of key-value pairs, such as <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
     * <blockquote>
     * <p>A single request can be used to query a maximum of 50 instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
     * </li>
     * <li><p>Format: YYYY-MM-DD hh:mm:ss.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The interval between \<code>StartTime\\</code> and \<code>EndTime\\</code> must be less than or equal to 31 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-01-30 00:10:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression that is used for real-time computing based on the query results.</p>
     * <blockquote>
     * <p>Only the groupby expression is supported. This expression is similar to the GROUP BY statement in databases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries to return on each page for a paged query.</p>
     * <blockquote>
     * <p>The maximum value of \<code>Length\\</code> in a single request is 1440.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The name of the metric.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The pagination cursor.</p>
     * <blockquote>
     * <p>If you do not set this parameter, the first page of data is returned. If a value is returned for this parameter, it indicates that more data is available. To retrieve the next page, use the returned value as the \<code>NextToken\\</code> in your next request. A null value indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15761485350009dd70bb64cff1f0fff750b08ffff073be5fb1e785e2b020f1a949d5ea14aea7fed82f01dd8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <p>Valid values: 15, 60, 900, and 3600.</p>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set this parameter, the reporting period that was specified when the metric was registered is used.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The statistical period of each metric (<code>MetricName</code>) of a cloud service is different. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
     * </li>
     * <li><p>Format: YYYY-MM-DD hh:mm:ss.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The time range is a left-open and right-closed interval. The value of \<code>StartTime\\</code> must be earlier than the value of \<code>EndTime\\</code>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The interval between \<code>StartTime\\</code> and \<code>EndTime\\</code> must be less than or equal to 31 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-01-30 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListRequest self = new DescribeMetricListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricListRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public DescribeMetricListRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
