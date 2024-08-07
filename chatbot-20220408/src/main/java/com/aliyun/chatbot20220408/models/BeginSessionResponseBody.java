// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionResponseBody extends TeaModel {
    @NameInMap("AsrMaxEndSilence")
    public Integer asrMaxEndSilence;

    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <strong>example:</strong>
     * <p>149C7528-C104-1B50-A4F9-0C5907A8AD9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>静默超时时间</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SilenceReplyTimeout")
    public Integer silenceReplyTimeout;

    /**
     * <strong>example:</strong>
     * <p>智能对话机器人为您服务，请问有什么可以帮您？</p>
     */
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
