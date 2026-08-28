// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallWorkspacePluginShrinkRequest extends TeaModel {
    /**
     * <p>The request body for installing a plugin.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-plugin-install-20260810-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static InstallWorkspacePluginShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallWorkspacePluginShrinkRequest self = new InstallWorkspacePluginShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallWorkspacePluginShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public InstallWorkspacePluginShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
