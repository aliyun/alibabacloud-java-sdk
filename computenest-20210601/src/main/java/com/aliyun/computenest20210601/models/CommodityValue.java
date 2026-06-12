// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CommodityValue extends TeaModel {
    /**
     * <p>The Result model.</p>
     */
    @NameInMap("Result")
    public CommodityValueResult result;

    public static CommodityValue build(java.util.Map<String, ?> map) throws Exception {
        CommodityValue self = new CommodityValue();
        return TeaModel.build(map, self);
    }

    public CommodityValue setResult(CommodityValueResult result) {
        this.result = result;
        return this;
    }
    public CommodityValueResult getResult() {
        return this.result;
    }

    public static class CommodityValueResultOrder extends TeaModel {
        /**
         * <p>The currency code.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount after the discount is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>9.99</p>
         */
        @NameInMap("TradeAmount")
        public String tradeAmount;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1.99</p>
         */
        @NameInMap("DiscountAmount")
        public String discountAmount;

        /**
         * <p>The original amount.</p>
         * 
         * <strong>example:</strong>
         * <p>11.98</p>
         */
        @NameInMap("OriginalAmount")
        public String originalAmount;

        public static CommodityValueResultOrder build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResultOrder self = new CommodityValueResultOrder();
            return TeaModel.build(map, self);
        }

        public CommodityValueResultOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CommodityValueResultOrder setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public CommodityValueResultOrder setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public CommodityValueResultOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

    }

    public static class CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs extends TeaModel {
        /**
         * <p>The attribute type. Valid values:</p>
         * <ol>
         * <li><p>1: product attribute</p>
         * </li>
         * <li><p>2: specification attribute</p>
         * </li>
         * <li><p>3: module attribute</p>
         * </li>
         * <li><p>4: external parameter (reserved)</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>20GB</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The attribute code.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_storage</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The unit of the value.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs self = new CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs();
            return TeaModel.build(map, self);
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class CommodityValueResultSubOrdersSubOrderModuleInstance extends TeaModel {
        /**
         * <p>The module ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ModuleId")
        public Long moduleId;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <p>数据库类型</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The module code.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_dbtype</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The original price of the product, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>10.00</p>
         */
        @NameInMap("TotalProductFee")
        public Double totalProductFee;

        /**
         * <p>The discount, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1.99</p>
         */
        @NameInMap("DiscountFee")
        public Double discountFee;

        /**
         * <p>The amount payable, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>8.01</p>
         */
        @NameInMap("PayFee")
        public Double payFee;

        /**
         * <p>The unit of the price.</p>
         * 
         * <strong>example:</strong>
         * <p>元/GB/小时</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>Indicates whether the module is a billing item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPricingModule")
        public Boolean isPricingModule;

        /**
         * <p>Indicates whether payment is required for the module in the order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedOrderPay")
        public Boolean needOrderPay;

        /**
         * <p>The pricing type.</p>
         * 
         * <strong>example:</strong>
         * <p>hourPrice</p>
         */
        @NameInMap("PriceType")
        public String priceType;

        /**
         * <p>The module attributes.</p>
         */
        @NameInMap("ModuleAttrs")
        public java.util.List<CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs> moduleAttrs;

        /**
         * <p>The English name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>数据单元</p>
         */
        @NameInMap("ModuleNameEn")
        public String moduleNameEn;

        /**
         * <p>The English name of the price unit.</p>
         * 
         * <strong>example:</strong>
         * <p>元/月</p>
         */
        @NameInMap("PriceUnitEn")
        public String priceUnitEn;

        public static CommodityValueResultSubOrdersSubOrderModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResultSubOrdersSubOrderModuleInstance self = new CommodityValueResultSubOrdersSubOrderModuleInstance();
            return TeaModel.build(map, self);
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setTotalProductFee(Double totalProductFee) {
            this.totalProductFee = totalProductFee;
            return this;
        }
        public Double getTotalProductFee() {
            return this.totalProductFee;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setDiscountFee(Double discountFee) {
            this.discountFee = discountFee;
            return this;
        }
        public Double getDiscountFee() {
            return this.discountFee;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setPayFee(Double payFee) {
            this.payFee = payFee;
            return this;
        }
        public Double getPayFee() {
            return this.payFee;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setIsPricingModule(Boolean isPricingModule) {
            this.isPricingModule = isPricingModule;
            return this;
        }
        public Boolean getIsPricingModule() {
            return this.isPricingModule;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setNeedOrderPay(Boolean needOrderPay) {
            this.needOrderPay = needOrderPay;
            return this;
        }
        public Boolean getNeedOrderPay() {
            return this.needOrderPay;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setModuleAttrs(java.util.List<CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs> moduleAttrs) {
            this.moduleAttrs = moduleAttrs;
            return this;
        }
        public java.util.List<CommodityValueResultSubOrdersSubOrderModuleInstanceModuleAttrs> getModuleAttrs() {
            return this.moduleAttrs;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setModuleNameEn(String moduleNameEn) {
            this.moduleNameEn = moduleNameEn;
            return this;
        }
        public String getModuleNameEn() {
            return this.moduleNameEn;
        }

        public CommodityValueResultSubOrdersSubOrderModuleInstance setPriceUnitEn(String priceUnitEn) {
            this.priceUnitEn = priceUnitEn;
            return this;
        }
        public String getPriceUnitEn() {
            return this.priceUnitEn;
        }

    }

    public static class CommodityValueResultSubOrdersSubOrder extends TeaModel {
        /**
         * <p>The module or instance information.</p>
         */
        @NameInMap("ModuleInstance")
        public java.util.List<CommodityValueResultSubOrdersSubOrderModuleInstance> moduleInstance;

        public static CommodityValueResultSubOrdersSubOrder build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResultSubOrdersSubOrder self = new CommodityValueResultSubOrdersSubOrder();
            return TeaModel.build(map, self);
        }

        public CommodityValueResultSubOrdersSubOrder setModuleInstance(java.util.List<CommodityValueResultSubOrdersSubOrderModuleInstance> moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public java.util.List<CommodityValueResultSubOrdersSubOrderModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

    }

    public static class CommodityValueResultSubOrders extends TeaModel {
        /**
         * <p>The sub-orders.</p>
         */
        @NameInMap("SubOrder")
        public java.util.List<CommodityValueResultSubOrdersSubOrder> subOrder;

        public static CommodityValueResultSubOrders build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResultSubOrders self = new CommodityValueResultSubOrders();
            return TeaModel.build(map, self);
        }

        public CommodityValueResultSubOrders setSubOrder(java.util.List<CommodityValueResultSubOrdersSubOrder> subOrder) {
            this.subOrder = subOrder;
            return this;
        }
        public java.util.List<CommodityValueResultSubOrdersSubOrder> getSubOrder() {
            return this.subOrder;
        }

    }

    public static class CommodityValueResultCoupons extends TeaModel {
        /**
         * <p>The payable amount.</p>
         * 
         * <strong>example:</strong>
         * <p>9.99</p>
         */
        @NameInMap("CanPromFee")
        public Double canPromFee;

        /**
         * <p>The description of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>10元优惠券（有效期至2024年9月8日）</p>
         */
        @NameInMap("CouponDesc")
        public String couponDesc;

        /**
         * <p>The name of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>10元优惠券</p>
         */
        @NameInMap("CouponName")
        public String couponName;

        /**
         * <p>The coupon number.</p>
         * 
         * <strong>example:</strong>
         * <p>50008800000xxxx</p>
         */
        @NameInMap("CouponOptionNo")
        public String couponOptionNo;

        /**
         * <p>Indicates whether the coupon is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static CommodityValueResultCoupons build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResultCoupons self = new CommodityValueResultCoupons();
            return TeaModel.build(map, self);
        }

        public CommodityValueResultCoupons setCanPromFee(Double canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public Double getCanPromFee() {
            return this.canPromFee;
        }

        public CommodityValueResultCoupons setCouponDesc(String couponDesc) {
            this.couponDesc = couponDesc;
            return this;
        }
        public String getCouponDesc() {
            return this.couponDesc;
        }

        public CommodityValueResultCoupons setCouponName(String couponName) {
            this.couponName = couponName;
            return this;
        }
        public String getCouponName() {
            return this.couponName;
        }

        public CommodityValueResultCoupons setCouponOptionNo(String couponOptionNo) {
            this.couponOptionNo = couponOptionNo;
            return this;
        }
        public String getCouponOptionNo() {
            return this.couponOptionNo;
        }

        public CommodityValueResultCoupons setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class CommodityValueResult extends TeaModel {
        /**
         * <p>The order information.</p>
         */
        @NameInMap("Order")
        public CommodityValueResultOrder order;

        /**
         * <p>The inquiry type. Valid values:</p>
         * <ol>
         * <li><p>Buy: an inquiry for a new purchase.</p>
         * </li>
         * <li><p>ModificationBuy: an inquiry for an upgrade or downgrade.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Buy</p>
         */
        @NameInMap("InquiryType")
        public String inquiryType;

        /**
         * <p>The sub-orders.</p>
         */
        @NameInMap("SubOrders")
        public CommodityValueResultSubOrders subOrders;

        /**
         * <p>The coupons.</p>
         */
        @NameInMap("Coupons")
        public java.util.List<CommodityValueResultCoupons> coupons;

        public static CommodityValueResult build(java.util.Map<String, ?> map) throws Exception {
            CommodityValueResult self = new CommodityValueResult();
            return TeaModel.build(map, self);
        }

        public CommodityValueResult setOrder(CommodityValueResultOrder order) {
            this.order = order;
            return this;
        }
        public CommodityValueResultOrder getOrder() {
            return this.order;
        }

        public CommodityValueResult setInquiryType(String inquiryType) {
            this.inquiryType = inquiryType;
            return this;
        }
        public String getInquiryType() {
            return this.inquiryType;
        }

        public CommodityValueResult setSubOrders(CommodityValueResultSubOrders subOrders) {
            this.subOrders = subOrders;
            return this;
        }
        public CommodityValueResultSubOrders getSubOrders() {
            return this.subOrders;
        }

        public CommodityValueResult setCoupons(java.util.List<CommodityValueResultCoupons> coupons) {
            this.coupons = coupons;
            return this;
        }
        public java.util.List<CommodityValueResultCoupons> getCoupons() {
            return this.coupons;
        }

    }

}
