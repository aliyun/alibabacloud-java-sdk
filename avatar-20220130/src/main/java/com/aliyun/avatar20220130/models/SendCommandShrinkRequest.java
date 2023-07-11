// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendCommandShrinkRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public String contentShrink;

    @NameInMap("Feedback")
    public Boolean feedback;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UniqueCode")
    public String uniqueCode;

    public static SendCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCommandShrinkRequest self = new SendCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendCommandShrinkRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCommandShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public SendCommandShrinkRequest setFeedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }
    public Boolean getFeedback() {
        return this.feedback;
    }

    public SendCommandShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendCommandShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendCommandShrinkRequest setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

}
