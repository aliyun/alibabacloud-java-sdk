// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSignNewShrinkRequest extends TeaModel {
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
    public String moreDataShrink;

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

    public static CreateSmsSignNewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignNewShrinkRequest self = new CreateSmsSignNewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignNewShrinkRequest setApplicationSceneId(Long applicationSceneId) {
        this.applicationSceneId = applicationSceneId;
        return this;
    }
    public Long getApplicationSceneId() {
        return this.applicationSceneId;
    }

    public CreateSmsSignNewShrinkRequest setApplySource(String applySource) {
        this.applySource = applySource;
        return this;
    }
    public String getApplySource() {
        return this.applySource;
    }

    public CreateSmsSignNewShrinkRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateSmsSignNewShrinkRequest setAuthorizationEffTime(String authorizationEffTime) {
        this.authorizationEffTime = authorizationEffTime;
        return this;
    }
    public String getAuthorizationEffTime() {
        return this.authorizationEffTime;
    }

    public CreateSmsSignNewShrinkRequest setAuthorizationLetter(String authorizationLetter) {
        this.authorizationLetter = authorizationLetter;
        return this;
    }
    public String getAuthorizationLetter() {
        return this.authorizationLetter;
    }

    public CreateSmsSignNewShrinkRequest setAuthorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
        this.authorizationLetterAuditPass = authorizationLetterAuditPass;
        return this;
    }
    public Boolean getAuthorizationLetterAuditPass() {
        return this.authorizationLetterAuditPass;
    }

    public CreateSmsSignNewShrinkRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public CreateSmsSignNewShrinkRequest setAuthorizationLetterName(String authorizationLetterName) {
        this.authorizationLetterName = authorizationLetterName;
        return this;
    }
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    public CreateSmsSignNewShrinkRequest setAuthorizationSignScope(String authorizationSignScope) {
        this.authorizationSignScope = authorizationSignScope;
        return this;
    }
    public String getAuthorizationSignScope() {
        return this.authorizationSignScope;
    }

    public CreateSmsSignNewShrinkRequest setCreateSignGray(Boolean createSignGray) {
        this.createSignGray = createSignGray;
        return this;
    }
    public Boolean getCreateSignGray() {
        return this.createSignGray;
    }

    public CreateSmsSignNewShrinkRequest setEnableAuthorizationLetter(Boolean enableAuthorizationLetter) {
        this.enableAuthorizationLetter = enableAuthorizationLetter;
        return this;
    }
    public Boolean getEnableAuthorizationLetter() {
        return this.enableAuthorizationLetter;
    }

    public CreateSmsSignNewShrinkRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public CreateSmsSignNewShrinkRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public CreateSmsSignNewShrinkRequest setIsAuthorizationLetterOCRComplete(Boolean isAuthorizationLetterOCRComplete) {
        this.isAuthorizationLetterOCRComplete = isAuthorizationLetterOCRComplete;
        return this;
    }
    public Boolean getIsAuthorizationLetterOCRComplete() {
        return this.isAuthorizationLetterOCRComplete;
    }

    public CreateSmsSignNewShrinkRequest setIsAuthorizationLetterOCRDiff(Boolean isAuthorizationLetterOCRDiff) {
        this.isAuthorizationLetterOCRDiff = isAuthorizationLetterOCRDiff;
        return this;
    }
    public Boolean getIsAuthorizationLetterOCRDiff() {
        return this.isAuthorizationLetterOCRDiff;
    }

    public CreateSmsSignNewShrinkRequest setIsSignScopeOCRDiff(Boolean isSignScopeOCRDiff) {
        this.isSignScopeOCRDiff = isSignScopeOCRDiff;
        return this;
    }
    public Boolean getIsSignScopeOCRDiff() {
        return this.isSignScopeOCRDiff;
    }

    public CreateSmsSignNewShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public CreateSmsSignNewShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsSignNewShrinkRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public CreateSmsSignNewShrinkRequest setOssKeys(String ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public String getOssKeys() {
        return this.ossKeys;
    }

    public CreateSmsSignNewShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignNewShrinkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsSignNewShrinkRequest setProxyAuthorization(String proxyAuthorization) {
        this.proxyAuthorization = proxyAuthorization;
        return this;
    }
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    public CreateSmsSignNewShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CreateSmsSignNewShrinkRequest setQualificationType(Long qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }
    public Long getQualificationType() {
        return this.qualificationType;
    }

    public CreateSmsSignNewShrinkRequest setQualificationVersion(Long qualificationVersion) {
        this.qualificationVersion = qualificationVersion;
        return this;
    }
    public Long getQualificationVersion() {
        return this.qualificationVersion;
    }

    public CreateSmsSignNewShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsSignNewShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignNewShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSignNewShrinkRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public CreateSmsSignNewShrinkRequest setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

    public CreateSmsSignNewShrinkRequest setSignCode(String signCode) {
        this.signCode = signCode;
        return this;
    }
    public String getSignCode() {
        return this.signCode;
    }

    public CreateSmsSignNewShrinkRequest setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

    public CreateSmsSignNewShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSignNewShrinkRequest setSignScopeOCR(String signScopeOCR) {
        this.signScopeOCR = signScopeOCR;
        return this;
    }
    public String getSignScopeOCR() {
        return this.signScopeOCR;
    }

    public CreateSmsSignNewShrinkRequest setSignUpgrade(Boolean signUpgrade) {
        this.signUpgrade = signUpgrade;
        return this;
    }
    public Boolean getSignUpgrade() {
        return this.signUpgrade;
    }

    public CreateSmsSignNewShrinkRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public CreateSmsSignNewShrinkRequest setUserViewFileName(String userViewFileName) {
        this.userViewFileName = userViewFileName;
        return this;
    }
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

}
