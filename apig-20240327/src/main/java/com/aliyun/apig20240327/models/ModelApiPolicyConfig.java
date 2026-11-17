// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelApiPolicyConfig extends TeaModel {
    /**
     * <p>The AI security protection settings.</p>
     */
    @NameInMap("aiSecurityGuardConfig")
    public AiSecurityGuardConfig aiSecurityGuardConfig;

    /**
     * <p>The AI observability and request log configuration.</p>
     */
    @NameInMap("aiStatisticsConfig")
    public AiStatisticsConfig aiStatisticsConfig;

    /**
     * <p>Specifies whether to enable the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The policy type. Only AiStatistics and AiSecurityGuard are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AiStatistics</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelApiPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
        ModelApiPolicyConfig self = new ModelApiPolicyConfig();
        return TeaModel.build(map, self);
    }

    public ModelApiPolicyConfig setAiSecurityGuardConfig(AiSecurityGuardConfig aiSecurityGuardConfig) {
        this.aiSecurityGuardConfig = aiSecurityGuardConfig;
        return this;
    }
    public AiSecurityGuardConfig getAiSecurityGuardConfig() {
        return this.aiSecurityGuardConfig;
    }

    public ModelApiPolicyConfig setAiStatisticsConfig(AiStatisticsConfig aiStatisticsConfig) {
        this.aiStatisticsConfig = aiStatisticsConfig;
        return this;
    }
    public AiStatisticsConfig getAiStatisticsConfig() {
        return this.aiStatisticsConfig;
    }

    public ModelApiPolicyConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModelApiPolicyConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
