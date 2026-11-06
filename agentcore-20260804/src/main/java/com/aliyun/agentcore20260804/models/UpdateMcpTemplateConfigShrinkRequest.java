// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMcpTemplateConfigShrinkRequest extends TeaModel {
    /**
     * <p>The MCP configuration updated based on the specified template version, which must comply with the input schema of the template.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The reserved query request identifier. The current console backend does not read this parameter and does not provide idempotency guarantees such as deduplication or restoring the original processing result based on this identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template version used for this update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("templateVersion")
    public String templateVersion;

    public static UpdateMcpTemplateConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpTemplateConfigShrinkRequest self = new UpdateMcpTemplateConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpTemplateConfigShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateMcpTemplateConfigShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateMcpTemplateConfigShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
