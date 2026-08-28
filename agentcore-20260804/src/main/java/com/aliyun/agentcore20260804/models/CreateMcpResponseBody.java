// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMcpResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateMcpResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Request processed successfully</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpResponseBody self = new CreateMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMcpResponseBody setData(CreateMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMcpResponseBodyData getData() {
        return this.data;
    }

    public CreateMcpResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMcpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMcpResponseBodyDataAuthDirectProxy extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The authentication parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>example-credential</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMcpResponseBodyDataAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuthDirectProxy self = new CreateMcpResponseBodyDataAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyDataAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMcpResponseBodyDataAuthHttpToMcp extends TeaModel {
        /**
         * <p>The authentication credential.</p>
         * 
         * <strong>example:</strong>
         * <p>example-credential</p>
         */
        @NameInMap("credential")
        public String credential;

        /**
         * <p>The authentication scheme ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-1234567890abcdef</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The position of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMcpResponseBodyDataAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuthHttpToMcp self = new CreateMcpResponseBodyDataAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMcpResponseBodyDataAuth extends TeaModel {
        /**
         * <p>The authentication configuration for direct proxy.</p>
         */
        @NameInMap("directProxy")
        public CreateMcpResponseBodyDataAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable authentication.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<CreateMcpResponseBodyDataAuthHttpToMcp> httpToMcp;

        public static CreateMcpResponseBodyDataAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuth self = new CreateMcpResponseBodyDataAuth();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuth setDirectProxy(CreateMcpResponseBodyDataAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public CreateMcpResponseBodyDataAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public CreateMcpResponseBodyDataAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpResponseBodyDataAuth setHttpToMcp(java.util.List<CreateMcpResponseBodyDataAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<CreateMcpResponseBodyDataAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class CreateMcpResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. enabled indicates whether authentication is enabled. directProxy specifies custom authentication headers for direct proxy. httpToMcp specifies the OpenAPI credential list for HTTP_TO_MCP.</p>
         */
        @NameInMap("auth")
        public CreateMcpResponseBodyDataAuth auth;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP server configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("mcpServerConfig")
        public String mcpServerConfig;

        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-1234567890abcdef</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The MCP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource processing completed</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The Swagger configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyData self = new CreateMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateMcpResponseBodyData setAuth(CreateMcpResponseBodyDataAuth auth) {
            this.auth = auth;
            return this;
        }
        public CreateMcpResponseBodyDataAuth getAuth() {
            return this.auth;
        }

        public CreateMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public CreateMcpResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public CreateMcpResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateMcpResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public CreateMcpResponseBodyData setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public CreateMcpResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
