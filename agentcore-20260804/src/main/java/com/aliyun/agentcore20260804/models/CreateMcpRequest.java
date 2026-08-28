// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMcpRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateMcpRequestBody body;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpRequest self = new CreateMcpRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpRequest setBody(CreateMcpRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateMcpRequestBody getBody() {
        return this.body;
    }

    public CreateMcpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateMcpRequestBodyAuthDirectProxy extends TeaModel {
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

        public static CreateMcpRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuthDirectProxy self = new CreateMcpRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMcpRequestBodyAuthHttpToMcp extends TeaModel {
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

        public static CreateMcpRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuthHttpToMcp self = new CreateMcpRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMcpRequestBodyAuth extends TeaModel {
        /**
         * <p>The authentication configuration for direct proxy.</p>
         */
        @NameInMap("directProxy")
        public CreateMcpRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable authentication.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<CreateMcpRequestBodyAuthHttpToMcp> httpToMcp;

        public static CreateMcpRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuth self = new CreateMcpRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuth setDirectProxy(CreateMcpRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public CreateMcpRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public CreateMcpRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpRequestBodyAuth setHttpToMcp(java.util.List<CreateMcpRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<CreateMcpRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class CreateMcpRequestBody extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. When enabled is set to true: for DIRECT_PROXY, specify directProxy (name/value). For HTTP_TO_MCP, specify the httpToMcp array (each item contains id/type/credential. For apiKey, position/name are also required). Multiple authentication objects are supported, and the first one is used as the default upstream credential. HTTP_TO_MCP credentials are merged into the securitySchemes of the Swagger specification.</p>
         */
        @NameInMap("auth")
        public CreateMcpRequestBodyAuth auth;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
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
         * <p>The Swagger configuration. Specify this field if Type is set to HTTP_TO_MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        /**
         * <p>The type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECT_PROXY</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMcpRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBody self = new CreateMcpRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBody setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateMcpRequestBody setAuth(CreateMcpRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public CreateMcpRequestBodyAuth getAuth() {
            return this.auth;
        }

        public CreateMcpRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpRequestBody setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public CreateMcpRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
