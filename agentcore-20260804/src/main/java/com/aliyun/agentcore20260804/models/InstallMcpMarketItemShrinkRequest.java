// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallMcpMarketItemShrinkRequest extends TeaModel {
    /**
     * <p>The MCP configuration submitted during template installation. The configuration must conform to the input schema of the template.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template version to install. You can call GetMcpMarketItem to query available versions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("templateVersion")
    public String templateVersion;

    public static InstallMcpMarketItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallMcpMarketItemShrinkRequest self = new InstallMcpMarketItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallMcpMarketItemShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public InstallMcpMarketItemShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InstallMcpMarketItemShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
