// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetResourcePackagePriceResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BBEF51A3-E933-4F40-A534-C673CBDB9C80</p>
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

    public static GetResourcePackagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceResponseBody self = new GetResourcePackagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcePackagePriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourcePackagePriceResponseBody setData(GetResourcePackagePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourcePackagePriceResponseBodyData getData() {
        return this.data;
    }

    public GetResourcePackagePriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class GetResourcePackagePriceResponseBodyDataPromotionsPromotion extends TeaModel {
        /**
         * <p>The ID of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>1000680914</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>A discount of 17% is offered if you purchase a resource plan for six months.</p>
         */
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
        /**
         * <p>The type of the currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discounted amount. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>215040</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1290240</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The details of the discount.</p>
         */
        @NameInMap("Promotions")
        public GetResourcePackagePriceResponseBodyDataPromotions promotions;

        /**
         * <p>The price at which the transaction is made. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1075200</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

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

        public GetResourcePackagePriceResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourcePackagePriceResponseBodyData setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourcePackagePriceResponseBodyData setPromotions(GetResourcePackagePriceResponseBodyDataPromotions promotions) {
            this.promotions = promotions;
            return this;
        }
        public GetResourcePackagePriceResponseBodyDataPromotions getPromotions() {
            return this.promotions;
        }

        public GetResourcePackagePriceResponseBodyData setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

}
