// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list data.</p>
     */
    @NameInMap("items")
    public java.util.List<ListMcpsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Request processed successfully</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListMcpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpsResponseBody self = new ListMcpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMcpsResponseBody setItems(java.util.List<ListMcpsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMcpsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMcpsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcpsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMcpsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMcpsResponseBodyItemsAuthDirectProxy extends TeaModel {
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

        public static ListMcpsResponseBodyItemsAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuthDirectProxy self = new ListMcpsResponseBodyItemsAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpsResponseBodyItemsAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMcpsResponseBodyItemsAuthHttpToMcp extends TeaModel {
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

        public static ListMcpsResponseBodyItemsAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuthHttpToMcp self = new ListMcpsResponseBodyItemsAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMcpsResponseBodyItemsAuth extends TeaModel {
        /**
         * <p>The direct proxy authentication configuration.</p>
         */
        @NameInMap("directProxy")
        public ListMcpsResponseBodyItemsAuthDirectProxy directProxy;

        /**
         * <p>Indicates whether authentication is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<ListMcpsResponseBodyItemsAuthHttpToMcp> httpToMcp;

        public static ListMcpsResponseBodyItemsAuth build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuth self = new ListMcpsResponseBodyItemsAuth();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuth setDirectProxy(ListMcpsResponseBodyItemsAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public ListMcpsResponseBodyItemsAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public ListMcpsResponseBodyItemsAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMcpsResponseBodyItemsAuth setHttpToMcp(java.util.List<ListMcpsResponseBodyItemsAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<ListMcpsResponseBodyItemsAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class ListMcpsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. enabled indicates whether authentication is enabled. directProxy specifies the custom authentication header for direct proxy. httpToMcp specifies the list of OpenAPI credentials for HTTP_TO_MCP.</p>
         */
        @NameInMap("auth")
        public ListMcpsResponseBodyItemsAuth auth;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

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

        public static ListMcpsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItems self = new ListMcpsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItems setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListMcpsResponseBodyItems setAuth(ListMcpsResponseBodyItemsAuth auth) {
            this.auth = auth;
            return this;
        }
        public ListMcpsResponseBodyItemsAuth getAuth() {
            return this.auth;
        }

        public ListMcpsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpsResponseBodyItems setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public ListMcpsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpsResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListMcpsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMcpsResponseBodyItems setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListMcpsResponseBodyItems setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public ListMcpsResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
