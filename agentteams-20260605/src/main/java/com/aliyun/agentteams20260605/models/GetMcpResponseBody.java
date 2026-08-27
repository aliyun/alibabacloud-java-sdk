// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetMcpResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetMcpResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpResponseBody self = new GetMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpResponseBody setData(GetMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpResponseBodyData getData() {
        return this.data;
    }

    public GetMcpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMcpResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP server addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://example.com/mcp%22%5D">https://example.com/mcp&quot;]</a></p>
         */
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The authentication information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;bearer&quot;,&quot;token&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("AuthConfig")
        public String authConfig;

        /**
         * <p>Indicates whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AuthEnabled")
        public Boolean authEnabled;

        /**
         * <p>The creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECT_PROXY</p>
         */
        @NameInMap("CreateType")
        public String createType;

        /**
         * <p>The deployment status.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOYED</p>
         */
        @NameInMap("DeployStatus")
        public String deployStatus;

        /**
         * <p>The MCP server description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an MCP server.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The MCP server configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("McpServerConfig")
        public String mcpServerConfig;

        /**
         * <p>The MCP server name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>streamable</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The Swagger configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;url&quot;:&quot;<a href="https://example.com/swagger.json%22%7D">https://example.com/swagger.json&quot;}</a></p>
         */
        @NameInMap("SwaggerConfig")
        public String swaggerConfig;

        /**
         * <p>The MCP server access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyData self = new GetMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public GetMcpResponseBodyData setAuthConfig(String authConfig) {
            this.authConfig = authConfig;
            return this;
        }
        public String getAuthConfig() {
            return this.authConfig;
        }

        public GetMcpResponseBodyData setAuthEnabled(Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }
        public Boolean getAuthEnabled() {
            return this.authEnabled;
        }

        public GetMcpResponseBodyData setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public GetMcpResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public GetMcpResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpResponseBodyData setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public GetMcpResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
