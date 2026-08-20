// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>Serialized commodity information based on the specified OrderType. The CommodityType corresponding to each OrderType is as follows:</p>
     * <p>INSTANCE_BUY: InstanceBuyCommodity
     * INSTANCE_RENEW: InstanceRenewCommodity
     * INSTANCE_UPGRADE: InstanceUpgradeCommodity
     * The parameters in the example are described as follows:</p>
     * <p>productCode: The product code.
     * skuCode: The product specification code. For non-image products: prepay for subscription, postpay for pay-as-you-go. For image products: ECS for pay-as-you-go, Package for subscription.
     * components: Specification modules. The version package_version is required, and other modules depend on the product settings.
     * duration: Number of cycles, such as 1, 2, 3...
     * pricingCycle: Cycle unit. Day, Month, or Year.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;components&quot;:{&quot;package_version&quot;:&quot;yuncode12928000016&quot;},&quot;duration&quot;:1,&quot;pricingCycle&quot;:&quot;YEAR&quot;,&quot;productCode&quot;:&quot;cmgj01**28&quot;,&quot;quantity&quot;:1,&quot;skuCode&quot;:&quot;prepay&quot;}</p>
     */
    @NameInMap("Commodity")
    public String commodity;

    /**
     * <p>Order type. Valid values:</p>
     * <p>INSTANCE_BUY: Product purchase
     * INSTANCE_RENEW: Instance renewal
     * INSTANCE_UPGRADE: Instance upgrade
     * Note: For renewal-type price inquiries, you must pass InstanceId in the Commodity parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE_BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
