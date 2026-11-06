// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The update configuration of the custom code or image agent. You must provide at least one top-level field. Omitted top-level fields retain their original values. When submitting <code>artifact</code>, specify <code>port</code> and the required fields for the corresponding artifact source. When submitting <code>runtime</code>, specify <code>compute</code> and <code>sessionPolicy</code>, and include the complete <code>hpa</code> that needs to be retained. <code>environment.variables</code> and other arrays are replaced as complete lists.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The idempotency token passed through query parameters. Required when explicitly submitting customImage or container.type=custom. Optional for ACR image and code package submissions. The length is 1 to 128 characters. Letters, digits, periods, underscores, colons, and hyphens are allowed. Reuse the same token for retries of the same submission. Using the same token for different parameters is rejected.</p>
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
