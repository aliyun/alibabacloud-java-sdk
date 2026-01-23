// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasShrinkRequest extends TeaModel {
    @NameInMap("DatasetFileMetaIds")
    public String datasetFileMetaIdsShrink;

    /**
     * <p>The dataset version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The update time range to query. The end time. The time follows the ISO 8601 standard. This parameter is valid only when QueryType is set to TAG.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("EndFileUpdateTime")
    public String endFileUpdateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("EndTagUpdateTime")
    public String endTagUpdateTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <blockquote>
     * <p> If you do not configure this parameter, the data on the first page is returned. A return value other than Null of this parameter indicates that not all entries have been returned. You can use this value as an input parameter to obtain entries on the next page. The value Null indicates that all query results have been returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>90a6ee35-****-4cd4-927e-1f45e1cb8b62_1729644433000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The order in which the entries are sorted by the specific field on the returned page. This parameter must be used together with SortBy. Default value: ASC.</p>
     * <ul>
     * <li>ASC</li>
     * <li>DESC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    @NameInMap("QueryContentTypeIncludeAny")
    public String queryContentTypeIncludeAnyShrink;

    @NameInMap("QueryExpression")
    public String queryExpression;

    /**
     * <strong>example:</strong>
     * <p>cars/20250221/</p>
     */
    @NameInMap("QueryFileDir")
    public String queryFileDir;

    /**
     * <strong>example:</strong>
     * <p>shuima</p>
     */
    @NameInMap("QueryFileName")
    public String queryFileName;

    @NameInMap("QueryFileTypeIncludeAny")
    public String queryFileTypeIncludeAnyShrink;

    /**
     * <strong>example:</strong>
     * <p>oss://test-xxx-oss/car/0001.png</p>
     */
    @NameInMap("QueryImage")
    public String queryImage;

    @NameInMap("QueryTagsExclude")
    public String queryTagsExcludeShrink;

    @NameInMap("QueryTagsIncludeAll")
    public String queryTagsIncludeAllShrink;

    @NameInMap("QueryTagsIncludeAny")
    public String queryTagsIncludeAnyShrink;

    /**
     * <p>The text content to be queried.</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>The retrieval type.</p>
     * <ul>
     * <li>TAG (default)</li>
     * <li>VECTOR</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TAG</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("QueryVideo")
    public String queryVideo;

    /**
     * <p>The similarity score. Only dataset files whose similarity score is greater than the value of ScoreThreshold are returned. This parameter is valid only when QueryType is set to VECTOR.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("ScoreThreshold")
    public Float scoreThreshold;

    /**
     * <p>The field used to sort the results. Default value: GmtCreateTime. Valid values:</p>
     * <ul>
     * <li>FileCreateTime (default): The results are sorted by the time when the file is created.</li>
     * <li>FileUpdateTime: The results are sorted by the time when the file is last modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FileCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The update time range to query. The start time. The time follows the ISO 8601 standard. This parameter is valid only when QueryType is set to TAG.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("StartFileUpdateTime")
    public String startFileUpdateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("StartTagUpdateTime")
    public String startTagUpdateTime;

    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>w_100</p>
     */
    @NameInMap("ThumbnailMode")
    public String thumbnailMode;

    /**
     * <p>The number of search results to return. A maximum of Top K search results can be returned. This parameter is valid only when QueryType is set to VECTOR.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105173</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetFileMetasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetFileMetasShrinkRequest self = new ListDatasetFileMetasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetFileMetasShrinkRequest setDatasetFileMetaIdsShrink(String datasetFileMetaIdsShrink) {
        this.datasetFileMetaIdsShrink = datasetFileMetaIdsShrink;
        return this;
    }
    public String getDatasetFileMetaIdsShrink() {
        return this.datasetFileMetaIdsShrink;
    }

    public ListDatasetFileMetasShrinkRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public ListDatasetFileMetasShrinkRequest setEndFileUpdateTime(String endFileUpdateTime) {
        this.endFileUpdateTime = endFileUpdateTime;
        return this;
    }
    public String getEndFileUpdateTime() {
        return this.endFileUpdateTime;
    }

    public ListDatasetFileMetasShrinkRequest setEndTagUpdateTime(String endTagUpdateTime) {
        this.endTagUpdateTime = endTagUpdateTime;
        return this;
    }
    public String getEndTagUpdateTime() {
        return this.endTagUpdateTime;
    }

    public ListDatasetFileMetasShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetFileMetasShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetFileMetasShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    @Deprecated
    public ListDatasetFileMetasShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetFileMetasShrinkRequest setQueryContentTypeIncludeAnyShrink(String queryContentTypeIncludeAnyShrink) {
        this.queryContentTypeIncludeAnyShrink = queryContentTypeIncludeAnyShrink;
        return this;
    }
    public String getQueryContentTypeIncludeAnyShrink() {
        return this.queryContentTypeIncludeAnyShrink;
    }

    public ListDatasetFileMetasShrinkRequest setQueryExpression(String queryExpression) {
        this.queryExpression = queryExpression;
        return this;
    }
    public String getQueryExpression() {
        return this.queryExpression;
    }

    public ListDatasetFileMetasShrinkRequest setQueryFileDir(String queryFileDir) {
        this.queryFileDir = queryFileDir;
        return this;
    }
    public String getQueryFileDir() {
        return this.queryFileDir;
    }

    public ListDatasetFileMetasShrinkRequest setQueryFileName(String queryFileName) {
        this.queryFileName = queryFileName;
        return this;
    }
    public String getQueryFileName() {
        return this.queryFileName;
    }

    public ListDatasetFileMetasShrinkRequest setQueryFileTypeIncludeAnyShrink(String queryFileTypeIncludeAnyShrink) {
        this.queryFileTypeIncludeAnyShrink = queryFileTypeIncludeAnyShrink;
        return this;
    }
    public String getQueryFileTypeIncludeAnyShrink() {
        return this.queryFileTypeIncludeAnyShrink;
    }

    public ListDatasetFileMetasShrinkRequest setQueryImage(String queryImage) {
        this.queryImage = queryImage;
        return this;
    }
    public String getQueryImage() {
        return this.queryImage;
    }

    public ListDatasetFileMetasShrinkRequest setQueryTagsExcludeShrink(String queryTagsExcludeShrink) {
        this.queryTagsExcludeShrink = queryTagsExcludeShrink;
        return this;
    }
    public String getQueryTagsExcludeShrink() {
        return this.queryTagsExcludeShrink;
    }

    public ListDatasetFileMetasShrinkRequest setQueryTagsIncludeAllShrink(String queryTagsIncludeAllShrink) {
        this.queryTagsIncludeAllShrink = queryTagsIncludeAllShrink;
        return this;
    }
    public String getQueryTagsIncludeAllShrink() {
        return this.queryTagsIncludeAllShrink;
    }

    public ListDatasetFileMetasShrinkRequest setQueryTagsIncludeAnyShrink(String queryTagsIncludeAnyShrink) {
        this.queryTagsIncludeAnyShrink = queryTagsIncludeAnyShrink;
        return this;
    }
    public String getQueryTagsIncludeAnyShrink() {
        return this.queryTagsIncludeAnyShrink;
    }

    public ListDatasetFileMetasShrinkRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public ListDatasetFileMetasShrinkRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListDatasetFileMetasShrinkRequest setQueryVideo(String queryVideo) {
        this.queryVideo = queryVideo;
        return this;
    }
    public String getQueryVideo() {
        return this.queryVideo;
    }

    public ListDatasetFileMetasShrinkRequest setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    public ListDatasetFileMetasShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetFileMetasShrinkRequest setStartFileUpdateTime(String startFileUpdateTime) {
        this.startFileUpdateTime = startFileUpdateTime;
        return this;
    }
    public String getStartFileUpdateTime() {
        return this.startFileUpdateTime;
    }

    public ListDatasetFileMetasShrinkRequest setStartTagUpdateTime(String startTagUpdateTime) {
        this.startTagUpdateTime = startTagUpdateTime;
        return this;
    }
    public String getStartTagUpdateTime() {
        return this.startTagUpdateTime;
    }

    public ListDatasetFileMetasShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDatasetFileMetasShrinkRequest setThumbnailMode(String thumbnailMode) {
        this.thumbnailMode = thumbnailMode;
        return this;
    }
    public String getThumbnailMode() {
        return this.thumbnailMode;
    }

    public ListDatasetFileMetasShrinkRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ListDatasetFileMetasShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
