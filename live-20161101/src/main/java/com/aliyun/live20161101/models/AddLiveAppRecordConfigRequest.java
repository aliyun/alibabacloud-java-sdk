// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name in the ingest URL. Otherwise, the configuration does not take effect. If you want to match all applications, specify an asterisk (\*) as the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Duration for stream concatenation. If the live streaming interruption exceeds the set concatenation duration, a new file will be generated. The concatenation duration can be set between 15 to 21600 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Recording end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
     * <blockquote>
     * <p>The difference between EndTime and StartTime should not exceed 7 days; if it does, it will be calculated as 7 days. This is only valid for stream-level recording (when StreamName is not empty).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-04-16T09:57:21Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to enable on-demand recording. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables on-demand recording.</li>
     * <li><strong>1</strong>: enables on-demand recording by using the HTTP callback method.</li>
     * <li><strong>2</strong>: enables on-demand recording by parsing the stream ingest parameters.</li>
     * <li><strong>7</strong>: By default, ApsaraVideo Live does not automatically record live streams. You can call the <a href="https://help.aliyun.com/document_detail/2847882.html">RealTimeRecordCommand</a> operation to manually start or stop recording.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the OnDemand parameter to <strong>1</strong>, you need to call the <a href="https://help.aliyun.com/document_detail/2847891.html">AddLiveRecordNotifyConfig</a> operation to configure the OnDemandUrl parameter. Otherwise, ApsaraVideo Live does not perform on-demand recording.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OnDemand")
    public Integer onDemand;

    /**
     * <p>The name of the OSS bucket where live streaming recording files are stored. To store recorded files in OSS, you need to create an OSS bucket in advance. For creation method, please refer to <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveBucket****</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The endpoint of the OSS bucket. 
     * To store live stream recordings in OSS, you need to create an OSS bucket in advance. For more information, see Configure OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn.developer.aliyundoc.com</p>
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
     * <p>Start time of the recording. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
     * <blockquote>
     * <p>The set time must be within 7 days of the actual streaming start time, and is only valid for stream-level recording (when StreamName is not empty).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-04-10T09:57:21Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Stream broadcast name.</p>
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
     * <p>Transcoding stream recording template group.</p>
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
         * <p>The recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If a live stream is interrupted during a recording cycle but is resumed within the interruption duration threshold, the stream is recorded in the same recording before and after the interruption.</p>
         * </li>
         * <li><p>If a live stream is interrupted for longer than the interruption duration threshold, a new recording is generated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The recording format. Supported formats include M3U8, FLV, MP4, and CMAF. Valid values:</p>
         * <blockquote>
         * <p> You need to specify at lease one of the RecordFormat and TranscodeRecordFormat parameters. If you set this parameter to m3u8 or cmaf, you must also specify the RecordFormat.N.SliceOssObjectPrefix and RecordFormat.N.SliceDuration parameters.</p>
         * </blockquote>
         * <ul>
         * <li>m3u8</li>
         * <li>flv</li>
         * <li>mp4</li>
         * <li>cmaf</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The naming format of a recording to store in OSS.</p>
         * <ul>
         * <li>The name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime} variables.</li>
         * <li>The name must contain the {StartTime} and {EndTime} variables or the {EscapedStartTime} and {EscapedEndTime} variables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a single segment. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set the RecordFormat.N.Format parameter to m3u8 or cmaf.</p>
         * </blockquote>
         * <p>If you do not specify this parameter, the default value 30 seconds is used. Valid values: 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The naming format of a segment.</p>
         * <blockquote>
         * <p> This parameter is required only if you set the RecordFormat.N.Format parameter to m3u8 or cmaf.</p>
         * </blockquote>
         * <ul>
         * <li>By default, the duration of a segment is 30 seconds. The segment name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence} variables.</li>
         * <li>The segment name must contain the {UnixTimestamp} and {Sequence} variables.</li>
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
         * <p>The transcoded stream recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The transcoded stream recording format. Supported formats include M3U8, FLV, MP4, and CMAF. Valid values:</p>
         * <blockquote>
         * <p> If you set this parameter to m3u8 or cmaf, you must also specify the TranscodeRecordFormat.N.SliceOssObjectPrefix and TranscodeRecordFormat.N.SliceDuration parameters.</p>
         * </blockquote>
         * <ul>
         * <li>m3u8</li>
         * <li>flv</li>
         * <li>mp4</li>
         * <li>cmaf</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The naming format of a transcoded stream recording to store in OSS.</p>
         * <ul>
         * <li>The name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime} variables.</li>
         * <li>The name must contain the {StartTime} and {EndTime} variables or the {EscapedStartTime} and {EscapedEndTime} variables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a single segment in a transcoded stream recording. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set the TranscodeRecordFormat.N.Format parameter to m3u8 or cmaf.</p>
         * </blockquote>
         * <p>If you do not specify this parameter, the default value 30 seconds is used. Valid values: 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The naming format of a segment in a transcoded stream recording.</p>
         * <blockquote>
         * <p> This parameter is required only if you set the TranscodeRecordFormat.N.Format parameter to m3u8 or cmaf.</p>
         * </blockquote>
         * <ul>
         * <li>By default, the duration of a segment is 30 seconds. The segment name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence} variables.</li>
         * <li>The segment name must contain the {UnixTimestamp} and {Sequence} variables.</li>
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
