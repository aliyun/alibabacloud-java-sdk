// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListConversationLogsRequest extends TeaModel {
    @NameInMap("SessionId")
    public String sessionId;

    public static ListConversationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConversationLogsRequest self = new ListConversationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListConversationLogsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
