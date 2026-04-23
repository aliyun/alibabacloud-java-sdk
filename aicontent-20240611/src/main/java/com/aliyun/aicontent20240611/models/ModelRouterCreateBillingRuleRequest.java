// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBillingRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>token_tiered</p>
     */
    @NameInMap("billingType")
    public String billingType;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("effectiveTime")
    public String effectiveTime;

    /**
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("pricingConfig")
    public Object pricingConfig;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    public static ModelRouterCreateBillingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateBillingRuleRequest self = new ModelRouterCreateBillingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateBillingRuleRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public ModelRouterCreateBillingRuleRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModelRouterCreateBillingRuleRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ModelRouterCreateBillingRuleRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRouterCreateBillingRuleRequest setPricingConfig(Object pricingConfig) {
        this.pricingConfig = pricingConfig;
        return this;
    }
    public Object getPricingConfig() {
        return this.pricingConfig;
    }

    public ModelRouterCreateBillingRuleRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
