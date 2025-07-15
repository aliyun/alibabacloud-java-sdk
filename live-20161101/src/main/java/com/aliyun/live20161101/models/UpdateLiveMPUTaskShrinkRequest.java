// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveMPUTaskShrinkRequest extends TeaModel {
    /**
     * <p>The application ID. You can specify only one application ID. The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID. You can specify only one channel ID. The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The stream mixing mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the single-stream relay mode. In this mode, the service only relays the original single stream, but does not transcode mixed streams. You do not need to set parameters for mixed-stream transcoding.</li>
     * <li><strong>1</strong> (default): the mixed-stream relay mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MixMode")
    public String mixMode;

    /**
     * <p>The multiple ingest URLs to relay. This parameter allows you to specify multiple ingest URLs.</p>
     */
    @NameInMap("MultiStreamURL")
    public String multiStreamURLShrink;

    /**
     * <p>The supplemental enhancement information (SEI) parameters.</p>
     */
    @NameInMap("SeiParams")
    public String seiParamsShrink;

    /**
     * <p>The single-stream relay parameters. These parameters are required if you set MixMode to 0.</p>
     */
    @NameInMap("SingleSubParams")
    public String singleSubParamsShrink;

    /**
     * <p>The ingest URL. You can specify only one ingest URL in the Real-Time Messaging Protocol (RTMP) format. The URL can be up to 2,048 characters in length. For information about the generation rules of ingest URLs, see <a href="https://help.aliyun.com/document_detail/199339.html">Ingest and streaming URLs</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the ingest URL is under a domain name for which hotlink protection is enabled, you must include an access token in the URL.</li>
     * <li>You cannot use the same ingest URL in different tasks.</li>
     * <li>You cannot use the same ingest URL within 10 seconds after a task is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The task ID. You can specify only one task ID. The ID can be up to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The ID must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The mixed-stream relay parameters. These parameters are required if you set MixMode to 1.</p>
     */
    @NameInMap("TranscodeParams")
    public String transcodeParamsShrink;

    public static UpdateLiveMPUTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveMPUTaskShrinkRequest self = new UpdateLiveMPUTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveMPUTaskShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLiveMPUTaskShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateLiveMPUTaskShrinkRequest setMixMode(String mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public String getMixMode() {
        return this.mixMode;
    }

    public UpdateLiveMPUTaskShrinkRequest setMultiStreamURLShrink(String multiStreamURLShrink) {
        this.multiStreamURLShrink = multiStreamURLShrink;
        return this;
    }
    public String getMultiStreamURLShrink() {
        return this.multiStreamURLShrink;
    }

    public UpdateLiveMPUTaskShrinkRequest setSeiParamsShrink(String seiParamsShrink) {
        this.seiParamsShrink = seiParamsShrink;
        return this;
    }
    public String getSeiParamsShrink() {
        return this.seiParamsShrink;
    }

    public UpdateLiveMPUTaskShrinkRequest setSingleSubParamsShrink(String singleSubParamsShrink) {
        this.singleSubParamsShrink = singleSubParamsShrink;
        return this;
    }
    public String getSingleSubParamsShrink() {
        return this.singleSubParamsShrink;
    }

    public UpdateLiveMPUTaskShrinkRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public UpdateLiveMPUTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateLiveMPUTaskShrinkRequest setTranscodeParamsShrink(String transcodeParamsShrink) {
        this.transcodeParamsShrink = transcodeParamsShrink;
        return this;
    }
    public String getTranscodeParamsShrink() {
        return this.transcodeParamsShrink;
    }

}
