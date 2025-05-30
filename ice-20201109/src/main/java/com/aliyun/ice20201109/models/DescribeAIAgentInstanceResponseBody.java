// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeAIAgentInstanceResponseBody extends TeaModel {
    /**
     * <p>The information about the AI agent.</p>
     */
    @NameInMap("Instance")
    public DescribeAIAgentInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIAgentInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAgentInstanceResponseBody self = new DescribeAIAgentInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIAgentInstanceResponseBody setInstance(DescribeAIAgentInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public DescribeAIAgentInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public DescribeAIAgentInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIAgentInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("AgentConfig")
        public AIAgentConfig agentConfig;

        /**
         * <p>The URL of the call log file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/call_logs/12345">https://example.com/call_logs/12345</a></p>
         */
        @NameInMap("CallLogUrl")
        public String callLogUrl;

        /**
         * <p>The runtime configurations of the AI agent.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VoiceChat&quot;:{&quot;AgentUserId&quot;:&quot;voice_agent_001&quot;,&quot;ChannelId&quot;:&quot;voice_channel_001&quot;,&quot;AuthToken&quot;:&quot;your_voice_chat_auth_token&quot;}}</p>
         */
        @NameInMap("RuntimeConfig")
        public AIAgentRuntimeConfig runtimeConfig;

        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The state of the AI agent. Valid values: Finished and Executing.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template configurations of the AI agent.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VoiceChat&quot;: {&quot;AppId&quot;: &quot;your_voice_chat_app_id&quot;}}</p>
         */
        @NameInMap("TemplateConfig")
        @Deprecated
        public AIAgentTemplateConfig templateConfig;

        /**
         * <p>The custom information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static DescribeAIAgentInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIAgentInstanceResponseBodyInstance self = new DescribeAIAgentInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeAIAgentInstanceResponseBodyInstance setAgentConfig(AIAgentConfig agentConfig) {
            this.agentConfig = agentConfig;
            return this;
        }
        public AIAgentConfig getAgentConfig() {
            return this.agentConfig;
        }

        public DescribeAIAgentInstanceResponseBodyInstance setCallLogUrl(String callLogUrl) {
            this.callLogUrl = callLogUrl;
            return this;
        }
        public String getCallLogUrl() {
            return this.callLogUrl;
        }

        public DescribeAIAgentInstanceResponseBodyInstance setRuntimeConfig(AIAgentRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }
        public AIAgentRuntimeConfig getRuntimeConfig() {
            return this.runtimeConfig;
        }

        public DescribeAIAgentInstanceResponseBodyInstance setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeAIAgentInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        @Deprecated
        public DescribeAIAgentInstanceResponseBodyInstance setTemplateConfig(AIAgentTemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public AIAgentTemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

        public DescribeAIAgentInstanceResponseBodyInstance setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
