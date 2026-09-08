// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetChatRoutingProfileResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public GetChatRoutingProfileResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30C7D235-DDCF-4C7F-A462-5E2598252C2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatRoutingProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatRoutingProfileResponseBody self = new GetChatRoutingProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatRoutingProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatRoutingProfileResponseBody setData(GetChatRoutingProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatRoutingProfileResponseBodyData getData() {
        return this.data;
    }

    public GetChatRoutingProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetChatRoutingProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatRoutingProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatRoutingProfileResponseBodyData extends TeaModel {
        /**
         * <p>Agent session concurrent configuration.</p>
         * <ul>
         * <li><p>AllowExceedingLimitWhenTransferring: Allow exceeding the limit when transferring. When transferring sessions to other agents, exceeding the recipient\&quot;s limit is allowed, but the total cannot exceed 30.</p>
         * </li>
         * <li><p>AllowExceedingLimitWhenClaiming: Allow exceeding the limit when claiming. When an agent actively claims sessions from the queue, exceeding the limit is allowed, but the total cannot exceed 30.</p>
         * </li>
         * <li><p>ConcurrencyLimit: The number of network business sessions an agent can process simultaneously.</p>
         * </li>
         * <li><p>Enabled: Enable this configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;AllowExceedingLimitWhenTransferring&quot;: false,
         *     &quot;ConcurrencyLimit&quot;: 4,
         *     &quot;AllowExceedingLimitWhenClaiming&quot;: true,
         *     &quot;Enabled&quot;: true
         * }</p>
         */
        @NameInMap("AgentConcurrencySettings")
        public String agentConcurrencySettings;

        /**
         * <p>Session configuration.</p>
         * <ul>
         * <li>IdleChatTimeoutSeconds: Automatic session end time. If no customer response is received within a specific period, the system ends the session. Unit: seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IdleChatTimeoutSeconds&quot;:300}</p>
         */
        @NameInMap("ChatSettings")
        public String chatSettings;

        /**
         * <p>Agent session allocation configuration.</p>
         * <ul>
         * <li><p>AgentRingTimeoutSeconds: Agent processing timeout limit.</p>
         * </li>
         * <li><p>MaxNumberOfConversationsAgentCanMiss: The maximum number of consecutive unanswered sessions an agent can miss.</p>
         * </li>
         * <li><p>PostAgentMissingConversionsAction: After an agent misses more than the set number of consecutive responses, the system sets the agent\&quot;s status, such as Break, Invisible, or Nothing (remain unchanged).</p>
         * </li>
         * <li><p>Enabled: Enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;AgentRingTimeoutSeconds&quot;: 30,
         *     &quot;Enabled&quot;: true,
         *     &quot;MaxNumberOfConversationsAgentCanMiss&quot;: 5,
         *     &quot;PostAgentMissingConversionsAction&quot;: &quot;Nothing&quot;
         * }</p>
         */
        @NameInMap("DistributionSettings")
        public String distributionSettings;

        /**
         * <p>Call distribution type.</p>
         * <ul>
         * <li><p>Automatic distribution (Automatic).</p>
         * </li>
         * <li><p>Manual distribution (Manual).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automatic</p>
         */
        @NameInMap("RoutingType")
        public String routingType;

        public static GetChatRoutingProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatRoutingProfileResponseBodyData self = new GetChatRoutingProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatRoutingProfileResponseBodyData setAgentConcurrencySettings(String agentConcurrencySettings) {
            this.agentConcurrencySettings = agentConcurrencySettings;
            return this;
        }
        public String getAgentConcurrencySettings() {
            return this.agentConcurrencySettings;
        }

        public GetChatRoutingProfileResponseBodyData setChatSettings(String chatSettings) {
            this.chatSettings = chatSettings;
            return this;
        }
        public String getChatSettings() {
            return this.chatSettings;
        }

        public GetChatRoutingProfileResponseBodyData setDistributionSettings(String distributionSettings) {
            this.distributionSettings = distributionSettings;
            return this;
        }
        public String getDistributionSettings() {
            return this.distributionSettings;
        }

        public GetChatRoutingProfileResponseBodyData setRoutingType(String routingType) {
            this.routingType = routingType;
            return this;
        }
        public String getRoutingType() {
            return this.routingType;
        }

    }

}
