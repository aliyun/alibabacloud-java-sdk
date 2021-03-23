// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetSubscriptionPriceResponseBodyData data;

    public static GetSubscriptionPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceResponseBody self = new GetSubscriptionPriceResponseBody();
        return TeaModel.build(map, self);
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

    public GetSubscriptionPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionPriceResponseBody setData(GetSubscriptionPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionPriceResponseBodyData getData() {
        return this.data;
    }

    public static class GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("OriginalCost")
        public Float originalCost;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("CostAfterDiscount")
        public Float costAfterDiscount;

        @NameInMap("UnitPrice")
        public Float unitPrice;

        public static GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail self = new GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
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

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetSubscriptionPriceResponseBodyDataModuleDetailsModuleDetail setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
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
        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionDesc")
        public String promotionDesc;

        @NameInMap("PromotionId")
        public Long promotionId;

        public static GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail self = new GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
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
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ModuleDetails")
        public GetSubscriptionPriceResponseBodyDataModuleDetails moduleDetails;

        @NameInMap("PromotionDetails")
        public GetSubscriptionPriceResponseBodyDataPromotionDetails promotionDetails;

        public static GetSubscriptionPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseBodyData self = new GetSubscriptionPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceResponseBodyData setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetSubscriptionPriceResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetSubscriptionPriceResponseBodyData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public GetSubscriptionPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetSubscriptionPriceResponseBodyData setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetSubscriptionPriceResponseBodyData setModuleDetails(GetSubscriptionPriceResponseBodyDataModuleDetails moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public GetSubscriptionPriceResponseBodyDataModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        public GetSubscriptionPriceResponseBodyData setPromotionDetails(GetSubscriptionPriceResponseBodyDataPromotionDetails promotionDetails) {
            this.promotionDetails = promotionDetails;
            return this;
        }
        public GetSubscriptionPriceResponseBodyDataPromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

    }

}
