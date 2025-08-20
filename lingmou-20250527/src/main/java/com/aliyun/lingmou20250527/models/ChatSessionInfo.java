// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ChatSessionInfo extends TeaModel {
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("mainAccountId")
    public Long mainAccountId;

    @NameInMap("sessionId")
    public String sessionId;

    public static ChatSessionInfo build(java.util.Map<String, ?> map) throws Exception {
        ChatSessionInfo self = new ChatSessionInfo();
        return TeaModel.build(map, self);
    }

    public ChatSessionInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ChatSessionInfo setMainAccountId(Long mainAccountId) {
        this.mainAccountId = mainAccountId;
        return this;
    }
    public Long getMainAccountId() {
        return this.mainAccountId;
    }

    public ChatSessionInfo setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
