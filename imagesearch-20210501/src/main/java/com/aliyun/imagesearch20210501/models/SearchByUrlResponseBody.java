// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SearchByUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PicInfo")
    public SearchByUrlResponseBodyPicInfo picInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchByUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchByUrlResponseBody self = new SearchByUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchByUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchByUrlResponseBody setData(SearchByUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchByUrlResponseBodyData getData() {
        return this.data;
    }

    public SearchByUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchByUrlResponseBody setPicInfo(SearchByUrlResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchByUrlResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchByUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchByUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchByUrlResponseBodyDataAuctionsResultMaxCommission extends TeaModel {
        @NameInMap("MaxCommissionRate")
        public String maxCommissionRate;

        @NameInMap("MaxCommissionClickUrl")
        public String maxCommissionClickUrl;

        @NameInMap("MaxCommissionCouponShareUrl")
        public String maxCommissionCouponShareUrl;

        public static SearchByUrlResponseBodyDataAuctionsResultMaxCommission build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyDataAuctionsResultMaxCommission self = new SearchByUrlResponseBodyDataAuctionsResultMaxCommission();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyDataAuctionsResultMaxCommission setMaxCommissionRate(String maxCommissionRate) {
            this.maxCommissionRate = maxCommissionRate;
            return this;
        }
        public String getMaxCommissionRate() {
            return this.maxCommissionRate;
        }

        public SearchByUrlResponseBodyDataAuctionsResultMaxCommission setMaxCommissionClickUrl(String maxCommissionClickUrl) {
            this.maxCommissionClickUrl = maxCommissionClickUrl;
            return this;
        }
        public String getMaxCommissionClickUrl() {
            return this.maxCommissionClickUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResultMaxCommission setMaxCommissionCouponShareUrl(String maxCommissionCouponShareUrl) {
            this.maxCommissionCouponShareUrl = maxCommissionCouponShareUrl;
            return this;
        }
        public String getMaxCommissionCouponShareUrl() {
            return this.maxCommissionCouponShareUrl;
        }

    }

    public static class SearchByUrlResponseBodyDataAuctionsResult extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Title")
        public String title;

        @NameInMap("ShortTitle")
        public String shortTitle;

        @NameInMap("SubTitle")
        public String subTitle;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("ReservePrice")
        public String reservePrice;

        @NameInMap("ZkFinalPrice")
        public String zkFinalPrice;

        @NameInMap("PriceAfterCoupon")
        public String priceAfterCoupon;

        @NameInMap("UserType")
        public Integer userType;

        @NameInMap("Provcity")
        public String provcity;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("Volume")
        public Integer volume;

        @NameInMap("LevelOneCategoryName")
        public String levelOneCategoryName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CouponTotalCount")
        public String couponTotalCount;

        @NameInMap("CouponRemainCount")
        public Integer couponRemainCount;

        @NameInMap("CouponStartTime")
        public String couponStartTime;

        @NameInMap("CouponEndTime")
        public String couponEndTime;

        @NameInMap("CouponStartFee")
        public String couponStartFee;

        @NameInMap("CouponAmount")
        public Integer couponAmount;

        @NameInMap("CouponInfo")
        public String couponInfo;

        @NameInMap("CommissionRate")
        public String commissionRate;

        @NameInMap("CouponShareUrl")
        public String couponShareUrl;

        @NameInMap("DeeplinkCouponShareUrl")
        public String deeplinkCouponShareUrl;

        @NameInMap("Url")
        public String url;

        @NameInMap("DeeplinkUrl")
        public String deeplinkUrl;

        @NameInMap("ShopTitle")
        public String shopTitle;

        @NameInMap("MaxCommission")
        public SearchByUrlResponseBodyDataAuctionsResultMaxCommission maxCommission;

        public static SearchByUrlResponseBodyDataAuctionsResult build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyDataAuctionsResult self = new SearchByUrlResponseBodyDataAuctionsResult();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyDataAuctionsResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setShortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
            return this;
        }
        public String getShortTitle() {
            return this.shortTitle;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setZkFinalPrice(String zkFinalPrice) {
            this.zkFinalPrice = zkFinalPrice;
            return this;
        }
        public String getZkFinalPrice() {
            return this.zkFinalPrice;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setPriceAfterCoupon(String priceAfterCoupon) {
            this.priceAfterCoupon = priceAfterCoupon;
            return this;
        }
        public String getPriceAfterCoupon() {
            return this.priceAfterCoupon;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setProvcity(String provcity) {
            this.provcity = provcity;
            return this;
        }
        public String getProvcity() {
            return this.provcity;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setLevelOneCategoryName(String levelOneCategoryName) {
            this.levelOneCategoryName = levelOneCategoryName;
            return this;
        }
        public String getLevelOneCategoryName() {
            return this.levelOneCategoryName;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponTotalCount(String couponTotalCount) {
            this.couponTotalCount = couponTotalCount;
            return this;
        }
        public String getCouponTotalCount() {
            return this.couponTotalCount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponRemainCount(Integer couponRemainCount) {
            this.couponRemainCount = couponRemainCount;
            return this;
        }
        public Integer getCouponRemainCount() {
            return this.couponRemainCount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponStartTime(String couponStartTime) {
            this.couponStartTime = couponStartTime;
            return this;
        }
        public String getCouponStartTime() {
            return this.couponStartTime;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponEndTime(String couponEndTime) {
            this.couponEndTime = couponEndTime;
            return this;
        }
        public String getCouponEndTime() {
            return this.couponEndTime;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponStartFee(String couponStartFee) {
            this.couponStartFee = couponStartFee;
            return this;
        }
        public String getCouponStartFee() {
            return this.couponStartFee;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponAmount(Integer couponAmount) {
            this.couponAmount = couponAmount;
            return this;
        }
        public Integer getCouponAmount() {
            return this.couponAmount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponInfo(String couponInfo) {
            this.couponInfo = couponInfo;
            return this;
        }
        public String getCouponInfo() {
            return this.couponInfo;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCommissionRate(String commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }
        public String getCommissionRate() {
            return this.commissionRate;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponShareUrl(String couponShareUrl) {
            this.couponShareUrl = couponShareUrl;
            return this;
        }
        public String getCouponShareUrl() {
            return this.couponShareUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setDeeplinkCouponShareUrl(String deeplinkCouponShareUrl) {
            this.deeplinkCouponShareUrl = deeplinkCouponShareUrl;
            return this;
        }
        public String getDeeplinkCouponShareUrl() {
            return this.deeplinkCouponShareUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setDeeplinkUrl(String deeplinkUrl) {
            this.deeplinkUrl = deeplinkUrl;
            return this;
        }
        public String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setShopTitle(String shopTitle) {
            this.shopTitle = shopTitle;
            return this;
        }
        public String getShopTitle() {
            return this.shopTitle;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setMaxCommission(SearchByUrlResponseBodyDataAuctionsResultMaxCommission maxCommission) {
            this.maxCommission = maxCommission;
            return this;
        }
        public SearchByUrlResponseBodyDataAuctionsResultMaxCommission getMaxCommission() {
            return this.maxCommission;
        }

    }

    public static class SearchByUrlResponseBodyDataAuctions extends TeaModel {
        @NameInMap("Result")
        public SearchByUrlResponseBodyDataAuctionsResult result;

        @NameInMap("RankScore")
        public Float rankScore;

        public static SearchByUrlResponseBodyDataAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyDataAuctions self = new SearchByUrlResponseBodyDataAuctions();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyDataAuctions setResult(SearchByUrlResponseBodyDataAuctionsResult result) {
            this.result = result;
            return this;
        }
        public SearchByUrlResponseBodyDataAuctionsResult getResult() {
            return this.result;
        }

        public SearchByUrlResponseBodyDataAuctions setRankScore(Float rankScore) {
            this.rankScore = rankScore;
            return this;
        }
        public Float getRankScore() {
            return this.rankScore;
        }

    }

    public static class SearchByUrlResponseBodyData extends TeaModel {
        @NameInMap("Auctions")
        public java.util.List<SearchByUrlResponseBodyDataAuctions> auctions;

        public static SearchByUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyData self = new SearchByUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyData setAuctions(java.util.List<SearchByUrlResponseBodyDataAuctions> auctions) {
            this.auctions = auctions;
            return this;
        }
        public java.util.List<SearchByUrlResponseBodyDataAuctions> getAuctions() {
            return this.auctions;
        }

    }

    public static class SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId extends TeaModel {
        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("Score")
        public Float score;

        public static SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId self = new SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class SearchByUrlResponseBodyPicInfoMainRegion extends TeaModel {
        @NameInMap("MultiCategoryId")
        public java.util.List<SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId> multiCategoryId;

        @NameInMap("Region")
        public String region;

        public static SearchByUrlResponseBodyPicInfoMainRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfoMainRegion self = new SearchByUrlResponseBodyPicInfoMainRegion();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfoMainRegion setMultiCategoryId(java.util.List<SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId> multiCategoryId) {
            this.multiCategoryId = multiCategoryId;
            return this;
        }
        public java.util.List<SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId> getMultiCategoryId() {
            return this.multiCategoryId;
        }

        public SearchByUrlResponseBodyPicInfoMainRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchByUrlResponseBodyPicInfoMultiRegion extends TeaModel {
        @NameInMap("Region")
        public String region;

        public static SearchByUrlResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfoMultiRegion self = new SearchByUrlResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchByUrlResponseBodyPicInfo extends TeaModel {
        @NameInMap("MainRegion")
        public SearchByUrlResponseBodyPicInfoMainRegion mainRegion;

        @NameInMap("MultiRegion")
        public java.util.List<SearchByUrlResponseBodyPicInfoMultiRegion> multiRegion;

        public static SearchByUrlResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfo self = new SearchByUrlResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfo setMainRegion(SearchByUrlResponseBodyPicInfoMainRegion mainRegion) {
            this.mainRegion = mainRegion;
            return this;
        }
        public SearchByUrlResponseBodyPicInfoMainRegion getMainRegion() {
            return this.mainRegion;
        }

        public SearchByUrlResponseBodyPicInfo setMultiRegion(java.util.List<SearchByUrlResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<SearchByUrlResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

    }

}
