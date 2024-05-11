// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryFigureClustersRequest extends TeaModel {
    @NameInMap("CreateTimeRange")
    public TimeRange createTimeRange;

    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("UpdateTimeRange")
    public TimeRange updateTimeRange;

    @NameInMap("WithTotalCount")
    public Boolean withTotalCount;

    public static QueryFigureClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFigureClustersRequest self = new QueryFigureClustersRequest();
        return TeaModel.build(map, self);
    }

    public QueryFigureClustersRequest setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }
    public TimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    public QueryFigureClustersRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QueryFigureClustersRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QueryFigureClustersRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryFigureClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryFigureClustersRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryFigureClustersRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryFigureClustersRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public QueryFigureClustersRequest setUpdateTimeRange(TimeRange updateTimeRange) {
        this.updateTimeRange = updateTimeRange;
        return this;
    }
    public TimeRange getUpdateTimeRange() {
        return this.updateTimeRange;
    }

    public QueryFigureClustersRequest setWithTotalCount(Boolean withTotalCount) {
        this.withTotalCount = withTotalCount;
        return this;
    }
    public Boolean getWithTotalCount() {
        return this.withTotalCount;
    }

}
