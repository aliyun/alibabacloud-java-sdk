// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bizworks20210408.models;

import com.aliyun.tea.*;

public class QueryUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryUsageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUsageResponseBody self = new QueryUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUsageResponseBody setData(QueryUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryUsageResponseBodyData getData() {
        return this.data;
    }

    public QueryUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUsageResponseBodyDataArticleInfos extends TeaModel {
        @NameInMap("articleType")
        public String articleType;

        @NameInMap("title")
        public String title;

        @NameInMap("url")
        public String url;

        public static QueryUsageResponseBodyDataArticleInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataArticleInfos self = new QueryUsageResponseBodyDataArticleInfos();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataArticleInfos setArticleType(String articleType) {
            this.articleType = articleType;
            return this;
        }
        public String getArticleType() {
            return this.articleType;
        }

        public QueryUsageResponseBodyDataArticleInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryUsageResponseBodyDataArticleInfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig extends TeaModel {
        @NameInMap("betaDeadlineMs")
        public Long betaDeadlineMs;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("commodityName")
        public String commodityName;

        @NameInMap("expiredToReleasedHour")
        public Long expiredToReleasedHour;

        @NameInMap("inBeta")
        public Boolean inBeta;

        @NameInMap("independent")
        public Boolean independent;

        @NameInMap("paidType")
        public String paidType;

        @NameInMap("productCode")
        public String productCode;

        @NameInMap("quotaItems")
        public java.util.List<String> quotaItems;

        @NameInMap("specCodes")
        public java.util.List<String> specCodes;

        public static QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig self = new QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setBetaDeadlineMs(Long betaDeadlineMs) {
            this.betaDeadlineMs = betaDeadlineMs;
            return this;
        }
        public Long getBetaDeadlineMs() {
            return this.betaDeadlineMs;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setExpiredToReleasedHour(Long expiredToReleasedHour) {
            this.expiredToReleasedHour = expiredToReleasedHour;
            return this;
        }
        public Long getExpiredToReleasedHour() {
            return this.expiredToReleasedHour;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setInBeta(Boolean inBeta) {
            this.inBeta = inBeta;
            return this;
        }
        public Boolean getInBeta() {
            return this.inBeta;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setIndependent(Boolean independent) {
            this.independent = independent;
            return this;
        }
        public Boolean getIndependent() {
            return this.independent;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setPaidType(String paidType) {
            this.paidType = paidType;
            return this;
        }
        public String getPaidType() {
            return this.paidType;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setQuotaItems(java.util.List<String> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }
        public java.util.List<String> getQuotaItems() {
            return this.quotaItems;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig setSpecCodes(java.util.List<String> specCodes) {
            this.specCodes = specCodes;
            return this;
        }
        public java.util.List<String> getSpecCodes() {
            return this.specCodes;
        }

    }

    public static class QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec extends TeaModel {
        @NameInMap("applicationNum")
        public String applicationNum;

        @NameInMap("commercializeStatus")
        public String commercializeStatus;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("commodityName")
        public String commodityName;

        @NameInMap("cpuNum")
        public Long cpuNum;

        @NameInMap("expireDate")
        public Long expireDate;

        @NameInMap("memNum")
        public Long memNum;

        @NameInMap("nextBuyActions")
        public java.util.List<String> nextBuyActions;

        @NameInMap("ntmCommodityInstanceId")
        public String ntmCommodityInstanceId;

        @NameInMap("openDate")
        public Long openDate;

        @NameInMap("relatedSubProducts")
        public java.util.List<String> relatedSubProducts;

        @NameInMap("remainingTime")
        public String remainingTime;

        @NameInMap("specCode")
        public String specCode;

        public static QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec self = new QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setApplicationNum(String applicationNum) {
            this.applicationNum = applicationNum;
            return this;
        }
        public String getApplicationNum() {
            return this.applicationNum;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setCommercializeStatus(String commercializeStatus) {
            this.commercializeStatus = commercializeStatus;
            return this;
        }
        public String getCommercializeStatus() {
            return this.commercializeStatus;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setCpuNum(Long cpuNum) {
            this.cpuNum = cpuNum;
            return this;
        }
        public Long getCpuNum() {
            return this.cpuNum;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setMemNum(Long memNum) {
            this.memNum = memNum;
            return this;
        }
        public Long getMemNum() {
            return this.memNum;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setNextBuyActions(java.util.List<String> nextBuyActions) {
            this.nextBuyActions = nextBuyActions;
            return this;
        }
        public java.util.List<String> getNextBuyActions() {
            return this.nextBuyActions;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setNtmCommodityInstanceId(String ntmCommodityInstanceId) {
            this.ntmCommodityInstanceId = ntmCommodityInstanceId;
            return this;
        }
        public String getNtmCommodityInstanceId() {
            return this.ntmCommodityInstanceId;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setOpenDate(Long openDate) {
            this.openDate = openDate;
            return this;
        }
        public Long getOpenDate() {
            return this.openDate;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setRelatedSubProducts(java.util.List<String> relatedSubProducts) {
            this.relatedSubProducts = relatedSubProducts;
            return this;
        }
        public java.util.List<String> getRelatedSubProducts() {
            return this.relatedSubProducts;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setRemainingTime(String remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public String getRemainingTime() {
            return this.remainingTime;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

    }

    public static class QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage extends TeaModel {
        @NameInMap("applicationNum")
        public Long applicationNum;

        @NameInMap("cpuNum")
        public Long cpuNum;

        @NameInMap("memNum")
        public Long memNum;

        public static QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage self = new QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage setApplicationNum(Long applicationNum) {
            this.applicationNum = applicationNum;
            return this;
        }
        public Long getApplicationNum() {
            return this.applicationNum;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage setCpuNum(Long cpuNum) {
            this.cpuNum = cpuNum;
            return this;
        }
        public Long getCpuNum() {
            return this.cpuNum;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage setMemNum(Long memNum) {
            this.memNum = memNum;
            return this;
        }
        public Long getMemNum() {
            return this.memNum;
        }

    }

    public static class QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages extends TeaModel {
        @NameInMap("commoditySpec")
        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec commoditySpec;

        @NameInMap("commodityUsage")
        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage commodityUsage;

        public static QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages self = new QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages setCommoditySpec(QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec commoditySpec) {
            this.commoditySpec = commoditySpec;
            return this;
        }
        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommoditySpec getCommoditySpec() {
            return this.commoditySpec;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages setCommodityUsage(QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage commodityUsage) {
            this.commodityUsage = commodityUsage;
            return this;
        }
        public QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsagesCommodityUsage getCommodityUsage() {
            return this.commodityUsage;
        }

    }

    public static class QueryUsageResponseBodyDataCommoditySpecUsageInfos extends TeaModel {
        @NameInMap("commodityConfig")
        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig commodityConfig;

        @NameInMap("purchasedCommoditySpecUsages")
        public java.util.List<QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages> purchasedCommoditySpecUsages;

        public static QueryUsageResponseBodyDataCommoditySpecUsageInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataCommoditySpecUsageInfos self = new QueryUsageResponseBodyDataCommoditySpecUsageInfos();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfos setCommodityConfig(QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig commodityConfig) {
            this.commodityConfig = commodityConfig;
            return this;
        }
        public QueryUsageResponseBodyDataCommoditySpecUsageInfosCommodityConfig getCommodityConfig() {
            return this.commodityConfig;
        }

        public QueryUsageResponseBodyDataCommoditySpecUsageInfos setPurchasedCommoditySpecUsages(java.util.List<QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages> purchasedCommoditySpecUsages) {
            this.purchasedCommoditySpecUsages = purchasedCommoditySpecUsages;
            return this;
        }
        public java.util.List<QueryUsageResponseBodyDataCommoditySpecUsageInfosPurchasedCommoditySpecUsages> getPurchasedCommoditySpecUsages() {
            return this.purchasedCommoditySpecUsages;
        }

    }

    public static class QueryUsageResponseBodyDataSubProductInfosSubProduct extends TeaModel {
        @NameInMap("display")
        public Boolean display;

        @NameInMap("extendProperties")
        public java.util.Map<String, ?> extendProperties;

        @NameInMap("subProductCode")
        public String subProductCode;

        @NameInMap("subProductName")
        public String subProductName;

        @NameInMap("subProductState")
        public String subProductState;

        public static QueryUsageResponseBodyDataSubProductInfosSubProduct build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataSubProductInfosSubProduct self = new QueryUsageResponseBodyDataSubProductInfosSubProduct();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProduct setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProduct setExtendProperties(java.util.Map<String, ?> extendProperties) {
            this.extendProperties = extendProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtendProperties() {
            return this.extendProperties;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProduct setSubProductCode(String subProductCode) {
            this.subProductCode = subProductCode;
            return this;
        }
        public String getSubProductCode() {
            return this.subProductCode;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProduct setSubProductName(String subProductName) {
            this.subProductName = subProductName;
            return this;
        }
        public String getSubProductName() {
            return this.subProductName;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProduct setSubProductState(String subProductState) {
            this.subProductState = subProductState;
            return this;
        }
        public String getSubProductState() {
            return this.subProductState;
        }

    }

    public static class QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig extends TeaModel {
        @NameInMap("betaDeadlineMs")
        public Long betaDeadlineMs;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("commodityName")
        public String commodityName;

        @NameInMap("expiredToReleasedHour")
        public Long expiredToReleasedHour;

        @NameInMap("inBeta")
        public Boolean inBeta;

        @NameInMap("independent")
        public Boolean independent;

        @NameInMap("paidType")
        public String paidType;

        @NameInMap("productCode")
        public String productCode;

        @NameInMap("quotaItems")
        public java.util.List<String> quotaItems;

        @NameInMap("specCodes")
        public java.util.List<String> specCodes;

        public static QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig self = new QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setBetaDeadlineMs(Long betaDeadlineMs) {
            this.betaDeadlineMs = betaDeadlineMs;
            return this;
        }
        public Long getBetaDeadlineMs() {
            return this.betaDeadlineMs;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setExpiredToReleasedHour(Long expiredToReleasedHour) {
            this.expiredToReleasedHour = expiredToReleasedHour;
            return this;
        }
        public Long getExpiredToReleasedHour() {
            return this.expiredToReleasedHour;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setInBeta(Boolean inBeta) {
            this.inBeta = inBeta;
            return this;
        }
        public Boolean getInBeta() {
            return this.inBeta;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setIndependent(Boolean independent) {
            this.independent = independent;
            return this;
        }
        public Boolean getIndependent() {
            return this.independent;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setPaidType(String paidType) {
            this.paidType = paidType;
            return this;
        }
        public String getPaidType() {
            return this.paidType;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setQuotaItems(java.util.List<String> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }
        public java.util.List<String> getQuotaItems() {
            return this.quotaItems;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig setSpecCodes(java.util.List<String> specCodes) {
            this.specCodes = specCodes;
            return this;
        }
        public java.util.List<String> getSpecCodes() {
            return this.specCodes;
        }

    }

    public static class QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec extends TeaModel {
        @NameInMap("applicationNum")
        public Long applicationNum;

        @NameInMap("commercializeStatus")
        public String commercializeStatus;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("commodityName")
        public String commodityName;

        @NameInMap("cpuNum")
        public Long cpuNum;

        @NameInMap("expireDate")
        public Long expireDate;

        @NameInMap("memNum")
        public Long memNum;

        @NameInMap("nextBuyActions")
        public String nextBuyActions;

        @NameInMap("ntmCommodityInstanceId")
        public String ntmCommodityInstanceId;

        @NameInMap("openDate")
        public Long openDate;

        @NameInMap("relatedSubProducts")
        public java.util.List<String> relatedSubProducts;

        @NameInMap("specCode")
        public String specCode;

        @NameInMap("specName")
        public String specName;

        public static QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec self = new QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setApplicationNum(Long applicationNum) {
            this.applicationNum = applicationNum;
            return this;
        }
        public Long getApplicationNum() {
            return this.applicationNum;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setCommercializeStatus(String commercializeStatus) {
            this.commercializeStatus = commercializeStatus;
            return this;
        }
        public String getCommercializeStatus() {
            return this.commercializeStatus;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setCpuNum(Long cpuNum) {
            this.cpuNum = cpuNum;
            return this;
        }
        public Long getCpuNum() {
            return this.cpuNum;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setMemNum(Long memNum) {
            this.memNum = memNum;
            return this;
        }
        public Long getMemNum() {
            return this.memNum;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setNextBuyActions(String nextBuyActions) {
            this.nextBuyActions = nextBuyActions;
            return this;
        }
        public String getNextBuyActions() {
            return this.nextBuyActions;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setNtmCommodityInstanceId(String ntmCommodityInstanceId) {
            this.ntmCommodityInstanceId = ntmCommodityInstanceId;
            return this;
        }
        public String getNtmCommodityInstanceId() {
            return this.ntmCommodityInstanceId;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setOpenDate(Long openDate) {
            this.openDate = openDate;
            return this;
        }
        public Long getOpenDate() {
            return this.openDate;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setRelatedSubProducts(java.util.List<String> relatedSubProducts) {
            this.relatedSubProducts = relatedSubProducts;
            return this;
        }
        public java.util.List<String> getRelatedSubProducts() {
            return this.relatedSubProducts;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy extends TeaModel {
        @NameInMap("commodityConfig")
        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig commodityConfig;

        @NameInMap("commoditySpec")
        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec commoditySpec;

        @NameInMap("releaseTime")
        public Long releaseTime;

        public static QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy self = new QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy setCommodityConfig(QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig commodityConfig) {
            this.commodityConfig = commodityConfig;
            return this;
        }
        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommodityConfig getCommodityConfig() {
            return this.commodityConfig;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy setCommoditySpec(QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec commoditySpec) {
            this.commoditySpec = commoditySpec;
            return this;
        }
        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuyCommoditySpec getCommoditySpec() {
            return this.commoditySpec;
        }

        public QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

    }

    public static class QueryUsageResponseBodyDataSubProductInfos extends TeaModel {
        @NameInMap("subProduct")
        public QueryUsageResponseBodyDataSubProductInfosSubProduct subProduct;

        @NameInMap("subProductCommoditySpecsForGuideToBuy")
        public java.util.List<QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy> subProductCommoditySpecsForGuideToBuy;

        public static QueryUsageResponseBodyDataSubProductInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyDataSubProductInfos self = new QueryUsageResponseBodyDataSubProductInfos();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyDataSubProductInfos setSubProduct(QueryUsageResponseBodyDataSubProductInfosSubProduct subProduct) {
            this.subProduct = subProduct;
            return this;
        }
        public QueryUsageResponseBodyDataSubProductInfosSubProduct getSubProduct() {
            return this.subProduct;
        }

        public QueryUsageResponseBodyDataSubProductInfos setSubProductCommoditySpecsForGuideToBuy(java.util.List<QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy> subProductCommoditySpecsForGuideToBuy) {
            this.subProductCommoditySpecsForGuideToBuy = subProductCommoditySpecsForGuideToBuy;
            return this;
        }
        public java.util.List<QueryUsageResponseBodyDataSubProductInfosSubProductCommoditySpecsForGuideToBuy> getSubProductCommoditySpecsForGuideToBuy() {
            return this.subProductCommoditySpecsForGuideToBuy;
        }

    }

    public static class QueryUsageResponseBodyData extends TeaModel {
        @NameInMap("articleInfos")
        public java.util.List<QueryUsageResponseBodyDataArticleInfos> articleInfos;

        @NameInMap("commoditySpecUsageInfos")
        public java.util.List<QueryUsageResponseBodyDataCommoditySpecUsageInfos> commoditySpecUsageInfos;

        @NameInMap("subProductInfos")
        public java.util.List<QueryUsageResponseBodyDataSubProductInfos> subProductInfos;

        public static QueryUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageResponseBodyData self = new QueryUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUsageResponseBodyData setArticleInfos(java.util.List<QueryUsageResponseBodyDataArticleInfos> articleInfos) {
            this.articleInfos = articleInfos;
            return this;
        }
        public java.util.List<QueryUsageResponseBodyDataArticleInfos> getArticleInfos() {
            return this.articleInfos;
        }

        public QueryUsageResponseBodyData setCommoditySpecUsageInfos(java.util.List<QueryUsageResponseBodyDataCommoditySpecUsageInfos> commoditySpecUsageInfos) {
            this.commoditySpecUsageInfos = commoditySpecUsageInfos;
            return this;
        }
        public java.util.List<QueryUsageResponseBodyDataCommoditySpecUsageInfos> getCommoditySpecUsageInfos() {
            return this.commoditySpecUsageInfos;
        }

        public QueryUsageResponseBodyData setSubProductInfos(java.util.List<QueryUsageResponseBodyDataSubProductInfos> subProductInfos) {
            this.subProductInfos = subProductInfos;
            return this;
        }
        public java.util.List<QueryUsageResponseBodyDataSubProductInfos> getSubProductInfos() {
            return this.subProductInfos;
        }

    }

}
