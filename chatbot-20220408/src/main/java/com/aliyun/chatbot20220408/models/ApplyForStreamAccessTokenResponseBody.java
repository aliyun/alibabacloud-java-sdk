// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ApplyForStreamAccessTokenResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamSecret")
    public String streamSecret;

    public static ApplyForStreamAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyForStreamAccessTokenResponseBody self = new ApplyForStreamAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyForStreamAccessTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ApplyForStreamAccessTokenResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ApplyForStreamAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyForStreamAccessTokenResponseBody setStreamSecret(String streamSecret) {
        this.streamSecret = streamSecret;
        return this;
    }
    public String getStreamSecret() {
        return this.streamSecret;
    }

}
