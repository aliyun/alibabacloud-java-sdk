// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricLastRequest extends TeaModel {
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
     * <p>*   For second-level data, the start time is obtained by comparing the time that is specified by the StartTime parameter and 20 minutes earlier of the time that is specified by the EndTime parameter. The earlier one of the compared points in time is used as the start time.</p>
     * <p>*   For minute-level data, the start time is obtained by comparing the time that is specified by the StartTime parameter and 2 hours earlier of the time that is specified by the EndTime parameter. The earlier one of the compared points in time is used as the start time.</p>
     * <p>*   For hour-level data, the start time is obtained by comparing the time that is specified by the StartTime parameter and two days earlier of the time that is specified by the EndTime parameter. The earlier one of the compared points in time is used as the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression that is used to calculate the query results in real time.</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Default value: 1000. This value indicates that a maximum of 1,000 entries of monitoring data can be returned on each page.</p>
     * <br>
     * <p>>  The maximum value of the Length parameter for each request is 1440.</p>
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
     * <p>The pagination token.</p>
     * <br>
     * <p>*   If the number of results exceeds the maximum number of entries allowed on a single page, a pagination token is returned.</p>
     * <p>*   This token can be used as an input parameter to obtain the next page of results. If all results are obtained, no token is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <br>
     * <p>Valid values: 15, 60, 900, and 3600.</p>
     * <br>
     * <p>Unit: seconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If this parameter is not specified, monitoring data is queried based on the period in which metric values are reported. The statistical period of metrics (`MetricName`) varies for each cloud service. The statistical period of metrics is displayed in the `MinPeriods` column on the **Metrics** page for each cloud service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start of the time range to query monitoring data.</p>
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
