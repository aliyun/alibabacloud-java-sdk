// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSignNewRequest extends TeaModel {
    @NameInMap("ApplicationSceneId")
    public Long applicationSceneId;

    @NameInMap("ApplySource")
    public String applySource;

    @NameInMap("Authorization")
    public String authorization;

    @NameInMap("AuthorizationEffTime")
    public String authorizationEffTime;

    @NameInMap("AuthorizationLetter")
    public String authorizationLetter;

    @NameInMap("AuthorizationLetterAuditPass")
    public Boolean authorizationLetterAuditPass;

    @NameInMap("AuthorizationLetterId")
    public Long authorizationLetterId;

    @NameInMap("AuthorizationLetterName")
    public String authorizationLetterName;

    @NameInMap("AuthorizationSignScope")
    public String authorizationSignScope;

    @NameInMap("CreateSignGray")
    public Boolean createSignGray;

    @NameInMap("EnableAuthorizationLetter")
    public Boolean enableAuthorizationLetter;

    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("FileIds")
    public String fileIds;

    @NameInMap("IsAuthorizationLetterOCRComplete")
    public Boolean isAuthorizationLetterOCRComplete;

    @NameInMap("IsAuthorizationLetterOCRDiff")
    public Boolean isAuthorizationLetterOCRDiff;

    @NameInMap("IsSignScopeOCRDiff")
    public Boolean isSignScopeOCRDiff;

    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrganizationCode")
    public String organizationCode;

    @NameInMap("OssKeys")
    public String ossKeys;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ProxyAuthorization")
    public String proxyAuthorization;

    @NameInMap("QualificationId")
    public Long qualificationId;

    @NameInMap("QualificationType")
    public Long qualificationType;

    @NameInMap("QualificationVersion")
    public Long qualificationVersion;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("ServiceType")
    public Integer serviceType;

    @NameInMap("SignCode")
    public String signCode;

    @NameInMap("SignId")
    public String signId;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignScopeOCR")
    public String signScopeOCR;

    @NameInMap("SignUpgrade")
    public Boolean signUpgrade;

    @NameInMap("ThirdParty")
    public Boolean thirdParty;

    @NameInMap("UserViewFileName")
    public String userViewFileName;

    public static CreateSmsSignNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignNewRequest self = new CreateSmsSignNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignNewRequest setApplicationSceneId(Long applicationSceneId) {
        this.applicationSceneId = applicationSceneId;
        return this;
    }
    public Long getApplicationSceneId() {
        return this.applicationSceneId;
    }

    public CreateSmsSignNewRequest setApplySource(String applySource) {
        this.applySource = applySource;
        return this;
    }
    public String getApplySource() {
        return this.applySource;
    }

    public CreateSmsSignNewRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateSmsSignNewRequest setAuthorizationEffTime(String authorizationEffTime) {
        this.authorizationEffTime = authorizationEffTime;
        return this;
    }
    public String getAuthorizationEffTime() {
        return this.authorizationEffTime;
    }

    public CreateSmsSignNewRequest setAuthorizationLetter(String authorizationLetter) {
        this.authorizationLetter = authorizationLetter;
        return this;
    }
    public String getAuthorizationLetter() {
        return this.authorizationLetter;
    }

    public CreateSmsSignNewRequest setAuthorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
        this.authorizationLetterAuditPass = authorizationLetterAuditPass;
        return this;
    }
    public Boolean getAuthorizationLetterAuditPass() {
        return this.authorizationLetterAuditPass;
    }

    public CreateSmsSignNewRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public CreateSmsSignNewRequest setAuthorizationLetterName(String authorizationLetterName) {
        this.authorizationLetterName = authorizationLetterName;
        return this;
    }
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    public CreateSmsSignNewRequest setAuthorizationSignScope(String authorizationSignScope) {
        this.authorizationSignScope = authorizationSignScope;
        return this;
    }
    public String getAuthorizationSignScope() {
        return this.authorizationSignScope;
    }

    public CreateSmsSignNewRequest setCreateSignGray(Boolean createSignGray) {
        this.createSignGray = createSignGray;
        return this;
    }
    public Boolean getCreateSignGray() {
        return this.createSignGray;
    }

    public CreateSmsSignNewRequest setEnableAuthorizationLetter(Boolean enableAuthorizationLetter) {
        this.enableAuthorizationLetter = enableAuthorizationLetter;
        return this;
    }
    public Boolean getEnableAuthorizationLetter() {
        return this.enableAuthorizationLetter;
    }

    public CreateSmsSignNewRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public CreateSmsSignNewRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public CreateSmsSignNewRequest setIsAuthorizationLetterOCRComplete(Boolean isAuthorizationLetterOCRComplete) {
        this.isAuthorizationLetterOCRComplete = isAuthorizationLetterOCRComplete;
        return this;
    }
    public Boolean getIsAuthorizationLetterOCRComplete() {
        return this.isAuthorizationLetterOCRComplete;
    }

    public CreateSmsSignNewRequest setIsAuthorizationLetterOCRDiff(Boolean isAuthorizationLetterOCRDiff) {
        this.isAuthorizationLetterOCRDiff = isAuthorizationLetterOCRDiff;
        return this;
    }
    public Boolean getIsAuthorizationLetterOCRDiff() {
        return this.isAuthorizationLetterOCRDiff;
    }

    public CreateSmsSignNewRequest setIsSignScopeOCRDiff(Boolean isSignScopeOCRDiff) {
        this.isSignScopeOCRDiff = isSignScopeOCRDiff;
        return this;
    }
    public Boolean getIsSignScopeOCRDiff() {
        return this.isSignScopeOCRDiff;
    }

    public CreateSmsSignNewRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public CreateSmsSignNewRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsSignNewRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public CreateSmsSignNewRequest setOssKeys(String ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public String getOssKeys() {
        return this.ossKeys;
    }

    public CreateSmsSignNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsSignNewRequest setProxyAuthorization(String proxyAuthorization) {
        this.proxyAuthorization = proxyAuthorization;
        return this;
    }
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    public CreateSmsSignNewRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CreateSmsSignNewRequest setQualificationType(Long qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }
    public Long getQualificationType() {
        return this.qualificationType;
    }

    public CreateSmsSignNewRequest setQualificationVersion(Long qualificationVersion) {
        this.qualificationVersion = qualificationVersion;
        return this;
    }
    public Long getQualificationVersion() {
        return this.qualificationVersion;
    }

    public CreateSmsSignNewRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsSignNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSignNewRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public CreateSmsSignNewRequest setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

    public CreateSmsSignNewRequest setSignCode(String signCode) {
        this.signCode = signCode;
        return this;
    }
    public String getSignCode() {
        return this.signCode;
    }

    public CreateSmsSignNewRequest setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

    public CreateSmsSignNewRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSignNewRequest setSignScopeOCR(String signScopeOCR) {
        this.signScopeOCR = signScopeOCR;
        return this;
    }
    public String getSignScopeOCR() {
        return this.signScopeOCR;
    }

    public CreateSmsSignNewRequest setSignUpgrade(Boolean signUpgrade) {
        this.signUpgrade = signUpgrade;
        return this;
    }
    public Boolean getSignUpgrade() {
        return this.signUpgrade;
    }

    public CreateSmsSignNewRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public CreateSmsSignNewRequest setUserViewFileName(String userViewFileName) {
        this.userViewFileName = userViewFileName;
        return this;
    }
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

}
