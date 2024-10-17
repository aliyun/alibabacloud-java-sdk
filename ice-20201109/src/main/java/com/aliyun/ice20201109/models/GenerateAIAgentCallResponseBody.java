// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>877ae632caae49b1afc81c2e8194ffb4</p>
     */
    @NameInMap("AIAgentUserId")
    public String AIAgentUserId;

    /**
     * <strong>example:</strong>
     * <p>70f22d5784194938a7e387052f2b3208</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateAIAgentCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAIAgentCallResponseBody self = new GenerateAIAgentCallResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAIAgentCallResponseBody setAIAgentUserId(String AIAgentUserId) {
        this.AIAgentUserId = AIAgentUserId;
        return this;
    }
    public String getAIAgentUserId() {
        return this.AIAgentUserId;
    }

    public GenerateAIAgentCallResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public GenerateAIAgentCallResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateAIAgentCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAIAgentCallResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GenerateAIAgentCallResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
