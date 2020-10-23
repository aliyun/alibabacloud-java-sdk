// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_smart_call20201021.models;

import com.aliyun.tea.*;

public class InteractVoiceRequest extends TeaModel {
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

    public static InteractVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractVoiceRequest self = new InteractVoiceRequest();
        return TeaModel.build(map, self);
    }

    public InteractVoiceRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public InteractVoiceRequest setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public Long getCurrentTime() {
        return this.currentTime;
    }

    public InteractVoiceRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public InteractVoiceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public InteractVoiceRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}
