// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryShrinkRequest extends TeaModel {
    // 聚合字段
    @NameInMap("Aggregations")
    public String aggregationsShrink;

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
    public String queryShrink;

    // 排序方式，默认 DESC
    @NameInMap("Sort")
    public String sort;

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

}
