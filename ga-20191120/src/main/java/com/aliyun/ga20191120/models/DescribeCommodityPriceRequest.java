// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityPriceRequest extends TeaModel {
    @NameInMap("Orders")
    public java.util.List<DescribeCommodityPriceRequestOrders> orders;

    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

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
        @NameInMap("Code")
        public String code;

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
        @NameInMap("ComponentCode")
        public String componentCode;

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
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Components")
        public java.util.List<DescribeCommodityPriceRequestOrdersComponents> components;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("PricingCycle")
        public String pricingCycle;

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
