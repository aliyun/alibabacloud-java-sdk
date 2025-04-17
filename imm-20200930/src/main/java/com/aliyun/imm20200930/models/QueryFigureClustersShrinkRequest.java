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
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Default value: asc.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>asc: ascending order.</li>
     * <li>desc: descending order.</li>
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
     * <li>ImageCount: the number of images.</li>
     * <li>VideoCount: the number of videos.</li>
     * <li>ProjectName: the name of the project.</li>
     * <li>DatasetName: the name of the dataset.</li>
     * <li>CreateTime: the point in time when the group is created.</li>
     * <li>UpdateTime: the most recent point in time when the group is updated.</li>
     * <li>Gender: the gender.</li>
     * <li>FaceCount: the number of faces.</li>
     * <li>GroupName: the name of the group.</li>
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
