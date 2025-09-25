// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyAdvanceRequest extends TeaModel {
    /**
     * <p>Real name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>ID number</p>
     * 
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>Type of identification. Currently, only IDENTITY_CARD is supported and must be provided.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The CertifyId of a previously passed real-person authentication, with the photo taken during that authentication used as the comparison photo. </p>
     * <blockquote>
     * <p>Among the four ways to input images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to provide.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>Allow face image cropping:</p>
     * <ul>
     * <li><strong>T</strong> – Cropping is allowed.</li>
     * <li><strong>F</strong> (default) – Cropping is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>Risk Identification - Device Token</p>
     * 
     * <strong>example:</strong>
     * <p>McozS1ZWRcRZStlERcZZo_QOytx5jcgZoZJEoRLOxxxxxxx</p>
     */
    @NameInMap("DeviceToken")
    public String deviceToken;

    /**
     * <p>Encryption type. Leave it empty if no encryption is required.</p>
     * <p>If you enable encrypted transmission, you must specify the encryption algorithm; currently, only the SM2 (Chinese national standard) algorithm is supported.</p>
     * <p>When an encryption algorithm is specified, encrypt both <strong>CertName</strong> and <strong>CertNo</strong> and submit the resulting ciphertext. For more details on parameter encryption, see the <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/description-of-parameter-encryption?spm=a2c4g.11186623.0.0.49541a8554cELI#task-2229332">Parameter Encryption documentation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SM2</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>Local video file.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FaceContrastFile")
    public java.io.InputStream faceContrastFileObject;

    /**
     * <p>Base64 encoded photo</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <p>OSS photo URL, currently only supports authorized OSS photo URLs.</p>
     * <blockquote>
     * <p>Among the four ways to input images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to input.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    /**
     * <p>User IP.</p>
     * 
     * <strong>example:</strong>
     * <p>114.xxx.xxx.xxx</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>User\&quot;s phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>130xxxxxxxx</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Liveness detection type. Possible values:</p>
     * <p>• <strong>NO_LIVENESS</strong> – Liveness detection is disabled.</p>
     * <p>• <strong>FRONT_CAMERA_LIVENESS</strong> (default) – Liveness detection on face images captured with the mobile device’s front camera.</p>
     * <p>• <strong>REAR_CAMERA_LIVENESS</strong> – Liveness detection on face images captured in other scenarios (e.g., via the rear camera).</p>
     * 
     * <strong>example:</strong>
     * <p>FRONT_CAMERA_LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Authorized OSS space Bucket name. In the methods of passing images, including FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS, choose one to pass in.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>Filename of the authorized OSS space.</p>
     * <blockquote>
     * <p>Among the four ways to input images (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to input.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <p>A unique identifier for the merchant\&quot;s request. It is a 32-character alphanumeric combination. The first few characters are a custom abbreviation defined by the merchant, followed by a period, and the latter part can be a random or incrementing sequence.</p>
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
     * <p>Authentication scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Custom user ID defined by the customer\&quot;s business.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ContrastFaceVerifyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyAdvanceRequest self = new ContrastFaceVerifyAdvanceRequest();
        return TeaModel.build(map, self);
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

    public ContrastFaceVerifyAdvanceRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public ContrastFaceVerifyAdvanceRequest setFaceContrastFileObject(java.io.InputStream faceContrastFileObject) {
        this.faceContrastFileObject = faceContrastFileObject;
        return this;
    }
    public java.io.InputStream getFaceContrastFileObject() {
        return this.faceContrastFileObject;
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
