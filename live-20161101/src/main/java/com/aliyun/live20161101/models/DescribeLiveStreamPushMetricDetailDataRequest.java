// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPushMetricDetailDataRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. The stream-level data of this application is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <ul>
     * <li>The accelerated domain name. You can specify only one domain name. If you specify multiple domain names, an error occurs.</li>
     * <li>If you do not specify the AppName and StreamName parameters, data of all streams under the specified domain name is returned. The data is not aggregated.</li>
     * <li>If you specify the DomainName parameter and set both the AppName and StreamName parameters to all, data of all streams in all applications under the specified domain name is aggregated and returned.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time, and the maximum time range that can be specified is one day. Specify the time in the ISO 8601 standard</p>
     * <p>in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A pagination token. When you call this operation, up to 5,000 rows of data can be returned per query. If the number of rows exceeds 5,000, the response includes a pagination token that is used in the next request to retrieve a new page of results.</p>
     * <p>When you specify the token in the next query, data continues to be obtained from the end of the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>UjsM9x3aVcJi9a0-ArwJUTTC67C***37C0=</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream. The data of the stream in the specified application is returned. If the StreamName parameter is specified, the AppName parameter must also be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
