// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendTextShrinkRequest extends TeaModel {
    @NameInMap("Feedback")
    public Boolean feedback;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("StreamExtension")
    public String streamExtensionShrink;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    @NameInMap("UniqueCode")
    public String uniqueCode;

    public static SendTextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTextShrinkRequest self = new SendTextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendTextShrinkRequest setFeedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }
    public Boolean getFeedback() {
        return this.feedback;
    }

    public SendTextShrinkRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public SendTextShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendTextShrinkRequest setStreamExtensionShrink(String streamExtensionShrink) {
        this.streamExtensionShrink = streamExtensionShrink;
        return this;
    }
    public String getStreamExtensionShrink() {
        return this.streamExtensionShrink;
    }

    public SendTextShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendTextShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SendTextShrinkRequest setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

}
