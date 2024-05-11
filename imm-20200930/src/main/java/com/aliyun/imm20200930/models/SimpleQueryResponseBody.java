// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryResponseBody extends TeaModel {
    @NameInMap("Aggregations")
    public java.util.List<SimpleQueryResponseBodyAggregations> aggregations;

    @NameInMap("Files")
    public java.util.List<File> files;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalHits")
    public Long totalHits;

    public static SimpleQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SimpleQueryResponseBody self = new SimpleQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SimpleQueryResponseBody setAggregations(java.util.List<SimpleQueryResponseBodyAggregations> aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public java.util.List<SimpleQueryResponseBodyAggregations> getAggregations() {
        return this.aggregations;
    }

    public SimpleQueryResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public SimpleQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SimpleQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SimpleQueryResponseBody setTotalHits(Long totalHits) {
        this.totalHits = totalHits;
        return this;
    }
    public Long getTotalHits() {
        return this.totalHits;
    }

    public static class SimpleQueryResponseBodyAggregationsGroups extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Value")
        public String value;

        public static SimpleQueryResponseBodyAggregationsGroups build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregationsGroups self = new SimpleQueryResponseBodyAggregationsGroups();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregationsGroups setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SimpleQueryResponseBodyAggregationsGroups setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SimpleQueryResponseBodyAggregations extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Groups")
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public Double value;

        public static SimpleQueryResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregations self = new SimpleQueryResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SimpleQueryResponseBodyAggregations setGroups(java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> getGroups() {
            return this.groups;
        }

        public SimpleQueryResponseBodyAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SimpleQueryResponseBodyAggregations setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
