// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayedStreamingUsageRequest extends TeaModel {
    /**
     * <p>The main streaming domain to query.</p>
     * <ul>
     * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time. We recommend that you specify a time range that is less than or equal to 10 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>300</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * <p>If you specify an invalid value or do not specify this parameter, the default value 3600 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. Separate multiple region IDs with commas (,). Valid values:</p>
     * <ul>
     * <li>cn-beijing: China (Beijing)</li>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-shenzhen: China (Shenzhen)</li>
     * <li>cn-qingdao: China (Qingdao)</li>
     * <li>ap-southeast-1: Singapore</li>
     * <li>eu-central-1: Germany (Frankfurt)</li>
     * <li>ap-northeast-1: Japan (Tokyo)</li>
     * <li>ap-southeast-5: Indonesia (Jakarta)</li>
     * </ul>
     * <p>If you leave this parameter empty, data of all regions is aggregated and returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The key that is used to group data. If you leave this parameter empty, data is aggregated and returned. Valid values:</p>
     * <ul>
     * <li>domain: The DomainName parameter in the response takes effect only if SplitBy is set to domain.</li>
     * <li>region: The Region parameter in the response takes effect only if SplitBy is set to region.</li>
     * <li>stream: The StreamName parameter in the response takes effect only if SplitBy is set to stream.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if the parameter corresponding to the value of this parameter is not left empty. Otherwise, an error is returned. For example, you cannot set this parameter to domain if the DomainName parameter is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. By default, data in the last seven days is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the stream. Separate multiple stream names with commas (,). By default, data of all streams is aggregated and returned.</p>
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
