// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceResponse extends TeaModel {
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
    public GetPayAsYouGoPriceResponseData data;

    public static GetPayAsYouGoPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceResponse self = new GetPayAsYouGoPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPayAsYouGoPriceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPayAsYouGoPriceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPayAsYouGoPriceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPayAsYouGoPriceResponse setData(GetPayAsYouGoPriceResponseData data) {
        this.data = data;
        return this;
    }
    public GetPayAsYouGoPriceResponseData getData() {
        return this.data;
    }

    public static class GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail extends TeaModel {
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

        public static GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail self = new GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class GetPayAsYouGoPriceResponseDataModuleDetails extends TeaModel {
        @NameInMap("ModuleDetail")
        @Validation(required = true)
        public java.util.List<GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail> moduleDetail;

        public static GetPayAsYouGoPriceResponseDataModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseDataModuleDetails self = new GetPayAsYouGoPriceResponseDataModuleDetails();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseDataModuleDetails setModuleDetail(java.util.List<GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail> moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public java.util.List<GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail> getModuleDetail() {
            return this.moduleDetail;
        }

    }

    public static class GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail extends TeaModel {
        @NameInMap("PromotionName")
        @Validation(required = true)
        public String promotionName;

        @NameInMap("PromotionDesc")
        @Validation(required = true)
        public String promotionDesc;

        @NameInMap("PromotionId")
        @Validation(required = true)
        public Long promotionId;

        public static GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail self = new GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

    }

    public static class GetPayAsYouGoPriceResponseDataPromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        @Validation(required = true)
        public java.util.List<GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail> promotionDetail;

        public static GetPayAsYouGoPriceResponseDataPromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseDataPromotionDetails self = new GetPayAsYouGoPriceResponseDataPromotionDetails();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseDataPromotionDetails setPromotionDetail(java.util.List<GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail> promotionDetail) {
            this.promotionDetail = promotionDetail;
            return this;
        }
        public java.util.List<GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail> getPromotionDetail() {
            return this.promotionDetail;
        }

    }

    public static class GetPayAsYouGoPriceResponseData extends TeaModel {
        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("ModuleDetails")
        @Validation(required = true)
        public GetPayAsYouGoPriceResponseDataModuleDetails moduleDetails;

        @NameInMap("PromotionDetails")
        @Validation(required = true)
        public GetPayAsYouGoPriceResponseDataPromotionDetails promotionDetails;

        public static GetPayAsYouGoPriceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseData self = new GetPayAsYouGoPriceResponseData();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetPayAsYouGoPriceResponseData setModuleDetails(GetPayAsYouGoPriceResponseDataModuleDetails moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public GetPayAsYouGoPriceResponseDataModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        public GetPayAsYouGoPriceResponseData setPromotionDetails(GetPayAsYouGoPriceResponseDataPromotionDetails promotionDetails) {
            this.promotionDetails = promotionDetails;
            return this;
        }
        public GetPayAsYouGoPriceResponseDataPromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

    }

}
