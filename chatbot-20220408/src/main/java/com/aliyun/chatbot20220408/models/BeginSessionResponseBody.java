// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SilenceReplyTimeout")
    public Integer silenceReplyTimeout;

    @NameInMap("WelcomeMessage")
    public String welcomeMessage;

    public static BeginSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionResponseBody self = new BeginSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public BeginSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BeginSessionResponseBody setSilenceReplyTimeout(Integer silenceReplyTimeout) {
        this.silenceReplyTimeout = silenceReplyTimeout;
        return this;
    }
    public Integer getSilenceReplyTimeout() {
        return this.silenceReplyTimeout;
    }

    public BeginSessionResponseBody setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        return this;
    }
    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

}
