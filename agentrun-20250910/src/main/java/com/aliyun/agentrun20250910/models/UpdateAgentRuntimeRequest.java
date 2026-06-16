// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeRequest extends TeaModel {
    /**
     * <p>The input parameters for updating an agent runtime.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateAgentRuntimeInput body;

    public static UpdateAgentRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRuntimeRequest self = new UpdateAgentRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRuntimeRequest setBody(UpdateAgentRuntimeInput body) {
        this.body = body;
        return this;
    }
    public UpdateAgentRuntimeInput getBody() {
        return this.body;
    }

}
