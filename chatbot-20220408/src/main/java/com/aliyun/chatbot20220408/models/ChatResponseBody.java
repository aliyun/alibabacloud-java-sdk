// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <p>The ID of the response message in the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>A2315C4B-A872-5DEE-9DAD-D73B194A4AEC</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The list of messages.</p>
     */
    @NameInMap("Messages")
    public java.util.List<ChatResponseBodyMessages> messages;

    /**
     * <p>The tokenization results of the query, which may be empty.</p>
     */
    @NameInMap("QuerySegList")
    public java.util.List<String> querySegList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A2315C4B-A872-5DEE-9DAD-D73B194A4AEC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>a6f216a0685c4c8baa0e8beb6d5ec6db</p>
     */
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

    public static class ChatResponseBodyMessagesKnowledgeRelatedKnowledges extends TeaModel {
        /**
         * <p>The ID of the related knowledge entry.</p>
         * 
         * <strong>example:</strong>
         * <p>735899</p>
         */
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        /**
         * <p>The title of the related knowledge entry.</p>
         * 
         * <strong>example:</strong>
         * <p>公积金查询</p>
         */
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
        /**
         * <p>Distinguishes the answer type.
         * KnowledgeBase: knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeBase</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>The knowledge category.</p>
         * 
         * <strong>example:</strong>
         * <p>公积金</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The content of the hit question.</p>
         * 
         * <strong>example:</strong>
         * <p>公积金提取，请在首页搜索公积金提取，提交办事的表单</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The indicator of whether the answer is plain text or rich text.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAIN_TEXT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The hit statement.</p>
         * 
         * <strong>example:</strong>
         * <p>公积金</p>
         */
        @NameInMap("HitStatement")
        public String hitStatement;

        /**
         * <p>The ID of the hit question in the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>735898</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The list of related knowledge entries.</p>
         */
        @NameInMap("RelatedKnowledges")
        public java.util.List<ChatResponseBodyMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.998</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The summary of the hit question.</p>
         * 
         * <strong>example:</strong>
         * <p>公积金提取</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The title of the hit question.</p>
         * 
         * <strong>example:</strong>
         * <p>公积金提取</p>
         */
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
        /**
         * <p>The identifier of the clarification source.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>The knowledge ID for clarification.</p>
         * 
         * <strong>example:</strong>
         * <p>4548</p>
         */
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        /**
         * <p>The score of the recommended content. This field has a value when AnswerSource is KNOWLEDGE.</p>
         * 
         * <strong>example:</strong>
         * <p>0.46</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The clarification content, which can be an entity from knowledge graph Q&amp;A, a knowledge title from knowledge-based Q&amp;A, or a column value from table-based Q&amp;A.</p>
         * 
         * <strong>example:</strong>
         * <p>Test plain text</p>
         */
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
        /**
         * <p>Indicates whether the slot is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Hit")
        public Boolean hit;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckWeatherIntent.city</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The original value.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The specific value.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
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
        /**
         * <p>Distinguishes the answer type.</p>
         * 
         * <strong>example:</strong>
         * <p>BotFramework</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>When AnswerSource is MACHINE_READ, this field returns the title of the hit article.</p>
         * 
         * <strong>example:</strong>
         * <p>ICP Filing 11
         * [responses.200.schema.properties.Messages.items.properties.AnswerSource.enumValueTitles. INTENT_FAQ_CLARIFY]FAQ and dialog flow mixed clarification</p>
         */
        @NameInMap("ArticleTitle")
        public String articleTitle;

        /**
         * <p>The instruction parameters, such as the skill group for a transfer-to-agent instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;sysToAgent&quot;: &quot;{\&quot;skillGroup\&quot;:\&quot;12\&quot;}&quot;
         * }</p>
         */
        @NameInMap("Commands")
        public java.util.Map<String, ?> commands;

        /**
         * <p>The content of the text message.</p>
         * 
         * <strong>example:</strong>
         * <p>Which location do you want to check the weather for?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The indicator of whether the answer is plain text or rich text.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAIN_TEXT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the dialog flow unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample_CheckWeather</p>
         */
        @NameInMap("DialogName")
        public String dialogName;

        /**
         * <p>The pass-through parameters returned in this field.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;MATCHED_INTENT_SOURCE&quot;: &quot;&quot;,
         *     &quot;INTENT_ID&quot;: 724414,
         *     &quot;IntentName&quot;: &quot;CheckWeatherIntent&quot;,
         *     &quot;INTENT_DETAIL&quot;: &quot;[I want|I need to] check the weather&quot;,
         *     &quot;LGF_EXPRESSION&quot;: &quot;[I want|I need to] check the weather&quot;,
         *     &quot;IS_SESSION_FINISHED&quot;: false,
         *     &quot;DsScore&quot;: 100.0,
         *     &quot;DIALOG_ID&quot;: &quot;299034&quot;,
         *     &quot;FINISH_LABEL&quot;: false,
         *     &quot;MODULE_START&quot;: false,
         *     &quot;INTENT_NAME&quot;: &quot;CheckWeatherIntent&quot;,
         *     &quot;INTENT_SOURCE&quot;: &quot;Lgf&quot;,
         *     &quot;DIALOG_NAME&quot;: &quot;Sample_CheckWeather&quot;
         * }</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>The pass-through parameters returned when AnswerSource is BotFramework.</p>
         */
        @NameInMap("ExternalFlags")
        public java.util.Map<String, ?> externalFlags;

        /**
         * <p>The hit statement.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckWeather</p>
         */
        @NameInMap("HitStatement")
        public String hitStatement;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckWeatherIntent</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>[[{&quot;columnName&quot;:&quot;Name&quot;,&quot;stringValue&quot;:&quot;Wang Shanshan&quot;}]]</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>The node ID returned when AnswerSource is BotFramework.</p>
         * 
         * <strong>example:</strong>
         * <p>1410-c7a72a78.__city</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the node name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample_CheckWeather.CheckWeatherSlotFilling.__city</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>When AnswerSource is BotFramework and ResponseType is SSML, this field indicates that a dialog flow interactive slot filling is hit. Otherwise, this field does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>SSML</p>
         */
        @NameInMap("ResponseType")
        public String responseType;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the list of named entities.</p>
         */
        @NameInMap("Slots")
        public java.util.List<ChatResponseBodyMessagesTextSlots> slots;

        /**
         * <p>The title of the custom chitchat topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Greeting</p>
         */
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

        public ChatResponseBodyMessagesText setResponseType(String responseType) {
            this.responseType = responseType;
            return this;
        }
        public String getResponseType() {
            return this.responseType;
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
        /**
         * <p>The source of the recommended answer when AnswerType is Recommend.
         * [_single.resp.200.props.Messages.items.AnswerSource.enum. INTENT_FAQ_CLARIFY]mixed clarification from FAQ and dialog flow</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>The type of this message.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("AnswerType")
        public String answerType;

        /**
         * <p>When AnswerType is Knowledge, this field contains the Knowledge object returned by the chatbot.</p>
         */
        @NameInMap("Knowledge")
        public ChatResponseBodyMessagesKnowledge knowledge;

        /**
         * <p>The list of recommendations returned by the bot when AnswerType is Recommend.</p>
         */
        @NameInMap("Recommends")
        public java.util.List<ChatResponseBodyMessagesRecommends> recommends;

        /**
         * <p>When AnswerType is Text, this field contains the Text object returned by the chatbot.</p>
         */
        @NameInMap("Text")
        public ChatResponseBodyMessagesText text;

        /**
         * <p>The counter-question title in online scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>Which insurance age range are you inquiring about?</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The clarification content in voice scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>Are you asking about provident fund inquiry or provident fund withdrawal?</p>
         */
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

        public ChatResponseBodyMessages setVoiceTitle(String voiceTitle) {
            this.voiceTitle = voiceTitle;
            return this;
        }
        public String getVoiceTitle() {
            return this.voiceTitle;
        }

    }

}
