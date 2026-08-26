// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordVodConfigRequest extends TeaModel {
    /**
     * <p>The name of the application that the stream belongs to. You can find this value on the <a href="https://help.aliyun.com/document_detail/197397.html">stream management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <blockquote>
     * <p>Notice: This parameter is ignored if <code>RecordFormat</code> is specified.
     * Specifies whether to automatically merge files from multiple recording cycles into a single file after a live stream ends.</p>
     * </blockquote>
     * <p>A value of <strong>ON</strong> enables automatic merging. If enabled, you must also specify the <code>ComposeVodTranscodeGroupId</code> parameter. By default, automatic merging is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("AutoCompose")
    public String autoCompose;

    /**
     * <blockquote>
     * <p>Notice: This parameter is ignored if <code>RecordFormat</code> is specified.
     * The ID of the ApsaraVideo VOD transcoding template group for transcoding the merged video. This parameter is required if <code>AutoCompose</code> is set to <code>ON</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ComposeVodTranscodeGroupId")
    public String composeVodTranscodeGroupId;

    /**
     * <p>The cycle duration, in seconds. The default value is <strong>3600</strong>. The value must be between <strong>300</strong> and <strong>21600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("CycleDuration")
    public Integer cycleDuration;

    /**
     * <p>The stream interruption timeout, in seconds. If a stream interruption is shorter than this duration, recording continues in the same file. If the interruption is longer, a new file is created. Valid values: 15 to 21600.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>The streaming domain.</p>
     * <blockquote>
     * <p>Ensure ApsaraVideo VOD is activated in the same region as the streaming domain.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The recording trigger mode. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (Default): Automatic recording.</p>
     * </li>
     * <li><p><strong>1</strong>: On-demand recording triggered by an HTTP callback.</p>
     * </li>
     * <li><p><strong>2</strong>: On-demand recording triggered by ingest parameters.</p>
     * </li>
     * <li><p><strong>7</strong>: Manual recording. Allows you to start and stop recording by calling the <code>RealTimeRecordCommand</code> operation.</p>
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
     * <p>The recorded content. Valid values:</p>
     * <ul>
     * <li><p><code>raw</code> (Default): Records the source stream.</p>
     * </li>
     * <li><p><code>transcode</code>: Records transcoded streams.</p>
     * </li>
     * </ul>
     * <p>To record both source and transcoded streams, provide a comma-separated list, for example, <code>raw,transcode</code>.</p>
     * <blockquote>
     * <p>If this parameter is set to include <code>transcode</code>, you must specify at least one template in the <code>TranscodeTemplates</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>raw</p>
     */
    @NameInMap("RecordContent")
    public String recordContent;

    /**
     * <p>A list of format-specific recording configurations.</p>
     */
    @NameInMap("RecordFormat")
    public java.util.List<AddLiveRecordVodConfigRequestRecordFormat> recordFormat;

    /**
     * <p>The region ID. The example value <code>cn-shanghai</code> indicates the China (Shanghai) region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VOD application space. You can obtain this ID from the <strong>VOD console</strong> or by calling an <a href="https://help.aliyun.com/document_detail/454873.html">API operation to query application information</a>. This parameter applies only when the VOD application space feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    /**
     * <p>The storage location.</p>
     * 
     * <strong>example:</strong>
     * <p>****-tjptr2vatm.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The stream name. You can find this value on the <a href="https://help.aliyun.com/document_detail/197397.html">stream management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>stream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>A list of transcoding templates for recording transcoded streams.</p>
     */
    @NameInMap("TranscodeTemplates")
    public java.util.List<String> transcodeTemplates;

    /**
     * <blockquote>
     * <p>Notice: This parameter is ignored if <code>RecordFormat</code> is specified.
     * The ID of the ApsaraVideo VOD transcoding template group for transcoding recorded videos.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e2d796d3bb5fd8049d32bff62f94****</p>
     */
    @NameInMap("VodTranscodeGroupId")
    public String vodTranscodeGroupId;

    public static AddLiveRecordVodConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordVodConfigRequest self = new AddLiveRecordVodConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordVodConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveRecordVodConfigRequest setAutoCompose(String autoCompose) {
        this.autoCompose = autoCompose;
        return this;
    }
    public String getAutoCompose() {
        return this.autoCompose;
    }

    public AddLiveRecordVodConfigRequest setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
        this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
        return this;
    }
    public String getComposeVodTranscodeGroupId() {
        return this.composeVodTranscodeGroupId;
    }

    public AddLiveRecordVodConfigRequest setCycleDuration(Integer cycleDuration) {
        this.cycleDuration = cycleDuration;
        return this;
    }
    public Integer getCycleDuration() {
        return this.cycleDuration;
    }

    public AddLiveRecordVodConfigRequest setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public AddLiveRecordVodConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveRecordVodConfigRequest setOnDemand(Integer onDemand) {
        this.onDemand = onDemand;
        return this;
    }
    public Integer getOnDemand() {
        return this.onDemand;
    }

    public AddLiveRecordVodConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveRecordVodConfigRequest setRecordContent(String recordContent) {
        this.recordContent = recordContent;
        return this;
    }
    public String getRecordContent() {
        return this.recordContent;
    }

    public AddLiveRecordVodConfigRequest setRecordFormat(java.util.List<AddLiveRecordVodConfigRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<AddLiveRecordVodConfigRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public AddLiveRecordVodConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveRecordVodConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AddLiveRecordVodConfigRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public AddLiveRecordVodConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveRecordVodConfigRequest setTranscodeTemplates(java.util.List<String> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
        return this;
    }
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public AddLiveRecordVodConfigRequest setVodTranscodeGroupId(String vodTranscodeGroupId) {
        this.vodTranscodeGroupId = vodTranscodeGroupId;
        return this;
    }
    public String getVodTranscodeGroupId() {
        return this.vodTranscodeGroupId;
    }

    public static class AddLiveRecordVodConfigRequestRecordFormat extends TeaModel {
        /**
         * <p>Specifies whether to automatically merge recording files for this format after the stream ends. Valid values:</p>
         * <ul>
         * <li><p><code>ON</code>: Enables automatic merging.</p>
         * </li>
         * <li><p><code>OFF</code>: Disables automatic merging.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("AutoCompose")
        public String autoCompose;

        /**
         * <p>The recording format. Valid values:</p>
         * <ul>
         * <li><p><code>m3u8</code></p>
         * </li>
         * <li><p><code>flv</code></p>
         * </li>
         * <li><p><code>mp4</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The video processing method. Valid values:</p>
         * <ul>
         * <li><p><code>transcode</code>: Uses a transcoding template group to process the video.</p>
         * </li>
         * <li><p><code>workflow</code>: Uses a workflow to process the video.</p>
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
         * <p>The specified ID must match the <code>ProcessMethod</code>. For example, provide a transcoding template group ID if <code>ProcessMethod</code> is <code>transcode</code>, or a workflow ID if <code>ProcessMethod</code> is <code>workflow</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e2d796d3bb5fd8049d32bff62f94****</p>
         */
        @NameInMap("ProcessTemplateId")
        public String processTemplateId;

        /**
         * <p>The slice duration, in seconds.</p>
         * <p>This parameter applies only to the <code>m3u8</code> format.</p>
         * <p>The value must be between 5 and 30. The default is 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The tags for video categorization.</p>
         * 
         * <strong>example:</strong>
         * <p>sports</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The video source to process. Valid values:</p>
         * <ul>
         * <li><p><code>origin</code> (Default): The per-cycle recording files.</p>
         * </li>
         * <li><p><code>compose</code>: The single video file composed from all cycles.</p>
         * </li>
         * </ul>
         * <p>To process both video sources, separate the values with a comma (,), for example, <code>origin,compose</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>origin</p>
         */
        @NameInMap("VideoProcess")
        public String videoProcess;

        public static AddLiveRecordVodConfigRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            AddLiveRecordVodConfigRequestRecordFormat self = new AddLiveRecordVodConfigRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public AddLiveRecordVodConfigRequestRecordFormat setAutoCompose(String autoCompose) {
            this.autoCompose = autoCompose;
            return this;
        }
        public String getAutoCompose() {
            return this.autoCompose;
        }

        public AddLiveRecordVodConfigRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AddLiveRecordVodConfigRequestRecordFormat setProcessMethod(String processMethod) {
            this.processMethod = processMethod;
            return this;
        }
        public String getProcessMethod() {
            return this.processMethod;
        }

        public AddLiveRecordVodConfigRequestRecordFormat setProcessTemplateId(String processTemplateId) {
            this.processTemplateId = processTemplateId;
            return this;
        }
        public String getProcessTemplateId() {
            return this.processTemplateId;
        }

        public AddLiveRecordVodConfigRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public AddLiveRecordVodConfigRequestRecordFormat setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public AddLiveRecordVodConfigRequestRecordFormat setVideoProcess(String videoProcess) {
            this.videoProcess = videoProcess;
            return this;
        }
        public String getVideoProcess() {
            return this.videoProcess;
        }

    }

}
