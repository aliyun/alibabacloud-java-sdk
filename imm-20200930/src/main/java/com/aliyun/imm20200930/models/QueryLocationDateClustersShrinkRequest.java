// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryLocationDateClustersShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String addressShrink;

    @NameInMap("CreateTimeRange")
    public String createTimeRangeShrink;

    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("LocationDateClusterEndTimeRange")
    public String locationDateClusterEndTimeRangeShrink;

    @NameInMap("LocationDateClusterLevels")
    public String locationDateClusterLevelsShrink;

    @NameInMap("LocationDateClusterStartTimeRange")
    public String locationDateClusterStartTimeRangeShrink;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Title")
    public String title;

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
