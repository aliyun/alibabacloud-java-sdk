// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyRequest extends TeaModel {
    @NameInMap("AuthId")
    public String authId;

    @NameInMap("Birthday")
    public String birthday;

    @NameInMap("CallbackToken")
    public String callbackToken;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("CertName")
    public String certName;

    /**
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("CertifyUrlStyle")
    public String certifyUrlStyle;

    @NameInMap("CertifyUrlType")
    public String certifyUrlType;

    @NameInMap("Crop")
    public String crop;

    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    @NameInMap("FaceGuardOutput")
    public String faceGuardOutput;

    /**
     * <strong>example:</strong>
     * <p>114.xxx.xxx.xxx</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:11501568,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <strong>example:</strong>
     * <p>130xxxxxxxx</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("ProcedurePriority")
    public String procedurePriority;

    /**
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RarelyCharacters")
    public String rarelyCharacters;

    @NameInMap("ReadImg")
    public String readImg;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    /**
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("SuitableType")
    public String suitableType;

    @NameInMap("UiCustomUrl")
    public String uiCustomUrl;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("ValidityDate")
    public String validityDate;

    @NameInMap("VideoEvidence")
    public String videoEvidence;

    @NameInMap("VoluntaryCustomizedContent")
    public String voluntaryCustomizedContent;

    public static InitFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyRequest self = new InitFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public InitFaceVerifyRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public InitFaceVerifyRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitFaceVerifyRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitFaceVerifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitFaceVerifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitFaceVerifyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public InitFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InitFaceVerifyRequest setCertifyUrlStyle(String certifyUrlStyle) {
        this.certifyUrlStyle = certifyUrlStyle;
        return this;
    }
    public String getCertifyUrlStyle() {
        return this.certifyUrlStyle;
    }

    public InitFaceVerifyRequest setCertifyUrlType(String certifyUrlType) {
        this.certifyUrlType = certifyUrlType;
        return this;
    }
    public String getCertifyUrlType() {
        return this.certifyUrlType;
    }

    public InitFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitFaceVerifyRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public InitFaceVerifyRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public InitFaceVerifyRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public InitFaceVerifyRequest setFaceGuardOutput(String faceGuardOutput) {
        this.faceGuardOutput = faceGuardOutput;
        return this;
    }
    public String getFaceGuardOutput() {
        return this.faceGuardOutput;
    }

    public InitFaceVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public InitFaceVerifyRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitFaceVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InitFaceVerifyRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public InitFaceVerifyRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitFaceVerifyRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public InitFaceVerifyRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public InitFaceVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitFaceVerifyRequest setProcedurePriority(String procedurePriority) {
        this.procedurePriority = procedurePriority;
        return this;
    }
    public String getProcedurePriority() {
        return this.procedurePriority;
    }

    public InitFaceVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitFaceVerifyRequest setRarelyCharacters(String rarelyCharacters) {
        this.rarelyCharacters = rarelyCharacters;
        return this;
    }
    public String getRarelyCharacters() {
        return this.rarelyCharacters;
    }

    public InitFaceVerifyRequest setReadImg(String readImg) {
        this.readImg = readImg;
        return this;
    }
    public String getReadImg() {
        return this.readImg;
    }

    public InitFaceVerifyRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public InitFaceVerifyRequest setSuitableType(String suitableType) {
        this.suitableType = suitableType;
        return this;
    }
    public String getSuitableType() {
        return this.suitableType;
    }

    public InitFaceVerifyRequest setUiCustomUrl(String uiCustomUrl) {
        this.uiCustomUrl = uiCustomUrl;
        return this;
    }
    public String getUiCustomUrl() {
        return this.uiCustomUrl;
    }

    public InitFaceVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InitFaceVerifyRequest setValidityDate(String validityDate) {
        this.validityDate = validityDate;
        return this;
    }
    public String getValidityDate() {
        return this.validityDate;
    }

    public InitFaceVerifyRequest setVideoEvidence(String videoEvidence) {
        this.videoEvidence = videoEvidence;
        return this;
    }
    public String getVideoEvidence() {
        return this.videoEvidence;
    }

    public InitFaceVerifyRequest setVoluntaryCustomizedContent(String voluntaryCustomizedContent) {
        this.voluntaryCustomizedContent = voluntaryCustomizedContent;
        return this;
    }
    public String getVoluntaryCustomizedContent() {
        return this.voluntaryCustomizedContent;
    }

}
