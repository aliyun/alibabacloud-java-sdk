// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudRecordingRequest extends TeaModel {
    /**
     * <p>The ID of the app to which the channel to be recorded belongs. The app must belong to the primary account associated with the current API caller\&quot;s account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel to be recorded. Make sure that the channel has active users when you call this operation. Otherwise, the recording task fails to be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>room1024</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The idle timeout period. When the task remains idle for longer than MaxIdleTime, the task is automatically stopped. Unit: seconds. The value must be within [10,14400], which is a maximum of 4 hours. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    /**
     * <p>The layout parameters. This parameter is not required in single-stream recording mode and is required in stream mixing recording mode when the output is not audio-only.</p>
     */
    @NameInMap("MixLayoutParams")
    public StartRtcCloudRecordingRequestMixLayoutParams mixLayoutParams;

    /**
     * <p>The transcoding parameters. This parameter is not required in single-stream recording mode and is required in stream mixing recording mode.</p>
     */
    @NameInMap("MixTranscodeParams")
    public StartRtcCloudRecordingRequestMixTranscodeParams mixTranscodeParams;

    /**
     * <p>The authentication key for callback messages. Leave this parameter empty to skip authentication. If specified, the key must be 16 to 64 characters in length and consist of only uppercase and lowercase letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>mytestkeymytestkey</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>The specified formats for which a callback message is sent when the recording file upload event (RecordFileUploaded) is triggered.</p>
     */
    @NameInMap("NotifyFileUploadedFormat")
    public java.util.List<String> notifyFileUploadedFormat;

    /**
     * <p>The URL for receiving callback messages. Task status messages are pushed to this URL in JSON format by using the POST method. The maximum length is 2048 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx/test/mycallback">http://xxxx/test/mycallback</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The recording parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordParams")
    public StartRtcCloudRecordingRequestRecordParams recordParams;

    /**
     * <p>The storage parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageParams")
    public StartRtcCloudRecordingRequestStorageParams storageParams;

    /**
     * <p>The subscription parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscribeParams")
    public StartRtcCloudRecordingRequestSubscribeParams subscribeParams;

    public static StartRtcCloudRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRtcCloudRecordingRequest self = new StartRtcCloudRecordingRequest();
        return TeaModel.build(map, self);
    }

    public StartRtcCloudRecordingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRtcCloudRecordingRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRtcCloudRecordingRequest setMaxIdleTime(Long maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public Long getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public StartRtcCloudRecordingRequest setMixLayoutParams(StartRtcCloudRecordingRequestMixLayoutParams mixLayoutParams) {
        this.mixLayoutParams = mixLayoutParams;
        return this;
    }
    public StartRtcCloudRecordingRequestMixLayoutParams getMixLayoutParams() {
        return this.mixLayoutParams;
    }

    public StartRtcCloudRecordingRequest setMixTranscodeParams(StartRtcCloudRecordingRequestMixTranscodeParams mixTranscodeParams) {
        this.mixTranscodeParams = mixTranscodeParams;
        return this;
    }
    public StartRtcCloudRecordingRequestMixTranscodeParams getMixTranscodeParams() {
        return this.mixTranscodeParams;
    }

    public StartRtcCloudRecordingRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public StartRtcCloudRecordingRequest setNotifyFileUploadedFormat(java.util.List<String> notifyFileUploadedFormat) {
        this.notifyFileUploadedFormat = notifyFileUploadedFormat;
        return this;
    }
    public java.util.List<String> getNotifyFileUploadedFormat() {
        return this.notifyFileUploadedFormat;
    }

    public StartRtcCloudRecordingRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public StartRtcCloudRecordingRequest setRecordParams(StartRtcCloudRecordingRequestRecordParams recordParams) {
        this.recordParams = recordParams;
        return this;
    }
    public StartRtcCloudRecordingRequestRecordParams getRecordParams() {
        return this.recordParams;
    }

    public StartRtcCloudRecordingRequest setStorageParams(StartRtcCloudRecordingRequestStorageParams storageParams) {
        this.storageParams = storageParams;
        return this;
    }
    public StartRtcCloudRecordingRequestStorageParams getStorageParams() {
        return this.storageParams;
    }

    public StartRtcCloudRecordingRequest setSubscribeParams(StartRtcCloudRecordingRequestSubscribeParams subscribeParams) {
        this.subscribeParams = subscribeParams;
        return this;
    }
    public StartRtcCloudRecordingRequestSubscribeParams getSubscribeParams() {
        return this.subscribeParams;
    }

    public static class StartRtcCloudRecordingRequestMixLayoutParamsMixBackground extends TeaModel {
        /**
         * <p>The display mode for the output. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
         * <p>The URL of the background image. The maximum length is 2048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.com/photos/my-test-picture.png">https://xxxx.com/photos/my-test-picture.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static StartRtcCloudRecordingRequestMixLayoutParamsMixBackground build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestMixLayoutParamsMixBackground self = new StartRtcCloudRecordingRequestMixLayoutParamsMixBackground();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsMixBackground setRenderMode(Integer renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public Integer getRenderMode() {
            return this.renderMode;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsMixBackground setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground extends TeaModel {
        /**
         * <p>The display mode for the sub-pane output. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
         * <p>The URL of the background image. The maximum length is 2048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.com/photos/my-test-pane-picture.png">https://xxxx.com/photos/my-test-pane-picture.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground self = new StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground setRenderMode(Integer renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public Integer getRenderMode() {
            return this.renderMode;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class StartRtcCloudRecordingRequestMixLayoutParamsUserPanes extends TeaModel {
        /**
         * <p>The pane height as a normalized percentage. The value must be within [0,1]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The video input stream type for this UserId. If UserId is not specified, this SourceType setting has no effect. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        /**
         * <p>The background image for the sub-pane. When a user turns off the camera, has not published a stream after joining, or leaves the channel midway, the corresponding image fills the layout position.</p>
         */
        @NameInMap("SubBackground")
        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground subBackground;

        /**
         * <p>The UserId corresponding to this window.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The pane width as a normalized percentage. The value must be within [0,1]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The X coordinate as a normalized percentage. The value must be within [0,1]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The Y coordinate as a normalized percentage. The value must be within [0,1]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Y")
        public String y;

        /**
         * <p>The stacking order. 0 is the bottom layer, layer 1 is above layer 0, and so on. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartRtcCloudRecordingRequestMixLayoutParamsUserPanes build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestMixLayoutParamsUserPanes self = new StartRtcCloudRecordingRequestMixLayoutParamsUserPanes();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setSubBackground(StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground subBackground) {
            this.subBackground = subBackground;
            return this;
        }
        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground getSubBackground() {
            return this.subBackground;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartRtcCloudRecordingRequestMixLayoutParams extends TeaModel {
        /**
         * <p>The global background image for stream mixing.</p>
         */
        @NameInMap("MixBackground")
        public StartRtcCloudRecordingRequestMixLayoutParamsMixBackground mixBackground;

        /**
         * <p>Specifies the window layout information for subscribed users. Only users whose UserId has layout information configured are included in the video. This parameter is required in stream mixing mode when recording non-audio-only files.</p>
         */
        @NameInMap("UserPanes")
        public java.util.List<StartRtcCloudRecordingRequestMixLayoutParamsUserPanes> userPanes;

        public static StartRtcCloudRecordingRequestMixLayoutParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestMixLayoutParams self = new StartRtcCloudRecordingRequestMixLayoutParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestMixLayoutParams setMixBackground(StartRtcCloudRecordingRequestMixLayoutParamsMixBackground mixBackground) {
            this.mixBackground = mixBackground;
            return this;
        }
        public StartRtcCloudRecordingRequestMixLayoutParamsMixBackground getMixBackground() {
            return this.mixBackground;
        }

        public StartRtcCloudRecordingRequestMixLayoutParams setUserPanes(java.util.List<StartRtcCloudRecordingRequestMixLayoutParamsUserPanes> userPanes) {
            this.userPanes = userPanes;
            return this;
        }
        public java.util.List<StartRtcCloudRecordingRequestMixLayoutParamsUserPanes> getUserPanes() {
            return this.userPanes;
        }

    }

    public static class StartRtcCloudRecordingRequestMixTranscodeParams extends TeaModel {
        /**
         * <p>The audio bitrate in kbps. The value must be in the range of [8, 500]. This parameter is required in stream mixing mode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("AudioBitrate")
        public Long audioBitrate;

        /**
         * <p>The number of audio channels. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioChannels")
        public Integer audioChannels;

        /**
         * <p>The audio sample rate in Hz. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("AudioSampleRate")
        public Long audioSampleRate;

        /**
         * <p>The frame fill type when a stream is interrupted. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FrameFillType")
        public Integer frameFillType;

        /**
         * <p>The video bitrate in kbps. The value must be in the range of [1, 10000].</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("VideoBitrate")
        public Integer videoBitrate;

        /**
         * <p>The video encoding format. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <p>The video frame rate in fps. The value must be in the range of [1, 60].</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VideoFramerate")
        public Integer videoFramerate;

        /**
         * <p>The video GOP. An I-frame is inserted every VideoGop frames. The value must be in the range of [1, 60].</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VideoGop")
        public Integer videoGop;

        /**
         * <p>The video height in pixels. The value must be in the range of [0, 1920]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("VideoHeight")
        public Integer videoHeight;

        /**
         * <p>The video width in pixels. The value must be in the range of [0, 1920]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("VideoWidth")
        public Integer videoWidth;

        public static StartRtcCloudRecordingRequestMixTranscodeParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestMixTranscodeParams self = new StartRtcCloudRecordingRequestMixTranscodeParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setAudioBitrate(Long audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public Long getAudioBitrate() {
            return this.audioBitrate;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setAudioChannels(Integer audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public Integer getAudioChannels() {
            return this.audioChannels;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setAudioSampleRate(Long audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }
        public Long getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setFrameFillType(Integer frameFillType) {
            this.frameFillType = frameFillType;
            return this;
        }
        public Integer getFrameFillType() {
            return this.frameFillType;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setVideoBitrate(Integer videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setVideoFramerate(Integer videoFramerate) {
            this.videoFramerate = videoFramerate;
            return this;
        }
        public Integer getVideoFramerate() {
            return this.videoFramerate;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setVideoGop(Integer videoGop) {
            this.videoGop = videoGop;
            return this;
        }
        public Integer getVideoGop() {
            return this.videoGop;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        public StartRtcCloudRecordingRequestMixTranscodeParams setVideoWidth(Integer videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

    }

    public static class StartRtcCloudRecordingRequestRecordParams extends TeaModel {
        /**
         * <p>The maximum duration of a recording file, in seconds. A recording file that exceeds this duration is split. The value must be in the range of [180, 7200], which means a maximum of 2 hours. If this parameter is not specified, the default value is 7200 (2 hours).</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("MaxFileDuration")
        public Long maxFileDuration;

        /**
         * <p>The recording mode. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecordMode")
        public Integer recordMode;

        /**
         * <p>The media type of the output recording stream. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        public static StartRtcCloudRecordingRequestRecordParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestRecordParams self = new StartRtcCloudRecordingRequestRecordParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestRecordParams setMaxFileDuration(Long maxFileDuration) {
            this.maxFileDuration = maxFileDuration;
            return this;
        }
        public Long getMaxFileDuration() {
            return this.maxFileDuration;
        }

        public StartRtcCloudRecordingRequestRecordParams setRecordMode(Integer recordMode) {
            this.recordMode = recordMode;
            return this;
        }
        public Integer getRecordMode() {
            return this.recordMode;
        }

        public StartRtcCloudRecordingRequestRecordParams setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class StartRtcCloudRecordingRequestStorageParamsFileInfo extends TeaModel {
        /**
         * <p>The file naming format. You can select and combine the following variables in any order:</p>
         * 
         * <strong>example:</strong>
         * <p>{AppId}<em>{ChannelId}</em>{StartTime}_{UserId}</p>
         */
        @NameInMap("FileNamePattern")
        public String fileNamePattern;

        /**
         * <p>The file storage path. Each element in the array corresponds to a directory level. For example, if the value is [&quot;dir1&quot;,&quot;dir2&quot;], the xxx.m3u8 file is saved as dir1/dir2/TaskId/xxx.m3u8. If this parameter is empty, the file is saved as TaskId/xxx.m3u8.</p>
         */
        @NameInMap("FilePathPrefix")
        public java.util.List<String> filePathPrefix;

        /**
         * <p>The file storage format. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The segment length in seconds. This parameter takes effect only in HLS format. The value must be in the range of [10, 30]. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Long sliceDuration;

        /**
         * <p>The segment naming format. This parameter takes effect only in HLS format. Similar to FileNamePattern, but with an additional variable Sequence:</p>
         * 
         * <strong>example:</strong>
         * <p>{AppId}<em>{ChannelId}</em>{StartTime}_{Sequence}</p>
         */
        @NameInMap("SliceNamePattern")
        public String sliceNamePattern;

        public static StartRtcCloudRecordingRequestStorageParamsFileInfo build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestStorageParamsFileInfo self = new StartRtcCloudRecordingRequestStorageParamsFileInfo();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestStorageParamsFileInfo setFileNamePattern(String fileNamePattern) {
            this.fileNamePattern = fileNamePattern;
            return this;
        }
        public String getFileNamePattern() {
            return this.fileNamePattern;
        }

        public StartRtcCloudRecordingRequestStorageParamsFileInfo setFilePathPrefix(java.util.List<String> filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            return this;
        }
        public java.util.List<String> getFilePathPrefix() {
            return this.filePathPrefix;
        }

        public StartRtcCloudRecordingRequestStorageParamsFileInfo setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public StartRtcCloudRecordingRequestStorageParamsFileInfo setSliceDuration(Long sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Long getSliceDuration() {
            return this.sliceDuration;
        }

        public StartRtcCloudRecordingRequestStorageParamsFileInfo setSliceNamePattern(String sliceNamePattern) {
            this.sliceNamePattern = sliceNamePattern;
            return this;
        }
        public String getSliceNamePattern() {
            return this.sliceNamePattern;
        }

    }

    public static class StartRtcCloudRecordingRequestStorageParamsOSSParams extends TeaModel {
        /**
         * <p>The name of the OSS bucket. The bucket must belong to the primary account associated with the current API caller\&quot;s account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest-bucket</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The endpoint of the OSS storage. The corresponding region ID must be consistent with the selected service registration endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("OSSEndpoint")
        public String OSSEndpoint;

        public static StartRtcCloudRecordingRequestStorageParamsOSSParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestStorageParamsOSSParams self = new StartRtcCloudRecordingRequestStorageParamsOSSParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestStorageParamsOSSParams setOSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        public StartRtcCloudRecordingRequestStorageParamsOSSParams setOSSEndpoint(String OSSEndpoint) {
            this.OSSEndpoint = OSSEndpoint;
            return this;
        }
        public String getOSSEndpoint() {
            return this.OSSEndpoint;
        }

    }

    public static class StartRtcCloudRecordingRequestStorageParamsVodParams extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic composition. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoCompose")
        public Integer autoCompose;

        /**
         * <p>The ID of the VOD transcoding template group used to transcode the automatically composed video in the VOD service.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>4c34112cfe68248f2f77759c</strong></strong></p>
         */
        @NameInMap("ComposeVodTranscodeGroupId")
        public String composeVodTranscodeGroupId;

        /**
         * <p>The storage address configured in the ApsaraVideo VOD console under Media Asset Management &gt; Storage Management. Recording files are first saved to this location and then uploaded to VOD.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest.oss-cn-shenzhen.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The ID of the VOD transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>8a914d3989e9825eb90530b2</strong></strong></p>
         */
        @NameInMap("VodTranscodeGroupId")
        public String vodTranscodeGroupId;

        public static StartRtcCloudRecordingRequestStorageParamsVodParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestStorageParamsVodParams self = new StartRtcCloudRecordingRequestStorageParamsVodParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestStorageParamsVodParams setAutoCompose(Integer autoCompose) {
            this.autoCompose = autoCompose;
            return this;
        }
        public Integer getAutoCompose() {
            return this.autoCompose;
        }

        public StartRtcCloudRecordingRequestStorageParamsVodParams setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
            this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
            return this;
        }
        public String getComposeVodTranscodeGroupId() {
            return this.composeVodTranscodeGroupId;
        }

        public StartRtcCloudRecordingRequestStorageParamsVodParams setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public StartRtcCloudRecordingRequestStorageParamsVodParams setVodTranscodeGroupId(String vodTranscodeGroupId) {
            this.vodTranscodeGroupId = vodTranscodeGroupId;
            return this;
        }
        public String getVodTranscodeGroupId() {
            return this.vodTranscodeGroupId;
        }

    }

    public static class StartRtcCloudRecordingRequestStorageParams extends TeaModel {
        /**
         * <p>The file storage information, which specifies the format, storage location, and naming of recording files. This parameter takes effect only when StorageType is set to OSS.</p>
         */
        @NameInMap("FileInfo")
        public java.util.List<StartRtcCloudRecordingRequestStorageParamsFileInfo> fileInfo;

        /**
         * <p>The OSS storage configuration. This parameter is required when the storage method is OSS and is invalid when the storage method is VOD.</p>
         */
        @NameInMap("OSSParams")
        public StartRtcCloudRecordingRequestStorageParamsOSSParams OSSParams;

        /**
         * <p>The storage method. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StorageType")
        public Integer storageType;

        /**
         * <p>The VOD storage configuration. This parameter is required when the storage method is VOD and is invalid when the storage method is OSS.</p>
         */
        @NameInMap("VodParams")
        public StartRtcCloudRecordingRequestStorageParamsVodParams vodParams;

        public static StartRtcCloudRecordingRequestStorageParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestStorageParams self = new StartRtcCloudRecordingRequestStorageParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestStorageParams setFileInfo(java.util.List<StartRtcCloudRecordingRequestStorageParamsFileInfo> fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public java.util.List<StartRtcCloudRecordingRequestStorageParamsFileInfo> getFileInfo() {
            return this.fileInfo;
        }

        public StartRtcCloudRecordingRequestStorageParams setOSSParams(StartRtcCloudRecordingRequestStorageParamsOSSParams OSSParams) {
            this.OSSParams = OSSParams;
            return this;
        }
        public StartRtcCloudRecordingRequestStorageParamsOSSParams getOSSParams() {
            return this.OSSParams;
        }

        public StartRtcCloudRecordingRequestStorageParams setStorageType(Integer storageType) {
            this.storageType = storageType;
            return this;
        }
        public Integer getStorageType() {
            return this.storageType;
        }

        public StartRtcCloudRecordingRequestStorageParams setVodParams(StartRtcCloudRecordingRequestStorageParamsVodParams vodParams) {
            this.vodParams = vodParams;
            return this;
        }
        public StartRtcCloudRecordingRequestStorageParamsVodParams getVodParams() {
            return this.vodParams;
        }

    }

    public static class StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList extends TeaModel {
        /**
         * <p>The video input stream type of the UserId. This parameter takes effect only when the subscription is not audio-only (StreamType != 1). Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        /**
         * <p>The media type of the subscribed UserId. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
         * <p>The subscribed UserId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList self = new StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartRtcCloudRecordingRequestSubscribeParams extends TeaModel {
        /**
         * <p>The list of subscribed UserId entries. In single-stream recording mode, each UserId is recorded separately. In stream mixing recording mode, the audio and video of all UserIds are mixed into a single set of audio and video.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SubscribeUserIdList")
        public java.util.List<StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList> subscribeUserIdList;

        public static StartRtcCloudRecordingRequestSubscribeParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudRecordingRequestSubscribeParams self = new StartRtcCloudRecordingRequestSubscribeParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudRecordingRequestSubscribeParams setSubscribeUserIdList(java.util.List<StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList> subscribeUserIdList) {
            this.subscribeUserIdList = subscribeUserIdList;
            return this;
        }
        public java.util.List<StartRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList> getSubscribeUserIdList() {
            return this.subscribeUserIdList;
        }

    }

}
