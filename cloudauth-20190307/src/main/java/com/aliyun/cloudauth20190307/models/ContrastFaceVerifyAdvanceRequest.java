// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyAdvanceRequest extends TeaModel {
    @NameInMap("FaceContrastFileObject")
    @Validation(required = true)
    public java.io.InputStream faceContrastFileObject;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("Crop")
    public String crop;

    @NameInMap("DeviceToken")
    public String deviceToken;

    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Model")
    public String model;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssObjectName")
    public String ossObjectName;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("UserId")
    public String userId;

    public static ContrastFaceVerifyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyAdvanceRequest self = new ContrastFaceVerifyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ContrastFaceVerifyAdvanceRequest setFaceContrastFileObject(java.io.InputStream faceContrastFileObject) {
        this.faceContrastFileObject = faceContrastFileObject;
        return this;
    }
    public java.io.InputStream getFaceContrastFileObject() {
        return this.faceContrastFileObject;
    }

    public ContrastFaceVerifyAdvanceRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ContrastFaceVerifyAdvanceRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ContrastFaceVerifyAdvanceRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ContrastFaceVerifyAdvanceRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public ContrastFaceVerifyAdvanceRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public ContrastFaceVerifyAdvanceRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public ContrastFaceVerifyAdvanceRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public ContrastFaceVerifyAdvanceRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public ContrastFaceVerifyAdvanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ContrastFaceVerifyAdvanceRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContrastFaceVerifyAdvanceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ContrastFaceVerifyAdvanceRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public ContrastFaceVerifyAdvanceRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public ContrastFaceVerifyAdvanceRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ContrastFaceVerifyAdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ContrastFaceVerifyAdvanceRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public ContrastFaceVerifyAdvanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
