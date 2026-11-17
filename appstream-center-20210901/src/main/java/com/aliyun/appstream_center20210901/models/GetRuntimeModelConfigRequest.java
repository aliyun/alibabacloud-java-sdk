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
     * <p>The model display language. Valid values: zh-CN, en-US, ja-JP, and zh-TW. The value is case-insensitive, and leading and trailing spaces are removed. If this parameter is not specified, left empty, or set to an unsupported value, the default value zh-CN is used. The model pool description mapping is returned based on the normalized interface language, and falls back to Chinese if a translation is missing. Bailian and existing dynamic configurations still use Chinese for zh-CN and zh-TW, and English for en-US and ja-JP. This parameter is used for the names and descriptions of system intelligence tiers, as well as general model descriptions. Template fallback text, custom names, and runtime configurations retain their original values. The values zh_CN, en_US, ja_JP, and zh_TW are also supported, and en and ja are compatible. The value is case-insensitive, and leading and trailing spaces are removed. An invalid language value falls back to Chinese and does not cause a parameter error to be returned for Language. The names and descriptions of the four system intelligence tiers (Auto, Standard, Advanced, and Ultimate) support all four languages, and Chinese is retained for missing Japanese and Traditional Chinese items. User template names retain their original values.</p>
     * 
     * <strong>example:</strong>
     * <p>en_US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The agent runtime ID. The ID mappings are as follows:</p>
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
     * <p>The agent runtime type.</p>
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
     * <li>Not specified: Returns both smart and non-smart models in the effective configuration.
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

    public GetRuntimeModelConfigRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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
