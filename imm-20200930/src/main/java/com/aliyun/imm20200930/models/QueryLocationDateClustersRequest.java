// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryLocationDateClustersRequest extends TeaModel {
    @NameInMap("Address")
    public Address address;

    @NameInMap("CreateTimeRange")
    public TimeRange createTimeRange;

    /**
     * <strong>example:</strong>
     * <p>key=value</p>
     */
    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("LocationDateClusterEndTimeRange")
    public TimeRange locationDateClusterEndTimeRange;

    @NameInMap("LocationDateClusterLevels")
    public java.util.List<String> locationDateClusterLevels;

    @NameInMap("LocationDateClusterStartTimeRange")
    public TimeRange locationDateClusterStartTimeRange;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MzQNjmY2MzYxNhNjk2ZNjEu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>LocationDateClusterStartTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdateTimeRange")
    public TimeRange updateTimeRange;

    public static QueryLocationDateClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationDateClustersRequest self = new QueryLocationDateClustersRequest();
        return TeaModel.build(map, self);
    }

    public QueryLocationDateClustersRequest setAddress(Address address) {
        this.address = address;
        return this;
    }
    public Address getAddress() {
        return this.address;
    }

    public QueryLocationDateClustersRequest setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }
    public TimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    public QueryLocationDateClustersRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QueryLocationDateClustersRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QueryLocationDateClustersRequest setLocationDateClusterEndTimeRange(TimeRange locationDateClusterEndTimeRange) {
        this.locationDateClusterEndTimeRange = locationDateClusterEndTimeRange;
        return this;
    }
    public TimeRange getLocationDateClusterEndTimeRange() {
        return this.locationDateClusterEndTimeRange;
    }

    public QueryLocationDateClustersRequest setLocationDateClusterLevels(java.util.List<String> locationDateClusterLevels) {
        this.locationDateClusterLevels = locationDateClusterLevels;
        return this;
    }
    public java.util.List<String> getLocationDateClusterLevels() {
        return this.locationDateClusterLevels;
    }

    public QueryLocationDateClustersRequest setLocationDateClusterStartTimeRange(TimeRange locationDateClusterStartTimeRange) {
        this.locationDateClusterStartTimeRange = locationDateClusterStartTimeRange;
        return this;
    }
    public TimeRange getLocationDateClusterStartTimeRange() {
        return this.locationDateClusterStartTimeRange;
    }

    public QueryLocationDateClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryLocationDateClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryLocationDateClustersRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public QueryLocationDateClustersRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLocationDateClustersRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryLocationDateClustersRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public QueryLocationDateClustersRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryLocationDateClustersRequest setUpdateTimeRange(TimeRange updateTimeRange) {
        this.updateTimeRange = updateTimeRange;
        return this;
    }
    public TimeRange getUpdateTimeRange() {
        return this.updateTimeRange;
    }

}
