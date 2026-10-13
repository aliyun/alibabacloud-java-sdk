// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class TongyiChatDebugInfoResponseBody extends TeaModel {
    /**
     * <p>The answer information corresponding to the conversation.</p>
     */
    @NameInMap("AnswerInfo")
    public TongyiChatDebugInfoResponseBodyAnswerInfo answerInfo;

    /**
     * <p>The ID of the response message for the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>2828708A-2C7A-1BAE-B810-87DB9DA9C661</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The information about the entire Q&amp;A process.</p>
     * 
     * <strong>example:</strong>
     * <p>For examples, see the child elements</p>
     */
    @NameInMap("Pipeline")
    public java.util.List<TongyiChatDebugInfoResponseBodyPipeline> pipeline;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the session to which the current response message belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>19856284-0ba1-4da3-9a5a-05db2bdf296e</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

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

    public TongyiChatDebugInfoResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfoItemList extends TeaModel {
        /**
         * <p>The type of the referenced text.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAIN_TEXT/RICH_TEXT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The source of the referenced knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>FLOW/DOC/FAQ/FAQ_DIRECT</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <p>The ID of the referenced knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>611926</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The number that corresponds one-to-one with the ReferNumber in AnswerInfo.MessageBody.DirectMessageBody.SentenceList.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The extension information specific to the knowledge type.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *             &quot;CollectedParams&quot;: {
         *               &quot;ReturnMaster&quot;: &quot;true&quot;
         *             },
         *             &quot;Edges&quot;: [],
         *             &quot;Nodes&quot;: [
         *               {
         *                 &quot;InvokedApis&quot;: [
         *                   {
         *                     &quot;ApiName&quot;: &quot;intentionRepeatCallQry&quot;
         *                   }
         *                 ],
         *                 &quot;OptionalParams&quot;: [
         *                   &quot;mobile&quot;,
         *                   &quot;intention&quot;
         *                 ],
         *                 &quot;Id&quot;: &quot;22874cb7-c253-4832-a38d-7113b15ef7fc&quot;,
         *                 &quot;RequiredParams&quot;: [],
         *                 &quot;Name&quot;: &quot;Check for repeated contacts&quot;
         *               },
         *               {
         *                 &quot;InvokedApis&quot;: [
         *                   {
         *                     &quot;ApiName&quot;: &quot;complaintAllChannelLatest&quot;
         *                   }
         *                 ],
         *                 &quot;OptionalParams&quot;: [
         *                   &quot;mobile&quot;,
         *                   &quot;billCode&quot;
         *                 ],
         *                 &quot;Id&quot;: &quot;071b082e-ce76-47f9-8b8d-f29e0dd1015c&quot;,
         *                 &quot;RequiredParams&quot;: [],
         *                 &quot;Name&quot;: &quot;Query ticket information&quot;
         *               },
         *               {
         *                 &quot;Id&quot;: &quot;db02f361-61ee-4e30-bda0-2fd62cf4ca46&quot;,
         *                 &quot;Name&quot;: &quot;Logical judgment_35a6&quot;
         *               },
         *               {
         *                 &quot;OptionalParams&quot;: [],
         *                 &quot;Id&quot;: &quot;97f68b60-2973-4d10-8e42-1cbfcbb15cf6&quot;,
         *                 &quot;RequiredParams&quot;: [
         *                   &quot;returnMaster&quot;
         *                 ],
         *                 &quot;Name&quot;: &quot;Whether to return to the main flow&quot;
         *               },
         *               {
         *                 &quot;Id&quot;: &quot;8167e4ec-a589-42de-97c2-271672b26ffe&quot;,
         *                 &quot;Name&quot;: &quot;Return to the main flow&quot;
         *               }
         *             ]
         *           }</p>
         */
        @NameInMap("ReferenceExt")
        public Object referenceExt;

        /**
         * <p>The title of the referenced knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>Is it possible to make the payment when the contract entity and the paying entity are different?</p>
         */
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
        /**
         * <p>The list of referenced knowledge entries.</p>
         */
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

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail extends TeaModel {
        /**
         * <p>The list of RTs for each segment from the time the user question is received on the text side to the sequential generation of the formal answer.</p>
         * 
         * <strong>example:</strong>
         * <p>[200, 256, 300, 430]</p>
         */
        @NameInMap("SentenceRtList")
        public Object sentenceRtList;

        /**
         * <p>The list of RTs for each segment from the time the user question is received on the text side to the sequential generation of the transition phrases.</p>
         * 
         * <strong>example:</strong>
         * <p>[130]</p>
         */
        @NameInMap("TransitionRtList")
        public Object transitionRtList;

        public static TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail build(java.util.Map<String, ?> map) throws Exception {
            TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail self = new TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail();
            return TeaModel.build(map, self);
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail setSentenceRtList(Object sentenceRtList) {
            this.sentenceRtList = sentenceRtList;
            return this;
        }
        public Object getSentenceRtList() {
            return this.sentenceRtList;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail setTransitionRtList(Object transitionRtList) {
            this.transitionRtList = transitionRtList;
            return this;
        }
        public Object getTransitionRtList() {
            return this.transitionRtList;
        }

    }

    public static class TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodySentenceList extends TeaModel {
        /**
         * <p>The formal answer entry.</p>
         * 
         * <strong>example:</strong>
         * <p>The weather is sunny today</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The number that corresponds one-to-one with the Number in AnswerReferenceInfo.ItemList for generating this answer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The answer type.</p>
         * 
         * <strong>example:</strong>
         * <p>RICH_TEXT/PLAIN_TEXT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The matched system Q&amp;A policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SENSITIVE_WORD/NO_ANSWER/COMMANDS</p>
         */
        @NameInMap("HitSystemAskConfig")
        public String hitSystemAskConfig;

        /**
         * <p>The response time (RT) debugging information for the current Q&amp;A.</p>
         */
        @NameInMap("RtDetail")
        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail rtDetail;

        /**
         * <p>The list of transition phrases.</p>
         */
        @NameInMap("TransitionList")
        public java.util.List<String> transitionList;

        /**
         * <p>The list of similar questions.</p>
         */
        @NameInMap("relatedQuestionList")
        public java.util.List<String> relatedQuestionList;

        /**
         * <p>The list of formal answers.</p>
         */
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

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody setHitSystemAskConfig(String hitSystemAskConfig) {
            this.hitSystemAskConfig = hitSystemAskConfig;
            return this;
        }
        public String getHitSystemAskConfig() {
            return this.hitSystemAskConfig;
        }

        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBody setRtDetail(TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail rtDetail) {
            this.rtDetail = rtDetail;
            return this;
        }
        public TongyiChatDebugInfoResponseBodyAnswerInfoMessageBodyDirectMessageBodyRtDetail getRtDetail() {
            return this.rtDetail;
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
        /**
         * <p>The command parameters, such as the skill group for the transfer-to-agent command.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;SysToAgent&quot;: &quot;{\&quot;skillGroup\&quot;:\&quot;\&quot;,\&quot;ext\&quot;:\&quot;\&quot;,\&quot;toAgentReason\&quot;:\&quot;HitKeywords\&quot;}&quot;
         *       }</p>
         */
        @NameInMap("Commands")
        public Object commands;

        /**
         * <p>The message body that contains the Q&amp;A results, including the answer, text type, recommended questions, and matched system type.</p>
         */
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
        /**
         * <p>The referenced knowledge information of the matched answer.</p>
         */
        @NameInMap("AnswerReferenceInfo")
        public TongyiChatDebugInfoResponseBodyAnswerInfoAnswerReferenceInfo answerReferenceInfo;

        /**
         * <p>The message body.</p>
         */
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
         * <p>The debugging input information.</p>
         * 
         * <strong>example:</strong>
         * <p>User question: Transfer to agent
         * Rule hits: [transfer] agent [customer service|service|representative]</p>
         */
        @NameInMap("Input")
        public Object input;

        /**
         * <p>The policy name. Valid values:</p>
         * <ul>
         * <li>High-frequency Q&amp;A direct output</li>
         * <li>Keyword-based transfer to agent</li>
         * <li>Global sensitive words</li>
         * </ul>
         * <p>This field is available only when NodeType is system_strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Keyword-based transfer to agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>system_strategy</strong>: system policy.</li>
         * <li><strong>rewrite_query</strong>: retrieved question.</li>
         * <li><strong>invoke_llm</strong>: LLM invocation.</li>
         * <li><strong>invoke_tools</strong>: tool calling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system_strategy</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The output information.</p>
         * 
         * <strong>example:</strong>
         * <p>commands:{&quot;sysToAgent&quot;:&quot;{\&quot;skillGroup\&quot;:\&quot;\&quot;,\&quot;ext\&quot;:\&quot;\&quot;,\&quot;toAgentReason\&quot;:\&quot;HitKeywords\&quot;}&quot;}
         * response:Transferring you to a human agent</p>
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
