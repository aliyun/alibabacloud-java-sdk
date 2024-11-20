// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartRtcRobotInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Config")
    public StartRtcRobotInstanceRequestConfig config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca28b08ad3464ebcb42e5c0f7c6d2e89</p>
     */
    @NameInMap("RobotId")
    public String robotId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-robot</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static StartRtcRobotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRtcRobotInstanceRequest self = new StartRtcRobotInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartRtcRobotInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRtcRobotInstanceRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRtcRobotInstanceRequest setConfig(StartRtcRobotInstanceRequestConfig config) {
        this.config = config;
        return this;
    }
    public StartRtcRobotInstanceRequestConfig getConfig() {
        return this.config;
    }

    public StartRtcRobotInstanceRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public StartRtcRobotInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public StartRtcRobotInstanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class StartRtcRobotInstanceRequestConfig extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceprintId")
        public String voiceprintId;

        @NameInMap("Volume")
        public Long volume;

        public static StartRtcRobotInstanceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            StartRtcRobotInstanceRequestConfig self = new StartRtcRobotInstanceRequestConfig();
            return TeaModel.build(map, self);
        }

        public StartRtcRobotInstanceRequestConfig setAsrMaxSilence(Integer asrMaxSilence) {
            this.asrMaxSilence = asrMaxSilence;
            return this;
        }
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        public StartRtcRobotInstanceRequestConfig setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public StartRtcRobotInstanceRequestConfig setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public StartRtcRobotInstanceRequestConfig setUseVoiceprint(Boolean useVoiceprint) {
            this.useVoiceprint = useVoiceprint;
            return this;
        }
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        public StartRtcRobotInstanceRequestConfig setUserOfflineTimeout(Integer userOfflineTimeout) {
            this.userOfflineTimeout = userOfflineTimeout;
            return this;
        }
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        public StartRtcRobotInstanceRequestConfig setUserOnlineTimeout(Integer userOnlineTimeout) {
            this.userOnlineTimeout = userOnlineTimeout;
            return this;
        }
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        public StartRtcRobotInstanceRequestConfig setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public StartRtcRobotInstanceRequestConfig setVoiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        public StartRtcRobotInstanceRequestConfig setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

    }

}
