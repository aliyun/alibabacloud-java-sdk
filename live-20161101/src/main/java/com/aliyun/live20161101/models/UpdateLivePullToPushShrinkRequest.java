// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePullToPushShrinkRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The callback URL. Default value: empty.</p>
     * <blockquote>
     * <ul>
     * <li>The URL that receives task-related callbacks.</li>
     * <li>Maximum length: 2000 characters.</li>
     * <li>If this parameter is not specified, task events are not sent as callbacks.</li>
     * <li>The update takes effect only when the next event is triggered.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The end time of the task.</p>
     * <blockquote>
     * <ul>
     * <li>Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</li>
     * <li>EndTime must be later than StartTime.</li>
     * <li>EndTime must be later than the current time.</li>
     * <li>If the task has ended, the update does not take effect.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T14:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The video index. Default value: 0.</p>
     * <blockquote>
     * <p>The update must be performed when the task is stopped and takes effect after the task is restarted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FileIndex")
    public Integer fileIndex;

    @NameInMap("NotifyItemSwitch")
    public String notifyItemSwitch;

    /**
     * <p>The start offset of the video file, in seconds. Valid values: greater than 0.</p>
     * <blockquote>
     * <ul>
     * <li>Specifies the position to start reading from, relative to the first frame.</li>
     * <li>This parameter applies only to video-on-demand or third-party video streams.</li>
     * <li>This parameter takes effect only when the first video in the playlist is played.</li>
     * <li>The update must be performed when the task is stopped and takes effect after the task is restarted.</li>
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
     * <p>The region where the task is started. Valid values:</p>
     * <ul>
     * <li>ap-southeast-1 (Singapore)</li>
     * <li>ap-southeast-5 (Indonesia)</li>
     * <li>cn-beijing (Beijing)</li>
     * <li>cn-shanghai (Shanghai)</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of times playback repeats after the playlist finishes. Valid values:</p>
     * <ul>
     * <li>0 (default): No repeat playback.</li>
     * <li>-1: Loops indefinitely.</li>
     * <li>Other positive integers: The number of times playback repeats after the playlist finishes.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter applies only to video-on-demand or third-party video streams.</li>
     * <li>The update takes effect immediately.</li>
     * </ul>
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
     * <p>The list of source stream URLs.</p>
     * <blockquote>
     * <ul>
     * <li>For the live type, only one complete live streaming URL is supported.</li>
     * <li>For the vod and url types, up to 30 URLs can be specified.</li>
     * <li>The live type supports RTMP, SRT, and HTTP-FLV protocols.</li>
     * <li>For the vod type, specify ApsaraVideo VOD media asset IDs.</li>
     * <li>The url type supports MP4 and HTTP-FLV protocols.</li>
     * <li>For live source streams, the update takes effect immediately. For video file source streams, the update takes effect after the currently playing video ends, and playback restarts from the beginning of the updated video list.</li>
     * <li>The update must be performed when the task is stopped and takes effect after the task is restarted.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>changedtesturl</p>
     */
    @NameInMap("SourceUrls")
    public String sourceUrlsShrink;

    /**
     * <p>The start time of the task.</p>
     * <blockquote>
     * <ul>
     * <li>Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</li>
     * <li>If the task has already started running, the update does not take effect.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-08-23T15:30:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fd245384-4067-4f91-9d75-9666a6bc****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateLivePullToPushShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePullToPushShrinkRequest self = new UpdateLivePullToPushShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePullToPushShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public UpdateLivePullToPushShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UpdateLivePullToPushShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateLivePullToPushShrinkRequest setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public Integer getFileIndex() {
        return this.fileIndex;
    }

    public UpdateLivePullToPushShrinkRequest setNotifyItemSwitch(String notifyItemSwitch) {
        this.notifyItemSwitch = notifyItemSwitch;
        return this;
    }
    public String getNotifyItemSwitch() {
        return this.notifyItemSwitch;
    }

    public UpdateLivePullToPushShrinkRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public UpdateLivePullToPushShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLivePullToPushShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateLivePullToPushShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLivePullToPushShrinkRequest setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
        return this;
    }
    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public UpdateLivePullToPushShrinkRequest setReqAuth(String reqAuth) {
        this.reqAuth = reqAuth;
        return this;
    }
    public String getReqAuth() {
        return this.reqAuth;
    }

    public UpdateLivePullToPushShrinkRequest setSourceUrlsShrink(String sourceUrlsShrink) {
        this.sourceUrlsShrink = sourceUrlsShrink;
        return this;
    }
    public String getSourceUrlsShrink() {
        return this.sourceUrlsShrink;
    }

    public UpdateLivePullToPushShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateLivePullToPushShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
