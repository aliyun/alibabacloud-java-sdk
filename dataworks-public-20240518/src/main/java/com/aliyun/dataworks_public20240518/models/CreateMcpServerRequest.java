// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMcpServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Config")
    public CreateMcpServerRequestConfig config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-server</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

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
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomHeaders")
        public java.util.Map<String, ?> customHeaders;

        /**
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
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
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

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
