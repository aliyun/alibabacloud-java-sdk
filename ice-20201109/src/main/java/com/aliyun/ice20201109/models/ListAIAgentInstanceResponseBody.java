// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentInstanceResponseBody extends TeaModel {
    /**
     * <p>The list of the AI agents.</p>
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
         * <p>The URL of the call log file for the AI agent. The structure of the file is CallLog in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/call_logs/12345.json">https://example.com/call_logs/12345.json</a></p>
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

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li>Executing</li>
         * <li>Finished</li>
         * </ul>
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
         * <p>{&quot;VoiceChat&quot;: {&quot;VoiceId&quot;: &quot;zhixiaoxia&quot;}}</p>
         */
        @NameInMap("TemplateConfig")
        public AIAgentTemplateConfig templateConfig;

        /**
         * <p>The custom information.</p>
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
