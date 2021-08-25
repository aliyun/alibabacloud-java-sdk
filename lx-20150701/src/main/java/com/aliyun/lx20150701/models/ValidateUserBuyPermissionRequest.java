// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class ValidateUserBuyPermissionRequest extends TeaModel {
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("BuyerAliUid")
    public Long buyerAliUid;

    @NameInMap("CommodityInfo")
    public java.util.List<ValidateUserBuyPermissionRequestCommodityInfo> commodityInfo;

    public static ValidateUserBuyPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateUserBuyPermissionRequest self = new ValidateUserBuyPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ValidateUserBuyPermissionRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ValidateUserBuyPermissionRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public ValidateUserBuyPermissionRequest setBuyerAliUid(Long buyerAliUid) {
        this.buyerAliUid = buyerAliUid;
        return this;
    }
    public Long getBuyerAliUid() {
        return this.buyerAliUid;
    }

    public ValidateUserBuyPermissionRequest setCommodityInfo(java.util.List<ValidateUserBuyPermissionRequestCommodityInfo> commodityInfo) {
        this.commodityInfo = commodityInfo;
        return this;
    }
    public java.util.List<ValidateUserBuyPermissionRequestCommodityInfo> getCommodityInfo() {
        return this.commodityInfo;
    }

    public static class ValidateUserBuyPermissionRequestCommodityInfo extends TeaModel {
        @NameInMap("SpecCode")
        public String specCode;

        @NameInMap("ArticleCode")
        public String articleCode;

        @NameInMap("CommodityExtParams")
        public java.util.Map<String, ?> commodityExtParams;

        @NameInMap("RegionId")
        public String regionId;

        public static ValidateUserBuyPermissionRequestCommodityInfo build(java.util.Map<String, ?> map) throws Exception {
            ValidateUserBuyPermissionRequestCommodityInfo self = new ValidateUserBuyPermissionRequestCommodityInfo();
            return TeaModel.build(map, self);
        }

        public ValidateUserBuyPermissionRequestCommodityInfo setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

        public ValidateUserBuyPermissionRequestCommodityInfo setArticleCode(String articleCode) {
            this.articleCode = articleCode;
            return this;
        }
        public String getArticleCode() {
            return this.articleCode;
        }

        public ValidateUserBuyPermissionRequestCommodityInfo setCommodityExtParams(java.util.Map<String, ?> commodityExtParams) {
            this.commodityExtParams = commodityExtParams;
            return this;
        }
        public java.util.Map<String, ?> getCommodityExtParams() {
            return this.commodityExtParams;
        }

        public ValidateUserBuyPermissionRequestCommodityInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
