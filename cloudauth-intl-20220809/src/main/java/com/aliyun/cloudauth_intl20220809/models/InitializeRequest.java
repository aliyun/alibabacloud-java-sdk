// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeRequest extends TeaModel {
    @NameInMap("Authorize")
    public String authorize;

    @NameInMap("CallbackToken")
    public String callbackToken;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Crop")
    public String crop;

    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <strong>example:</strong>
     * <p>01000000</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("DocVideo")
    public String docVideo;

    @NameInMap("ExperienceCode")
    public String experienceCode;

    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    @NameInMap("IdThreshold")
    public String idThreshold;

    @NameInMap("LanguageConfig")
    public String languageConfig;

    /**
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>1221****6543</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;bioMetaInfo\&quot;:\&quot;4.1.0:2916352,0\&quot;,\&quot;deviceType\&quot;:\&quot;web\&quot;,\&quot;ua\&quot;:\&quot;Mozilla/5.0 (Macintosh</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    @NameInMap("Model")
    public String model;

    /**
     * <p>OCR。</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Ocr")
    public String ocr;

    /**
     * <strong>example:</strong>
     * <p>eKYC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductFlow")
    public String productFlow;

    /**
     * <strong>example:</strong>
     * <p>http*****</p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    /**
     * <strong>example:</strong>
     * <p>PAY**</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("SecurityLevel")
    public String securityLevel;

    @NameInMap("StyleConfig")
    public String styleConfig;

    public static InitializeRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeRequest self = new InitializeRequest();
        return TeaModel.build(map, self);
    }

    public InitializeRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public InitializeRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitializeRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitializeRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitializeRequest setDocScanMode(String docScanMode) {
        this.docScanMode = docScanMode;
        return this;
    }
    public String getDocScanMode() {
        return this.docScanMode;
    }

    public InitializeRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public InitializeRequest setDocVideo(String docVideo) {
        this.docVideo = docVideo;
        return this;
    }
    public String getDocVideo() {
        return this.docVideo;
    }

    public InitializeRequest setExperienceCode(String experienceCode) {
        this.experienceCode = experienceCode;
        return this;
    }
    public String getExperienceCode() {
        return this.experienceCode;
    }

    public InitializeRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public InitializeRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public InitializeRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public InitializeRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public InitializeRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public InitializeRequest setLanguageConfig(String languageConfig) {
        this.languageConfig = languageConfig;
        return this;
    }
    public String getLanguageConfig() {
        return this.languageConfig;
    }

    public InitializeRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public InitializeRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public InitializeRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitializeRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitializeRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public InitializeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitializeRequest setProductFlow(String productFlow) {
        this.productFlow = productFlow;
        return this;
    }
    public String getProductFlow() {
        return this.productFlow;
    }

    public InitializeRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitializeRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public InitializeRequest setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public InitializeRequest setStyleConfig(String styleConfig) {
        this.styleConfig = styleConfig;
        return this;
    }
    public String getStyleConfig() {
        return this.styleConfig;
    }

}
