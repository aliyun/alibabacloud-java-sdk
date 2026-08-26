// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPushMetricDetailDataRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. Specify the application name to query data at the stream granularity for the corresponding application.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <ul>
     * <li>The accelerated domain name to query. Only a single domain name can be queried. An error is returned if you specify multiple domain names.</li>
     * <li>If you do not specify AppName or StreamName, data at the stream granularity for all streams under the specified accelerated domain name is returned without aggregation.</li>
     * <li>If DomainName is specified and both AppName and StreamName are set to all, aggregate data at the stream granularity for all streams under the specified accelerated domain name is returned.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the UTC time zone. The end time must be later than the start time, and the difference cannot exceed 1 day.</p>
     * <p>Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The paging query token. Each query returns a maximum of 5,000 rows of data. If the data to be queried exceeds 5,000 rows, the response includes the start index for the next query.</p>
     * <p>Pass this token in the request to continue querying data from the row after the last row returned in the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>UjsM9x3aVcJi9a0-ArwJUTTC67C***37C0=</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the UTC time zone.</p>
     * <p>Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream. If you specify StreamName, data at the stream granularity is returned for the specified StreamName under the specified AppName. You must specify AppName when you specify StreamName.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveStreamPushMetricDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamPushMetricDetailDataRequest self = new DescribeLiveStreamPushMetricDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamPushMetricDetailDataRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
