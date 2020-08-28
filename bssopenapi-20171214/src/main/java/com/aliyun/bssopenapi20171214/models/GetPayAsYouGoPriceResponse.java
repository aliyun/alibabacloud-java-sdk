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

    public static class GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail extends TeaModel {
        @NameInMap("ModuleCode")
        @Validation(required = true)
        public String moduleCode;

        @NameInMap("OriginalCost")
        @Validation(required = true)
        public Double originalCost;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Double invoiceDiscount;

        @NameInMap("CostAfterDiscount")
        @Validation(required = true)
        public Double costAfterDiscount;

        @NameInMap("UnitPrice")
        @Validation(required = true)
        public Double unitPrice;

        public static GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail self = new GetPayAsYouGoPriceResponseDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
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

    }

    public static class GetPayAsYouGoPriceResponseDataPromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        @Validation(required = true)
        public java.util.List<GetPayAsYouGoPriceResponseDataPromotionDetailsPromotionDetail> promotionDetail;

        public static GetPayAsYouGoPriceResponseDataPromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceResponseDataPromotionDetails self = new GetPayAsYouGoPriceResponseDataPromotionDetails();
            return TeaModel.build(map, self);
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

    }

}
