// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatResponseBody extends TeaModel {
    /**
     * <p>Access denied for detailed information.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The content of the text message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of the recommended knowledge. When AnswerType is set to Recommend, the list of the recommended knowledge is returned by the bot for this parameter.</p>
     */
    @NameInMap("Data")
    public BeeBotChatResponseBodyData data;

    /**
     * <p>Indicates whether the answer is in plain text or rich text.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The passthrough parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BeeBotChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeeBotChatResponseBody self = new BeeBotChatResponseBody();
        return TeaModel.build(map, self);
    }

    public BeeBotChatResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The ID of knowledge associated with knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>735899</p>
         */
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        /**
         * <p>The title of related knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>Withdrawal of housing provident fund.</p>
         */
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
        /**
         * <p>Distinguish answer types.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeBase</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>Knowledge category.</p>
         * 
         * <strong>example:</strong>
         * <p>provident fund.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Hit the content of the problem.</p>
         * 
         * <strong>example:</strong>
         * <p>Provident fund withdrawal, please search for provident fund withdrawal on the homepage and submit the form for handling the matter.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Indication of plain/rich text answers.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAIN_TEXT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Hit statement.</p>
         * 
         * <strong>example:</strong>
         * <p>provident fund</p>
         */
        @NameInMap("HitStatement")
        public String hitStatement;

        /**
         * <p>The ID of the hit problem in the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>735898</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Related knowledge list.</p>
         */
        @NameInMap("RelatedKnowledges")
        public java.util.List<BeeBotChatResponseBodyDataMessagesKnowledgeRelatedKnowledges> relatedKnowledges;

        /**
         * <p>Introduction to hit problems.</p>
         * 
         * <strong>example:</strong>
         * <p>Withdrawal of housing provident fund</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Hit the title of the problem.</p>
         * 
         * <strong>example:</strong>
         * <p>Withdrawal of housing provident fund.</p>
         */
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
        /**
         * <p>Clarify the identification of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>Clarify the knowledge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4548</p>
         */
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        /**
         * <p>Clarify the content, which may be the entities of graph Q&amp;A, the knowledge titles of knowledge Q&amp;A, or the column values of table Q&amp;A.</p>
         * 
         * <strong>example:</strong>
         * <p>Test plain text.</p>
         */
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
        /**
         * <p>Whether it hits.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Hit")
        public Boolean hit;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>Check weather intentions. city</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Original value.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>Specific values.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
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
        /**
         * <p>Distinguish answer types.</p>
         * 
         * <strong>example:</strong>
         * <p>BotFramework</p>
         */
        @NameInMap("AnswerSource")
        public String answerSource;

        /**
         * <p>The content of the text message.</p>
         * 
         * <strong>example:</strong>
         * <p>May I ask where you want to check the weather?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Indication of plain/rich text answers.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAIN_TEXT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the name of the dialogue unit.</p>
         * 
         * <strong>example:</strong>
         * <p>Example: Checking Weather</p>
         */
        @NameInMap("DialogName")
        public String dialogName;

        /**
         * <p>This field returns transparent parameters.</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>When AnswerSource is BotFramework, this field returns a transparent parameter.</p>
         */
        @NameInMap("ExternalFlags")
        public java.util.Map<String, ?> externalFlags;

        /**
         * <p>Hit statement.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the weather.</p>
         */
        @NameInMap("HitStatement")
        public String hitStatement;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Check weather intention.</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>Metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>[[{\&quot;columnName\&quot;:\&quot;name\&quot;,\&quot;stringValue\&quot;:\&quot;wangshanshan\&quot;}]]</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>When AnswerSource is BotFramework, this field returns the node ID.</p>
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
         * <p>Example: Checking Weather Check the weather and fill in the slots__ city</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Slot information list.</p>
         */
        @NameInMap("Slots")
        public java.util.List<BeeBotChatResponseBodyDataMessagesTextSlots> slots;

        /**
         * <p>Custom Chat Topic Title.</p>
         * 
         * <strong>example:</strong>
         * <p>greet.</p>
         */
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
        /**
         * <p>When AnswerType is Recommended, this field indicates the source of the recommended answer.</p>
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
         * <p>When AnswerType is Knowledge, this field contains the Knowledge object returned by the robot.</p>
         */
        @NameInMap("Knowledge")
        public BeeBotChatResponseBodyDataMessagesKnowledge knowledge;

        /**
         * <p>When AnswerType is Recommended, this field contains a list of Recommendations returned by the robot.</p>
         */
        @NameInMap("Recommends")
        public java.util.List<BeeBotChatResponseBodyDataMessagesRecommends> recommends;

        /**
         * <p>When AnswerType is Text, this field contains the Text object returned by the robot.</p>
         */
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
        /**
         * <p>The ID of the recommended knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>ab6be8af-cee4-40c3-9919-2ac7461d7d98</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The source of the recommended answer. When AnswerType is set to Recommend, a value is returned for this parameter.</p>
         */
        @NameInMap("Messages")
        public java.util.List<BeeBotChatResponseBodyDataMessages> messages;

        /**
         * <p>The source of the recommended answer.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
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
