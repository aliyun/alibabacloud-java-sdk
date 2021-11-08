// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListConversationLogsResponseBody extends TeaModel {
    @NameInMap("ChatLogs")
    public java.util.List<java.util.Map<String, ?>> chatLogs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rounds")
    public Long rounds;

    public static ListConversationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConversationLogsResponseBody self = new ListConversationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConversationLogsResponseBody setChatLogs(java.util.List<java.util.Map<String, ?>> chatLogs) {
        this.chatLogs = chatLogs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getChatLogs() {
        return this.chatLogs;
    }

    public ListConversationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConversationLogsResponseBody setRounds(Long rounds) {
        this.rounds = rounds;
        return this;
    }
    public Long getRounds() {
        return this.rounds;
    }

}
