// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantMemoryConfigRequest extends TeaModel {
    /**
     * <p>The business platform to which the agent belongs. Specify the platform that corresponds to the tenant memory configuration, such as the enterprise platform <code>ENTERPRISE</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider. Used together with AgentPlatform and BizType to locate the memory configuration. A configured business combination must be used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type code. Used together with the provider and business platform. Common values include <code>1</code> (Enterprise Edition), <code>10</code> (Personal Edition), and <code>20</code> (Commercial Edition).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>Specifies whether to enable the memory feature for the business combination. A value of <code>true</code> enables the feature, and <code>false</code> disables it. If this parameter is omitted, the current status is retained.</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    public static ModifyTenantMemoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantMemoryConfigRequest self = new ModifyTenantMemoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantMemoryConfigRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ModifyTenantMemoryConfigRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ModifyTenantMemoryConfigRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ModifyTenantMemoryConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
