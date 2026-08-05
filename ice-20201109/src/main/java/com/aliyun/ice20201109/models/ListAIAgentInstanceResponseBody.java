// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentInstanceResponseBody extends TeaModel {
    /**
     * <p>The list of agent instance structs.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListAIAgentInstanceResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAIAgentInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentInstanceResponseBody self = new ListAIAgentInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIAgentInstanceResponseBody setInstances(java.util.List<ListAIAgentInstanceResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListAIAgentInstanceResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListAIAgentInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIAgentInstanceResponseBodyInstances extends TeaModel {
        /**
         * <p>The template configuration used by the agent instance.</p>
         */
        @NameInMap("AgentConfig")
        public AIAgentConfig agentConfig;

        /**
         * <p>The URL of the agent conversation call log file. The file contains the CallLog struct in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/call_logs/12345.json">https://example.com/call_logs/12345.json</a></p>
         */
        @NameInMap("CallLogUrl")
        public String callLogUrl;

        /**
         * <p>The runtime configuration required by the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VoiceChat&quot;:{&quot;AgentUserId&quot;:&quot;voice_agent_001&quot;,&quot;ChannelId&quot;:&quot;voice_channel_001&quot;,&quot;AuthToken&quot;:&quot;your_voice_chat_auth_token&quot;}}</p>
         */
        @NameInMap("RuntimeConfig")
        public AIAgentRuntimeConfig runtimeConfig;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p>Created: The call is initiated but the connection between the two ends is not established.</p>
         * </li>
         * <li><p>Executing: The call is in progress and the connection between the two ends is established.</p>
         * </li>
         * <li><p>Finished: The call has ended.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template configuration used by the agent instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VoiceChat&quot;: {&quot;VoiceId&quot;: &quot;zhixiaoxia&quot;}}</p>
         */
        @NameInMap("TemplateConfig")
        @Deprecated
        public AIAgentTemplateConfig templateConfig;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListAIAgentInstanceResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentInstanceResponseBodyInstances self = new ListAIAgentInstanceResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListAIAgentInstanceResponseBodyInstances setAgentConfig(AIAgentConfig agentConfig) {
            this.agentConfig = agentConfig;
            return this;
        }
        public AIAgentConfig getAgentConfig() {
            return this.agentConfig;
        }

        public ListAIAgentInstanceResponseBodyInstances setCallLogUrl(String callLogUrl) {
            this.callLogUrl = callLogUrl;
            return this;
        }
        public String getCallLogUrl() {
            return this.callLogUrl;
        }

        public ListAIAgentInstanceResponseBodyInstances setRuntimeConfig(AIAgentRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }
        public AIAgentRuntimeConfig getRuntimeConfig() {
            return this.runtimeConfig;
        }

        public ListAIAgentInstanceResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        @Deprecated
        public ListAIAgentInstanceResponseBodyInstances setTemplateConfig(AIAgentTemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public AIAgentTemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

        public ListAIAgentInstanceResponseBodyInstances setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
