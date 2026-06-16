// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateAgentSpaceRequest extends TeaModel {
    @NameInMap("cmsWorkspace")
    public String cmsWorkspace;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAgentSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSpaceRequest self = new UpdateAgentSpaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSpaceRequest setCmsWorkspace(String cmsWorkspace) {
        this.cmsWorkspace = cmsWorkspace;
        return this;
    }
    public String getCmsWorkspace() {
        return this.cmsWorkspace;
    }

    public UpdateAgentSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAgentSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
