// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpResponseBody extends TeaModel {
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
    public GetMcpResponseBodyData data;

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

    public GetMcpResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class GetMcpResponseBodyDataAuthDirectProxy extends TeaModel {
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

        public static GetMcpResponseBodyDataAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuthDirectProxy self = new GetMcpResponseBodyDataAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyDataAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMcpResponseBodyDataAuthHttpToMcp extends TeaModel {
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

        public static GetMcpResponseBodyDataAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuthHttpToMcp self = new GetMcpResponseBodyDataAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMcpResponseBodyDataAuth extends TeaModel {
        /**
         * <p>The direct proxy authentication configuration.</p>
         */
        @NameInMap("directProxy")
        public GetMcpResponseBodyDataAuthDirectProxy directProxy;

        /**
         * <p>Indicates whether authentication is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<GetMcpResponseBodyDataAuthHttpToMcp> httpToMcp;

        public static GetMcpResponseBodyDataAuth build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuth self = new GetMcpResponseBodyDataAuth();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuth setDirectProxy(GetMcpResponseBodyDataAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public GetMcpResponseBodyDataAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public GetMcpResponseBodyDataAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMcpResponseBodyDataAuth setHttpToMcp(java.util.List<GetMcpResponseBodyDataAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<GetMcpResponseBodyDataAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class GetMcpResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. enabled indicates whether authentication is enabled. directProxy specifies the custom authentication header for direct proxy. httpToMcp specifies the list of OpenAPI credentials for HTTP_TO_MCP.</p>
         */
        @NameInMap("auth")
        public GetMcpResponseBodyDataAuth auth;

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
         * <p>The MCP service ID.</p>
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

        /**
         * <p>The MCP service access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/artifacts/example.zip">https://example.com/artifacts/example.zip</a></p>
         */
        @NameInMap("url")
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

        public GetMcpResponseBodyData setAuth(GetMcpResponseBodyDataAuth auth) {
            this.auth = auth;
            return this;
        }
        public GetMcpResponseBodyDataAuth getAuth() {
            return this.auth;
        }

        public GetMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public GetMcpResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
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

        public GetMcpResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMcpResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetMcpResponseBodyData setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public GetMcpResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
