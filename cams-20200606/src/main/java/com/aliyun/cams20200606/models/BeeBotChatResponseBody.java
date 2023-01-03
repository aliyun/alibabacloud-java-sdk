// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatResponseBody extends TeaModel {
    // If OK is returned, the request is successful.
    @NameInMap("Code")
    public String code;

    // The returned data.
    @NameInMap("Data")
    public BeeBotChatResponseBodyData data;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
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
        // The ID of the related knowledge.
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        // The title of the related knowledge.
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
        // The source of the answer.
        @NameInMap("AnswerSource")
        public String answerSource;

        // The category of the knowledge.
        @NameInMap("Category")
        public String category;

        // The content of the hit question.
        @NameInMap("Content")
        public String content;

        // Indicates whether the answer is in plain text or rich text.
        @NameInMap("ContentType")
        public String contentType;

        // The hit text.
        @NameInMap("HitStatement")
        public String hitStatement;

        // The ID of the hit problem in the knowledge base.
        @NameInMap("Id")
        public String id;

        // The list of the related knowledge.
        @NameInMap("RelatedKnowledges")
        public java.util.List<BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        // The summary to the hit question.
        @NameInMap("Summary")
        public String summary;

        // The title of the hit question.
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
        // The source of the recommended answer.
        @NameInMap("AnswerSource")
        public String answerSource;

        // The ID of the recommended knowledge.
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        // The recommended content, which may be the entity in graph-based question answering, the standard knowledge in knowledge-based question answering, or the column value in table-based question answering.
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
        // Indicates whether the slot is hit.
        @NameInMap("Hit")
        public Boolean hit;

        // The name of the slot.
        @NameInMap("Name")
        public String name;

        // The original value.
        @NameInMap("Origin")
        public String origin;

        // The specific value.
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
        // The source of the answer.
        @NameInMap("AnswerSource")
        public String answerSource;

        // The content of the text message.
        @NameInMap("Content")
        public String content;

        // Indicates whether the answer is in plain text or rich text.
        @NameInMap("ContentType")
        public String contentType;

        // When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
        @NameInMap("DialogName")
        public String dialogName;

        // The passthrough parameters are returned.
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        // When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
        @NameInMap("ExternalFlags")
        public java.util.Map<String, ?> externalFlags;

        // The hit text.
        @NameInMap("HitStatement")
        public String hitStatement;

        // When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
        @NameInMap("IntentName")
        public String intentName;

        // The metadata.
        @NameInMap("MetaData")
        public String metaData;

        // When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
        @NameInMap("NodeId")
        public String nodeId;

        // When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
        @NameInMap("NodeName")
        public String nodeName;

        // The list of slots.
        @NameInMap("Slots")
        public java.util.List<BeeBotChatResponseBodyDataMessagesTextSlots> slots;

        // The title of the chitchat.
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
        // If the AnswerType parameter is set to Recommend, this parameter indicates the source of the recommended answer.
        @NameInMap("AnswerSource")
        public String answerSource;

        // The type of the message.
        @NameInMap("AnswerType")
        public String answerType;

        // When the AnswerType parameter is set to Knowledge, this parameter contains the Knowledge object returned by the bot.
        @NameInMap("Knowledge")
        public BeeBotChatResponseBodyDataMessagesKnowledge knowledge;

        // When the AnswerType parameter is set to Recommend, this parameter contains a list of recommends returned by the bot.
        @NameInMap("Recommends")
        public java.util.List<BeeBotChatResponseBodyDataMessagesRecommends> recommends;

        // When the AnswerType parameter is set to Text, this parameter contains the Text object returned by the bot.
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
        // The ID of the response message.
        @NameInMap("MessageId")
        public String messageId;

        // The list of the message.
        @NameInMap("Messages")
        public java.util.List<BeeBotChatResponseBodyDataMessages> messages;

        // The ID of the session.
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
