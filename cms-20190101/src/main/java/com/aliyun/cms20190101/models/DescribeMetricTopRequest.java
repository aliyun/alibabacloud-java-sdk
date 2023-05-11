// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopRequest extends TeaModel {
    /**
     * <p>The dimensions that specify the resources whose monitoring data you want to query.</p>
     * <br>
     * <p>Set the value to a collection of key-value pairs. A typical key-value pair is `instanceId:i-2ze2d6j5uhg20x47****`.</p>
     * <br>
     * <p>>  You can query a maximum of 50 instances in a single request.</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The statistical period of the monitoring data. Unit: seconds. Valid values: 15, 60, 900, and 3600.</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The start of the time range to query monitoring data.</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.```` The following examples demonstrate how to determine the period in which monitoring data is queried:</p>
     * <br>
     * <p>    *   If you set the `Period` parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</p>
     * <br>
     * <p>The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</p>
     * <p>*   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must set the `StartTime` parameter to a point in time that is later than 00:00:00 Thursday, January 1, 1970. Otherwise, this parameter is invalid.</p>
     * <p>*   We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeMetricTop**.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

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
     * <p>*   Statistical periods vary based on metrics that are specified by `MetricName`. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("OrderDesc")
    public String orderDesc;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 10.</p>
     * <br>
     * <p>>  The maximum value of the Length parameter in a request is 1440.</p>
     */
    @NameInMap("Orderby")
    public String orderby;

    /**
     * <p>The field based on which data is sorted. Valid values:</p>
     * <br>
     * <p>*   Average: the average value</p>
     * <p>*   Minimum: the minimum value</p>
     * <p>*   Maximum: the maximum value</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The end of the time range to query monitoring data.</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
     * <br>
     * <p>*   If the `StartTime` and `EndTime` parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.```` The following examples demonstrate how to determine the period in which monitoring data is queried:</p>
     * <br>
     * <p>    *   If you set the `Period` parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</p>
     * <p>    *   If you set the `Period` parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</p>
     * <br>
     * <p>The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</p>
     * <p>*   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format</p>
     * <br>
     * <p>>  We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
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
