// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRiskInfo")
    public Boolean includeRiskInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jvs-xxxx</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static GetRuntimeChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeChannelRequest self = new GetRuntimeChannelRequest();
        return TeaModel.build(map, self);
    }

    public GetRuntimeChannelRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public GetRuntimeChannelRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public GetRuntimeChannelRequest setIncludeRiskInfo(Boolean includeRiskInfo) {
        this.includeRiskInfo = includeRiskInfo;
        return this;
    }
    public Boolean getIncludeRiskInfo() {
        return this.includeRiskInfo;
    }

    public GetRuntimeChannelRequest setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public GetRuntimeChannelRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
