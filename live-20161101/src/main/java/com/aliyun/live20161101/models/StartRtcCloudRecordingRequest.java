// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>room1024</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    @NameInMap("MixLayoutParams")
    public StartRtcCloudRecordingRequestMixLayoutParams mixLayoutParams;

    @NameInMap("MixTranscodeParams")
    public StartRtcCloudRecordingRequestMixTranscodeParams mixTranscodeParams;

    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    @NameInMap("NotifyFileUploadedFormat")
    public java.util.List<String> notifyFileUploadedFormat;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx/test/mycallback">http://xxxx/test/mycallback</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordParams")
    public StartRtcCloudRecordingRequestRecordParams recordParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageParams")
    public StartRtcCloudRecordingRequestStorageParams storageParams;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
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
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        @NameInMap("SubBackground")
        public StartRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground subBackground;

        /**
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Y")
        public String y;

        /**
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
        @NameInMap("MixBackground")
        public StartRtcCloudRecordingRequestMixLayoutParamsMixBackground mixBackground;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("AudioBitrate")
        public Long audioBitrate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioChannels")
        public Integer audioChannels;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("AudioSampleRate")
        public Long audioSampleRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FrameFillType")
        public Integer frameFillType;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("VideoBitrate")
        public Integer videoBitrate;

        /**
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VideoFramerate")
        public Integer videoFramerate;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VideoGop")
        public Integer videoGop;

        /**
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("VideoHeight")
        public Integer videoHeight;

        /**
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
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("MaxFileDuration")
        public Long maxFileDuration;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecordMode")
        public Integer recordMode;

        /**
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
         * <strong>example:</strong>
         * <p>{AppId}<em>{ChannelId}</em>{StartTime}_{UserId}</p>
         */
        @NameInMap("FileNamePattern")
        public String fileNamePattern;

        @NameInMap("FilePathPrefix")
        public java.util.List<String> filePathPrefix;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Long sliceDuration;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest-bucket</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
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
        @NameInMap("AutoCompose")
        public Integer autoCompose;

        @NameInMap("ComposeVodTranscodeGroupId")
        public String composeVodTranscodeGroupId;

        @NameInMap("StorageLocation")
        public String storageLocation;

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
        @NameInMap("FileInfo")
        public java.util.List<StartRtcCloudRecordingRequestStorageParamsFileInfo> fileInfo;

        @NameInMap("OSSParams")
        public StartRtcCloudRecordingRequestStorageParamsOSSParams OSSParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StorageType")
        public Integer storageType;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
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
