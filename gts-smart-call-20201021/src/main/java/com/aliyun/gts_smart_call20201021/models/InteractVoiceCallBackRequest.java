// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_smart_call20201021.models;

import com.aliyun.tea.*;

public class InteractVoiceCallBackRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("CurrentTime")
    public Long currentTime;

    @NameInMap("ContentType")
    @Validation(required = true)
    public String contentType;

    @NameInMap("Content")
    public String content;

    @NameInMap("SecretKey")
    public String secretKey;

    public static InteractVoiceCallBackRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractVoiceCallBackRequest self = new InteractVoiceCallBackRequest();
        return TeaModel.build(map, self);
    }

    public InteractVoiceCallBackRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public InteractVoiceCallBackRequest setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public Long getCurrentTime() {
        return this.currentTime;
    }

    public InteractVoiceCallBackRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public InteractVoiceCallBackRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public InteractVoiceCallBackRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}
