// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryStoriesShrinkRequest extends TeaModel {
    /**
     * <p>The creation time range of the story.</p>
     */
    @NameInMap("CreateTimeRange")
    public String createTimeRangeShrink;

    /**
     * <p>The custom label key-value pairs. Only stories that match the specified label pairs are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>key=value</p>
     */
    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>The name of the dataset. For more information about how to obtain the name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The IDs of the figure clusters.</p>
     */
    @NameInMap("FigureClusterIds")
    public String figureClusterIdsShrink;

    /**
     * <p>The maximum number of entries to return in a single call. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. If this parameter is left empty, the query starts from the beginning. To query the next page, set this parameter to the NextToken value returned in the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the story object.</p>
     * 
     * <strong>example:</strong>
     * <p>id1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p>asc: Ascending order.</p>
     * </li>
     * <li><p>desc: Descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project. For more information about how to obtain the name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The field used for sorting. Valid values:</p>
     * <ul>
     * <li><p>CreateTime: Sorts by story creation time.</p>
     * </li>
     * <li><p>StoryName: Sorts by story name.</p>
     * </li>
     * <li><p>StoryStartTime: Sorts by story start time.</p>
     * </li>
     * <li><p>StoryEndTime: Sorts by story end time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The end time range of the photos or videos in the story.</p>
     */
    @NameInMap("StoryEndTimeRange")
    public String storyEndTimeRangeShrink;

    /**
     * <p>The name of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    /**
     * <p>The start time range of the photos or videos in the story.</p>
     */
    @NameInMap("StoryStartTimeRange")
    public String storyStartTimeRangeShrink;

    /**
     * <p>The subtype of the story. For valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SeasonHighlights</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The type of the story. For valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>TimeMemory</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    /**
     * <p>Specifies whether to return empty stories. Valid values:</p>
     * <ul>
     * <li><p>true: Returns empty stories. This is the default value.</p>
     * </li>
     * <li><p>false: Does not return empty stories.</p>
     * </li>
     * </ul>
     * 
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
