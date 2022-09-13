// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageShrinkRequest extends TeaModel {
    @NameInMap("AccessInfo")
    public String accessInfoShrink;

    @NameInMap("Ak")
    public String ak;

    @NameInMap("BasicInfo")
    public CreateOrUpdateIntlImageShrinkRequestBasicInfo basicInfo;

    @NameInMap("BussinessInfo")
    public CreateOrUpdateIntlImageShrinkRequestBussinessInfo bussinessInfo;

    @NameInMap("CallBackUrl")
    public String callBackUrl;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ProtocolInfo")
    public CreateOrUpdateIntlImageShrinkRequestProtocolInfo protocolInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaleInfo")
    public CreateOrUpdateIntlImageShrinkRequestSaleInfo saleInfo;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static CreateOrUpdateIntlImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageShrinkRequest self = new CreateOrUpdateIntlImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageShrinkRequest setAccessInfoShrink(String accessInfoShrink) {
        this.accessInfoShrink = accessInfoShrink;
        return this;
    }
    public String getAccessInfoShrink() {
        return this.accessInfoShrink;
    }

    public CreateOrUpdateIntlImageShrinkRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public CreateOrUpdateIntlImageShrinkRequest setBasicInfo(CreateOrUpdateIntlImageShrinkRequestBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public CreateOrUpdateIntlImageShrinkRequestBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public CreateOrUpdateIntlImageShrinkRequest setBussinessInfo(CreateOrUpdateIntlImageShrinkRequestBussinessInfo bussinessInfo) {
        this.bussinessInfo = bussinessInfo;
        return this;
    }
    public CreateOrUpdateIntlImageShrinkRequestBussinessInfo getBussinessInfo() {
        return this.bussinessInfo;
    }

    public CreateOrUpdateIntlImageShrinkRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public CreateOrUpdateIntlImageShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateOrUpdateIntlImageShrinkRequest setProtocolInfo(CreateOrUpdateIntlImageShrinkRequestProtocolInfo protocolInfo) {
        this.protocolInfo = protocolInfo;
        return this;
    }
    public CreateOrUpdateIntlImageShrinkRequestProtocolInfo getProtocolInfo() {
        return this.protocolInfo;
    }

    public CreateOrUpdateIntlImageShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateIntlImageShrinkRequest setSaleInfo(CreateOrUpdateIntlImageShrinkRequestSaleInfo saleInfo) {
        this.saleInfo = saleInfo;
        return this;
    }
    public CreateOrUpdateIntlImageShrinkRequestSaleInfo getSaleInfo() {
        return this.saleInfo;
    }

    public CreateOrUpdateIntlImageShrinkRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public CreateOrUpdateIntlImageShrinkRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class CreateOrUpdateIntlImageShrinkRequestBasicInfo extends TeaModel {
        @NameInMap("CommodityAfterSale")
        public String commodityAfterSale;

        @NameInMap("CommodityDetail")
        public String commodityDetail;

        @NameInMap("CommodityFeature")
        public String commodityFeature;

        @NameInMap("CommodityIntroduction")
        public String commodityIntroduction;

        @NameInMap("CommodityPicture")
        public String commodityPicture;

        @NameInMap("CommodityPictureName")
        public String commodityPictureName;

        @NameInMap("CommodityPictureStream")
        public String commodityPictureStream;

        @NameInMap("CommodityQualification")
        public java.util.List<String> commodityQualification;

        @NameInMap("CommodityRefundPolicy")
        public String commodityRefundPolicy;

        @NameInMap("CommodityUserGuide")
        public String commodityUserGuide;

        @NameInMap("CommodityVideoName")
        public String commodityVideoName;

        @NameInMap("CommodityVideoStream")
        public String commodityVideoStream;

        @NameInMap("CommodityVideoUrl")
        public String commodityVideoUrl;

        @NameInMap("VideoSelect")
        public String videoSelect;

        public static CreateOrUpdateIntlImageShrinkRequestBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestBasicInfo self = new CreateOrUpdateIntlImageShrinkRequestBasicInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityAfterSale(String commodityAfterSale) {
            this.commodityAfterSale = commodityAfterSale;
            return this;
        }
        public String getCommodityAfterSale() {
            return this.commodityAfterSale;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityDetail(String commodityDetail) {
            this.commodityDetail = commodityDetail;
            return this;
        }
        public String getCommodityDetail() {
            return this.commodityDetail;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityFeature(String commodityFeature) {
            this.commodityFeature = commodityFeature;
            return this;
        }
        public String getCommodityFeature() {
            return this.commodityFeature;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityIntroduction(String commodityIntroduction) {
            this.commodityIntroduction = commodityIntroduction;
            return this;
        }
        public String getCommodityIntroduction() {
            return this.commodityIntroduction;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityPicture(String commodityPicture) {
            this.commodityPicture = commodityPicture;
            return this;
        }
        public String getCommodityPicture() {
            return this.commodityPicture;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityPictureName(String commodityPictureName) {
            this.commodityPictureName = commodityPictureName;
            return this;
        }
        public String getCommodityPictureName() {
            return this.commodityPictureName;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityPictureStream(String commodityPictureStream) {
            this.commodityPictureStream = commodityPictureStream;
            return this;
        }
        public String getCommodityPictureStream() {
            return this.commodityPictureStream;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityQualification(java.util.List<String> commodityQualification) {
            this.commodityQualification = commodityQualification;
            return this;
        }
        public java.util.List<String> getCommodityQualification() {
            return this.commodityQualification;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityRefundPolicy(String commodityRefundPolicy) {
            this.commodityRefundPolicy = commodityRefundPolicy;
            return this;
        }
        public String getCommodityRefundPolicy() {
            return this.commodityRefundPolicy;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityUserGuide(String commodityUserGuide) {
            this.commodityUserGuide = commodityUserGuide;
            return this;
        }
        public String getCommodityUserGuide() {
            return this.commodityUserGuide;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityVideoName(String commodityVideoName) {
            this.commodityVideoName = commodityVideoName;
            return this;
        }
        public String getCommodityVideoName() {
            return this.commodityVideoName;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityVideoStream(String commodityVideoStream) {
            this.commodityVideoStream = commodityVideoStream;
            return this;
        }
        public String getCommodityVideoStream() {
            return this.commodityVideoStream;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setCommodityVideoUrl(String commodityVideoUrl) {
            this.commodityVideoUrl = commodityVideoUrl;
            return this;
        }
        public String getCommodityVideoUrl() {
            return this.commodityVideoUrl;
        }

        public CreateOrUpdateIntlImageShrinkRequestBasicInfo setVideoSelect(String videoSelect) {
            this.videoSelect = videoSelect;
            return this;
        }
        public String getVideoSelect() {
            return this.videoSelect;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestBussinessInfo extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("SeoDescription")
        public String seoDescription;

        @NameInMap("SeoKeywords")
        public String seoKeywords;

        public static CreateOrUpdateIntlImageShrinkRequestBussinessInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestBussinessInfo self = new CreateOrUpdateIntlImageShrinkRequestBussinessInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestBussinessInfo setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public CreateOrUpdateIntlImageShrinkRequestBussinessInfo setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public CreateOrUpdateIntlImageShrinkRequestBussinessInfo setSeoDescription(String seoDescription) {
            this.seoDescription = seoDescription;
            return this;
        }
        public String getSeoDescription() {
            return this.seoDescription;
        }

        public CreateOrUpdateIntlImageShrinkRequestBussinessInfo setSeoKeywords(String seoKeywords) {
            this.seoKeywords = seoKeywords;
            return this;
        }
        public String getSeoKeywords() {
            return this.seoKeywords;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestProtocolInfo extends TeaModel {
        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("CustomsTarifNumber")
        public String customsTarifNumber;

        @NameInMap("EarControlled")
        public String earControlled;

        @NameInMap("EccnCode")
        public String eccnCode;

        @NameInMap("FinalUserProtocol")
        public String finalUserProtocol;

        @NameInMap("IdentificationMethod")
        public String identificationMethod;

        @NameInMap("License")
        public String license;

        @NameInMap("LicenseException")
        public String licenseException;

        @NameInMap("LocalExportControlClassificationNumber")
        public String localExportControlClassificationNumber;

        @NameInMap("OfficialIdentificationNumber")
        public String officialIdentificationNumber;

        @NameInMap("ProductCryType")
        public String productCryType;

        @NameInMap("ProductType")
        public String productType;

        public static CreateOrUpdateIntlImageShrinkRequestProtocolInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestProtocolInfo self = new CreateOrUpdateIntlImageShrinkRequestProtocolInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setCustomsTarifNumber(String customsTarifNumber) {
            this.customsTarifNumber = customsTarifNumber;
            return this;
        }
        public String getCustomsTarifNumber() {
            return this.customsTarifNumber;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setEarControlled(String earControlled) {
            this.earControlled = earControlled;
            return this;
        }
        public String getEarControlled() {
            return this.earControlled;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setEccnCode(String eccnCode) {
            this.eccnCode = eccnCode;
            return this;
        }
        public String getEccnCode() {
            return this.eccnCode;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setFinalUserProtocol(String finalUserProtocol) {
            this.finalUserProtocol = finalUserProtocol;
            return this;
        }
        public String getFinalUserProtocol() {
            return this.finalUserProtocol;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setIdentificationMethod(String identificationMethod) {
            this.identificationMethod = identificationMethod;
            return this;
        }
        public String getIdentificationMethod() {
            return this.identificationMethod;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setLicense(String license) {
            this.license = license;
            return this;
        }
        public String getLicense() {
            return this.license;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setLicenseException(String licenseException) {
            this.licenseException = licenseException;
            return this;
        }
        public String getLicenseException() {
            return this.licenseException;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setLocalExportControlClassificationNumber(String localExportControlClassificationNumber) {
            this.localExportControlClassificationNumber = localExportControlClassificationNumber;
            return this;
        }
        public String getLocalExportControlClassificationNumber() {
            return this.localExportControlClassificationNumber;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setOfficialIdentificationNumber(String officialIdentificationNumber) {
            this.officialIdentificationNumber = officialIdentificationNumber;
            return this;
        }
        public String getOfficialIdentificationNumber() {
            return this.officialIdentificationNumber;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setProductCryType(String productCryType) {
            this.productCryType = productCryType;
            return this;
        }
        public String getProductCryType() {
            return this.productCryType;
        }

        public CreateOrUpdateIntlImageShrinkRequestProtocolInfo setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList extends TeaModel {
        @NameInMap("BasePrice")
        public String basePrice;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("ExcelUrl")
        public String excelUrl;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("PriceType")
        public String priceType;

        public static CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList self = new CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList setBasePrice(String basePrice) {
            this.basePrice = basePrice;
            return this;
        }
        public String getBasePrice() {
            return this.basePrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList setExcelUrl(String excelUrl) {
            this.excelUrl = excelUrl;
            return this;
        }
        public String getExcelUrl() {
            return this.excelUrl;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice extends TeaModel {
        @NameInMap("HourPrice")
        public String hourPrice;

        @NameInMap("PostpaidPriceList")
        public java.util.List<CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList> postpaidPriceList;

        @NameInMap("UnifiedPrice")
        public Boolean unifiedPrice;

        public static CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice self = new CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice setHourPrice(String hourPrice) {
            this.hourPrice = hourPrice;
            return this;
        }
        public String getHourPrice() {
            return this.hourPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice setPostpaidPriceList(java.util.List<CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList> postpaidPriceList) {
            this.postpaidPriceList = postpaidPriceList;
            return this;
        }
        public java.util.List<CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPricePostpaidPriceList> getPostpaidPriceList() {
            return this.postpaidPriceList;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice setUnifiedPrice(Boolean unifiedPrice) {
            this.unifiedPrice = unifiedPrice;
            return this;
        }
        public Boolean getUnifiedPrice() {
            return this.unifiedPrice;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList extends TeaModel {
        @NameInMap("BasePrice")
        public String basePrice;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("ExcelUrl")
        public String excelUrl;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("TradeType")
        public String tradeType;

        public static CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList self = new CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList setBasePrice(String basePrice) {
            this.basePrice = basePrice;
            return this;
        }
        public String getBasePrice() {
            return this.basePrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList setExcelUrl(String excelUrl) {
            this.excelUrl = excelUrl;
            return this;
        }
        public String getExcelUrl() {
            return this.excelUrl;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList setTradeType(String tradeType) {
            this.tradeType = tradeType;
            return this;
        }
        public String getTradeType() {
            return this.tradeType;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice extends TeaModel {
        @NameInMap("MonthPrice")
        public String monthPrice;

        @NameInMap("MonthRenewPrice")
        public String monthRenewPrice;

        @NameInMap("PrepaymentPriceList")
        public java.util.List<CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList> prepaymentPriceList;

        @NameInMap("UnifiedPrice")
        public Boolean unifiedPrice;

        @NameInMap("YearPrice")
        public String yearPrice;

        @NameInMap("YearRenewPrice")
        public String yearRenewPrice;

        public static CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice self = new CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice setMonthPrice(String monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public String getMonthPrice() {
            return this.monthPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice setMonthRenewPrice(String monthRenewPrice) {
            this.monthRenewPrice = monthRenewPrice;
            return this;
        }
        public String getMonthRenewPrice() {
            return this.monthRenewPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice setPrepaymentPriceList(java.util.List<CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList> prepaymentPriceList) {
            this.prepaymentPriceList = prepaymentPriceList;
            return this;
        }
        public java.util.List<CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPricePrepaymentPriceList> getPrepaymentPriceList() {
            return this.prepaymentPriceList;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice setUnifiedPrice(Boolean unifiedPrice) {
            this.unifiedPrice = unifiedPrice;
            return this;
        }
        public Boolean getUnifiedPrice() {
            return this.unifiedPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice setYearPrice(String yearPrice) {
            this.yearPrice = yearPrice;
            return this;
        }
        public String getYearPrice() {
            return this.yearPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice setYearRenewPrice(String yearRenewPrice) {
            this.yearRenewPrice = yearRenewPrice;
            return this;
        }
        public String getYearRenewPrice() {
            return this.yearRenewPrice;
        }

    }

    public static class CreateOrUpdateIntlImageShrinkRequestSaleInfo extends TeaModel {
        @NameInMap("BillingMethods")
        public Integer billingMethods;

        @NameInMap("CommodityFrontShow")
        public String commodityFrontShow;

        @NameInMap("PostpaidPrice")
        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice postpaidPrice;

        @NameInMap("PrepaymentPrice")
        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice prepaymentPrice;

        @NameInMap("PricingPlan")
        public String pricingPlan;

        public static CreateOrUpdateIntlImageShrinkRequestSaleInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageShrinkRequestSaleInfo self = new CreateOrUpdateIntlImageShrinkRequestSaleInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfo setBillingMethods(Integer billingMethods) {
            this.billingMethods = billingMethods;
            return this;
        }
        public Integer getBillingMethods() {
            return this.billingMethods;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfo setCommodityFrontShow(String commodityFrontShow) {
            this.commodityFrontShow = commodityFrontShow;
            return this;
        }
        public String getCommodityFrontShow() {
            return this.commodityFrontShow;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfo setPostpaidPrice(CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice postpaidPrice) {
            this.postpaidPrice = postpaidPrice;
            return this;
        }
        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPostpaidPrice getPostpaidPrice() {
            return this.postpaidPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfo setPrepaymentPrice(CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice prepaymentPrice) {
            this.prepaymentPrice = prepaymentPrice;
            return this;
        }
        public CreateOrUpdateIntlImageShrinkRequestSaleInfoPrepaymentPrice getPrepaymentPrice() {
            return this.prepaymentPrice;
        }

        public CreateOrUpdateIntlImageShrinkRequestSaleInfo setPricingPlan(String pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }
        public String getPricingPlan() {
            return this.pricingPlan;
        }

    }

}
