// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveMPUTaskRequest extends TeaModel {
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
    public java.util.List<UpdateLiveMPUTaskRequestMultiStreamURL> multiStreamURL;

    /**
     * <p>The supplemental enhancement information (SEI) parameters.</p>
     */
    @NameInMap("SeiParams")
    public UpdateLiveMPUTaskRequestSeiParams seiParams;

    /**
     * <p>The single-stream relay parameters. These parameters are required if you set MixMode to 0.</p>
     */
    @NameInMap("SingleSubParams")
    public UpdateLiveMPUTaskRequestSingleSubParams singleSubParams;

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
    public UpdateLiveMPUTaskRequestTranscodeParams transcodeParams;

    public static UpdateLiveMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveMPUTaskRequest self = new UpdateLiveMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLiveMPUTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateLiveMPUTaskRequest setMixMode(String mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public String getMixMode() {
        return this.mixMode;
    }

    public UpdateLiveMPUTaskRequest setMultiStreamURL(java.util.List<UpdateLiveMPUTaskRequestMultiStreamURL> multiStreamURL) {
        this.multiStreamURL = multiStreamURL;
        return this;
    }
    public java.util.List<UpdateLiveMPUTaskRequestMultiStreamURL> getMultiStreamURL() {
        return this.multiStreamURL;
    }

    public UpdateLiveMPUTaskRequest setSeiParams(UpdateLiveMPUTaskRequestSeiParams seiParams) {
        this.seiParams = seiParams;
        return this;
    }
    public UpdateLiveMPUTaskRequestSeiParams getSeiParams() {
        return this.seiParams;
    }

    public UpdateLiveMPUTaskRequest setSingleSubParams(UpdateLiveMPUTaskRequestSingleSubParams singleSubParams) {
        this.singleSubParams = singleSubParams;
        return this;
    }
    public UpdateLiveMPUTaskRequestSingleSubParams getSingleSubParams() {
        return this.singleSubParams;
    }

    public UpdateLiveMPUTaskRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public UpdateLiveMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateLiveMPUTaskRequest setTranscodeParams(UpdateLiveMPUTaskRequestTranscodeParams transcodeParams) {
        this.transcodeParams = transcodeParams;
        return this;
    }
    public UpdateLiveMPUTaskRequestTranscodeParams getTranscodeParams() {
        return this.transcodeParams;
    }

    public static class UpdateLiveMPUTaskRequestMultiStreamURL extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestMultiStreamURL build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestMultiStreamURL self = new UpdateLiveMPUTaskRequestMultiStreamURL();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestMultiStreamURL setIsAliCdn(Boolean isAliCdn) {
            this.isAliCdn = isAliCdn;
            return this;
        }
        public Boolean getIsAliCdn() {
            return this.isAliCdn;
        }

        public UpdateLiveMPUTaskRequestMultiStreamURL setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class UpdateLiveMPUTaskRequestSeiParamsLayoutVolume extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestSeiParamsLayoutVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestSeiParamsLayoutVolume self = new UpdateLiveMPUTaskRequestSeiParamsLayoutVolume();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestSeiParamsLayoutVolume setFollowIdr(String followIdr) {
            this.followIdr = followIdr;
            return this;
        }
        public String getFollowIdr() {
            return this.followIdr;
        }

        public UpdateLiveMPUTaskRequestSeiParamsLayoutVolume setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class UpdateLiveMPUTaskRequestSeiParamsPassThrough extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestSeiParamsPassThrough build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestSeiParamsPassThrough self = new UpdateLiveMPUTaskRequestSeiParamsPassThrough();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestSeiParamsPassThrough setFollowIdr(String followIdr) {
            this.followIdr = followIdr;
            return this;
        }
        public String getFollowIdr() {
            return this.followIdr;
        }

        public UpdateLiveMPUTaskRequestSeiParamsPassThrough setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public UpdateLiveMPUTaskRequestSeiParamsPassThrough setPayloadContent(String payloadContent) {
            this.payloadContent = payloadContent;
            return this;
        }
        public String getPayloadContent() {
            return this.payloadContent;
        }

        public UpdateLiveMPUTaskRequestSeiParamsPassThrough setPayloadContentKey(String payloadContentKey) {
            this.payloadContentKey = payloadContentKey;
            return this;
        }
        public String getPayloadContentKey() {
            return this.payloadContentKey;
        }

    }

    public static class UpdateLiveMPUTaskRequestSeiParams extends TeaModel {
        /**
         * <p>The layout and volume SEI. If you leave this parameter empty, the default layout and volume SEI is used.</p>
         */
        @NameInMap("LayoutVolume")
        public UpdateLiveMPUTaskRequestSeiParamsLayoutVolume layoutVolume;

        /**
         * <p>Specifies whether to pass through the SEI.</p>
         */
        @NameInMap("PassThrough")
        public UpdateLiveMPUTaskRequestSeiParamsPassThrough passThrough;

        public static UpdateLiveMPUTaskRequestSeiParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestSeiParams self = new UpdateLiveMPUTaskRequestSeiParams();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestSeiParams setLayoutVolume(UpdateLiveMPUTaskRequestSeiParamsLayoutVolume layoutVolume) {
            this.layoutVolume = layoutVolume;
            return this;
        }
        public UpdateLiveMPUTaskRequestSeiParamsLayoutVolume getLayoutVolume() {
            return this.layoutVolume;
        }

        public UpdateLiveMPUTaskRequestSeiParams setPassThrough(UpdateLiveMPUTaskRequestSeiParamsPassThrough passThrough) {
            this.passThrough = passThrough;
            return this;
        }
        public UpdateLiveMPUTaskRequestSeiParamsPassThrough getPassThrough() {
            return this.passThrough;
        }

    }

    public static class UpdateLiveMPUTaskRequestSingleSubParams extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestSingleSubParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestSingleSubParams self = new UpdateLiveMPUTaskRequestSingleSubParams();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestSingleSubParams setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateLiveMPUTaskRequestSingleSubParams setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public UpdateLiveMPUTaskRequestSingleSubParams setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParamsBackground extends TeaModel {
        /**
         * <p>The display mode of the global background image.</p>
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
         * <p>The URL of the global background image.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImageUrl</p>
         */
        @NameInMap("URL")
        public String URL;

        public static UpdateLiveMPUTaskRequestTranscodeParamsBackground build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParamsBackground self = new UpdateLiveMPUTaskRequestTranscodeParamsBackground();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsBackground setRenderMode(String renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public String getRenderMode() {
            return this.renderMode;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsBackground setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams self = new UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioBitrate(String audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public String getAudioBitrate() {
            return this.audioBitrate;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioChannels(String audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public String getAudioChannels() {
            return this.audioChannels;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioOnly(String audioOnly) {
            this.audioOnly = audioOnly;
            return this;
        }
        public String getAudioOnly() {
            return this.audioOnly;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setAudioSampleRate(String audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }
        public String getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setEnhancedParam(String enhancedParam) {
            this.enhancedParam = enhancedParam;
            return this;
        }
        public String getEnhancedParam() {
            return this.enhancedParam;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoBitrate(String videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public String getVideoBitrate() {
            return this.videoBitrate;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoFramerate(String videoFramerate) {
            this.videoFramerate = videoFramerate;
            return this;
        }
        public String getVideoFramerate() {
            return this.videoFramerate;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoGop(String videoGop) {
            this.videoGop = videoGop;
            return this;
        }
        public String getVideoGop() {
            return this.videoGop;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoHeight(String videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public String getVideoHeight() {
            return this.videoHeight;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams setVideoWidth(String videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public String getVideoWidth() {
            return this.videoWidth;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo self = new UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes extends TeaModel {
        /**
         * <p>The URL of the background image of the pane. This image is displayed if the user turns off the camera or is not present in the channel.</p>
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
        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo userInfo;

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

        public static UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes self = new UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setRenderMode(String renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public String getRenderMode() {
            return this.renderMode;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setUserInfo(UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanesUserInfo getUserInfo() {
            return this.userInfo;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes setZOrder(String ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public String getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParamsLayout extends TeaModel {
        /**
         * <p>The information about the panes.</p>
         */
        @NameInMap("UserPanes")
        public java.util.List<UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes> userPanes;

        public static UpdateLiveMPUTaskRequestTranscodeParamsLayout build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParamsLayout self = new UpdateLiveMPUTaskRequestTranscodeParamsLayout();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsLayout setUserPanes(java.util.List<UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes> userPanes) {
            this.userPanes = userPanes;
            return this;
        }
        public java.util.List<UpdateLiveMPUTaskRequestTranscodeParamsLayoutUserPanes> getUserPanes() {
            return this.userPanes;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParamsUserInfos extends TeaModel {
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

        public static UpdateLiveMPUTaskRequestTranscodeParamsUserInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParamsUserInfos self = new UpdateLiveMPUTaskRequestTranscodeParamsUserInfos();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsUserInfos setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsUserInfos setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsUserInfos setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public UpdateLiveMPUTaskRequestTranscodeParamsUserInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateLiveMPUTaskRequestTranscodeParams extends TeaModel {
        /**
         * <p>The global background image.</p>
         */
        @NameInMap("Background")
        public UpdateLiveMPUTaskRequestTranscodeParamsBackground background;

        /**
         * <p>The encoding parameters for the output stream.</p>
         */
        @NameInMap("EncodeParams")
        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams encodeParams;

        /**
         * <p>The video layout information.</p>
         * <blockquote>
         * <p> If video transcoding is required, you must specify the video layout information, including the x-coordinate and y-coordinate, the width and height, and the layer. For audio-only transcoding, leave the video layout information empty.</p>
         * </blockquote>
         */
        @NameInMap("Layout")
        public UpdateLiveMPUTaskRequestTranscodeParamsLayout layout;

        /**
         * <p>The information about the users whose streams are subscribed to. If you leave this parameter empty, streams from all users are mixed.</p>
         */
        @NameInMap("UserInfos")
        public java.util.List<UpdateLiveMPUTaskRequestTranscodeParamsUserInfos> userInfos;

        public static UpdateLiveMPUTaskRequestTranscodeParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveMPUTaskRequestTranscodeParams self = new UpdateLiveMPUTaskRequestTranscodeParams();
            return TeaModel.build(map, self);
        }

        public UpdateLiveMPUTaskRequestTranscodeParams setBackground(UpdateLiveMPUTaskRequestTranscodeParamsBackground background) {
            this.background = background;
            return this;
        }
        public UpdateLiveMPUTaskRequestTranscodeParamsBackground getBackground() {
            return this.background;
        }

        public UpdateLiveMPUTaskRequestTranscodeParams setEncodeParams(UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams encodeParams) {
            this.encodeParams = encodeParams;
            return this;
        }
        public UpdateLiveMPUTaskRequestTranscodeParamsEncodeParams getEncodeParams() {
            return this.encodeParams;
        }

        public UpdateLiveMPUTaskRequestTranscodeParams setLayout(UpdateLiveMPUTaskRequestTranscodeParamsLayout layout) {
            this.layout = layout;
            return this;
        }
        public UpdateLiveMPUTaskRequestTranscodeParamsLayout getLayout() {
            return this.layout;
        }

        public UpdateLiveMPUTaskRequestTranscodeParams setUserInfos(java.util.List<UpdateLiveMPUTaskRequestTranscodeParamsUserInfos> userInfos) {
            this.userInfos = userInfos;
            return this;
        }
        public java.util.List<UpdateLiveMPUTaskRequestTranscodeParamsUserInfos> getUserInfos() {
            return this.userInfos;
        }

    }

}
