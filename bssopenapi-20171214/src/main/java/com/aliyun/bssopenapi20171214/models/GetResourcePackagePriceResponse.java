// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceResponse extends TeaModel {
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
    public GetResourcePackagePriceResponseData data;

    public static GetResourcePackagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceResponse self = new GetResourcePackagePriceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetResourcePackagePriceResponseDataPromotionsPromotion extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetResourcePackagePriceResponseDataPromotionsPromotion build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseDataPromotionsPromotion self = new GetResourcePackagePriceResponseDataPromotionsPromotion();
            return TeaModel.build(map, self);
        }

    }

    public static class GetResourcePackagePriceResponseDataPromotions extends TeaModel {
        @NameInMap("Promotion")
        @Validation(required = true)
        public java.util.List<GetResourcePackagePriceResponseDataPromotionsPromotion> promotion;

        public static GetResourcePackagePriceResponseDataPromotions build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseDataPromotions self = new GetResourcePackagePriceResponseDataPromotions();
            return TeaModel.build(map, self);
        }

    }

    public static class GetResourcePackagePriceResponseData extends TeaModel {
        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Double originalPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Double tradePrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Double discountPrice;

        @NameInMap("Promotions")
        @Validation(required = true)
        public GetResourcePackagePriceResponseDataPromotions promotions;

        public static GetResourcePackagePriceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseData self = new GetResourcePackagePriceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
