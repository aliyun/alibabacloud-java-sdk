// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceAggregationsResponseBody extends TeaModel {
    @NameInMap("Aggregations")
    public Aggregations aggregations;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceAggregationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAggregationsResponseBody self = new DescribeResourceAggregationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAggregationsResponseBody setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public Aggregations getAggregations() {
        return this.aggregations;
    }

    public DescribeResourceAggregationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Aggregation extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Keys")
        public String keys;

        public static Aggregation build(java.util.Map<String, ?> map) throws Exception {
            Aggregation self = new Aggregation();
            return TeaModel.build(map, self);
        }

        public Aggregation setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public Aggregation setKeys(String keys) {
            this.keys = keys;
            return this;
        }
        public String getKeys() {
            return this.keys;
        }

    }

    public static class Aggregations extends TeaModel {
        @NameInMap("Aggregation")
        public java.util.List<Aggregation> aggregation;

        public static Aggregations build(java.util.Map<String, ?> map) throws Exception {
            Aggregations self = new Aggregations();
            return TeaModel.build(map, self);
        }

        public Aggregations setAggregation(java.util.List<Aggregation> aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public java.util.List<Aggregation> getAggregation() {
            return this.aggregation;
        }

    }

}
