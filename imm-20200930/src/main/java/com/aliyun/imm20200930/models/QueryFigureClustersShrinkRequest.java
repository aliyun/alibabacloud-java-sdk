// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryFigureClustersShrinkRequest extends TeaModel {
    /**
     * <p>The time range during which the face clusters were created.</p>
     */
    @NameInMap("CreateTimeRange")
    public String createTimeRangeShrink;

    /**
     * <p>The query conditions for custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>key=value</p>
     */
    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>The name of the dataset. For more information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of data records to return in this call. Valid values: 0 to 100. If this parameter is not specified or is set to 0, the default value 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. If this parameter is left empty or set to None, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCkltYWdlQ291bnQQARgBIr0ECgkABAAAAAAAAAAKrwQDKgIAADFTMzEzMDMyMzMzMjMxMzAzMDMyMzQzNjM3MzczOTMzMzQzYTY5NmQ2ZDJkNjk2ZDYxNjc2NTJkNzQ2NTczNzQyZDY4N2E2NDY1NzYyZDMyMzUzMjM0MzIzOTMzMzczMTJkMzY1NDZhNzk3MzU2Njk3MjM0M2E2OTZkNmQyZDc0NjU3Mzc0MmQ3MzY1NzQyZDYzMzYzNjY0MzY2NjYxMzQyZDM1MzMzODM3MmQzMTMxNjU2NjJkNjI2NTM5MzYyZDM5MzgzMDMzMzk2MjMwMzE2NDYzNjMzMjNhNjY2OTY3NzU3MjY1MmQ2MzZjNzU3Mzc0NjU3MjNhNDM2Yzc1NzM3NDY1NzIyZDYxNjUzOTY0MzQzMzMxNjEyZDM3MzQ2NTY2MmQzNDM5Mzc2MjJkMzg2MjMxMzUyZDM0MzUzOTM1MzYzNzYxMzQ2NDM2MzE2Ni5TMzEzMDMyMzMzMjMxMzAzMDMyMzQzNjM3MzczOTMzMzQzYTY5NmQ2ZDJkNjk2ZDYxNjc2NTJkNzQ2NTczNzQyZDY4N2E2NDY1NzYyZDMyMzUzMjM0MzIzOTMzMzczMTJkMzY1NDZhNzk3MzU2Njk3MjM0M2E2OTZkNmQyZDc0NjU3Mzc0MmQ3MzY1NzQyZDYzMzYzNjY0MzY2NjYxMzQyZDM1MzMzODM3MmQzMTMxNjU2NjJkNjI2NTM5MzYyZDM5MzgzMDMzMzk2MjMwMzE2NDYzNjM*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Default value: asc.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The field used for sorting. By default, this parameter is left empty, which indicates that the results are sorted by cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The time range during which the face clusters were updated.</p>
     */
    @NameInMap("UpdateTimeRange")
    public String updateTimeRangeShrink;

    /**
     * <p>Specifies whether to return the total number of face clusters that meet the current query conditions. Default value: false, which indicates that the total number of clusters is not returned.</p>
     * 
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
