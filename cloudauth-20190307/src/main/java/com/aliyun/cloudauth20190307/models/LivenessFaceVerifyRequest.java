// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyRequest extends TeaModel {
    /**
     * <p>The unique identity of the ID Verification request.</p>
     * 
     * <strong>example:</strong>
     * <p>91707dc296d469ad38e4c5efa6a0f24b</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>Specifies whether to allow trim of the face image. Valid values:</p>
     * <ul>
     * <li><p>T: Trim is allowed.</p>
     * </li>
     * <li><p>F (default): Trim is not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The device token, which is used for risk identification.</p>
     * 
     * <strong>example:</strong>
     * <p>McozS1ZWRcRZStlERcZZo_QOytx5jcgZoZJEoRLOxxxxxxx</p>
     */
    @NameInMap("DeviceToken")
    public String deviceToken;

    /**
     * <p>The Base64 encoding of the photo.</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <p>The URL of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ware.cdeledu.com/upfile/uploadPic/2025/03/21/dd62fbb9c966433ab0ba9a7252816b30.jpg">https://ware.cdeledu.com/upfile/uploadPic/2025/03/21/dd62fbb9c966433ab0ba9a7252816b30.jpg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    /**
     * <p>The IP address of the user network.</p>
     * 
     * <strong>example:</strong>
     * <p>114.xxx.xxx.xxx</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The mobile phone number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>130xxxxxxxx</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The liveness detection parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>FRONT_CAMERA_LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The bucket name of the authorization-granted OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-1494517779820665</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The file name in the authorization-granted OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>facedetect/17483113370916034.jpg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <p>The custom business unique identity on the client side, which is used for subsequent troubleshooting. The value can contain up to 32 alphanumeric characters. Make sure the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>Fixed value: LR_FR_MIN.</p>
     * 
     * <strong>example:</strong>
     * <p>LR_FR_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the authentication scenario. This ID is automatically generated after you create an authentication scenario in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>100000****</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The custom user ID (up to 100 characters). Make sure the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static LivenessFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyRequest self = new LivenessFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public LivenessFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public LivenessFaceVerifyRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public LivenessFaceVerifyRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public LivenessFaceVerifyRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public LivenessFaceVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public LivenessFaceVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public LivenessFaceVerifyRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
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

    public LivenessFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public LivenessFaceVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
