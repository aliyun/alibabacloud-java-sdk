// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    // 本条会话应答消息的ID
    @NameInMap("MessageId")
    public String messageId;

    // 消息的列表
    @NameInMap("Messages")
    public java.util.List<ChatResponseBodyMessages> messages;

    // query的分词结果，可能为空
    @NameInMap("QuerySegList")
    public java.util.List<String> querySegList;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 本次会话的ID
    @NameInMap("SessionId")
    public String sessionId;

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

    public ChatResponseBody setQuerySegList(java.util.List<String> querySegList) {
        this.querySegList = querySegList;
        return this;
    }
    public java.util.List<String> getQuerySegList() {
        return this.querySegList;
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

    public static class ChatResponseBodyMessagesCardList extends TeaModel {
        // 区分答案类型：cardAnswer
        @NameInMap("AnswerSource")
        public String answerSource;

        // 消息类型：card
        @NameInMap("MsgType")
        public String msgType;

        // 平台类型：beebot
        @NameInMap("Platform")
        public String platform;

        public static ChatResponseBodyMessagesCardList build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyMessagesCardList self = new ChatResponseBodyMessagesCardList();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyMessagesCardList setAnswerSource(String answerSource) {
            this.answerSource = answerSource;
            return this;
        }
        public String getAnswerSource() {
            return this.answerSource;
        }

        public ChatResponseBodyMessagesCardList setMsgType(String msgType) {
            this.msgType = msgType;
            return this;
        }
        public String getMsgType() {
            return this.msgType;
        }

        public ChatResponseBodyMessagesCardList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

    public static class ChatResponseBodyMessagesKnowledgeRelatedKnowledges extends TeaModel {
        // 知识关联知识的ID
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        // 知识的关联知识的标题
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
        // 区分答案类型。
        // KnowledgeBase:知识库条；
        @NameInMap("AnswerSource")
        public String answerSource;

        // 知识类目
        @NameInMap("Category")
        public String category;

        // 命中问题的内容
        @NameInMap("Content")
        public String content;

        // 纯文本/富文本答案的标示
        @NameInMap("ContentType")
        public String contentType;

        // 命中语句
        @NameInMap("HitStatement")
        public String hitStatement;

        // 命中问题在知识库中的ID
        @NameInMap("Id")
        public String id;

        // 关联知识列表
        @NameInMap("RelatedKnowledges")
        public java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        // 分数
        @NameInMap("Score")
        public Double score;

        // 命中问题的简介
        @NameInMap("Summary")
        public String summary;

        // 命中问题的标题
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
        // 澄清来源的标识
        @NameInMap("AnswerSource")
        public String answerSource;

        // 澄清的知识id
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        // 推荐内容的分数，当AnswerSource为KNOWLEDGE时，此字段有值
        @NameInMap("Score")
        public Double score;

        // 澄清内容，可能是
        // 图谱问答的实体、
        // 知识问答的知识标题、
        // 表格问答的列值
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
        @NameInMap("Hit")
        public Boolean hit;

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

        public ChatResponseBodyMessagesTextSlots setHit(Boolean hit) {
            this.hit = hit;
            return this;
        }
        public Boolean getHit() {
            return this.hit;
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
        // 区分答案类型
        @NameInMap("AnswerSource")
        public String answerSource;

        // 当AnswerSource为MACHINE_READ时，此字段返回命中文章标题
        @NameInMap("ArticleTitle")
        public String articleTitle;

        // 指令参数，如转人工指令的转人工技能组
        @NameInMap("Commands")
        public java.util.Map<String, ?> commands;

        // 文本消息的内容
        @NameInMap("Content")
        public String content;

        // 纯文本/富文本答案的标示
        @NameInMap("ContentType")
        public String contentType;

        // 当AnswerSource为BotFramework时，此字段返回对话单元名称
        @NameInMap("DialogName")
        public String dialogName;

        // 此字段返回透传参数
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        // 当AnswerSource为BotFramework时，此字段返回透传参数
        @NameInMap("ExternalFlags")
        public java.util.Map<String, ?> externalFlags;

        // 命中语句
        @NameInMap("HitStatement")
        public String hitStatement;

        // 当AnswerSource为BotFramework时，此字段返回意图名称
        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("MetaData")
        public String metaData;

        // 当AnswerSource为BotFramework时，此字段返回节点Id
        @NameInMap("NodeId")
        public String nodeId;

        // 当AnswerSource为BotFramework时，此字段返回节点名称
        @NameInMap("NodeName")
        public String nodeName;

        // 分数
        @NameInMap("Score")
        public Double score;

        // 当AnswerSource为BotFramework时，此字段返回专有名词列表
        @NameInMap("Slots")
        public java.util.List<ChatResponseBodyMessagesTextSlots> slots;

        // 自定义闲聊主题title
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

    public static class ChatResponseBodyMessages extends TeaModel {
        // 当AnswerType为Recommend时，此字段表示推荐的答案来源
        @NameInMap("AnswerSource")
        public String answerSource;

        // 本条消息的类型
        @NameInMap("AnswerType")
        public String answerType;

        // 当AnswerType为CardAnswer时，此字段包含机器人返回的Card的列表
        @NameInMap("CardList")
        public java.util.List<ChatResponseBodyMessagesCardList> cardList;

        // 当AnswerType为Knowledge时，此字段包含机器人返回的Knowledge对象
        @NameInMap("Knowledge")
        public ChatResponseBodyMessagesKnowledge knowledge;

        // 当AnswerType为Recommend时，此字段包含机器人返回的Recommend的列表
        @NameInMap("Recommends")
        public java.util.List<ChatResponseBodyMessagesRecommends> recommends;

        // 当AnswerType为Text时，此字段包含机器人返回的Text对象
        @NameInMap("Text")
        public ChatResponseBodyMessagesText text;

        // 当AnswerType为Recommend时，此字段表示推荐或者反问的标题话术
        @NameInMap("Title")
        public String title;

        // 当AnswerType为Recommend时，并且问答的机器人为语音机器人，此字段表示列表型答案在语音场景渲染之后的答案内容
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

        public ChatResponseBodyMessages setCardList(java.util.List<ChatResponseBodyMessagesCardList> cardList) {
            this.cardList = cardList;
            return this;
        }
        public java.util.List<ChatResponseBodyMessagesCardList> getCardList() {
            return this.cardList;
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

        public ChatResponseBodyMessages setVoiceTitle(String voiceTitle) {
            this.voiceTitle = voiceTitle;
            return this;
        }
        public String getVoiceTitle() {
            return this.voiceTitle;
        }

    }

}
