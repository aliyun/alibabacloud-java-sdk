// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentDialoguesResponseBody extends TeaModel {
    @NameInMap("Dialogues")
    public java.util.List<ListAIAgentDialoguesResponseBodyDialogues> dialogues;

    /**
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

    public static class ListAIAgentDialoguesResponseBodyDialogues extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>19de81b3b3d94abda22****</p>
         */
        @NameInMap("DialogueId")
        public String dialogueId;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Producer")
        public String producer;

        @NameInMap("ReasoningText")
        public String reasoningText;

        /**
         * <strong>example:</strong>
         * <p>f27f9b9be28642a88e18****</p>
         */
        @NameInMap("RoundId")
        public String roundId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>1734511087000</p>
         */
        @NameInMap("Time")
        public Long time;

        @NameInMap("Type")
        public String type;

        public static ListAIAgentDialoguesResponseBodyDialogues build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentDialoguesResponseBodyDialogues self = new ListAIAgentDialoguesResponseBodyDialogues();
            return TeaModel.build(map, self);
        }

        public ListAIAgentDialoguesResponseBodyDialogues setDialogueId(String dialogueId) {
            this.dialogueId = dialogueId;
            return this;
        }
        public String getDialogueId() {
            return this.dialogueId;
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
