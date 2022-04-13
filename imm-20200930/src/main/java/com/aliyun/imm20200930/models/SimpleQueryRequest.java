// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryRequest extends TeaModel {
    // 聚合字段
    @NameInMap("Aggregations")
    public java.util.List<SimpleQueryRequestAggregations> aggregations;

    // Dataset 名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 排序字段
    @NameInMap("Order")
    public String order;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Query")
    public SimpleQuery query;

    // 排序方式，默认 DESC
    @NameInMap("Sort")
    public String sort;

    // 仅返回哪些字段
    @NameInMap("WithFields")
    public java.util.List<String> withFields;

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

    public static class SimpleQueryRequestAggregations extends TeaModel {
        // 聚合字段的字段名
        @NameInMap("Field")
        public String field;

        // 聚合字段的聚合操作符
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
