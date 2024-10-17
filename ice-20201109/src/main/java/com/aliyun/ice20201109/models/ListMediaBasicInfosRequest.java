// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosRequest extends TeaModel {
    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <p>\- subtitles</p>
     * <p>\- watermark</p>
     * <p>\- opening</p>
     * <p>\- ending</p>
     * <p>\- general</p>
     * 
     * <strong>example:</strong>
     * <p>opening</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The end time of utcCreated.</p>
     * <p>\- The value is the end of the left-open right-closed interval.</p>
     * <p>\- Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC +8).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-20T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to return the basic information of the source file.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media asset. Valid values:</p>
     * <p>\- image</p>
     * <p>\- video</p>
     * <p>\- audio</p>
     * <p>\- text</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The order of sorting by utcCreated. Default value: desc. Valid values:</p>
     * <p>\- desc</p>
     * <p>\- asc</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The source of the media asset. Valid values:</p>
     * <p>\- oss: Object Storage Service (OSS).</p>
     * <p>\- vod: ApsaraVideo VOD.</p>
     * <p>\- live: ApsaraVideo Live.</p>
     * <p>\- general: other sources. This is the default value.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of utcCreated.</p>
     * <p>\- The value is the beginning of a left-open right-closed interval.</p>
     * <p>\- Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC +8).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-20T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the media asset. Valid values:</p>
     * <p>\- Init: the initial state, which indicates that the source file is not ready.</p>
     * <p>\- Preparing: The source file is being prepared. For example, the file is being uploaded or edited.</p>
     * <p>\- PrepareFail: The source file failed to be prepared. For example, the information of the source file failed to be obtained.</p>
     * <p>\- Normal: The source file is ready.</p>
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
