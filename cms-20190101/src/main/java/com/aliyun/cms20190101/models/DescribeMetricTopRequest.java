// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopRequest extends TeaModel {
    /**
     * <p>The monitoring dimensions of the specified resource.</p>
     * <br>
     * <p>Set the value to a collection of `key:value` pairs. Example: `{"userId":"120886317861****"}` or `{"instanceId":"i-2ze2d6j5uhg20x47****"}`.</p>
     * <br>
     * <p>>  You can query a maximum of 50 instances in each request.</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query monitoring data.</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.````</p>
     * <br>
     * <p>    *   If you set the `Period` parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</p>
     * <br>
     * <p>The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</p>
     * <p>*   Time format: YYYY-MM-DDThh:mm:ssZ</p>
     * <br>
     * <p>>  We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression that is used to compute the query results in real time.</p>
     * <br>
     * <p>>  Only the `groupby` expression is supported. This expression is similar to the GROUP BY statement used in databases.</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Default value: 10.</p>
     * <br>
     * <p>>  The maximum value of the Length parameter in a request is 1440.</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * <br>
     * <p>For more information about metric names, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The order in which data is sorted. Valid values:</p>
     * <br>
     * <p>*   True: sorts data in ascending order.</p>
     * <p>*   False (default): sorts data in descending order.</p>
     */
    @NameInMap("OrderDesc")
    public String orderDesc;

    /**
     * <p>The field based on which data is sorted. Valid values:</p>
     * <br>
     * <p>*   Average</p>
     * <p>*   Minimum</p>
     * <p>*   Maximum</p>
     */
    @NameInMap("Orderby")
    public String orderby;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <br>
     * <p>Valid values: 15, 60, 900, and 3600.</p>
     * <br>
     * <p>Unit: seconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If this parameter is not specified, monitoring data is queried based on the period in which metric values are reported.</p>
     * <br>
     * <p>*   Statistical periods vary based on the metrics that are specified by `MetricName`. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start of the time range to query monitoring data.</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.````</p>
     * <br>
     * <p>    *   If you set the `Period` parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</p>
     * <br>
     * <p>The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</p>
     * <p>*   Time format: YYYY-MM-DDThh:mm:ssZ</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must set the `StartTime` parameter to a point in time that is later than 00:00:00 Thursday, January 1, 1970. Otherwise, this parameter is invalid.</p>
     * <br>
     * <p>*   We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
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
