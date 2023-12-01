// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryShrinkRequest extends TeaModel {
    @NameInMap("Aggregations")
    public String aggregationsShrink;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Query")
    public String queryShrink;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("WithFields")
    public String withFieldsShrink;

    @NameInMap("WithoutTotalHits")
    public Boolean withoutTotalHits;

    public static SimpleQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SimpleQueryShrinkRequest self = new SimpleQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SimpleQueryShrinkRequest setAggregationsShrink(String aggregationsShrink) {
        this.aggregationsShrink = aggregationsShrink;
        return this;
    }
    public String getAggregationsShrink() {
        return this.aggregationsShrink;
    }

    public SimpleQueryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SimpleQueryShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SimpleQueryShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SimpleQueryShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public SimpleQueryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SimpleQueryShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

    public SimpleQueryShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public SimpleQueryShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

    public SimpleQueryShrinkRequest setWithoutTotalHits(Boolean withoutTotalHits) {
        this.withoutTotalHits = withoutTotalHits;
        return this;
    }
    public Boolean getWithoutTotalHits() {
        return this.withoutTotalHits;
    }

}
