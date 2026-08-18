// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMcpServerRequest extends TeaModel {
    /**
     * <p>The connection configuration of the MCP Server.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Config")
    public CreateMcpServerRequestConfig config;

    /**
     * <p>The name of the MCP Server. The name must be unique at the tenant level. It must start with a lowercase letter and can contain only <code>a-z</code>, <code>0-9</code>, <code>_</code>, and <code>-</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-server</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The visibility level.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The visibility scope. The corresponding field is used based on the Visibility value.</p>
     */
    @NameInMap("VisibilityScope")
    public CreateMcpServerRequestVisibilityScope visibilityScope;

    public static CreateMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServerRequest self = new CreateMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpServerRequest setConfig(CreateMcpServerRequestConfig config) {
        this.config = config;
        return this;
    }
    public CreateMcpServerRequestConfig getConfig() {
        return this.config;
    }

    public CreateMcpServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMcpServerRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateMcpServerRequest setVisibilityScope(CreateMcpServerRequestVisibilityScope visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }
    public CreateMcpServerRequestVisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static class CreateMcpServerRequestConfig extends TeaModel {
        /**
         * <p>The custom request headers (key-value pairs). Reserved headers cannot be overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomHeaders")
        public java.util.Map<String, ?> customHeaders;

        /**
         * <p>The transport protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
         * <p>The service URL of the MCP Server. The URL must start with <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp/sse">https://example.com/mcp/sse</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateMcpServerRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestConfig self = new CreateMcpServerRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestConfig setCustomHeaders(java.util.Map<String, ?> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public java.util.Map<String, ?> getCustomHeaders() {
            return this.customHeaders;
        }

        public CreateMcpServerRequestConfig setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public CreateMcpServerRequestConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMcpServerRequestVisibilityScope extends TeaModel {
        /**
         * <p>The list of project IDs that are visible. This parameter takes effect when Visibility is set to <code>PROJECT</code>.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>The list of user IDs that are visible. This parameter takes effect when Visibility is set to <code>USER</code>.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateMcpServerRequestVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestVisibilityScope self = new CreateMcpServerRequestVisibilityScope();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public CreateMcpServerRequestVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
