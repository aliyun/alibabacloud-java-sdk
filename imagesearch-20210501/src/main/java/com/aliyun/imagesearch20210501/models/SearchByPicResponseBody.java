// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByPicResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public SearchByPicResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PicInfo")
    public SearchByPicResponseBodyPicInfo picInfo;

    public static SearchByPicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchByPicResponseBody self = new SearchByPicResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchByPicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchByPicResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchByPicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchByPicResponseBody setData(SearchByPicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchByPicResponseBodyData getData() {
        return this.data;
    }

    public SearchByPicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchByPicResponseBody setPicInfo(SearchByPicResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchByPicResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public static class SearchByPicResponseBodyDataAuctionsResult extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Pic")
        public String pic;

        @NameInMap("Price")
        public String price;

        @NameInMap("PromotionPrice")
        public String promotionPrice;

        @NameInMap("UserType")
        public Integer userType;

        @NameInMap("Provcity")
        public String provcity;

        @NameInMap("SellerNickName")
        public String sellerNickName;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("MonthSellCount")
        public Integer monthSellCount;

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

        @NameInMap("CouponSaleTextInfo")
        public String couponSaleTextInfo;

        @NameInMap("CommissionRate")
        public String commissionRate;

        @NameInMap("CouponShareUrl")
        public String couponShareUrl;

        @NameInMap("ClickUrl")
        public String clickUrl;

        public static SearchByPicResponseBodyDataAuctionsResult build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyDataAuctionsResult self = new SearchByPicResponseBodyDataAuctionsResult();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyDataAuctionsResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SearchByPicResponseBodyDataAuctionsResult setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SearchByPicResponseBodyDataAuctionsResult setPic(String pic) {
            this.pic = pic;
            return this;
        }
        public String getPic() {
            return this.pic;
        }

        public SearchByPicResponseBodyDataAuctionsResult setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public SearchByPicResponseBodyDataAuctionsResult setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public SearchByPicResponseBodyDataAuctionsResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public SearchByPicResponseBodyDataAuctionsResult setProvcity(String provcity) {
            this.provcity = provcity;
            return this;
        }
        public String getProvcity() {
            return this.provcity;
        }

        public SearchByPicResponseBodyDataAuctionsResult setSellerNickName(String sellerNickName) {
            this.sellerNickName = sellerNickName;
            return this;
        }
        public String getSellerNickName() {
            return this.sellerNickName;
        }

        public SearchByPicResponseBodyDataAuctionsResult setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public SearchByPicResponseBodyDataAuctionsResult setMonthSellCount(Integer monthSellCount) {
            this.monthSellCount = monthSellCount;
            return this;
        }
        public Integer getMonthSellCount() {
            return this.monthSellCount;
        }

        public SearchByPicResponseBodyDataAuctionsResult setLevelOneCategoryName(String levelOneCategoryName) {
            this.levelOneCategoryName = levelOneCategoryName;
            return this;
        }
        public String getLevelOneCategoryName() {
            return this.levelOneCategoryName;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponTotalCount(String couponTotalCount) {
            this.couponTotalCount = couponTotalCount;
            return this;
        }
        public String getCouponTotalCount() {
            return this.couponTotalCount;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponRemainCount(Integer couponRemainCount) {
            this.couponRemainCount = couponRemainCount;
            return this;
        }
        public Integer getCouponRemainCount() {
            return this.couponRemainCount;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponStartTime(String couponStartTime) {
            this.couponStartTime = couponStartTime;
            return this;
        }
        public String getCouponStartTime() {
            return this.couponStartTime;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponEndTime(String couponEndTime) {
            this.couponEndTime = couponEndTime;
            return this;
        }
        public String getCouponEndTime() {
            return this.couponEndTime;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponStartFee(String couponStartFee) {
            this.couponStartFee = couponStartFee;
            return this;
        }
        public String getCouponStartFee() {
            return this.couponStartFee;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponAmount(Integer couponAmount) {
            this.couponAmount = couponAmount;
            return this;
        }
        public Integer getCouponAmount() {
            return this.couponAmount;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponSaleTextInfo(String couponSaleTextInfo) {
            this.couponSaleTextInfo = couponSaleTextInfo;
            return this;
        }
        public String getCouponSaleTextInfo() {
            return this.couponSaleTextInfo;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCommissionRate(String commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }
        public String getCommissionRate() {
            return this.commissionRate;
        }

        public SearchByPicResponseBodyDataAuctionsResult setCouponShareUrl(String couponShareUrl) {
            this.couponShareUrl = couponShareUrl;
            return this;
        }
        public String getCouponShareUrl() {
            return this.couponShareUrl;
        }

        public SearchByPicResponseBodyDataAuctionsResult setClickUrl(String clickUrl) {
            this.clickUrl = clickUrl;
            return this;
        }
        public String getClickUrl() {
            return this.clickUrl;
        }

    }

    public static class SearchByPicResponseBodyDataAuctions extends TeaModel {
        @NameInMap("Result")
        public SearchByPicResponseBodyDataAuctionsResult result;

        @NameInMap("RankScore")
        public Float rankScore;

        public static SearchByPicResponseBodyDataAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyDataAuctions self = new SearchByPicResponseBodyDataAuctions();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyDataAuctions setResult(SearchByPicResponseBodyDataAuctionsResult result) {
            this.result = result;
            return this;
        }
        public SearchByPicResponseBodyDataAuctionsResult getResult() {
            return this.result;
        }

        public SearchByPicResponseBodyDataAuctions setRankScore(Float rankScore) {
            this.rankScore = rankScore;
            return this;
        }
        public Float getRankScore() {
            return this.rankScore;
        }

    }

    public static class SearchByPicResponseBodyData extends TeaModel {
        @NameInMap("Auctions")
        public java.util.List<SearchByPicResponseBodyDataAuctions> auctions;

        public static SearchByPicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyData self = new SearchByPicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyData setAuctions(java.util.List<SearchByPicResponseBodyDataAuctions> auctions) {
            this.auctions = auctions;
            return this;
        }
        public java.util.List<SearchByPicResponseBodyDataAuctions> getAuctions() {
            return this.auctions;
        }

    }

    public static class SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId extends TeaModel {
        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("Score")
        public Float score;

        public static SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId self = new SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class SearchByPicResponseBodyPicInfoMainRegion extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("MultiCategoryId")
        public java.util.List<SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId> multiCategoryId;

        public static SearchByPicResponseBodyPicInfoMainRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyPicInfoMainRegion self = new SearchByPicResponseBodyPicInfoMainRegion();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyPicInfoMainRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchByPicResponseBodyPicInfoMainRegion setMultiCategoryId(java.util.List<SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId> multiCategoryId) {
            this.multiCategoryId = multiCategoryId;
            return this;
        }
        public java.util.List<SearchByPicResponseBodyPicInfoMainRegionMultiCategoryId> getMultiCategoryId() {
            return this.multiCategoryId;
        }

    }

    public static class SearchByPicResponseBodyPicInfoMultiRegion extends TeaModel {
        @NameInMap("Region")
        public String region;

        public static SearchByPicResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyPicInfoMultiRegion self = new SearchByPicResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchByPicResponseBodyPicInfo extends TeaModel {
        @NameInMap("MainRegion")
        public SearchByPicResponseBodyPicInfoMainRegion mainRegion;

        @NameInMap("MultiRegion")
        public java.util.List<SearchByPicResponseBodyPicInfoMultiRegion> multiRegion;

        public static SearchByPicResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchByPicResponseBodyPicInfo self = new SearchByPicResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchByPicResponseBodyPicInfo setMainRegion(SearchByPicResponseBodyPicInfoMainRegion mainRegion) {
            this.mainRegion = mainRegion;
            return this;
        }
        public SearchByPicResponseBodyPicInfoMainRegion getMainRegion() {
            return this.mainRegion;
        }

        public SearchByPicResponseBodyPicInfo setMultiRegion(java.util.List<SearchByPicResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<SearchByPicResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

    }

}
