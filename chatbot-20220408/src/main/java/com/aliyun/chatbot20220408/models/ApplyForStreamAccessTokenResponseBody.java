// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ApplyForStreamAccessTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>63ba97b4f18a4a04f715c81e8e643938</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>cc9e88c0-4f41-4f1d-a1a9-91a72d2aa27d</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>736994BD-AA35-4742-88C9-E64BE4BAA14B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>cc9e88c0-4f41-4f1d-a1a9-91a72d2aa27d</p>
     */
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
