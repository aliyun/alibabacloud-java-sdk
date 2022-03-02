// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendMessageShrinkRequest extends TeaModel {
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TextRequest")
    public String textRequestShrink;

    public static SendMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageShrinkRequest self = new SendMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendMessageShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendMessageShrinkRequest setTextRequestShrink(String textRequestShrink) {
        this.textRequestShrink = textRequestShrink;
        return this;
    }
    public String getTextRequestShrink() {
        return this.textRequestShrink;
    }

}
