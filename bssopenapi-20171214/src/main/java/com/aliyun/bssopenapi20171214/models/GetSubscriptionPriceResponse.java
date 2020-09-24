// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetSubscriptionPriceResponseData data;

    public static GetSubscriptionPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceResponse self = new GetSubscriptionPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionPriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionPriceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSubscriptionPriceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionPriceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionPriceResponse setData(GetSubscriptionPriceResponseData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionPriceResponseData getData() {
        return this.data;
    }

    public static class GetSubscriptionPriceResponseDataModuleDetailsModuleDetail extends TeaModel {
        @NameInMap("ModuleCode")
        @Validation(required = true)
        public String moduleCode;

        @NameInMap("OriginalCost")
        @Validation(required = true)
        public Float originalCost;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Float invoiceDiscount;

        @NameInMap("CostAfterDiscount")
        @Validation(required = true)
        public Float costAfterDiscount;

        @NameInMap("UnitPrice")
        @Validation(required = true)
        public Float unitPrice;

        public static GetSubscriptionPriceResponseDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseDataModuleDetailsModuleDetail self = new GetSubscriptionPriceResponseDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseDataModuleDetailsModuleDetail setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSubscriptionPriceResponseDataModuleDetailsModuleDetail setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public GetSubscriptionPriceResponseDataModuleDetailsModuleDetail setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetSubscriptionPriceResponseDataModuleDetailsModuleDetail setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public GetSubscriptionPriceResponseDataModuleDetailsModuleDetail setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class GetSubscriptionPriceResponseDataModuleDetails extends TeaModel {
        @NameInMap("ModuleDetail")
        @Validation(required = true)
        public java.util.List<GetSubscriptionPriceResponseDataModuleDetailsModuleDetail> moduleDetail;

        public static GetSubscriptionPriceResponseDataModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseDataModuleDetails self = new GetSubscriptionPriceResponseDataModuleDetails();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseDataModuleDetails setModuleDetail(java.util.List<GetSubscriptionPriceResponseDataModuleDetailsModuleDetail> moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public java.util.List<GetSubscriptionPriceResponseDataModuleDetailsModuleDetail> getModuleDetail() {
            return this.moduleDetail;
        }

    }

    public static class GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail extends TeaModel {
        @NameInMap("PromotionName")
        @Validation(required = true)
        public String promotionName;

        @NameInMap("PromotionDesc")
        @Validation(required = true)
        public String promotionDesc;

        @NameInMap("PromotionId")
        @Validation(required = true)
        public Long promotionId;

        public static GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail self = new GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

    }

    public static class GetSubscriptionPriceResponseDataPromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        @Validation(required = true)
        public java.util.List<GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail> promotionDetail;

        public static GetSubscriptionPriceResponseDataPromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseDataPromotionDetails self = new GetSubscriptionPriceResponseDataPromotionDetails();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseDataPromotionDetails setPromotionDetail(java.util.List<GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail> promotionDetail) {
            this.promotionDetail = promotionDetail;
            return this;
        }
        public java.util.List<GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail> getPromotionDetail() {
            return this.promotionDetail;
        }

    }

    public static class GetSubscriptionPriceResponseData extends TeaModel {
        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("ModuleDetails")
        @Validation(required = true)
        public GetSubscriptionPriceResponseDataModuleDetails moduleDetails;

        @NameInMap("PromotionDetails")
        @Validation(required = true)
        public GetSubscriptionPriceResponseDataPromotionDetails promotionDetails;

        public static GetSubscriptionPriceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseData self = new GetSubscriptionPriceResponseData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseData setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetSubscriptionPriceResponseData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetSubscriptionPriceResponseData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public GetSubscriptionPriceResponseData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetSubscriptionPriceResponseData setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetSubscriptionPriceResponseData setModuleDetails(GetSubscriptionPriceResponseDataModuleDetails moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public GetSubscriptionPriceResponseDataModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        public GetSubscriptionPriceResponseData setPromotionDetails(GetSubscriptionPriceResponseDataPromotionDetails promotionDetails) {
            this.promotionDetails = promotionDetails;
            return this;
        }
        public GetSubscriptionPriceResponseDataPromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

    }

}
