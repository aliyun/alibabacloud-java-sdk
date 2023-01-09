// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeResourceAggregationsResponseBody extends TeaModel {
    @NameInMap("Aggregations")
    public DescribeResourceAggregationsResponseBodyAggregations aggregations;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceAggregationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAggregationsResponseBody self = new DescribeResourceAggregationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAggregationsResponseBody setAggregations(DescribeResourceAggregationsResponseBodyAggregations aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public DescribeResourceAggregationsResponseBodyAggregations getAggregations() {
        return this.aggregations;
    }

    public DescribeResourceAggregationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResourceAggregationsResponseBodyAggregationsAggregation extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Keys")
        public String keys;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeResourceAggregationsResponseBodyAggregationsAggregation build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceAggregationsResponseBodyAggregationsAggregation self = new DescribeResourceAggregationsResponseBodyAggregationsAggregation();
            return TeaModel.build(map, self);
        }

        public DescribeResourceAggregationsResponseBodyAggregationsAggregation setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeResourceAggregationsResponseBodyAggregationsAggregation setKeys(String keys) {
            this.keys = keys;
            return this;
        }
        public String getKeys() {
            return this.keys;
        }

        public DescribeResourceAggregationsResponseBodyAggregationsAggregation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceAggregationsResponseBodyAggregationsAggregation setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourceAggregationsResponseBodyAggregations extends TeaModel {
        @NameInMap("Aggregation")
        public java.util.List<DescribeResourceAggregationsResponseBodyAggregationsAggregation> aggregation;

        public static DescribeResourceAggregationsResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceAggregationsResponseBodyAggregations self = new DescribeResourceAggregationsResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public DescribeResourceAggregationsResponseBodyAggregations setAggregation(java.util.List<DescribeResourceAggregationsResponseBodyAggregationsAggregation> aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public java.util.List<DescribeResourceAggregationsResponseBodyAggregationsAggregation> getAggregation() {
            return this.aggregation;
        }

    }

}
