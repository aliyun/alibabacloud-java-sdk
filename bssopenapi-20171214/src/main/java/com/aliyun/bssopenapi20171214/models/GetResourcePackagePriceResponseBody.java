// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetResourcePackagePriceResponseBodyData data;

    public static GetResourcePackagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceResponseBody self = new GetResourcePackagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcePackagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourcePackagePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetResourcePackagePriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourcePackagePriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourcePackagePriceResponseBody setData(GetResourcePackagePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourcePackagePriceResponseBodyData getData() {
        return this.data;
    }

    public static class GetResourcePackagePriceResponseBodyDataPromotionsPromotion extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static GetResourcePackagePriceResponseBodyDataPromotionsPromotion build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseBodyDataPromotionsPromotion self = new GetResourcePackagePriceResponseBodyDataPromotionsPromotion();
            return TeaModel.build(map, self);
        }

        public GetResourcePackagePriceResponseBodyDataPromotionsPromotion setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResourcePackagePriceResponseBodyDataPromotionsPromotion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetResourcePackagePriceResponseBodyDataPromotions extends TeaModel {
        @NameInMap("Promotion")
        public java.util.List<GetResourcePackagePriceResponseBodyDataPromotionsPromotion> promotion;

        public static GetResourcePackagePriceResponseBodyDataPromotions build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseBodyDataPromotions self = new GetResourcePackagePriceResponseBodyDataPromotions();
            return TeaModel.build(map, self);
        }

        public GetResourcePackagePriceResponseBodyDataPromotions setPromotion(java.util.List<GetResourcePackagePriceResponseBodyDataPromotionsPromotion> promotion) {
            this.promotion = promotion;
            return this;
        }
        public java.util.List<GetResourcePackagePriceResponseBodyDataPromotionsPromotion> getPromotion() {
            return this.promotion;
        }

    }

    public static class GetResourcePackagePriceResponseBodyData extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("Promotions")
        public GetResourcePackagePriceResponseBodyDataPromotions promotions;

        public static GetResourcePackagePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePackagePriceResponseBodyData self = new GetResourcePackagePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourcePackagePriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetResourcePackagePriceResponseBodyData setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourcePackagePriceResponseBodyData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public GetResourcePackagePriceResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourcePackagePriceResponseBodyData setPromotions(GetResourcePackagePriceResponseBodyDataPromotions promotions) {
            this.promotions = promotions;
            return this;
        }
        public GetResourcePackagePriceResponseBodyDataPromotions getPromotions() {
            return this.promotions;
        }

    }

}
