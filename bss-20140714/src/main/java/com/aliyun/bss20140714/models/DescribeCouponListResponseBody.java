// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCouponListResponseBody extends TeaModel {
    @NameInMap("Coupons")
    public DescribeCouponListResponseBodyCoupons coupons;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCouponListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponListResponseBody self = new DescribeCouponListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCouponListResponseBody setCoupons(DescribeCouponListResponseBodyCoupons coupons) {
        this.coupons = coupons;
        return this;
    }
    public DescribeCouponListResponseBodyCoupons getCoupons() {
        return this.coupons;
    }

    public DescribeCouponListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCouponListResponseBodyCouponsCouponProductCodes extends TeaModel {
        @NameInMap("ProductCode")
        public java.util.List<String> productCode;

        public static DescribeCouponListResponseBodyCouponsCouponProductCodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseBodyCouponsCouponProductCodes self = new DescribeCouponListResponseBodyCouponsCouponProductCodes();
            return TeaModel.build(map, self);
        }

        public DescribeCouponListResponseBodyCouponsCouponProductCodes setProductCode(java.util.List<String> productCode) {
            this.productCode = productCode;
            return this;
        }
        public java.util.List<String> getProductCode() {
            return this.productCode;
        }

    }

    public static class DescribeCouponListResponseBodyCouponsCouponTradeTypes extends TeaModel {
        @NameInMap("TradeType")
        public java.util.List<String> tradeType;

        public static DescribeCouponListResponseBodyCouponsCouponTradeTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseBodyCouponsCouponTradeTypes self = new DescribeCouponListResponseBodyCouponsCouponTradeTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCouponListResponseBodyCouponsCouponTradeTypes setTradeType(java.util.List<String> tradeType) {
            this.tradeType = tradeType;
            return this;
        }
        public java.util.List<String> getTradeType() {
            return this.tradeType;
        }

    }

    public static class DescribeCouponListResponseBodyCouponsCoupon extends TeaModel {
        @NameInMap("Application")
        public String application;

        @NameInMap("BalanceAmount")
        public String balanceAmount;

        @NameInMap("CouponNumber")
        public String couponNumber;

        @NameInMap("CouponTemplateId")
        public Long couponTemplateId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredAmount")
        public String expiredAmount;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("FrozenAmount")
        public String frozenAmount;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("PriceLimit")
        public String priceLimit;

        @NameInMap("ProductCodes")
        public DescribeCouponListResponseBodyCouponsCouponProductCodes productCodes;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalAmount")
        public String totalAmount;

        @NameInMap("TradeTypes")
        public DescribeCouponListResponseBodyCouponsCouponTradeTypes tradeTypes;

        public static DescribeCouponListResponseBodyCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseBodyCouponsCoupon self = new DescribeCouponListResponseBodyCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribeCouponListResponseBodyCouponsCoupon setApplication(String application) {
            this.application = application;
            return this;
        }
        public String getApplication() {
            return this.application;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setBalanceAmount(String balanceAmount) {
            this.balanceAmount = balanceAmount;
            return this;
        }
        public String getBalanceAmount() {
            return this.balanceAmount;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setCouponNumber(String couponNumber) {
            this.couponNumber = couponNumber;
            return this;
        }
        public String getCouponNumber() {
            return this.couponNumber;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setCouponTemplateId(Long couponTemplateId) {
            this.couponTemplateId = couponTemplateId;
            return this;
        }
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setExpiredAmount(String expiredAmount) {
            this.expiredAmount = expiredAmount;
            return this;
        }
        public String getExpiredAmount() {
            return this.expiredAmount;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setFrozenAmount(String frozenAmount) {
            this.frozenAmount = frozenAmount;
            return this;
        }
        public String getFrozenAmount() {
            return this.frozenAmount;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setProductCodes(DescribeCouponListResponseBodyCouponsCouponProductCodes productCodes) {
            this.productCodes = productCodes;
            return this;
        }
        public DescribeCouponListResponseBodyCouponsCouponProductCodes getProductCodes() {
            return this.productCodes;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeCouponListResponseBodyCouponsCoupon setTradeTypes(DescribeCouponListResponseBodyCouponsCouponTradeTypes tradeTypes) {
            this.tradeTypes = tradeTypes;
            return this;
        }
        public DescribeCouponListResponseBodyCouponsCouponTradeTypes getTradeTypes() {
            return this.tradeTypes;
        }

    }

    public static class DescribeCouponListResponseBodyCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribeCouponListResponseBodyCouponsCoupon> coupon;

        public static DescribeCouponListResponseBodyCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseBodyCoupons self = new DescribeCouponListResponseBodyCoupons();
            return TeaModel.build(map, self);
        }

        public DescribeCouponListResponseBodyCoupons setCoupon(java.util.List<DescribeCouponListResponseBodyCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribeCouponListResponseBodyCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

}
