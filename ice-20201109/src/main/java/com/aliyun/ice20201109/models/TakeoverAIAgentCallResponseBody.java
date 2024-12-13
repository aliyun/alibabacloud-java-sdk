// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class TakeoverAIAgentCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>70f22d5784194938a7e387052f2b3208</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>uid2</p>
     */
    @NameInMap("HumanAgentUserId")
    public String humanAgentUserId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
     */
    @NameInMap("Token")
    public String token;

    public static TakeoverAIAgentCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TakeoverAIAgentCallResponseBody self = new TakeoverAIAgentCallResponseBody();
        return TeaModel.build(map, self);
    }

    public TakeoverAIAgentCallResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public TakeoverAIAgentCallResponseBody setHumanAgentUserId(String humanAgentUserId) {
        this.humanAgentUserId = humanAgentUserId;
        return this;
    }
    public String getHumanAgentUserId() {
        return this.humanAgentUserId;
    }

    public TakeoverAIAgentCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TakeoverAIAgentCallResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
