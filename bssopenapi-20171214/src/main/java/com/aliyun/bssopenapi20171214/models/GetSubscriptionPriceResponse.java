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

    public static class GetSubscriptionPriceResponseDataModuleDetailsModuleDetail extends TeaModel {
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

        public static GetSubscriptionPriceResponseDataModuleDetailsModuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseDataModuleDetailsModuleDetail self = new GetSubscriptionPriceResponseDataModuleDetailsModuleDetail();
            return TeaModel.build(map, self);
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

    }

    public static class GetSubscriptionPriceResponseDataPromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        @Validation(required = true)
        public java.util.List<GetSubscriptionPriceResponseDataPromotionDetailsPromotionDetail> promotionDetail;

        public static GetSubscriptionPriceResponseDataPromotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceResponseDataPromotionDetails self = new GetSubscriptionPriceResponseDataPromotionDetails();
            return TeaModel.build(map, self);
        }

    }

    public static class GetSubscriptionPriceResponseData extends TeaModel {
        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Double originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Double discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Double tradePrice;

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

    }

}
