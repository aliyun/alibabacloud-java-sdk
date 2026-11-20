// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallMcpMarketItemShrinkRequest extends TeaModel {
    /**
     * <p>The MCP configuration submitted when installing the template. The configuration must comply with the input schema of the template.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The reserved query request identifier. The console backend does not read this parameter and does not provide idempotency guarantees for deduplication or restoration of original processing results based on this identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The version of the template to install. You can call GetMcpMarketItem to query available versions.</p>
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
