// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetPriceResponseBody extends TeaModel {
    /**
     * <p>The price.</p>
     */
    @NameInMap("price")
    public GetPriceResponseBodyPrice price;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPriceResponseBody self = new GetPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPriceResponseBody setPrice(GetPriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public GetPriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public GetPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPriceResponseBodyPriceModuleDetails extends TeaModel {
        /**
         * <p>The discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("costAfterDiscount")
        public Float costAfterDiscount;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("invoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <p>The code of the pricing module.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceRent</p>
         */
        @NameInMap("moduleCode")
        public String moduleCode;

        /**
         * <p>The name of the pricing module.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceRent</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.0</p>
         */
        @NameInMap("originalCost")
        public Float originalCost;

        /**
         * <p>The price type.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("priceType")
        public String priceType;

        public static GetPriceResponseBodyPriceModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPriceResponseBodyPriceModuleDetails self = new GetPriceResponseBodyPriceModuleDetails();
            return TeaModel.build(map, self);
        }

        public GetPriceResponseBodyPriceModuleDetails setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public GetPriceResponseBodyPriceModuleDetails setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetPriceResponseBodyPriceModuleDetails setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetPriceResponseBodyPriceModuleDetails setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetPriceResponseBodyPriceModuleDetails setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public GetPriceResponseBodyPriceModuleDetails setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

    }

    public static class GetPriceResponseBodyPricePromotionDetails extends TeaModel {
        /**
         * <p>The description of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>37284</p>
         */
        @NameInMap("promotionDesc")
        public String promotionDesc;

        /**
         * <p>The ID of the promotion.</p>
         */
        @NameInMap("promotionId")
        public Long promotionId;

        /**
         * <p>The name of the promotion.</p>
         */
        @NameInMap("promotionName")
        public String promotionName;

        public static GetPriceResponseBodyPricePromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPriceResponseBodyPricePromotionDetails self = new GetPriceResponseBodyPricePromotionDetails();
            return TeaModel.build(map, self);
        }

        public GetPriceResponseBodyPricePromotionDetails setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetPriceResponseBodyPricePromotionDetails setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public GetPriceResponseBodyPricePromotionDetails setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class GetPriceResponseBodyPrice extends TeaModel {
        /**
         * <p>The currency type. Valid values: CNY: Chinese Yuan. USD: US dollar. JPY: Japanese Yen.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("discountPrice")
        public Float discountPrice;

        /**
         * <p>The order details of the pricing module.</p>
         */
        @NameInMap("moduleDetails")
        public java.util.List<GetPriceResponseBodyPriceModuleDetails> moduleDetails;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>760.0</p>
         */
        @NameInMap("originalPrice")
        public Float originalPrice;

        /**
         * <p>The details of the promotion.</p>
         */
        @NameInMap("promotionDetails")
        public java.util.List<GetPriceResponseBodyPricePromotionDetails> promotionDetails;

        /**
         * <p>The discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("tradePrice")
        public Float tradePrice;

        public static GetPriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            GetPriceResponseBodyPrice self = new GetPriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public GetPriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetPriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetPriceResponseBodyPrice setModuleDetails(java.util.List<GetPriceResponseBodyPriceModuleDetails> moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public java.util.List<GetPriceResponseBodyPriceModuleDetails> getModuleDetails() {
            return this.moduleDetails;
        }

        public GetPriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetPriceResponseBodyPrice setPromotionDetails(java.util.List<GetPriceResponseBodyPricePromotionDetails> promotionDetails) {
            this.promotionDetails = promotionDetails;
            return this;
        }
        public java.util.List<GetPriceResponseBodyPricePromotionDetails> getPromotionDetails() {
            return this.promotionDetails;
        }

        public GetPriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

}
