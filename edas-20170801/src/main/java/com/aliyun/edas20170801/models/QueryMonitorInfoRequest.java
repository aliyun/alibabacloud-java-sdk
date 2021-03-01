// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMonitorInfoRequest extends TeaModel {
    @NameInMap("Start")
    public Long start;

    @NameInMap("End")
    public Long end;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Aggregator")
    public String aggregator;

    @NameInMap("Interval")
    public String interval;

    public static QueryMonitorInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorInfoRequest self = new QueryMonitorInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonitorInfoRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryMonitorInfoRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryMonitorInfoRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMonitorInfoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public QueryMonitorInfoRequest setAggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public String getAggregator() {
        return this.aggregator;
    }

    public QueryMonitorInfoRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

}
