// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the stream belongs. The template takes effect only when the AppName value matches the AppName in the ingest URL. To match all application names, set this parameter to an asterisk (*).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The stream discontinuity merging duration. If the live stream is disconnected for longer than the specified merging duration, a new file is generated. Valid values: 15 to 21600. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>The streaming domain of the streamer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The recording end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>The difference between EndTime and StartTime cannot exceed 7 days. If it exceeds 7 days, the value is calculated as 7 days. This parameter is valid only for stream-level recording (when StreamName is not empty).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-04-16T09:57:21Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The on-demand or manual recording mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): disabled. Automatic recording is used.</li>
     * <li><strong>1</strong>: on-demand recording through HTTP callback. You must first configure OnDemandUrl by calling the <a href="https://help.aliyun.com/document_detail/2847891.html">AddLiveRecordNotifyConfig</a> operation. Otherwise, recording is not performed by default.</li>
     * <li><strong>2</strong>: on-demand recording by parsing stream ingest parameters.</li>
     * <li><strong>7</strong>: manual recording. Recording is not performed by default. You can call the <a href="https://help.aliyun.com/document_detail/2847882.html">RealTimeRecordCommand</a> operation to manually start or stop recording.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OnDemand")
    public Integer onDemand;

    /**
     * <p>The name of the OSS bucket.</p>
     * <p>To store live recordings in OSS, create an OSS bucket in advance. For more information, see <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveBucket****</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The endpoint of the OSS bucket.</p>
     * <p>To store live recordings in OSS, create an OSS bucket in advance. For more information, see <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The recording details.</p>
     */
    @NameInMap("RecordFormat")
    public java.util.List<AddLiveAppRecordConfigRequestRecordFormat> recordFormat;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The recording start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>The specified time must be within 7 days of the actual stream ingest start time. This parameter is valid only for stream-level recording (when StreamName is not empty).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-04-10T09:57:21Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The stream name. The template takes effect only when the StreamName value matches the StreamName in the ingest URL. To match all stream names under the specified AppName, set this parameter to an asterisk (*).</p>
     * 
     * <strong>example:</strong>
     * <p>teststream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The transcoded stream recording details.</p>
     */
    @NameInMap("TranscodeRecordFormat")
    public java.util.List<AddLiveAppRecordConfigRequestTranscodeRecordFormat> transcodeRecordFormat;

    /**
     * <p>The transcoding template group for transcoded stream recording.</p>
     * 
     * <strong>example:</strong>
     * <p>sd</p>
     */
    @NameInMap("TranscodeTemplates")
    public java.util.List<String> transcodeTemplates;

    public static AddLiveAppRecordConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppRecordConfigRequest self = new AddLiveAppRecordConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAppRecordConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveAppRecordConfigRequest setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public AddLiveAppRecordConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveAppRecordConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddLiveAppRecordConfigRequest setOnDemand(Integer onDemand) {
        this.onDemand = onDemand;
        return this;
    }
    public Integer getOnDemand() {
        return this.onDemand;
    }

    public AddLiveAppRecordConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveAppRecordConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveAppRecordConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAppRecordConfigRequest setRecordFormat(java.util.List<AddLiveAppRecordConfigRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<AddLiveAppRecordConfigRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public AddLiveAppRecordConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveAppRecordConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddLiveAppRecordConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveAppRecordConfigRequest setTranscodeRecordFormat(java.util.List<AddLiveAppRecordConfigRequestTranscodeRecordFormat> transcodeRecordFormat) {
        this.transcodeRecordFormat = transcodeRecordFormat;
        return this;
    }
    public java.util.List<AddLiveAppRecordConfigRequestTranscodeRecordFormat> getTranscodeRecordFormat() {
        return this.transcodeRecordFormat;
    }

    public AddLiveAppRecordConfigRequest setTranscodeTemplates(java.util.List<String> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
        return this;
    }
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public static class AddLiveAppRecordConfigRequestRecordFormat extends TeaModel {
        /**
         * <p>The recording length per epoch. Unit: seconds.</p>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value varies by recording format: 6 hours for m3u8 and cmaf formats, and 1 hour for flv and mp4 formats.</li>
         * <li>If a live stream is disconnected within a recording epoch but resumes stream ingest within the stream discontinuity merging duration, recording continues in the same file. This is Normal behavior.</li>
         * <li>A recording file is generated only after the live stream is disconnected for longer than the stream discontinuity merging duration.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The format. M3U8, FLV, MP4, and CMAF are supported. Valid values:</p>
         * <blockquote>
         * <p>Notice: At least one of RecordFormat and TranscodeRecordFormat must be set. If you select m3u8 or cmaf, you must also set the request parameters RecordFormat.N.SliceOssObjectPrefix and RecordFormat.N.SliceDuration.</p>
         * </blockquote>
         * <ul>
         * <li>m3u8.</li>
         * <li>flv.</li>
         * <li>mp4.</li>
         * <li>cmaf.</li>
         * </ul>
         * <blockquote>
         * <p>Settings for RecordFormat and TranscodeRecordFormat: at least one must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the recording file stored in OSS.</p>
         * <ul>
         * <li>The file name must be less than 256 bytes and supports variable matching, including {AppName}, {StreamName}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime}.</li>
         * <li>The value must contain {StartTime} or {EscapedStartTime} and {EndTime} or {EscapedEndTime}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The segment length of a single segment. Unit: seconds.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when RecordFormat.N.Format is set to m3u8 or cmaf.</p>
         * </blockquote>
         * <p>If this parameter is not specified, the default value is 30 seconds. Valid values: 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The segment name.</p>
         * <blockquote>
         * <p>Notice: This parameter is required only when RecordFormat.N.Format is set to m3u8 or cmaf.</p>
         * </blockquote>
         * <ul>
         * <li>The default segment length is 30 seconds. The value must be less than 256 bytes and supports variable matching, including {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</li>
         * <li>The value must contain the {UnixTimestamp} and {Sequence} variables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static AddLiveAppRecordConfigRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            AddLiveAppRecordConfigRequestRecordFormat self = new AddLiveAppRecordConfigRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public AddLiveAppRecordConfigRequestRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class AddLiveAppRecordConfigRequestTranscodeRecordFormat extends TeaModel {
        /**
         * <p>The recording length per epoch for transcoding stream recording. Unit: seconds.</p>
         * <blockquote>
         * <p>If this parameter is not specified, the default value varies by recording format: 6 hours for m3u8 and cmaf formats, and 1 hour for flv and mp4 formats.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The transcoding stream recording format. M3U8, FLV, MP4, and CMAF are supported. Valid values:</p>
         * <blockquote>
         * <p>Notice: If you select m3u8 or cmaf, you must also set the request parameters TranscodeRecordFormat.N.SliceOssObjectPrefix and TranscodeRecordFormat.N.SliceDuration.</p>
         * </blockquote>
         * <ul>
         * <li>m3u8.</li>
         * <li>flv.</li>
         * <li>mp4.</li>
         * <li>cmaf.</li>
         * </ul>
         * <blockquote>
         * <p>Settings: if you select m3u8 or cmaf format, the corresponding slice parameters must also be configured.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the transcoded stream recording file stored in OSS.</p>
         * <ul>
         * <li>The file name must be less than 256 bytes and supports variable matching, including {AppName}, {StreamName}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime}.</li>
         * <li>The value must contain {StartTime} or {EscapedStartTime} and {EndTime} or {EscapedEndTime}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The segment length of a single segment for transcoding stream recording. Unit: seconds.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when TranscodeRecordFormat.N.Format (transcoding stream recording format) is set to m3u8 or cmaf.</p>
         * </blockquote>
         * <p>If this parameter is not specified, the default value is 30 seconds. Valid values: 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The segment name for transcoded stream recording.</p>
         * <blockquote>
         * <p>Notice: This parameter is required only when TranscodeRecordFormat.N.Format is set to m3u8 or cmaf.</p>
         * </blockquote>
         * <ul>
         * <li>The default segment length is 30 seconds. The value must be less than 256 bytes and supports variable matching, including {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</li>
         * <li>The value must contain the {UnixTimestamp} and {Sequence} variables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static AddLiveAppRecordConfigRequestTranscodeRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            AddLiveAppRecordConfigRequestTranscodeRecordFormat self = new AddLiveAppRecordConfigRequestTranscodeRecordFormat();
            return TeaModel.build(map, self);
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

}
