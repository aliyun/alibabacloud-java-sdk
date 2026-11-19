// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The JSON configuration of the custom code or image agent. You must specify name, artifact, roleArn, and runtime.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The idempotency token passed as a query parameter. This parameter is required when you explicitly submit a customImage or set container.type to custom. It is optional when you submit an ACR image or a code package. The token must be 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens. Reuse the same token for retries of the same submission. If you use the same token for different parameters, the request is rejected.</p>
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
