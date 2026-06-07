// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMcpServerShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CustomHeaders")
    public String customHeadersShrink;

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
    public String visibilityScopeShrink;

    public static UpdateMcpServerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpServerShrinkRequest self = new UpdateMcpServerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpServerShrinkRequest setCustomHeadersShrink(String customHeadersShrink) {
        this.customHeadersShrink = customHeadersShrink;
        return this;
    }
    public String getCustomHeadersShrink() {
        return this.customHeadersShrink;
    }

    public UpdateMcpServerShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMcpServerShrinkRequest setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    public String getTransport() {
        return this.transport;
    }

    public UpdateMcpServerShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateMcpServerShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public UpdateMcpServerShrinkRequest setVisibilityScopeShrink(String visibilityScopeShrink) {
        this.visibilityScopeShrink = visibilityScopeShrink;
        return this;
    }
    public String getVisibilityScopeShrink() {
        return this.visibilityScopeShrink;
    }

}
