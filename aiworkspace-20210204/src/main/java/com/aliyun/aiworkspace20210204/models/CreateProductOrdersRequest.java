// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersRequest extends TeaModel {
    // 是否自动购买所有产品
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // 逗号分隔的产品
    @NameInMap("Products")
    public CreateProductOrdersRequestProducts products;

    public static CreateProductOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductOrdersRequest self = new CreateProductOrdersRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductOrdersRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateProductOrdersRequest setProducts(CreateProductOrdersRequestProducts products) {
        this.products = products;
        return this;
    }
    public CreateProductOrdersRequestProducts getProducts() {
        return this.products;
    }

    public static class CreateProductOrdersRequestProductsInstanceProperties extends TeaModel {
        // 代号
        @NameInMap("Code")
        public String code;

        // 名
        @NameInMap("Name")
        public String name;

        // 值
        @NameInMap("Value")
        public String value;

        public static CreateProductOrdersRequestProductsInstanceProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateProductOrdersRequestProductsInstanceProperties self = new CreateProductOrdersRequestProductsInstanceProperties();
            return TeaModel.build(map, self);
        }

        public CreateProductOrdersRequestProductsInstanceProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateProductOrdersRequestProductsInstanceProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProductOrdersRequestProductsInstanceProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateProductOrdersRequestProducts extends TeaModel {
        // 是否自动续费
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        // 付费类型
        @NameInMap("ChargeType")
        public String chargeType;

        // 购买时长,与pricingCycle配合使用
        @NameInMap("Duration")
        public Long duration;

        // 实例属性信息
        @NameInMap("InstanceProperties")
        public java.util.List<CreateProductOrdersRequestProductsInstanceProperties> instanceProperties;

        // 订单类型
        @NameInMap("OrderType")
        public String orderType;

        // 计价单位
        @NameInMap("PricingCycle")
        public String pricingCycle;

        // 产品code
        @NameInMap("ProductCode")
        public String productCode;

        public static CreateProductOrdersRequestProducts build(java.util.Map<String, ?> map) throws Exception {
            CreateProductOrdersRequestProducts self = new CreateProductOrdersRequestProducts();
            return TeaModel.build(map, self);
        }

        public CreateProductOrdersRequestProducts setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateProductOrdersRequestProducts setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateProductOrdersRequestProducts setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public CreateProductOrdersRequestProducts setInstanceProperties(java.util.List<CreateProductOrdersRequestProductsInstanceProperties> instanceProperties) {
            this.instanceProperties = instanceProperties;
            return this;
        }
        public java.util.List<CreateProductOrdersRequestProductsInstanceProperties> getInstanceProperties() {
            return this.instanceProperties;
        }

        public CreateProductOrdersRequestProducts setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public CreateProductOrdersRequestProducts setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public CreateProductOrdersRequestProducts setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
