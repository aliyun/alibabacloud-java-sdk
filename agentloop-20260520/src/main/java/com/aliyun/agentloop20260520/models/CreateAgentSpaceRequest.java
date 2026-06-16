// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateAgentSpaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

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

    public static CreateAgentSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpaceRequest self = new CreateAgentSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpaceRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public CreateAgentSpaceRequest setCmsWorkspace(String cmsWorkspace) {
        this.cmsWorkspace = cmsWorkspace;
        return this;
    }
    public String getCmsWorkspace() {
        return this.cmsWorkspace;
    }

    public CreateAgentSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
