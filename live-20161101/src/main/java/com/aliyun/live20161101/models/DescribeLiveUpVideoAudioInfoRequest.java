// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUpVideoAudioInfoRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T15:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stream that you want to query. Specify this parameter in the following format: <code>rtmp://Ingest domain/Application name/Stream name</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>DescribeLiveUpVideoAudioInfo</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/AppName/StreamName</p>
     */
    @NameInMap("Stream")
    public String stream;

    public static DescribeLiveUpVideoAudioInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUpVideoAudioInfoRequest self = new DescribeLiveUpVideoAudioInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUpVideoAudioInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveUpVideoAudioInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveUpVideoAudioInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveUpVideoAudioInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveUpVideoAudioInfoRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
