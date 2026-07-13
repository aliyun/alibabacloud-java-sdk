// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateAtiAgentRegisterInfoRequest extends TeaModel {
    /**
     * <p>The description of the agent capabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>支付服务</p>
     */
    @NameInMap("AgentDescription")
    public String agentDescription;

    /**
     * <p>The display name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试Agent</p>
     */
    @NameInMap("AgentDisplayName")
    public String agentDisplayName;

    /**
     * <p>The endpoint domain name through which the agent provides services.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <p>The version of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>Provides idempotency. Within 3 minutes, the same value takes effect only once.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The endpoint information of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;EndpointValue\&quot;:\&quot;<a href="http://www.baidu.com%5C%5C%22,%5C%5C%22EndpointType%5C%5C%22:%5C%5C%22http%5C%5C%22%7D%5D">http://www.baidu.com\\&quot;,\\&quot;EndpointType\\&quot;:\\&quot;http\\&quot;}]</a></p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateAtiAgentRegisterInfoRequestEndpoints> endpoints;

    /**
     * <p>The ID of the verified registrant. Obtain this ID by invoking the identity verification API operation or from the ATS console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2072277378616354816</p>
     */
    @NameInMap("RegistrantId")
    public String registrantId;

    public static CreateAtiAgentRegisterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAtiAgentRegisterInfoRequest self = new CreateAtiAgentRegisterInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateAtiAgentRegisterInfoRequest setAgentDescription(String agentDescription) {
        this.agentDescription = agentDescription;
        return this;
    }
    public String getAgentDescription() {
        return this.agentDescription;
    }

    public CreateAtiAgentRegisterInfoRequest setAgentDisplayName(String agentDisplayName) {
        this.agentDisplayName = agentDisplayName;
        return this;
    }
    public String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    public CreateAtiAgentRegisterInfoRequest setAgentHost(String agentHost) {
        this.agentHost = agentHost;
        return this;
    }
    public String getAgentHost() {
        return this.agentHost;
    }

    public CreateAtiAgentRegisterInfoRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public CreateAtiAgentRegisterInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAtiAgentRegisterInfoRequest setEndpoints(java.util.List<CreateAtiAgentRegisterInfoRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateAtiAgentRegisterInfoRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateAtiAgentRegisterInfoRequest setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }
    public String getRegistrantId() {
        return this.registrantId;
    }

    public static class CreateAtiAgentRegisterInfoRequestEndpoints extends TeaModel {
        /**
         * <p>The actual service address of the agent endpoint, which is the HTTPS entry point where the agent runs online. This is a required field with a maximum of 500 characters.</p>
         * <p>Example: <a href="https://my-agent.example.com/mcp">https://my-agent.example.com/mcp</a></p>
         * <p>After a caller discovers this agent through DNS, it can use this URL to initiate a connection directly. This is the address where the agent is actually online.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/mcp">https://www.example.com/mcp</a></p>
         */
        @NameInMap("AgentUrl")
        public String agentUrl;

        /**
         * <p>An optional URL that points to the metadata description file of the agent (typically in JSON format). This allows other agents or clients to automatically discover the agent capabilities before connecting, including:</p>
         * <ul>
         * <li>Functions supported by the agent</li>
         * <li>Input/output formats</li>
         * <li>Version information</li>
         * <li>Other capability declarations</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>// <a href="https://my-agent.example.com/.well-known/agent.json">https://my-agent.example.com/.well-known/agent.json</a>
         * {
         *   &quot;name&quot;: &quot;智能客服助手&quot;,
         *   &quot;version&quot;: &quot;1.2.0&quot;,
         *   &quot;protocol&quot;: &quot;MCP&quot;,
         *   &quot;description&quot;: &quot;提供产品咨询、订单查询、售后服务的智能客服Agent&quot;,
         *   &quot;capabilities&quot;: {
         *     &quot;tools&quot;: [
         *       { &quot;name&quot;: &quot;order_query&quot;, &quot;description&quot;: &quot;查询订单状态&quot; },
         *       { &quot;name&quot;: &quot;product_search&quot;, &quot;description&quot;: &quot;搜索产品信息&quot; },
         *       { &quot;name&quot;: &quot;refund_request&quot;, &quot;description&quot;: &quot;发起退款申请&quot; }
         *     ],
         *     &quot;resources&quot;: [
         *       { &quot;uri&quot;: &quot;faq://knowledge-base&quot;, &quot;description&quot;: &quot;FAQ知识库&quot; }
         *     ]
         *   },
         *   &quot;endpoint&quot;: {
         *     &quot;url&quot;: &quot;<a href="https://my-agent.example.com/mcp">https://my-agent.example.com/mcp</a>&quot;,
         *     &quot;transport&quot;: [&quot;STREAMABLE-HTTP&quot;, &quot;SSE&quot;]
         *   },
         *   &quot;policy&quot;: {
         *     &quot;authentication&quot;: &quot;mTLS&quot;,
         *     &quot;rateLimit&quot;: &quot;100/min&quot;
         *   }
         * }</p>
         */
        @NameInMap("MetadataUrl")
        public String metadataUrl;

        /**
         * <p>The communication protocol standard that the agent endpoint follows. This determines how the invoker interacts with the agent.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>MCP: Model Context Protocol, an agent tool invocation protocol developed by Anthropic.</li>
         * <li>A2A: Agent-to-Agent Protocol, a cross-agent communication protocol developed by Google.</li>
         * <li>OpenAPI: Standard RESTful API specification (Swagger/OpenAPI).</li>
         * </ul>
         * <p>When other agents or clients see this protocol identity, they know which method to use to communicate with the agent. For example, MCP uses the MCP SDK, A2A uses the A2A SDK, and OpenAPI uses standard HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>A2A</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The transport methods.</p>
         * 
         * <strong>example:</strong>
         * <p>STREAMABLE-HTTP</p>
         */
        @NameInMap("Transports")
        public java.util.List<String> transports;

        public static CreateAtiAgentRegisterInfoRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateAtiAgentRegisterInfoRequestEndpoints self = new CreateAtiAgentRegisterInfoRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateAtiAgentRegisterInfoRequestEndpoints setAgentUrl(String agentUrl) {
            this.agentUrl = agentUrl;
            return this;
        }
        public String getAgentUrl() {
            return this.agentUrl;
        }

        public CreateAtiAgentRegisterInfoRequestEndpoints setMetadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            return this;
        }
        public String getMetadataUrl() {
            return this.metadataUrl;
        }

        public CreateAtiAgentRegisterInfoRequestEndpoints setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateAtiAgentRegisterInfoRequestEndpoints setTransports(java.util.List<String> transports) {
            this.transports = transports;
            return this;
        }
        public java.util.List<String> getTransports() {
            return this.transports;
        }

    }

}
