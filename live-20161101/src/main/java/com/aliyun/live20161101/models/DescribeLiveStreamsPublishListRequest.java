// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsPublishListRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ingest domain or main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The time range specified by the StartTime and EndTime parameters cannot exceed 30 days.</p>
     * <p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sorting method. Valid values:</p>
     * <ul>
     * <li><strong>stream_name_desc</strong>: sorts the entries in descending order by stream name.</li>
     * <li><strong>stream_name_asc</strong>: sorts the entries in ascending order by stream name.</li>
     * <li><strong>publish_time_desc</strong>: sorts the entries in descending order by stream ingest time.</li>
     * <li><strong>publish_time_asc</strong> (default): sorts the entries in ascending order by stream ingest time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>publish_time_desc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 3000</strong>. Default value: <strong>2000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The mode in which stream names are matched. Valid values:</p>
     * <ul>
     * <li><strong>fuzzy</strong> (default): fuzzy match</li>
     * <li><strong>strict</strong>: exact match</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The type of the streams to query. Valid values:</p>
     * <ul>
     * <li>An empty value****: source streams</li>
     * <li><strong>all</strong>: all streams</li>
     * <li><strong>trans</strong>: transcoded streams</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    public static DescribeLiveStreamsPublishListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsPublishListRequest self = new DescribeLiveStreamsPublishListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsPublishListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamsPublishListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsPublishListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamsPublishListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeLiveStreamsPublishListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamsPublishListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveStreamsPublishListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsPublishListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeLiveStreamsPublishListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamsPublishListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamsPublishListRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLiveStreamsPublishListRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

}
