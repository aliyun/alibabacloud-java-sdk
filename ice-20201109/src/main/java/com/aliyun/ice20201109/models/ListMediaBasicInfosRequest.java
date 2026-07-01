// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosRequest extends TeaModel {
    /**
     * <p>The authentication expiration time, in seconds.</p>
     * <ul>
     * <li><p>Minimum value: 1.</p>
     * </li>
     * <li><p>Maximum value: 86400.</p>
     * </li>
     * <li><p>Default value: 3600.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The business type. Valid values:</p>
     * <ul>
     * <li><p><code>subtitles</code>: subtitles</p>
     * </li>
     * <li><p><code>watermark</code>: watermark</p>
     * </li>
     * <li><p><code>opening</code>: opening</p>
     * </li>
     * <li><p><code>ending</code>: ending</p>
     * </li>
     * <li><p><code>general</code>: General</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>opening</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The end time of the query range, based on the creation time (<code>utcCreated</code>).</p>
     * <ul>
     * <li><p>The query returns results created at or before this time (inclusive).</p>
     * </li>
     * <li><p>The time must be in UTC and comply with the ISO 8601 standard. The format is <code>YYYY-MM-DD\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code>. For example, <code>2017-01-11T12:00:00Z</code> corresponds to 20:00:00 on January 11, 2017 (UTC+8).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-12-20T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Set to <code>true</code> to include basic file information in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    /**
     * <p>The maximum number of results to return per page.</p>
     * <p>Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The media ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The media type. Valid values:</p>
     * <ul>
     * <li><p><code>image</code>: image</p>
     * </li>
     * <li><p><code>video</code>: video</p>
     * </li>
     * <li><p><code>audio</code>: audio</p>
     * </li>
     * <li><p><code>text</code>: text</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The pagination token used to retrieve the next page of results. An empty value indicates that all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order for results based on the creation time (<code>utcCreated</code>). The default is descending. Valid values:</p>
     * <ul>
     * <li><p><code>desc</code>: Descending order</p>
     * </li>
     * <li><p><code>asc</code>: Ascending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The source. Valid values:</p>
     * <ul>
     * <li><p><code>oss</code>: OSS</p>
     * </li>
     * <li><p><code>vod</code>: video on demand</p>
     * </li>
     * <li><p><code>live</code>: live streaming</p>
     * </li>
     * <li><p><code>general</code>: Other sources (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of the query range, based on the creation time (<code>utcCreated</code>).</p>
     * <ul>
     * <li><p>The query returns results created after this time (exclusive).</p>
     * </li>
     * <li><p>The time must be in UTC and comply with the ISO 8601 standard. The format is <code>YYYY-MM-DD\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code>. For example, <code>2017-01-11T12:00:00Z</code> corresponds to 20:00:00 on January 11, 2017 (UTC+8).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-12-20T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The media status. Valid values:</p>
     * <ul>
     * <li><p><code>Init</code>: The source file is not ready.</p>
     * </li>
     * <li><p><code>Preparing</code>: The source file is being prepared. For example, it is being uploaded or composited.</p>
     * </li>
     * <li><p><code>PrepareFail</code>: The source file failed to prepare. This may occur, for example, if the system fails to retrieve information about the source file.</p>
     * </li>
     * <li><p><code>Normal</code>: The source file is ready.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListMediaBasicInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaBasicInfosRequest self = new ListMediaBasicInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaBasicInfosRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public ListMediaBasicInfosRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListMediaBasicInfosRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMediaBasicInfosRequest setIncludeFileBasicInfo(Boolean includeFileBasicInfo) {
        this.includeFileBasicInfo = includeFileBasicInfo;
        return this;
    }
    public Boolean getIncludeFileBasicInfo() {
        return this.includeFileBasicInfo;
    }

    public ListMediaBasicInfosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaBasicInfosRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ListMediaBasicInfosRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListMediaBasicInfosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaBasicInfosRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListMediaBasicInfosRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListMediaBasicInfosRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListMediaBasicInfosRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
