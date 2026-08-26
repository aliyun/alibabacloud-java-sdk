// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayedStreamingUsageRequest extends TeaModel {
    /**
     * <p>The streaming domain name to query.</p>
     * <ul>
     * <li>You can specify a single domain name or multiple domain names. Separate multiple domain names with commas (,).</li>
     * <li>If this parameter is left empty, the aggregated data of all live streaming domain names is returned by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. The time span cannot exceed 10 hours. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the queried data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>300</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * <p>If this parameter is left empty or set to an unsupported value, the default value 3600 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The live center to query. You can specify multiple regions. Separate multiple regions with commas (,). Valid values:</p>
     * <ul>
     * <li>cn-beijing: Beijing</li>
     * <li>cn-shanghai: Shanghai</li>
     * <li>cn-shenzhen: Shenzhen</li>
     * <li>cn-qingdao: Qingdao</li>
     * <li>ap-southeast-1: Singapore</li>
     * <li>eu-central-1: Germany</li>
     * <li>ap-northeast-1: Tokyo</li>
     * <li>ap-southeast-5: Jakarta</li>
     * </ul>
     * <p>If this parameter is left empty, the aggregated data of all regions is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The grouping key. If this parameter is left empty, user data is aggregated. Valid values:</p>
     * <ul>
     * <li>domain: domain name. If the SplitBy (grouping key) parameter is set to domain, the Domain response parameter takes effect.</li>
     * <li>region: live center region. If the SplitBy (grouping key) parameter is set to region, the Region response parameter takes effect.</li>
     * <li>stream: stream name. If the SplitBy (grouping key) parameter is set to stream, the stream response parameter takes effect.</li>
     * </ul>
     * <blockquote>
     * <p>You can query data only when the parameter corresponding to the grouping key is not empty. Otherwise, an error is returned. For example, when DomainName is empty, you cannot specify domain as the grouping key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. By default, data of the last seven days is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The stream name. Separate multiple stream names with commas (,). By default, the data of all stream names is aggregated.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveDelayedStreamingUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDelayedStreamingUsageRequest self = new DescribeLiveDelayedStreamingUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDelayedStreamingUsageRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDelayedStreamingUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDelayedStreamingUsageRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDelayedStreamingUsageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDelayedStreamingUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDelayedStreamingUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDelayedStreamingUsageRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeLiveDelayedStreamingUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDelayedStreamingUsageRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
