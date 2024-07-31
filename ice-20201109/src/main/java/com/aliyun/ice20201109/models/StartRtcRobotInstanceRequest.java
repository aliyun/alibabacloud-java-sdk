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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("Greeting")
        public String greeting;

        /**
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        public static StartRtcRobotInstanceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            StartRtcRobotInstanceRequestConfig self = new StartRtcRobotInstanceRequestConfig();
            return TeaModel.build(map, self);
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

        public StartRtcRobotInstanceRequestConfig setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

}
