// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelTemplateRequest extends TeaModel {
    /**
     * <p>The agent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The name of the agent provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The description of the template group.</p>
     * 
     * <strong>example:</strong>
     * <p>Test model group</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the template group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model-template-001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The authorization scope. This parameter is optional and takes effect only for Common model groups. Valid values: ALL_USER and USER_MIXED. The value must be strictly uppercase. If this parameter is not specified, the default value for Common groups is USER_MIXED. For non-Common groups, this parameter is ignored and fixed to RESOURCE_MIXED.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_USER</p>
     */
    @NameInMap("RefScope")
    public String refScope;

    public static CreateModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelTemplateRequest self = new CreateModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelTemplateRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public CreateModelTemplateRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public CreateModelTemplateRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreateModelTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelTemplateRequest setRefScope(String refScope) {
        this.refScope = refScope;
        return this;
    }
    public String getRefScope() {
        return this.refScope;
    }

}
