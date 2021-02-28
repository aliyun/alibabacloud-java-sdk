// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    @NameInMap("Messages")
    public java.util.List<ChatResponseBodyMessages> messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("MessageId")
    public String messageId;

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setMessages(java.util.List<ChatResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ChatResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public ChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ChatResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public static class ChatResponseBodyMessagesKnowledgeRelatedKnowledges extends TeaModel {
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        @NameInMap("Title")
        public String title;

        public static ChatResponseBodyMessagesKnowledgeRelatedKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesKnowledgeRelatedKnowledges self = new ChatResponseBodyMessagesKnowledgeRelatedKnowledges();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesKnowledgeRelatedKnowledges setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public ChatResponseBodyMessagesKnowledgeRelatedKnowledges setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ChatResponseBodyMessagesKnowledge extends TeaModel {
        @NameInMap("HitStatement")
        public String hitStatement;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("RelatedKnowledges")
        public java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        @NameInMap("Category")
        public String category;

        @NameInMap("Title")
        public String title;

        @NameInMap("Content")
        public String content;

        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("Id")
        public String id;

        public static ChatResponseBodyMessagesKnowledge build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesKnowledge self = new ChatResponseBodyMessagesKnowledge();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesKnowledge setHitStatement(String hitStatement) {
            this.hitStatement = hitStatement;
            return this;
        }
        public String getHitStatement() {
            return this.hitStatement;
        }

        public ChatResponseBodyMessagesKnowledge setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ChatResponseBodyMessagesKnowledge setRelatedKnowledges(java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> relatedKnowledges) {
            this.relatedKnowledges = relatedKnowledges;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> getRelatedKnowledges() {
            return this.relatedKnowledges;
        }

        public ChatResponseBodyMessagesKnowledge setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ChatResponseBodyMessagesKnowledge setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ChatResponseBodyMessagesKnowledge setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatResponseBodyMessagesKnowledge setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesKnowledge setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ChatResponseBodyMessagesTextSlots extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("Name")
        public String name;

        @NameInMap("IsHit")
        public Boolean isHit;

        public static ChatResponseBodyMessagesTextSlots build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesTextSlots self = new ChatResponseBodyMessagesTextSlots();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesTextSlots setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ChatResponseBodyMessagesTextSlots setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public ChatResponseBodyMessagesTextSlots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChatResponseBodyMessagesTextSlots setIsHit(Boolean isHit) {
            this.isHit = isHit;
            return this;
        }
        public Boolean getIsHit() {
            return this.isHit;
        }

    }

    public static class ChatResponseBodyMessagesText extends TeaModel {
        @NameInMap("HitStatement")
        public String hitStatement;

        @NameInMap("DialogName")
        public String dialogName;

        @NameInMap("ArticleTitle")
        public String articleTitle;

        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("Slots")
        public java.util.List<ChatResponseBodyMessagesTextSlots> slots;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ExternalFlags")
        public java.util.Map<String, ?> externalFlags;

        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("UserDefinedChatTitle")
        public String userDefinedChatTitle;

        @NameInMap("Content")
        public String content;

        @NameInMap("NodeId")
        public String nodeId;

        public static ChatResponseBodyMessagesText build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesText self = new ChatResponseBodyMessagesText();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesText setHitStatement(String hitStatement) {
            this.hitStatement = hitStatement;
            return this;
        }
        public String getHitStatement() {
            return this.hitStatement;
        }

        public ChatResponseBodyMessagesText setDialogName(String dialogName) {
            this.dialogName = dialogName;
            return this;
        }
        public String getDialogName() {
            return this.dialogName;
        }

        public ChatResponseBodyMessagesText setArticleTitle(String articleTitle) {
            this.articleTitle = articleTitle;
            return this;
        }
        public String getArticleTitle() {
            return this.articleTitle;
        }

        public ChatResponseBodyMessagesText setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesText setSlots(java.util.List<ChatResponseBodyMessagesTextSlots> slots) {
            this.slots = slots;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesTextSlots> getSlots() {
            return this.slots;
        }

        public ChatResponseBodyMessagesText setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public ChatResponseBodyMessagesText setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public ChatResponseBodyMessagesText setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ChatResponseBodyMessagesText setExternalFlags(java.util.Map<String, ?> externalFlags) {
            this.externalFlags = externalFlags;
            return this;
        }
        public java.util.Map<String, ?> getExternalFlags() {
            return this.externalFlags;
        }

        public ChatResponseBodyMessagesText setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public ChatResponseBodyMessagesText setUserDefinedChatTitle(String userDefinedChatTitle) {
            this.userDefinedChatTitle = userDefinedChatTitle;
            return this;
        }
        public String getUserDefinedChatTitle() {
            return this.userDefinedChatTitle;
        }

        public ChatResponseBodyMessagesText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatResponseBodyMessagesText setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ChatResponseBodyMessagesRecommends extends TeaModel {
        @NameInMap("Summary")
        public String summary;

        @NameInMap("KnowledgeId")
        public String knowledgeId;

        @NameInMap("Category")
        public String category;

        @NameInMap("Title")
        public String title;

        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("Content")
        public String content;

        public static ChatResponseBodyMessagesRecommends build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesRecommends self = new ChatResponseBodyMessagesRecommends();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesRecommends setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ChatResponseBodyMessagesRecommends setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public ChatResponseBodyMessagesRecommends setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ChatResponseBodyMessagesRecommends setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ChatResponseBodyMessagesRecommends setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesRecommends setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ChatResponseBodyMessages extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Knowledge")
        public ChatResponseBodyMessagesKnowledge knowledge;

        @NameInMap("Text")
        public ChatResponseBodyMessagesText text;

        @NameInMap("Recommends")
        public java.util.List<ChatResponseBodyMessagesRecommends> recommends;

        public static ChatResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessages self = new ChatResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatResponseBodyMessages setKnowledge(ChatResponseBodyMessagesKnowledge knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public ChatResponseBodyMessagesKnowledge getKnowledge() {
            return this.knowledge;
        }

        public ChatResponseBodyMessages setText(ChatResponseBodyMessagesText text) {
            this.text = text;
            return this;
        }
        public ChatResponseBodyMessagesText getText() {
            return this.text;
        }

        public ChatResponseBodyMessages setRecommends(java.util.List<ChatResponseBodyMessagesRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesRecommends> getRecommends() {
            return this.recommends;
        }

    }

}
