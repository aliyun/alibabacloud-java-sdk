// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ActivateTemplateMCPRequest extends TeaModel {
    @NameInMap("enabledTools")
    public java.util.List<String> enabledTools;

    /**
     * <strong>example:</strong>
     * <p>streamable-http</p>
     */
    @NameInMap("transport")
    public String transport;

    public static ActivateTemplateMCPRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateTemplateMCPRequest self = new ActivateTemplateMCPRequest();
        return TeaModel.build(map, self);
    }

    public ActivateTemplateMCPRequest setEnabledTools(java.util.List<String> enabledTools) {
        this.enabledTools = enabledTools;
        return this;
    }
    public java.util.List<String> getEnabledTools() {
        return this.enabledTools;
    }

    public ActivateTemplateMCPRequest setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    public String getTransport() {
        return this.transport;
    }

}
