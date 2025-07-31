// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamMergeRequest extends TeaModel {
    /**
     * <p>The name of the application that generates the output stream. The value must be the same as the application name in the ingest URL of the output stream. Otherwise, the configuration does not take effect. You cannot set the value to an asterisk (\*).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the stream mixing.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The interval between the start time and the end time must be within 7 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-29T01:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the application that generates the input primary stream. The value must be the same as the application name that is specified in the ingest URL of the primary stream. Otherwise, the configuration does not take effect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app1</p>
     */
    @NameInMap("InAppName1")
    public String inAppName1;

    /**
     * <p>The name of the application that generates the input secondary stream. The value must be the same as the application name that is specified in the ingest URL of the secondary stream. Otherwise, the configuration does not take effect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app2</p>
     */
    @NameInMap("InAppName2")
    public String inAppName2;

    /**
     * <p>The name of the input primary stream. The value must be the same as the stream name that is specified in the ingest URL of the primary stream. Otherwise, the configuration does not take effect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InStream1</p>
     */
    @NameInMap("InStreamName1")
    public String inStreamName1;

    /**
     * <p>The name of the input secondary stream. The value must be the same as the stream name that is specified in the ingest URL of the secondary stream. Otherwise, the configuration does not take effect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stream2</p>
     */
    @NameInMap("InStreamName2")
    public String inStreamName2;

    @NameInMap("LiveMerger")
    public String liveMerger;

    @NameInMap("MergeParameters")
    public String mergeParameters;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The streaming protocol. Valid values:</p>
     * <ul>
     * <li><strong>rtmp</strong>: This is the default value.</li>
     * <li><strong>rtc</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the stream mixing.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the output stream. The value must be the same as the stream name in the ingest URL of the output stream. Otherwise, the configuration does not take effect. You cannot set the value to an asterisk (\*).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static AddLiveStreamMergeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamMergeRequest self = new AddLiveStreamMergeRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamMergeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveStreamMergeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveStreamMergeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddLiveStreamMergeRequest setInAppName1(String inAppName1) {
        this.inAppName1 = inAppName1;
        return this;
    }
    public String getInAppName1() {
        return this.inAppName1;
    }

    public AddLiveStreamMergeRequest setInAppName2(String inAppName2) {
        this.inAppName2 = inAppName2;
        return this;
    }
    public String getInAppName2() {
        return this.inAppName2;
    }

    public AddLiveStreamMergeRequest setInStreamName1(String inStreamName1) {
        this.inStreamName1 = inStreamName1;
        return this;
    }
    public String getInStreamName1() {
        return this.inStreamName1;
    }

    public AddLiveStreamMergeRequest setInStreamName2(String inStreamName2) {
        this.inStreamName2 = inStreamName2;
        return this;
    }
    public String getInStreamName2() {
        return this.inStreamName2;
    }

    public AddLiveStreamMergeRequest setLiveMerger(String liveMerger) {
        this.liveMerger = liveMerger;
        return this;
    }
    public String getLiveMerger() {
        return this.liveMerger;
    }

    public AddLiveStreamMergeRequest setMergeParameters(String mergeParameters) {
        this.mergeParameters = mergeParameters;
        return this;
    }
    public String getMergeParameters() {
        return this.mergeParameters;
    }

    public AddLiveStreamMergeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveStreamMergeRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public AddLiveStreamMergeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveStreamMergeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddLiveStreamMergeRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
