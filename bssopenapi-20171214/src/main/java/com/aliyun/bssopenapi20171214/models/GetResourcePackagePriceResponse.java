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

    public GetResourcePackagePriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourcePackagePriceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetResourcePackagePriceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourcePackagePriceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourcePackagePriceResponse setData(GetResourcePackagePriceResponseData data) {
        this.data = data;
        return this;
    }
    public GetResourcePackagePriceResponseData getData() {
        return this.data;
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

        public GetResourcePackagePriceResponseDataPromotionsPromotion setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResourcePackagePriceResponseDataPromotionsPromotion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public GetResourcePackagePriceResponseDataPromotions setPromotion(java.util.List<GetResourcePackagePriceResponseDataPromotionsPromotion> promotion) {
            this.promotion = promotion;
            return this;
        }
        public java.util.List<GetResourcePackagePriceResponseDataPromotionsPromotion> getPromotion() {
            return this.promotion;
        }

    }

    public static class GetResourcePackagePriceResponseData extends TeaModel {
        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

        @NameInMap("Promotions")
        @Validation(required = true)
        public GetResourcePackagePriceResponseDataPromotions promotions;

        public static GetResourcePackagePriceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseData self = new GetResourcePackagePriceResponseData();
            return TeaModel.build(map, self);
        }

        public GetResourcePackagePriceResponseData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetResourcePackagePriceResponseData setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourcePackagePriceResponseData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public GetResourcePackagePriceResponseData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourcePackagePriceResponseData setPromotions(GetResourcePackagePriceResponseDataPromotions promotions) {
            this.promotions = promotions;
            return this;
        }
        public GetResourcePackagePriceResponseDataPromotions getPromotions() {
            return this.promotions;
        }

    }

}
