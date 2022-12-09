// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemGuideRetailPriceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryItemGuideRetailPriceResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryItemGuideRetailPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemGuideRetailPriceResponseBody self = new QueryItemGuideRetailPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemGuideRetailPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemGuideRetailPriceResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryItemGuideRetailPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemGuideRetailPriceResponseBody setModel(java.util.List<QueryItemGuideRetailPriceResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryItemGuideRetailPriceResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryItemGuideRetailPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemGuideRetailPriceResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemGuideRetailPriceResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemGuideRetailPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryItemGuideRetailPriceResponseBodyModelSkuModels extends TeaModel {
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("GuideRetailPrice")
        public Long guideRetailPrice;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LowGuideRetailPrice")
        public Long lowGuideRetailPrice;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("Status")
        public Integer status;

        public static QueryItemGuideRetailPriceResponseBodyModelSkuModels build(java.util.Map<String, ?> map) throws Exception {
            QueryItemGuideRetailPriceResponseBodyModelSkuModels self = new QueryItemGuideRetailPriceResponseBodyModelSkuModels();
            return TeaModel.build(map, self);
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setGuideRetailPrice(Long guideRetailPrice) {
            this.guideRetailPrice = guideRetailPrice;
            return this;
        }
        public Long getGuideRetailPrice() {
            return this.guideRetailPrice;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setLowGuideRetailPrice(Long lowGuideRetailPrice) {
            this.lowGuideRetailPrice = lowGuideRetailPrice;
            return this;
        }
        public Long getLowGuideRetailPrice() {
            return this.lowGuideRetailPrice;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemGuideRetailPriceResponseBodyModelSkuModels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryItemGuideRetailPriceResponseBodyModel extends TeaModel {
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("GuideRetailPriceScope")
        public String guideRetailPriceScope;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LowGuideRetailPriceScope")
        public String lowGuideRetailPriceScope;

        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        @NameInMap("ReservedPriceScope")
        public String reservedPriceScope;

        @NameInMap("SkuModels")
        public java.util.List<QueryItemGuideRetailPriceResponseBodyModelSkuModels> skuModels;

        public static QueryItemGuideRetailPriceResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryItemGuideRetailPriceResponseBodyModel self = new QueryItemGuideRetailPriceResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryItemGuideRetailPriceResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setGuideRetailPriceScope(String guideRetailPriceScope) {
            this.guideRetailPriceScope = guideRetailPriceScope;
            return this;
        }
        public String getGuideRetailPriceScope() {
            return this.guideRetailPriceScope;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setLowGuideRetailPriceScope(String lowGuideRetailPriceScope) {
            this.lowGuideRetailPriceScope = lowGuideRetailPriceScope;
            return this;
        }
        public String getLowGuideRetailPriceScope() {
            return this.lowGuideRetailPriceScope;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setReservedPriceScope(String reservedPriceScope) {
            this.reservedPriceScope = reservedPriceScope;
            return this;
        }
        public String getReservedPriceScope() {
            return this.reservedPriceScope;
        }

        public QueryItemGuideRetailPriceResponseBodyModel setSkuModels(java.util.List<QueryItemGuideRetailPriceResponseBodyModelSkuModels> skuModels) {
            this.skuModels = skuModels;
            return this;
        }
        public java.util.List<QueryItemGuideRetailPriceResponseBodyModelSkuModels> getSkuModels() {
            return this.skuModels;
        }

    }

}
