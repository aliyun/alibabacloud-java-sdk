// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityPriceRequest extends TeaModel {
    /**
     * <p>The commodity orders.</p>
     */
    @NameInMap("Orders")
    public java.util.List<DescribeCommodityPriceRequestOrders> orders;

    /**
     * <p>The coupon code.</p>
     * <br>
     * <p>>  This parameter is unavailable on the China site (aliyun.com).</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCommodityPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityPriceRequest self = new DescribeCommodityPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityPriceRequest setOrders(java.util.List<DescribeCommodityPriceRequestOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<DescribeCommodityPriceRequestOrders> getOrders() {
        return this.orders;
    }

    public DescribeCommodityPriceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public DescribeCommodityPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeCommodityPriceRequestOrdersComponentsProperties extends TeaModel {
        /**
         * <p>The code of the attribute.</p>
         * <br>
         * <p>The information varies based on the commodity module. Examples: **instance** (GA instance) and **ord_time** (subscription duration).</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value of the attribute.</p>
         * <br>
         * <p>The information varies based on the commodity module. Examples: **1:Month** (one-month subscription) and **instance_fee** (GA instance fee).</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCommodityPriceRequestOrdersComponentsProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceRequestOrdersComponentsProperties self = new DescribeCommodityPriceRequestOrdersComponentsProperties();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceRequestOrdersComponentsProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCommodityPriceRequestOrdersComponentsProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCommodityPriceRequestOrdersComponents extends TeaModel {
        /**
         * <p>The code of the commodity module.</p>
         * <br>
         * <p>The information varies based on the commodity module. Examples: **instance** (GA instance) and **ord_time** (subscription duration).</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The attributes of the commodity module.</p>
         * <br>
         * <p>The information varies based on the commodity module.</p>
         */
        @NameInMap("Properties")
        public java.util.List<DescribeCommodityPriceRequestOrdersComponentsProperties> properties;

        public static DescribeCommodityPriceRequestOrdersComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceRequestOrdersComponents self = new DescribeCommodityPriceRequestOrdersComponents();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceRequestOrdersComponents setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public DescribeCommodityPriceRequestOrdersComponents setProperties(java.util.List<DescribeCommodityPriceRequestOrdersComponentsProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<DescribeCommodityPriceRequestOrdersComponentsProperties> getProperties() {
            return this.properties;
        }

    }

    public static class DescribeCommodityPriceRequestOrders extends TeaModel {
        /**
         * <p>The billing method. Set the value to **PREPAY**, which specifies the subscription billing method.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code.</p>
         * <br>
         * <p>Examples for the China site (aliyun.com):</p>
         * <br>
         * <p>*   **ga_gapluspre_public_cn**: GA instance.</p>
         * <p>*   **ga_plusbwppre_public_cn**: basic bandwidth plan.</p>
         * <br>
         * <p>Examples for the international site (alibabacloud.com):</p>
         * <br>
         * <p>*   **ga_pluspre_public_intl**: GA instance.</p>
         * <p>*   **ga_bwppreintl_public_intl**: basic bandwidth plan.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The information about the commodity module.</p>
         * <br>
         * <p>The information varies based on the commodity module.</p>
         */
        @NameInMap("Components")
        public java.util.List<DescribeCommodityPriceRequestOrdersComponents> components;

        /**
         * <p>The subscription duration of the instance.</p>
         * <br>
         * <p>*   If the **PricingCycle** parameter is set to **Month**, the valid values of the Duration parameter are **1** to **9**.</p>
         * <p>*   If the **PricingCycle** parameter is set to **Year**, the valid values of the Duration parameter are **1** to **3**.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The type of order. Valid values:</p>
         * <br>
         * <p>*   **BUY**: purchase order</p>
         * <p>*   **RENEW**: renewal order</p>
         * <p>*   **UPGRADE**: upgrade order</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The billing cycle of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **Month**: billed on a monthly basis.</p>
         * <p>*   **Year**: billed on an annual basis.</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <p>The number of instances that you want to purchase.</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        public static DescribeCommodityPriceRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceRequestOrders self = new DescribeCommodityPriceRequestOrders();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceRequestOrders setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCommodityPriceRequestOrders setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeCommodityPriceRequestOrders setComponents(java.util.List<DescribeCommodityPriceRequestOrdersComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<DescribeCommodityPriceRequestOrdersComponents> getComponents() {
            return this.components;
        }

        public DescribeCommodityPriceRequestOrders setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCommodityPriceRequestOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribeCommodityPriceRequestOrders setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public DescribeCommodityPriceRequestOrders setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

}
