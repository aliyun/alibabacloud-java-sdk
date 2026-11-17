// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMcpServerShrinkRequest extends TeaModel {
    /**
     * <p>The connection configuration of the MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Transport&quot;:&quot;SSE&quot;,&quot;Url&quot;:&quot;<a href="https://example.com/mcp/sse%22,%22CustomHeaders%22:%7B%7D%7D">https://example.com/mcp/sse&quot;,&quot;CustomHeaders&quot;:{}}</a></p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>The name of the MCP server. The name must be unique at the tenant level. It must start with a lowercase letter and can contain only lowercase letters, digits, underscores (_), and hyphens (-).</p>
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
     * <p>The visibility scope. Specify the corresponding field based on the value of Visibility.</p>
     */
    @NameInMap("VisibilityScope")
    public String visibilityScopeShrink;

    public static CreateMcpServerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServerShrinkRequest self = new CreateMcpServerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpServerShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public CreateMcpServerShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMcpServerShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateMcpServerShrinkRequest setVisibilityScopeShrink(String visibilityScopeShrink) {
        this.visibilityScopeShrink = visibilityScopeShrink;
        return this;
    }
    public String getVisibilityScopeShrink() {
        return this.visibilityScopeShrink;
    }

}
