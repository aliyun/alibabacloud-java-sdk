// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeRtcRobotInstanceResponseBody extends TeaModel {
    /**
     * <p>The authentication token for the RTC Channel.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <p>The channel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The advanced configurations of the AI agent.</p>
     */
    @NameInMap("Config")
    public DescribeRtcRobotInstanceResponseBodyConfig config;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20B3A1B6-4BD2-5DE6-BCBC-098C9B4F4E91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><p><code>Executing</code>: The instance is running.</p>
     * </li>
     * <li><p><code>Finished</code>: The instance has stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The custom user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the AI agent in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>my-robot</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeRtcRobotInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRobotInstanceResponseBody self = new DescribeRtcRobotInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRobotInstanceResponseBody setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeRtcRobotInstanceResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcRobotInstanceResponseBody setConfig(DescribeRtcRobotInstanceResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeRtcRobotInstanceResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeRtcRobotInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcRobotInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRtcRobotInstanceResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public DescribeRtcRobotInstanceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class DescribeRtcRobotInstanceResponseBodyConfig extends TeaModel {
        /**
         * <p>Specifies whether to allow voice interruption.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>The welcome message.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>The voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        public static DescribeRtcRobotInstanceResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcRobotInstanceResponseBodyConfig self = new DescribeRtcRobotInstanceResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeRtcRobotInstanceResponseBodyConfig setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public DescribeRtcRobotInstanceResponseBodyConfig setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public DescribeRtcRobotInstanceResponseBodyConfig setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

}
