// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveMPUTaskRequest extends TeaModel {
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
    public java.util.List<StartLiveMPUTaskRequestMultiStreamURL> multiStreamURL;

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
    public StartLiveMPUTaskRequestSeiParams seiParams;

    /**
     * <p>The parameters for single-stream ingest. This parameter is required when MixMode is set to 0. Do not set this parameter for stream mixing and transcoding.</p>
     */
    @NameInMap("SingleSubParams")
    public StartLiveMPUTaskRequestSingleSubParams singleSubParams;

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
    public StartLiveMPUTaskRequestTranscodeParams transcodeParams;

    public static StartLiveMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLiveMPUTaskRequest self = new StartLiveMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartLiveMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartLiveMPUTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartLiveMPUTaskRequest setMaxIdleTime(String maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public String getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public StartLiveMPUTaskRequest setMixMode(String mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public String getMixMode() {
        return this.mixMode;
    }

    public StartLiveMPUTaskRequest setMultiStreamURL(java.util.List<StartLiveMPUTaskRequestMultiStreamURL> multiStreamURL) {
        this.multiStreamURL = multiStreamURL;
        return this;
    }
    public java.util.List<StartLiveMPUTaskRequestMultiStreamURL> getMultiStreamURL() {
        return this.multiStreamURL;
    }

    public StartLiveMPUTaskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public StartLiveMPUTaskRequest setSeiParams(StartLiveMPUTaskRequestSeiParams seiParams) {
        this.seiParams = seiParams;
        return this;
    }
    public StartLiveMPUTaskRequestSeiParams getSeiParams() {
        return this.seiParams;
    }

    public StartLiveMPUTaskRequest setSingleSubParams(StartLiveMPUTaskRequestSingleSubParams singleSubParams) {
        this.singleSubParams = singleSubParams;
        return this;
    }
    public StartLiveMPUTaskRequestSingleSubParams getSingleSubParams() {
        return this.singleSubParams;
    }

    public StartLiveMPUTaskRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public StartLiveMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartLiveMPUTaskRequest setTranscodeParams(StartLiveMPUTaskRequestTranscodeParams transcodeParams) {
        this.transcodeParams = transcodeParams;
        return this;
    }
    public StartLiveMPUTaskRequestTranscodeParams getTranscodeParams() {
        return this.transcodeParams;
    }

    public static class StartLiveMPUTaskRequestMultiStreamURL extends TeaModel {
        /**
         * <p>Specifies whether to ingest the stream to Alibaba Cloud CDN.</p>
         * <ul>
         * <li><p>false: Ingest to a non-Alibaba Cloud CDN.</p>
         * </li>
         * <li><p>true: Ingest to Alibaba Cloud CDN.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAliCdn")
        public Boolean isAliCdn;

        /**
         * <p>The live ingest URL. Only the RTMP protocol is supported. The maximum length is 2048 characters. For information about how to generate the URL, see <a href="https://help.aliyun.com/document_detail/199339.html">Ingest URLs and playback URLs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream****</p>
         */
        @NameInMap("URL")
        public String URL;

        public static StartLiveMPUTaskRequestMultiStreamURL build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestMultiStreamURL self = new StartLiveMPUTaskRequestMultiStreamURL();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestMultiStreamURL setIsAliCdn(Boolean isAliCdn) {
            this.isAliCdn = isAliCdn;
            return this;
        }
        public Boolean getIsAliCdn() {
            return this.isAliCdn;
        }

        public StartLiveMPUTaskRequestMultiStreamURL setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class StartLiveMPUTaskRequestSeiParamsLayoutVolume extends TeaModel {
        /**
         * <p>Specifies whether to ensure that SEI is carried when sending an IDR keyframe. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Does not ensure SEI is carried.</p>
         * </li>
         * <li><p><strong>1</strong>: Ensures SEI is carried.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The SEI sending interval. Unit: milliseconds. The value must be in the range of [1000, 5000].</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Interval")
        public String interval;

        public static StartLiveMPUTaskRequestSeiParamsLayoutVolume build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestSeiParamsLayoutVolume self = new StartLiveMPUTaskRequestSeiParamsLayoutVolume();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestSeiParamsLayoutVolume setFollowIdr(String followIdr) {
            this.followIdr = followIdr;
            return this;
        }
        public String getFollowIdr() {
            return this.followIdr;
        }

        public StartLiveMPUTaskRequestSeiParamsLayoutVolume setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class StartLiveMPUTaskRequestSeiParamsPassThrough extends TeaModel {
        /**
         * <p>Specifies whether to ensure that SEI is carried when sending an IDR keyframe. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Does not ensure SEI is carried.</p>
         * </li>
         * <li><p><strong>1</strong>: Ensures SEI is carried.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The SEI sending interval. Unit: milliseconds. The value must be in the range of [1000, 5000].</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The payload content of the pass-through SEI.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPayloadContent</p>
         */
        @NameInMap("PayloadContent")
        public String payloadContent;

        /**
         * <p>The key corresponding to the payload content of the pass-through SEI. If not set, the default key is \<code>udd\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPayloadContentKey</p>
         */
        @NameInMap("PayloadContentKey")
        public String payloadContentKey;

        public static StartLiveMPUTaskRequestSeiParamsPassThrough build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestSeiParamsPassThrough self = new StartLiveMPUTaskRequestSeiParamsPassThrough();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestSeiParamsPassThrough setFollowIdr(String followIdr) {
            this.followIdr = followIdr;
            return this;
        }
        public String getFollowIdr() {
            return this.followIdr;
        }

        public StartLiveMPUTaskRequestSeiParamsPassThrough setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public StartLiveMPUTaskRequestSeiParamsPassThrough setPayloadContent(String payloadContent) {
            this.payloadContent = payloadContent;
            return this;
        }
        public String getPayloadContent() {
            return this.payloadContent;
        }

        public StartLiveMPUTaskRequestSeiParamsPassThrough setPayloadContentKey(String payloadContentKey) {
            this.payloadContentKey = payloadContentKey;
            return this;
        }
        public String getPayloadContentKey() {
            return this.payloadContentKey;
        }

    }

    public static class StartLiveMPUTaskRequestSeiParams extends TeaModel {
        /**
         * <p>The layout and volume SEI. The content of this parameter can be empty, which means the default layout and volume SEI is carried.</p>
         */
        @NameInMap("LayoutVolume")
        public StartLiveMPUTaskRequestSeiParamsLayoutVolume layoutVolume;

        /**
         * <p>The pass-through SEI.</p>
         */
        @NameInMap("PassThrough")
        public StartLiveMPUTaskRequestSeiParamsPassThrough passThrough;

        /**
         * <p>The custom payload_type of the SEI message. The value must be in the range of 100-254. If not set, the default payload_type is 5.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PayloadType")
        public String payloadType;

        public static StartLiveMPUTaskRequestSeiParams build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestSeiParams self = new StartLiveMPUTaskRequestSeiParams();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestSeiParams setLayoutVolume(StartLiveMPUTaskRequestSeiParamsLayoutVolume layoutVolume) {
            this.layoutVolume = layoutVolume;
            return this;
        }
        public StartLiveMPUTaskRequestSeiParamsLayoutVolume getLayoutVolume() {
            return this.layoutVolume;
        }

        public StartLiveMPUTaskRequestSeiParams setPassThrough(StartLiveMPUTaskRequestSeiParamsPassThrough passThrough) {
            this.passThrough = passThrough;
            return this;
        }
        public StartLiveMPUTaskRequestSeiParamsPassThrough getPassThrough() {
            return this.passThrough;
        }

        public StartLiveMPUTaskRequestSeiParams setPayloadType(String payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        public String getPayloadType() {
            return this.payloadType;
        }

    }

    public static class StartLiveMPUTaskRequestSingleSubParams extends TeaModel {
        /**
         * <p>The type of video input stream in single-stream ingest mode. This parameter is valid only for video streams (StreamType=2). Valid values:</p>
         * <ul>
         * <li><p><strong>camera</strong> (default): Camera stream.</p>
         * </li>
         * <li><p><strong>shareScreen</strong>: Screen sharing stream.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of stream to ingest in single-stream ingest mode. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): Ingest the original stream.</p>
         * </li>
         * <li><p><strong>1</strong>: Ingest only the audio stream.</p>
         * </li>
         * <li><p><strong>2</strong>: Ingest only the video stream.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the user whose stream is ingested. Only one stream can be ingested at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSubUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartLiveMPUTaskRequestSingleSubParams build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestSingleSubParams self = new StartLiveMPUTaskRequestSingleSubParams();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestSingleSubParams setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartLiveMPUTaskRequestSingleSubParams setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public StartLiveMPUTaskRequestSingleSubParams setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParamsBackground extends TeaModel {
        /**
         * <p>The display mode of the output video. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Scale and display a black background.</p>
         * </li>
         * <li><p><strong>1</strong> (default): Clip.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderMode")
        public String renderMode;

        /**
         * <p>The URL of the global background image. The maximum length is 2048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImageUrl</p>
         */
        @NameInMap("URL")
        public String URL;

        public static StartLiveMPUTaskRequestTranscodeParamsBackground build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParamsBackground self = new StartLiveMPUTaskRequestTranscodeParamsBackground();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParamsBackground setRenderMode(String renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public String getRenderMode() {
            return this.renderMode;
        }

        public StartLiveMPUTaskRequestTranscodeParamsBackground setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParamsEncodeParams extends TeaModel {
        /**
         * <p>The audio bitrate. Unit: kbps. The value must be in the range of [8, 500].</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("AudioBitrate")
        public String audioBitrate;

        /**
         * <p>The number of audio channels. Valid values: 1, 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioChannels")
        public String audioChannels;

        /**
         * <p>Specifies whether the stream is audio-only. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Audio-only. You only need to set audio-related parameters.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Not audio-only. All parameters except VideoCodec and EnhancedParam must be specified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioOnly")
        public String audioOnly;

        /**
         * <p>The audio sampling rate. Unit: Hz. Valid values: 8000, 16000, 32000, 44100, 48000.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("AudioSampleRate")
        public String audioSampleRate;

        /**
         * <p>The enhanced encoding parameters. This is a JSON string. The supported optional configurations include \<code>profile\\</code> and \<code>preset\\</code>.</p>
         * <ul>
         * <li><p>\<code>profile\\</code>: The encoding profile. If the video encoding format is H.264, valid values for \<code>profile\\</code> include &quot;baseline&quot;, &quot;main&quot;, and &quot;high&quot;. If the video encoding format is H.265, the valid value for \<code>profile\\</code> is &quot;main&quot;.</p>
         * </li>
         * <li><p>\<code>preset\\</code>: Balances encoding speed and quality. Valid values for \<code>preset\\</code> include &quot;ultrafast&quot;, &quot;superfast&quot;, &quot;veryfast&quot;, &quot;faster&quot;, &quot;fast&quot;, &quot;medium&quot;, &quot;slow&quot;, &quot;slower&quot;, &quot;veryslow&quot;, and &quot;placebo&quot;. Each value represents a strategy for balancing encoding speed and output video quality, from &quot;ultrafast&quot; (fastest encoding speed) to &quot;placebo&quot; (highest quality, slowest encoding speed).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For example, &quot;superfast&quot; is mainly used for real-time communication. If you are not an expert in encoders, do not set this option.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;profile&quot;: &quot;high&quot;, &quot;preset&quot;: &quot;veryfast&quot;}</p>
         */
        @NameInMap("EnhancedParam")
        public String enhancedParam;

        /**
         * <p>The video bitrate. Unit: kbps. The value must be in the range of [1, 10000].</p>
         * 
         * <strong>example:</strong>
         * <p>3500</p>
         */
        @NameInMap("VideoBitrate")
        public String videoBitrate;

        /**
         * <p>The video encoding format. Valid values:</p>
         * <ul>
         * <li><p>H.264 (default).</p>
         * </li>
         * <li><p>H.265.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <p>The video frame rate. Unit: fps. The value must be in the range of [1, 60].</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("VideoFramerate")
        public String videoFramerate;

        /**
         * <p>The video GOP size. The value must be in the range of [1, 60].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoGop")
        public String videoGop;

        /**
         * <p>The video height. Unit: pixels. The value must be in the range of [0, 1920].</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoHeight")
        public String videoHeight;

        /**
         * <p>The video width. Unit: pixels. The value must be in the range of [0, 1920].</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("VideoWidth")
        public String videoWidth;

        public static StartLiveMPUTaskRequestTranscodeParamsEncodeParams build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParamsEncodeParams self = new StartLiveMPUTaskRequestTranscodeParamsEncodeParams();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioBitrate(String audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public String getAudioBitrate() {
            return this.audioBitrate;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioChannels(String audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public String getAudioChannels() {
            return this.audioChannels;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioOnly(String audioOnly) {
            this.audioOnly = audioOnly;
            return this;
        }
        public String getAudioOnly() {
            return this.audioOnly;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioSampleRate(String audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }
        public String getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setEnhancedParam(String enhancedParam) {
            this.enhancedParam = enhancedParam;
            return this;
        }
        public String getEnhancedParam() {
            return this.enhancedParam;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoBitrate(String videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public String getVideoBitrate() {
            return this.videoBitrate;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoFramerate(String videoFramerate) {
            this.videoFramerate = videoFramerate;
            return this;
        }
        public String getVideoFramerate() {
            return this.videoFramerate;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoGop(String videoGop) {
            this.videoGop = videoGop;
            return this;
        }
        public String getVideoGop() {
            return this.videoGop;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoHeight(String videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public String getVideoHeight() {
            return this.videoHeight;
        }

        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoWidth(String videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public String getVideoWidth() {
            return this.videoWidth;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo extends TeaModel {
        /**
         * <p>The ID of the channel where the user is located. You do not need to set this parameter for users in the same channel. For cross-channel stream mixing, set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The type of video input stream in stream mixing and transcoding mode. This parameter is valid only for video streams (StreamType=2). Valid values:</p>
         * <ul>
         * <li><p><strong>camera</strong> (default): Camera stream.</p>
         * </li>
         * <li><p><strong>shareScreen</strong>: Screen sharing stream.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSubUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo self = new StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes extends TeaModel {
        /**
         * <p>The URL of the background image for the video pane. The maximum length is 2048 characters. When a user turns off their camera or has not joined the channel, this image is displayed in their layout position.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImageUrl</p>
         */
        @NameInMap("BackgroundImageUrl")
        public String backgroundImageUrl;

        /**
         * <p>The height of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2632</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The display mode of the output video pane. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Scale and display a black background.</p>
         * </li>
         * <li><p><strong>1</strong> (default): Clip.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderMode")
        public String renderMode;

        /**
         * <p>The information about the user corresponding to this pane. If you do not set this parameter, the system automatically fills it based on the order in which streamers join the channel.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify user information, that user must already be configured in the \<code>TranscodeParams.UserInfos\\</code> parameter.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter is valid only for original streams and video streams.</li>
         * </ul>
         */
        @NameInMap("UserInfo")
        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo userInfo;

        /**
         * <p>The width of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3564</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The X-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The Y-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3789</p>
         */
        @NameInMap("Y")
        public String y;

        /**
         * <p>The stacking order. 0 is the bottom layer. Layer 1 is on top of layer 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public String ZOrder;

        public static StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes self = new StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setRenderMode(String renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public String getRenderMode() {
            return this.renderMode;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setUserInfo(StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo getUserInfo() {
            return this.userInfo;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setZOrder(String ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public String getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParamsLayout extends TeaModel {
        /**
         * <p>The information about user panes in the mixed stream.</p>
         */
        @NameInMap("UserPanes")
        public java.util.List<StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes> userPanes;

        public static StartLiveMPUTaskRequestTranscodeParamsLayout build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParamsLayout self = new StartLiveMPUTaskRequestTranscodeParamsLayout();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParamsLayout setUserPanes(java.util.List<StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes> userPanes) {
            this.userPanes = userPanes;
            return this;
        }
        public java.util.List<StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanes> getUserPanes() {
            return this.userPanes;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParamsUserInfos extends TeaModel {
        /**
         * <p>The ID of the channel where the subscribed user is located. You do not need to set this parameter for users in the same channel. For cross-channel stream mixing, set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The type of video input stream to subscribe to for stream mixing. This parameter is valid only for video streams (StreamType=2). Valid values:</p>
         * <ul>
         * <li><p><strong>camera</strong> (default): Camera stream.</p>
         * </li>
         * <li><p><strong>shareScreen</strong>: Screen sharing stream.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of stream to subscribe to for stream mixing. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): Ingest the original stream.</p>
         * </li>
         * <li><p><strong>1</strong>: Ingest only the audio stream.</p>
         * </li>
         * <li><p><strong>2</strong>: Ingest only the video stream.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the user to subscribe to for stream mixing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSubUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartLiveMPUTaskRequestTranscodeParamsUserInfos build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParamsUserInfos self = new StartLiveMPUTaskRequestTranscodeParamsUserInfos();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParamsUserInfos setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartLiveMPUTaskRequestTranscodeParamsUserInfos setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartLiveMPUTaskRequestTranscodeParamsUserInfos setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public StartLiveMPUTaskRequestTranscodeParamsUserInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartLiveMPUTaskRequestTranscodeParams extends TeaModel {
        /**
         * <p>The global background image for the mixed stream.</p>
         */
        @NameInMap("Background")
        public StartLiveMPUTaskRequestTranscodeParamsBackground background;

        /**
         * <p>The encoding parameters for the output stream.</p>
         */
        @NameInMap("EncodeParams")
        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams encodeParams;

        /**
         * <p>The video layout information.</p>
         * <blockquote>
         * <p>For video transcoding, you must specify the video layout information, including coordinates (X, Y), pane dimensions (Width, Height), and stacking order (ZOrder). For audio-only transcoding, do not specify video layout information.</p>
         * </blockquote>
         */
        @NameInMap("Layout")
        public StartLiveMPUTaskRequestTranscodeParamsLayout layout;

        /**
         * <p>The information about the users to subscribe to for stream mixing. If you do not specify users, all users are included in the mixed stream.</p>
         */
        @NameInMap("UserInfos")
        public java.util.List<StartLiveMPUTaskRequestTranscodeParamsUserInfos> userInfos;

        public static StartLiveMPUTaskRequestTranscodeParams build(java.util.Map<String, ?> map) throws Exception {
            StartLiveMPUTaskRequestTranscodeParams self = new StartLiveMPUTaskRequestTranscodeParams();
            return TeaModel.build(map, self);
        }

        public StartLiveMPUTaskRequestTranscodeParams setBackground(StartLiveMPUTaskRequestTranscodeParamsBackground background) {
            this.background = background;
            return this;
        }
        public StartLiveMPUTaskRequestTranscodeParamsBackground getBackground() {
            return this.background;
        }

        public StartLiveMPUTaskRequestTranscodeParams setEncodeParams(StartLiveMPUTaskRequestTranscodeParamsEncodeParams encodeParams) {
            this.encodeParams = encodeParams;
            return this;
        }
        public StartLiveMPUTaskRequestTranscodeParamsEncodeParams getEncodeParams() {
            return this.encodeParams;
        }

        public StartLiveMPUTaskRequestTranscodeParams setLayout(StartLiveMPUTaskRequestTranscodeParamsLayout layout) {
            this.layout = layout;
            return this;
        }
        public StartLiveMPUTaskRequestTranscodeParamsLayout getLayout() {
            return this.layout;
        }

        public StartLiveMPUTaskRequestTranscodeParams setUserInfos(java.util.List<StartLiveMPUTaskRequestTranscodeParamsUserInfos> userInfos) {
            this.userInfos = userInfos;
            return this;
        }
        public java.util.List<StartLiveMPUTaskRequestTranscodeParamsUserInfos> getUserInfos() {
            return this.userInfos;
        }

    }

}
