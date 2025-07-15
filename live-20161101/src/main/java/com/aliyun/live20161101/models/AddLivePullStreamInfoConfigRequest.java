// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePullStreamInfoConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. This parameter is determined by you.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The domain name used for stream pulling. It is the main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time when stream pulling ends.</p>
     * <p>The time range specified by the StartTime and EndTime parameters cannot exceed seven days. The time specified by the EndTime parameter must be later than the current time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The origin URL of the live stream. You can specify multiple URLs. Separate them with semicolons (;).</p>
     * <blockquote>
     * <p> You can pull only live streams in the Real-Time Messaging Protocol (RTMP), Flash Video (FLV), HTTP Live Streaming (HLS), and Secure Reliable Transport (SRT) formats.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceUrl")
    public String sourceUrl;

    /**
     * <p>The time when stream pulling starts.</p>
     * <p>The time range specified by the StartTime and EndTime parameters cannot exceed seven days. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream. This parameter is determined by you.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static AddLivePullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLivePullStreamInfoConfigRequest self = new AddLivePullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLivePullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLivePullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLivePullStreamInfoConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddLivePullStreamInfoConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLivePullStreamInfoConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLivePullStreamInfoConfigRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public AddLivePullStreamInfoConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddLivePullStreamInfoConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
