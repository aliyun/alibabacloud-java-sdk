// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class TongyiChatDebugInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2828708A-2C7A-1BAE-B810-87DB9DA9C661</p>
     */
    @NameInMap("MessageId")
    public String messageId;

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

    public static TongyiChatDebugInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TongyiChatDebugInfoResponseBody self = new TongyiChatDebugInfoResponseBody();
        return TeaModel.build(map, self);
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

    public static class TongyiChatDebugInfoResponseBodyPipeline extends TeaModel {
        @NameInMap("Input")
        public Object input;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>system_strategy</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

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
