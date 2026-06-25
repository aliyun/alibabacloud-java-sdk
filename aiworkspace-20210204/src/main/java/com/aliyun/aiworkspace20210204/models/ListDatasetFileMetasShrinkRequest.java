// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasShrinkRequest extends TeaModel {
    /**
     * <p>A list of metadata IDs to query.</p>
     */
    @NameInMap("DatasetFileMetaIds")
    public String datasetFileMetaIdsShrink;

    /**
     * <p>The version name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The start time for the query that filters files by update time. The time must be a UTC timestamp in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("EndFileUpdateTime")
    public String endFileUpdateTime;

    /**
     * <p>The start time for querying tags by their last update time. The time must be in UTC and in the ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("EndTagUpdateTime")
    public String endTagUpdateTime;

    /**
     * <p>The end of the time range for a query that filters tags by their last update time. The time is a UTC timestamp in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the first page of results is returned. If a value is returned for this parameter, more results are available. To get the next page, use the returned token in your next request. Repeat this process until no token is returned, which indicates that all results have been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>90a6ee35-****-4cd4-927e-1f45e1cb8b62_1729644433000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order for the specified field in a paginated query. Use this parameter with \<code>SortBy\\</code>. The default value is \<code>DESC\\</code>. Valid values:</p>
     * <ul>
     * <li><p>ASC: Ascending.</p>
     * </li>
     * <li><p>DESC: Descending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page. If you also specify \<code>MaxResults\\</code>, the value of \<code>MaxResults\\</code> takes precedence.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Use \<code>NextToken\\</code> and \<code>MaxResults\\</code> for paginated queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    /**
     * <p>A search condition to include any of the specified content types. The search results must match at least one of these types. You can specify multiple content types. If this parameter is empty, this condition is not applied. Use commas to separate multiple types in the array.</p>
     */
    @NameInMap("QueryContentTypeIncludeAny")
    public String queryContentTypeIncludeAnyShrink;

    /**
     * <p>The maximum number of results to return per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>(FileUpdateTime &gt; \&quot;2025-02-28T00:00:00Z\&quot; AND FileUpdateTime &lt; \&quot;2025-05-30T09:27:29Z\&quot;) AND FileDir:\&quot;blue_car\&quot; AND NOT FileName=&quot;toyota.jpg&quot; AND (( Tags.all=\&quot;lane line\&quot; AND Tags.all=\&quot;barrier gate\&quot;) OR NOT Tags.user=\&quot;rainy days\&quot; ) AND HAS SemanticIndexJobId AND Content:\&quot;a fallen water horse\&quot; AND TopK=100 AND SignMode=\&quot;PUBLIC\&quot;</p>
     */
    @NameInMap("QueryExpression")
    public String queryExpression;

    /**
     * <p>The name of the file to retrieve. This parameter supports fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>cars/20250221/</p>
     */
    @NameInMap("QueryFileDir")
    public String queryFileDir;

    /**
     * <p>The tags to exclude from the query results. If you do not specify any tags, this filter is not applied.</p>
     * <blockquote>
     * <p>This parameter is valid only when QueryType is set to TAG or MIX.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>car</p>
     */
    @NameInMap("QueryFileName")
    public String queryFileName;

    /**
     * <p>The search keyword for the file directory. Fuzzy search is supported.</p>
     */
    @NameInMap("QueryFileTypeIncludeAny")
    public String queryFileTypeIncludeAnyShrink;

    /**
     * <p>The image information to use for an image-based search.</p>
     * <ul>
     * <li>Specify the public URL of an image in an OSS bucket. The format is \<code>oss\\://{bucket_name}/{object_path}\\</code>. \<code>bucket_name\\</code> is the name of the bucket, and \<code>object_path\\</code> is the path of the file in the bucket.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when \<code>QueryType\\</code> is set to \<code>VECTOR\\</code> or \<code>MIX\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://test-xxx-oss/car/0001.png</p>
     */
    @NameInMap("QueryImage")
    public String queryImage;

    /**
     * <p>A comma-separated list of tags. The query returns files that match at least one of the specified tags. If you do not specify this parameter, this filter is ignored.</p>
     * <blockquote>
     * <p>This parameter is valid only when QueryType is set to TAG or MIX.</p>
     * </blockquote>
     */
    @NameInMap("QueryTagsExclude")
    public String queryTagsExcludeShrink;

    /**
     * <p>The metadata IDs to query.</p>
     */
    @NameInMap("QueryTagsIncludeAll")
    public String queryTagsIncludeAllShrink;

    /**
     * <p>A condition that retrieves items that have all of the specified tags. The tags are specified as a comma-separated array. This condition is not applied if the parameter is empty.</p>
     * <blockquote>
     * <p>This parameter takes effect only when QueryType is set to TAG or MIX. If QueryType is set to TAG, the value of QueryText is also added to this condition.</p>
     * </blockquote>
     */
    @NameInMap("QueryTagsIncludeAny")
    public String queryTagsIncludeAnyShrink;

    /**
     * <p>The text to search for.</p>
     * 
     * <strong>example:</strong>
     * <p>A fallen water</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>The search type. Valid values:</p>
     * <ul>
     * <li><p>MIX: Mixed search. This is the default value.</p>
     * </li>
     * <li><p>TAG: Searches by tag only.</p>
     * </li>
     * <li><p>VECTOR: Searches by vector only.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MIX</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The status of the metadata to query.</p>
     * <ul>
     * <li><p>ACTIVE: Returns metadata for active files. This is the default value.</p>
     * </li>
     * <li><p>ALL: Returns metadata for all files.</p>
     * </li>
     * <li><p>DELETED: Returns metadata for logically deleted files.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://test-xxx-oss/car/0001.mp4</p>
     */
    @NameInMap("QueryVideo")
    public String queryVideo;

    /**
     * <p>The similarity score threshold. Only results with a score greater than this threshold are returned.</p>
     * <blockquote>
     * <p>This parameter is valid only when \<code>QueryType\\</code> is set to \<code>VECTOR\\</code> or \<code>MIX\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("ScoreThreshold")
    public Float scoreThreshold;

    /**
     * <p>The field to sort by for paginated queries. If you do not specify this parameter, results are sorted by relevance from high to low. Other valid values are as follows:</p>
     * <ul>
     * <li><p>FileCreateTime: Sort by file creation time.</p>
     * </li>
     * <li><p>FileUpdateTime: Sort by file last modified time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FileCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The end of the time range for a query based on file update time. The value is a UTC timestamp in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("StartFileUpdateTime")
    public String startFileUpdateTime;

    /**
     * <p>The file content types. The query returns files that match any of the specified types. You can specify multiple types and separate them with commas. If this parameter is empty, this filter is ignored.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("StartTagUpdateTime")
    public String startTagUpdateTime;

    /**
     * <p>A query statement, also known as a Domain-Specific Language (DSL) query, lets you express complex retrieval conditions. It supports grouping, Boolean logic (AND/OR/NOT), range comparisons (&gt;, &gt;=, &lt;, &lt;=), property existence (HAS/NOT HAS), tokenized matches (:), and exact matches (=). Use DSL for advanced retrieval scenarios.</p>
     * <blockquote>
     * <p>Notice: To avoid conflicts, do not use this query statement with other query parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The mode for generating image thumbnails. Thumbnails are supported only for files in OSS.</p>
     * <ul>
     * <li><p>Proportional scaling: \<code>p_{percentage}\\</code>. The \<code>percentage\\</code> parameter specifies the scaling ratio. Valid values: 1 to 100. For example, \<code>p_50\\</code> scales the image to 50% of its original size.</p>
     * </li>
     * <li><p>Fixed width, adaptive height: \<code>w_{width}\\</code>. The \<code>width\\</code> parameter specifies the image width. Valid values: 1 to 16,384. For example, \<code>w_200\\</code> sets the image width to 200 pixels and scales the height adaptively.</p>
     * </li>
     * <li><p>Fixed height, adaptive width: \<code>h_{height}\\</code>. The \<code>height\\</code> parameter specifies the image height. Valid values: 1 to 16,384. For example, \<code>h_100\\</code> sets the image height to 100 pixels and scales the width adaptively.</p>
     * </li>
     * <li><p>Fixed width and height with padding: \<code>m_pad,w_{width},h_{height},color_{RGB}\\</code>. The \<code>m_pad\\</code> parameter scales the image to the maximum size that fits within a rectangle of the specified width and height. The \<code>RGB\\</code> parameter specifies the color for the centered padding in the empty areas. If you do not specify this parameter, the empty areas are filled with white by default. The \<code>width\\</code> and \<code>height\\</code> parameters specify the image width and height. The values for both \<code>width\\</code> and \<code>height\\</code> must be between 1 and 16,384.</p>
     * </li>
     * <li><p>Fixed width and height with center crop: \<code>m_fill,w_{width},h_{height}\\</code>. The \<code>m_fill\\</code> parameter proportionally scales the image to the minimum size that covers the specified width and height, and then crops the excess from the center. The \<code>width\\</code> and \<code>height\\</code> parameters specify the image width and height. The values for both \<code>width\\</code> and \<code>height\\</code> must be between 1 and 16,384. For example, \<code>m_fill,w_100,h_100\\</code> scales and crops the image to 100 × 100 pixels from the center.</p>
     * </li>
     * <li><p>Forced width and height scaling: \<code>m_fixed,w_{width},h_{height}\\</code>. The \<code>width\\</code> and \<code>height\\</code> parameters specify the image width and height. The values for both \<code>width\\</code> and \<code>height\\</code> must be between 1 and 16,384. For example, \<code>m_fixed,w_100,h_100\\</code> forces the image to be scaled to 100 × 100 pixels.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>w_100</p>
     */
    @NameInMap("ThumbnailMode")
    public String thumbnailMode;

    /**
     * <p>The maximum number of search results to return.</p>
     * <blockquote>
     * <p>This parameter is valid only when \<code>QueryType\\</code> is set to \<code>VECTOR\\</code> or \<code>MIX\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The ID of the workspace where the dataset is located. For more information, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
