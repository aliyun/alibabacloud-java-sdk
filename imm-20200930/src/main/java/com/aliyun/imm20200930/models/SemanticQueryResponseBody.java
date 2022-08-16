// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryResponseBody extends TeaModel {
    @NameInMap("Aggregations")
    public java.util.List<SemanticQueryResponseBodyAggregations> aggregations;

    @NameInMap("Files")
    public java.util.List<File> files;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static SemanticQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SemanticQueryResponseBody self = new SemanticQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SemanticQueryResponseBody setAggregations(java.util.List<SemanticQueryResponseBodyAggregations> aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public java.util.List<SemanticQueryResponseBodyAggregations> getAggregations() {
        return this.aggregations;
    }

    public SemanticQueryResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public SemanticQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SemanticQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SemanticQueryResponseBodyAggregationsGroups extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Value")
        public String value;

        public static SemanticQueryResponseBodyAggregationsGroups build(java.util.Map<String, ?> map) throws Exception {
            SemanticQueryResponseBodyAggregationsGroups self = new SemanticQueryResponseBodyAggregationsGroups();
            return TeaModel.build(map, self);
        }

        public SemanticQueryResponseBodyAggregationsGroups setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SemanticQueryResponseBodyAggregationsGroups setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SemanticQueryResponseBodyAggregations extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Groups")
        public java.util.List<SemanticQueryResponseBodyAggregationsGroups> groups;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public Float value;

        public static SemanticQueryResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            SemanticQueryResponseBodyAggregations self = new SemanticQueryResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public SemanticQueryResponseBodyAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SemanticQueryResponseBodyAggregations setGroups(java.util.List<SemanticQueryResponseBodyAggregationsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<SemanticQueryResponseBodyAggregationsGroups> getGroups() {
            return this.groups;
        }

        public SemanticQueryResponseBodyAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SemanticQueryResponseBodyAggregations setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

}
