// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDetailFrameRateAndBitRateDataRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can view the AppName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ingest domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC+8).</p>
     * <blockquote>
     * <p>If StartTime and EndTime are invalid or not specified, data from the last 1 hour is returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>The start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC+8).</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream. You can view the StreamName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleStreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveStreamDetailFrameRateAndBitRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDetailFrameRateAndBitRateDataRequest self = new DescribeLiveStreamDetailFrameRateAndBitRateDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
