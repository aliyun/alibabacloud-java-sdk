// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePullToPushRequest extends TeaModel {
    /**
     * <p>The callback URL. By default, this parameter is left empty.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The URL is used to receive callbacks related to the task.</p>
     * </li>
     * <li><p>The URL can be up to 2,000 characters in length.</p>
     * </li>
     * <li><p>If you do not specify this parameter, no callbacks are returned for events related to the task.</p>
     * </li>
     * <li><p>The update takes effect for subsequent events that occur.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The end time of the task.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * </li>
     * <li><p>The time range specified by the StartTime and EndTime parameters cannot exceed seven days.</p>
     * </li>
     * <li><p>The end time must be later than the start time.</p>
     * </li>
     * <li><p>The end time must be later than the current time.</p>
     * </li>
     * <li><p>If the task has ended, the update does not take effect.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T14:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The file index. Default value: 0.</p>
     * <blockquote>
     * <p> You can modify this parameter only if the task is stopped. The update takes effect after you restart the task.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FileIndex")
    public Integer fileIndex;

    /**
     * <p>The offset of the position where the system starts to read the video resource. Unit: seconds. Valid values: positive numbers.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter indicates an offset from the first frame.</p>
     * </li>
     * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
     * </li>
     * <li><p>The update takes effect only for the first video in a video list.</p>
     * </li>
     * <li><p>You can modify this parameter only if the task is stopped. The update takes effect immediately.</p>
     * </li>
     * </ul>
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
     * <li>ap-southeast-1: Singapore</li>
     * <li>ap-southeast-5: Indonesia (Jakarta)</li>
     * <li>cn-beijing: China (Beijing)</li>
     * <li>cn-shanghai: China (Shanghai)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of playbacks after the first playback is complete. Valid values:</p>
     * <ul>
     * <li>0 (default): specifies that the video list is played only once.</li>
     * <li>\-1: specifies that the video list is played in loop mode.</li>
     * <li>Positive integer: specifies the number of times the video list repeats after the first playback is complete.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
     * </li>
     * <li><p>The update can take effect immediately.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatNumber")
    public Integer repeatNumber;

    /**
     * <p>The source URLs.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If SourceType is set to live, you can specify only one streaming URL.</p>
     * </li>
     * <li><p>If SourceType is set to vod or url, you can specify up to 30 IDs or URLs.</p>
     * </li>
     * <li><p>If SourceType is set to live, the supported protocols for URLs are Real-Time Messaging Protocol (RTMP), Real-Time Streaming Protocol (RTSP), Secure Reliable Transport Protocol (SRT), and HTTP-FLV.</p>
     * </li>
     * <li><p>If SourceType is set to vod, specify the IDs of media assets from ApsaraVideo VOD.</p>
     * </li>
     * <li><p>If SourceType is set to url, the supported protocols for URLs are MP4 and HTTP-FLV.</p>
     * </li>
     * <li><p>If the source is a live stream, the update takes effect immediately. If the source is a list of video resources from ApsaraVideo VOD or a third party, the update does not take effect until the playback of the current video ends. After the update takes effect, the video list starts to play from the beginning.</p>
     * </li>
     * <li><p>You can modify this parameter only if the task is stopped. The update takes effect immediately.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>changedtesturl</p>
     */
    @NameInMap("SourceUrls")
    public java.util.List<String> sourceUrls;

    /**
     * <p>The start time of the task.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * </li>
     * <li><p>The time range specified by the StartTime and EndTime parameters cannot exceed seven days.</p>
     * </li>
     * <li><p>If the task has already started, the update does not take effect.</p>
     * </li>
     * </ul>
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

    public static UpdateLivePullToPushRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePullToPushRequest self = new UpdateLivePullToPushRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePullToPushRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UpdateLivePullToPushRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateLivePullToPushRequest setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public Integer getFileIndex() {
        return this.fileIndex;
    }

    public UpdateLivePullToPushRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public UpdateLivePullToPushRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLivePullToPushRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateLivePullToPushRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLivePullToPushRequest setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
        return this;
    }
    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public UpdateLivePullToPushRequest setSourceUrls(java.util.List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
        return this;
    }
    public java.util.List<String> getSourceUrls() {
        return this.sourceUrls;
    }

    public UpdateLivePullToPushRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateLivePullToPushRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
