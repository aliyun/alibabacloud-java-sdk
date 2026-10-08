// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryResponseBody extends TeaModel {
    /**
     * <p>The list of aggregation field information. This parameter is returned only when Aggregations in the request is not empty.</p>
     */
    @NameInMap("Aggregations")
    public java.util.List<SimpleQueryResponseBodyAggregations> aggregations;

    /**
     * <p>The list of file information. This parameter is returned only when Aggregations in the request is empty.</p>
     */
    @NameInMap("Files")
    public java.util.List<File> files;

    /**
     * <p>The token used for pagination when the total number of files exceeds the value of MaxResults.</p>
     * <p>When you list file information next time, set NextToken to this value to return the remaining results.</p>
     * <p>This parameter has a value only when not all files are returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of matched records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The total count of the grouping and aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The value of the grouping and aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The name of the aggregation field.</p>
         * 
         * <strong>example:</strong>
         * <p>Size</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The list of grouping and aggregation results. This parameter is returned only when an Operation of the group type exists in Aggregations of the request.</p>
         */
        @NameInMap("Groups")
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups;

        /**
         * <p>The aggregation operation for the aggregation field.</p>
         * 
         * <strong>example:</strong>
         * <p>sum</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The statistical result of the aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
