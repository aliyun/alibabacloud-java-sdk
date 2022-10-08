// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BeeBotChatResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BeeBotChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeeBotChatResponseBody self = new BeeBotChatResponseBody();
        return TeaModel.build(map, self);
    }

    public BeeBotChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BeeBotChatResponseBody setData(BeeBotChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BeeBotChatResponseBodyData getData() {
        return this.data;
    }

    public BeeBotChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BeeBotChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges extends TeaModel {
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        @NameInMap("Title")
        public String title;

        public static BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges self = new BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class BeeBotChatResponseBodyDataMessagesKnowledge extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("HitStatement")
        public String hitStatement;

        @NameInMap("Id")
        public String id;

        @NameInMap("RelatedKnowledges")
        public java.util.List<BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        public static BeeBotChatResponseBodyDataMessagesKnowledge build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyDataMessagesKnowledge self = new BeeBotChatResponseBodyDataMessagesKnowledge();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setHitStatement(String hitStatement) {
            this.hitStatement = hitStatement;
            return this;
        }
        public String getHitStatement() {
            return this.hitStatement;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setRelatedKnowledges(java.util.List<BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges> relatedKnowledges) {
            this.relatedKnowledges = relatedKnowledges;
            return this;
        }
        public java.util.List<BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges> getRelatedKnowledges() {
            return this.relatedKnowledges;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public BeeBotChatResponseBodyDataMessagesKnowledge setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class BeeBotChatResponseBodyDataMessagesRecommends extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("KnowledgeId")
        public String knowledgeId;

        @NameInMap("Title")
        public String title;

        public static BeeBotChatResponseBodyDataMessagesRecommends build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyDataMessagesRecommends self = new BeeBotChatResponseBodyDataMessagesRecommends();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyDataMessagesRecommends setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public BeeBotChatResponseBodyDataMessagesRecommends setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public BeeBotChatResponseBodyDataMessagesRecommends setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class BeeBotChatResponseBodyDataMessagesTextSlots extends TeaModel {
        @NameInMap("Hit")
        public Boolean hit;

        @NameInMap("Name")
        public String name;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("Value")
        public String value;

        public static BeeBotChatResponseBodyDataMessagesTextSlots build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyDataMessagesTextSlots self = new BeeBotChatResponseBodyDataMessagesTextSlots();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyDataMessagesTextSlots setHit(Boolean hit) {
            this.hit = hit;
            return this;
        }
        public Boolean getHit() {
            return this.hit;
        }

        public BeeBotChatResponseBodyDataMessagesTextSlots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BeeBotChatResponseBodyDataMessagesTextSlots setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public BeeBotChatResponseBodyDataMessagesTextSlots setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BeeBotChatResponseBodyDataMessagesText extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("DialogName")
        public String dialogName;

        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("ExternalFlags")
        public java.util.Map<String, ?> externalFlags;

        @NameInMap("HitStatement")
        public String hitStatement;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Slots")
        public java.util.List<BeeBotChatResponseBodyDataMessagesTextSlots> slots;

        @NameInMap("UserDefinedChatTitle")
        public String userDefinedChatTitle;

        public static BeeBotChatResponseBodyDataMessagesText build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyDataMessagesText self = new BeeBotChatResponseBodyDataMessagesText();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyDataMessagesText setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public BeeBotChatResponseBodyDataMessagesText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BeeBotChatResponseBodyDataMessagesText setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public BeeBotChatResponseBodyDataMessagesText setDialogName(String dialogName) {
            this.dialogName = dialogName;
            return this;
        }
        public String getDialogName() {
            return this.dialogName;
        }

        public BeeBotChatResponseBodyDataMessagesText setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public BeeBotChatResponseBodyDataMessagesText setExternalFlags(java.util.Map<String, ?> externalFlags) {
            this.externalFlags = externalFlags;
            return this;
        }
        public java.util.Map<String, ?> getExternalFlags() {
            return this.externalFlags;
        }

        public BeeBotChatResponseBodyDataMessagesText setHitStatement(String hitStatement) {
            this.hitStatement = hitStatement;
            return this;
        }
        public String getHitStatement() {
            return this.hitStatement;
        }

        public BeeBotChatResponseBodyDataMessagesText setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public BeeBotChatResponseBodyDataMessagesText setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public BeeBotChatResponseBodyDataMessagesText setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public BeeBotChatResponseBodyDataMessagesText setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public BeeBotChatResponseBodyDataMessagesText setSlots(java.util.List<BeeBotChatResponseBodyDataMessagesTextSlots> slots) {
            this.slots = slots;
            return this;
        }
        public java.util.List<BeeBotChatResponseBodyDataMessagesTextSlots> getSlots() {
            return this.slots;
        }

        public BeeBotChatResponseBodyDataMessagesText setUserDefinedChatTitle(String userDefinedChatTitle) {
            this.userDefinedChatTitle = userDefinedChatTitle;
            return this;
        }
        public String getUserDefinedChatTitle() {
            return this.userDefinedChatTitle;
        }

    }

    public static class BeeBotChatResponseBodyDataMessages extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("AnswerType")
        public String answerType;

        @NameInMap("Knowledge")
        public BeeBotChatResponseBodyDataMessagesKnowledge knowledge;

        @NameInMap("Recommends")
        public java.util.List<BeeBotChatResponseBodyDataMessagesRecommends> recommends;

        @NameInMap("Text")
        public BeeBotChatResponseBodyDataMessagesText text;

        public static BeeBotChatResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyDataMessages self = new BeeBotChatResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyDataMessages setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public BeeBotChatResponseBodyDataMessages setAnswerType(String answerType) {
            this.answerType = answerType;
            return this;
        }
        public String getAnswerType() {
            return this.answerType;
        }

        public BeeBotChatResponseBodyDataMessages setKnowledge(BeeBotChatResponseBodyDataMessagesKnowledge knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public BeeBotChatResponseBodyDataMessagesKnowledge getKnowledge() {
            return this.knowledge;
        }

        public BeeBotChatResponseBodyDataMessages setRecommends(java.util.List<BeeBotChatResponseBodyDataMessagesRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<BeeBotChatResponseBodyDataMessagesRecommends> getRecommends() {
            return this.recommends;
        }

        public BeeBotChatResponseBodyDataMessages setText(BeeBotChatResponseBodyDataMessagesText text) {
            this.text = text;
            return this;
        }
        public BeeBotChatResponseBodyDataMessagesText getText() {
            return this.text;
        }

    }

    public static class BeeBotChatResponseBodyData extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("Messages")
        public java.util.List<BeeBotChatResponseBodyDataMessages> messages;

        @NameInMap("SessionId")
        public String sessionId;

        public static BeeBotChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BeeBotChatResponseBodyData self = new BeeBotChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BeeBotChatResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public BeeBotChatResponseBodyData setMessages(java.util.List<BeeBotChatResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<BeeBotChatResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public BeeBotChatResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
