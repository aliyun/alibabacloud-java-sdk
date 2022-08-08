// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageRequest extends TeaModel {
    @NameInMap("AccessInfo")
    public CreateOrUpdateIntlImageRequestAccessInfo accessInfo;

    @NameInMap("BasicInfo")
    public CreateOrUpdateIntlImageRequestBasicInfo basicInfo;

    @NameInMap("BussinessInfo")
    public CreateOrUpdateIntlImageRequestBussinessInfo bussinessInfo;

    @NameInMap("CallBackUrl")
    public String callBackUrl;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("EncryptData")
    public String encryptData;

    @NameInMap("ProtocolInfo")
    public CreateOrUpdateIntlImageRequestProtocolInfo protocolInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static CreateOrUpdateIntlImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageRequest self = new CreateOrUpdateIntlImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageRequest setAccessInfo(CreateOrUpdateIntlImageRequestAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
        return this;
    }
    public CreateOrUpdateIntlImageRequestAccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public CreateOrUpdateIntlImageRequest setBasicInfo(CreateOrUpdateIntlImageRequestBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public CreateOrUpdateIntlImageRequestBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public CreateOrUpdateIntlImageRequest setBussinessInfo(CreateOrUpdateIntlImageRequestBussinessInfo bussinessInfo) {
        this.bussinessInfo = bussinessInfo;
        return this;
    }
    public CreateOrUpdateIntlImageRequestBussinessInfo getBussinessInfo() {
        return this.bussinessInfo;
    }

    public CreateOrUpdateIntlImageRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public CreateOrUpdateIntlImageRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateOrUpdateIntlImageRequest setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

    public CreateOrUpdateIntlImageRequest setProtocolInfo(CreateOrUpdateIntlImageRequestProtocolInfo protocolInfo) {
        this.protocolInfo = protocolInfo;
        return this;
    }
    public CreateOrUpdateIntlImageRequestProtocolInfo getProtocolInfo() {
        return this.protocolInfo;
    }

    public CreateOrUpdateIntlImageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateIntlImageRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class CreateOrUpdateIntlImageRequestAccessInfoAccessDetail extends TeaModel {
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

        public static CreateOrUpdateIntlImageRequestAccessInfoAccessDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestAccessInfoAccessDetail self = new CreateOrUpdateIntlImageRequestAccessInfoAccessDetail();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setAutoPublish(Boolean autoPublish) {
            this.autoPublish = autoPublish;
            return this;
        }
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setReleaseRegionOption(String releaseRegionOption) {
            this.releaseRegionOption = releaseRegionOption;
            return this;
        }
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

    public static class CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig extends TeaModel {
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

        public static CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig self = new CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMaxCpu(Integer maxCpu) {
            this.maxCpu = maxCpu;
            return this;
        }
        public Integer getMaxCpu() {
            return this.maxCpu;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMaxMemory(Float maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Float getMaxMemory() {
            return this.maxMemory;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMinBandwidth(Integer minBandwidth) {
            this.minBandwidth = minBandwidth;
            return this;
        }
        public Integer getMinBandwidth() {
            return this.minBandwidth;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMinCpu(Integer minCpu) {
            this.minCpu = minCpu;
            return this;
        }
        public Integer getMinCpu() {
            return this.minCpu;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMinDataDiskSize(Integer minDataDiskSize) {
            this.minDataDiskSize = minDataDiskSize;
            return this;
        }
        public Integer getMinDataDiskSize() {
            return this.minDataDiskSize;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMinMemory(Float minMemory) {
            this.minMemory = minMemory;
            return this;
        }
        public Float getMinMemory() {
            return this.minMemory;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig setMinSystemDiskSize(Integer minSystemDiskSize) {
            this.minSystemDiskSize = minSystemDiskSize;
            return this;
        }
        public Integer getMinSystemDiskSize() {
            return this.minSystemDiskSize;
        }

    }

    public static class CreateOrUpdateIntlImageRequestAccessInfoImageConstraint extends TeaModel {
        @NameInMap("BaseConfig")
        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig baseConfig;

        @NameInMap("CustomizeFamilyConstraints")
        public java.util.Map<String, ?> customizeFamilyConstraints;

        @NameInMap("SupportMoreNetworkCards")
        public Boolean supportMoreNetworkCards;

        @NameInMap("TcpPortRange")
        public java.util.List<String> tcpPortRange;

        @NameInMap("UdpPortRange")
        public java.util.List<String> udpPortRange;

        public static CreateOrUpdateIntlImageRequestAccessInfoImageConstraint build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestAccessInfoImageConstraint self = new CreateOrUpdateIntlImageRequestAccessInfoImageConstraint();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint setBaseConfig(CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig baseConfig) {
            this.baseConfig = baseConfig;
            return this;
        }
        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraintBaseConfig getBaseConfig() {
            return this.baseConfig;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint setCustomizeFamilyConstraints(java.util.Map<String, ?> customizeFamilyConstraints) {
            this.customizeFamilyConstraints = customizeFamilyConstraints;
            return this;
        }
        public java.util.Map<String, ?> getCustomizeFamilyConstraints() {
            return this.customizeFamilyConstraints;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint setSupportMoreNetworkCards(Boolean supportMoreNetworkCards) {
            this.supportMoreNetworkCards = supportMoreNetworkCards;
            return this;
        }
        public Boolean getSupportMoreNetworkCards() {
            return this.supportMoreNetworkCards;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint setTcpPortRange(java.util.List<String> tcpPortRange) {
            this.tcpPortRange = tcpPortRange;
            return this;
        }
        public java.util.List<String> getTcpPortRange() {
            return this.tcpPortRange;
        }

        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint setUdpPortRange(java.util.List<String> udpPortRange) {
            this.udpPortRange = udpPortRange;
            return this;
        }
        public java.util.List<String> getUdpPortRange() {
            return this.udpPortRange;
        }

    }

    public static class CreateOrUpdateIntlImageRequestAccessInfo extends TeaModel {
        @NameInMap("AccessDetail")
        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail accessDetail;

        @NameInMap("AutoPublish")
        public Boolean autoPublish;

        @NameInMap("ImageConstraint")
        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint imageConstraint;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseRegion")
        public String releaseRegion;

        @NameInMap("ReleaseRegionOption")
        public String releaseRegionOption;

        @NameInMap("Type")
        public Integer type;

        public static CreateOrUpdateIntlImageRequestAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestAccessInfo self = new CreateOrUpdateIntlImageRequestAccessInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setAccessDetail(CreateOrUpdateIntlImageRequestAccessInfoAccessDetail accessDetail) {
            this.accessDetail = accessDetail;
            return this;
        }
        public CreateOrUpdateIntlImageRequestAccessInfoAccessDetail getAccessDetail() {
            return this.accessDetail;
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setAutoPublish(Boolean autoPublish) {
            this.autoPublish = autoPublish;
            return this;
        }
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setImageConstraint(CreateOrUpdateIntlImageRequestAccessInfoImageConstraint imageConstraint) {
            this.imageConstraint = imageConstraint;
            return this;
        }
        public CreateOrUpdateIntlImageRequestAccessInfoImageConstraint getImageConstraint() {
            return this.imageConstraint;
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setReleaseRegion(String releaseRegion) {
            this.releaseRegion = releaseRegion;
            return this;
        }
        public String getReleaseRegion() {
            return this.releaseRegion;
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setReleaseRegionOption(String releaseRegionOption) {
            this.releaseRegionOption = releaseRegionOption;
            return this;
        }
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        public CreateOrUpdateIntlImageRequestAccessInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class CreateOrUpdateIntlImageRequestBasicInfo extends TeaModel {
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

        public static CreateOrUpdateIntlImageRequestBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestBasicInfo self = new CreateOrUpdateIntlImageRequestBasicInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityAfterSale(String commodityAfterSale) {
            this.commodityAfterSale = commodityAfterSale;
            return this;
        }
        public String getCommodityAfterSale() {
            return this.commodityAfterSale;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityDetail(String commodityDetail) {
            this.commodityDetail = commodityDetail;
            return this;
        }
        public String getCommodityDetail() {
            return this.commodityDetail;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityFeature(String commodityFeature) {
            this.commodityFeature = commodityFeature;
            return this;
        }
        public String getCommodityFeature() {
            return this.commodityFeature;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityIntroduction(String commodityIntroduction) {
            this.commodityIntroduction = commodityIntroduction;
            return this;
        }
        public String getCommodityIntroduction() {
            return this.commodityIntroduction;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityPicture(String commodityPicture) {
            this.commodityPicture = commodityPicture;
            return this;
        }
        public String getCommodityPicture() {
            return this.commodityPicture;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityPictureName(String commodityPictureName) {
            this.commodityPictureName = commodityPictureName;
            return this;
        }
        public String getCommodityPictureName() {
            return this.commodityPictureName;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityPictureStream(String commodityPictureStream) {
            this.commodityPictureStream = commodityPictureStream;
            return this;
        }
        public String getCommodityPictureStream() {
            return this.commodityPictureStream;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityQualification(java.util.List<String> commodityQualification) {
            this.commodityQualification = commodityQualification;
            return this;
        }
        public java.util.List<String> getCommodityQualification() {
            return this.commodityQualification;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityRefundPolicy(String commodityRefundPolicy) {
            this.commodityRefundPolicy = commodityRefundPolicy;
            return this;
        }
        public String getCommodityRefundPolicy() {
            return this.commodityRefundPolicy;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityUserGuide(String commodityUserGuide) {
            this.commodityUserGuide = commodityUserGuide;
            return this;
        }
        public String getCommodityUserGuide() {
            return this.commodityUserGuide;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityVideoName(String commodityVideoName) {
            this.commodityVideoName = commodityVideoName;
            return this;
        }
        public String getCommodityVideoName() {
            return this.commodityVideoName;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityVideoStream(String commodityVideoStream) {
            this.commodityVideoStream = commodityVideoStream;
            return this;
        }
        public String getCommodityVideoStream() {
            return this.commodityVideoStream;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setCommodityVideoUrl(String commodityVideoUrl) {
            this.commodityVideoUrl = commodityVideoUrl;
            return this;
        }
        public String getCommodityVideoUrl() {
            return this.commodityVideoUrl;
        }

        public CreateOrUpdateIntlImageRequestBasicInfo setVideoSelect(String videoSelect) {
            this.videoSelect = videoSelect;
            return this;
        }
        public String getVideoSelect() {
            return this.videoSelect;
        }

    }

    public static class CreateOrUpdateIntlImageRequestBussinessInfo extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("SeoDescription")
        public String seoDescription;

        @NameInMap("SeoKeywords")
        public String seoKeywords;

        public static CreateOrUpdateIntlImageRequestBussinessInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestBussinessInfo self = new CreateOrUpdateIntlImageRequestBussinessInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestBussinessInfo setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public CreateOrUpdateIntlImageRequestBussinessInfo setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public CreateOrUpdateIntlImageRequestBussinessInfo setSeoDescription(String seoDescription) {
            this.seoDescription = seoDescription;
            return this;
        }
        public String getSeoDescription() {
            return this.seoDescription;
        }

        public CreateOrUpdateIntlImageRequestBussinessInfo setSeoKeywords(String seoKeywords) {
            this.seoKeywords = seoKeywords;
            return this;
        }
        public String getSeoKeywords() {
            return this.seoKeywords;
        }

    }

    public static class CreateOrUpdateIntlImageRequestProtocolInfo extends TeaModel {
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

        public static CreateOrUpdateIntlImageRequestProtocolInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageRequestProtocolInfo self = new CreateOrUpdateIntlImageRequestProtocolInfo();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setCustomsTarifNumber(String customsTarifNumber) {
            this.customsTarifNumber = customsTarifNumber;
            return this;
        }
        public String getCustomsTarifNumber() {
            return this.customsTarifNumber;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setEarControlled(String earControlled) {
            this.earControlled = earControlled;
            return this;
        }
        public String getEarControlled() {
            return this.earControlled;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setEccnCode(String eccnCode) {
            this.eccnCode = eccnCode;
            return this;
        }
        public String getEccnCode() {
            return this.eccnCode;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setFinalUserProtocol(String finalUserProtocol) {
            this.finalUserProtocol = finalUserProtocol;
            return this;
        }
        public String getFinalUserProtocol() {
            return this.finalUserProtocol;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setIdentificationMethod(String identificationMethod) {
            this.identificationMethod = identificationMethod;
            return this;
        }
        public String getIdentificationMethod() {
            return this.identificationMethod;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setLicense(String license) {
            this.license = license;
            return this;
        }
        public String getLicense() {
            return this.license;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setLicenseException(String licenseException) {
            this.licenseException = licenseException;
            return this;
        }
        public String getLicenseException() {
            return this.licenseException;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setLocalExportControlClassificationNumber(String localExportControlClassificationNumber) {
            this.localExportControlClassificationNumber = localExportControlClassificationNumber;
            return this;
        }
        public String getLocalExportControlClassificationNumber() {
            return this.localExportControlClassificationNumber;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setOfficialIdentificationNumber(String officialIdentificationNumber) {
            this.officialIdentificationNumber = officialIdentificationNumber;
            return this;
        }
        public String getOfficialIdentificationNumber() {
            return this.officialIdentificationNumber;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setProductCryType(String productCryType) {
            this.productCryType = productCryType;
            return this;
        }
        public String getProductCryType() {
            return this.productCryType;
        }

        public CreateOrUpdateIntlImageRequestProtocolInfo setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

}
