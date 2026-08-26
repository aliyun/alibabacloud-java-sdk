// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudTranscodeRequest extends TeaModel {
    /**
     * <p>The ID of the application to which the channel belongs. The ID can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel to which the user to be transcoded belongs. The ID can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myChannel</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The parameters for the input stream subscription.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputParam")
    public StartRtcCloudTranscodeRequestInputParam inputParam;

    /**
     * <p>The idle timeout period in seconds. If a task cannot subscribe to the specified streamer\&quot;s stream and remains idle for longer than this period, the task automatically stops. The value must be an integer from 10 to 14,400. The default value is 300.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    /**
     * <p>The parameters for the transcoded output.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputParams")
    public java.util.List<StartRtcCloudTranscodeRequestOutputParams> outputParams;

    public static StartRtcCloudTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRtcCloudTranscodeRequest self = new StartRtcCloudTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public StartRtcCloudTranscodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRtcCloudTranscodeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRtcCloudTranscodeRequest setInputParam(StartRtcCloudTranscodeRequestInputParam inputParam) {
        this.inputParam = inputParam;
        return this;
    }
    public StartRtcCloudTranscodeRequestInputParam getInputParam() {
        return this.inputParam;
    }

    public StartRtcCloudTranscodeRequest setMaxIdleTime(Long maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public Long getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public StartRtcCloudTranscodeRequest setOutputParams(java.util.List<StartRtcCloudTranscodeRequestOutputParams> outputParams) {
        this.outputParams = outputParams;
        return this;
    }
    public java.util.List<StartRtcCloudTranscodeRequestOutputParams> getOutputParams() {
        return this.outputParams;
    }

    public static class StartRtcCloudTranscodeRequestInputParamSingleSubUserParam extends TeaModel {
        /**
         * <p>The type of the video input stream. This parameter is valid only if the subscribed media type includes a video stream. Valid values:</p>
         * <ul>
         * <li><p>0 (default): The camera stream.</p>
         * </li>
         * <li><p>1: The screen sharing stream. (This value is not supported. The setting is invalid.)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Long sourceType;

        /**
         * <p>The media type of the subscribed stream. Valid values:</p>
         * <ul>
         * <li><p>0 (default): The original stream, which includes both the audio and video streams.</p>
         * </li>
         * <li><p>1: The audio-only stream. (This value is not supported. The setting is invalid.)</p>
         * </li>
         * <li><p>2: The video-only stream. (This value is not supported. The setting is invalid.)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Long streamType;

        /**
         * <p>The ID of the user whose stream you want to subscribe to.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartRtcCloudTranscodeRequestInputParamSingleSubUserParam build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudTranscodeRequestInputParamSingleSubUserParam self = new StartRtcCloudTranscodeRequestInputParamSingleSubUserParam();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudTranscodeRequestInputParamSingleSubUserParam setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public StartRtcCloudTranscodeRequestInputParamSingleSubUserParam setStreamType(Long streamType) {
            this.streamType = streamType;
            return this;
        }
        public Long getStreamType() {
            return this.streamType;
        }

        public StartRtcCloudTranscodeRequestInputParamSingleSubUserParam setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartRtcCloudTranscodeRequestInputParam extends TeaModel {
        /**
         * <p>The input parameters for a single-stream subscription.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SingleSubUserParam")
        public StartRtcCloudTranscodeRequestInputParamSingleSubUserParam singleSubUserParam;

        public static StartRtcCloudTranscodeRequestInputParam build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudTranscodeRequestInputParam self = new StartRtcCloudTranscodeRequestInputParam();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudTranscodeRequestInputParam setSingleSubUserParam(StartRtcCloudTranscodeRequestInputParamSingleSubUserParam singleSubUserParam) {
            this.singleSubUserParam = singleSubUserParam;
            return this;
        }
        public StartRtcCloudTranscodeRequestInputParamSingleSubUserParam getSingleSubUserParam() {
            return this.singleSubUserParam;
        }

    }

    public static class StartRtcCloudTranscodeRequestOutputParams extends TeaModel {
        /**
         * <p>The ID of the channel to which the transcoded stream is pushed. The ID can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters. (Pushing streams to a different channel is not supported. This setting is invalid.)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myChannel</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The name of the transcoding template. Valid values:</p>
         * <ul>
         * <li><p>alimcopy</p>
         * </li>
         * <li><p>lld</p>
         * </li>
         * <li><p>lsd</p>
         * </li>
         * <li><p>lhd</p>
         * </li>
         * <li><p>lud</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lhd</p>
         */
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        /**
         * <p>The user ID for the transcoded stream in the destination channel. This ID must be unique within the channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userA_360p</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The token required to push the transcoded stream to the channel. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/token-based-authentication">Token-based authentication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI********</p>
         */
        @NameInMap("UserToken")
        public String userToken;

        public static StartRtcCloudTranscodeRequestOutputParams build(java.util.Map<String, ?> map) throws Exception {
            StartRtcCloudTranscodeRequestOutputParams self = new StartRtcCloudTranscodeRequestOutputParams();
            return TeaModel.build(map, self);
        }

        public StartRtcCloudTranscodeRequestOutputParams setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartRtcCloudTranscodeRequestOutputParams setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public StartRtcCloudTranscodeRequestOutputParams setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartRtcCloudTranscodeRequestOutputParams setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

    }

}
