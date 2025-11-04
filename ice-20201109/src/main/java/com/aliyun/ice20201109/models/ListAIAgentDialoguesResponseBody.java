// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentDialoguesResponseBody extends TeaModel {
    /**
     * <p>The dialog records.</p>
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
        @NameInMap("Format")
        public String format;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public Integer type;

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
        @NameInMap("AttachedFileList")
        public java.util.List<ListAIAgentDialoguesResponseBodyDialoguesAttachedFileList> attachedFileList;

        /**
         * <p>The unique ID of the dialog.</p>
         * 
         * <strong>example:</strong>
         * <p>19de81b3b3d94abda22****</p>
         */
        @NameInMap("DialogueId")
        public String dialogueId;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The speaker. Valid values: </p>
         * <ul>
         * <li>user</li>
         * <li>agent</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Producer")
        public String producer;

        /**
         * <p>The reasoning trace.</p>
         * 
         * <strong>example:</strong>
         * <p>I\&quot;m thinking</p>
         */
        @NameInMap("ReasoningText")
        public String reasoningText;

        /**
         * <p>The ID of the conversational turn.</p>
         * 
         * <strong>example:</strong>
         * <p>f27f9b9be28642a88e18****</p>
         */
        @NameInMap("RoundId")
        public String roundId;

        /**
         * <p>The source of the message. Valid values:</p>
         * <p>chat: messaging conversations.</p>
         * <p>call: voice calls.</p>
         * 
         * <strong>example:</strong>
         * <p>chat</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The specific content.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The UNIX timestamp, measured in milliseconds, which indicates the time when the message was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1734511087000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The message type. Valid values:</p>
         * <p>Voice calls:</p>
         * <ol>
         * <li>greeting: the welcome message.</li>
         * <li>normal: the voice response.</li>
         * <li>speech: the proactive message.</li>
         * </ol>
         * <p>Messaging conversations:</p>
         * <ol>
         * <li>normal: the text reply.</li>
         * <li>announcement: the proactive text message.</li>
         * <li>custom: the custom message.</li>
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
