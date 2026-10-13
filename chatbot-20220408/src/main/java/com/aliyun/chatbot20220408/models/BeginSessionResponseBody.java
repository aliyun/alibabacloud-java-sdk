// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionResponseBody extends TeaModel {
    /**
     * <p>The Automatic Speech Recognition (ASR) end-of-speech detection time. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>700</p>
     */
    @NameInMap("AsrMaxEndSilence")
    public Integer asrMaxEndSilence;

    /**
     * <p>Indicates whether the voice broadcast can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>149C7528-C104-1B50-A4F9-0C5907A8AD9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The silence timeout period. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SilenceReplyTimeout")
    public Integer silenceReplyTimeout;

    /**
     * <p>The welcome message.</p>
     * 
     * <strong>example:</strong>
     * <p>The intelligent chatbot is at your service. How can I help you?</p>
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
