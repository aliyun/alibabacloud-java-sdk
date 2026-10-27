// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The update configuration for the custom agent. Provide at least one top-level field. Omitted top-level fields retain their original values. When providing a configuration object, specify its required subfields and include any optional configurations that you want to retain. Arrays are replaced as a whole.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>Idempotence is not currently guaranteed. Do not rely on this parameter to prevent duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-agent-request-20261010-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateCustomAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentShrinkRequest self = new UpdateCustomAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateCustomAgentShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
