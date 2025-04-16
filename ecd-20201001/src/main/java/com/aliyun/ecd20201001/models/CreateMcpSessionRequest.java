// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class CreateMcpSessionRequest extends TeaModel {
    @NameInMap("Authorization")
    public String authorization;

    @NameInMap("ExternalUserId")
    public String externalUserId;

    @NameInMap("SessionId")
    public String sessionId;

    public static CreateMcpSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpSessionRequest self = new CreateMcpSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpSessionRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateMcpSessionRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public CreateMcpSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
