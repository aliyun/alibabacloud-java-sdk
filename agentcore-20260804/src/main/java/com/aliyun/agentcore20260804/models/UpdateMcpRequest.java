// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMcpRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateMcpRequestBody body;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpRequest self = new UpdateMcpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpRequest setBody(UpdateMcpRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpRequestBody getBody() {
        return this.body;
    }

    public UpdateMcpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateMcpRequestBodyAuthDirectProxy extends TeaModel {
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

        public static UpdateMcpRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuthDirectProxy self = new UpdateMcpRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateMcpRequestBodyAuthHttpToMcp extends TeaModel {
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

        public static UpdateMcpRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuthHttpToMcp self = new UpdateMcpRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMcpRequestBodyAuth extends TeaModel {
        /**
         * <p>The direct proxy authentication configuration.</p>
         */
        @NameInMap("directProxy")
        public UpdateMcpRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable authentication.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<UpdateMcpRequestBodyAuthHttpToMcp> httpToMcp;

        public static UpdateMcpRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuth self = new UpdateMcpRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuth setDirectProxy(UpdateMcpRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public UpdateMcpRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public UpdateMcpRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpRequestBodyAuth setHttpToMcp(java.util.List<UpdateMcpRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<UpdateMcpRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class UpdateMcpRequestBody extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. When enabled=true: for DIRECT_PROXY, specify directProxy (name/value). For HTTP_TO_MCP, specify the httpToMcp array (each item contains id/type/credential; apiKey also requires position/name). Multiple authentication objects are supported, and the first one is the default upstream credential. HTTP_TO_MCP credentials are merged into the securitySchemes of the Swagger specification.</p>
         */
        @NameInMap("auth")
        public UpdateMcpRequestBodyAuth auth;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The Swagger configuration. Specify this field if Type is set to HTTP_TO_MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        public static UpdateMcpRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBody self = new UpdateMcpRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBody setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public UpdateMcpRequestBody setAuth(UpdateMcpRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public UpdateMcpRequestBodyAuth getAuth() {
            return this.auth;
        }

        public UpdateMcpRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

    }

}
