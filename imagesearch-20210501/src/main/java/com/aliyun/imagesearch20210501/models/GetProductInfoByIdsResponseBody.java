// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class GetProductInfoByIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetProductInfoByIdsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProductInfoByIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductInfoByIdsResponseBody self = new GetProductInfoByIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductInfoByIdsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetProductInfoByIdsResponseBody setData(GetProductInfoByIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductInfoByIdsResponseBodyData getData() {
        return this.data;
    }

    public GetProductInfoByIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductInfoByIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductInfoByIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission extends TeaModel {
        @NameInMap("MaxCommissionClickUrl")
        public String maxCommissionClickUrl;

        @NameInMap("MaxCommissionCouponShareUrl")
        public String maxCommissionCouponShareUrl;

        @NameInMap("MaxCommissionRate")
        public String maxCommissionRate;

        public static GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission build(java.util.Map<String, ?> map) throws Exception {
            GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission self = new GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission();
            return TeaModel.build(map, self);
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission setMaxCommissionClickUrl(String maxCommissionClickUrl) {
            this.maxCommissionClickUrl = maxCommissionClickUrl;
            return this;
        }
        public String getMaxCommissionClickUrl() {
            return this.maxCommissionClickUrl;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission setMaxCommissionCouponShareUrl(String maxCommissionCouponShareUrl) {
            this.maxCommissionCouponShareUrl = maxCommissionCouponShareUrl;
            return this;
        }
        public String getMaxCommissionCouponShareUrl() {
            return this.maxCommissionCouponShareUrl;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission setMaxCommissionRate(String maxCommissionRate) {
            this.maxCommissionRate = maxCommissionRate;
            return this;
        }
        public String getMaxCommissionRate() {
            return this.maxCommissionRate;
        }

    }

    public static class GetProductInfoByIdsResponseBodyDataAuctionsResult extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CommissionRate")
        public String commissionRate;

        @NameInMap("CouponAmount")
        public Integer couponAmount;

        @NameInMap("CouponEndTime")
        public String couponEndTime;

        @NameInMap("CouponInfo")
        public String couponInfo;

        @NameInMap("CouponRemainCount")
        public Integer couponRemainCount;

        @NameInMap("CouponShareUrl")
        public String couponShareUrl;

        @NameInMap("CouponStartFee")
        public String couponStartFee;

        @NameInMap("CouponStartTime")
        public String couponStartTime;

        @NameInMap("CouponTotalCount")
        public String couponTotalCount;

        @NameInMap("DeeplinkCouponShareUrl")
        public String deeplinkCouponShareUrl;

        @NameInMap("DeeplinkUrl")
        public String deeplinkUrl;

        @NameInMap("InputItemId")
        public String inputItemId;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("LevelOneCategoryName")
        public String levelOneCategoryName;

        @NameInMap("MaxCommission")
        public GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission maxCommission;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("PriceAfterCoupon")
        public String priceAfterCoupon;

        @NameInMap("Provcity")
        public String provcity;

        @NameInMap("ReservePrice")
        public String reservePrice;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("ShopTitle")
        public String shopTitle;

        @NameInMap("ShortTitle")
        public String shortTitle;

        @NameInMap("SubTitle")
        public String subTitle;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        @NameInMap("UserType")
        public Integer userType;

        @NameInMap("Volume")
        public Integer volume;

        @NameInMap("ZkFinalPrice")
        public String zkFinalPrice;

        public static GetProductInfoByIdsResponseBodyDataAuctionsResult build(java.util.Map<String, ?> map) throws Exception {
            GetProductInfoByIdsResponseBodyDataAuctionsResult self = new GetProductInfoByIdsResponseBodyDataAuctionsResult();
            return TeaModel.build(map, self);
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCommissionRate(String commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }
        public String getCommissionRate() {
            return this.commissionRate;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponAmount(Integer couponAmount) {
            this.couponAmount = couponAmount;
            return this;
        }
        public Integer getCouponAmount() {
            return this.couponAmount;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponEndTime(String couponEndTime) {
            this.couponEndTime = couponEndTime;
            return this;
        }
        public String getCouponEndTime() {
            return this.couponEndTime;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponInfo(String couponInfo) {
            this.couponInfo = couponInfo;
            return this;
        }
        public String getCouponInfo() {
            return this.couponInfo;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponRemainCount(Integer couponRemainCount) {
            this.couponRemainCount = couponRemainCount;
            return this;
        }
        public Integer getCouponRemainCount() {
            return this.couponRemainCount;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponShareUrl(String couponShareUrl) {
            this.couponShareUrl = couponShareUrl;
            return this;
        }
        public String getCouponShareUrl() {
            return this.couponShareUrl;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponStartFee(String couponStartFee) {
            this.couponStartFee = couponStartFee;
            return this;
        }
        public String getCouponStartFee() {
            return this.couponStartFee;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponStartTime(String couponStartTime) {
            this.couponStartTime = couponStartTime;
            return this;
        }
        public String getCouponStartTime() {
            return this.couponStartTime;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setCouponTotalCount(String couponTotalCount) {
            this.couponTotalCount = couponTotalCount;
            return this;
        }
        public String getCouponTotalCount() {
            return this.couponTotalCount;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setDeeplinkCouponShareUrl(String deeplinkCouponShareUrl) {
            this.deeplinkCouponShareUrl = deeplinkCouponShareUrl;
            return this;
        }
        public String getDeeplinkCouponShareUrl() {
            return this.deeplinkCouponShareUrl;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setDeeplinkUrl(String deeplinkUrl) {
            this.deeplinkUrl = deeplinkUrl;
            return this;
        }
        public String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setInputItemId(String inputItemId) {
            this.inputItemId = inputItemId;
            return this;
        }
        public String getInputItemId() {
            return this.inputItemId;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setLevelOneCategoryName(String levelOneCategoryName) {
            this.levelOneCategoryName = levelOneCategoryName;
            return this;
        }
        public String getLevelOneCategoryName() {
            return this.levelOneCategoryName;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setMaxCommission(GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission maxCommission) {
            this.maxCommission = maxCommission;
            return this;
        }
        public GetProductInfoByIdsResponseBodyDataAuctionsResultMaxCommission getMaxCommission() {
            return this.maxCommission;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setPriceAfterCoupon(String priceAfterCoupon) {
            this.priceAfterCoupon = priceAfterCoupon;
            return this;
        }
        public String getPriceAfterCoupon() {
            return this.priceAfterCoupon;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setProvcity(String provcity) {
            this.provcity = provcity;
            return this;
        }
        public String getProvcity() {
            return this.provcity;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setShopTitle(String shopTitle) {
            this.shopTitle = shopTitle;
            return this;
        }
        public String getShopTitle() {
            return this.shopTitle;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setShortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
            return this;
        }
        public String getShortTitle() {
            return this.shortTitle;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

        public GetProductInfoByIdsResponseBodyDataAuctionsResult setZkFinalPrice(String zkFinalPrice) {
            this.zkFinalPrice = zkFinalPrice;
            return this;
        }
        public String getZkFinalPrice() {
            return this.zkFinalPrice;
        }

    }

    public static class GetProductInfoByIdsResponseBodyDataAuctions extends TeaModel {
        @NameInMap("RankScore")
        public Float rankScore;

        @NameInMap("Result")
        public GetProductInfoByIdsResponseBodyDataAuctionsResult result;

        public static GetProductInfoByIdsResponseBodyDataAuctions build(java.util.Map<String, ?> map) throws Exception {
            GetProductInfoByIdsResponseBodyDataAuctions self = new GetProductInfoByIdsResponseBodyDataAuctions();
            return TeaModel.build(map, self);
        }

        public GetProductInfoByIdsResponseBodyDataAuctions setRankScore(Float rankScore) {
            this.rankScore = rankScore;
            return this;
        }
        public Float getRankScore() {
            return this.rankScore;
        }

        public GetProductInfoByIdsResponseBodyDataAuctions setResult(GetProductInfoByIdsResponseBodyDataAuctionsResult result) {
            this.result = result;
            return this;
        }
        public GetProductInfoByIdsResponseBodyDataAuctionsResult getResult() {
            return this.result;
        }

    }

    public static class GetProductInfoByIdsResponseBodyData extends TeaModel {
        @NameInMap("Auctions")
        public java.util.List<GetProductInfoByIdsResponseBodyDataAuctions> auctions;

        public static GetProductInfoByIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductInfoByIdsResponseBodyData self = new GetProductInfoByIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductInfoByIdsResponseBodyData setAuctions(java.util.List<GetProductInfoByIdsResponseBodyDataAuctions> auctions) {
            this.auctions = auctions;
            return this;
        }
        public java.util.List<GetProductInfoByIdsResponseBodyDataAuctions> getAuctions() {
            return this.auctions;
        }

    }

}
