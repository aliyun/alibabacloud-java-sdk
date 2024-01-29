// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionResponseBody extends TeaModel {
    @NameInMap("AsrMaxEndSilence")
    public Integer asrMaxEndSilence;

    @NameInMap("Interruptible")
    public Boolean interruptible;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>静默超时时间</p>
     */
    @NameInMap("SilenceReplyTimeout")
    public Integer silenceReplyTimeout;

    @NameInMap("WelcomeMessage")
    public String welcomeMessage;

    public static BeginSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionResponseBody self = new BeginSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public BeginSessionResponseBody setAsrMaxEndSilence(Integer asrMaxEndSilence) {
        this.asrMaxEndSilence = asrMaxEndSilence;
        return this;
    }
    public Integer getAsrMaxEndSilence() {
        return this.asrMaxEndSilence;
    }

    public BeginSessionResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
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
