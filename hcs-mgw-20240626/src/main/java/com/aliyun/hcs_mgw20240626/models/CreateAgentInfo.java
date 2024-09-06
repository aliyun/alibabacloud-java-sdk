// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateAgentInfo extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("AgentEndpoint")
    public String agentEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DeployMethod")
    public String deployMethod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tunnel_id</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    public static CreateAgentInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentInfo self = new CreateAgentInfo();
        return TeaModel.build(map, self);
    }

    public CreateAgentInfo setAgentEndpoint(String agentEndpoint) {
        this.agentEndpoint = agentEndpoint;
        return this;
    }
    public String getAgentEndpoint() {
        return this.agentEndpoint;
    }

    public CreateAgentInfo setDeployMethod(String deployMethod) {
        this.deployMethod = deployMethod;
        return this;
    }
    public String getDeployMethod() {
        return this.deployMethod;
    }

    public CreateAgentInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentInfo setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateAgentInfo setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

}
