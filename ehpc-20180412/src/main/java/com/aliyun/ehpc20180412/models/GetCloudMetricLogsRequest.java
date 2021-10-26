// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricLogsRequest extends TeaModel {
    @NameInMap("AggregationInterval")
    public Integer aggregationInterval;

    @NameInMap("AggregationType")
    public String aggregationType;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("From")
    public Integer from;

    @NameInMap("MetricCategories")
    public String metricCategories;

    @NameInMap("MetricScope")
    public String metricScope;

    @NameInMap("Reverse")
    public Boolean reverse;

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
