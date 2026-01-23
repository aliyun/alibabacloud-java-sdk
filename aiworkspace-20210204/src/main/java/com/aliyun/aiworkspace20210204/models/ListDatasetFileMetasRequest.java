// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasRequest extends TeaModel {
    @NameInMap("DatasetFileMetaIds")
    public java.util.List<String> datasetFileMetaIds;

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
    public java.util.List<String> queryContentTypeIncludeAny;

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
    public java.util.List<String> queryFileTypeIncludeAny;

    /**
     * <strong>example:</strong>
     * <p>oss://test-xxx-oss/car/0001.png</p>
     */
    @NameInMap("QueryImage")
    public String queryImage;

    @NameInMap("QueryTagsExclude")
    public java.util.List<String> queryTagsExclude;

    @NameInMap("QueryTagsIncludeAll")
    public java.util.List<String> queryTagsIncludeAll;

    @NameInMap("QueryTagsIncludeAny")
    public java.util.List<String> queryTagsIncludeAny;

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

    public static ListDatasetFileMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetFileMetasRequest self = new ListDatasetFileMetasRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetFileMetasRequest setDatasetFileMetaIds(java.util.List<String> datasetFileMetaIds) {
        this.datasetFileMetaIds = datasetFileMetaIds;
        return this;
    }
    public java.util.List<String> getDatasetFileMetaIds() {
        return this.datasetFileMetaIds;
    }

    public ListDatasetFileMetasRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public ListDatasetFileMetasRequest setEndFileUpdateTime(String endFileUpdateTime) {
        this.endFileUpdateTime = endFileUpdateTime;
        return this;
    }
    public String getEndFileUpdateTime() {
        return this.endFileUpdateTime;
    }

    public ListDatasetFileMetasRequest setEndTagUpdateTime(String endTagUpdateTime) {
        this.endTagUpdateTime = endTagUpdateTime;
        return this;
    }
    public String getEndTagUpdateTime() {
        return this.endTagUpdateTime;
    }

    public ListDatasetFileMetasRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetFileMetasRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetFileMetasRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    @Deprecated
    public ListDatasetFileMetasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetFileMetasRequest setQueryContentTypeIncludeAny(java.util.List<String> queryContentTypeIncludeAny) {
        this.queryContentTypeIncludeAny = queryContentTypeIncludeAny;
        return this;
    }
    public java.util.List<String> getQueryContentTypeIncludeAny() {
        return this.queryContentTypeIncludeAny;
    }

    public ListDatasetFileMetasRequest setQueryExpression(String queryExpression) {
        this.queryExpression = queryExpression;
        return this;
    }
    public String getQueryExpression() {
        return this.queryExpression;
    }

    public ListDatasetFileMetasRequest setQueryFileDir(String queryFileDir) {
        this.queryFileDir = queryFileDir;
        return this;
    }
    public String getQueryFileDir() {
        return this.queryFileDir;
    }

    public ListDatasetFileMetasRequest setQueryFileName(String queryFileName) {
        this.queryFileName = queryFileName;
        return this;
    }
    public String getQueryFileName() {
        return this.queryFileName;
    }

    public ListDatasetFileMetasRequest setQueryFileTypeIncludeAny(java.util.List<String> queryFileTypeIncludeAny) {
        this.queryFileTypeIncludeAny = queryFileTypeIncludeAny;
        return this;
    }
    public java.util.List<String> getQueryFileTypeIncludeAny() {
        return this.queryFileTypeIncludeAny;
    }

    public ListDatasetFileMetasRequest setQueryImage(String queryImage) {
        this.queryImage = queryImage;
        return this;
    }
    public String getQueryImage() {
        return this.queryImage;
    }

    public ListDatasetFileMetasRequest setQueryTagsExclude(java.util.List<String> queryTagsExclude) {
        this.queryTagsExclude = queryTagsExclude;
        return this;
    }
    public java.util.List<String> getQueryTagsExclude() {
        return this.queryTagsExclude;
    }

    public ListDatasetFileMetasRequest setQueryTagsIncludeAll(java.util.List<String> queryTagsIncludeAll) {
        this.queryTagsIncludeAll = queryTagsIncludeAll;
        return this;
    }
    public java.util.List<String> getQueryTagsIncludeAll() {
        return this.queryTagsIncludeAll;
    }

    public ListDatasetFileMetasRequest setQueryTagsIncludeAny(java.util.List<String> queryTagsIncludeAny) {
        this.queryTagsIncludeAny = queryTagsIncludeAny;
        return this;
    }
    public java.util.List<String> getQueryTagsIncludeAny() {
        return this.queryTagsIncludeAny;
    }

    public ListDatasetFileMetasRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public ListDatasetFileMetasRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListDatasetFileMetasRequest setQueryVideo(String queryVideo) {
        this.queryVideo = queryVideo;
        return this;
    }
    public String getQueryVideo() {
        return this.queryVideo;
    }

    public ListDatasetFileMetasRequest setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    public ListDatasetFileMetasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetFileMetasRequest setStartFileUpdateTime(String startFileUpdateTime) {
        this.startFileUpdateTime = startFileUpdateTime;
        return this;
    }
    public String getStartFileUpdateTime() {
        return this.startFileUpdateTime;
    }

    public ListDatasetFileMetasRequest setStartTagUpdateTime(String startTagUpdateTime) {
        this.startTagUpdateTime = startTagUpdateTime;
        return this;
    }
    public String getStartTagUpdateTime() {
        return this.startTagUpdateTime;
    }

    public ListDatasetFileMetasRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDatasetFileMetasRequest setThumbnailMode(String thumbnailMode) {
        this.thumbnailMode = thumbnailMode;
        return this;
    }
    public String getThumbnailMode() {
        return this.thumbnailMode;
    }

    public ListDatasetFileMetasRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ListDatasetFileMetasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
