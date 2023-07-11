// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendCommandRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("Feedback")
    public Boolean feedback;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UniqueCode")
    public String uniqueCode;

    public static SendCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCommandRequest self = new SendCommandRequest();
        return TeaModel.build(map, self);
    }

    public SendCommandRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCommandRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public SendCommandRequest setFeedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }
    public Boolean getFeedback() {
        return this.feedback;
    }

    public SendCommandRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendCommandRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendCommandRequest setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

}
