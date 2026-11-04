// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The JSON configuration of the custom agent. You must specify the name, artifact, roleArn, and runtime parameters.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>Idempotence is currently not guaranteed. Do not rely on this parameter to prevent duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-agent-request-20261010-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCustomAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentShrinkRequest self = new CreateCustomAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateCustomAgentShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
