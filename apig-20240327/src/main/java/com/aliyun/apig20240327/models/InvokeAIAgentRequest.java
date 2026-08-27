// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InvokeAIAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>slsLogDiagnose</p>
     */
    @NameInMap("agentName")
    public String agentName;

    @NameInMap("bizParams")
    public java.util.Map<String, String> bizParams;

    @NameInMap("history")
    public java.util.List<InvokeAIAgentRequestHistory> history;

    /**
     * <strong>example:</strong>
     * <p>zh / en</p>
     */
    @NameInMap("outputLanguage")
    public String outputLanguage;

    /**
     * <strong>example:</strong>
     * <p>帮我诊断这个错误日志</p>
     */
    @NameInMap("prompt")
    public String prompt;

    public static InvokeAIAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAIAgentRequest self = new InvokeAIAgentRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAIAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public InvokeAIAgentRequest setBizParams(java.util.Map<String, String> bizParams) {
        this.bizParams = bizParams;
        return this;
    }
    public java.util.Map<String, String> getBizParams() {
        return this.bizParams;
    }

    public InvokeAIAgentRequest setHistory(java.util.List<InvokeAIAgentRequestHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<InvokeAIAgentRequestHistory> getHistory() {
        return this.history;
    }

    public InvokeAIAgentRequest setOutputLanguage(String outputLanguage) {
        this.outputLanguage = outputLanguage;
        return this;
    }
    public String getOutputLanguage() {
        return this.outputLanguage;
    }

    public InvokeAIAgentRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public static class InvokeAIAgentRequestHistory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>上一轮问题</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static InvokeAIAgentRequestHistory build(java.util.Map<String, ?> map) throws Exception {
            InvokeAIAgentRequestHistory self = new InvokeAIAgentRequestHistory();
            return TeaModel.build(map, self);
        }

        public InvokeAIAgentRequestHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAIAgentRequestHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
