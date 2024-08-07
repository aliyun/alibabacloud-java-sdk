// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryRequest extends TeaModel {
    @NameInMap("Aggregations")
    public java.util.List<SimpleQueryRequestAggregations> aggregations;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>asc,desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Query")
    public SimpleQuery query;

    /**
     * <strong>example:</strong>
     * <p>Size,Filename</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("WithFields")
    public java.util.List<String> withFields;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("WithoutTotalHits")
    public Boolean withoutTotalHits;

    public static SimpleQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SimpleQueryRequest self = new SimpleQueryRequest();
        return TeaModel.build(map, self);
    }

    public SimpleQueryRequest setAggregations(java.util.List<SimpleQueryRequestAggregations> aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public java.util.List<SimpleQueryRequestAggregations> getAggregations() {
        return this.aggregations;
    }

    public SimpleQueryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SimpleQueryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SimpleQueryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SimpleQueryRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public SimpleQueryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SimpleQueryRequest setQuery(SimpleQuery query) {
        this.query = query;
        return this;
    }
    public SimpleQuery getQuery() {
        return this.query;
    }

    public SimpleQueryRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public SimpleQueryRequest setWithFields(java.util.List<String> withFields) {
        this.withFields = withFields;
        return this;
    }
    public java.util.List<String> getWithFields() {
        return this.withFields;
    }

    public SimpleQueryRequest setWithoutTotalHits(Boolean withoutTotalHits) {
        this.withoutTotalHits = withoutTotalHits;
        return this;
    }
    public Boolean getWithoutTotalHits() {
        return this.withoutTotalHits;
    }

    public static class SimpleQueryRequestAggregations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Size</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>sum</p>
         */
        @NameInMap("Operation")
        public String operation;

        public static SimpleQueryRequestAggregations build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryRequestAggregations self = new SimpleQueryRequestAggregations();
            return TeaModel.build(map, self);
        }

        public SimpleQueryRequestAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SimpleQueryRequestAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

}
