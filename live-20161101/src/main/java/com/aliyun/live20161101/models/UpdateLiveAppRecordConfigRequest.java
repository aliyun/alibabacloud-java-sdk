// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppRecordConfigRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The window in seconds for merging fragmented recording after an interruption. If a stream disconnects and reconnects within this window, the recording will continue in the same file. Valid values: 15 to 21600.</p>
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
     * <p>The recording end time. Format: <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z (UTC time).</p>
     * <blockquote>
     * <p>This parameter is only effective for stream-level recordings. The interval between EndTime and StartTime cannot exceed 7 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-04-16T09:57:21Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies the recording mode. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: disables on-demand recording.</p>
     * </li>
     * <li><p><strong>1</strong>: On-demand recording via HTTP callback.</p>
     * </li>
     * <li><p><strong>2</strong>: On-demand recording by parsing parameters in the ingest URL.</p>
     * </li>
     * <li><p><strong>7</strong>: Manual recording. You can call the <a href="https://help.aliyun.com/document_detail/2847882.html">RealTimeRecordCommand</a> API to manually start or stop recording.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set OnDemand to <strong>1</strong>, you need to call the <a href="https://help.aliyun.com/document_detail/2847891.html">AddLiveRecordNotifyConfig</a> API to configure the OnDemandUrl parameter. Otherwise, ApsaraVideo Live does not perform on-demand recording.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OnDemand")
    public Integer onDemand;

    /**
     * <p>The endpoint for OSS storage. You must create an OSS bucket before using this feature. See <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
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
     * <p>The recording start time. Format: <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z (UTC time).</p>
     * <blockquote>
     * <p>This parameter is only effective for stream-level recordings (i.e., when <code>StreamName</code> is specified). The time must be within 7 days of the actual stream start time.</p>
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
     * <p>The transcoded stream recording configuration.</p>
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
         * <p>The duration of a single recording cycle in seconds. If not specified, the default value is 6 hours</p>
         * <blockquote>
         * <p>If a live stream is interrupted during a recording cycle but resumes normal streaming within the merge window, recording will continue in the same file. A recording file is generated only when a live stream is interrupted for longer than the merge window.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The recording format. Valid values:</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>If you choose m3u8 or cmaf, you must also set SliceOssObjectPrefix and SliceDuration. At least one of RecordFormat or TranscodeRecordFormat must be specified.</p>
         * <ul>
         * <li><p>m3u8</p>
         * </li>
         * <li><p>flv</p>
         * </li>
         * <li><p>mp4</p>
         * </li>
         * <li><p>cmaf</p>
         * </li>
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
         * <p>This parameter takes effect only if you set the RecordFormat.N.Format parameter to m3u8 or cmaf.</p>
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
         * <p>The transcoded stream recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The format of the transcoded stream recording. Valid values:</p>
         * <blockquote>
         * <p>If you choose m3u8 or cmaf, you must specify the TranscodeRecordFormat.N.SliceOssObjectPrefix and TranscodeRecordFormat.N.SliceDuration parameters.</p>
         * </blockquote>
         * <ul>
         * <li><p>m3u8</p>
         * </li>
         * <li><p>flv</p>
         * </li>
         * <li><p>mp4</p>
         * </li>
         * <li><p>cmaf</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The duration of a single segment for transcoded stream recording. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you set the TranscodeRecordFormat.N.Format parameter to m3u8 or cmaf.</p>
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
