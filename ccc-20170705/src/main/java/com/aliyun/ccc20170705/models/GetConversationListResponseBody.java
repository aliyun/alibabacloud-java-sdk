// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConversationListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Conversations")
    public java.util.List<GetConversationListResponseBodyConversations> conversations;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetConversationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversationListResponseBody self = new GetConversationListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversationListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConversationListResponseBody setConversations(java.util.List<GetConversationListResponseBodyConversations> conversations) {
        this.conversations = conversations;
        return this;
    }
    public java.util.List<GetConversationListResponseBodyConversations> getConversations() {
        return this.conversations;
    }

    public GetConversationListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConversationListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConversationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConversationListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConversationListResponseBodyConversationsSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryName")
        public String summaryName;

        public static GetConversationListResponseBodyConversationsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetConversationListResponseBodyConversationsSummary self = new GetConversationListResponseBodyConversationsSummary();
            return TeaModel.build(map, self);
        }

        public GetConversationListResponseBodyConversationsSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetConversationListResponseBodyConversationsSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetConversationListResponseBodyConversationsSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

    }

    public static class GetConversationListResponseBodyConversations extends TeaModel {
        @NameInMap("Script")
        public String script;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Summary")
        public java.util.List<GetConversationListResponseBodyConversationsSummary> summary;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetConversationListResponseBodyConversations build(java.util.Map<String, ?> map) throws Exception {
            GetConversationListResponseBodyConversations self = new GetConversationListResponseBodyConversations();
            return TeaModel.build(map, self);
        }

        public GetConversationListResponseBodyConversations setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetConversationListResponseBodyConversations setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetConversationListResponseBodyConversations setSummary(java.util.List<GetConversationListResponseBodyConversationsSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetConversationListResponseBodyConversationsSummary> getSummary() {
            return this.summary;
        }

        public GetConversationListResponseBodyConversations setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
