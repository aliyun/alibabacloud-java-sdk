// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasShrinkRequest extends TeaModel {
    /**
     * <p>The list of metadata IDs to query.</p>
     */
    @NameInMap("DatasetFileMetaIds")
    public String datasetFileMetaIdsShrink;

    /**
     * <p>The dataset version name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The end time of the file update time range for the query. Specify the time in the ISO 8601 standard in UTC.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("EndFileUpdateTime")
    public String endFileUpdateTime;

    /**
     * <p>The end time of the tag last update time range for the query. Specify the time in the ISO 8601 standard in UTC.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("EndTagUpdateTime")
    public String endTagUpdateTime;

    /**
     * <p>The maximum number of results to return per query when NextToken is used. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination cursor.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the first page of data is returned. If this parameter has a return value, it indicates that there is a next page. You can use the returned NextToken as a parameter to request the next page of data until Null is returned, which indicates that all data is retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>90a6ee35-****-4cd4-927e-1f45e1cb8b62_1729644433000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ascending or descending order for the specified sorting field in a paged query. This parameter is used together with SortBy during paging. Default value: DESC. Valid values:</p>
     * <ul>
     * <li>ASC: Ascending order.</li>
     * <li>DESC: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page. If MaxResults is also specified, MaxResults prevails.</p>
     * <blockquote>
     * <p>This parameter will soon be offline. We recommend that you use NextToken and MaxResults for paging in paged query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    /**
     * <p>The search condition for &quot;including any of the following file content types&quot;. You can select multiple file content types, and the search results only need to meet one of them. If this parameter is empty, this condition is not applied. Separate multiple file content types with commas.</p>
     */
    @NameInMap("QueryContentTypeIncludeAny")
    public String queryContentTypeIncludeAnyShrink;

    /**
     * <p>The query statement (DSL) is a domain-specific language used to express complex search conditions. It supports grouping, Boolean logic (AND/OR/NOT), range comparison (&gt;, &gt;=, &lt;, &lt;=), property existence (HAS/NOT HAS), token matching (:), and exact matching (=), and is suitable for advanced search scenarios.
     * It is generally used for complex advanced search conditions.
     * <notice>To avoid conflicts, do not mix this query statement with other query parameters.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>(FileUpdateTime &gt; \&quot;2025-02-28T00:00:00Z\&quot; AND FileUpdateTime &lt; \&quot;2025-05-30T09:27:29Z\&quot;) AND FileDir:\&quot;blue_car\&quot; AND NOT FileName=&quot;toyota.jpg&quot; AND (( Tags.all=\&quot;lane line\&quot; AND Tags.all=\&quot;barrier gate\&quot;) OR NOT Tags.user=\&quot;rainy days\&quot; ) AND HAS SemanticIndexJobId AND Content:\&quot;a fallen water horse\&quot; AND TopK=100 AND SignMode=\&quot;PUBLIC\&quot;</p>
     */
    @NameInMap("QueryExpression")
    public String queryExpression;

    /**
     * <p>The file directory search condition. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cars/20250221/</p>
     */
    @NameInMap("QueryFileDir")
    public String queryFileDir;

    /**
     * <p>The file name search condition. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>car</p>
     */
    @NameInMap("QueryFileName")
    public String queryFileName;

    /**
     * <p>The search condition for &quot;including any of the following file types&quot;. You can select multiple file types, and the search results only need to meet one of them. If this parameter is empty, this condition is not applied. Separate multiple file types with commas.</p>
     */
    @NameInMap("QueryFileTypeIncludeAny")
    public String queryFileTypeIncludeAnyShrink;

    /**
     * <p>The image information for image-to-image search.</p>
     * <ul>
     * <li>Supports passing an OSS URL that allows public network access for the image. Format: oss://{bucket_name}/{object_path}. bucket_name is the bucket name, and object_path is the path of the file in the bucket.<blockquote>
     * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://test-xxx-oss/car/0001.png</p>
     */
    @NameInMap("QueryImage")
    public String queryImage;

    /**
     * <p>The search condition for &quot;excluding the following tags&quot;. You can select multiple tags, and the search results must not contain these tags. If this parameter is empty, this condition is not applied.</p>
     * <blockquote>
     * <p>This parameter takes effect only when QueryType is set to TAG or MIX.</p>
     * </blockquote>
     */
    @NameInMap("QueryTagsExclude")
    public String queryTagsExcludeShrink;

    /**
     * <p>The search condition for &quot;including all of the following tags&quot;. You can select multiple tags, and the search results must meet all these tags simultaneously. If this parameter is empty, this condition is not applied. Separate multiple tags with commas.</p>
     * <blockquote>
     * <p>This parameter takes effect only when QueryType is set to TAG or MIX. When QueryType is set to TAG, QueryText is added to this condition.</p>
     * </blockquote>
     */
    @NameInMap("QueryTagsIncludeAll")
    public String queryTagsIncludeAllShrink;

    /**
     * <p>The search condition for &quot;including any of the following tags&quot;. You can select multiple tags, and the search results only need to meet one of them. If this parameter is empty, this condition is not applied. Separate multiple tags with commas.</p>
     * <blockquote>
     * <p>This parameter takes effect only when QueryType is set to TAG or MIX.</p>
     * </blockquote>
     */
    @NameInMap("QueryTagsIncludeAny")
    public String queryTagsIncludeAnyShrink;

    /**
     * <p>The text content to search.</p>
     * 
     * <strong>example:</strong>
     * <p>A fallen water</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>The retrieve type. Valid values:</p>
     * <ul>
     * <li>MIX: Hybrid retrieve. This is the default value.</li>
     * <li>TAG: Label-only retrieve.</li>
     * <li>VECTOR: AISearch-only retrieve.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MIX</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The video file information for video search.</p>
     * <ul>
     * <li>Supports passing an OSS URL that allows public network access for the video. Format: oss://{bucket_name}/{object_path}. bucket_name is the bucket name, and object_path is the path of the file in the bucket.<blockquote>
     * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://test-xxx-oss/car/0001.mp4</p>
     */
    @NameInMap("QueryVideo")
    public String queryVideo;

    /**
     * <p>The similarity score threshold for filtering. Only results with a score greater than ScoreThreshold are returned.</p>
     * <blockquote>
     * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("ScoreThreshold")
    public Float scoreThreshold;

    /**
     * <p>The sorting field for paged query. If this parameter is not specified, the results are sorted by retrieve relevance in descending order during paging. Valid values:</p>
     * <ul>
     * <li>FileCreateTime: Sort by file creation time.</li>
     * <li>FileUpdateTime: Sort by file last modification time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FileCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the file update time range for the query. Specify the time in the ISO 8601 standard in UTC.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("StartFileUpdateTime")
    public String startFileUpdateTime;

    /**
     * <p>The start time of the tag last update time range for the query. Specify the time in the ISO 8601 standard in UTC.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01.000Z</p>
     */
    @NameInMap("StartTagUpdateTime")
    public String startTagUpdateTime;

    /**
     * <p>The metadata status to query. Valid values:</p>
     * <ul>
     * <li>ACTIVE: Query only undeleted data. This is the default value.</li>
     * <li>ALL: Query all data.</li>
     * <li>DELETED: Query only logically deleted data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The thumbnail mode for images. Currently, only OSS files support thumbnails. Valid values:</p>
     * <ul>
     * <li>Proportional scaling: p_{percentage}. percentage indicates the expected scaling ratio. Valid values: [1, 100]. Example: p_50 indicates that the thumbnail size is 50% of the original file size.</li>
     * <li>Fixed width and adaptive height: w_{width}. width indicates the expected image width. Valid values: [1, 16384]. Example: w_200 indicates that the image width is fixed at 200 pixels and the height is adaptively scaled.</li>
     * <li>Fixed height and adaptive width: h_{height}. height indicates the expected image height. Valid values: [1, 16384]. Example: h_100 indicates that the image height is fixed at 100 pixels and the width is adaptively scaled.</li>
     * <li>Fixed width and height with padding: m_pad,w_{width},h_{height},color_{RGB}. m_pad indicates that the image is scaled to the maximum size within the specified w and h rectangle. RGB specifies the color used to fill the blank space in the center. If this parameter is not specified, white is used by default. width indicates the expected image width, and height indicates the expected image height. Valid values of width and height: [1, 16384]. Example:</li>
     * <li>Fixed width and height with center cropping: m_fill,w_{width},h_{height}. m_fill indicates that the image is proportionally scaled to the minimum size that extends beyond the specified w and h rectangle, and the excess part is center-cropped. width indicates the expected image width, and height indicates the expected image height. Valid values of width and height: [1, 16384]. Example: m_fill,w_100,h_100 indicates that the image width and height are both fixed at 100 pixels for center cropping and scaling.</li>
     * <li>Forced width and height scaling: m_fixed,w_{width},h_{height}. width indicates the expected image width, and height indicates the expected image height. Valid values of width and height: [1, 16384]. Example: m_fixed,w_100,h_100 indicates that the image width and height are both fixed at 100 pixels for forced scaling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>w_100</p>
     */
    @NameInMap("ThumbnailMode")
    public String thumbnailMode;

    /**
     * <p>The number of search results to return. A maximum of TopK search results are returned.</p>
     * <blockquote>
     * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The ID of the workspace to which the dataset belongs. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
