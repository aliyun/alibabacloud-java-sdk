// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersRequest extends TeaModel {
    /**
     * <p>Specifies whether automatic payment is applied to all products specified in the Products parameter. Valid values:</p>
     * <ul>
     * <li>true: automatic payment</li>
     * <li>false: no automatic payment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The list of products to purchase, separated by commas.</p>
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
         * <p>Object Storage Service (OSS)</p>
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
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled.</li>
         * <li>false: Auto-renewal is disabled.</li>
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
         * <p>The purchase duration. This parameter is used together with PricingCycle. Currently, only 1 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The list of instance property information.</p>
         * <ul>
         * <li>DataWorks_share:
         * [ {
         * &quot;Code&quot;: &quot;region&quot;,
         * &quot;Value&quot;: &quot;cn-shanghai&quot;
         * }
         * ]</li>
         * <li>OSS_share:
         * [ {
         * &quot;Code&quot;: &quot;commodity_type&quot;,
         * &quot;Value&quot;: &quot;oss&quot;,
         * &quot;Name&quot;: &quot;Object Storage Service (OSS)&quot;
         * },
         * {
         * &quot;Code&quot;: &quot;ord_time&quot;,
         * &quot;Value&quot;: &quot;1:Hour&quot;,
         * &quot;Name&quot;: &quot;1 hour&quot;
         * }
         * ]</li>
         * <li>PAI_share: None</li>
         * <li>MaxCompute_share for the Chinese site:
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
         * ]</li>
         * <li>MaxCompute_share for the international site:
         * [
         * {
         * &quot;Code&quot;: &quot;region&quot;,
         * &quot;Value&quot;: &quot;cn-hangzhou&quot;
         * },
         * {
         * &quot;Code&quot;: &quot;ord_time&quot;,
         * &quot;Value&quot;: &quot;1:Hour&quot;
         * }
         * ]</li>
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
         * <p>The pricing unit. Valid values:</p>
         * <ul>
         * <li>Month: Monthly pricing. Only DataWorks_share supports this value.</li>
         * <li>Hour: Hourly pricing. Only OSS_share and MaxCompute_share support this value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <p>The product code. Valid values:</p>
         * <ul>
         * <li>DataWorks_share: Pay-as-you-go DataWorks.</li>
         * <li>MaxCompute_share: Pay-as-you-go MaxCompute.</li>
         * <li>PAI_share: Pay-as-you-go PAI.</li>
         * <li>OSS_share: Pay-as-you-go OSS.</li>
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
