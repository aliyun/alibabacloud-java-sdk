// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetPayAsYouGoPriceResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPayAsYouGoPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceResponseBody self = new GetPayAsYouGoPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPayAsYouGoPriceResponseBody setData(GetPayAsYouGoPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPayAsYouGoPriceResponseBodyData getData() {
        return this.data;
    }

    public GetPayAsYouGoPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPayAsYouGoPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPayAsYouGoPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail extends TeaModel {
        /**
         * <p>The discount price.</p>
         */
        @NameInMap("CostAfterDiscount")
        public Float costAfterDiscount;

        /**
         * <p>The discount that was applied.</p>
         */
        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <p>The code of the pricing module.</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The original price.</p>
         */
        @NameInMap("OriginalCost")
        public Float originalCost;

        /**
         * <p>The unit price.</p>
         */
        @NameInMap("UnitPrice")
        public Float unitPrice;

        public static GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail self = new GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail setCostAfterDiscount(Float costAfterDiscount) {
            this.costAfterDiscount = costAfterDiscount;
            return this;
        }
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        public GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail setOriginalCost(Float originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Float getOriginalCost() {
            return this.originalCost;
        }

        public GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail setUnitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Float getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class GetPayAsYouGoPriceResponseBodyDataModuleDetails extends TeaModel {
        @NameInMap("ModuleDetail")
        public java.util.List<GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail> moduleDetail;

        public static GetPayAsYouGoPriceResponseBodyDataModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseBodyDataModuleDetails self = new GetPayAsYouGoPriceResponseBodyDataModuleDetails();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseBodyDataModuleDetails setModuleDetail(java.util.List<GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail> moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public java.util.List<GetPayAsYouGoPriceResponseBodyDataModuleDetailsModuleDetail> getModuleDetail() {
            return this.moduleDetail;
        }

    }

    public static class GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail extends TeaModel {
        /**
         * <p>The description of the discount.</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The ID of the discount.</p>
         */
        @NameInMap("PromotionId")
        public Long promotionId;

        /**
         * <p>The name of the discount.</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        public static GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail self = new GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class GetPayAsYouGoPriceResponseBodyDataPromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        public java.util.List<GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail> promotionDetail;

        public static GetPayAsYouGoPriceResponseBodyDataPromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseBodyDataPromotionDetails self = new GetPayAsYouGoPriceResponseBodyDataPromotionDetails();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseBodyDataPromotionDetails setPromotionDetail(java.util.List<GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail> promotionDetail) {
            this.promotionDetail = promotionDetail;
            return this;
        }
        public java.util.List<GetPayAsYouGoPriceResponseBodyDataPromotionDetailsPromotionDetail> getPromotionDetail() {
            return this.promotionDetail;
        }

    }

    public static class GetPayAsYouGoPriceResponseBodyData extends TeaModel {
        /**
         * <p>The type of the currency. Valid values:</p>
         * <br>
         * <p>*   CNY: Chinese Yuan</p>
         * <p>*   USD: US dollar</p>
         * <p>*   JPY: Japanese Yen</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The price details of the pricing module.</p>
         */
        @NameInMap("ModuleDetails")
        public GetPayAsYouGoPriceResponseBodyDataModuleDetails moduleDetails;

        /**
         * <p>The details of the discount.</p>
         */
        @NameInMap("PromotionDetails")
        public GetPayAsYouGoPriceResponseBodyDataPromotionDetails promotionDetails;

        public static GetPayAsYouGoPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseBodyData self = new GetPayAsYouGoPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetPayAsYouGoPriceResponseBodyData setModuleDetails(GetPayAsYouGoPriceResponseBodyDataModuleDetails moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public GetPayAsYouGoPriceResponseBodyDataModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        public GetPayAsYouGoPriceResponseBodyData setPromotionDetails(GetPayAsYouGoPriceResponseBodyDataPromotionDetails promotionDetails) {
            this.promotionDetails = promotionDetails;
            return this;
        }
        public GetPayAsYouGoPriceResponseBodyDataPromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

    }

}
