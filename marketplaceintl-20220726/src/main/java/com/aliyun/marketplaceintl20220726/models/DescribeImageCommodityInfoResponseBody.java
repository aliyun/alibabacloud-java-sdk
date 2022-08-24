// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageCommodityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeImageCommodityInfoResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageCommodityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCommodityInfoResponseBody self = new DescribeImageCommodityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCommodityInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageCommodityInfoResponseBody setData(DescribeImageCommodityInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageCommodityInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageCommodityInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeImageCommodityInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeImageCommodityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCommodityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail extends TeaModel {
        @NameInMap("Ak")
        public String ak;

        @NameInMap("AutoPublish")
        public Boolean autoPublish;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("Region")
        public String region;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseRegionOption")
        public String releaseRegionOption;

        @NameInMap("Secret")
        public String secret;

        public static DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail self = new DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setAutoPublish(Boolean autoPublish) {
            this.autoPublish = autoPublish;
            return this;
        }
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setReleaseRegionOption(String releaseRegionOption) {
            this.releaseRegionOption = releaseRegionOption;
            return this;
        }
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig extends TeaModel {
        @NameInMap("MaxCpu")
        public Integer maxCpu;

        @NameInMap("MaxMemory")
        public Float maxMemory;

        @NameInMap("MinBandwidth")
        public Integer minBandwidth;

        @NameInMap("MinCpu")
        public Integer minCpu;

        @NameInMap("MinDataDiskSize")
        public Integer minDataDiskSize;

        @NameInMap("MinMemory")
        public Float minMemory;

        @NameInMap("MinSystemDiskSize")
        public Integer minSystemDiskSize;

        public static DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig self = new DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMaxCpu(Integer maxCpu) {
            this.maxCpu = maxCpu;
            return this;
        }
        public Integer getMaxCpu() {
            return this.maxCpu;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMaxMemory(Float maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Float getMaxMemory() {
            return this.maxMemory;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMinBandwidth(Integer minBandwidth) {
            this.minBandwidth = minBandwidth;
            return this;
        }
        public Integer getMinBandwidth() {
            return this.minBandwidth;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMinCpu(Integer minCpu) {
            this.minCpu = minCpu;
            return this;
        }
        public Integer getMinCpu() {
            return this.minCpu;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMinDataDiskSize(Integer minDataDiskSize) {
            this.minDataDiskSize = minDataDiskSize;
            return this;
        }
        public Integer getMinDataDiskSize() {
            return this.minDataDiskSize;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMinMemory(Float minMemory) {
            this.minMemory = minMemory;
            return this;
        }
        public Float getMinMemory() {
            return this.minMemory;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig setMinSystemDiskSize(Integer minSystemDiskSize) {
            this.minSystemDiskSize = minSystemDiskSize;
            return this;
        }
        public Integer getMinSystemDiskSize() {
            return this.minSystemDiskSize;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint extends TeaModel {
        @NameInMap("BaseConfig")
        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig baseConfig;

        @NameInMap("CustomizeFamilyConstraints")
        public java.util.Map<String, ?> customizeFamilyConstraints;

        @NameInMap("SupportMoreNetworkCards")
        public Boolean supportMoreNetworkCards;

        @NameInMap("TcpPortRange")
        public java.util.List<String> tcpPortRange;

        @NameInMap("UdpPortRange")
        public java.util.List<String> udpPortRange;

        public static DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint self = new DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint setBaseConfig(DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig baseConfig) {
            this.baseConfig = baseConfig;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraintBaseConfig getBaseConfig() {
            return this.baseConfig;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint setCustomizeFamilyConstraints(java.util.Map<String, ?> customizeFamilyConstraints) {
            this.customizeFamilyConstraints = customizeFamilyConstraints;
            return this;
        }
        public java.util.Map<String, ?> getCustomizeFamilyConstraints() {
            return this.customizeFamilyConstraints;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint setSupportMoreNetworkCards(Boolean supportMoreNetworkCards) {
            this.supportMoreNetworkCards = supportMoreNetworkCards;
            return this;
        }
        public Boolean getSupportMoreNetworkCards() {
            return this.supportMoreNetworkCards;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint setTcpPortRange(java.util.List<String> tcpPortRange) {
            this.tcpPortRange = tcpPortRange;
            return this;
        }
        public java.util.List<String> getTcpPortRange() {
            return this.tcpPortRange;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint setUdpPortRange(java.util.List<String> udpPortRange) {
            this.udpPortRange = udpPortRange;
            return this;
        }
        public java.util.List<String> getUdpPortRange() {
            return this.udpPortRange;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataAccessInfo extends TeaModel {
        @NameInMap("AccessDetail")
        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail accessDetail;

        @NameInMap("AutoPublish")
        public Boolean autoPublish;

        @NameInMap("ImageConstraint")
        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint imageConstraint;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseRegion")
        public String releaseRegion;

        @NameInMap("ReleaseRegionOption")
        public String releaseRegionOption;

        @NameInMap("Type")
        public Integer type;

        public static DescribeImageCommodityInfoResponseBodyDataAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataAccessInfo self = new DescribeImageCommodityInfoResponseBodyDataAccessInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setAccessDetail(DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail accessDetail) {
            this.accessDetail = accessDetail;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataAccessInfoAccessDetail getAccessDetail() {
            return this.accessDetail;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setAutoPublish(Boolean autoPublish) {
            this.autoPublish = autoPublish;
            return this;
        }
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setImageConstraint(DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint imageConstraint) {
            this.imageConstraint = imageConstraint;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataAccessInfoImageConstraint getImageConstraint() {
            return this.imageConstraint;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setReleaseRegion(String releaseRegion) {
            this.releaseRegion = releaseRegion;
            return this;
        }
        public String getReleaseRegion() {
            return this.releaseRegion;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setReleaseRegionOption(String releaseRegionOption) {
            this.releaseRegionOption = releaseRegionOption;
            return this;
        }
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        public DescribeImageCommodityInfoResponseBodyDataAccessInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataBasicInfo extends TeaModel {
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

        public static DescribeImageCommodityInfoResponseBodyDataBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataBasicInfo self = new DescribeImageCommodityInfoResponseBodyDataBasicInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityAfterSale(String commodityAfterSale) {
            this.commodityAfterSale = commodityAfterSale;
            return this;
        }
        public String getCommodityAfterSale() {
            return this.commodityAfterSale;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityDetail(String commodityDetail) {
            this.commodityDetail = commodityDetail;
            return this;
        }
        public String getCommodityDetail() {
            return this.commodityDetail;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityFeature(String commodityFeature) {
            this.commodityFeature = commodityFeature;
            return this;
        }
        public String getCommodityFeature() {
            return this.commodityFeature;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityIntroduction(String commodityIntroduction) {
            this.commodityIntroduction = commodityIntroduction;
            return this;
        }
        public String getCommodityIntroduction() {
            return this.commodityIntroduction;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityPicture(String commodityPicture) {
            this.commodityPicture = commodityPicture;
            return this;
        }
        public String getCommodityPicture() {
            return this.commodityPicture;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityPictureName(String commodityPictureName) {
            this.commodityPictureName = commodityPictureName;
            return this;
        }
        public String getCommodityPictureName() {
            return this.commodityPictureName;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityPictureStream(String commodityPictureStream) {
            this.commodityPictureStream = commodityPictureStream;
            return this;
        }
        public String getCommodityPictureStream() {
            return this.commodityPictureStream;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityQualification(java.util.List<String> commodityQualification) {
            this.commodityQualification = commodityQualification;
            return this;
        }
        public java.util.List<String> getCommodityQualification() {
            return this.commodityQualification;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityRefundPolicy(String commodityRefundPolicy) {
            this.commodityRefundPolicy = commodityRefundPolicy;
            return this;
        }
        public String getCommodityRefundPolicy() {
            return this.commodityRefundPolicy;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityUserGuide(String commodityUserGuide) {
            this.commodityUserGuide = commodityUserGuide;
            return this;
        }
        public String getCommodityUserGuide() {
            return this.commodityUserGuide;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityVideoName(String commodityVideoName) {
            this.commodityVideoName = commodityVideoName;
            return this;
        }
        public String getCommodityVideoName() {
            return this.commodityVideoName;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityVideoStream(String commodityVideoStream) {
            this.commodityVideoStream = commodityVideoStream;
            return this;
        }
        public String getCommodityVideoStream() {
            return this.commodityVideoStream;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setCommodityVideoUrl(String commodityVideoUrl) {
            this.commodityVideoUrl = commodityVideoUrl;
            return this;
        }
        public String getCommodityVideoUrl() {
            return this.commodityVideoUrl;
        }

        public DescribeImageCommodityInfoResponseBodyDataBasicInfo setVideoSelect(String videoSelect) {
            this.videoSelect = videoSelect;
            return this;
        }
        public String getVideoSelect() {
            return this.videoSelect;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataBussinessInfo extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("SeoDescription")
        public String seoDescription;

        @NameInMap("SeoKeywords")
        public String seoKeywords;

        public static DescribeImageCommodityInfoResponseBodyDataBussinessInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataBussinessInfo self = new DescribeImageCommodityInfoResponseBodyDataBussinessInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataBussinessInfo setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeImageCommodityInfoResponseBodyDataBussinessInfo setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public DescribeImageCommodityInfoResponseBodyDataBussinessInfo setSeoDescription(String seoDescription) {
            this.seoDescription = seoDescription;
            return this;
        }
        public String getSeoDescription() {
            return this.seoDescription;
        }

        public DescribeImageCommodityInfoResponseBodyDataBussinessInfo setSeoKeywords(String seoKeywords) {
            this.seoKeywords = seoKeywords;
            return this;
        }
        public String getSeoKeywords() {
            return this.seoKeywords;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataProtocolInfo extends TeaModel {
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

        public static DescribeImageCommodityInfoResponseBodyDataProtocolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataProtocolInfo self = new DescribeImageCommodityInfoResponseBodyDataProtocolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setCustomsTarifNumber(String customsTarifNumber) {
            this.customsTarifNumber = customsTarifNumber;
            return this;
        }
        public String getCustomsTarifNumber() {
            return this.customsTarifNumber;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setEarControlled(String earControlled) {
            this.earControlled = earControlled;
            return this;
        }
        public String getEarControlled() {
            return this.earControlled;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setEccnCode(String eccnCode) {
            this.eccnCode = eccnCode;
            return this;
        }
        public String getEccnCode() {
            return this.eccnCode;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setFinalUserProtocol(String finalUserProtocol) {
            this.finalUserProtocol = finalUserProtocol;
            return this;
        }
        public String getFinalUserProtocol() {
            return this.finalUserProtocol;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setIdentificationMethod(String identificationMethod) {
            this.identificationMethod = identificationMethod;
            return this;
        }
        public String getIdentificationMethod() {
            return this.identificationMethod;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setLicense(String license) {
            this.license = license;
            return this;
        }
        public String getLicense() {
            return this.license;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setLicenseException(String licenseException) {
            this.licenseException = licenseException;
            return this;
        }
        public String getLicenseException() {
            return this.licenseException;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setLocalExportControlClassificationNumber(String localExportControlClassificationNumber) {
            this.localExportControlClassificationNumber = localExportControlClassificationNumber;
            return this;
        }
        public String getLocalExportControlClassificationNumber() {
            return this.localExportControlClassificationNumber;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setOfficialIdentificationNumber(String officialIdentificationNumber) {
            this.officialIdentificationNumber = officialIdentificationNumber;
            return this;
        }
        public String getOfficialIdentificationNumber() {
            return this.officialIdentificationNumber;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setProductCryType(String productCryType) {
            this.productCryType = productCryType;
            return this;
        }
        public String getProductCryType() {
            return this.productCryType;
        }

        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList extends TeaModel {
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

        public static DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList self = new DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList setBasePrice(String basePrice) {
            this.basePrice = basePrice;
            return this;
        }
        public String getBasePrice() {
            return this.basePrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList setExcelUrl(String excelUrl) {
            this.excelUrl = excelUrl;
            return this;
        }
        public String getExcelUrl() {
            return this.excelUrl;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice extends TeaModel {
        @NameInMap("HourPrice")
        public String hourPrice;

        @NameInMap("PostpaidPriceList")
        public java.util.List<DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList> postpaidPriceList;

        @NameInMap("UnifiedPrice")
        public Boolean unifiedPrice;

        public static DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice self = new DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice setHourPrice(String hourPrice) {
            this.hourPrice = hourPrice;
            return this;
        }
        public String getHourPrice() {
            return this.hourPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice setPostpaidPriceList(java.util.List<DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList> postpaidPriceList) {
            this.postpaidPriceList = postpaidPriceList;
            return this;
        }
        public java.util.List<DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPricePostpaidPriceList> getPostpaidPriceList() {
            return this.postpaidPriceList;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice setUnifiedPrice(Boolean unifiedPrice) {
            this.unifiedPrice = unifiedPrice;
            return this;
        }
        public Boolean getUnifiedPrice() {
            return this.unifiedPrice;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList extends TeaModel {
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

        public static DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList self = new DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList setBasePrice(String basePrice) {
            this.basePrice = basePrice;
            return this;
        }
        public String getBasePrice() {
            return this.basePrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList setExcelUrl(String excelUrl) {
            this.excelUrl = excelUrl;
            return this;
        }
        public String getExcelUrl() {
            return this.excelUrl;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList setTradeType(String tradeType) {
            this.tradeType = tradeType;
            return this;
        }
        public String getTradeType() {
            return this.tradeType;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice extends TeaModel {
        @NameInMap("MonthPrice")
        public String monthPrice;

        @NameInMap("MonthRenewPrice")
        public String monthRenewPrice;

        @NameInMap("PrepaymentPriceList")
        public java.util.List<DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList> prepaymentPriceList;

        @NameInMap("UnifiedPrice")
        public Boolean unifiedPrice;

        @NameInMap("YearPrice")
        public String yearPrice;

        @NameInMap("YearRenewPrice")
        public String yearRenewPrice;

        public static DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice self = new DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice setMonthPrice(String monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public String getMonthPrice() {
            return this.monthPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice setMonthRenewPrice(String monthRenewPrice) {
            this.monthRenewPrice = monthRenewPrice;
            return this;
        }
        public String getMonthRenewPrice() {
            return this.monthRenewPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice setPrepaymentPriceList(java.util.List<DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList> prepaymentPriceList) {
            this.prepaymentPriceList = prepaymentPriceList;
            return this;
        }
        public java.util.List<DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPricePrepaymentPriceList> getPrepaymentPriceList() {
            return this.prepaymentPriceList;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice setUnifiedPrice(Boolean unifiedPrice) {
            this.unifiedPrice = unifiedPrice;
            return this;
        }
        public Boolean getUnifiedPrice() {
            return this.unifiedPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice setYearPrice(String yearPrice) {
            this.yearPrice = yearPrice;
            return this;
        }
        public String getYearPrice() {
            return this.yearPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice setYearRenewPrice(String yearRenewPrice) {
            this.yearRenewPrice = yearRenewPrice;
            return this;
        }
        public String getYearRenewPrice() {
            return this.yearRenewPrice;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyDataSaleInfo extends TeaModel {
        @NameInMap("BillingMethods")
        public Integer billingMethods;

        @NameInMap("CommodityFrontShow")
        public String commodityFrontShow;

        @NameInMap("PostpaidPrice")
        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice postpaidPrice;

        @NameInMap("PrepaymentPrice")
        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice prepaymentPrice;

        @NameInMap("PricingPlan")
        public String pricingPlan;

        public static DescribeImageCommodityInfoResponseBodyDataSaleInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyDataSaleInfo self = new DescribeImageCommodityInfoResponseBodyDataSaleInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfo setBillingMethods(Integer billingMethods) {
            this.billingMethods = billingMethods;
            return this;
        }
        public Integer getBillingMethods() {
            return this.billingMethods;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfo setCommodityFrontShow(String commodityFrontShow) {
            this.commodityFrontShow = commodityFrontShow;
            return this;
        }
        public String getCommodityFrontShow() {
            return this.commodityFrontShow;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfo setPostpaidPrice(DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice postpaidPrice) {
            this.postpaidPrice = postpaidPrice;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPostpaidPrice getPostpaidPrice() {
            return this.postpaidPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfo setPrepaymentPrice(DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice prepaymentPrice) {
            this.prepaymentPrice = prepaymentPrice;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataSaleInfoPrepaymentPrice getPrepaymentPrice() {
            return this.prepaymentPrice;
        }

        public DescribeImageCommodityInfoResponseBodyDataSaleInfo setPricingPlan(String pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }
        public String getPricingPlan() {
            return this.pricingPlan;
        }

    }

    public static class DescribeImageCommodityInfoResponseBodyData extends TeaModel {
        @NameInMap("AccessInfo")
        public DescribeImageCommodityInfoResponseBodyDataAccessInfo accessInfo;

        @NameInMap("BasicInfo")
        public DescribeImageCommodityInfoResponseBodyDataBasicInfo basicInfo;

        @NameInMap("BussinessInfo")
        public DescribeImageCommodityInfoResponseBodyDataBussinessInfo bussinessInfo;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ProtocolInfo")
        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo protocolInfo;

        @NameInMap("SaleInfo")
        public DescribeImageCommodityInfoResponseBodyDataSaleInfo saleInfo;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeImageCommodityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityInfoResponseBodyData self = new DescribeImageCommodityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityInfoResponseBodyData setAccessInfo(DescribeImageCommodityInfoResponseBodyDataAccessInfo accessInfo) {
            this.accessInfo = accessInfo;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataAccessInfo getAccessInfo() {
            return this.accessInfo;
        }

        public DescribeImageCommodityInfoResponseBodyData setBasicInfo(DescribeImageCommodityInfoResponseBodyDataBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public DescribeImageCommodityInfoResponseBodyData setBussinessInfo(DescribeImageCommodityInfoResponseBodyDataBussinessInfo bussinessInfo) {
            this.bussinessInfo = bussinessInfo;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataBussinessInfo getBussinessInfo() {
            return this.bussinessInfo;
        }

        public DescribeImageCommodityInfoResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeImageCommodityInfoResponseBodyData setProtocolInfo(DescribeImageCommodityInfoResponseBodyDataProtocolInfo protocolInfo) {
            this.protocolInfo = protocolInfo;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataProtocolInfo getProtocolInfo() {
            return this.protocolInfo;
        }

        public DescribeImageCommodityInfoResponseBodyData setSaleInfo(DescribeImageCommodityInfoResponseBodyDataSaleInfo saleInfo) {
            this.saleInfo = saleInfo;
            return this;
        }
        public DescribeImageCommodityInfoResponseBodyDataSaleInfo getSaleInfo() {
            return this.saleInfo;
        }

        public DescribeImageCommodityInfoResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
