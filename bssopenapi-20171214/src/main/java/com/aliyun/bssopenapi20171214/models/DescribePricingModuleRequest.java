// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The service code. You can query the service code by calling the **QueryProductList** operation.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service. You can query the service type by calling the **QueryProductList** operation.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: subscription</p>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribePricingModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleRequest self = new DescribePricingModuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribePricingModuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePricingModuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePricingModuleRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribePricingModuleRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
