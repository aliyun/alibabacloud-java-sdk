// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartRtcRobotInstanceShrinkRequest extends TeaModel {
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
    public String configShrink;

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
