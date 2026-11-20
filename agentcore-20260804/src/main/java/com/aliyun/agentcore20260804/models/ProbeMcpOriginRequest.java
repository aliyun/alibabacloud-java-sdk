// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ProbeMcpOriginRequest extends TeaModel {
    /**
     * <p>The scope of the origin server configuration must not exceed that of the creation interface. The control fields for this validation only restrict the validation scope and do not extend the origin server access configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ProbeMcpOriginRequestBody body;

    public static ProbeMcpOriginRequest build(java.util.Map<String, ?> map) throws Exception {
        ProbeMcpOriginRequest self = new ProbeMcpOriginRequest();
        return TeaModel.build(map, self);
    }

    public ProbeMcpOriginRequest setBody(ProbeMcpOriginRequestBody body) {
        this.body = body;
        return this;
    }
    public ProbeMcpOriginRequestBody getBody() {
        return this.body;
    }

    public static class ProbeMcpOriginRequestBodyAuthDirectProxy extends TeaModel {
        /**
         * <p>The name of the backend authentication header.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the backend authentication header.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key</p>
         */
        @NameInMap("value")
        public String value;

        public static ProbeMcpOriginRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginRequestBodyAuthDirectProxy self = new ProbeMcpOriginRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ProbeMcpOriginRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ProbeMcpOriginRequestBodyAuthHttpToMcp extends TeaModel {
        /**
         * <p>The credential for the backend authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key</p>
         */
        @NameInMap("credential")
        public String credential;

        /**
         * <p>The ID of the backend authentication configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>api-key-auth</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the API key parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>X-API-Key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The location where the API key is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <p>The type of the backend authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("type")
        public String type;

        public static ProbeMcpOriginRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginRequestBodyAuthHttpToMcp self = new ProbeMcpOriginRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public ProbeMcpOriginRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ProbeMcpOriginRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ProbeMcpOriginRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public ProbeMcpOriginRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ProbeMcpOriginRequestBodyAuth extends TeaModel {
        /**
         * <p>The backend authentication configuration for the direct proxy.</p>
         */
        @NameInMap("directProxy")
        public ProbeMcpOriginRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable the configuration.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of backend authentication configurations for HTTP-to-MCP.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<ProbeMcpOriginRequestBodyAuthHttpToMcp> httpToMcp;

        public static ProbeMcpOriginRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginRequestBodyAuth self = new ProbeMcpOriginRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginRequestBodyAuth setDirectProxy(ProbeMcpOriginRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public ProbeMcpOriginRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public ProbeMcpOriginRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ProbeMcpOriginRequestBodyAuth setHttpToMcp(java.util.List<ProbeMcpOriginRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<ProbeMcpOriginRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class ProbeMcpOriginRequestBody extends TeaModel {
        /**
         * <p>A single HTTP(S) URL that reuses the addresses of the origin server used during creation. Embedded credentials, batch addresses, or protected targets are not accepted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp.example.com/mcp">https://mcp.example.com/mcp</a></p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>Reuses the enabled, directProxy, and httpToMcp origin server authentication fields and validations from the creation interface. When enabled is set to true, you must provide a configuration that matches the access type. codePackage or additional headers are not accepted.</p>
         */
        @NameInMap("auth")
        public ProbeMcpOriginRequestBodyAuth auth;

        /**
         * <p>Applicable only to HTTP. Reuses the JSON or YAML string semantics from the creation interface. This field is required when validating the definition. Remote documents or references are not automatically fetched.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;openapi&quot;:&quot;3.0.3&quot;,&quot;info&quot;:{&quot;title&quot;:&quot;Inventory API&quot;,&quot;version&quot;:&quot;1.0.0&quot;},&quot;paths&quot;:{&quot;/inventory&quot;:{&quot;get&quot;:{&quot;operationId&quot;:&quot;listInventory&quot;,&quot;responses&quot;:{&quot;200&quot;:{&quot;description&quot;:&quot;OK&quot;}}}}}}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        /**
         * <p>Valid values: DIRECT_PROXY or HTTP_TO_MCP. CODE_PACKAGE is not accepted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECT_PROXY</p>
         */
        @NameInMap("type")
        public String type;

        public static ProbeMcpOriginRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginRequestBody self = new ProbeMcpOriginRequestBody();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginRequestBody setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ProbeMcpOriginRequestBody setAuth(ProbeMcpOriginRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public ProbeMcpOriginRequestBodyAuth getAuth() {
            return this.auth;
        }

        public ProbeMcpOriginRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public ProbeMcpOriginRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
