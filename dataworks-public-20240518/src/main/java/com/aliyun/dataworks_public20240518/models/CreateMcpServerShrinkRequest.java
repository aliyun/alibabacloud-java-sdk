// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMcpServerShrinkRequest extends TeaModel {
    /**
     * <p>The connection configuration for the MCP Server.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>The name of the MCP Server. The name must be unique at the tenant level. It must start with a lowercase letter and contain only characters from <code>a-z</code>, <code>0-9</code>, <code>_</code>, and <code>-</code>.</p>
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
     * <p>The visibility scope. The required fields depend on the value of the <code>Visibility</code> parameter.</p>
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
