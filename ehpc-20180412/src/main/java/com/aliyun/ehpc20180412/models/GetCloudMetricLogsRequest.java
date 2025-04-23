// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricLogsRequest extends TeaModel {
    /**
     * <p>The data aggregation interval. Unit: seconds.</p>
     * <p>Valid values: 1, 10, 60, 600, and 3600.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AggregationInterval")
    public Integer aggregationInterval;

    /**
     * <p>The data aggregation type. Valid values:</p>
     * <ul>
     * <li>sum: the sum of the data</li>
     * <li>avg: the average value</li>
     * <li>max: the maximum value</li>
     * <li>min: the minimum value</li>
     * </ul>
     * <p>Aggregation is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>avg</p>
     */
    @NameInMap("AggregationType")
    public String aggregationType;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter conditions. A JSON-formatted string that contains several key-value pairs. Valid values of the key:</p>
     * <ul>
     * <li>InstanceId: the ID of the node</li>
     * <li>Hostname: the hostname of the node</li>
     * <li>NetworkInterface: the name of the network interface</li>
     * <li>DiskDevice: the name of the disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Hostname&quot;:&quot;compute000&quot;}</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The beginning of the time range to query. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1583907780</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The category of the output performance metrics. Separate multiple metrics with commas (,). Valid values:</p>
     * <ul>
     * <li>cpu</li>
     * <li>memory</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cpu</p>
     */
    @NameInMap("MetricCategories")
    public String metricCategories;

    /**
     * <p>The dimensions of the performance metric. Valid values:</p>
     * <ul>
     * <li>machine</li>
     * <li>process</li>
     * <li>network</li>
     * <li>disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>network</p>
     */
    @NameInMap("MetricScope")
    public String metricScope;

    /**
     * <p>Specifies whether to return logs in reverse order of timestamps. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The end of the time range to query. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1583907790</p>
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
