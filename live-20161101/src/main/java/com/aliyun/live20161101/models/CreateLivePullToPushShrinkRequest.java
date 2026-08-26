// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePullToPushShrinkRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>HTTP callback URL. Default value: empty.</p>
     * <blockquote>
     * <ul>
     * <li>The URL that receives task-related callbacks.</li>
     * <li>Maximum length is 2000 characters.</li>
     * <li>If this parameter is not specified, no task event callbacks will be sent.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Destination URL address for pushing the stream.</p>
     * <blockquote>
     * <ul>
     * <li>The rtmp protocol is supported.</li>
     * <li>Maximum length is 2000 characters.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://pushtest.********.aliyunlive.com/pulltest493/pulltest-w434</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

    /**
     * <p>Task end time.</p>
     * <blockquote>
     * <ul>
     * <li>Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</li>
     * <li>EndTime must be later than StartTime.</li>
     * <li>EndTime must be later than the current time.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T14:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>File index. Starts playback from the nth file.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FileIndex")
    public Integer fileIndex;

    @NameInMap("NotifyItemSwitch")
    public String notifyItemSwitch;

    /**
     * <p>Start offset. The offset value from the beginning of the video file. Unit: seconds. Valid values: greater than 0.</p>
     * <blockquote>
     * <ul>
     * <li>Indicates the position to start reading from, relative to the first frame (applies to the first video).</li>
     * <li>This parameter applies only to VOD or third-party video streams.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies the region where the task is launched. Valid values:</p>
     * <ul>
     * <li>ap-southeast-1 (Singapore)</li>
     * <li>ap-southeast-5 (Indonesia)</li>
     * <li>cn-beijing (Beijing)</li>
     * <li>cn-shanghai (Shanghai)</li>
     * <li>cn-shenzhen (Shenzhen)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Number of times to repeat playback after the initial playback is complete. Valid values:</p>
     * <ul>
     * <li>0 (default): no repeat playback.</li>
     * <li>-1: loop indefinitely.</li>
     * <li>Other positive integers: number of times to repeat playback after the initial playback is complete.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only to VOD or third-party video streams.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatNumber")
    public Integer repeatNumber;

    @NameInMap("ReqAuth")
    public String reqAuth;

    /**
     * <p>Number of retries. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RetryCount")
    public Integer retryCount;

    /**
     * <p>Retry interval, in seconds. Valid values: [60, 300]. Default value: 60 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <p>Source stream protocol name.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>rtmp</li>
     * <li>srt</li>
     * <li>http-flv</li>
     * <li>hls<blockquote>
     * <p>This parameter is <strong>required only when the SourceType parameter is set to live</strong>, and is invalid when the value is vod or url.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("SourceProtocol")
    public String sourceProtocol;

    /**
     * <p>Source stream type. Valid values:</p>
     * <ul>
     * <li>live: live stream.</li>
     * <li>vod: ApsaraVideo VOD resource.</li>
     * <li>url: third-party video file resource.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>List of source stream URL addresses.</p>
     * <blockquote>
     * <ul>
     * <li>For the live type, only one complete live playback URL is supported.</li>
     * <li>For the vod and url types, a maximum of 30 URLs can be specified.</li>
     * <li>The live type supports: rtmp, srt, and http-flv protocols.</li>
     * <li>For the vod type, specify ApsaraVideo VOD media asset IDs.</li>
     * <li>The url type supports: mp4 and http-flv protocols.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceUrls")
    public String sourceUrlsShrink;

    /**
     * <p>Task start time.</p>
     * <blockquote>
     * <ul>
     * <li>Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-26T10:30:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Task name, used to support fuzzy query. Default value: &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateLivePullToPushShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePullToPushShrinkRequest self = new CreateLivePullToPushShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePullToPushShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateLivePullToPushShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateLivePullToPushShrinkRequest setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
        return this;
    }
    public String getDstUrl() {
        return this.dstUrl;
    }

    public CreateLivePullToPushShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLivePullToPushShrinkRequest setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public Integer getFileIndex() {
        return this.fileIndex;
    }

    public CreateLivePullToPushShrinkRequest setNotifyItemSwitch(String notifyItemSwitch) {
        this.notifyItemSwitch = notifyItemSwitch;
        return this;
    }
    public String getNotifyItemSwitch() {
        return this.notifyItemSwitch;
    }

    public CreateLivePullToPushShrinkRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public CreateLivePullToPushShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLivePullToPushShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateLivePullToPushShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLivePullToPushShrinkRequest setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
        return this;
    }
    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public CreateLivePullToPushShrinkRequest setReqAuth(String reqAuth) {
        this.reqAuth = reqAuth;
        return this;
    }
    public String getReqAuth() {
        return this.reqAuth;
    }

    public CreateLivePullToPushShrinkRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateLivePullToPushShrinkRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateLivePullToPushShrinkRequest setSourceProtocol(String sourceProtocol) {
        this.sourceProtocol = sourceProtocol;
        return this;
    }
    public String getSourceProtocol() {
        return this.sourceProtocol;
    }

    public CreateLivePullToPushShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateLivePullToPushShrinkRequest setSourceUrlsShrink(String sourceUrlsShrink) {
        this.sourceUrlsShrink = sourceUrlsShrink;
        return this;
    }
    public String getSourceUrlsShrink() {
        return this.sourceUrlsShrink;
    }

    public CreateLivePullToPushShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateLivePullToPushShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
