// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricLogsRequest extends TeaModel {
    /**
     * <p>The data aggregation interval. Unit: seconds.</p>
     * <br>
     * <p>Valid values: 1, 10, 60, 600, and 3600.</p>
     * <br>
     * <p>Default value: 1</p>
     */
    @NameInMap("AggregationInterval")
    public Integer aggregationInterval;

    /**
     * <p>The data aggregation type. Valid values:</p>
     * <br>
     * <p>*   sum: the sum of the data</p>
     * <p>*   avg: the average value</p>
     * <p>*   max: the maximum value</p>
     * <p>*   min: the minimum value</p>
     * <br>
     * <p>Aggregation is disabled by default.</p>
     */
    @NameInMap("AggregationType")
    public String aggregationType;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter conditions. A JSON string consisting of one or more key:value pairs. Value range of key:</p>
     * <br>
     * <p>*   InstanceId: the ID of the node</p>
     * <p>*   Hostname: the hostname of the node</p>
     * <p>*   NetworkInterface: the name of the network interface</p>
     * <p>*   DiskDevice: the name of the disk</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The category of the output performance metrics. Separate multiple metrics with commas (,). Valid values:</p>
     * <br>
     * <p>*   cpu</p>
     * <p>*   memory</p>
     */
    @NameInMap("MetricCategories")
    public String metricCategories;

    /**
     * <p>The dimensions of the performance metric. Valid values:</p>
     * <br>
     * <p>*   machine</p>
     * <p>*   process</p>
     * <p>*   network</p>
     * <p>*   disk</p>
     */
    @NameInMap("MetricScope")
    public String metricScope;

    /**
     * <p>Logs are returned in reverse order of timestamps.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("To")
    public Integer to;

    public static GetCloudMetricLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricLogsRequest self = new GetCloudMetricLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudMetricLogsRequest setAggregationInterval(Integer aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
    public Integer getAggregationInterval() {
        return this.aggregationInterval;
    }

    public GetCloudMetricLogsRequest setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }
    public String getAggregationType() {
        return this.aggregationType;
    }

    public GetCloudMetricLogsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetCloudMetricLogsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public GetCloudMetricLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetCloudMetricLogsRequest setMetricCategories(String metricCategories) {
        this.metricCategories = metricCategories;
        return this;
    }
    public String getMetricCategories() {
        return this.metricCategories;
    }

    public GetCloudMetricLogsRequest setMetricScope(String metricScope) {
        this.metricScope = metricScope;
        return this;
    }
    public String getMetricScope() {
        return this.metricScope;
    }

    public GetCloudMetricLogsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetCloudMetricLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
