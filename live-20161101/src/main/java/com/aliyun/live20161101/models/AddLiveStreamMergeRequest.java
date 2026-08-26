// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamMergeRequest extends TeaModel {
    /**
     * <p>The AppName of the output stream. For the configuration to take effect, this AppName must match the one in the ingest URL. Wildcards (<code>*</code>) are not supported.</p>
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
     * <p>The end time of the stream merge.</p>
     * <p>The time must be in UTC and specified in the ISO 8601 standard format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * <blockquote>
     * <p>The interval between <code>StartTime</code> and <code>EndTime</code> cannot exceed 7 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-29T01:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The AppName of the primary input stream. This value must match the AppName in the ingest URL for the primary stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app1</p>
     */
    @NameInMap("InAppName1")
    public String inAppName1;

    /**
     * <p>The AppName of the backup input stream. This value must match the AppName in the ingest URL for the backup stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app2</p>
     */
    @NameInMap("InAppName2")
    public String inAppName2;

    /**
     * <p>The StreamName of the primary input stream. This value must match the StreamName in the ingest URL for the primary stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InStream1</p>
     */
    @NameInMap("InStreamName1")
    public String inStreamName1;

    /**
     * <p>The StreamName of the backup input stream. This value must match the StreamName in the ingest URL for the backup stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stream2</p>
     */
    @NameInMap("InStreamName2")
    public String inStreamName2;

    /**
     * <p>The engine to use for stream merging.</p>
     * <ul>
     * <li><p><code>on</code>: The new liveswitch engine.</p>
     * </li>
     * <li><p><code>off</code>: A legacy engine (such as rtmpr). This is the default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LiveMerger")
    public String liveMerger;

    /**
     * <p>Parameters that define the failover conditions. A failover is triggered when one of the following conditions is met:</p>
     * <ol>
     * <li><p>An explicit stream disconnection occurs, such as an end-of-file (EOF) or network error.</p>
     * </li>
     * <li><p>The stutter rate exceeds 60% in the last 5 seconds.</p>
     * </li>
     * <li><p>A stream pulling timeout occurs if no frame data is received for 2 consecutive seconds.</p>
     * </li>
     * <li><p>The average frame rate over the period specified by <code>ali_max_no_frame_timeout</code> drops below <code>ali_low_frame_rate_threshold</code>. This condition applies even if there is no stream disconnection or stuttering. If you set <code>ali_max_no_frame_timeout</code>, the timeout for Condition 3 is also updated to this value.</p>
     * </li>
     * <li><p>If <code>block_all_jitter</code> is set to <code>1</code>, Conditions 2, 3, and 4 do not apply.</p>
     * </li>
     * </ol>
     * <ul>
     * <li><code>ali_max_no_frame_timeout</code>: an integer from 2 to 10.<br><code>ali_low_frame_rate_threshold</code>: an integer from 1 to 200.<br><code>block_all_jitter</code>: <code>0</code> or <code>1</code>.<br><br></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ali_low_frame_rate_threshold=10&amp;ali_max_no_frame_timeout=5&amp;block_all_jitter=0</p>
     */
    @NameInMap("MergeParameters")
    public String mergeParameters;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The live stream protocol for the input streams. Valid values:</p>
     * <ul>
     * <li><p><strong>rtmp</strong> (Default)</p>
     * </li>
     * <li><p><strong>rtc</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectAppName")
    public String selectAppName;

    @NameInMap("SelectStreamName")
    public String selectStreamName;

    /**
     * <p>The start time of the stream merge.</p>
     * <p>The time must be in UTC and specified in the ISO 8601 standard format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The StreamName of the output stream. For the configuration to take effect, this StreamName must match the one in the ingest URL. Wildcards (<code>*</code>) are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("SwitchMode")
    public String switchMode;

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

    public AddLiveStreamMergeRequest setSelectAppName(String selectAppName) {
        this.selectAppName = selectAppName;
        return this;
    }
    public String getSelectAppName() {
        return this.selectAppName;
    }

    public AddLiveStreamMergeRequest setSelectStreamName(String selectStreamName) {
        this.selectStreamName = selectStreamName;
        return this;
    }
    public String getSelectStreamName() {
        return this.selectStreamName;
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

    public AddLiveStreamMergeRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
