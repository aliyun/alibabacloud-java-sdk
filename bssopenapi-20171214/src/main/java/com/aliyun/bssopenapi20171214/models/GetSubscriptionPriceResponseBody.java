// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidConfigCod</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the service price.</p>
     */
    @NameInMap("Data")
    public GetSubscriptionPriceResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>30E7066E-AE6F-4E59-AFE6-11386CE3AFA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSubscriptionPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceResponseBody self = new GetSubscriptionPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionPriceResponseBody setData(GetSubscriptionPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionPriceResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail extends TeaModel {
        /**
         * <p>The discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CostAfterDiscount")
        public Float costAfterDiscount;

        /**
         * <p>The discount that was applied.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <p>The identifier of the pricing module.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageCode</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The original price of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OriginalCost")
        public Float originalCost;

        /**
         * <p>The unit price.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnitPrice")
        public Float unitPrice;

        public static GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail self = new GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class GetSubscriptionPriceResponseBodyDataModuleDetails extends TeaModel {
        @NameInMap("ModuleDetail")
        public java.util.List<GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail> moduleDetail;

        public static GetSubscriptionPriceResponseBodyDataModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyDataModuleDetails self = new GetSubscriptionPriceResponseBodyDataModuleDetails();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetails setModuleDetail(java.util.List<GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail> moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public java.util.List<GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail> getModuleDetail() {
            return this.moduleDetail;
        }

    }

    public static class GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail extends TeaModel {
        /**
         * <p>The description of the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The ID of the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1021199213</p>
         */
        @NameInMap("PromotionId")
        public Long promotionId;

        /**
         * <p>The name of the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        public static GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail self = new GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class GetSubscriptionPriceResponseBodyDataPromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        public java.util.List<GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail> promotionDetail;

        public static GetSubscriptionPriceResponseBodyDataPromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyDataPromotionDetails self = new GetSubscriptionPriceResponseBodyDataPromotionDetails();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyDataPromotionDetails setPromotionDetail(java.util.List<GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail> promotionDetail) {
            this.promotionDetail = promotionDetail;
            return this;
        }
        public java.util.List<GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail> getPromotionDetail() {
            return this.promotionDetail;
        }

    }

    public static class GetSubscriptionPriceResponseBodyData extends TeaModel {
        /**
         * <p>The type of currency. Valid values:</p>
         * <ul>
         * <li>CNY: Chinese Yuan</li>
         * <li>USD: US dollar</li>
         * <li>JPY: Japanese Yen</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount that was applied.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The price details of the pricing module.</p>
         */
        @NameInMap("ModuleDetails")
        public GetSubscriptionPriceResponseBodyDataModuleDetails moduleDetails;

        /**
         * <p>The original price of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The details of the discount.</p>
         */
        @NameInMap("PromotionDetails")
        public GetSubscriptionPriceResponseBodyDataPromotionDetails promotionDetails;

        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <p>The discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static GetSubscriptionPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyData self = new GetSubscriptionPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetSubscriptionPriceResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetSubscriptionPriceResponseBodyData setModuleDetails(GetSubscriptionPriceResponseBodyDataModuleDetails moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public GetSubscriptionPriceResponseBodyDataModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        public GetSubscriptionPriceResponseBodyData setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetSubscriptionPriceResponseBodyData setPromotionDetails(GetSubscriptionPriceResponseBodyDataPromotionDetails promotionDetails) {
            this.promotionDetails = promotionDetails;
            return this;
        }
        public GetSubscriptionPriceResponseBodyDataPromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

        public GetSubscriptionPriceResponseBodyData setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetSubscriptionPriceResponseBodyData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

}
