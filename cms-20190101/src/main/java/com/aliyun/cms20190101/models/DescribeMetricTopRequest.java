// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopRequest extends TeaModel {
    /**
     * <p>The monitoring dimensions of the specified resource.</p>
     * <p>Set the value to a collection of <code>key:value</code> pairs. Example: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> or <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
     * <blockquote>
     * <p> You can query a maximum of 50 instances in each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query monitoring data.</p>
     * <ul>
     * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
     * </li>
     * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.````</p>
     * <ul>
     * <li>If you set the <code>Period</code> parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</li>
     * <li>If you set the <code>Period</code> parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</li>
     * <li>If you set the <code>Period</code> parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
     * <li>Time format: YYYY-MM-DDThh:mm:ssZ</li>
     * </ul>
     * <blockquote>
     * <p> We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-05-08 10:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression that is used to compute the query results in real time.</p>
     * <blockquote>
     * <p> Only the <code>groupby</code> expression is supported. This expression is similar to the GROUP BY statement used in databases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: 10.</p>
     * <blockquote>
     * <p> The maximum value of the Length parameter in a request is 1440.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * <p>For more information about metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The order in which data is sorted. Valid values:</p>
     * <ul>
     * <li>True: sorts data in ascending order.</li>
     * <li>False (default): sorts data in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("OrderDesc")
    public String orderDesc;

    /**
     * <p>The field based on which data is sorted. Valid values:</p>
     * <ul>
     * <li>Average</li>
     * <li>Minimum</li>
     * <li>Maximum</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Orderby")
    public String orderby;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <p>Valid values: 15, 60, 900, and 3600.</p>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If this parameter is not specified, monitoring data is queried based on the period in which metric values are reported.</p>
     * </li>
     * <li><p>Statistical periods vary based on the metrics that are specified by <code>MetricName</code>. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * </li>
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
     * <p>The start of the time range to query monitoring data.</p>
     * <ul>
     * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
     * </li>
     * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.````</p>
     * <ul>
     * <li>If you set the <code>Period</code> parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</li>
     * <li>If you set the <code>Period</code> parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</li>
     * <li>If you set the <code>Period</code> parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
     * <li>Time format: YYYY-MM-DDThh:mm:ssZ</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You must set the <code>StartTime</code> parameter to a point in time that is later than 00:00:00 Thursday, January 1, 1970. Otherwise, this parameter is invalid.</p>
     * </li>
     * <li><p>We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2021-05-08 08:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricTopRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopRequest self = new DescribeMetricTopRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricTopRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricTopRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public DescribeMetricTopRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricTopRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricTopRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricTopRequest setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
        return this;
    }
    public String getOrderDesc() {
        return this.orderDesc;
    }

    public DescribeMetricTopRequest setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }
    public String getOrderby() {
        return this.orderby;
    }

    public DescribeMetricTopRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricTopRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricTopRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
