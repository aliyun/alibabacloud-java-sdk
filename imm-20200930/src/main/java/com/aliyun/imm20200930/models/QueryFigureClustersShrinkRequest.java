// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryFigureClustersShrinkRequest extends TeaModel {
    @NameInMap("CreateTimeRange")
    public String createTimeRangeShrink;

    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>asc</p>
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

    /**
     * <strong>example:</strong>
     * <p>ImageCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("UpdateTimeRange")
    public String updateTimeRangeShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithTotalCount")
    public Boolean withTotalCount;

    public static QueryFigureClustersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFigureClustersShrinkRequest self = new QueryFigureClustersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryFigureClustersShrinkRequest setCreateTimeRangeShrink(String createTimeRangeShrink) {
        this.createTimeRangeShrink = createTimeRangeShrink;
        return this;
    }
    public String getCreateTimeRangeShrink() {
        return this.createTimeRangeShrink;
    }

    public QueryFigureClustersShrinkRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QueryFigureClustersShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QueryFigureClustersShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryFigureClustersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryFigureClustersShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryFigureClustersShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryFigureClustersShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public QueryFigureClustersShrinkRequest setUpdateTimeRangeShrink(String updateTimeRangeShrink) {
        this.updateTimeRangeShrink = updateTimeRangeShrink;
        return this;
    }
    public String getUpdateTimeRangeShrink() {
        return this.updateTimeRangeShrink;
    }

    public QueryFigureClustersShrinkRequest setWithTotalCount(Boolean withTotalCount) {
        this.withTotalCount = withTotalCount;
        return this;
    }
    public Boolean getWithTotalCount() {
        return this.withTotalCount;
    }

}
