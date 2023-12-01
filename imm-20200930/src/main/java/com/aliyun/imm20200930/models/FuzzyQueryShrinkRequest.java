// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Query")
    public String query;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("WithFields")
    public String withFieldsShrink;

    public static FuzzyQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FuzzyQueryShrinkRequest self = new FuzzyQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FuzzyQueryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public FuzzyQueryShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public FuzzyQueryShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FuzzyQueryShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public FuzzyQueryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public FuzzyQueryShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public FuzzyQueryShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public FuzzyQueryShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

}
