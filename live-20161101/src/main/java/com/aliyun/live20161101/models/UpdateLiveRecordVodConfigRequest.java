// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordVodConfigRequest extends TeaModel {
    /**
     * <p>The application name. You can view the <code>AppName</code> on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <blockquote>
     * <p>Notice: This parameter is ignored if the <code>RecordFormat</code> parameter is specified.
     * Specifies whether to enable automatic composition. Valid values:</p>
     * </blockquote>
     * <ul>
     * <li><strong>ON</strong>: Enables automatic composition. If you set this value to ON, you must also specify the <code>ComposeVodTranscodeGroupId</code> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("AutoCompose")
    public String autoCompose;

    /**
     * <blockquote>
     * <p>Notice: This parameter is ignored if the <code>RecordFormat</code> parameter is specified.
     * The ID of the ApsaraVideo for VOD transcoding template group used to transcode the video after automatic composition.</p>
     * </blockquote>
     * <blockquote>
     * <p>You can get the ID by calling the <a href="https://help.aliyun.com/document_detail/454928.html">Query Transcoding Configuration List</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ComposeVodTranscodeGroupId")
    public String composeVodTranscodeGroupId;

    /**
     * <p>The duration of each cyclical recording file, in seconds. Default value: <strong>3600</strong>. Valid values: <strong>300</strong> to <strong>21600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("CycleDuration")
    public Integer cycleDuration;

    /**
     * <p>The maximum duration of a stream interruption, in seconds. If a stream interruption exceeds this duration, the system generates a new file. Valid values: 15 to 21600.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

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
     * <p>The on-demand recording mode. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): Disables on-demand recording.</p>
     * </li>
     * <li><p><strong>1</strong>: Enables on-demand recording triggered by an HTTP callback.</p>
     * </li>
     * <li><p><strong>2</strong>: Triggers recording by parsing push streaming parameters.</p>
     * </li>
     * <li><p><strong>7</strong>: Manual recording. Call the <a href="https://help.aliyun.com/document_detail/2847882.html">RealTimeRecordCommand</a> operation to start or stop recording.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OnDemand")
    public Integer onDemand;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A list of parameters for each recording format.</p>
     */
    @NameInMap("RecordFormat")
    public java.util.List<UpdateLiveRecordVodConfigRequestRecordFormat> recordFormat;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stream name. You can view the <code>StreamName</code> on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>stream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>A list of transcoding templates.</p>
     */
    @NameInMap("TranscodeTemplates")
    public java.util.List<String> transcodeTemplates;

    /**
     * <blockquote>
     * <p>Notice: This parameter is ignored if the <code>RecordFormat</code> parameter is specified. The ID of the ApsaraVideo for VOD transcoding template group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e2d796d3bb5fd8049d32bff62f94****</p>
     */
    @NameInMap("VodTranscodeGroupId")
    public String vodTranscodeGroupId;

    public static UpdateLiveRecordVodConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordVodConfigRequest self = new UpdateLiveRecordVodConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordVodConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLiveRecordVodConfigRequest setAutoCompose(String autoCompose) {
        this.autoCompose = autoCompose;
        return this;
    }
    public String getAutoCompose() {
        return this.autoCompose;
    }

    public UpdateLiveRecordVodConfigRequest setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
        this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
        return this;
    }
    public String getComposeVodTranscodeGroupId() {
        return this.composeVodTranscodeGroupId;
    }

    public UpdateLiveRecordVodConfigRequest setCycleDuration(Integer cycleDuration) {
        this.cycleDuration = cycleDuration;
        return this;
    }
    public Integer getCycleDuration() {
        return this.cycleDuration;
    }

    public UpdateLiveRecordVodConfigRequest setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public UpdateLiveRecordVodConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveRecordVodConfigRequest setOnDemand(Integer onDemand) {
        this.onDemand = onDemand;
        return this;
    }
    public Integer getOnDemand() {
        return this.onDemand;
    }

    public UpdateLiveRecordVodConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveRecordVodConfigRequest setRecordFormat(java.util.List<UpdateLiveRecordVodConfigRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<UpdateLiveRecordVodConfigRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public UpdateLiveRecordVodConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveRecordVodConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public UpdateLiveRecordVodConfigRequest setTranscodeTemplates(java.util.List<String> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
        return this;
    }
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public UpdateLiveRecordVodConfigRequest setVodTranscodeGroupId(String vodTranscodeGroupId) {
        this.vodTranscodeGroupId = vodTranscodeGroupId;
        return this;
    }
    public String getVodTranscodeGroupId() {
        return this.vodTranscodeGroupId;
    }

    public static class UpdateLiveRecordVodConfigRequestRecordFormat extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic composition. Valid values:</p>
         * <ul>
         * <li><p><code>ON</code>: Enables automatic composition.</p>
         * </li>
         * <li><p><code>OFF</code>: Disables automatic composition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("AutoCompose")
        public String autoCompose;

        /**
         * <p>The recording storage format.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The video processing method. Valid values:</p>
         * <ul>
         * <li><p><code>transcode</code>: Processes the video by using a transcoding template group.</p>
         * </li>
         * <li><p><code>workflow</code>: Processes the video by using a workflow.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>transcode</p>
         */
        @NameInMap("ProcessMethod")
        public String processMethod;

        /**
         * <p>The ID of the transcoding template group or workflow.</p>
         * <blockquote>
         * <h2>The ID must match the video processing method specified in ProcessMethod. For example, if ProcessMethod is set to transcode, you must use a transcoding template group ID.</h2>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e2d796d3bb5fd8049d32bff62f94****</p>
         */
        @NameInMap("ProcessTemplateId")
        public String processTemplateId;

        /**
         * <p>The duration of each segment, in seconds.</p>
         * <blockquote>
         * <p>Notice: This parameter applies only to the <code>m3u8</code> format.
         * The default value is 30. Valid values: 5 to 30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>A tag for video classification.</p>
         * 
         * <strong>example:</strong>
         * <p>sports</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The video source to process. Valid values:</p>
         * <ul>
         * <li><p><code>origin</code> (default): Processes the source video.</p>
         * </li>
         * <li><p><code>compose</code>: Processes the composed video.</p>
         * </li>
         * </ul>
         * <p>To process both the source and composed videos, separate the values with a comma. For example, <code>origin,compose</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>origin</p>
         */
        @NameInMap("VideoProcess")
        public String videoProcess;

        public static UpdateLiveRecordVodConfigRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordVodConfigRequestRecordFormat self = new UpdateLiveRecordVodConfigRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setAutoCompose(String autoCompose) {
            this.autoCompose = autoCompose;
            return this;
        }
        public String getAutoCompose() {
            return this.autoCompose;
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setProcessMethod(String processMethod) {
            this.processMethod = processMethod;
            return this;
        }
        public String getProcessMethod() {
            return this.processMethod;
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setProcessTemplateId(String processTemplateId) {
            this.processTemplateId = processTemplateId;
            return this;
        }
        public String getProcessTemplateId() {
            return this.processTemplateId;
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public UpdateLiveRecordVodConfigRequestRecordFormat setVideoProcess(String videoProcess) {
            this.videoProcess = videoProcess;
            return this;
        }
        public String getVideoProcess() {
            return this.videoProcess;
        }

    }

}
