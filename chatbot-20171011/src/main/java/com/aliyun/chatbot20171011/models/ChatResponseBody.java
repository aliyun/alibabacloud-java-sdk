// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("Messages")
    public java.util.List<ChatResponseBodyMessages> messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Tag")
    public String tag;

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
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

    public ChatResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
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
        public java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        @NameInMap("Score")
        public Double score;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        public static ChatResponseBodyMessagesKnowledge build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesKnowledge self = new ChatResponseBodyMessagesKnowledge();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesKnowledge setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesKnowledge setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ChatResponseBodyMessagesKnowledge setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatResponseBodyMessagesKnowledge setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ChatResponseBodyMessagesKnowledge setHitStatement(String hitStatement) {
            this.hitStatement = hitStatement;
            return this;
        }
        public String getHitStatement() {
            return this.hitStatement;
        }

        public ChatResponseBodyMessagesKnowledge setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatResponseBodyMessagesKnowledge setRelatedKnowledges(java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> relatedKnowledges) {
            this.relatedKnowledges = relatedKnowledges;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> getRelatedKnowledges() {
            return this.relatedKnowledges;
        }

        public ChatResponseBodyMessagesKnowledge setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ChatResponseBodyMessagesKnowledge setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ChatResponseBodyMessagesKnowledge setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ChatResponseBodyMessagesRecommends extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("KnowledgeId")
        public String knowledgeId;

        @NameInMap("Score")
        public Double score;

        @NameInMap("Title")
        public String title;

        public static ChatResponseBodyMessagesRecommends build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesRecommends self = new ChatResponseBodyMessagesRecommends();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesRecommends setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesRecommends setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public ChatResponseBodyMessagesRecommends setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ChatResponseBodyMessagesRecommends setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ChatResponseBodyMessagesTextSlots extends TeaModel {
        @NameInMap("IsHit")
        public Boolean isHit;

        @NameInMap("Name")
        public String name;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("Value")
        public String value;

        public static ChatResponseBodyMessagesTextSlots build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesTextSlots self = new ChatResponseBodyMessagesTextSlots();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesTextSlots setIsHit(Boolean isHit) {
            this.isHit = isHit;
            return this;
        }
        public Boolean getIsHit() {
            return this.isHit;
        }

        public ChatResponseBodyMessagesTextSlots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChatResponseBodyMessagesTextSlots setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public ChatResponseBodyMessagesTextSlots setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ChatResponseBodyMessagesText extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("ArticleTitle")
        public String articleTitle;

        @NameInMap("Commands")
        public java.util.Map<String, ?> commands;

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

        @NameInMap("Score")
        public Double score;

        @NameInMap("Slots")
        public java.util.List<ChatResponseBodyMessagesTextSlots> slots;

        @NameInMap("UserDefinedChatTitle")
        public String userDefinedChatTitle;

        public static ChatResponseBodyMessagesText build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesText self = new ChatResponseBodyMessagesText();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesText setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesText setArticleTitle(String articleTitle) {
            this.articleTitle = articleTitle;
            return this;
        }
        public String getArticleTitle() {
            return this.articleTitle;
        }

        public ChatResponseBodyMessagesText setCommands(java.util.Map<String, ?> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.Map<String, ?> getCommands() {
            return this.commands;
        }

        public ChatResponseBodyMessagesText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatResponseBodyMessagesText setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ChatResponseBodyMessagesText setDialogName(String dialogName) {
            this.dialogName = dialogName;
            return this;
        }
        public String getDialogName() {
            return this.dialogName;
        }

        public ChatResponseBodyMessagesText setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public ChatResponseBodyMessagesText setExternalFlags(java.util.Map<String, ?> externalFlags) {
            this.externalFlags = externalFlags;
            return this;
        }
        public java.util.Map<String, ?> getExternalFlags() {
            return this.externalFlags;
        }

        public ChatResponseBodyMessagesText setHitStatement(String hitStatement) {
            this.hitStatement = hitStatement;
            return this;
        }
        public String getHitStatement() {
            return this.hitStatement;
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

        public ChatResponseBodyMessagesText setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ChatResponseBodyMessagesText setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ChatResponseBodyMessagesText setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ChatResponseBodyMessagesText setSlots(java.util.List<ChatResponseBodyMessagesTextSlots> slots) {
            this.slots = slots;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesTextSlots> getSlots() {
            return this.slots;
        }

        public ChatResponseBodyMessagesText setUserDefinedChatTitle(String userDefinedChatTitle) {
            this.userDefinedChatTitle = userDefinedChatTitle;
            return this;
        }
        public String getUserDefinedChatTitle() {
            return this.userDefinedChatTitle;
        }

    }

    public static class ChatResponseBodyMessagesVoiceStrategy extends TeaModel {
        @NameInMap("AsrMaxEndSilence")
        public String asrMaxEndSilence;

        @NameInMap("CollectNumber")
        public Boolean collectNumber;

        @NameInMap("HangUp")
        public Boolean hangUp;

        @NameInMap("Interruptible")
        public Boolean interruptible;

        @NameInMap("MaxDigits")
        public Long maxDigits;

        @NameInMap("ReplyTimeout")
        public Long replyTimeout;

        @NameInMap("Terminator")
        public String terminator;

        public static ChatResponseBodyMessagesVoiceStrategy build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesVoiceStrategy self = new ChatResponseBodyMessagesVoiceStrategy();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesVoiceStrategy setAsrMaxEndSilence(String asrMaxEndSilence) {
            this.asrMaxEndSilence = asrMaxEndSilence;
            return this;
        }
        public String getAsrMaxEndSilence() {
            return this.asrMaxEndSilence;
        }

        public ChatResponseBodyMessagesVoiceStrategy setCollectNumber(Boolean collectNumber) {
            this.collectNumber = collectNumber;
            return this;
        }
        public Boolean getCollectNumber() {
            return this.collectNumber;
        }

        public ChatResponseBodyMessagesVoiceStrategy setHangUp(Boolean hangUp) {
            this.hangUp = hangUp;
            return this;
        }
        public Boolean getHangUp() {
            return this.hangUp;
        }

        public ChatResponseBodyMessagesVoiceStrategy setInterruptible(Boolean interruptible) {
            this.interruptible = interruptible;
            return this;
        }
        public Boolean getInterruptible() {
            return this.interruptible;
        }

        public ChatResponseBodyMessagesVoiceStrategy setMaxDigits(Long maxDigits) {
            this.maxDigits = maxDigits;
            return this;
        }
        public Long getMaxDigits() {
            return this.maxDigits;
        }

        public ChatResponseBodyMessagesVoiceStrategy setReplyTimeout(Long replyTimeout) {
            this.replyTimeout = replyTimeout;
            return this;
        }
        public Long getReplyTimeout() {
            return this.replyTimeout;
        }

        public ChatResponseBodyMessagesVoiceStrategy setTerminator(String terminator) {
            this.terminator = terminator;
            return this;
        }
        public String getTerminator() {
            return this.terminator;
        }

    }

    public static class ChatResponseBodyMessages extends TeaModel {
        @NameInMap("AnswerSource")
        public String answerSource;

        @NameInMap("AnswerType")
        public String answerType;

        @NameInMap("Knowledge")
        public ChatResponseBodyMessagesKnowledge knowledge;

        @NameInMap("Recommends")
        public java.util.List<ChatResponseBodyMessagesRecommends> recommends;

        @NameInMap("Text")
        public ChatResponseBodyMessagesText text;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("VoiceStrategy")
        public ChatResponseBodyMessagesVoiceStrategy voiceStrategy;

        @NameInMap("VoiceTitle")
        public String voiceTitle;

        public static ChatResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessages self = new ChatResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessages setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessages setAnswerType(String answerType) {
            this.answerType = answerType;
            return this;
        }
        public String getAnswerType() {
            return this.answerType;
        }

        public ChatResponseBodyMessages setKnowledge(ChatResponseBodyMessagesKnowledge knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public ChatResponseBodyMessagesKnowledge getKnowledge() {
            return this.knowledge;
        }

        public ChatResponseBodyMessages setRecommends(java.util.List<ChatResponseBodyMessagesRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesRecommends> getRecommends() {
            return this.recommends;
        }

        public ChatResponseBodyMessages setText(ChatResponseBodyMessagesText text) {
            this.text = text;
            return this;
        }
        public ChatResponseBodyMessagesText getText() {
            return this.text;
        }

        public ChatResponseBodyMessages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ChatResponseBodyMessages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatResponseBodyMessages setVoiceStrategy(ChatResponseBodyMessagesVoiceStrategy voiceStrategy) {
            this.voiceStrategy = voiceStrategy;
            return this;
        }
        public ChatResponseBodyMessagesVoiceStrategy getVoiceStrategy() {
            return this.voiceStrategy;
        }

        public ChatResponseBodyMessages setVoiceTitle(String voiceTitle) {
            this.voiceTitle = voiceTitle;
            return this;
        }
        public String getVoiceTitle() {
            return this.voiceTitle;
        }

    }

}
