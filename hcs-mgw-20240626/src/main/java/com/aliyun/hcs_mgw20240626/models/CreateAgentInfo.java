// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateAgentInfo extends TeaModel {
    /**
     * <p>The method that is used to access the agent.\
     * Valid values: public and vpc.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("AgentEndpoint")
    public String agentEndpoint;

    /**
     * <p>The deployment mode of the agent.\
     * Set the value to default, which specifies the independent process mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DeployMethod")
    public String deployMethod;

    /**
     * <p>The name of the agent.\
     * The name can contain lowercase letters, digits, hyphens (-), and underscores (<em>). The name must be 3 to 63 characters in length. The name is case-sensitive and encoded in UTF-8. The name cannot start with a hyphen (-) or an underscore (</em>). You must specify a name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tags in the key:value format.\
     * The value can contain letters, digits, hyphens (-), underscores (_), and commas (,). The value can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The tunnel ID.</p>
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
