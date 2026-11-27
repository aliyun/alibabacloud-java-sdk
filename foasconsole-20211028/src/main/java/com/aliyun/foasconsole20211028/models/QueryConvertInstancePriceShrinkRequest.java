// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryConvertInstancePriceShrinkRequest extends TeaModel {
    /**
     * <p>The duration of the billing cycle.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The instance ID of the order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <p>The resource specifications of the workspace.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NamespaceResourceSpecs")
    public String namespaceResourceSpecsShrink;

    /**
     * <p>The billing cycle. Only Year and Month are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>500043499350689</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li>true: Uses a coupon.</li>
     * <li>false: Does not use a coupon.</li>
     * </ul>
     */
    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    public static QueryConvertInstancePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertInstancePriceShrinkRequest self = new QueryConvertInstancePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryConvertInstancePriceShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryConvertInstancePriceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryConvertInstancePriceShrinkRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public QueryConvertInstancePriceShrinkRequest setNamespaceResourceSpecsShrink(String namespaceResourceSpecsShrink) {
        this.namespaceResourceSpecsShrink = namespaceResourceSpecsShrink;
        return this;
    }
    public String getNamespaceResourceSpecsShrink() {
        return this.namespaceResourceSpecsShrink;
    }

    public QueryConvertInstancePriceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryConvertInstancePriceShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public QueryConvertInstancePriceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryConvertInstancePriceShrinkRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

}
