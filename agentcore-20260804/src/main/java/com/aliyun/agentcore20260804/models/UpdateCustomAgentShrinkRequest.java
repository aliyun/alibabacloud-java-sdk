// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>The update configuration of the custom agent. Provide at least one top-level field. Omitted top-level fields retain their original values. When artifact retains the existing source, partial subfields can be updated. Provide compute and sessionPolicy for runtime based on the structure, and include the complete hpa to be retained. Replace environment.variables and other arrays with the complete lists.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The idempotency token for the submission. The token must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), colons (:), and hyphens (-). This parameter is required when you explicitly submit customImage. Once provided, the submission is recorded by tenant and workspace. Retrying with the same parameters returns the existing acceptance result. You must use a new token for different submission content. If this parameter is not provided, query the update status before retrying.</p>
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
