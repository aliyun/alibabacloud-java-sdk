// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PriceInfo extends TeaModel {
    @NameInMap("Currency")
    public String currency;

    @NameInMap("DiscountPrice")
    public String discountPrice;

    @NameInMap("OriginalPrice")
    public String originalPrice;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PromotionResults")
    public java.util.List<PromotionInfo> promotionResults;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SpotInstanceTypeOriginalPrice")
    public String spotInstanceTypeOriginalPrice;

    @NameInMap("SpotInstanceTypePrice")
    public String spotInstanceTypePrice;

    @NameInMap("SpotOriginalPrice")
    public String spotOriginalPrice;

    @NameInMap("SpotPrice")
    public String spotPrice;

    @NameInMap("TaxPrice")
    public String taxPrice;

    @NameInMap("TradePrice")
    public String tradePrice;

    public static PriceInfo build(java.util.Map<String, ?> map) throws Exception {
        PriceInfo self = new PriceInfo();
        return TeaModel.build(map, self);
    }

    public PriceInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PriceInfo setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public String getDiscountPrice() {
        return this.discountPrice;
    }

    public PriceInfo setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public PriceInfo setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public PriceInfo setPromotionResults(java.util.List<PromotionInfo> promotionResults) {
        this.promotionResults = promotionResults;
        return this;
    }
    public java.util.List<PromotionInfo> getPromotionResults() {
        return this.promotionResults;
    }

    public PriceInfo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PriceInfo setSpotInstanceTypeOriginalPrice(String spotInstanceTypeOriginalPrice) {
        this.spotInstanceTypeOriginalPrice = spotInstanceTypeOriginalPrice;
        return this;
    }
    public String getSpotInstanceTypeOriginalPrice() {
        return this.spotInstanceTypeOriginalPrice;
    }

    public PriceInfo setSpotInstanceTypePrice(String spotInstanceTypePrice) {
        this.spotInstanceTypePrice = spotInstanceTypePrice;
        return this;
    }
    public String getSpotInstanceTypePrice() {
        return this.spotInstanceTypePrice;
    }

    public PriceInfo setSpotOriginalPrice(String spotOriginalPrice) {
        this.spotOriginalPrice = spotOriginalPrice;
        return this;
    }
    public String getSpotOriginalPrice() {
        return this.spotOriginalPrice;
    }

    public PriceInfo setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }
    public String getSpotPrice() {
        return this.spotPrice;
    }

    public PriceInfo setTaxPrice(String taxPrice) {
        this.taxPrice = taxPrice;
        return this;
    }
    public String getTaxPrice() {
        return this.taxPrice;
    }

    public PriceInfo setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public String getTradePrice() {
        return this.tradePrice;
    }

}
