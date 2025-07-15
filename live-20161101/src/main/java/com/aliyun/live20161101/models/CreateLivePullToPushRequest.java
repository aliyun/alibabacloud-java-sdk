// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePullToPushRequest extends TeaModel {
    /**
     * <p>The HTTP callback URL. By default, this parameter is left empty.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The URL is used to receive callbacks related to the task.</p>
     * </li>
     * <li><p>The URL can be up to 2,000 characters in length.</p>
     * </li>
     * <li><p>If you do not specify this parameter, no callbacks are returned for events related to the task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The destination URL to which the stream is relayed.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The supported protocol for the URL is RTMP.</p>
     * </li>
     * <li><p>The URL can be up to 2,000 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://pushtest.********.aliyunlive.com/pulltest493/pulltest-w434</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

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
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T14:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The file index, which specifies the sequence of the file where the playback starts.</p>
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
     * <li><p>This parameter indicates an offset from the first frame of the first video resource in the list.</p>
     * </li>
     * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
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
     * <p> This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatNumber")
    public Integer repeatNumber;

    /**
     * <p>The number of retries allowed. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RetryCount")
    public Integer retryCount;

    /**
     * <p>The retry interval. Unit: seconds. Valid values: [60,300]. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <p>The protocol of the source stream.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>rtmp</li>
     * <li>rtsp</li>
     * <li>srt</li>
     * <li>http-flv</li>
     * <li>flv</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you set the <strong>SourceType</strong> parameter to live, but does not take effect if you set the SourceType parameter to vod or url.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("SourceProtocol")
    public String sourceProtocol;

    /**
     * <p>The type of the source stream. Valid values:</p>
     * <ul>
     * <li>live: a live stream</li>
     * <li>vod: a list of ApsaraVideo VOD resources</li>
     * <li>url: a list of video resources from a third party</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

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
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testurls</p>
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
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-26T10:30:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the task. Default value: &quot;&quot;. Fuzzy search for task names is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateLivePullToPushRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePullToPushRequest self = new CreateLivePullToPushRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePullToPushRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateLivePullToPushRequest setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
        return this;
    }
    public String getDstUrl() {
        return this.dstUrl;
    }

    public CreateLivePullToPushRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLivePullToPushRequest setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public Integer getFileIndex() {
        return this.fileIndex;
    }

    public CreateLivePullToPushRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public CreateLivePullToPushRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLivePullToPushRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateLivePullToPushRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLivePullToPushRequest setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
        return this;
    }
    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public CreateLivePullToPushRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateLivePullToPushRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateLivePullToPushRequest setSourceProtocol(String sourceProtocol) {
        this.sourceProtocol = sourceProtocol;
        return this;
    }
    public String getSourceProtocol() {
        return this.sourceProtocol;
    }

    public CreateLivePullToPushRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateLivePullToPushRequest setSourceUrls(java.util.List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
        return this;
    }
    public java.util.List<String> getSourceUrls() {
        return this.sourceUrls;
    }

    public CreateLivePullToPushRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateLivePullToPushRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
