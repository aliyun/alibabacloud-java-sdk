// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryLocationDateClustersShrinkRequest extends TeaModel {
    /**
     * <p>The address information.</p>
     */
    @NameInMap("Address")
    public String addressShrink;

    /**
     * <p>The time range during which the spatiotemporal clusters were generated.</p>
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
     * <p>The name of the dataset. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The time range during which the latest photo in a cluster was taken.</p>
     */
    @NameInMap("LocationDateClusterEndTimeRange")
    public String locationDateClusterEndTimeRangeShrink;

    /**
     * <p>The administrative level of the spatiotemporal clustering groups to be queried.</p>
     */
    @NameInMap("LocationDateClusterLevels")
    public String locationDateClusterLevelsShrink;

    /**
     * <p>The time range during which the earliest photo in a cluster was taken.</p>
     */
    @NameInMap("LocationDateClusterStartTimeRange")
    public String locationDateClusterStartTimeRangeShrink;

    /**
     * <p>The number of entries per page. Valid values: [1,100]. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>MzQNjmY2MzYxNhNjk2ZNjEu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the group that you want to query. Specify this parameter if you want to obtain the information about a specific spatiotemporal clustering group. Otherwise, leave this parameter empty and use other parameters to query the groups that meet the matching conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>location-date-cluster-71dd4f32-9597-4085-a2ab-3a7b0fd0aff9</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The sorting order.</p>
     * <p>Default value: asc. Valid values:</p>
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
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The condition by which the results are sorted.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>LocationDateClusterEndTime: by the end time of the spatiotemporal clustering groups.</li>
     * <li>CreateTime: by the creation time of the spatiotemporal clustering groups.</li>
     * <li>UpdateTime: by the update time of the spatiotemporal clustering groups.</li>
     * <li>LocationDateClusterStartTime: by the start time of the spatiotemporal clustering groups. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LocationDateClusterStartTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The title of spatiotemporal clustering. Fuzzy matching is performed.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The time range during which the spatiotemporal clusters were updated.</p>
     */
    @NameInMap("UpdateTimeRange")
    public String updateTimeRangeShrink;

    public static QueryLocationDateClustersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationDateClustersShrinkRequest self = new QueryLocationDateClustersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryLocationDateClustersShrinkRequest setAddressShrink(String addressShrink) {
        this.addressShrink = addressShrink;
        return this;
    }
    public String getAddressShrink() {
        return this.addressShrink;
    }

    public QueryLocationDateClustersShrinkRequest setCreateTimeRangeShrink(String createTimeRangeShrink) {
        this.createTimeRangeShrink = createTimeRangeShrink;
        return this;
    }
    public String getCreateTimeRangeShrink() {
        return this.createTimeRangeShrink;
    }

    public QueryLocationDateClustersShrinkRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QueryLocationDateClustersShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QueryLocationDateClustersShrinkRequest setLocationDateClusterEndTimeRangeShrink(String locationDateClusterEndTimeRangeShrink) {
        this.locationDateClusterEndTimeRangeShrink = locationDateClusterEndTimeRangeShrink;
        return this;
    }
    public String getLocationDateClusterEndTimeRangeShrink() {
        return this.locationDateClusterEndTimeRangeShrink;
    }

    public QueryLocationDateClustersShrinkRequest setLocationDateClusterLevelsShrink(String locationDateClusterLevelsShrink) {
        this.locationDateClusterLevelsShrink = locationDateClusterLevelsShrink;
        return this;
    }
    public String getLocationDateClusterLevelsShrink() {
        return this.locationDateClusterLevelsShrink;
    }

    public QueryLocationDateClustersShrinkRequest setLocationDateClusterStartTimeRangeShrink(String locationDateClusterStartTimeRangeShrink) {
        this.locationDateClusterStartTimeRangeShrink = locationDateClusterStartTimeRangeShrink;
        return this;
    }
    public String getLocationDateClusterStartTimeRangeShrink() {
        return this.locationDateClusterStartTimeRangeShrink;
    }

    public QueryLocationDateClustersShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryLocationDateClustersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryLocationDateClustersShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public QueryLocationDateClustersShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLocationDateClustersShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryLocationDateClustersShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public QueryLocationDateClustersShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryLocationDateClustersShrinkRequest setUpdateTimeRangeShrink(String updateTimeRangeShrink) {
        this.updateTimeRangeShrink = updateTimeRangeShrink;
        return this;
    }
    public String getUpdateTimeRangeShrink() {
        return this.updateTimeRangeShrink;
    }

}
