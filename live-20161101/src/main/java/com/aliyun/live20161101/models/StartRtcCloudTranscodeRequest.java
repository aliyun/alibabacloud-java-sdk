// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudTranscodeRequest extends TeaModel {
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
     * <p>myChannel</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputParam")
    public StartRtcCloudTranscodeRequestInputParam inputParam;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Long sourceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Long streamType;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myChannel</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lhd</p>
         */
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userA_360p</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
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
