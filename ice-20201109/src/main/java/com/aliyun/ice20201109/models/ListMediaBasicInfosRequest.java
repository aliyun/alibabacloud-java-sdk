// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosRequest extends TeaModel {
    /**
     * <p>The authentication expiration time. Unit: seconds.</p>
     * <ul>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: 86400.</li>
     * <li>Default value: 3600.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <ul>
     * <li><p>&quot;subtitles&quot;: Subtitles.</p>
     * </li>
     * <li><p>&quot;watermark&quot;: Watermark.</p>
     * </li>
     * <li><p>&quot;opening&quot;: Opening.</p>
     * </li>
     * <li><p>&quot;ending&quot;: Ending.</p>
     * </li>
     * <li><p>&quot;general&quot;: General.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>opening</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The end time of the creation time (utcCreated).</p>
     * <ul>
     * <li><p>The interval is closed, which means the time must be earlier than or equal to the end time.</p>
     * </li>
     * <li><p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC+8).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-12-20T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to include the basic information of the file in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    /**
     * <p>The maximum number of records to return for the current request.</p>
     * <p>Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the media asset. A single media asset ID supports prefix matching.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The media type of the media asset. Valid values:</p>
     * <ul>
     * <li><p>&quot;image&quot;: Image.</p>
     * </li>
     * <li><p>&quot;video&quot;: Video.</p>
     * </li>
     * <li><p>&quot;audio&quot;: Audio.</p>
     * </li>
     * <li><p>&quot;text&quot;: Text.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The token that indicates the position from which the current call starts to read. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order based on utcCreated. Default value: desc. Valid values:</p>
     * <ul>
     * <li><p>&quot;desc&quot;: Descending order.</p>
     * </li>
     * <li><p>&quot;asc&quot;: Ascending order.</p>
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
     * <li><p>&quot;oss&quot;: OSS storage.</p>
     * </li>
     * <li><p>&quot;vod&quot;: VOD.</p>
     * </li>
     * <li><p>&quot;live&quot;: ApsaraVideo Live.</p>
     * </li>
     * <li><p>&quot;general&quot;: Other sources (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of the creation time (utcCreated).</p>
     * <ul>
     * <li><p>The interval is open, which means the time must be later than the start time.</p>
     * </li>
     * <li><p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC+8).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-12-20T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The resource status. Valid values:</p>
     * <ul>
     * <li><p>Init: Initial state. The source file is not ready.</p>
     * </li>
     * <li><p>Preparing: The source file is being prepared, such as being uploaded or edited and produced.</p>
     * </li>
     * <li><p>PrepareFail: The source file fails to be prepared, such as failing to obtain the source file information.</p>
     * </li>
     * <li><p>Normal: Normal. The source file is ready.</p>
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
