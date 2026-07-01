// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartRtcRobotInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The authentication token required to join the RTC call. You must generate this token using your RTC AppKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <p>The RTC channel\&quot;s unique identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Specifies advanced call configurations that override the agent\&quot;s default configurations. If you omit this parameter, the agent uses its default configurations.</p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>The AI agent\&quot;s unique identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca28b08ad3464ebcb42e5c0f7c6d2e89</p>
     */
    @NameInMap("RobotId")
    public String robotId;

    /**
     * <p>User-defined information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The AI agent\&quot;s unique identifier within the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-robot</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static StartRtcRobotInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRtcRobotInstanceShrinkRequest self = new StartRtcRobotInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartRtcRobotInstanceShrinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRtcRobotInstanceShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRtcRobotInstanceShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public StartRtcRobotInstanceShrinkRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public StartRtcRobotInstanceShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public StartRtcRobotInstanceShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
