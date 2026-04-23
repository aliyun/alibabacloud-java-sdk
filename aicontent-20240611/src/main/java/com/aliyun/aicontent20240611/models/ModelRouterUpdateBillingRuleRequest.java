// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateBillingRuleRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("pricingConfig")
    public Object pricingConfig;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    public static ModelRouterUpdateBillingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateBillingRuleRequest self = new ModelRouterUpdateBillingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateBillingRuleRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public ModelRouterUpdateBillingRuleRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModelRouterUpdateBillingRuleRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ModelRouterUpdateBillingRuleRequest setPricingConfig(Object pricingConfig) {
        this.pricingConfig = pricingConfig;
        return this;
    }
    public Object getPricingConfig() {
        return this.pricingConfig;
    }

    public ModelRouterUpdateBillingRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModelRouterUpdateBillingRuleRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
