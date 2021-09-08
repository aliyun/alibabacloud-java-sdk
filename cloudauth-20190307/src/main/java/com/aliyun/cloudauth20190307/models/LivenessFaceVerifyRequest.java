// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    @NameInMap("DeviceToken")
    public String deviceToken;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssObjectName")
    public String ossObjectName;

    @NameInMap("Model")
    public String model;

    @NameInMap("Crop")
    public String crop;

    public static LivenessFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyRequest self = new LivenessFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public LivenessFaceVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public LivenessFaceVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public LivenessFaceVerifyRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public LivenessFaceVerifyRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public LivenessFaceVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public LivenessFaceVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public LivenessFaceVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public LivenessFaceVerifyRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public LivenessFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public LivenessFaceVerifyRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public LivenessFaceVerifyRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public LivenessFaceVerifyRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public LivenessFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

}
