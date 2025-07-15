// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveMPUTaskRequest extends TeaModel {
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
     * <p>The timeout period of an idle connection. Unit: seconds. Valid values: [10,86400].</p>
     * <blockquote>
     * <p> If the task is idle for a period of time longer than the duration specified by the MaxIdleTime parameter, the task is automatically stopped. If the parameter is not specified, the task is stopped after the channel is closed.</p>
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
     * <li><strong>0</strong>: the single-stream relay mode. In this mode, the service only relays the original single stream, but does not transcode mixed streams. You do not need to set parameters for mixed-stream transcoding.</li>
     * <li><strong>1</strong> (default): the mixed-stream relay mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MixMode")
    public String mixMode;

    /**
     * <p>The multiple ingest URLs to relay. This parameter allows you to specify multiple ingest URLs.</p>
     * <blockquote>
     * <p> The StreamURL and MultiStreamURL parameters are mutually exclusive. You must specify one of the two parameters.</p>
     * </blockquote>
     */
    @NameInMap("MultiStreamURL")
    public java.util.List<StartLiveMPUTaskRequestMultiStreamURL> multiStreamURL;

    /**
     * <p>The region in which the streams are mixed. Valid values:</p>
     * <ul>
     * <li><strong>CN-Shanghai</strong></li>
     * <li><strong>AP-Singapore</strong> (default)</li>
     * <li><strong>EMAA-Saudi</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CN-Shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The supplemental enhancement information (SEI) parameters.</p>
     */
    @NameInMap("SeiParams")
    public StartLiveMPUTaskRequestSeiParams seiParams;

    /**
     * <p>The single-stream relay parameters. These parameters are required if you set MixMode to 0. Leave these parameters empty in the mixed-stream relay mode.</p>
     */
    @NameInMap("SingleSubParams")
    public StartLiveMPUTaskRequestSingleSubParams singleSubParams;

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
     * <p>The mixed-stream relay parameters. These parameters are required if you set MixMode to 1. Leave these parameters empty if you use the single-stream relay mode.</p>
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
         * <p>Specifies whether to perform stream relay by using Alibaba Cloud CDN. Valid values:</p>
         * <ul>
         * <li>false: performs stream relay by using a CDN service that is not Alibaba Cloud CDN.</li>
         * <li>true: performs stream relay by using Alibaba Cloud CDN.</li>
         * </ul>
         * <blockquote>
         * <p> The default value of this parameter is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAliCdn")
        public Boolean isAliCdn;

        /**
         * <p>The ingest URL. Only the RTMP format is supported. The URL can be up to 2,048 characters in length. For information about the generation rules of ingest URLs, see <a href="https://help.aliyun.com/document_detail/199339.html">Ingest and streaming URLs</a>.</p>
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
         * <p>Specifies whether to include the SEI in an Instantaneous Decoder Refresh (IDR) frame. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: does not include the SEI.</li>
         * <li><strong>1</strong>: includes the SEI.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The interval at which the SEI is sent. Valid values: [1000,5000]. Unit: milliseconds.</p>
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
         * <p>Specifies whether to include the SEI in an IDR frame. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: does not include the SEI.</li>
         * <li><strong>1</strong>: includes the SEI.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The interval at which the SEI is sent. Valid values: [1000,5000]. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The payload content of the SEI.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPayloadContent</p>
         */
        @NameInMap("PayloadContent")
        public String payloadContent;

        /**
         * <p>The key of the payload content of the SEI. If you do not specify this parameter, the default value udd is used.</p>
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
         * <p>The layout and volume SEI. If you leave this parameter empty, the default layout and volume SEI is used.</p>
         */
        @NameInMap("LayoutVolume")
        public StartLiveMPUTaskRequestSeiParamsLayoutVolume layoutVolume;

        /**
         * <p>Specifies whether to pass through the SEI.</p>
         */
        @NameInMap("PassThrough")
        public StartLiveMPUTaskRequestSeiParamsPassThrough passThrough;

        /**
         * <p>The custom payload_type of the SEI. Valid values: 100 to 254. If you do not specify this parameter, the default value 5 is used.</p>
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
         * <p>The type of the video source. This parameter is valid only when you set StreamType to 2. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong> (default)</li>
         * <li><strong>shareScreen</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of the stream that you want to relay. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): original stream</li>
         * <li><strong>1</strong>: only the audio track</li>
         * <li><strong>2</strong>: only the video track</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The user ID. In the single-stream relay mode, you can relay only one stream in a request.</p>
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
         * <p>The display mode of the global background image. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: scales the background image proportionally to fit the view, with black bars displayed.</li>
         * <li><strong>1</strong> (default): crops the background image to fit the view.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderMode")
        public String renderMode;

        /**
         * <p>The URL of the global background image. The URL can be up to 2,048 characters in length.</p>
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
         * <p>The bitrate of the audio. Valid values: [8,500]. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("AudioBitrate")
        public String audioBitrate;

        /**
         * <p>The number of sound channels. Valid values: 1 and 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioChannels")
        public String audioChannels;

        /**
         * <p>Specifies whether the output stream is an audio-only stream. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The output stream is an audio-only stream. If you set this parameter to true, you need to configure only audio-related parameters under EncodeParams.</li>
         * <li><strong>false</strong> (default): The output stream is not an audio-only stream. If you set this parameter to false, you need to configure all parameters under EncodeParams, except the VideoCodec and EnhancedParam parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioOnly")
        public String audioOnly;

        /**
         * <p>The audio sampling rate. Valid values: 8000, 16000, 32000, 44100, and 48000. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("AudioSampleRate")
        public String audioSampleRate;

        /**
         * <p>The parameter used for encoding enhancement, which is a JSON string. The parameter includes the optional profile and preset fields.</p>
         * <ul>
         * <li>profile: the encoding level. If the video codec is H.264, the valid values of this field are baseline, main, and high. If the video codec is H.265, the valid value of this field is main.</li>
         * <li>preset: adjusts the trade-off between encoding speed and video quality. The valid values of this field are ultrafast, superfast, veryfast, faster, fast, medium, slow, slower, veryslow, and placebo. Each value specifies a level of trade-off between encoding speed and video quality. For example, the ultrafast preset has the fastest encoding speed but the lowest video quality, while the placebo preset sacrifices the encoding speed for the best video quality.</li>
         * </ul>
         * <blockquote>
         * <p> A value of superfast for the preset field is suitable for real-time communication scenarios. We recommend that you not set the field if you are not a professional encoding engineer.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;profile&quot;: &quot;high&quot;, &quot;preset&quot;: &quot;veryfast&quot;}</p>
         */
        @NameInMap("EnhancedParam")
        public String enhancedParam;

        /**
         * <p>The bitrate of the video. Valid values: [1,10000]. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3500</p>
         */
        @NameInMap("VideoBitrate")
        public String videoBitrate;

        /**
         * <p>The video codec. Valid values:</p>
         * <ul>
         * <li>H.264 (default)</li>
         * <li>H.265</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <p>The frame rate of the video. Valid values: [1,60]. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("VideoFramerate")
        public String videoFramerate;

        /**
         * <p>The group of pictures (GOP) size of the video. Valid values: [1,60].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoGop")
        public String videoGop;

        /**
         * <p>The height of the video. Valid values: [0,1920]. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoHeight")
        public String videoHeight;

        /**
         * <p>The width of the video. Valid values: [0,1920]. Unit: pixels.</p>
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
         * <p>The ID of the channel where the user is. If the user is in the same channel, you can leave this parameter empty. We recommend that you specify this parameter when you perform stream mixing across channels.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The type of the video source. This parameter is valid only when you set StreamType to 2. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong> (default)</li>
         * <li><strong>shareScreen</strong></li>
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
         * <p>The URL of the background image of the pane. The URL can be up to 2,048 characters in length. This image is displayed if the user turns off the camera or is not present in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImageUrl</p>
         */
        @NameInMap("BackgroundImageUrl")
        public String backgroundImageUrl;

        /**
         * <p>The height of the pane. The value is normalized.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2632</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The display mode of the pane. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: scales the video proportionally to fit the view, with black bars displayed.</li>
         * <li><strong>1 (default)</strong>: crops the video to fit the view.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderMode")
        public String renderMode;

        /**
         * <p>The information about the user whose stream is played in the pane. If you leave this parameter empty, the system automatically sets this parameter based on the order in which streamers join the channel.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify the information about a user by using this parameter, the information about the user must also be specified by using the TranscodeParams.UserInfos parameter.</p>
         * </li>
         * <li><p>This parameter is valid only when you set StreamType to 0 or 2.</p>
         * </li>
         * </ul>
         */
        @NameInMap("UserInfo")
        public StartLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo userInfo;

        /**
         * <p>The width of the pane. The value is normalized.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3564</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The x-coordinate of the pane. The value is normalized.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The y-coordinate of the pane. The value is normalized.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3789</p>
         */
        @NameInMap("Y")
        public String y;

        /**
         * <p>The layer in which the pane resides. A value of 0 indicates the bottom layer. Each increment of the value by 1 indicates the next upper layer.</p>
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
         * <p>The information about the panes.</p>
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
         * <p>The ID of the channel where the subscribed user is. If the user is in the same channel, you can leave this parameter empty. We recommend that you specify this parameter when you perform stream mixing across channels.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The type of the video source that is subscribed to. This parameter is valid only when you set StreamType to 2. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong> (default)</li>
         * <li><strong>shareScreen</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of the relayed stream that is subscribed to. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): original stream</li>
         * <li><strong>1</strong>: only the audio track</li>
         * <li><strong>2</strong>: only the video track</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the subscribed user.</p>
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
         * <p>The global background image.</p>
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
         * <p> If video transcoding is required, you must specify the video layout information, including the x-coordinate and y-coordinate, the width and height, and the layer. For audio-only transcoding, leave the video layout information empty.</p>
         * </blockquote>
         */
        @NameInMap("Layout")
        public StartLiveMPUTaskRequestTranscodeParamsLayout layout;

        /**
         * <p>The information about the users whose streams are subscribed to. If you leave this parameter empty, streams from all users are mixed.</p>
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
