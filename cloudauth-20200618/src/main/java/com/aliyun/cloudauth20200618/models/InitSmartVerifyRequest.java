// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class InitSmartVerifyRequest extends TeaModel {
    @NameInMap("CallbackToken")
    public String callbackToken;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    @NameInMap("IdName")
    public String idName;

    @NameInMap("IdNo")
    public String idNo;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("MetaInfo")
    public String metaInfo;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Ocr")
    public String ocr;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssObjectName")
    public String ossObjectName;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("UserId")
    public String userId;

    public static InitSmartVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSmartVerifyRequest self = new InitSmartVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitSmartVerifyRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitSmartVerifyRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitSmartVerifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitSmartVerifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitSmartVerifyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public InitSmartVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InitSmartVerifyRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public InitSmartVerifyRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public InitSmartVerifyRequest setIdName(String idName) {
        this.idName = idName;
        return this;
    }
    public String getIdName() {
        return this.idName;
    }

    public InitSmartVerifyRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public InitSmartVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public InitSmartVerifyRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitSmartVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InitSmartVerifyRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public InitSmartVerifyRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public InitSmartVerifyRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public InitSmartVerifyRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public InitSmartVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitSmartVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public InitSmartVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
