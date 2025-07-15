// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppRecordConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The interruption duration for merge. If the stream interruption duration exceeds the specified duration, a new recording is generated. The value of this parameter ranges from 15 to 21600 seconds.</p>
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
     * <p>The recording end time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The time range that is specified by the EndTime and StartTime parameters must be less than or equal to seven days. If the value exceeds seven days, ApsaraVideo Live considers seven days as the time range. This parameter takes effect only for the live stream specified by the StreamName parameter. If the StreamName parameter is not specified, this parameter does not take effect.</p>
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
     * <p>The endpoint of the Object Storage Service (OSS) bucket.</p>
     * <p>To store live stream recordings in OSS, you need to create an OSS bucket in advance. For more information, see <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
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
    public java.util.List<UpdateLiveAppRecordConfigRequestRecordFormat> recordFormat;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The recording start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The start time must be within seven days after the stream ingest starts. This parameter takes effect only for the live stream specified by the StreamName parameter. If the StreamName parameter is not specified, this parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-04-10T09:57:21Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream.</p>
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
    public java.util.List<UpdateLiveAppRecordConfigRequestTranscodeRecordFormat> transcodeRecordFormat;

    /**
     * <p>The transcoding template group details.</p>
     */
    @NameInMap("TranscodeTemplates")
    public java.util.List<String> transcodeTemplates;

    public static UpdateLiveAppRecordConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAppRecordConfigRequest self = new UpdateLiveAppRecordConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAppRecordConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLiveAppRecordConfigRequest setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public UpdateLiveAppRecordConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveAppRecordConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateLiveAppRecordConfigRequest setOnDemand(Integer onDemand) {
        this.onDemand = onDemand;
        return this;
    }
    public Integer getOnDemand() {
        return this.onDemand;
    }

    public UpdateLiveAppRecordConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public UpdateLiveAppRecordConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAppRecordConfigRequest setRecordFormat(java.util.List<UpdateLiveAppRecordConfigRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<UpdateLiveAppRecordConfigRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public UpdateLiveAppRecordConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateLiveAppRecordConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateLiveAppRecordConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public UpdateLiveAppRecordConfigRequest setTranscodeRecordFormat(java.util.List<UpdateLiveAppRecordConfigRequestTranscodeRecordFormat> transcodeRecordFormat) {
        this.transcodeRecordFormat = transcodeRecordFormat;
        return this;
    }
    public java.util.List<UpdateLiveAppRecordConfigRequestTranscodeRecordFormat> getTranscodeRecordFormat() {
        return this.transcodeRecordFormat;
    }

    public UpdateLiveAppRecordConfigRequest setTranscodeTemplates(java.util.List<String> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
        return this;
    }
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public static class UpdateLiveAppRecordConfigRequestRecordFormat extends TeaModel {
        /**
         * <p>The recording cycle. Unit: seconds If you do not specify this parameter, the default value 6 hours is used.</p>
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
         * <p>The recording format. Supported formats include M3U8, Flash Video (FLV), MP4, and Common Media Application Format (CMAF). Valid values:</p>
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
         * <p>The duration of a single segment. Unit: seconds</p>
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

        public static UpdateLiveAppRecordConfigRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveAppRecordConfigRequestRecordFormat self = new UpdateLiveAppRecordConfigRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public UpdateLiveAppRecordConfigRequestRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public UpdateLiveAppRecordConfigRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public UpdateLiveAppRecordConfigRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

    }

    public static class UpdateLiveAppRecordConfigRequestTranscodeRecordFormat extends TeaModel {
        /**
         * <p>The transcoded stream recording cycle. Unit: seconds If you do not specify this parameter, the default value 6 hours is used.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The format of the transcoded stream recording. Supported formats include M3U8, FLV, MP4, and CMAF. Valid values:</p>
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
         * <p>The duration of a single segment in the transcoded stream recording. Unit: seconds.</p>
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

        public static UpdateLiveAppRecordConfigRequestTranscodeRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveAppRecordConfigRequestTranscodeRecordFormat self = new UpdateLiveAppRecordConfigRequestTranscodeRecordFormat();
            return TeaModel.build(map, self);
        }

        public UpdateLiveAppRecordConfigRequestTranscodeRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public UpdateLiveAppRecordConfigRequestTranscodeRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public UpdateLiveAppRecordConfigRequestTranscodeRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

    }

}
