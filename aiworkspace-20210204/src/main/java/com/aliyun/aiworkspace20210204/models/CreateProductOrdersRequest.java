// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Products")
    public java.util.List<CreateProductOrdersRequestProducts> products;

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

    public CreateProductOrdersRequest setProducts(java.util.List<CreateProductOrdersRequestProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<CreateProductOrdersRequestProducts> getProducts() {
        return this.products;
    }

    public static class CreateProductOrdersRequestProductsInstanceProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>commodity_type。</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>oss。</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("InstanceProperties")
        public java.util.List<CreateProductOrdersRequestProductsInstanceProperties> instanceProperties;

        /**
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <strong>example:</strong>
         * <p>DataWorks_share</p>
         */
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
