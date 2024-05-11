// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryStoriesRequest extends TeaModel {
    @NameInMap("CreateTimeRange")
    public TimeRange createTimeRange;

    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("FigureClusterIds")
    public java.util.List<String> figureClusterIds;

    @NameInMap("MaxResults")
    public Long maxResults;

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

    @NameInMap("StoryEndTimeRange")
    public TimeRange storyEndTimeRange;

    @NameInMap("StoryName")
    public String storyName;

    @NameInMap("StoryStartTimeRange")
    public TimeRange storyStartTimeRange;

    @NameInMap("StorySubType")
    public String storySubType;

    @NameInMap("StoryType")
    public String storyType;

    @NameInMap("WithEmptyStories")
    public Boolean withEmptyStories;

    public static QueryStoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStoriesRequest self = new QueryStoriesRequest();
        return TeaModel.build(map, self);
    }

    public QueryStoriesRequest setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }
    public TimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    public QueryStoriesRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QueryStoriesRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QueryStoriesRequest setFigureClusterIds(java.util.List<String> figureClusterIds) {
        this.figureClusterIds = figureClusterIds;
        return this;
    }
    public java.util.List<String> getFigureClusterIds() {
        return this.figureClusterIds;
    }

    public QueryStoriesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryStoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryStoriesRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public QueryStoriesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryStoriesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryStoriesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public QueryStoriesRequest setStoryEndTimeRange(TimeRange storyEndTimeRange) {
        this.storyEndTimeRange = storyEndTimeRange;
        return this;
    }
    public TimeRange getStoryEndTimeRange() {
        return this.storyEndTimeRange;
    }

    public QueryStoriesRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public QueryStoriesRequest setStoryStartTimeRange(TimeRange storyStartTimeRange) {
        this.storyStartTimeRange = storyStartTimeRange;
        return this;
    }
    public TimeRange getStoryStartTimeRange() {
        return this.storyStartTimeRange;
    }

    public QueryStoriesRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public QueryStoriesRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public QueryStoriesRequest setWithEmptyStories(Boolean withEmptyStories) {
        this.withEmptyStories = withEmptyStories;
        return this;
    }
    public Boolean getWithEmptyStories() {
        return this.withEmptyStories;
    }

}
