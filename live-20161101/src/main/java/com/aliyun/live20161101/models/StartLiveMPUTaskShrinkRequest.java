// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveMPUTaskShrinkRequest extends TeaModel {
    /**
     * <p>The application ID. Only one ID is supported. It can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID. Only one ID is supported. It can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The idle timeout period. Unit: seconds. The value must be in the range of [10, 86400].</p>
     * <blockquote>
     * <p>If you set this parameter, the task is automatically stopped when it has been idle for a period longer than MaxIdleTime. If you do not set this parameter, the task is stopped immediately after the channel is closed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxIdleTime")
    public String maxIdleTime;

    /**
     * <p>The stream mixing mode. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Single-stream ingest. The original single stream is ingested without stream mixing or transcoding. You do not need to configure stream mixing and transcoding parameters.</p>
     * </li>
     * <li><p><strong>1</strong> (default): Stream mixing and transcoding.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MixMode")
    public String mixMode;

    /**
     * <p>The parameters for ingesting to multiple URLs. You can specify multiple live ingest URLs.</p>
     * <blockquote>
     * <p>When you set the ingest URL for a task, you must configure either the StreamURL parameter or the MultiStreamURL parameter, but not both.</p>
     * </blockquote>
     */
    @NameInMap("MultiStreamURL")
    public String multiStreamURLShrink;

    /**
     * <p>The region where the stream mixing service is located. Valid values:</p>
     * <ul>
     * <li><p><strong>CN-Shanghai&lt;props=&quot;china&quot;&gt;(default)</strong>: Shanghai.</p>
     * </li>
     * <li><p><strong>AP-Singapore&lt;props=&quot;intl&quot;&gt;(default)</strong>: Singapore.</p>
     * </li>
     * <li><p><strong>EMAA-Saudi</strong>: Saudi Arabia.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CN-Shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The SEI configuration parameters.</p>
     */
    @NameInMap("SeiParams")
    public String seiParamsShrink;

    /**
     * <p>The parameters for single-stream ingest. This parameter is required when MixMode is set to 0. Do not set this parameter for stream mixing and transcoding.</p>
     */
    @NameInMap("SingleSubParams")
    public String singleSubParamsShrink;

    /**
     * <p>The live ingest URL. Only the RTMP protocol is supported. Only one URL is supported. The maximum length is 2048 characters. For information about how to generate the URL, see <a href="https://help.aliyun.com/document_detail/199339.html">Ingest URLs and playback URLs</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For domain names with hotlink protection enabled, the ingest URL must include an access token.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li><p>Do not use the same StreamURL in different tasks at the same time.</p>
     * </li>
     * <li><p>Do not use the same StreamURL within 10 seconds after a task stops.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The task ID. Only one ID is supported. It can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 55 characters. This ID is the unique identifier for the bypass ingest task.
     * If a task with the same ID still exists and has not been cleared when you start a new task, \<code>InvalidParam\\</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The parameters for stream mixing and transcoding. This parameter is required when MixMode is set to 1. Do not set this parameter for single-stream ingest.</p>
     */
    @NameInMap("TranscodeParams")
    public String transcodeParamsShrink;

    public static StartLiveMPUTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLiveMPUTaskShrinkRequest self = new StartLiveMPUTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartLiveMPUTaskShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartLiveMPUTaskShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartLiveMPUTaskShrinkRequest setMaxIdleTime(String maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public String getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public StartLiveMPUTaskShrinkRequest setMixMode(String mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public String getMixMode() {
        return this.mixMode;
    }

    public StartLiveMPUTaskShrinkRequest setMultiStreamURLShrink(String multiStreamURLShrink) {
        this.multiStreamURLShrink = multiStreamURLShrink;
        return this;
    }
    public String getMultiStreamURLShrink() {
        return this.multiStreamURLShrink;
    }

    public StartLiveMPUTaskShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public StartLiveMPUTaskShrinkRequest setSeiParamsShrink(String seiParamsShrink) {
        this.seiParamsShrink = seiParamsShrink;
        return this;
    }
    public String getSeiParamsShrink() {
        return this.seiParamsShrink;
    }

    public StartLiveMPUTaskShrinkRequest setSingleSubParamsShrink(String singleSubParamsShrink) {
        this.singleSubParamsShrink = singleSubParamsShrink;
        return this;
    }
    public String getSingleSubParamsShrink() {
        return this.singleSubParamsShrink;
    }

    public StartLiveMPUTaskShrinkRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public StartLiveMPUTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartLiveMPUTaskShrinkRequest setTranscodeParamsShrink(String transcodeParamsShrink) {
        this.transcodeParamsShrink = transcodeParamsShrink;
        return this;
    }
    public String getTranscodeParamsShrink() {
        return this.transcodeParamsShrink;
    }

}
