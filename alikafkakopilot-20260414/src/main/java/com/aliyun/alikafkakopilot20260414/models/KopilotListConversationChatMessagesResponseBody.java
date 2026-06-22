// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationChatMessagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public KopilotListConversationChatMessagesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static KopilotListConversationChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationChatMessagesResponseBody self = new KopilotListConversationChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationChatMessagesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public KopilotListConversationChatMessagesResponseBody setData(KopilotListConversationChatMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KopilotListConversationChatMessagesResponseBodyData getData() {
        return this.data;
    }

    public KopilotListConversationChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotListConversationChatMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class KopilotListConversationChatMessagesResponseBodyDataMessages extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("Role")
        public String role;

        @NameInMap("TurnId")
        public String turnId;

        public static KopilotListConversationChatMessagesResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataMessages self = new KopilotListConversationChatMessagesResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyData extends TeaModel {
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Messages")
        public java.util.List<KopilotListConversationChatMessagesResponseBodyDataMessages> messages;

        @NameInMap("NextBeforeTurnId")
        public Long nextBeforeTurnId;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("TotalTurns")
        public Long totalTurns;

        public static KopilotListConversationChatMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyData self = new KopilotListConversationChatMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public KopilotListConversationChatMessagesResponseBodyData setMessages(java.util.List<KopilotListConversationChatMessagesResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<KopilotListConversationChatMessagesResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public KopilotListConversationChatMessagesResponseBodyData setNextBeforeTurnId(Long nextBeforeTurnId) {
            this.nextBeforeTurnId = nextBeforeTurnId;
            return this;
        }
        public Long getNextBeforeTurnId() {
            return this.nextBeforeTurnId;
        }

        public KopilotListConversationChatMessagesResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public KopilotListConversationChatMessagesResponseBodyData setTotalTurns(Long totalTurns) {
            this.totalTurns = totalTurns;
            return this;
        }
        public Long getTotalTurns() {
            return this.totalTurns;
        }

    }

}
