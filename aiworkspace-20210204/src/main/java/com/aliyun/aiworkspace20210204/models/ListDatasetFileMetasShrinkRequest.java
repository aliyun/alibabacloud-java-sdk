// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("EndFileUpdateTime")
    public String endFileUpdateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("EndTagUpdateTime")
    public String endTagUpdateTime;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>90a6ee35-****-4cd4-927e-1f45e1cb8b62_1729644433000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    @NameInMap("QueryFileDir")
    public String queryFileDir;

    @NameInMap("QueryFileName")
    public String queryFileName;

    @NameInMap("QueryFileTypeIncludeAny")
    public String queryFileTypeIncludeAnyShrink;

    @NameInMap("QueryImage")
    public String queryImage;

    @NameInMap("QueryTagsExclude")
    public String queryTagsExcludeShrink;

    @NameInMap("QueryTagsIncludeAll")
    public String queryTagsIncludeAllShrink;

    @NameInMap("QueryTagsIncludeAny")
    public String queryTagsIncludeAnyShrink;

    @NameInMap("QueryText")
    public String queryText;

    /**
     * <strong>example:</strong>
     * <p>TAG</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("ScoreThreshold")
    public Float scoreThreshold;

    /**
     * <strong>example:</strong>
     * <p>FileCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("StartFileUpdateTime")
    public String startFileUpdateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("StartTagUpdateTime")
    public String startTagUpdateTime;

    @NameInMap("ThumbnailMode")
    public String thumbnailMode;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
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
