// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentDialoguesResponseBody extends TeaModel {
    /**
     * <p>A list of dialogues.</p>
     */
    @NameInMap("Dialogues")
    public java.util.List<ListAIAgentDialoguesResponseBodyDialogues> dialogues;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B117AF5-***************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAIAgentDialoguesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentDialoguesResponseBody self = new ListAIAgentDialoguesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIAgentDialoguesResponseBody setDialogues(java.util.List<ListAIAgentDialoguesResponseBodyDialogues> dialogues) {
        this.dialogues = dialogues;
        return this;
    }
    public java.util.List<ListAIAgentDialoguesResponseBodyDialogues> getDialogues() {
        return this.dialogues;
    }

    public ListAIAgentDialoguesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList extends TeaModel {
        /**
         * <p>The format of the attachment, such as mp3, wav, or pdf.</p>
         * 
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The unique identifier of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>7B117AF5-***************</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The file name of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>MusicDemix</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The attachment type, represented by a numeric value. The meaning of this value is defined by your business logic.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The URL of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://media.w3.org/2010/05/sintel/trailer.mp3">https://media.w3.org/2010/05/sintel/trailer.mp3</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList self = new ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList();
            return TeaModel.build(map, self);
        }

        public ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAIAgentDialoguesResponseBodyDialogues extends TeaModel {
        /**
         * <p>A list of file attachments referenced in the dialogue.</p>
         */
        @NameInMap("AttachedFileList")
        public java.util.List<ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList> attachedFileList;

        /**
         * <p>The unique ID of the dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>19de81b3b3d94abda22****</p>
         */
        @NameInMap("DialogueId")
        public String dialogueId;

        /**
         * <p>A JSON-formatted string for extended information. Use this field to store custom data, such as sentiment labels or intent recognition results.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;addTransferLock\&quot;:true}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The ID of the workflow node that generated the dialogue entry, which you can use for tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-to345ikn62o</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The producer of this message.</p>
         * <ul>
         * <li><p>user: A message from the user.</p>
         * </li>
         * <li><p>agent: A message from the agent.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Producer")
        public String producer;

        /**
         * <p>The agent\&quot;s reasoning text, which can reveal its thought process.</p>
         * 
         * <strong>example:</strong>
         * <p>我在思考</p>
         */
        @NameInMap("ReasoningText")
        public String reasoningText;

        /**
         * <p>The ID of the dialogue round.</p>
         * 
         * <strong>example:</strong>
         * <p>f27f9b9be28642a88e18****</p>
         */
        @NameInMap("RoundId")
        public String roundId;

        /**
         * <p>The source channel of the message. Valid values:</p>
         * <p>chat: The message is from a text chat.</p>
         * <p>call: The message is from a voice call.</p>
         * 
         * <strong>example:</strong>
         * <p>chat</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The text content of the dialogue entry.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The Unix timestamp (in milliseconds) when the dialogue entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1734511087000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The type of the message. Valid values include:</p>
         * <p>For a call:</p>
         * <ol>
         * <li><p>greeting: A welcome message.</p>
         * </li>
         * <li><p>normal: A standard voice response.</p>
         * </li>
         * <li><p>speech: A proactive voice broadcast.</p>
         * </li>
         * </ol>
         * <p>For a chat:</p>
         * <ol>
         * <li><p>normal: A standard text response.</p>
         * </li>
         * <li><p>announcement: A proactive text push.</p>
         * </li>
         * <li><p>custom: A custom message.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>announcement</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAIAgentDialoguesResponseBodyDialogues build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentDialoguesResponseBodyDialogues self = new ListAIAgentDialoguesResponseBodyDialogues();
            return TeaModel.build(map, self);
        }

        public ListAIAgentDialoguesResponseBodyDialogues setAttachedFileList(java.util.List<ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList> attachedFileList) {
            this.attachedFileList = attachedFileList;
            return this;
        }
        public java.util.List<ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList> getAttachedFileList() {
            return this.attachedFileList;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setDialogueId(String dialogueId) {
            this.dialogueId = dialogueId;
            return this;
        }
        public String getDialogueId() {
            return this.dialogueId;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setProducer(String producer) {
            this.producer = producer;
            return this;
        }
        public String getProducer() {
            return this.producer;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setReasoningText(String reasoningText) {
            this.reasoningText = reasoningText;
            return this;
        }
        public String getReasoningText() {
            return this.reasoningText;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setRoundId(String roundId) {
            this.roundId = roundId;
            return this;
        }
        public String getRoundId() {
            return this.roundId;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ListAIAgentDialoguesResponseBodyDialogues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
