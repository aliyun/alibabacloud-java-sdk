// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricRequest extends TeaModel {
    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Filters")
    public java.util.List<QueryMetricRequestFilters> filters;

    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    @NameInMap("Metric")
    @Validation(required = true)
    public String metric;

    @NameInMap("Measures")
    @Validation(required = true)
    public java.util.List<String> measures;

    @NameInMap("Order")
    public String order;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ConsistencyDataKey")
    public String consistencyDataKey;

    @NameInMap("ConsistencyQueryStrategy")
    public String consistencyQueryStrategy;

    public static QueryMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricRequest self = new QueryMetricRequest();
        return TeaModel.build(map, self);
    }

    public static class QueryMetricRequestFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryMetricRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricRequestFilters self = new QueryMetricRequestFilters();
            return TeaModel.build(map, self);
        }

    }

}
