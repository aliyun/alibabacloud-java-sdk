// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The parameters that you configured when you called the StartLiveMPUTask operation to create the tasks.</p>
     */
    @NameInMap("MPUTasks")
    public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasks> MPUTasks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRtcMPUTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRtcMPUTaskDetailResponseBody self = new ListRtcMPUTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRtcMPUTaskDetailResponseBody setMPUTasks(java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasks> MPUTasks) {
        this.MPUTasks = MPUTasks;
        return this;
    }
    public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasks> getMPUTasks() {
        return this.MPUTasks;
    }

    public ListRtcMPUTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL extends TeaModel {
        /**
         * <p>Indicates whether stream relay is performed by using Alibaba Cloud CDN. Valid values:</p>
         * <ul>
         * <li>false: Stream relay is performed by using a CDN service that is not Alibaba Cloud CDN.</li>
         * <li>true: Stream relay is performed by using Alibaba Cloud CDN.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAliCdn")
        public Boolean isAliCdn;

        /**
         * <p>The ingest URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream****</p>
         */
        @NameInMap("URL")
        public String URL;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL self = new ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL setIsAliCdn(Boolean isAliCdn) {
            this.isAliCdn = isAliCdn;
            return this;
        }
        public Boolean getIsAliCdn() {
            return this.isAliCdn;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume extends TeaModel {
        /**
         * <p>Indicates whether to add SEI messages to Instantaneous Decoder Refresh (IDR) frames. Valid values:</p>
         * <ul>
         * <li>0: does not add SEI messages.</li>
         * <li>1: adds SEI messages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The interval at which the SEI messages are added. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Interval")
        public String interval;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume self = new ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume setFollowIdr(String followIdr) {
            this.followIdr = followIdr;
            return this;
        }
        public String getFollowIdr() {
            return this.followIdr;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough extends TeaModel {
        /**
         * <p>Indicates whether to add SEI messages to Instantaneous Decoder Refresh (IDR) frames. Valid values:</p>
         * <ul>
         * <li>0: does not add SEI messages.</li>
         * <li>1: adds SEI messages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The interval at which the SEI messages are added. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The payload content of the custom SEI.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPayloadContent</p>
         */
        @NameInMap("PayloadContent")
        public String payloadContent;

        /**
         * <p>The key of the payload content. Default value: udd.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPayloadContentKey</p>
         */
        @NameInMap("PayloadContentKey")
        public String payloadContentKey;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough self = new ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough setFollowIdr(String followIdr) {
            this.followIdr = followIdr;
            return this;
        }
        public String getFollowIdr() {
            return this.followIdr;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough setPayloadContent(String payloadContent) {
            this.payloadContent = payloadContent;
            return this;
        }
        public String getPayloadContent() {
            return this.payloadContent;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough setPayloadContentKey(String payloadContentKey) {
            this.payloadContentKey = payloadContentKey;
            return this;
        }
        public String getPayloadContentKey() {
            return this.payloadContentKey;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams extends TeaModel {
        /**
         * <p>The layout and volume SEI. If the return value is an empty string, the default layout and volume SEI is used.</p>
         */
        @NameInMap("LayoutVolume")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume layoutVolume;

        /**
         * <p>The custom SEI.</p>
         */
        @NameInMap("PassThrough")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough passThrough;

        /**
         * <p>The custom payload type. Valid values: 100 to 254. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PayloadType")
        public String payloadType;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams self = new ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams setLayoutVolume(ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume layoutVolume) {
            this.layoutVolume = layoutVolume;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume getLayoutVolume() {
            return this.layoutVolume;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams setPassThrough(ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough passThrough) {
            this.passThrough = passThrough;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough getPassThrough() {
            return this.passThrough;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams setPayloadType(String payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        public String getPayloadType() {
            return this.payloadType;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams extends TeaModel {
        /**
         * <p>The source of the video. This parameter is valid only if you set StreamType to 2. Valid values:</p>
         * <ul>
         * <li>camera (default): captures the video by using a camera.</li>
         * <li>shareScreen: captures the content displayed on a screen.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of the stream that is relayed. Valid values:</p>
         * <ul>
         * <li>0 (default): the original stream.</li>
         * <li>1: the audio-only stream.</li>
         * <li>2: the video-only stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the user whose stream is relayed. In single-stream relay mode, you can relay only one stream in a request.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSubUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams self = new ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground extends TeaModel {
        /**
         * <p>The display mode. Valid values:</p>
         * <ul>
         * <li>0: proportionally scales the video or background image to fit the pane. Black bars are added to fill the extra space.</li>
         * <li>1 (default): crops the video or background image to fit the pane.</li>
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

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground setRenderMode(String renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public String getRenderMode() {
            return this.renderMode;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams extends TeaModel {
        /**
         * <p>The bitrate of the audio. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("AudioBitrate")
        public String audioBitrate;

        /**
         * <p>The number of audio channels. Valid values: 1 and 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioChannels")
        public String audioChannels;

        /**
         * <p>Indicates whether the output stream is an audio-only stream. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioOnly")
        public String audioOnly;

        /**
         * <p>The audio sampling rate. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("AudioSampleRate")
        public String audioSampleRate;

        /**
         * <p>The parameter for advanced video encoding. The value is a JSON string. Optional fields:</p>
         * <ul>
         * <li>profile: the encoding level. If the video encoding format is set to H.264, the valid values of this field are baseline, main, and high.</li>
         * <li>preset: adjusts the trade-off between encoding speed and video quality. Valid values: ultrafast, superfast, veryfast, faster, fast, medium, slow, slower, veryslow, and placebo. Each value specifies a level of trade-off between encoding speed and video quality. For example, the ultrafast preset has the fastest encoding speed but the lowest video quality, while the placebo preset sacrifices the encoding speed for the best video quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;profile&quot;: &quot;high&quot;, &quot;preset&quot;: &quot;veryfast&quot;}</p>
         */
        @NameInMap("EnhancedParam")
        public String enhancedParam;

        /**
         * <p>The bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3500</p>
         */
        @NameInMap("VideoBitrate")
        public String videoBitrate;

        /**
         * <p>The video encoding format. Default value: H.264.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <p>The frame rate of the video. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("VideoFramerate")
        public String videoFramerate;

        /**
         * <p>The group of pictures (GOP) size of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoGop")
        public String videoGop;

        /**
         * <p>The height of the video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoHeight")
        public String videoHeight;

        /**
         * <p>The width of the video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("VideoWidth")
        public String videoWidth;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setAudioBitrate(String audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public String getAudioBitrate() {
            return this.audioBitrate;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setAudioChannels(String audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public String getAudioChannels() {
            return this.audioChannels;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setAudioOnly(String audioOnly) {
            this.audioOnly = audioOnly;
            return this;
        }
        public String getAudioOnly() {
            return this.audioOnly;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setAudioSampleRate(String audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }
        public String getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setEnhancedParam(String enhancedParam) {
            this.enhancedParam = enhancedParam;
            return this;
        }
        public String getEnhancedParam() {
            return this.enhancedParam;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setVideoBitrate(String videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public String getVideoBitrate() {
            return this.videoBitrate;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setVideoFramerate(String videoFramerate) {
            this.videoFramerate = videoFramerate;
            return this;
        }
        public String getVideoFramerate() {
            return this.videoFramerate;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setVideoGop(String videoGop) {
            this.videoGop = videoGop;
            return this;
        }
        public String getVideoGop() {
            return this.videoGop;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setVideoHeight(String videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public String getVideoHeight() {
            return this.videoHeight;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams setVideoWidth(String videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public String getVideoWidth() {
            return this.videoWidth;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo extends TeaModel {
        /**
         * <p>The ID of the channel where the user is.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The source of the video. This parameter is valid only if you set StreamType to 2. Valid values:</p>
         * <ul>
         * <li>camera (default): captures the video by using a camera.</li>
         * <li>shareScreen: captures the content displayed on a screen.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSubUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes extends TeaModel {
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
         * <p>The display mode. Valid values:</p>
         * <ul>
         * <li>0: proportionally scales the video or background image to fit the pane. Black bars are added to fill the extra space.</li>
         * <li>1 (default): crops the video or background image to fit the pane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderMode")
        public String renderMode;

        /**
         * <p>The information about the user whose stream is played in the pane.</p>
         */
        @NameInMap("UserInfo")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo userInfo;

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
         * <p>The layer of the pane. A value of 0 indicates that the pane is placed at the bottom layer. A larger value indicates a higher layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public String ZOrder;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setRenderMode(String renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public String getRenderMode() {
            return this.renderMode;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setUserInfo(ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo getUserInfo() {
            return this.userInfo;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes setZOrder(String ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public String getZOrder() {
            return this.ZOrder;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout extends TeaModel {
        /**
         * <p>The information about the panes.</p>
         */
        @NameInMap("UserPanes")
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes> userPanes;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout setUserPanes(java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes> userPanes) {
            this.userPanes = userPanes;
            return this;
        }
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanes> getUserPanes() {
            return this.userPanes;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos extends TeaModel {
        /**
         * <p>The ID of the channel where the user is.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The source of the video. This parameter is valid only if you set StreamType to 2. Valid values:</p>
         * <ul>
         * <li>camera (default): captures the video by using a camera.</li>
         * <li>shareScreen: captures the content displayed on a screen.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of the stream that is relayed. Valid values:</p>
         * <ul>
         * <li>0 (default): the original stream.</li>
         * <li>1: the audio-only stream.</li>
         * <li>2: the video-only stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSubUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams extends TeaModel {
        /**
         * <p>The global background image.</p>
         */
        @NameInMap("Background")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground background;

        /**
         * <p>The encoding parameters of the output stream.</p>
         */
        @NameInMap("EncodeParams")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams encodeParams;

        /**
         * <p>The video layout information.</p>
         * <blockquote>
         * <p> The video layout information includes the x-coordinate, y-coordinate, width, height, and layer of the pane. For audio-only transcoding, no video layout information is returned.</p>
         * </blockquote>
         */
        @NameInMap("Layout")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout layout;

        /**
         * <p>The information about the user whose stream is mixed. If an empty value is returned, streams from all users are mixed.</p>
         */
        @NameInMap("UserInfos")
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos> userInfos;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams self = new ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams setBackground(ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground background) {
            this.background = background;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground getBackground() {
            return this.background;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams setEncodeParams(ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams encodeParams) {
            this.encodeParams = encodeParams;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams getEncodeParams() {
            return this.encodeParams;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams setLayout(ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout layout) {
            this.layout = layout;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout getLayout() {
            return this.layout;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams setUserInfos(java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos> userInfos) {
            this.userInfos = userInfos;
            return this;
        }
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsUserInfos> getUserInfos() {
            return this.userInfos;
        }

    }

    public static class ListRtcMPUTaskDetailResponseBodyMPUTasks extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The timeout period of an idle connection. Unit: seconds.</p>
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
         * <li>0: relays the original single stream without mixing streams. If the value of this parameter is 0, the TranscodeParams parameter is empty.</li>
         * <li>1 (default): mixes multiple streams into a single stream and relays the mixed stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MixMode")
        public String mixMode;

        /**
         * <p>The multiple ingest URLs relayed.</p>
         */
        @NameInMap("MultiStreamURL")
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL> multiStreamURL;

        /**
         * <p>The region in which the streams are mixed. Valid values:</p>
         * <ul>
         * <li><strong>CN-shanghai</strong></li>
         * <li><strong>AP-Singapore (default)</strong></li>
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
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams seiParams;

        /**
         * <p>The parameters of the single-stream relay task.</p>
         */
        @NameInMap("SingleSubParams")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams singleSubParams;

        /**
         * <p>The ingest URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream****</p>
         */
        @NameInMap("StreamURL")
        public String streamURL;

        /**
         * <p>The ID of the stream relay task.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The mixed-stream relay parameters.</p>
         */
        @NameInMap("TranscodeParams")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams transcodeParams;

        public static ListRtcMPUTaskDetailResponseBodyMPUTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUTaskDetailResponseBodyMPUTasks self = new ListRtcMPUTaskDetailResponseBodyMPUTasks();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setMaxIdleTime(String maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public String getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setMixMode(String mixMode) {
            this.mixMode = mixMode;
            return this;
        }
        public String getMixMode() {
            return this.mixMode;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setMultiStreamURL(java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL> multiStreamURL) {
            this.multiStreamURL = multiStreamURL;
            return this;
        }
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL> getMultiStreamURL() {
            return this.multiStreamURL;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setSeiParams(ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams seiParams) {
            this.seiParams = seiParams;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams getSeiParams() {
            return this.seiParams;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setSingleSubParams(ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams singleSubParams) {
            this.singleSubParams = singleSubParams;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams getSingleSubParams() {
            return this.singleSubParams;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setStreamURL(String streamURL) {
            this.streamURL = streamURL;
            return this;
        }
        public String getStreamURL() {
            return this.streamURL;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListRtcMPUTaskDetailResponseBodyMPUTasks setTranscodeParams(ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams transcodeParams) {
            this.transcodeParams = transcodeParams;
            return this;
        }
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParams getTranscodeParams() {
            return this.transcodeParams;
        }

    }

}
