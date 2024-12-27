// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryStoriesRequest extends TeaModel {
    /**
     * <p>The time range in which stories were created.</p>
     */
    @NameInMap("CreateTimeRange")
    public TimeRange createTimeRange;

    /**
     * <p>The custom labels in key-value pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>key=value</p>
     */
    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The IDs of the face clusters.</p>
     */
    @NameInMap("FigureClusterIds")
    public java.util.List<String> figureClusterIds;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If you do not specify this token in the next request, results are returned from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>id1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>asc: in ascending order.</li>
     * <li>desc: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li>CreateTime: sorts by story creation time.</li>
     * <li>StoryName: sorts by story name.</li>
     * <li>StoryStartTime: sorts by story start time.</li>
     * <li>StoryEndTime: sorts by story end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The time range for the creation time of the last photo or video in the story.</p>
     */
    @NameInMap("StoryEndTimeRange")
    public TimeRange storyEndTimeRange;

    /**
     * <p>The name of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    /**
     * <p>The time range for the creation time of the first photo or video in the story.</p>
     */
    @NameInMap("StoryStartTimeRange")
    public TimeRange storyStartTimeRange;

    /**
     * <p>The subtype of the story. For a list of valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SeasonHighlights</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The type of the story. For a list of valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>TimeMemory</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    /**
     * <p>Specifies whether to return empty stories. Valid values:</p>
     * <ul>
     * <li>true (The default value)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
