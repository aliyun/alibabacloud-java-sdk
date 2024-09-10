// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricListRequest extends TeaModel {
    /**
     * <p>The dimensions that specify the resources whose monitoring data you want to query.</p>
     * <p>Set the value to a collection of key-value pairs. A typical key-value pair is <code>instanceId:i-2ze2d6j5uhg20x47****</code>.</p>
     * <blockquote>
     * <p> You can query a maximum of 50 instances in a single request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
     * <li>UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-01-30 00:10:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression that is used to compute the query results in real time.</p>
     * <blockquote>
     * <p> Only the groupby expression is supported. This expression is similar to the GROUP BY statement that is used in databases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries to return on each page.</p>
     * <blockquote>
     * <p> The maximum value of the Length parameter in a request is 1440.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The name of the metric.</p>
     * <p>For more information about metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service. Format: acs_service name.</p>
     * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The paging token.</p>
     * <blockquote>
     * <p> If this parameter is not specified, the data on the first page is returned. A return value other than Null of this parameter indicates that not all entries have been returned. You can use this value as an input parameter to obtain entries on the next page. The value Null indicates that all query results have been returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15761485350009dd70bb64cff1f0fff750b08ffff073be5fb1e785e2b020f1a949d5ea14aea7fed82f01dd8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The interval at which the monitoring data is queried.</p>
     * <p>Valid values: 60, 300, and 900.</p>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * <p> Configure this parameter based on your business scenario.</p>
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
     * <p>The beginning of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
     * <li>UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format</li>
     * </ul>
     * <blockquote>
     * <p> The specified period includes the end time and excludes the start time. The start time must be earlier than the end time.</p>
     * </blockquote>
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
