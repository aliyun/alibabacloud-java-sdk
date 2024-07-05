// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryStoriesShrinkRequest extends TeaModel {
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

    @NameInMap("FigureClusterIds")
    public String figureClusterIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>id1</p>
     */
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
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("StoryEndTimeRange")
    public String storyEndTimeRangeShrink;

    /**
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    @NameInMap("StoryStartTimeRange")
    public String storyStartTimeRangeShrink;

    /**
     * <strong>example:</strong>
     * <p>SeasonHighlights</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <strong>example:</strong>
     * <p>TimeMemory</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithEmptyStories")
    public Boolean withEmptyStories;

    public static QueryStoriesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStoriesShrinkRequest self = new QueryStoriesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryStoriesShrinkRequest setCreateTimeRangeShrink(String createTimeRangeShrink) {
        this.createTimeRangeShrink = createTimeRangeShrink;
        return this;
    }
    public String getCreateTimeRangeShrink() {
        return this.createTimeRangeShrink;
    }

    public QueryStoriesShrinkRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QueryStoriesShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QueryStoriesShrinkRequest setFigureClusterIdsShrink(String figureClusterIdsShrink) {
        this.figureClusterIdsShrink = figureClusterIdsShrink;
        return this;
    }
    public String getFigureClusterIdsShrink() {
        return this.figureClusterIdsShrink;
    }

    public QueryStoriesShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryStoriesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryStoriesShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public QueryStoriesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryStoriesShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryStoriesShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public QueryStoriesShrinkRequest setStoryEndTimeRangeShrink(String storyEndTimeRangeShrink) {
        this.storyEndTimeRangeShrink = storyEndTimeRangeShrink;
        return this;
    }
    public String getStoryEndTimeRangeShrink() {
        return this.storyEndTimeRangeShrink;
    }

    public QueryStoriesShrinkRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public QueryStoriesShrinkRequest setStoryStartTimeRangeShrink(String storyStartTimeRangeShrink) {
        this.storyStartTimeRangeShrink = storyStartTimeRangeShrink;
        return this;
    }
    public String getStoryStartTimeRangeShrink() {
        return this.storyStartTimeRangeShrink;
    }

    public QueryStoriesShrinkRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public QueryStoriesShrinkRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public QueryStoriesShrinkRequest setWithEmptyStories(Boolean withEmptyStories) {
        this.withEmptyStories = withEmptyStories;
        return this;
    }
    public Boolean getWithEmptyStories() {
        return this.withEmptyStories;
    }

}
