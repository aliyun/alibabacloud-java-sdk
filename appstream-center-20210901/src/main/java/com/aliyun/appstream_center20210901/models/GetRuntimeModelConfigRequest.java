// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeModelConfigRequest extends TeaModel {
    /**
     * <p>The agent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>Specifies whether to include risk information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRiskInfo")
    public Boolean includeRiskInfo;

    /**
     * <p>The ID of the agent runtime. The ID mappings are as follows:</p>
     * <p>JVS Computer: JVS Computer ID, in the format of jvs-xxxx.</p>
     * <p>OpenClaw: Cloud desktop ID, in the format of ecd-xxxx.</p>
     * <p>Hermes Agent: Hermes Agent ID, in the format of jvs-xxxx.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-xxxx</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <p>The type of the agent runtime.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    /**
     * <p>The smart model filter. Valid values:</p>
     * <ul>
     * <li>true: Queries the system wuying-preset provider models based on the business type of the runtime.</li>
     * <li>false: Excludes wuying-preset from the effective configuration.</li>
     * <li>Empty: Returns both smart and non-smart models in the effective configuration.
     * The business type is read by the server from runtime.biz_type, and the BizType input parameter is not required. Risk information is still independently controlled by IncludeRiskInfo.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SmartModel")
    public Boolean smartModel;

    public static GetRuntimeModelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeModelConfigRequest self = new GetRuntimeModelConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetRuntimeModelConfigRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public GetRuntimeModelConfigRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public GetRuntimeModelConfigRequest setIncludeRiskInfo(Boolean includeRiskInfo) {
        this.includeRiskInfo = includeRiskInfo;
        return this;
    }
    public Boolean getIncludeRiskInfo() {
        return this.includeRiskInfo;
    }

    public GetRuntimeModelConfigRequest setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public GetRuntimeModelConfigRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public GetRuntimeModelConfigRequest setSmartModel(Boolean smartModel) {
        this.smartModel = smartModel;
        return this;
    }
    public Boolean getSmartModel() {
        return this.smartModel;
    }

}
