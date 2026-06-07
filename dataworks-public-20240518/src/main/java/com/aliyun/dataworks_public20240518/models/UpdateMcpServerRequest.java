// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMcpServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CustomHeaders")
    public java.util.Map<String, ?> customHeaders;

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

    /**
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("VisibilityScope")
    public UpdateMcpServerRequestVisibilityScope visibilityScope;

    public static UpdateMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpServerRequest self = new UpdateMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpServerRequest setCustomHeaders(java.util.Map<String, ?> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }
    public java.util.Map<String, ?> getCustomHeaders() {
        return this.customHeaders;
    }

    public UpdateMcpServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMcpServerRequest setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    public String getTransport() {
        return this.transport;
    }

    public UpdateMcpServerRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateMcpServerRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public UpdateMcpServerRequest setVisibilityScope(UpdateMcpServerRequestVisibilityScope visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }
    public UpdateMcpServerRequestVisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static class UpdateMcpServerRequestVisibilityScope extends TeaModel {
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateMcpServerRequestVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestVisibilityScope self = new UpdateMcpServerRequestVisibilityScope();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public UpdateMcpServerRequestVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
