// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class TongyiChatDebugInfoResponseBody extends TeaModel {
    @NameInMap("AnswerInfo")
    public TongyiChatDebugInfoResponseBodyAnswerInfo answerInfo;

    /**
     * <p>The ID of the response message in the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>2828708A-2C7A-1BAE-B810-87DB9DA9C661</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The array of nodes that constitute the Q\&amp;A workflow.</p>
     */
    @NameInMap("Pipeline")
    public java.util.List<TongyiChatDebugInfoResponseBodyPipeline> pipeline;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TongyiChatDebugInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TongyiChatDebugInfoResponseBody self = new TongyiChatDebugInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public TongyiChatDebugInfoResponseBody setAnswerInfo(TongyiChatDebugInfoResponseBodyAnswerInfo answerInfo) {
        this.answerInfo = answerInfo;
        return this;
    }
    public TongyiChatDebugInfoResponseBodyAnswerInfo getAnswerInfo() {
        return this.answerInfo;
    }

    public TongyiChatDebugInfoResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public TongyiChatDebugInfoResponseBody setPipeline(java.util.List<TongyiChatDebugInfoResponseBodyPipeline> pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public java.util.List<TongyiChatDebugInfoResponseBodyPipeline> getPipeline() {
        return this.pipeline;
    }

    public TongyiChatDebugInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("Id")
        public String id;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("ReferenceExt")
        public Object referenceExt;

        @NameInMap("Title")
        public String title;

        public static TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList self = new TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList setReferenceExt(Object referenceExt) {
            this.referenceExt = referenceExt;
            return this;
        }
        public Object getReferenceExt() {
            return this.referenceExt;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo extends TeaModel {
        @NameInMap("ItemList")
        public java.util.List<TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList> itemList;

        public static TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo self = new TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo setItemList(java.util.List<TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList> itemList) {
            this.itemList = itemList;
            return this;
        }
        public java.util.List<TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList> getItemList() {
            return this.itemList;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ReferNumber")
        public Integer referNumber;

        public static TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList self = new TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList setReferNumber(Integer referNumber) {
            this.referNumber = referNumber;
            return this;
        }
        public Integer getReferNumber() {
            return this.referNumber;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("TransitionList")
        public java.util.List<String> transitionList;

        @NameInMap("relatedQuestionList")
        public java.util.List<String> relatedQuestionList;

        @NameInMap("sentenceList")
        public java.util.List<TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList> sentenceList;

        public static TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody self = new TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody setTransitionList(java.util.List<String> transitionList) {
            this.transitionList = transitionList;
            return this;
        }
        public java.util.List<String> getTransitionList() {
            return this.transitionList;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody setRelatedQuestionList(java.util.List<String> relatedQuestionList) {
            this.relatedQuestionList = relatedQuestionList;
            return this;
        }
        public java.util.List<String> getRelatedQuestionList() {
            return this.relatedQuestionList;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody setSentenceList(java.util.List<TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList> sentenceList) {
            this.sentenceList = sentenceList;
            return this;
        }
        public java.util.List<TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList> getSentenceList() {
            return this.sentenceList;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody extends TeaModel {
        @NameInMap("Commands")
        public Object commands;

        @NameInMap("DirectMessageBody")
        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody directMessageBody;

        public static TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody self = new TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody setCommands(Object commands) {
            this.commands = commands;
            return this;
        }
        public Object getCommands() {
            return this.commands;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody setDirectMessageBody(TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody directMessageBody) {
            this.directMessageBody = directMessageBody;
            return this;
        }
        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody getDirectMessageBody() {
            return this.directMessageBody;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfo extends TeaModel {
        @NameInMap("AnswerReferenceInfo")
        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo answerReferenceInfo;

        @NameInMap("MessageBody")
        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody messageBody;

        public static TongyiChatDebugInfoResponseBodyAnswerInfo build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfo self = new TongyiChatDebugInfoResponseBodyAnswerInfo();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfo setAnswerReferenceInfo(TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo answerReferenceInfo) {
            this.answerReferenceInfo = answerReferenceInfo;
            return this;
        }
        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo getAnswerReferenceInfo() {
            return this.answerReferenceInfo;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfo setMessageBody(TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBody getMessageBody() {
            return this.messageBody;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyPipeline extends TeaModel {
        /**
         * <p>The input data for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>用户问句：转人工\n命中规则：[转]人工[客服|服务|坐席]</p>
         */
        @NameInMap("Input")
        public Object input;

        /**
         * <p>The name of the strategy. Possible values include:</p>
         * <ul>
         * <li><p>FAQ</p>
         * </li>
         * <li><p>Hit Keywords</p>
         * </li>
         * <li><p>Global Sensitive Words</p>
         * </li>
         * </ul>
         * <p>This parameter is returned only when <code>NodeType</code> is set to <code>system_strategy</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>关键词转人工</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><p><strong>system_strategy</strong>: system strategy.</p>
         * </li>
         * <li><p><strong>rewrite_query</strong>: retrieval query.</p>
         * </li>
         * <li><p><strong>invoke_llm</strong>: LLM invocation.</p>
         * </li>
         * <li><p><strong>invoke_tools</strong>: tool invocation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system_strategy</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The output data from the node.</p>
         * 
         * <strong>example:</strong>
         * <p>commands:{\&quot;sysToAgent\&quot;:\&quot;{\\\&quot;skillGroup\\\&quot;:\\\&quot;\\\&quot;,\\\&quot;ext\\\&quot;:\\\&quot;\\\&quot;,\\\&quot;toAgentReason\\\&quot;:\\\&quot;HitKeywords\\\&quot;}\&quot;}\nresponse:正在为您转接人工客服</p>
         */
        @NameInMap("Output")
        public Object output;

        public static TongyiChatDebugInfoResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyPipeline self = new TongyiChatDebugInfoResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyPipeline setInput(Object input) {
            this.input = input;
            return this;
        }
        public Object getInput() {
            return this.input;
        }

        public TongyiChatDebugInfoResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TongyiChatDebugInfoResponseBodyPipeline setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public TongyiChatDebugInfoResponseBodyPipeline setOutput(Object output) {
            this.output = output;
            return this;
        }
        public Object getOutput() {
            return this.output;
        }

    }

}
