// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The task parameter details. The parameter format is the same as the parameter format used when you call the operation to create a stream mixing task.</p>
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
         * <p>Indicates whether the stream is relayed to Content Delivery Network (CDN). Valid values:</p>
         * <ul>
         * <li>false: The stream is relayed to a non-Alibaba Cloud CDN.</li>
         * <li>true: The stream is relayed to Content Delivery Network (CDN).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAliCdn")
        public Boolean isAliCdn;

        /**
         * <p>The live stream ingest URL.</p>
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
         * <p>Specifies whether to ensure that SEI is carried when sending IDR keyframes. Valid values:</p>
         * <ul>
         * <li>0: does not ensure SEI is carried.</li>
         * <li>1: ensures SEI is carried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The SEI sending interval. Unit: milliseconds.</p>
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
         * <p>Specifies whether to ensure that SEI is carried when sending IDR keyframes. Valid values:</p>
         * <ul>
         * <li>0: does not ensure SEI is carried.</li>
         * <li>1: ensures SEI is carried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FollowIdr")
        public String followIdr;

        /**
         * <p>The SEI sending interval. Unit: milliseconds.</p>
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
         * <p>The key value corresponding to the payload content of the pass-through SEI. If not set, the key defaults to udd.</p>
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
         * <p>The layout and volume SEI. If this parameter is empty, the default layout and volume SEI is carried.</p>
         */
        @NameInMap("LayoutVolume")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsLayoutVolume layoutVolume;

        /**
         * <p>The pass-through SEI.</p>
         */
        @NameInMap("PassThrough")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParamsPassThrough passThrough;

        /**
         * <p>The custom payload_type of the SEI message. Valid values: 100 to 254. If not set, the SEI payload_type defaults to 5.</p>
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
         * <p>The video input stream type in single-stream relaying mode. This parameter is valid only when the stream type is video (StreamType=2). Valid values:</p>
         * <ul>
         * <li>camera (default): camera.</li>
         * <li>shareScreen: screen sharing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The stream type for relaying in single-stream relaying mode. Valid values:</p>
         * <ul>
         * <li>0 (default): relay the original stream.</li>
         * <li>1: relay only the audio stream.</li>
         * <li>2: relay only the video stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The user ID for relaying. Only one stream can be relayed at a time.</p>
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
         * <p>The display mode for the sub-image output. Valid values:</p>
         * <ul>
         * <li>0: scales the image and displays a black background.</li>
         * <li>1 (default): crops the image.</li>
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
         * <p>The audio bitrate. Unit: kbps.</p>
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
         * <p>Specifies whether the output is audio-only. Valid values:</p>
         * <ul>
         * <li>true: audio-only.</li>
         * <li>false (default): not audio-only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AudioOnly")
        public String audioOnly;

        /**
         * <p>The audio sample rate. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("AudioSampleRate")
        public String audioSampleRate;

        /**
         * <p>The enhanced encoding parameters in JSON string format. The supported optional configurations include profile and preset.</p>
         * <ul>
         * <li>profile: the encoding level. When the video encoding format is H.264, the supported values for profile include: &quot;baseline&quot;, &quot;main&quot;, &quot;high&quot;.</li>
         * <li>preset: adjusts the balance between encoding speed and quality. The supported values for preset include: &quot;ultrafast&quot;, &quot;superfast&quot;, &quot;veryfast&quot;, &quot;faster&quot;, &quot;fast&quot;, &quot;medium&quot;, &quot;slow&quot;, &quot;slower&quot;, &quot;veryslow&quot;, &quot;placebo&quot;. Each value represents a strategy for encoding speed versus output video quality, ranging from &quot;ultrafast&quot; (extremely fast, encoding speed prioritized) to &quot;placebo&quot; (pursuing ultimate quality, extremely slow encoding).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;profile&quot;: &quot;high&quot;, &quot;preset&quot;: &quot;veryfast&quot;}</p>
         */
        @NameInMap("EnhancedParam")
        public String enhancedParam;

        /**
         * <p>The video bitrate. Unit: kbps.</p>
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
         * <p>The video frame rate. Unit: fps.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("VideoFramerate")
        public String videoFramerate;

        /**
         * <p>The video GOP.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoGop")
        public String videoGop;

        /**
         * <p>The video height. Unit: px.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoHeight")
        public String videoHeight;

        /**
         * <p>The video width. Unit: px.</p>
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
         * <p>The channel ID where the stream mixing user resides.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The video input stream type in stream mixing and transcoding mode. This parameter is valid only for video streams (StreamType=2). Valid values:</p>
         * <ul>
         * <li>camera (default): camera.</li>
         * <li>shareScreen: screen sharing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The stream mixing user ID.</p>
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
         * <p>The background image URL of the sub-image. When the user turns off the camera or has not entered the channel, this image fills the layout position.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImageUrl</p>
         */
        @NameInMap("BackgroundImageUrl")
        public String backgroundImageUrl;

        /**
         * <p>The pane height, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2632</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The display mode for the sub-image output. Valid values:</p>
         * <ul>
         * <li>0: scales the image and displays a black background.</li>
         * <li>1 (default): crops the image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderMode")
        public String renderMode;

        /**
         * <p>The stream mixing user information.</p>
         */
        @NameInMap("UserInfo")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayoutUserPanesUserInfo userInfo;

        /**
         * <p>The pane width, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3564</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The X coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The Y coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3789</p>
         */
        @NameInMap("Y")
        public String y;

        /**
         * <p>The stacking order. 0 is the bottom layer, layer 1 is above layer 0, and so on.</p>
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
         * <p>The stream mixing user pane information.</p>
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
         * <p>The channel ID where the stream mixing user resides.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The video input stream type in stream mixing and transcoding mode. This parameter is valid only for video streams (StreamType=2). Valid values:</p>
         * <ul>
         * <li>camera (default): camera.</li>
         * <li>shareScreen: screen sharing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The stream type for relaying in stream mixing and transcoding mode. Valid values:</p>
         * <ul>
         * <li>0 (default): relay the original stream.</li>
         * <li>1: relay only the audio stream.</li>
         * <li>2: relay only the video stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The stream mixing user ID.</p>
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
         * <p>The global background image for stream mixing.</p>
         */
        @NameInMap("Background")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsBackground background;

        /**
         * <p>The encoding parameters for the relayed output.</p>
         */
        @NameInMap("EncodeParams")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsEncodeParams encodeParams;

        /**
         * <p>The video layout information.</p>
         * <blockquote>
         * <p>For video transcoding, the video layout information includes layout coordinates (X, Y), layout pane dimensions (Width, Height), and stacking order (ZOrder). For audio-only transcoding, no video layout information is included.</p>
         * </blockquote>
         */
        @NameInMap("Layout")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksTranscodeParamsLayout layout;

        /**
         * <p>The stream mixing user information. If no user is specified, all users are mixed.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The idle timeout period. Unit: seconds.</p>
         * <blockquote>
         * <p>If this parameter is set, the task is automatically stopped when the task has been idle for a period longer than MaxIdleTime. If this parameter is not set, the task is stopped immediately after the channel is closed.</p>
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
         * <li>0: single-stream relaying without stream mixing or transcoding. Only the original single stream is relayed. You do not need to configure stream mixing and transcoding parameters.</li>
         * <li>1 (default): stream mixing, transcoding, and relaying.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MixMode")
        public String mixMode;

        /**
         * <p>The multi-address relaying parameters.</p>
         */
        @NameInMap("MultiStreamURL")
        public java.util.List<ListRtcMPUTaskDetailResponseBodyMPUTasksMultiStreamURL> multiStreamURL;

        /**
         * <p>The region where the requested stream mixing service resides. Valid values:</p>
         * <ul>
         * <li><strong>CN-Shanghai&lt;props=&quot;china&quot;&gt;<ph> (default)</ph></strong>: Shanghai.</li>
         * <li><strong>AP-Singapore&lt;props=&quot;intl&quot;&gt;<ph> (default)</ph></strong>: Singapore.</li>
         * <li><strong>EMAA-Saudi</strong>: Saudi Arabia.</li>
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
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSeiParams seiParams;

        /**
         * <p>The single-stream relaying parameters.</p>
         */
        @NameInMap("SingleSubParams")
        public ListRtcMPUTaskDetailResponseBodyMPUTasksSingleSubParams singleSubParams;

        /**
         * <p>The live stream ingest URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream****</p>
         */
        @NameInMap("StreamURL")
        public String streamURL;

        /**
         * <p>The task ID. This ID is the identifier of the stream mixing and relaying task.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The stream mixing, transcoding, and relaying parameters.</p>
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
