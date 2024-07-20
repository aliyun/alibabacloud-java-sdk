// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityPriceRequest extends TeaModel {
    /**
     * <p>The commodity orders.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Orders")
    public java.util.List<DescribeCommodityPriceRequestOrders> orders;

    /**
     * <p>The coupon code.</p>
     * <blockquote>
     * <p> This parameter is unavailable on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50003298014****</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>The code of the attribute of the commodity module.</p>
         * <p>The information varies based on the commodity module. Examples: <strong>instance</strong> (GA instance) and <strong>ord_time</strong> (subscription duration).</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value of the attribute.</p>
         * <p>The information varies based on the commodity module. Examples: <strong>instance_fee</strong> (GA instance fee) and <strong>1:Month</strong> (one-month subscription).</p>
         * 
         * <strong>example:</strong>
         * <p>instance_fee</p>
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
         * <p>The information varies based on the commodity module. Examples: <strong>instance</strong> (GA instance) and <strong>ord_time</strong> (subscription duration).</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The attributes of commodity modules.</p>
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
         * <p>The billing method. Set the value to <strong>PREPAY</strong>, which specifies the subscription billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code.</p>
         * <p>Valid values on the China site (aliyun.com):</p>
         * <ul>
         * <li><strong>ga_gapluspre_public_cn</strong>: GA instance.</li>
         * <li><strong>ga_plusbwppre_public_cn</strong>: basic bandwidth plan.</li>
         * </ul>
         * <p>Valid values on the international site (alibabacloud.com):</p>
         * <ul>
         * <li><strong>ga_pluspre_public_intl</strong>: GA instance.</li>
         * <li><strong>ga_bwppreintl_public_intl:</strong> basic bandwidth plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ga_gapluspre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The information about commodity modules.</p>
         * <p>The information varies based on the commodity module.</p>
         */
        @NameInMap("Components")
        public java.util.List<DescribeCommodityPriceRequestOrdersComponents> components;

        /**
         * <p>The subscription duration.</p>
         * <ul>
         * <li>Valid values if you set <strong>PricingCycle</strong> to <strong>Month</strong>: <strong>1</strong> to <strong>9</strong>.</li>
         * <li>Valid values if you set <strong>PricingCycle</strong> to <strong>Year</strong>: <strong>1</strong> to <strong>3</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The type of the order. Valid values:</p>
         * <ul>
         * <li><strong>BUY</strong>: purchase order.</li>
         * <li><strong>RENEW</strong>: renewal order.</li>
         * <li><strong>UPGRADE</strong>: upgrade order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The billing cycle. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong></li>
         * <li><strong>Year</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <p>The number of instances that you want to purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
