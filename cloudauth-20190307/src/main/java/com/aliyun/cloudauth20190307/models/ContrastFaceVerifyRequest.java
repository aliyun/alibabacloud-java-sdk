// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyRequest extends TeaModel {
    /**
     * <p>The real name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate number.</p>
     * 
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>The certificate type.
     * Currently only ID cards are supported. You must set this parameter to IDENTITY_CARD.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The CertifyId from a previous successful ID Verification. The photo from that verification is used as the comparison photo.</p>
     * <blockquote>
     * <p>Among the four methods of passing in images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS), select only one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>Specifies whether to allow cropping of the face image. Valid values:</p>
     * <ul>
     * <li><p>T: Allowed.</p>
     * </li>
     * <li><p>F (default): Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The device token for risk identification.</p>
     * 
     * <strong>example:</strong>
     * <p>McozS1ZWRcRZStlERcZZo_QOytx5jcgZoZJEoRLOxxxxxxx</p>
     */
    @NameInMap("DeviceToken")
    public String deviceToken;

    /**
     * <p>The encryption type. An empty value indicates no encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>SM2</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The local video file.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("FaceContrastFile")
    public String faceContrastFile;

    /**
     * <p>The Base64-encoded photo.</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <p>The OSS photo URL. Currently only authorized OSS photo URLs are supported.</p>
     * <blockquote>
     * <p>Among the four methods of passing in images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS), select only one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    /**
     * <p>The IP address of the user.</p>
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
     * <p>The liveness detection type.</p>
     * 
     * <strong>example:</strong>
     * <p>FRONT_CAMERA_LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The bucket name of the authorized OSS space.</p>
     * <blockquote>
     * <p>Among the four methods of passing in images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS), select only one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The file name in the authorized OSS space.</p>
     * <blockquote>
     * <p>Among the four methods of passing in images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS), select only one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <p>The unique identifier of the merchant request.
     * The value is a 32-character alphanumeric string. The first few characters are a custom abbreviation defined by the merchant, the middle part can be a time segment, and the last part can be a random or incremental sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>Fixed value: ID_MIN.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The verification scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The custom user ID defined by the business.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ContrastFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyRequest self = new ContrastFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public ContrastFaceVerifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ContrastFaceVerifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ContrastFaceVerifyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ContrastFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public ContrastFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public ContrastFaceVerifyRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public ContrastFaceVerifyRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public ContrastFaceVerifyRequest setFaceContrastFile(String faceContrastFile) {
        this.faceContrastFile = faceContrastFile;
        return this;
    }
    public String getFaceContrastFile() {
        return this.faceContrastFile;
    }

    public ContrastFaceVerifyRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public ContrastFaceVerifyRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public ContrastFaceVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ContrastFaceVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContrastFaceVerifyRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ContrastFaceVerifyRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public ContrastFaceVerifyRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public ContrastFaceVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ContrastFaceVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ContrastFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public ContrastFaceVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
