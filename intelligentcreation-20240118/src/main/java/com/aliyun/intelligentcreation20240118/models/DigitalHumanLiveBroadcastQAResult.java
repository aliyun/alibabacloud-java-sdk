// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DigitalHumanLiveBroadcastQAResult extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("success")
    public Boolean success;

    public static DigitalHumanLiveBroadcastQAResult build(java.util.Map<String, ?> map) throws Exception {
        DigitalHumanLiveBroadcastQAResult self = new DigitalHumanLiveBroadcastQAResult();
        return TeaModel.build(map, self);
    }

    public DigitalHumanLiveBroadcastQAResult setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DigitalHumanLiveBroadcastQAResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DigitalHumanLiveBroadcastQAResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DigitalHumanLiveBroadcastQAResult setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DigitalHumanLiveBroadcastQAResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
