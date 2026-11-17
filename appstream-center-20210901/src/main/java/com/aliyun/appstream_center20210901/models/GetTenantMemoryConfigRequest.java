// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetTenantMemoryConfigRequest extends TeaModel {
    /**
     * <p>This parameter is not enabled. Do not specify this parameter. The current API operation queries tenant configurations by provider, business platform, and business type. The example is used to illustrate the field status.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A (not enabled)</p>
     */
    @NameInMap("AgentInstanceId")
    public String agentInstanceId;

    /**
     * <p>The business platform to which the agent belongs. Specify the platform corresponding to the tenant memory configuration, such as the enterprise platform <code>ENTERPRISE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider. This parameter is used together with AgentPlatform and BizType to locate the memory configuration. You must use a configured business combination.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type code. This parameter is used together with the provider and business platform. Common values include <code>1</code> (Enterprise Edition), <code>10</code> (Personal Edition), and <code>20</code> (Commercial Edition).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    public static GetTenantMemoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTenantMemoryConfigRequest self = new GetTenantMemoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetTenantMemoryConfigRequest setAgentInstanceId(String agentInstanceId) {
        this.agentInstanceId = agentInstanceId;
        return this;
    }
    public String getAgentInstanceId() {
        return this.agentInstanceId;
    }

    public GetTenantMemoryConfigRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public GetTenantMemoryConfigRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public GetTenantMemoryConfigRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

}
