// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryFigureClustersShrinkRequest extends TeaModel {
    /**
     * <p>The time range within which the face group was created.</p>
     */
    @NameInMap("CreateTimeRange")
    public String createTimeRangeShrink;

    /**
     * <p>The custom labels, which can be used as query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>key=value</p>
     */
    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>The name of the dataset. You can obtain the name of the dataset from the response of the <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of entries to return. Valid values: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCkltYWdlQ291bnQQARgBIr0ECgkABAAAAAAAAAAKrwQDKgIAADFTMzEzMDMyMzMzMjMxMzAzMDMyMzQzNjM3MzczOTMzMzQzYTY5NmQ2ZDJkNjk2ZDYxNjc2NTJkNzQ2NTczNzQyZDY4N2E2NDY1NzYyZDMyMzUzMjM0MzIzOTMzMzczMTJkMzY1NDZhNzk3MzU2Njk3MjM0M2E2OTZkNmQyZDc0NjU3Mzc0MmQ3MzY1NzQyZDYzMzYzNjY0MzY2NjYxMzQyZDM1MzMzODM3MmQzMTMxNjU2NjJkNjI2NTM5MzYyZDM5MzgzMDMzMzk2MjMwMzE2NDYzNjMzMjNhNjY2OTY3NzU3MjY1MmQ2MzZjNzU3Mzc0NjU3MjNhNDM2Yzc1NzM3NDY1NzIyZDYxNjUzOTY0MzQzMzMxNjEyZDM3MzQ2NTY2MmQzNDM5Mzc2MjJkMzg2MjMxMzUyZDM0MzUzOTM1MzYzNzYxMzQ2NDM2MzE2Ni5TMzEzMDMyMzMzMjMxMzAzMDMyMzQzNjM3MzczOTMzMzQzYTY5NmQ2ZDJkNjk2ZDYxNjc2NTJkNzQ2NTczNzQyZDY4N2E2NDY1NzYyZDMyMzUzMjM0MzIzOTMzMzczMTJkMzY1NDZhNzk3MzU2Njk3MjM0M2E2OTZkNmQyZDc0NjU3Mzc0MmQ3MzY1NzQyZDYzMzYzNjY0MzY2NjYxMzQyZDM1MzMzODM3MmQzMTMxNjU2NjJkNjI2NTM5MzYyZDM5MzgzMDMzMzk2MjMwMzE2NDYzNjM*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Default value: asc.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>asc: ascending order.</p>
     * </li>
     * <li><p>desc: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The sort field. If you leave this parameter empty, the group ID is used as the sort field.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ImageCount: the number of images.</p>
     * </li>
     * <li><p>VideoCount: the number of videos.</p>
     * </li>
     * <li><p>ProjectName: the name of the project.</p>
     * </li>
     * <li><p>DatasetName: the name of the dataset.</p>
     * </li>
     * <li><p>CreateTime: the point in time when the group is created.</p>
     * </li>
     * <li><p>UpdateTime: the most recent point in time when the group is updated.</p>
     * </li>
     * <li><p>Gender: the gender.</p>
     * </li>
     * <li><p>FaceCount: the number of faces.</p>
     * </li>
     * <li><p>GroupName: the name of the group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ImageCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The time range within which the face group was last updated.</p>
     */
    @NameInMap("UpdateTimeRange")
    public String updateTimeRangeShrink;

    /**
     * <p>Specifies whether to return the total number of face groups that match the current query conditions. Default value: false.</p>
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
