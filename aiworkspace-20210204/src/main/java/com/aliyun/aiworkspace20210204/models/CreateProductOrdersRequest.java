// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically pay for all products listed in the Products parameter.</p>
     * <ul>
     * <li><p>true: Enables automatic payment.</p>
     * </li>
     * <li><p>false: Disables automatic payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The list of products to purchase.</p>
     */
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
         * <p>The code of the instance property.</p>
         * 
         * <strong>example:</strong>
         * <p>commodity_type</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the instance property.</p>
         * 
         * <strong>example:</strong>
         * <p>Object Storage Service</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the instance property.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
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
         * <p>Specifies whether to enable auto-renewal.</p>
         * <ul>
         * <li><p>true: Enables auto-renewal.</p>
         * </li>
         * <li><p>false: Disables auto-renewal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The billing method. Currently, only POSTPAY is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The subscription duration. This parameter is used with PricingCycle. Currently, only a value of 1 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The list of instance properties.</p>
         * <ul>
         * <li><p>DataWorks_share:
         * [ {
         * &quot;Code&quot;: &quot;region&quot;,
         * &quot;Value&quot;: &quot;cn-shanghai&quot;
         * }
         * ]</p>
         * </li>
         * <li><p>OSS_share:
         * [ {
         * &quot;Code&quot;: &quot;commodity_type&quot;,
         * &quot;Value&quot;: &quot;oss&quot;,
         * &quot;Name&quot;: &quot;Object Storage Service&quot;
         * },
         * {
         * &quot;Code&quot;: &quot;ord_time&quot;,
         * &quot;Value&quot;: &quot;1:Hour&quot;,
         * &quot;Name&quot;: &quot;1 Hour&quot;
         * }
         * ]</p>
         * </li>
         * <li><p>PAI_share: None</p>
         * </li>
         * <li><p>MaxCompute_share for accounts in mainland China:
         * [
         * {
         * &quot;Code&quot;: &quot;region&quot;,
         * &quot;Value&quot;: &quot;cn-hangzhou&quot;
         * },
         * {
         * &quot;Code&quot;: &quot;odps_specification_type&quot;,
         * &quot;Value&quot;: &quot;OdpsStandard&quot;
         * },
         * {
         * &quot;Code&quot;: &quot;ord_time&quot;,
         * &quot;Value&quot;: &quot;1:Hour&quot;
         * }
         * ]</p>
         * </li>
         * <li><p>MaxCompute_share for accounts outside mainland China:
         * [
         * {
         * &quot;Code&quot;: &quot;region&quot;,
         * &quot;Value&quot;: &quot;cn-hangzhou&quot;
         * },
         * {
         * &quot;Code&quot;: &quot;ord_time&quot;,
         * &quot;Value&quot;: &quot;1:Hour&quot;
         * }
         * ]</p>
         * </li>
         * </ul>
         */
        @NameInMap("InstanceProperties")
        public java.util.List<CreateProductOrdersRequestProductsInstanceProperties> instanceProperties;

        /**
         * <p>The order type. Currently, only BUY is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The billing cycle. The following values are supported:</p>
         * <ul>
         * <li><p>Month: Monthly billing. Only DataWorks_share supports this value.</p>
         * </li>
         * <li><p>Hour: Hourly billing. Only OSS_share and MaxCompute_share support this value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <p>The product code. The following codes are supported:</p>
         * <ul>
         * <li><p>DataWorks_share: The pay-as-you-go DataWorks product.</p>
         * </li>
         * <li><p>MaxCompute_share: The pay-as-you-go MaxCompute product.</p>
         * </li>
         * <li><p>PAI_share: The pay-as-you-go PAI product.</p>
         * </li>
         * <li><p>OSS_share: The pay-as-you-go OSS product.</p>
         * </li>
         * </ul>
         * 
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
